

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.*;

class MedFinderTest {
    @Test
    void oneNumber(){
        int[] arr = {1, 2, 3};
        int rez = 2;
        assertEquals(rez, MedFinder.getMedian(arr));
    }

    @Test
    void twoNumber(){
        int[] arr = {1, 2, 3, 4};
        double rez = 2.5;
        assertEquals(rez,MedFinder.getMedian(arr));
    }

    @Test
    void stressTest(){
        Random rand = new Random();
        int number = 10000000;
        int[] arr = new int[number];
        for (int i = 0; i < number; i ++){
            arr[i] = rand.nextInt();
        }
        double rez;
        Arrays.sort(arr);
        if (arr.length % 2 == 1) {

            rez = arr[arr.length / 2];
        }
        else{
            rez = 0.5 * (arr[arr.length / 2 - 1] + arr[arr.length / 2]);
        }
        assertEquals(rez, MedFinder.getMedian(arr));
    }
}