public class nhanVienFullTime extends nhanvien{
    private int ngayLamThem;
    private int loaiChucVu;
    public nhanVienFullTime (String fullName){
        this.fullName = fullName;
    }
    public nhanVienFullTime (String fullName, int ngayLamThem){
        this.fullName = fullName;
        this.ngayLamThem = ngayLamThem;
 }
 public void setLoaiChucVu(int loaiChucVu){
    this.loaiChucVu=loaiChucVu;
 }
 @Override
 public String loaiNhanvien(){
    return " day la nhan vien fulltime";
 }
 public void tinhLuong(){
    if(loaiChucVu==0){
        luong=configs.luongnhanvienFullTimeLinh+(configs.luongLamThemmoingay*ngayLamThem);
    }   else luong=configs.luongnhanvienFullTimeLinh;
 }  else if(ngayLamThem>0){
    luong=configs.luongnhanvienFullTimeSep+(configs.luongLamThemmoingay*ngayLamThem);
 }else luong=configs.luongnhanvienFullTimeSep;
}

