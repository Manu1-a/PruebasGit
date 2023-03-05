package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Io {

    private final BufferedReader bufferedReader;

    public Io() {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }
}
