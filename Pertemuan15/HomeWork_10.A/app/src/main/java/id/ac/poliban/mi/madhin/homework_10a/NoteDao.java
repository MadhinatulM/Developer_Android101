package id.ac.poliban.mi.madhin.homework_10a;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import java.util.List;

@Dao
public interface NoteDao {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Note note);


    @Query("SELECT * FROM note_table ORDER BY id ASC")
    LiveData<List<Note>> getAllNotes();

}
