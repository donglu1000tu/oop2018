package week7.task2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        Exp e = new Exp();

        try {
            e.Nll();
        } catch (Exception e2) {
            System.out.println(e2.toString());
        }
        try {
            e.Arr();
        } catch (Exception e3) {
            System.out.println(e3.toString());
        }
        try {
            e.Art();
        } catch (Exception e4) {
            System.out.println(e4.toString());
        }
        try {
            throw new ClassCastException();
        } catch (Exception e6) {
            System.out.println(e6.toString());
        }
        try {
            throw new IOException();
        } catch (IOException e1) {
            System.out.println(e1.toString());
        }
        try {
            e.fnf();
        } catch (FileNotFoundException e5) {
            System.out.println(e5.toString());
        }

    }
}
