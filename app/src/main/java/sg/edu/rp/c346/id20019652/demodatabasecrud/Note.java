package sg.edu.rp.c346.id20019652.demodatabasecrud;

import java.io.Serializable;

public class Note implements Serializable {
    //implements Serializable- pass data that is not String, int, float etc.

    private 	int id;
    private 	String noteContent;

    public Note( int id, String noteContent  ) {
        this.id = id;
        this.noteContent = noteContent;
    }

    public int getId() {  return id;  }

    public String getNoteContent() { return noteContent; }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }

    @Override
    public String toString() { return "ID:" + id + ", " + noteContent;  }

}

