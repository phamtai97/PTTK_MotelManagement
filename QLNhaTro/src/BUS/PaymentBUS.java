/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DTO.PaymentDTO;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
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
public class PaymentBUS {
    public boolean XuatPhieuChi(ArrayList<PaymentDTO> listPayment, String fileName) {
        XWPFDocument document = new XWPFDocument();
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        paragraph.setAlignment(ParagraphAlignment.CENTER);
        run.setFontFamily("Arial");
        run.setBold(true);
        run.setFontSize(12);
        run.setText("PHIẾU CHI");
        run.addBreak();
        
        if (listPayment.isEmpty()) {
            return false;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //create table
        XWPFTable table = document.createTable();
        XWPFTableRow tableRowOne = null;
        
        for (int i = 0; i < listPayment.size() + 1; i++) {

            if (i == 0) {
                tableRowOne = table.getRow(0);
                tableRowOne.getCell(0).setText("    TT  ");
                tableRowOne.addNewTableCell().setText(" Mã phiếu chi  ");
                tableRowOne.addNewTableCell().setText(" Ngày chi  ");
                tableRowOne.addNewTableCell().setText("  Khoản chi ");
                tableRowOne.addNewTableCell().setText(" Tiền chi  ");
                tableRowOne.addNewTableCell().setText(" Ghi chú  ");
            }
            else {
                tableRowOne = table.createRow();
                tableRowOne.getCell(0).setText(Integer.toString(i));
                tableRowOne.getCell(1).setText(listPayment.get(i - 1).getPaymentBillID());
                tableRowOne.getCell(2).setText(sdf.format(listPayment.get(i - 1).getDatePayment()));
                tableRowOne.getCell(3).setText(listPayment.get(i - 1).getContentPayment());
                tableRowOne.getCell(4).setText(Integer.toString(listPayment.get(i - 1).getMoneyPayment()));
                tableRowOne.getCell(5).setText(listPayment.get(i - 1).getNote());
            }
            
        }
        
        FileOutputStream output;
        try {
            output = new FileOutputStream(fileName);
            document.write(output);
            output.close();
            return true;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PaymentBUS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PaymentBUS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
