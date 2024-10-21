package homework_28.task1task2;


import lists.MyArrayList;
import lists.MyList;

public class Main {
    public static void main(String[] args) {

        //MyList<Rectangle> rects = new MyArrayList<>();


        Rectangle rect1 = new Rectangle(5.0,3.0);
        Rectangle rect2 = new Rectangle(5.0,3.0);
        Rectangle rect3 = new Rectangle(4.0,2.0);


        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect3);

        System.out.println(rect1 == rect2);

        System.out.println("rect1.equals(rect2): " + (rect1.equals(rect2)));
        System.out.println("rect2.equals(rect3): " + (rect2.equals(rect3)));


    }
    }

