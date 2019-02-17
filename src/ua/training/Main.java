package ua.training;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Parent p = new Parent();
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        ChildOfChild cc = new ChildOfChild();

        List<Object> list = new ArrayList<>();
        list.add(p);
        list.add(c1);
        list.add(c2);
        list.add(cc);



        for (Object element:list) {
            if(element instanceof Parent) {
                System.out.println("Оbject of the " + element.toString() + " is instance of Parent");
            }
            if(element instanceof Child1) {
                System.out.println("Оbject of the " + element.toString() + " is instance of Child1");
            }
            if(element instanceof Child2) {
                System.out.println("Оbject of the " + element.toString() + " is instance of Child2");
            }
            if(element instanceof ChildOfChild) {
                System.out.println("Оbject of the " + element.toString() + " is instance of ChildOfChild");
            }

        }

    }
}
