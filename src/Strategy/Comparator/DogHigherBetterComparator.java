package Strategy.Comparator;

public class DogHigherBetterComparator implements MyComparator<Dog>{
    //一个狗的比较器，狗的身高越高越好，即排的越靠前
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.height>o2.height) return -1;
        else if (o1.height < o2.height) return 1;
        else return 0;
    }
}
