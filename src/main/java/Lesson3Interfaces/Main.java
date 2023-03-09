package Lesson3Interfaces;

import Lesson3Interfaces.Models.*;
import Lesson3Interfaces.interfaces.Instrument;
import Lesson3Interfaces.interfaces.Printable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        ArrayList<Printable> printables = new ArrayList<>();
//        printables.add(0,new Book("book1",22,"comedy"));
//        printables.add(1,new Book("book2",265,"phantasy"));
//        printables.add(2,new Book("book3",545,"science"));
//        printables.add(3,new Magazine("magazine1",25,"Vogue"));
//        printables.add(4,new Magazine("magazine2",46,"Forbes"));
//        printables.add(5,new Magazine("magazine3",56,"Times"));
//
//        for (Printable printable : printables) {
//            printable.print();
//        }


        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(0,new Guitar(4));
        instruments.add(1,new Drum(12));
        instruments.add(2,new Trumpet(15));
        instruments.add(3,new Guitar(5));
        instruments.add(4,new Drum(18));
        instruments.add(5,new Trumpet(22));
        instruments.add(6,new Trumpet(40));
        instruments.add(7,new Guitar(10));

        for (Instrument instrument : instruments) {
            instrument.play();
        }

    }

}
