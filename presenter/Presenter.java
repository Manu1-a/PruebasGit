package presenter;

import model.Person;
import view.Io;

public class Presenter {

    private Io io;
    private Person person;

    public Presenter() {
        this.person = new Person();
        this.io = new Io();
    }
}
