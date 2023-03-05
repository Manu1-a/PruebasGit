package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Io {

    private final BufferedReader bufferedReader;

    public Io() {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getString() {
        String value = "";
        try {
            value = this.bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return value;
    }
}
