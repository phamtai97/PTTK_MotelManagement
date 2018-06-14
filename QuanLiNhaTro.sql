/*
 Navicat Premium Data Transfer

 Source Server         : LocalConnection
 Source Server Type    : MySQL
 Source Server Version : 80011
 Source Host           : localhost:3306
 Source Schema         : QuanLiNhaTro

 Target Server Type    : MySQL
 Target Server Version : 80011
 File Encoding         : 65001

 Date: 14/06/2018 19:04:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ChiTieu
-- ----------------------------
DROP TABLE IF EXISTS `ChiTieu`;
CREATE TABLE `ChiTieu` (
  `MaPhieuChi` varchar(10) NOT NULL,
  `NgayChi` date DEFAULT NULL,
  `KhoanChi` varchar(100) DEFAULT NULL,
  `TienChi` int(11) DEFAULT NULL,
  `GhiChu` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`MaPhieuChi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for DangKiPhong
-- ----------------------------
DROP TABLE IF EXISTS `DangKiPhong`;
CREATE TABLE `DangKiPhong` (
  `MaPhongTro` varchar(10) NOT NULL,
  `MaKhachTro` varchar(10) NOT NULL,
  `NgayDangKiThue` date DEFAULT NULL,
  PRIMARY KEY (`MaPhongTro`,`MaKhachTro`),
  KEY `FK_DKPhong_KhachTro` (`MaKhachTro`),
  CONSTRAINT `FK_DKPhong_KhachTro` FOREIGN KEY (`MaKhachTro`) REFERENCES `khachtro` (`makhachtro`),
  CONSTRAINT `FK_DKPhong_PhongTro` FOREIGN KEY (`MaPhongTro`) REFERENCES `phongtro` (`maphongtro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of DangKiPhong
-- ----------------------------
BEGIN;
INSERT INTO `DangKiPhong` VALUES ('PT001', 'KT001', '2018-06-05');
COMMIT;

-- ----------------------------
-- Table structure for DichVu
-- ----------------------------
DROP TABLE IF EXISTS `DichVu`;
CREATE TABLE `DichVu` (
  `MaDichVu` varchar(10) NOT NULL,
  `TenDichVu` varchar(20) DEFAULT NULL,
  `GiaDichVu` int(11) DEFAULT NULL,
  PRIMARY KEY (`MaDichVu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of DichVu
-- ----------------------------
BEGIN;
INSERT INTO `DichVu` VALUES ('DIEN', 'Điện', 2000);
INSERT INTO `DichVu` VALUES ('INTERNET', 'Mạng', 150000);
INSERT INTO `DichVu` VALUES ('NUOC', 'Nước', 12000);
COMMIT;

-- ----------------------------
-- Table structure for HoaDon
-- ----------------------------
DROP TABLE IF EXISTS `HoaDon`;
CREATE TABLE `HoaDon` (
  `MaHoaDon` varchar(10) NOT NULL,
  `MaPhongTro` varchar(10) NOT NULL,
  `NgayLap` date DEFAULT NULL,
  `TongTien` int(11) DEFAULT NULL,
  PRIMARY KEY (`MaHoaDon`),
  KEY `FK_HoaDon_PhongTro` (`MaPhongTro`),
  CONSTRAINT `FK_HoaDon_PhongTro` FOREIGN KEY (`MaPhongTro`) REFERENCES `phongtro` (`maphongtro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for HopDong
-- ----------------------------
DROP TABLE IF EXISTS `HopDong`;
CREATE TABLE `HopDong` (
  `MaHopDong` varchar(10) NOT NULL,
  `NgayThue` date NOT NULL,
  `MaKhachTro` varchar(10) DEFAULT NULL,
  `MaPhongTro` varchar(10) DEFAULT NULL,
  `NgayKetThu` date DEFAULT NULL,
  `TienDatCoc` int(11) DEFAULT NULL,
  `TinhTrang` int(11) DEFAULT '0',
  PRIMARY KEY (`MaHopDong`,`NgayThue`),
  KEY `FK_HopDong_KhachTro` (`MaKhachTro`),
  KEY `FK_HopDong_PhongTro` (`MaPhongTro`),
  CONSTRAINT `FK_HopDong_KhachTro` FOREIGN KEY (`MaKhachTro`) REFERENCES `khachtro` (`makhachtro`),
  CONSTRAINT `FK_HopDong_PhongTro` FOREIGN KEY (`MaPhongTro`) REFERENCES `phongtro` (`maphongtro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for KhachTro
-- ----------------------------
DROP TABLE IF EXISTS `KhachTro`;
CREATE TABLE `KhachTro` (
  `MaKhachTro` varchar(10) NOT NULL,
  `TenKhachTro` varchar(50) DEFAULT NULL,
  `Phai` varchar(3) DEFAULT NULL,
  `NgaySinh` date DEFAULT NULL,
  `QueQuan` varchar(50) DEFAULT NULL,
  `CMND` char(12) DEFAULT NULL,
  `DiaChiThuongTru` varchar(100) DEFAULT NULL,
  `NgheNghiep` varchar(50) DEFAULT NULL,
  `DienThoai` varchar(11) DEFAULT NULL,
  `TinhTrang` int(11) DEFAULT '0',
  PRIMARY KEY (`MaKhachTro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of KhachTro
-- ----------------------------
BEGIN;
INSERT INTO `KhachTro` VALUES ('KT001', 'Phạm Văn Hậu', 'Nam', '1989-06-05', 'TP Hà Nội', '234567890', 'Hà Đông', 'Sinh Viên ', '0989786543', 1);
COMMIT;

-- ----------------------------
-- Table structure for LoaiPhong
-- ----------------------------
DROP TABLE IF EXISTS `LoaiPhong`;
CREATE TABLE `LoaiPhong` (
  `MaLoaiPhong` varchar(10) NOT NULL,
  `LoaiPhong` varchar(10) DEFAULT NULL,
  `SoLuongToiDa` int(11) DEFAULT NULL,
  `GiaPhong` int(11) DEFAULT NULL,
  PRIMARY KEY (`MaLoaiPhong`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of LoaiPhong
-- ----------------------------
BEGIN;
INSERT INTO `LoaiPhong` VALUES ('T001', 'Thường', 6, 2400000);
INSERT INTO `LoaiPhong` VALUES ('T002', 'Thường', 5, 2000000);
INSERT INTO `LoaiPhong` VALUES ('V001', 'Vip', 6, 4800000);
INSERT INTO `LoaiPhong` VALUES ('V002', 'Vip', 5, 4000000);
COMMIT;

-- ----------------------------
-- Table structure for PhongTro
-- ----------------------------
DROP TABLE IF EXISTS `PhongTro`;
CREATE TABLE `PhongTro` (
  `MaPhongTro` varchar(10) NOT NULL,
  `TinhTrangPhong` int(11) DEFAULT '0',
  `SoNguoi` int(11) DEFAULT NULL,
  `MaLoaiPhong` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`MaPhongTro`),
  KEY `FK_PhongTro_LoaiPhong` (`MaLoaiPhong`),
  CONSTRAINT `FK_PhongTro_LoaiPhong` FOREIGN KEY (`MaLoaiPhong`) REFERENCES `loaiphong` (`maloaiphong`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of PhongTro
-- ----------------------------
BEGIN;
INSERT INTO `PhongTro` VALUES ('PT001', 0, 0, 'V001');
INSERT INTO `PhongTro` VALUES ('PT002', 0, 0, 'V002');
INSERT INTO `PhongTro` VALUES ('PT003', 0, 0, 'T001');
INSERT INTO `PhongTro` VALUES ('PT004', 0, 0, 'T002');
COMMIT;

-- ----------------------------
-- Table structure for SuDungDichVu
-- ----------------------------
DROP TABLE IF EXISTS `SuDungDichVu`;
CREATE TABLE `SuDungDichVu` (
  `MaDichVu` varchar(10) NOT NULL,
  `MaPhongTro` varchar(10) NOT NULL,
  `NgayBatDau` date DEFAULT NULL,
  `NgayKetThuc` date DEFAULT NULL,
  `ChiSoCu` int(11) DEFAULT NULL,
  PRIMARY KEY (`MaDichVu`,`MaPhongTro`),
  KEY `FK_SDDichVu_PhongTro` (`MaPhongTro`),
  CONSTRAINT `FK_SDDichVu_DichVu` FOREIGN KEY (`MaDichVu`) REFERENCES `dichvu` (`madichvu`),
  CONSTRAINT `FK_SDDichVu_PhongTro` FOREIGN KEY (`MaPhongTro`) REFERENCES `phongtro` (`maphongtro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of SuDungDichVu
-- ----------------------------
BEGIN;
INSERT INTO `SuDungDichVu` VALUES ('DIEN', 'PT001', '2018-05-05', '2018-06-05', 3120);
INSERT INTO `SuDungDichVu` VALUES ('INTERNET', 'PT001', '2018-05-05', '2018-06-05', 1);
INSERT INTO `SuDungDichVu` VALUES ('NUOC', 'PT001', '2018-05-05', '2018-06-05', 30);
COMMIT;

-- ----------------------------
-- Table structure for ThietBi
-- ----------------------------
DROP TABLE IF EXISTS `ThietBi`;
CREATE TABLE `ThietBi` (
  `MaThietBi` varchar(10) NOT NULL,
  `MaPhongTro` varchar(10) DEFAULT NULL,
  `TenThietBi` varchar(20) DEFAULT NULL,
  `TinhTrang` int(11) DEFAULT '0',
  PRIMARY KEY (`MaThietBi`),
  KEY `FK_ThietBi_PhongTro` (`MaPhongTro`),
  CONSTRAINT `FK_ThietBi_PhongTro` FOREIGN KEY (`MaPhongTro`) REFERENCES `phongtro` (`maphongtro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ThietBi
-- ----------------------------
BEGIN;
INSERT INTO `ThietBi` VALUES ('BG001', 'PT001', 'Bàn, ghế', 0);
INSERT INTO `ThietBi` VALUES ('MQ001', 'PT001', 'Máy quạt', 0);
INSERT INTO `ThietBi` VALUES ('TD001', 'PT001', 'Tủ đồ', 0);
COMMIT;

-- ----------------------------
-- Table structure for User_KhachTro
-- ----------------------------
DROP TABLE IF EXISTS `User_KhachTro`;
CREATE TABLE `User_KhachTro` (
  `UserID` varchar(10) NOT NULL,
  `TenDangNhap` varchar(50) DEFAULT NULL,
  `MatKhau` varchar(50) DEFAULT NULL,
  `IsAdmin` int(11) DEFAULT '0',
  `MaKhachTro` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`UserID`),
  KEY `FK_User_KhachTro` (`MaKhachTro`),
  CONSTRAINT `FK_User_KhachTro` FOREIGN KEY (`MaKhachTro`) REFERENCES `khachtro` (`makhachtro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of User_KhachTro
-- ----------------------------
BEGIN;
INSERT INTO `User_KhachTro` VALUES ('', 'admin', '21232f297a57a5a743894a0e4a801fc3', 1, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
