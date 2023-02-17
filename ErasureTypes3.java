class Shape {

}

class Circle extends Shape {

}

class Rectangle extends Shape {

}


class Program {

    public static <T extends Shape> void draw(T shape) {
        System.out.println("Drawing a " + shape.getClass().getSimpleName());

    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        draw(circle);
        draw(rectangle);
    }

}


