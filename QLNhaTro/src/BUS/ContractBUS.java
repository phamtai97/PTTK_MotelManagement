/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ContractDAO;
import DTO.ContractDTO;
import DTO.DeviceDTO;
import DTO.GuestDTO;
import DTO.RegistrationRoomDTO;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

/**
 *
 * @author taipham
 */
public class ContractBUS {
    ContractDAO contractDAO;
    public ContractBUS() {
        this.contractDAO = new ContractDAO();
    }
    public void XuatHopDong(ContractDTO contract, String fileName) {
        // từ contract lấy được guestid, roomid => guestid lấy thông tin khách
        // room id lấy thông tin thiết bị
        ArrayList<RegistrationRoomDTO> DanhSachDangKi = new ArrayList<RegistrationRoomDTO>();
        RegistrationRoomBUS registBUS = new RegistrationRoomBUS();
        GuestBUS guestBUS = new GuestBUS();
        DeviceBUS deviceBUS = new DeviceBUS();
        DanhSachDangKi = registBUS.getAllListRegistration();
        ArrayList<DeviceDTO> listDevice = new ArrayList<DeviceDTO>();
        listDevice = deviceBUS.getAllDevice();
        
        ArrayList<GuestDTO> DanhSachKhach = new ArrayList<GuestDTO>();
        DanhSachKhach = guestBUS.getAllGuest();
        // Lấy guestID của phòng đã đăng ký
        ArrayList<String> guestID = new ArrayList<String>();
        for (RegistrationRoomDTO room : DanhSachDangKi) {
            if (room.getRoomID().equals(contract.getRoomID())) {
                guestID.add(room.getGuestID());
            }
        }
        // Lấy thông tin ứng với guestID
        ArrayList<GuestDTO> DanhSachThanhVien = new ArrayList<GuestDTO>();
        for (String id : guestID) {
            for (GuestDTO guest : DanhSachKhach) {
                if (id.equals(guest.getGuestID())) {
                    DanhSachThanhVien.add(guest);
                }
            }
        }
        
        // Lấy thiết bị trong phòng
        ArrayList<DeviceDTO> listRoomDevice = new ArrayList<DeviceDTO>();
        for (DeviceDTO device : listDevice) {
            if (contract.getRoomID().equals(device.getRoomID())) {
                listRoomDevice.add(device);
            }
        }
        
        if (DanhSachThanhVien.isEmpty()) {
            return;
        }
        
        XWPFDocument document = new XWPFDocument();
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        
        run.setText("HỢP ĐỒNG THUÊ PHÒNG");
        run.setFontSize(20);
        run.setFontFamily("Arial");
        run.setBold(true);
        paragraph.setAlignment(ParagraphAlignment.CENTER);
        
        paragraph = document.createParagraph();
        run = paragraph.createRun();
        run.setBold(true);
        run.setText("BÊN A (CHO THUÊ) ");
        
        paragraph = document.createParagraph();
        run = paragraph.createRun();
        run.setText("Đại diện:");
        run.addBreak();
        run.setText("Địa chỉ phòng trọ:");
        for (int i = 0; i < 7; i++) {run.addTab();}
        run.setText("Điện thoại: ");
        run.addBreak();
        
        paragraph = document.createParagraph();
        run = paragraph.createRun();
        run.setBold(true);
        run.setText("BÊN B (BÊN THUÊ)");
        
        paragraph = document.createParagraph();
        run = paragraph.createRun();
        String name = DanhSachThanhVien.get(0).getGuestName();
        run.setText("Đại diện: " + name);
        for (int i = 0; i < 3; i++) {run.addTab();}
        run.setText("Điện thoại: "+DanhSachThanhVien.get(0).getPhoneNumber());
        run.addBreak();
        run.setText("CMND: "+DanhSachThanhVien.get(0).getNumberID());
        for (int i = 0; i < 3; i++) {run.addTab();}
        run.setText("Nơi cấp: ");
        for (int i = 0; i < 3; i++) {run.addTab();}
        run.setText("Ngày cấp: ");
        run.addBreak();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        run.setText("Năm sinh: "+sdf.format(DanhSachThanhVien.get(0).getDob()));
        for (int i = 0; i < 3; i++) {run.addTab();}
        run.setText("Nghề nghiệp: "+DanhSachThanhVien.get(0).getJob());
        run.addBreak();
        run.setText("Địa chỉ: "+DanhSachThanhVien.get(0).getPermanentAddress());
        run.addBreak();
        run.setText("Hai bên cùng thỏa thuận và đồng ý với những nội dung sau");
        paragraph = document.createParagraph();
        run = paragraph.createRun();
        run.setBold(true);
        run.setFontSize(16);
        paragraph.setAlignment(ParagraphAlignment.CENTER);
        run.setText("NỘI DUNG HỢP ĐỒNG");
        paragraph = document.createParagraph();
        run = paragraph.createRun();
        run.setText("1. Bên A cho bên B thuê phòng: " + contract.getRoomID());
        run.addBreak();
        run.setText("Thời hạn hợp đồng: ");
        run.addTab();
        run.setText("(từ " + sdf.format(contract.getStartDateRent())); run.setText(" đến " + sdf.format(contract.getEndDateRent())); run.setText(")");
        run.addBreak();
        run.setText("2. Giá tiền thuê phòng là: " + contract.getDeposits() + " vnđ");
        run.addBreak();
        run.setText("3. Tiền đặt cọc: " + contract.getDeposits() + " vnđ");
        run.addBreak();
        run.setText("- Tiền đặt cọc sẽ được trả cho bên B khi hết hợp đồng"
                + " thuê phòng và thanh toán đầy đủ tiền điện, nước, phí dịch"
                + " vụ và các khoản khác liên quan đồng thời không làm mất,"
                + " hư hỏng, nội thất trong phòng.");
        run.addBreak();
        run.setText("- Nếu bên B chấm dứt hợp đồng trước thời hạn sẽ phải"
                + " chịu mất 100% tiền cọc.");
        
        paragraph = document.createParagraph();
        run = paragraph.createRun();
        run.setBold(true);
        run.setFontSize(12);
        paragraph.setAlignment(ParagraphAlignment.CENTER);
        run.setText("HIỆN TRẠNG PHÒNG KHI GIAO CHO BÊN B");
        run.setUnderline(UnderlinePatterns.SINGLE);
        run.addBreak();
        //create table
        XWPFTable table = document.createTable();

        XWPFTableRow tableRowOne = null;
        
        for (int i = 0; i < listRoomDevice.size() + 1; i++) {

            if (i == 0) {
                tableRowOne = table.getRow(0);
                tableRowOne.getCell(0).setText("    TT  ");
                tableRowOne.addNewTableCell().setText(" Nội thất phòng  ");
                tableRowOne.addNewTableCell().setText(" Tình trạng  ");
            }
            else {
                tableRowOne = table.createRow();
                tableRowOne.getCell(0).setText(Integer.toString(i));
                tableRowOne.getCell(1).setText(listRoomDevice.get(i - 1).getDeviceName());
                tableRowOne.getCell(2).setText(Integer.toString(listRoomDevice.get(i - 1).getStateDevice()));
            }
            
        }
        
        paragraph = document.createParagraph();
        run = paragraph.createRun();
        run.setBold(true);
        run.setFontSize(12);
        paragraph.setAlignment(ParagraphAlignment.CENTER);
        run.setText("BẢNG KÊ LƯU TRÚ");
        run.setUnderline(UnderlinePatterns.SINGLE);
        run.addBreak();
        //create table
        table = document.createTable();
        
        for (int i = 0; i < DanhSachThanhVien.size() + 1; i++) {

            if (i == 0) {
                tableRowOne = table.getRow(0);
                tableRowOne.getCell(0).setText("    TT  ");
                tableRowOne.addNewTableCell().setText(" Họ tên  ");
                tableRowOne.addNewTableCell().setText(" Điện thoại  ");
                tableRowOne.addNewTableCell().setText(" CMND    ");
                tableRowOne.addNewTableCell().setText(" Năm sinh    ");
                tableRowOne.addNewTableCell().setText(" Quê quán    ");
                tableRowOne.addNewTableCell().setText(" Ghi chú ");
            }
            else {
                tableRowOne = table.createRow();
                tableRowOne.getCell(0).setText(Integer.toString(i));
                tableRowOne.getCell(1).setText(DanhSachThanhVien.get(i - 1).getGuestName());
                tableRowOne.getCell(2).setText(DanhSachThanhVien.get(i - 1).getPhoneNumber());
                tableRowOne.getCell(3).setText(DanhSachThanhVien.get(i - 1).getNumberID());
                tableRowOne.getCell(4).setText(sdf.format(DanhSachThanhVien.get(i - 1).getDob()));
                tableRowOne.getCell(5).setText(DanhSachThanhVien.get(i - 1).getCountrySide());
                tableRowOne.getCell(6).setText("                ");
            }
            
        }
        
        paragraph = document.createParagraph();
        run = paragraph.createRun();
        run.setText("* Số người ở tối đa: ");
        
        paragraph = document.createParagraph();
        run = paragraph.createRun();
        run.setBold(true);
        run.setFontSize(12);
        paragraph.setAlignment(ParagraphAlignment.CENTER);
        run.setText("CAM KẾT");
        run.setUnderline(UnderlinePatterns.SINGLE);
        
        paragraph = document.createParagraph();
        run = paragraph.createRun();
        run.setText("1. Không để đồ, xả rác ra hàng lang cầu thang, khu công "
                + "cộng; Không tàng trữ, sử dụng ma túy, rượu bia, chất kích "
                + "thích, chất cháy nổ; Không gây gỗ đánh nhau, to tiếng, làm "
                + "mất an ninh trật dự, giữ yên lặng sau 23h.");
        run.addBreak();
        run.setText("2. Không cho người lạ ngủ qua đêm mà không báo với người "
                + "quản lý.");
        run.addBreak();
        run.setText("3. Sắp xếp xe gọn gàng theo yêu cầu của quản lý.");
        run.addBreak();
        run.setText("4. Tiền thuê phòng bên B sẽ thanh toán cho bên A vào ngày"
                + " 01 Tây hàng tháng. Nếu bên b không thanh toán đúng hạn bên"
                + " A được quyền cắt hợp đồng và không hoàn tiền cọc.");
        run.addBreak();
        run.setText("5. Ra vào bắt buộc phải trình thẻ ra vào. Nếu mất thể báo "
                + "ngay cho quản lý. Phí làm thẻ lần 2 là 20.000 đổng/thẻ.");
        run.addBreak();
        run.setText("Nếu vi phạm cam kết trên, ngay lập tức bên B sẽ bị cắt "
                + "hợp đồng, yêu cầu ra khỏi nhà, không hoàn tiền cọc.");
        run.addBreak();
        run.setText("Bên B: ");
        run.addBreak();
        for (int i = 0; i < 6; i++) { run.addTab(); }
        run.setText("TP. HCM, ngày ");
        run.setText("tháng ");
        run.setText("năm ");
        run.addBreak();
        paragraph = document.createParagraph();
        run = paragraph.createRun();
        run.setBold(true);
        run.setFontSize(11);
        run.setText("Bên A (Cho thuê)");
        for (int i = 0; i < 6; i++) { run.addTab(); }
        run.setText("Bên B (Bên thuê)");
        try {
            FileOutputStream output = new FileOutputStream(fileName);
            document.write(output);
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ContractBUS.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ContractBUS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
