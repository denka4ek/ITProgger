package ua.den.company;

public class Polymorph {
    public static void main(String[] args) {
        Shape[] arr = new Shape[] {new Circle(), new Square(), new Triangle()};
        for (int i = 0; i < arr.length; i ++){
            arr[i].draw();
        }
    }
}
