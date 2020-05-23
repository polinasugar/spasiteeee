import java.util.Arrays;

public class MedFinder {
    public static double getMedian(int[] list){
        Arrays.sort(list);
        if (list.length % 2 == 1) {

            return list[list.length / 2];
        }
    else{
        return 0.5 * (list[list.length / 2 - 1] + list[list.length / 2]);
    }
    }
}
