package Slide89chuong3;

public abstract class abStract {
    abstract void run();
}
class Honda4 extends abStract{
    public void run(){
        System.err.println("running safely....");
    }
    public static void main(String[] args) {
        abStract obj = new Honda4();
        obj.run();
    }
}
