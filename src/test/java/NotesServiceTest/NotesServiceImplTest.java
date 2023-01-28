package NotesServiceTest;

import static org.junit.Assert.assertEquals;

import NotesService.Note;
import NotesService.NotesServiceImpl;
import NotesService.NotesStorageMock;
import org.junit.Test;

public class NotesServiceImplTest {

    @Test
    public void testAverageOf() {
        NotesStorageMock storage = new NotesStorageMock();
        NotesServiceImpl service = NotesServiceImpl.createWith(storage);

        storage.add(new Note("John", 4.0f));
        storage.add(new Note("John", 3.5f));
        storage.add(new Note("Jane", 2.0f));

        assertEquals(3.75f, service.averageOf("John"), 0.001f);
    }
}