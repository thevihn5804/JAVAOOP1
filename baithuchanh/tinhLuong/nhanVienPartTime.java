public class nhanVienPartTime extends nhanvien {
    protected int gioLamViec;
    public nhanVienPartTime(String fullName,int gioLamViec){
        this.fullName=fullName;
        this.gioLamViec=gioLamViec;
    }
    @Override
    public String loaiNhanVien(){
        return"day la nhan vien partTime";
    }
    public void tinhLuong(){
        luong=configs.luongnhanvienPartTimemoigio*gioLamViec;
    }
}
