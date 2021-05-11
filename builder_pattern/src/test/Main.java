package test;

import model.Note;
import model.NoteBuilder;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        Note note = new NoteBuilder()
            .author("Josh Archer")
            .buildWithDefaults();

        System.out.println(note);
    }
}
