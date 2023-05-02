public class Main {
    public static void main(String[] args) {
        Lock2BoolsInterface lock  = new Lock2BoolsInterfaceImpl();
        Lock2Bools t1 = new Lock2Bools(lock, 0);
        Lock2Bools t2 = new Lock2Bools(lock, 1);
        t1.start();
        t2.start();
    }
}