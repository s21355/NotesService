package NotesService;

import java.util.ArrayList;
import java.util.List;

public class NotesStorageMock implements NotesStorage {

    private List<Note> notes = new ArrayList<>();

    @Override
    public void add(Note note) {
        notes.add(note);
    }

    @Override
    public List<Note> getAllNotesOf(String name) {
        List<Note> notesOfName = new ArrayList<>();
        for (Note note : notes) {
            if (note.getName().equals(name)) {
                notesOfName.add(note);
            }
        }
        return notesOfName;
    }

    @Override
    public void clear() {
        notes.clear();
    }
}
