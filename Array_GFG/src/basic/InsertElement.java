package basic;

public class InsertElement {
    public static void main(String[] args) {
        int arr[] = new int[20];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        arr[3] = 20;
        arr[4] = 25;
        arr[5] = 30;
        int capacity = 20;
        int present = 6;
        int key = 35;
        int numberToBeAdded = 23;
        int position = 3;

        System.out.println("Before: ");
        for (int i =0 ;i< arr.length;i++)
            System.out.print(arr[i]+" ");

//        insertElement( arr,capacity,present,key,numberToBeAdded,position);

//        insertElementAtParticularPosition(arr,present,numberToBeAdded,position);

        insertElementInSortedArray(arr,capacity,numberToBeAdded,present);
        System.out.println();

        System.out.println("After: ");
        for (int i =0 ;i< arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    private static int insertElement(int[] arr, int capacity, int present, int key,int numberToBeAdded,int position ) {
        if (present >= capacity) {
            return present;
        }
        else {
            arr[present] = key;
            return present+1;
        }
    }
    private static void insertElementAtParticularPosition(int[] arr,  int present, int numberToBeAdded,int position ){
        for (int i = present-1;i>=position;i--){
            arr[i+1] = arr[i];
        }
            arr[position] = numberToBeAdded;
    }
    private static int insertElementInSortedArray(int[] arr,int capacity,int numberToBeAdded,int present){

        if (present>=capacity)
            return present;
        int i;
        for ( i=present-1;i>=0&&arr[i]>numberToBeAdded;i--){
            arr[i+1]=arr[i];
        }
        arr[i+1]=numberToBeAdded;
        return present+1;

    }
}
