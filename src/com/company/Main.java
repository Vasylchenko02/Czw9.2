package com.company;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int bajt;
        try(FileInputStream fls = new FileInputStream("Czw9.2.txt")){
            do {
                bajt = fls.read();
                if(bajt !=-1) System.out.println((char) bajt);
            } while (bajt !=-1);
        } catch (FileNotFoundException e) {
            System.out.println("Nie udalo sie znalezc plik");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Blad odczytu pliku");
            e.printStackTrace();
        }
    }
}
