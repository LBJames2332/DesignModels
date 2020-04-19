package Strategy.Comparator;




public class Dog {
    int height;
    int length;

    public Dog(int height, int length) {
        this.height = height;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "height=" + height +
                ", length=" + length +
                '}';
    }
}
