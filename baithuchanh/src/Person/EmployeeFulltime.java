package Person;

public class EmployeeFulltime extends Employee {
    public int day;
    public int year;
    public EmployeeFulltime()
    {
        Vitri = "Full time";
        day = 0;
        year = 0;
    }
    public void NhapDuLieu ()
    {
        super.NhapDuLieu();
        System.out.print("So nam lam viec o cong ty: ");
        year = sc.nextInt();
        System.out.print("So ngay lam viec: ");
        day = sc.nextInt();
    }
    public void Luong()
    {
        if (year<2)
            Luong = Luong * day * 10 + 120000;
        else if (year<5) {
            Luong = Luong * day * 10 + 250000;
        }
        else 
            Luong = Luong * day * 10 + 500000;
    }
    public void XuatDuLieu ()
    {
        super.XuatDuLieu();
        System.out.println("So nam lam viec o cong ty: " + year);
    }
}
