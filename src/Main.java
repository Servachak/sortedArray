/**
 * Created by adavi on 27.08.2017.
 */
public class Main {

    public static void main(String[] args) {
        BuildArray array = new BuildArray();

        int[] bubbleArray = array.buildArray(10);
        int [] selectArray = array.buildArray(15);
        int [] bubbleSortArray = array.bubbleSort(bubbleArray);

        int [] selectSortArray = array.selectSort(selectArray);

        System.out.println("bubble");
        array.showSortArray(bubbleSortArray);
        System.out.println("\nselect");
        array.showSortArray(selectSortArray);

    }
}
