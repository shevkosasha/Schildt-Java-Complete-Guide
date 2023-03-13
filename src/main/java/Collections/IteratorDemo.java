package Collections;

import java.util.*;

public class IteratorDemo {
//    1 1 создать списочный массив
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add(" С ");
        al.add(" A ");
        al.add(" E ");
        al.add(" B ");
        al.add(" D ");
        al.add(" F ");
        System.out.print(" Исходное содержимое списочного массива al :  ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + "  ");
            System.out.println();
        }
        ListIterator<String> listIterator = al.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            listIterator.set(element + " +  ");
        }
        System.out.println("\" Измененное содержимое списочного массива al :  ");
        itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + " + ");
        }
        System.out.println();
        System.out.println("Измeнeнный в обратном порядке список :  ");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous() + " + ");
            System.out.println();
        }
    }
}
