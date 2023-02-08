package AlgoAnalysis.MockExam;

import java.util.ArrayList;

public class Set {
    private ArrayList<Integer> data;
    private int size;
    private final int MAX_CAPACITY = 10;

    public Set() {
        data = new ArrayList<>();
        size = 0;
    }

    public void add(int item) {
        if (!data.contains(item)) {
            data.add(item);
            size++;
        }
        if (size >= MAX_CAPACITY * 0.8) {
            increaseCapacity();
        }
    }

    private void increaseCapacity() {
        int newCapacity = data.size() * 2;
        ArrayList<Integer> newData = new ArrayList<>(newCapacity);
        for (int item : data) {
            newData.add(item);
        }
        data = newData;
    }

    public void remove(int item) {
        data.remove((Integer) item);
        size--;
    }

    public boolean contains(int item) {
        return data.contains(item);
    }

    public int[] toArray() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = data.get(i);
        }
        return result;
    }

    public void clear() {
        data.clear();
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static Set union(Set A, Set B) {
        Set result = new Set();
        for (int item : A.data) {
            result.add(item);
        }
        for (int item : B.data) {
            result.add(item);
        }
        return result;
    }

    public static Set intersect(Set A, Set B) {
        Set result = new Set();
        for (int item : A.data) {
            if (B.data.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static Set difference(Set A, Set B) {
        Set result = new Set();
        for (int item : A.data) {
            if (!B.data.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
}

