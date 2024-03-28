package Person;

public class EmployeeParttime extends Employee {
    public int hour;
    public EmployeeParttime()
    {
        Vitri = "Part time";
        hour = 0;
    }
    public void NhapDuLieu()
    {
        super.NhapDuLieu();
        System.out.print("So gio lam viec: ");
        hour = sc.nextInt();
    }
    public void Luong()
    {
        Luong *= hour;
    }
    public void XuatDuLieu()
    {
        super.XuatDuLieu();
    }
}
