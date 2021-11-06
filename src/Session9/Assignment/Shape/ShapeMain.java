package Session9.Assignment.Shape;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ShapeManager hinhHoc = new ShapeManager();
        Circle circle = new Circle("c1", 20);
        hinhHoc.addShape(circle);
        hinhHoc.addShape(circle);
        hinhHoc.addShape(circle);
        hinhHoc.addShape(circle);
        hinhHoc.addShape(circle);
        Square square = new Square("sq1", 30);
        hinhHoc.addShape(square);
        Rectangle rect = new Rectangle("rec1", 20, 40);
        hinhHoc.addShape(rect);
        Triangle tri = new Triangle("tri1", 15, 20, 25);
        hinhHoc.addShape(tri);
        System.out.println("=============show DS===============");
        hinhHoc.showDs();
        System.out.println("=============Tim theo loai===============");
        System.out.println(hinhHoc.timDsTheoTen("triangle"));
        System.out.println("==============Xoa theo loai==============");
        hinhHoc.xoaDsTheoLoai("circle");
        hinhHoc.showDs();

    }
}
