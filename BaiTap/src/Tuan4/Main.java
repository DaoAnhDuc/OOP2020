package Tuan4;

import Tuan4.Circle.Cylinder;
import Tuan4.Person.Person;
import Tuan4.Person.Staff;
import Tuan4.Person.Student;
import Tuan4.Shape.Circle;
import Tuan4.Shape.Rectangle;
import Tuan4.Shape.Shape;
import Tuan4.Shape.Square;

public class Main {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        System.out.println(circle.toString());
//        System.out.println(circle.getArea());
//
//        Cylinder cylinder = new Cylinder();
//        System.out.println(cylinder.toString());
//        System.out.println(cylinder.getArea());

//        Person person = new Person("Dao Anh Duc", "Ha Noi");
//        System.out.println(person.toString());
//
//        Student student = new Student("Dao Anh Duc", "Ha Noi", "CNTT", 3, 30.4d);
//        System.out.println(student.toString());
//
//        Staff staff = new Staff("Dao Anh Duc", "Ha Noi", "UET", 10.3);
//        System.out.println(staff.toString());

        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1); //Circle[radius=5.5, color='RED', filled=false]
        System.out.println(s1.getArea());//lấy getArea() của Circle
        System.out.println(s1.getPerimeter());//lấy getPerimeter() của Circle
        System.out.println(s1.getColor()); //lấy getColor() của Shape
        System.out.println(s1.isFilled()); //lấy isFilled() của Shape
//        System.out.println(s1.getRadius());
        //lỗi do s1 là Shape, chứ không phải Circle nên ko có phương thức getRadius()
        //Sửa lại bằng cách ép kiểu xuống
        System.out.println(((Circle) s1).getRadius());

        Circle c1 = (Circle)s1;
        System.out.println(c1);//Circle[radius=5.5, color='RED', filled=false]
        System.out.println(c1.getArea());//54.2278
        System.out.println(c1.getPerimeter());//34.54
        System.out.println(c1.getColor());//RED
        System.out.println(c1.isFilled());//false
        System.out.println(c1.getRadius());//5.5
        // Chạy thành công không có lỗi

//        Shape s2 = new Shape();
        //Lỗi xảy ra vì Shape là 1 abstract class nên không thể khởi tạo 1 đối tượng trực tiếp từ 1 abstract class

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);//Rectangle[width=1.0, length=2.0, color='RED', filled=false]
        System.out.println(s3.getArea());//2.0
        System.out.println(s3.getPerimeter());//6.0
        System.out.println(s3.getColor());//RED
//        System.out.println(s3.getLength());
        //lỗi do s1 là Shape, chứ không phải Rectangle nên ko có phương thức getRadius()
        //Sửa lại bằng cách ép kiểu xuống
        System.out.println(((Rectangle) s3).getLength());//2.0

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);//Rectangle[width=1.0, length=2.0, color='RED', filled=false]
        System.out.println(r1.getArea());//2.0
        System.out.println(r1.getColor());//RED
        // Chạy thành công không có lỗi

        System.out.println(r1.getLength());//2.0

        Shape s4 = new Square(6.6);
        System.out.println(s4);//Square[size=6.6, color='null', filled=false]
        System.out.println(s4.getArea()); //sẽ lấy getArea của Square
        System.out.println(s4.getColor()); //sẽ lấy getArea của Shape
//        System.out.println(s4.getSide());
        //lỗi do Shape không có getSize, cần ép kiểu xuống Square
        System.out.println(((Square) s4).getSide());

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
//        System.out.println(r2.getSide());
        //Rectangle không có getSide cần ép kiểu xuống Square
        System.out.println(r2.getLength());

        Square sq1 = (Square)r2;
        System.out.println(sq1);//Square[size=6.6, color='null', filled=false]
        System.out.println(sq1.getArea()); //getArea() của Rectangle 43.559999999999995
        System.out.println(sq1.getColor()); //getColor() của Shape null
        System.out.println(sq1.getSide()); //getSide() của square 6.6
        System.out.println(sq1.getLength());//getLength() của Rectangle 6.6

    }
}
