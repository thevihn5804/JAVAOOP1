public class nhanvien {
    protected String fullName;
    protected long luong;
    public nhanvien(){
        fullName="";
        luong= 0;
    }
    public nhanvien(String fullName){
        this.fullName=fullName;
    }
    protected String loaiNhanVien(){
        return "";
    };
    public void xuatThongTin(){
        System.out.print("thong tin nhan vien: "+fullName+" chuc vu: "+loaiNhanVien+" tien luong: "+luong);
    }
}
