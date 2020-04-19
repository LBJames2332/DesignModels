package Strategy.Comparator;

public class DogSorter <T>{

    public void sort(T[] arr, MyComparator<T> comparator){
        int length = arr.length;
        for (int i = 0; i < arr.length;i++){
            --length;
            for (int j = 0; j < length;j++){
                if (comparator.compare(arr[j],arr[j+1])==1) exchangePosition(arr,j,j + 1);
            }

        }
    }
    public void exchangePosition(T[] arr,int pos1,int pos2){
        T t = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = t;
    }
}
