create database QuanLiNhaTro;
use QuanLiNhaTro;

create table KhachTro
(
	MaKhachTro varchar(10) not null,
	TenKhachTro nvarchar(50),
	Phai nvarchar(3),
	NgaySinh date,
	QueQuan nvarchar(50),
	CMND char(12),
	DiaChiThuongTru nvarchar(100),
	NgheNghiep nvarchar(50),
    DienThoai varchar(11),
    TinhTrang int default 0,
	primary key (MaKhachTro)
);

create table User_KhachTro
(
	UserID varchar(10) not null,
    TenDangNhap nvarchar(50),
    MatKhau nvarchar(50),
    IsAdmin int default 0,
    MaKhachTro varchar(10),
    primary key (UserID)
);

create table LoaiPhong
(
	MaLoaiPhong varchar(10) not null,
    LoaiPhong varchar(10),
    SoLuongToiDa int,
    GiaPhong int,
    primary key (MaLoaiPhong)
);

create table PhongTro
(
	MaPhongTro varchar(10) not null,
	TinhTrangPhong int default 0,
	SoNguoi int,
	MaLoaiPhong varchar(10),
	primary key (MaPhongTro)
);

create table HopDong
(
	MaHopDong varchar(10) not null,
	NgayThue date not null,
	MaKhachTro varchar(10),
    MaPhongTro varchar(10),
    NgayKetThu date,
    TienDatCoc int, 
    TinhTrang int default 0,
    constraint primary key (MaHopDong, NgayThue)
);

create table DichVu
(
	MaDichVu varchar(10) not null,
    TenDichVu nvarchar(20),
    GiaDichVu int,
	primary key (MaDichVu)
);

create table SuDungDichVu
(
	MaDichVu varchar(10) not null,
    MaPhongTro varchar(10) not null,
	NgayBatDau date,
    NgayKetThuc date,
    ChiSoCu int,
    constraint primary key (MaDichVu, MaPhongTro)
);

create table HoaDon
(
	MaHoaDon varchar(10) not null,
    MaPhongTro varchar(10) not null,
	NgayLap date,
    TongTien int,
    primary key (MaHoaDon)
);

create table ChiTieu
(
	MaPhieuChi varchar(10) not null,
	NgayChi date,
    KhoanChi nvarchar(100),
    TienChi int,
    GhiChu nvarchar(100),
    primary key (MaPhieuChi)
);

create table ThietBi
(
	MaThietBi varchar(10) not null,
    MaPhongTro varchar(10),
    TenThietBi nvarchar(20),
    TinhTrang nvarchar(20),
    primary key (MaThietBi)
);

alter table User_KhachTro add constraint FK_User_KhachTro foreign key (MaKhachTro)
references KhachTro(MaKhachTro);

alter table PhongTro add constraint FK_PhongTro_LoaiPhong foreign key (MaLoaiPhong)
references LoaiPhong(MaLoaiPhong);

alter table HopDong add constraint FK_HopDong_KhachTro foreign key (MaKhachTro)
references KhachTro(MaKhachTro);

alter table HopDong add constraint FK_HopDong_PhongTro foreign key (MaPhongTro)
references PhongTro(MaPhongTro);

alter table SuDungDichVu add constraint FK_SDDichVu_PhongTro foreign key (MaPhongTro)
references PhongTro(MaPhongTro);

alter table SuDungDichVu add constraint FK_SDDichVu_DichVu foreign key (MaDichVu)
references DichVu(MaDichVu);

alter table HoaDon add constraint FK_HoaDon_PhongTro foreign key (MaPhongTro)
references PhongTro(MaPhongTro);

alter table ThietBi add constraint FK_ThietBi_PhongTro foreign key (MaPhongTro)
references PhongTro(MaPhongTro);


