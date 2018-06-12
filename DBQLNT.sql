CREATE DATABASE  IF NOT EXISTS `QuanLiNhaTro` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `QuanLiNhaTro`;
-- MySQL dump 10.13  Distrib 5.7.22, for Linux (x86_64)
--
-- Host: localhost    Database: QuanLiNhaTro
-- ------------------------------------------------------
-- Server version	5.7.22-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ChiTieu`
--

DROP TABLE IF EXISTS `ChiTieu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ChiTieu` (
  `MaPhieuChi` varchar(10) NOT NULL,
  `NgayChi` date DEFAULT NULL,
  `KhoanChi` varchar(100) DEFAULT NULL,
  `TienChi` int(11) DEFAULT NULL,
  `GhiChu` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`MaPhieuChi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ChiTieu`
--

LOCK TABLES `ChiTieu` WRITE;
/*!40000 ALTER TABLE `ChiTieu` DISABLE KEYS */;
/*!40000 ALTER TABLE `ChiTieu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DangKiPhong`
--

DROP TABLE IF EXISTS `DangKiPhong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DangKiPhong` (
  `MaPhongTro` varchar(10) NOT NULL,
  `MaKhachTro` varchar(10) NOT NULL,
  `NgayDangKiThue` date DEFAULT NULL,
  PRIMARY KEY (`MaPhongTro`,`MaKhachTro`),
  KEY `FK_DKPhong_KhachTro` (`MaKhachTro`),
  CONSTRAINT `FK_DKPhong_KhachTro` FOREIGN KEY (`MaKhachTro`) REFERENCES `KhachTro` (`MaKhachTro`),
  CONSTRAINT `FK_DKPhong_PhongTro` FOREIGN KEY (`MaPhongTro`) REFERENCES `PhongTro` (`MaPhongTro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DangKiPhong`
--

LOCK TABLES `DangKiPhong` WRITE;
/*!40000 ALTER TABLE `DangKiPhong` DISABLE KEYS */;
INSERT INTO `DangKiPhong` VALUES ('PT001','KT001','2018-06-05');
/*!40000 ALTER TABLE `DangKiPhong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `DichVu`
--

DROP TABLE IF EXISTS `DichVu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `DichVu` (
  `MaDichVu` varchar(10) NOT NULL,
  `TenDichVu` varchar(20) DEFAULT NULL,
  `GiaDichVu` int(11) DEFAULT NULL,
  PRIMARY KEY (`MaDichVu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `DichVu`
--

