public class week4 {
    public  static void main(String[] args){
        dongha d = new dongha();
        System.out.println("동하 형님은");
        d.print();
        d.walking();
        d.noodle();
        System.out.println();

        yumin y = new yumin();
        System.out.println("유민이 동생님은");
        y.print();
        y.see();
        y.long_hair();
        System.out.println();

        jaeyup j = new jaeyup();
        System.out.println("재엽이 형님은");
        j.print();
        j.cleaning();
        j.coding();
    }
}