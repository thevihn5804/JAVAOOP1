package Slide80chuong3;

public class NhanvienPartTime extends Nhanvien {
    private int gioLamViec;
    public NhanvienPartTime(String ten, int gioLamViec) {
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }
    @Override
    public String loaiNhanVien() {
        return "Nhan vien thoi vu";
    }
    public void tinhLuong() {
        luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
    }

}
