/**
 * Created by adavi on 27.08.2017.
 */
public class BuildArray {
/**------------------- Метод створює масив N - елементів з випадкових чисел **/
    public int[] buildArray(int n){
        int []array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = (int)(Math.random()*1000);

            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }
    /**---------------- Метод показує відсортований масив**/
    public void showSortArray(int []array){

        for (int i = 0; i < array.length; i++){

            System.out.print(array[i] + " ");
        }
    }
    /**-------------- Метод сортування бульбашкою**/
    public int[] bubbleSort(int [] array){
        System.out.println();
        boolean sort = true;

        while (sort) {
            sort = false;
           int min;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    min = array[i+1];
                    array[i+1] = array[i];
                    array[i] = min;
                    sort  = true;
                }

            }
        }
        return array;
    }
    /**--------------- Метод сортування вибіркою**/
    public int[] selectSort(int []array){

        int minNumber = 0;
        int index = 0;
        int j = 0;
        while (j < array.length){

            minNumber = array[j];
            index = j;

         for (int i = j + 1; i < array.length; i++) {

            if (array[i] < minNumber) {
                index = i;
                minNumber = array[i];
            }
         }
         array[index] = array[j];
         array[j] = minNumber;
         j++;
        }
        return array;
    }

}
