package com.isimOdevi.demo;

import java.util.ArrayList;

public class Notebook {
        private ArrayList<Note> notes;

    public Notebook() {
            notes = new ArrayList<>();
        }

        public void addNote (Note note){
            notes.add(note);
        }

        public void listNotes () {
            System.out.println("Not Defteri:");
            for (int i = 0; i < notes.size(); i++) {
                Note note = notes.get(i);
                System.out.println((i + 1) + ". " + note.getTitle());
            }
        }

        public void viewNoteContent ( int index){
            if (index >= 0 && index < notes.size()) {
                Note note = notes.get(index);
                System.out.println("Başlık: " + note.getTitle());
                System.out.println("İçerik: " + note.getContent());
            } else {
                System.out.println("Geçersiz not numarası.");
            }
        }

        public void removeNote ( int index){
            if (index >= 0 && index < notes.size()) {
                notes.remove(index);
                System.out.println("Not başarıyla silindi.");
            } else {
                System.out.println("Geçersiz not numarası.");
            }
    }
}

