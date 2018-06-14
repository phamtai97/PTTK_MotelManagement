/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.BillDAO;
import DTO.BillDTO;
import DTO.BillInfoDTO;
import DTO.ServiceDTO;
import DTO.UseServiceDTO;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/**
 *
 * @author phantrongthuyen
 */
public class BillBUS {
    BillDAO billDAO;
    public BillBUS() {
        this.billDAO = new BillDAO();
    }
    public boolean XuatHoaDon(ArrayList<UseServiceDTO> listUseService, String fileName) {
        ArrayList<BillInfoDTO> listBillInfo = new ArrayList<BillInfoDTO>();
        listBillInfo = billDAO.LayThongTinThanhToanDichVu(listUseService.get(0).getRoomID());
        ServiceBUS serviceBUS = new ServiceBUS();
        ArrayList<ServiceDTO> listService = new ArrayList<ServiceDTO>();
        listService = serviceBUS.LayThongTinDichVu();
        
        if (listBillInfo.isEmpty() || listService.isEmpty()) {
            return false;
        }
        
        
        XWPFDocument document = new XWPFDocument();
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        paragraph.setAlignment(ParagraphAlignment.CENTER);
        run.setFontFamily("Arial");
        run.setBold(true);
        run.setFontSize(12);
        run.setText("HÓA ĐƠN THANH TOÁN");
        run.addBreak();
        
        paragraph = document.createParagraph();
        run = paragraph.createRun();
        run.setText("Phòng: " + listBillInfo.get(0).getMaPhongTro()); run.addTab();
        run.addBreak();
        
        //create table
        XWPFTable table = document.createTable();

        XWPFTableRow tableRowOne = null;
        
        for (int i = 0; i < listBillInfo.size() + 1; i++) {
            ServiceDTO item = new ServiceDTO();
            for (int j = 0; j < listService.size(); j++) {
                if (i == 0) {
                    break;
                }
                
                if (listService.get(j).getServiceID().equals(listBillInfo.get(i - 1).getMaDichVu())) {
                    item = listService.get(j);
                    break;
                }
            }
            int ChiSoMoi = 0;
            for (int h = 0; h < listUseService.size(); h++) {
                if (i == 0) {
                    break;
                }
                if (listBillInfo.get(i - 1).getMaDichVu().equals(listUseService.get(h).getServiceID())) {
                    ChiSoMoi = listUseService.get(h).getNewValue();
                }
            }
            if (i == 0) {
                tableRowOne = table.getRow(0);
                tableRowOne.getCell(0).setText("    TT  ");
                tableRowOne.addNewTableCell().setText(" Mã dịch vụ  ");
                tableRowOne.addNewTableCell().setText(" Tên dịch vụ  ");
                tableRowOne.addNewTableCell().setText(" Chỉ số cũ  ");
                tableRowOne.addNewTableCell().setText(" Chỉ số mới  ");
                tableRowOne.addNewTableCell().setText(" Đơn giá  ");
            }
            else {
                tableRowOne = table.createRow();
                tableRowOne.getCell(0).setText(Integer.toString(i));
                tableRowOne.getCell(1).setText(listBillInfo.get(i - 1).getMaDichVu());
                tableRowOne.getCell(2).setText(listBillInfo.get(i - 1).getTenDichVu());
                tableRowOne.getCell(3).setText(Integer.toString(listBillInfo.get(i - 1).getChiSoCu()));
                tableRowOne.getCell(4).setText(Integer.toString(ChiSoMoi));
                tableRowOne.getCell(5).setText(Integer.toString(item.getServicePrice()));
            }
            
        }
        
        tableRowOne = table.createRow();
        tableRowOne.getCell(0).setText(Integer.toString(listBillInfo.size() + 1));
        tableRowOne.getCell(1).setText("");
        tableRowOne.getCell(2).setText("Tiền phòng");
        tableRowOne.getCell(3).setText("");
        tableRowOne.getCell(4).setText("");
        tableRowOne.getCell(5).setText(Integer.toString(listBillInfo.get(0).getGiaPhong()));
            
        
        FileOutputStream output;
        try {
            output = new FileOutputStream(fileName);
            document.write(output);
            output.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BillBUS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BillBUS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
