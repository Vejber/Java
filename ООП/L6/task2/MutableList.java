package ООП.L6.task2;

public class MutableList<T> extends ImmutableList<T> {

    public MutableList() {
    }

    // public int getSize (){
    // return 1;
    // }

    // public int get(int i) {
    // return i;
    // }

    public int set(int i, T newValue) {
        ImmutableList<Integer> newI = new ImmutableList<>();
        int result = newI.get(i);
        return result;
    }

    public int add(Integer newValue) {
        ImmutableList<Integer> newSize = new ImmutableList<Integer>();
        int result = newSize.getSize();
        result += newValue;
        return result;
    }

    public int remove(Integer value) {
        ImmutableList<Integer> newSize = new ImmutableList<>();
        int result = newSize.getSize();
        result -= value;
        return result;
    }

}