LOCK TABLES `DichVu` WRITE;
/*!40000 ALTER TABLE `DichVu` DISABLE KEYS */;
/*!40000 ALTER TABLE `DichVu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `HoaDon`
--

DROP TABLE IF EXISTS `HoaDon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `HoaDon` (
  `MaHoaDon` varchar(10) NOT NULL,
  `MaPhongTro` varchar(10) NOT NULL,
  `NgayLap` date DEFAULT NULL,
  `TongTien` int(11) DEFAULT NULL,
  PRIMARY KEY (`MaHoaDon`),
  KEY `FK_HoaDon_PhongTro` (`MaPhongTro`),
  CONSTRAINT `FK_HoaDon_PhongTro` FOREIGN KEY (`MaPhongTro`) REFERENCES `PhongTro` (`MaPhongTro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `HoaDon`
--

LOCK TABLES `HoaDon` WRITE;
/*!40000 ALTER TABLE `HoaDon` DISABLE KEYS */;
/*!40000 ALTER TABLE `HoaDon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `HopDong`
--

DROP TABLE IF EXISTS `HopDong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
  CONSTRAINT `FK_HopDong_KhachTro` FOREIGN KEY (`MaKhachTro`) REFERENCES `KhachTro` (`MaKhachTro`),
  CONSTRAINT `FK_HopDong_PhongTro` FOREIGN KEY (`MaPhongTro`) REFERENCES `PhongTro` (`MaPhongTro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `HopDong`
--

LOCK TABLES `HopDong` WRITE;
/*!40000 ALTER TABLE `HopDong` DISABLE KEYS */;
/*!40000 ALTER TABLE `HopDong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `KhachTro`
--

DROP TABLE IF EXISTS `KhachTro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
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
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `KhachTro`
--

LOCK TABLES `KhachTro` WRITE;
/*!40000 ALTER TABLE `KhachTro` DISABLE KEYS */;
INSERT INTO `KhachTro` VALUES ('KT001','Phạm Văn Hậu','Nam','1989-06-05','TP Hà Nội','234567890','Hà Đông','Sinh Viên ','0989786543',1);
/*!40000 ALTER TABLE `KhachTro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `LoaiPhong`
--

DROP TABLE IF EXISTS `LoaiPhong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `LoaiPhong` (
  `MaLoaiPhong` varchar(10) NOT NULL,
  `LoaiPhong` varchar(10) DEFAULT NULL,
  `SoLuongToiDa` int(11) DEFAULT NULL,
  `GiaPhong` int(11) DEFAULT NULL,
  PRIMARY KEY (`MaLoaiPhong`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `LoaiPhong`
--

LOCK TABLES `LoaiPhong` WRITE;
/*!40000 ALTER TABLE `LoaiPhong` DISABLE KEYS */;
INSERT INTO `LoaiPhong` VALUES ('T001','Thường',6,2400000),('T002','Thường',5,2000000),('V001','Vip',6,4800000),('V002','Vip',5,4000000);
/*!40000 ALTER TABLE `LoaiPhong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PhongTro`
--

DROP TABLE IF EXISTS `PhongTro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PhongTro` (
  `MaPhongTro` varchar(10) NOT NULL,
  `TinhTrangPhong` int(11) DEFAULT '0',
  `SoNguoi` int(11) DEFAULT NULL,
  `MaLoaiPhong` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`MaPhongTro`),
  KEY `FK_PhongTro_LoaiPhong` (`MaLoaiPhong`),
  CONSTRAINT `FK_PhongTro_LoaiPhong` FOREIGN KEY (`MaLoaiPhong`) REFERENCES `LoaiPhong` (`MaLoaiPhong`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PhongTro`
--

LOCK TABLES `PhongTro` WRITE;
/*!40000 ALTER TABLE `PhongTro` DISABLE KEYS */;
INSERT INTO `PhongTro` VALUES ('PT001',0,0,'V001'),('PT002',0,0,'V002'),('PT003',0,0,'T001'),('PT004',0,0,'T002');
/*!40000 ALTER TABLE `PhongTro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SuDungDichVu`
--

DROP TABLE IF EXISTS `SuDungDichVu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SuDungDichVu` (
  `MaDichVu` varchar(10) NOT NULL,
  `MaPhongTro` varchar(10) NOT NULL,
  `NgayBatDau` date DEFAULT NULL,
  `NgayKetThuc` date DEFAULT NULL,
  `ChiSoCu` int(11) DEFAULT NULL,
  PRIMARY KEY (`MaDichVu`,`MaPhongTro`),
  KEY `FK_SDDichVu_PhongTro` (`MaPhongTro`),
  CONSTRAINT `FK_SDDichVu_DichVu` FOREIGN KEY (`MaDichVu`) REFERENCES `DichVu` (`MaDichVu`),
  CONSTRAINT `FK_SDDichVu_PhongTro` FOREIGN KEY (`MaPhongTro`) REFERENCES `PhongTro` (`MaPhongTro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SuDungDichVu`
--

LOCK TABLES `SuDungDichVu` WRITE;
/*!40000 ALTER TABLE `SuDungDichVu` DISABLE KEYS */;
/*!40000 ALTER TABLE `SuDungDichVu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ThietBi`
--

DROP TABLE IF EXISTS `ThietBi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ThietBi` (
  `MaThietBi` varchar(10) NOT NULL,
  `MaPhongTro` varchar(10) DEFAULT NULL,
  `TenThietBi` varchar(20) DEFAULT NULL,
  `TinhTrang` int(11) DEFAULT '0',
  PRIMARY KEY (`MaThietBi`),
  KEY `FK_ThietBi_PhongTro` (`MaPhongTro`),
  CONSTRAINT `FK_ThietBi_PhongTro` FOREIGN KEY (`MaPhongTro`) REFERENCES `PhongTro` (`MaPhongTro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ThietBi`
--

LOCK TABLES `ThietBi` WRITE;
/*!40000 ALTER TABLE `ThietBi` DISABLE KEYS */;
INSERT INTO `ThietBi` VALUES ('BG001','PT001','Bàn, ghế',0),('MQ001','PT001','Máy quạt',0),('TD001','PT001','Tủ đồ',0);
/*!40000 ALTER TABLE `ThietBi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `User_KhachTro`
--

DROP TABLE IF EXISTS `User_KhachTro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `User_KhachTro` (
  `UserID` varchar(10) NOT NULL,
  `TenDangNhap` varchar(50) DEFAULT NULL,
  `MatKhau` varchar(50) DEFAULT NULL,
  `IsAdmin` int(11) DEFAULT '0',
  `MaKhachTro` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`UserID`),
  KEY `FK_User_KhachTro` (`MaKhachTro`),
  CONSTRAINT `FK_User_KhachTro` FOREIGN KEY (`MaKhachTro`) REFERENCES `KhachTro` (`MaKhachTro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User_KhachTro`
--

LOCK TABLES `User_KhachTro` WRITE;
/*!40000 ALTER TABLE `User_KhachTro` DISABLE KEYS */;
/*!40000 ALTER TABLE `User_KhachTro` ENABLE KEYS */;
INSERT INTO `User_KhachTro`(TenDangNhap, MatKhau, IsAdmin) VALUES('admin', '21232f297a57a5a743894a0e4a801fc3', 1);
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-05 23:34:47
