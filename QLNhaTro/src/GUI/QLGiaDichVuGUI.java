/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.RoomTypeBUS;
import DTO.RoomTypeDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author taipham
 */
public class QLGiaDichVuGUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form QLGiaDichVuGUI
     */
    private RoomTypeBUS _roomTypeBUS;
    private RoomTypeDTO _roomTypeDTO;
    private static ArrayList<RoomTypeDTO> _listRoomType;
    private DefaultTableModel _tableModel;

    public QLGiaDichVuGUI() {
        initComponents();
        this.setName("Giá dịch vụ");
        tbRoomType.setFillsViewportHeight(true);
        _roomTypeBUS = new RoomTypeBUS();
        _roomTypeDTO = new RoomTypeDTO();
        _tableModel = (DefaultTableModel) tbRoomType.getModel();
        _listRoomType = _roomTypeBUS.getListRoomType();
        showTableRoomType(_listRoomType);
        btnSaveRoomType.setEnabled(false);
        btnCancleRoomType.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbRoomType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbMaxNumber = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tfRoomPrice = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRoomType = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btnAddRoomType = new javax.swing.JButton();
        btnDeleteRoomType = new javax.swing.JButton();
        btnEditRoomType = new javax.swing.JButton();
        btnSaveRoomType = new javax.swing.JButton();
        btnCancleRoomType = new javax.swing.JButton();
        btnResetRoomType = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tfRoomTypeID = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnSuaKhachThue1 = new javax.swing.JButton();
        btnLuuKhachThue1 = new javax.swing.JButton();
        btnHuyKhachThue1 = new javax.swing.JButton();
        btnResetKhachThue1 = new javax.swing.JButton();
        btnThoat1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfGiaDien = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("QUẢN LÍ GIÁ DỊCH VỤ");

        jPanel2.setBackground(new java.awt.Color(138, 213, 55));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giá phòng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel2.setText("Loại phòng: ");

        cbRoomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thường", "Vip" }));

        jLabel3.setText("Số người ở: ");

        cbMaxNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", " " }));

        jLabel4.setText("Giá phòng: ");

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách giá phòng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        tbRoomType.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã loại phòng", "Loại phòng", "Số người ", "Giá phòng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbRoomType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRoomTypeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbRoomType);
        if (tbRoomType.getColumnModel().getColumnCount() > 0) {
            tbRoomType.getColumnModel().getColumn(0).setPreferredWidth(40);
            tbRoomType.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(254, 254, 254));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        btnAddRoomType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_themphong.png"))); // NOI18N
        btnAddRoomType.setText("Thêm");
        btnAddRoomType.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddRoomType.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddRoomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRoomTypeActionPerformed(evt);
            }
        });

        btnDeleteRoomType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_xoa.png"))); // NOI18N
        btnDeleteRoomType.setText("Xóa");
        btnDeleteRoomType.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeleteRoomType.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeleteRoomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteRoomTypeActionPerformed(evt);
            }
        });

        btnEditRoomType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_sua.png"))); // NOI18N
        btnEditRoomType.setText("Sửa");
        btnEditRoomType.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditRoomType.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditRoomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditRoomTypeActionPerformed(evt);
            }
        });

        btnSaveRoomType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_save.png"))); // NOI18N
        btnSaveRoomType.setText("Lưu");
        btnSaveRoomType.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSaveRoomType.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSaveRoomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveRoomTypeActionPerformed(evt);
            }
        });

        btnCancleRoomType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_huy.png"))); // NOI18N
        btnCancleRoomType.setText("Hủy");
        btnCancleRoomType.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancleRoomType.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancleRoomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancleRoomTypeActionPerformed(evt);
            }
        });

        btnResetRoomType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_reset.png"))); // NOI18N
        btnResetRoomType.setText("Reset");
        btnResetRoomType.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResetRoomType.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnResetRoomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetRoomTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeleteRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSaveRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancleRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnResetRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancleRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setText("Mã loại phòng:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfRoomTypeID, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfRoomPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMaxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfRoomTypeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbMaxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfRoomPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(138, 213, 55));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dịch vụ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(254, 254, 254));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        btnSuaKhachThue1.setBackground(new java.awt.Color(254, 254, 254));
        btnSuaKhachThue1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_sua.png"))); // NOI18N
        btnSuaKhachThue1.setText("Sửa");
        btnSuaKhachThue1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuaKhachThue1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnLuuKhachThue1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_save.png"))); // NOI18N
        btnLuuKhachThue1.setText("Lưu");
        btnLuuKhachThue1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLuuKhachThue1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnHuyKhachThue1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_huy.png"))); // NOI18N
        btnHuyKhachThue1.setText("Hủy");
        btnHuyKhachThue1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuyKhachThue1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnResetKhachThue1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_reset.png"))); // NOI18N
        btnResetKhachThue1.setText("Reset");
        btnResetKhachThue1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResetKhachThue1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnThoat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_thoat.png"))); // NOI18N
        btnThoat1.setText("Thoát");
        btnThoat1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThoat1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(btnSuaKhachThue1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLuuKhachThue1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnHuyKhachThue1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnResetKhachThue1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThoat1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSuaKhachThue1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLuuKhachThue1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuyKhachThue1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetKhachThue1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Giá điện: ");

        tfGiaDien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGiaDienActionPerformed(evt);
            }
        });

        jLabel6.setText("Giá nước:");

        jLabel7.setText("Internet: ");

        jLabel8.setText("Công cộng:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfGiaDien, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jTextField3))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfGiaDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(533, 533, 533))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //show table
    public void showTableRoomType(ArrayList<RoomTypeDTO> listRoomTypeDTO) {
        int i = 1;
        for (RoomTypeDTO roomType : listRoomTypeDTO) {
            _tableModel.addRow(new Object[]{
                i++, roomType.getRoomTypeID(), roomType.getRoomType(), roomType.getMaxNumberGuest(), roomType.getRoomPrice()
            });
        }
    }

    public void showTableRoomTypeUpdate() {
        int i = tbRoomType.getRowCount() + 1;
        _roomTypeDTO = _listRoomType.get(_listRoomType.size() - 1);
        _tableModel.addRow(new Object[]{
            i, _roomTypeDTO.getRoomTypeID(), _roomTypeDTO.getRoomType(), _roomTypeDTO.getMaxNumberGuest(), _roomTypeDTO.getRoomPrice()
        });
    }

    private void tfGiaDienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGiaDienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGiaDienActionPerformed

    //su kien bam vao nut them
    private void btnAddRoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRoomTypeActionPerformed
        //kiem tra thong tin nhap vao
        //chưa làm
        _roomTypeDTO.setRoomTypeID(tfRoomTypeID.getText());
        _roomTypeDTO.setRoomType(cbRoomType.getSelectedItem().toString());
        _roomTypeDTO.setMaxNumberGuest(Integer.parseInt(cbMaxNumber.getSelectedItem().toString()));
        _roomTypeDTO.setRoomPrice(Integer.parseInt(tfRoomPrice.getText()));

        if (_roomTypeBUS.insertRoomType(_roomTypeDTO)) {
            JOptionPane.showMessageDialog(this, "Thêm vào database thành công", "Thêm loại phòng", JOptionPane.INFORMATION_MESSAGE);
            _listRoomType.add(_roomTypeDTO);
            showTableRoomTypeUpdate();
        } else {
            JOptionPane.showMessageDialog(this, "Thêm vào database thất bại", "Thêm loại phòng", JOptionPane.ERROR_MESSAGE);
        }
        reset();
    }//GEN-LAST:event_btnAddRoomTypeActionPerformed

    public int getIndexListRoomType(String guestId) {
        int len = _listRoomType.size();
        for (int i = 0; i < len; ++i) {
            if (_listRoomType.get(i).getRoomTypeID().equals(guestId)) {
                return i;
            }
        }
        return -1;
    }

    private void btnDeleteRoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRoomTypeActionPerformed
        int[] vt = tbRoomType.getSelectedRows();
        String roomTypeID = "";
        int index = -1;
        if (vt.length > 0) {
            for (int i = vt.length - 1; i >= 0; --i) {
                roomTypeID = tbRoomType.getValueAt(vt[i], 1).toString();
                index = getIndexListRoomType(roomTypeID);
                if (!_roomTypeBUS.deleteRoomType(roomTypeID)) {
                    JOptionPane.showMessageDialog(this, "Xóa dữ liệu trong database thất bại", "Xóa loại phòng", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                _listRoomType.remove(index);
            }
            JOptionPane.showMessageDialog(this, "Xóa dữ liệu trong database thành công", "Xóa loại phòng", JOptionPane.INFORMATION_MESSAGE);
            _tableModel.setRowCount(0);
            showTableRoomType(_listRoomType);
        } else {
            JOptionPane.showMessageDialog(this, "Hãy chọn loại phòng muốn xóa", "Xóa loại phòng", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteRoomTypeActionPerformed

    private void btnEditRoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditRoomTypeActionPerformed
        setEnable(true);
        tfRoomTypeID.setEnabled(false);
        btnSaveRoomType.setEnabled(true);
        btnCancleRoomType.setEnabled(true);
        btnDeleteRoomType.setEnabled(false);
    }//GEN-LAST:event_btnEditRoomTypeActionPerformed

    //su kien nhap nut luu
    private void btnSaveRoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveRoomTypeActionPerformed
        int vt = tbRoomType.getSelectedRow();
        if (vt != -1) {
            _roomTypeDTO = _listRoomType.get(getIndexListRoomType(tbRoomType.getValueAt(vt, 1).toString()));
            _roomTypeDTO.setRoomType(cbRoomType.getSelectedItem().toString());
            _roomTypeDTO.setMaxNumberGuest(Integer.parseInt(cbMaxNumber.getSelectedItem().toString()));
            _roomTypeDTO.setRoomPrice(Integer.parseInt(tfRoomPrice.getText()));

            if (_roomTypeBUS.updateRoomType(_roomTypeDTO)) {
                JOptionPane.showMessageDialog(this, "Update vào database thành công", "Update loại phòng", JOptionPane.INFORMATION_MESSAGE);
                //set lai gia tri moi
                tbRoomType.setValueAt(_roomTypeDTO.getRoomType(), vt, 2);
                tbRoomType.setValueAt(_roomTypeDTO.getMaxNumberGuest(), vt, 3);
                tbRoomType.setValueAt(_roomTypeDTO.getRoomPrice(), vt, 4);
            } else {
                JOptionPane.showMessageDialog(this, "Update vào database thất bại", "Update loại phòng", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        reset();
    }//GEN-LAST:event_btnSaveRoomTypeActionPerformed

    public void reset() {
        setEnable(true);
        btnAddRoomType.setEnabled(true);
        btnSaveRoomType.setEnabled(false);
        btnCancleRoomType.setEnabled(false);
        btnDeleteRoomType.setEnabled(true);
        tfRoomTypeID.setText("");
        cbRoomType.setSelectedIndex(0);
        cbMaxNumber.setSelectedIndex(0);
        tfRoomPrice.setText("");
        tbRoomType.clearSelection();
    }

    //su kien bam nut reset
    private void btnResetRoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetRoomTypeActionPerformed
        reset();
    }//GEN-LAST:event_btnResetRoomTypeActionPerformed

    //setEnable
    public void setEnable(boolean bool) {
        tfRoomTypeID.setEnabled(bool);
        cbRoomType.setEnabled(bool);
        cbMaxNumber.setEnabled(bool);
        tfRoomPrice.setEnabled(bool);
    }

    //su kien bam click vao dong
    private void tbRoomTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRoomTypeMouseClicked
        int vt = tbRoomType.getSelectedRow();
        if (vt != -1) {
            tfRoomTypeID.setText(tbRoomType.getValueAt(vt, 1).toString());
            cbRoomType.getModel().setSelectedItem(tbRoomType.getValueAt(vt, 2));
            cbMaxNumber.getModel().setSelectedItem(tbRoomType.getValueAt(vt, 3));
            tfRoomPrice.setText(tbRoomType.getValueAt(vt, 4).toString());
        }
        btnAddRoomType.setEnabled(false);
        setEnable(false);
    }//GEN-LAST:event_tbRoomTypeMouseClicked

    private void btnCancleRoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleRoomTypeActionPerformed
        reset();
    }//GEN-LAST:event_btnCancleRoomTypeActionPerformed

    public static RoomTypeDTO getRoomType(String roomTypeID){
        for(RoomTypeDTO room : _listRoomType){
            if(room.getRoomTypeID().equals(roomTypeID)){
                return room;
            }
        }
        return null;
    }
    
    public static String[] getRoomTypeID(String roomType){
        String[] result = new String[_listRoomType.size() + 1];
        int i = 0;
        for(RoomTypeDTO room : _listRoomType){
            if(room.getRoomType().equals(roomType)){
                result[i++] = room.getRoomTypeID();
            }
        }
        return result;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRoomType;
    private javax.swing.JButton btnCancleRoomType;
    private javax.swing.JButton btnDeleteRoomType;
    private javax.swing.JButton btnEditRoomType;
    private javax.swing.JButton btnHuyKhachThue1;
    private javax.swing.JButton btnLuuKhachThue1;
    private javax.swing.JButton btnResetKhachThue1;
    private javax.swing.JButton btnResetRoomType;
    private javax.swing.JButton btnSaveRoomType;
    private javax.swing.JButton btnSuaKhachThue1;
    private javax.swing.JButton btnThoat1;
    private javax.swing.JComboBox<String> cbMaxNumber;
    private javax.swing.JComboBox<String> cbRoomType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tbRoomType;
    private javax.swing.JTextField tfGiaDien;
    private javax.swing.JTextField tfRoomPrice;
    private javax.swing.JTextField tfRoomTypeID;
    // End of variables declaration//GEN-END:variables
}
