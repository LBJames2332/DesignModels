package Strategy.Comparator;

public class Main {
    public static void main(String[] args) {
        DogSorter sorter = new DogSorter();
        Dog[] arr_dog= {new Dog(1,1),new Dog(3,3),new Dog(2,2)};

        sorter.sort(arr_dog,new DogHigherBetterComparator());
        for (int i = 0;i < arr_dog.length;i++){
            System.out.println(arr_dog[i].toString());
        }
    }
}
