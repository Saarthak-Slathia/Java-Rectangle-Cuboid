class Rectangle{
    String name;
    double length;
    double breadth;

    Rectangle(String n, double l, double b){
        name = n;
        length = l;
        breadth = b;
    }

    Rectangle(){
        name = "";
        length = 0;
        breadth = 0;
    }

    double area(){
        return length * breadth;
    }
}

class Cuboid extends Rectangle{
    double height;

    Cuboid(String n, double l, double b, double h){
        super(n, l, b);
        height = h;
    }

    Cuboid(){
        super();
        height = 0;
    }

    double volume(){
        return length * breadth * height;
    }
}

public class ShapeClass {
    public static void main(String[] args) {
        double length = 10;
        double breadth = 10;
        double height = 10;

        Cuboid myCuboid = new Cuboid("MyCuboid", length, breadth, height);

        double area = myCuboid.area();
        double vol = myCuboid.volume();

        System.out.println("The area of the cuboid is " + area + " units square.");
        System.out.println("The volume of the cuboid is " + vol + " units cube.");
    }
}
