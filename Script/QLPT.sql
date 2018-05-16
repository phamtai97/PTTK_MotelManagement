create database QLNT

use QLNT

create table KHACH_TRO
(
	MaKhachTro varchar(5) NOT NULL,
	TenKhachThue nvarchar(31),
	Phai nvarchar(5),
	NgaySinh datetime,
	SDT varchar(20),
	QueQuan nvarchar(50),
	CMND char(12),
	DiaChiThuongTru nvarchar(50),
	NgheNghiep nvarchar(20),
	MaPhong varchar(5),
	PRIMARY KEY (MaKhachTro)
)

create table _USER
(
	UserID varchar(10),
	UserName varchar(20),
	Pwd varchar(30),
	IsAdmin boolean,
	MaKhachTro varchar(5),
	MaPhong varchar(5),
	PRIMARY KEY (UserID)
)

create table CHI_TIEU
(
	MaPhieuChi varchar(5) NOT NULL,
	NgayChi datetime,
	KhoanChi nvarchar(100),
	TienChi int,
	GhiChu nvarchar(100),
	PRIMARY KEY (MaPhieuChi)
)

create table PHONG
(
	MaPhong varchar(5) NOT NULL,
	LoaiPhong nvarchar(20),
	TinhTrangPhong int,
	SoNguoi int,
	GiaPhong int,
	PRIMARY KEY (MaPhong)
)

create table HOP_DONG
(
	MaHopDong varchar(5) NOT NULL,
	MaPhong varchar(5),
	MaKhachTro varchar(5),
	TenKhachTro nvarchar(31),
	NgayThue datetime,
	LuaChon int,
	PRIMARY KEY (MaHopDong)
)

create table HOA_DON
(
	MaHoaDon varchar(5) NOT NULL,
	MaPhong varchar(5) NOT NULL,
	NgayLap datetime,
	TinhTrang int,
	PRIMARY KEY (MaHoaDon)
)

create table DICH_VU
(
	MaDichVu varchar(5) NOT NULL,
	TenDichVu nvarchar(30),
	GiaDichVu int,
	DonViTinh nvarchar(30),
	PRIMARY KEY (MaDichVu)
)

create table CHI_TIET_DV
(
	MaHoaDon varchar(5),
	MaDichVu varchar(5),
	ChiSo int,
	CONSTRAINT PK_CHI_TIET_DV PRIMARY KEY(MaHoaDon, MaDichVu)
)

create table THIET_BI
(
	MaThietBi varchar(5),
	TenThietBi nvarchar(50),
	MaPhong varchar(5),
	PRIMARY KEY (MaThietBi)
)

ALTER TABLE KHACH_TRO ADD CONSTRAINT FK_KHACH_TRO_PHONG FOREIGN KEY (MaPhong)
REFERENCES PHONG(MaPhong)

ALTER TABLE _USER ADD CONSTRAINT FK_USER_PHONG FOREIGN KEY (MaPhong)
REFERENCES PHONG(MaPhong)

ALTER TABLE _USER ADD CONSTRAINT FK_USER_KHACH_TRO FOREIGN KEY (MaKhachTro)
REFERENCES KHACH_TRO(MaKhachTro)

ALTER TABLE THIET_BI ADD CONSTRAINT FK_THIETBI_PHONG FOREIGN KEY (MaPhong)
REFERENCES PHONG(MaPhong)

ALTER TABLE HOP_DONG ADD CONSTRAINT FK_HOPDONG_PHONG FOREIGN KEY (MaPhong)
REFERENCES PHONG(MaPhong)

ALTER TABLE HOP_DONG ADD CONSTRAINT FK_HOPDONG_KHACHTRO FOREIGN KEY (MaKhachTro)
REFERENCES KHACH_TRO(MaKhachTro)

ALTER TABLE HOA_DON ADD CONSTRAINT FK_HOADON_PHONG FOREIGN KEY (MaPhong)
REFERENCES PHONG(MaPhong)

ALTER TABLE CHI_TIET_DV ADD CONSTRAINT FK_CHI_TIET_DV_DICH_VU FOREIGN KEY (MaDichVu)
REFERENCES DICH_VU(MaDichVu)
ALTER TABLE CHI_TIET_DV ADD CONSTRAINT FK_CHI_TIET_DV_HOA_DON FOREIGN KEY ( MaHoaDon ) REFERENCES HOA_DON ( MaHoaDon )