import java.util.*;

public class Note
{
    public final List<String> notes = new ArrayList<>();

    public void addNote(int index, String note) {
        System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
        notes.add(index, note);
        System.out.println("Уже добавлена заметка [" + note + "]");
    }

    public void removeNote(int index) {
        System.out.println("Сейчас будет удалена заметка с позиции " + index);
        String note;
        note = notes.remove(index);
        System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
    }

    public void readNote(int index) {
        System.out.println("Сейчас будет прочтена заметка с позиции " + index);
        String note;
        note = notes.get(index);
        System.out.println("Прочтена заметка [" + note + "] с позиции " + index);
    }

    public int getLength() {
        return(notes.size());
    }
}