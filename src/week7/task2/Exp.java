package week7.task2;

import java.io.*;

public class Exp {
    public Integer[] a = new Integer[1] ;
    public void Nll(){
        Object obj = null ;
        obj.hashCode();
    }
    public int Arr(){
        return a[10] ;
    }
    public int Art(){
        return 10 / 0 ;
    }

    public void fnf() throws FileNotFoundException {

        BufferedReader br = new BufferedReader(new FileReader("k.txt"));
    }

}
