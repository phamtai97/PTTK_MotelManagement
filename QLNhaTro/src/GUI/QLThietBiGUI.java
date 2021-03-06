/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.DeviceBUS;
import DTO.DeviceDTO;
import DTO.RoomDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author taipham
 */
public class QLThietBiGUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form QLThietBi
     */
    private DeviceDTO _deviceDTO;
    private DeviceBUS _deviceBUS;
    private static ArrayList<DeviceDTO> _listDevice;
    private DefaultTableModel _tableModel;

    public QLThietBiGUI() {
        initComponents();
        this.setName("Thiết bị");
        tbDevice.setFillsViewportHeight(true);

        _deviceDTO = new DeviceDTO();
        _deviceBUS = new DeviceBUS();
        _listDevice = new ArrayList<>();
        _listDevice = _deviceBUS.getAllDevice();
        _tableModel = (DefaultTableModel) tbDevice.getModel();
        showTableDevice(_listDevice);
        showRoomID(QLPhongTroGUI.getListRoom());
        btnSaveDevice.setEnabled(false);
        btnCancelDevice.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnInsertDevice = new javax.swing.JButton();
        btnDeleteDevice = new javax.swing.JButton();
        btnEditDevice = new javax.swing.JButton();
        btnSaveDevice = new javax.swing.JButton();
        btnCancelDevice = new javax.swing.JButton();
        btnResetKhachThue1 = new javax.swing.JButton();
        btnThoat1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        scp = new javax.swing.JScrollPane();
        tbDevice = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfDeviceID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbStateDevice = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbDeviceName = new javax.swing.JComboBox<>();
        cbRoomID = new javax.swing.JComboBox<>();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("QUẢN LÍ THIẾT BỊ");

        jPanel5.setBackground(new java.awt.Color(138, 213, 55));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        btnInsertDevice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_themphong.png"))); // NOI18N
        btnInsertDevice.setText("Thêm");
        btnInsertDevice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInsertDevice.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInsertDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertDeviceActionPerformed(evt);
            }
        });

        btnDeleteDevice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_xoa.png"))); // NOI18N
        btnDeleteDevice.setText("Xóa");
        btnDeleteDevice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeleteDevice.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeleteDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDeviceActionPerformed(evt);
            }
        });

        btnEditDevice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_sua.png"))); // NOI18N
        btnEditDevice.setText("Sửa");
        btnEditDevice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditDevice.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDeviceActionPerformed(evt);
            }
        });

        btnSaveDevice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_save.png"))); // NOI18N
        btnSaveDevice.setText("Lưu");
        btnSaveDevice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSaveDevice.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSaveDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDeviceActionPerformed(evt);
            }
        });

        btnCancelDevice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_huy.png"))); // NOI18N
        btnCancelDevice.setText("Hủy");
        btnCancelDevice.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelDevice.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelDevice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelDeviceActionPerformed(evt);
            }
        });

        btnResetKhachThue1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_reset.png"))); // NOI18N
        btnResetKhachThue1.setText("Reset");
        btnResetKhachThue1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResetKhachThue1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnResetKhachThue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetKhachThue1ActionPerformed(evt);
            }
        });

        btnThoat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon_thoat.png"))); // NOI18N
        btnThoat1.setText("Thoát");
        btnThoat1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThoat1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInsertDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSaveDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnResetKhachThue1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThoat1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInsertDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetKhachThue1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(138, 213, 55));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách thiết bị", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        jPanel2.setLayout(new java.awt.BorderLayout());

        tbDevice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã thiết bị", "Mã phòng trọ", "Tên thiết bị", "Tình trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDevice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDeviceMouseClicked(evt);
            }
        });
        scp.setViewportView(tbDevice);
        if (tbDevice.getColumnModel().getColumnCount() > 0) {
            tbDevice.getColumnModel().getColumn(0).setPreferredWidth(40);
            tbDevice.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        jPanel2.add(scp, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(138, 213, 55));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin thiết bị", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel1.setText("Mã phòng trọ :");

        jLabel4.setText("Mã thiết bị:");

        jLabel7.setText("Tên thiết bị:");

        cbStateDevice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bình thường", "Cần sửa chữa", "Hỏng" }));

        jLabel6.setText("Tình trạng:");

        cbDeviceName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Máy quạt", "Máy lạnh", "Bàn, ghế", "Tủ đồ", "Đèn điện", "Bếp ga", " " }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tfDeviceID, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDeviceName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbStateDevice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(cbDeviceName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(tfDeviceID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(cbRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbStateDevice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(266, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                        .addGap(549, 549, 549))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String getStatusDevice(int i) {
        String status = "";
        if (i == 0) {
            status = "Bình thường";
        } else if (i == 1) {
            status = "Cần sửa chữa";
        } else if (i == 2) {
            status = "Hỏng";
        }
        return status;
    }

    //show table
    public void showTableDevice(ArrayList<DeviceDTO> listDevice) {
        int i = 1;
        for (DeviceDTO device : listDevice) {
            _tableModel.addRow(new Object[]{
                i++, device.getDeviceID(), device.getRoomID(), device.getDeviceName(), getStatusDevice(device.getStateDevice())
            });
        }
    }

    //show table updata
    public void showTableDeviceUpdate() {
        int i = tbDevice.getRowCount() + 1;
        _deviceDTO = _listDevice.get(_listDevice.size() - 1);
        _tableModel.addRow(new Object[]{
            i, _deviceDTO.getDeviceID(), _deviceDTO.getRoomID(), _deviceDTO.getDeviceName(), getStatusDevice(_deviceDTO.getStateDevice())
        });
    }

    int convertStatusToInt(String status) {
        int i = -1;
        if (status.equals("Bình thường")) {
            i = 0;
        } else if (status.equals("Cần sửa chữa")) {
            i = 1;
        } else if (status.equals("Hỏng")) {
            i = 2;
        }
        return i;
    }

    private void btnInsertDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertDeviceActionPerformed
        //kiem tra thong tin nhap vao
        //Chưa làm 
        _deviceDTO.setRoomID(cbRoomID.getSelectedItem().toString());
        _deviceDTO.setDeviceID(tfDeviceID.getText());
        _deviceDTO.setDeviceName(cbDeviceName.getSelectedItem().toString());
        _deviceDTO.setStateDevice(convertStatusToInt(cbStateDevice.getSelectedItem().toString()));

        if (_deviceBUS.insertDevice(_deviceDTO)) {
            JOptionPane.showMessageDialog(this, "Thêm vào database thành công", "Thêm thiết bị", JOptionPane.INFORMATION_MESSAGE);
            _listDevice.add(_deviceDTO);
            showTableDeviceUpdate();
        } else {
            JOptionPane.showMessageDialog(this, "Thêm vào database thất bại", "Thêm thiết bị", JOptionPane.ERROR_MESSAGE);
        }
        reset();
    }//GEN-LAST:event_btnInsertDeviceActionPerformed

    public int getIndexListDevice(String deviceID) {
        int len = _listDevice.size();
        for (int i = 0; i < len; ++i) {
            if (_listDevice.get(i).getDeviceID().equals(deviceID)) {
                return i;
            }
        }
        return -1;
    }

    //su kiem bam nut xoa
    private void btnDeleteDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDeviceActionPerformed
        int[] vt = tbDevice.getSelectedRows();
        int index = -1;
        String deviceID = "";
        if (vt.length > 0) {
            for (int i = vt.length - 1; i >= 0; --i) {
                deviceID = tbDevice.getValueAt(vt[i], 1).toString();
                index = getIndexListDevice(deviceID);
                if (!_deviceBUS.deleteDevice(deviceID)) {
                    JOptionPane.showMessageDialog(this, "Xóa dữ liệu trong database thất bại", "Xóa thiết bị", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                _listDevice.remove(index);
            }
            JOptionPane.showMessageDialog(this, "Xóa dữ liệu trong database thành công", "Xóa thiết bị", JOptionPane.INFORMATION_MESSAGE);
            _tableModel.setRowCount(0);
            showTableDevice(_listDevice);
        } else {
            JOptionPane.showMessageDialog(this, "Hãy chọn thiết bị muốn xóa", "Xóa thiết bị", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteDeviceActionPerformed

    //su kien bam nut luu
    private void btnSaveDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDeviceActionPerformed
        int vt = tbDevice.getSelectedRow();
        if (vt != -1) {
            _deviceDTO = _listDevice.get(getIndexListDevice(tbDevice.getValueAt(vt, 1).toString()));
            _deviceDTO.setDeviceName(cbDeviceName.getSelectedItem().toString());
            _deviceDTO.setStateDevice(convertStatusToInt(cbStateDevice.getSelectedItem().toString()));

            if (_deviceBUS.updateDevice(_deviceDTO)) {
                JOptionPane.showMessageDialog(this, "Update vào database thành công", "Update thiết bị", JOptionPane.INFORMATION_MESSAGE);
                tbDevice.setValueAt(_deviceDTO.getDeviceName(), vt, 3);
                tbDevice.setValueAt(getStatusDevice(_deviceDTO.getStateDevice()), vt, 4);
            } else {
                JOptionPane.showMessageDialog(this, "Update vào database thất bại", "Update thiết bị", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        reset();
    }//GEN-LAST:event_btnSaveDeviceActionPerformed

    //su kiem bam nut sua
    private void btnEditDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDeviceActionPerformed
        setEnable(true);
        btnSaveDevice.setEnabled(true);
        btnCancelDevice.setEnabled(true);
        btnDeleteDevice.setEnabled(false);
        tfDeviceID.setEnabled(false);
    }//GEN-LAST:event_btnEditDeviceActionPerformed

    //su kien bam nut huy
    private void btnCancelDeviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelDeviceActionPerformed
        reset();
    }//GEN-LAST:event_btnCancelDeviceActionPerformed

    void setEnable(boolean bool) {
        tfDeviceID.setEnabled(bool);
        cbRoomID.setEnabled(bool);
        cbDeviceName.setEnabled(bool);
        cbStateDevice.setEnabled(bool);
    }

    public void reset() {
        setEnable(true);
        btnInsertDevice.setEnabled(true);
        btnSaveDevice.setEnabled(false);
        btnCancelDevice.setEnabled(false);
        btnDeleteDevice.setEnabled(true);
        tfDeviceID.setText("");
        cbDeviceName.setSelectedIndex(0);
        cbStateDevice.setSelectedIndex(0);
        tbDevice.clearSelection();
    }

    //su kiem bam nut resert
    private void btnResetKhachThue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetKhachThue1ActionPerformed
        reset();
    }//GEN-LAST:event_btnResetKhachThue1ActionPerformed

    //su kien bam mot dong trong bang
    private void tbDeviceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDeviceMouseClicked
        int vt = tbDevice.getSelectedRow();
        if (vt != -1) {
            tfDeviceID.setText(tbDevice.getValueAt(vt, 1).toString());
            cbRoomID.getModel().setSelectedItem(tbDevice.getValueAt(vt, 2).toString());
            cbDeviceName.getModel().setSelectedItem(tbDevice.getValueAt(vt, 3));
            cbStateDevice.getModel().setSelectedItem(tbDevice.getValueAt(vt, 4));
        }
        btnInsertDevice.setEnabled(false);
        setEnable(false);
    }//GEN-LAST:event_tbDeviceMouseClicked

    public static ArrayList<DeviceDTO> getDevice(String roomID) {
        ArrayList<DeviceDTO> result = new ArrayList<>();
        for (DeviceDTO device : _listDevice) {
            if (device.getRoomID().equals(roomID)) {
                result.add(device);
            }
        }
        return result;
    }

    public static void showRoomID(ArrayList<RoomDTO> listRoom) {
        cbRoomID.removeAllItems();
        for (RoomDTO room : listRoom) {
            cbRoomID.addItem(room.getRoomID());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelDevice;
    private javax.swing.JButton btnDeleteDevice;
    private javax.swing.JButton btnEditDevice;
    private javax.swing.JButton btnInsertDevice;
    private javax.swing.JButton btnResetKhachThue1;
    private javax.swing.JButton btnSaveDevice;
    private javax.swing.JButton btnThoat1;
    private javax.swing.JComboBox<String> cbDeviceName;
    private static javax.swing.JComboBox<String> cbRoomID;
    private javax.swing.JComboBox<String> cbStateDevice;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane scp;
    private javax.swing.JTable tbDevice;
    private javax.swing.JTextField tfDeviceID;
    // End of variables declaration//GEN-END:variables
}
