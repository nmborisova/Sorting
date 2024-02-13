package bg.smg;

public class Main {

    public static void main(String[] args) {
        int[] list = new int[]{5,2,4,6,1,3};
        bubbleSort(list);
        list = new int[]{5,2,4,6,1,3};
        selectionSort(list);
        list = new int[]{5,2,4,6,1,3};
        insertionSort(list);
        for(int i=0;i<list.length;i++)
            System.out.println(list[i]+" ");
    }

    private static void bubbleSort(int[] list){
        int lastIndex = list.length-1;
        for(int k=0;k<lastIndex;k++) {
            for (int i=0;i<lastIndex-k;i++) {
                if(list[i]>list[i+1]){
                    //swap
                    int temp = list[i];
                    list[i]=list[i+1];
                    list[i+1]=temp;
                }
            }
        }
    }

    private static void selectionSort(int[] list) {
        for(int i=0; i<list.length; i++){
            int currentMin = list[i];
            int currentMinIndex = i;
            for(int j=i+1;j<list.length;j++){
                if(currentMin>list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != 1) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    private static void insertionSort(int[] list) {
        for(int i =1; i<list.length; i++) {
            int currentElement = list[i];
            int k;
            for(k=i-1; k>=0 && list[k] > currentElement;k--){
                list[k+1] = list[k];
            }
            list[k+1] = currentElement;
        }
    }
}
