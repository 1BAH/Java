import java.util.NoSuchElementException;
/**
 * Упрощенная реализация List
 */
public interface SimpleList {
    /**
     * Добавить элемент в конец списка
     */
    void add(int item);
    /**
     * удалить элемент по индексу idx, если такого индекса нет или
     он невалидный,
     * то бросить ошибку, если ок - вернуть удаленный элемент
     */
    int remove(int idx) throws NoSuchElementException;
    /**
     * Получить элемент с позиции idx или бросить исключение, если
     такого индекса нет
     */
    int get(int idx) throws NoSuchElementException;
    /**
     * Количество элементов списка
     */
    int size();
}
