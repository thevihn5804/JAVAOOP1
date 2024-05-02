package Slide89chuong3;

public interface prinTable {
    public void print();
}
    class A8 implements prinTable{
        public void print(){
            System.out.println("Hello");
        }
        public static void main(String[] args) {
            prinTable obj = new A8();
            obj.print();
        }
    }