package Slide80chuong3;

public class testNhanVien {
    public static void main(String[] args) {
        NhanvienFullTime sep = new NhanvienFullTime("Nguyen Van Sep");
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        NhanvienFullTime linh1 = new NhanvienFullTime("Nguyen Thi Linh", 5);
        linh1.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        NhanvienFullTime linh2 = new NhanvienFullTime("Tran Van Linh");
        linh2.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        NhanvienPartTime thoivu = new NhanvienPartTime("Luu Van Vu", 300);
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoivu.tinhLuong();
        //xuat thong tin
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoivu.xuatThongTin();
    }
    }
