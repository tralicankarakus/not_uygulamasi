package com.isimOdevi.demo;


import java.util.Scanner;
public class NoteApp {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Not Ekle");
            System.out.println("2. Notları Listele");
            System.out.println("3. Not Görüntüle");
            System.out.println("4. Not Sil");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminizi yapın: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Boşluğu tüket

            switch (choice) {
                case 1:
                    System.out.print("Not Başlığı: ");
                    String title = scanner.nextLine();
                    System.out.print("Not İçeriği: ");
                    String content = scanner.nextLine();
                    Note newNote = new Note(title, content);
                    notebook.addNote(newNote);
                    System.out.println("Not başarıyla eklendi.");
                    break;
                case 2:
                    notebook.listNotes();
                    break;
                case 3:
                    System.out.print("Görüntülemek istediğiniz not numarasını girin: ");
                    int noteIndex = scanner.nextInt();
                    scanner.nextLine(); // Boşluğu tüket
                    notebook.viewNoteContent(noteIndex - 1);
                    break;
                case 4:
                    System.out.print("Silmek istediğiniz not numarasını girin: ");
                    int noteIndexToDelete = scanner.nextInt();
                    scanner.nextLine(); // Boşluğu tüket
                    notebook.removeNote(noteIndexToDelete - 1);
                    break;
                case 0:
                    System.out.println("Not Defteri uygulaması kapatılıyor.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçim.");
            }
        }
    }
}



