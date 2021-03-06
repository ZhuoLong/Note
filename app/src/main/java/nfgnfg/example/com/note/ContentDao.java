package nfgnfg.example.com.note;

import java.util.List;

/**
 * Created by ngfngf on 2017/5/8.
 */

public class ContentDao {
    public static void insertNote(Note note){
        BaseApplication.getDaoInstant().getNoteDao().insertOrReplace(note);
    }

    public static void deleteNote(Note note) {
        BaseApplication.getDaoInstant().getNoteDao().delete(note);
    }


    public static List<Note> queryAll(){
        return BaseApplication.getDaoInstant().getNoteDao().loadAll();
    }
}
