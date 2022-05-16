import THcacDoiTuongHinhHoc.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("gray", false);
        System.out.println(shape);
    }
}
