package week3;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class Week3Test {


    @Test
    public void testMax(){
        assertEquals(100,max(100,10)) ;
        assertEquals(234,max(234,123)) ;
        assertEquals(230,max(50,230)) ;
        assertEquals(432,max(132,432)) ;
        assertEquals(2423,max(2342,2423)) ;
    }
    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinofArray(){
        int[] a = {1,23,242,5,12,435,63,12,213,32,445,3232,4,4234,5323,432} ;
        assertEquals(5323,minofArray(a)) ;
        int[] b = {32,24,131,2,23,23,4643,52,32,34,23,2,34,2,3252,43,2} ;
        assertEquals(4643,minofArray(b)) ;
        int[] c = {1,4,6,2,4,7,7} ;
        assertEquals(7,minofArray(c)) ;
        int[] d = {2,4,6,8,9} ;
        assertEquals(9,minofArray(d)) ;
        int[] e = {1,3,5,7,9,11} ;
        assertEquals(11,minofArray(e)) ;
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCalculateBMI(){
        assertEquals("Béo phì",calculateBMI(75,1.56)) ;
        assertEquals("Bình thường",calculateBMI(68,1.72)) ;
        assertEquals("Bình thường",calculateBMI(60,1.72)) ;
        assertEquals("Thừa cân",calculateBMI(78,1.77)) ;
        assertEquals("Thừa cân",calculateBMI(90,1.9)) ;

    }
}
