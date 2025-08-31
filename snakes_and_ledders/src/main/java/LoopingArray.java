import java.lang.reflect.Array;

public class LoopingArray<T> {
    private  T[] array;
    private int activeElement;
    LoopingArray(Class<T[]> type, int length) {
        array = type.cast(Array.newInstance(type.getComponentType(), length));
        activeElement = 0;
    }

    public void put(int position, T element){
        array[position] = element;
    }

    public int next(){
        int next = activeElement;
        activeElement ++;
        if (activeElement >= array.length){
            activeElement = 0;
        }
        return next;
    }
    public int nextNoLooping(){
        return activeElement;
    }

    public T get(int n){
        return array[n];
    }
}
