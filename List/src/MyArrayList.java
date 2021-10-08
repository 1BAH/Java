import java.util.NoSuchElementException;

/**
 * Должен наследовать SimpleList
 *
 * Должен иметь 2 конструктора
 * - без аргументов - создает внутренний массив дефолтного размера
 на ваш выбор
 * - с аргументом - начальный размер массива
 */
public class MyArrayList implements SimpleList {
    public int[] array;
    public int size;

    public MyArrayList() {
        this.array = new int[0];
    }

    public MyArrayList(int capacity) {
        this.size = capacity;
        this.array = new int[capacity];
    }

    @Override
    public void add(int item) {
        int[] newArray = new int[size + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[newArray.length - 1] = item;

        this.array = newArray;
        this.size = size + 1;
    }

    @Override
    public int remove(int idx) throws NoSuchElementException {
        if (idx >= array.length) {
            throw new NoSuchElementException("Index is out of bounds");
        } else if (idx < 0) {
            throw new NoSuchElementException("Index is not a natural number");
        } else {
            int[] newArray = new int[size - 1];
            int output = array[idx];

            for (int j = 0; j < idx; j++) {
                newArray[j] = array[j];
            }

            for (int k = idx + 1; k < array.length; k++) {
                newArray[k - 1] = array[k];
            }

            this.size = size - 1;
            this.array = newArray;

            return output;
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int get(int idx) throws NoSuchElementException{
        if (idx >= array.length) {
            throw new NoSuchElementException("Index is out of range");
        } else if (idx < 0) {
            throw new NoSuchElementException("Index is not a natural number");
        } else {
            return array[idx];
        }
    }
}
