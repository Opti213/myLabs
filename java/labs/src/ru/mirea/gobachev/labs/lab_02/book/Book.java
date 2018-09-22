package ru.mirea.gobachev.labs.lab_02.book;

public class Book {
    private String autor;
    private String title;
    private int year;

    Book(){
        autor = "none";
        title = "none";
        year = 0;
    }

    Book(String autor, String title, int year){
        this.autor =  autor;
        this.title =  title;
        this.year = year;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitle() {
        return title;
    }

    public void getInfo(){
        System.out.println("autor = " + autor);
        System.out.println("title = " + title);
        System.out.println("year = " + year);
    }
}
