package Strategy.CompareTo;

public class Dog implements MyComparable<Dog>{
    int height;
    int length;
    @Override
    public int compareTo(Dog d) {
        if (d.height > this.height) return 1;
        else {
            if (d.height < this.height) return -1;
            else return 0;
        }
    }
}
