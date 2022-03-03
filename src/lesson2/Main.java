package lesson2;

import com.sun.xml.internal.ws.api.pipe.Tube;
import lesson2.classes.cw.*;
import lesson2.classes.hw.Laptop;
import lesson2.classes.hw.PC;
import lesson2.classes.hw.Ultrabook;
import lesson2.classes.hw.Workstation;
import lesson2.interfaces.Instrument;
import lesson2.interfaces.Printable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Guitar yamahaGuitar = new Guitar(6);
        Guitar takamineGuitar = new Guitar(12);
        Drum yamahaDrum = new Drum("12");
        Drum premierDrum = new Drum("17");
        Trumpet yamahaTrumpet = new Trumpet("3");
        Trumpet maxtoneTrumpet = new Trumpet("5");

        List<Instrument> instruments = new ArrayList<>();
        instruments.add(yamahaGuitar);
        instruments.add(takamineGuitar);
        instruments.add(yamahaDrum);
        instruments.add(premierDrum);
        instruments.add(yamahaTrumpet);
        instruments.add(maxtoneTrumpet);

        for (Instrument instrument : instruments) {
            instrument.play();
        }

        Papyrus papyrus1 = new Papyrus(10);
        Book book1 = new Book(15, "SomeTitle", "SomeAuthor", 356);
        Magazine magazine1 = new Magazine(5, "MagazineTitle", "GQ", 32, "USA");
        Comics comics1 = new Comics(7, "SomeComicsTitle", "DC", 64, true);

        List<Printable> printables = new ArrayList<>();

        printables.add(book1);
        printables.add(magazine1);
        printables.add(comics1);

        for (Printable printable : printables) {
            printable.print();
        }

        PC pc1 = new PC("intel",4, true);
        Laptop laptop1 = new Laptop("AMD", 8, false, 6, 1.5);
        Ultrabook ultrabook1 = new Ultrabook("AMD", 16, false, 4, 1.0, 10.5);
        Workstation workstation1 = new Workstation("Intel", 128, false, 15, 10.2, "Linux");
    }
}
