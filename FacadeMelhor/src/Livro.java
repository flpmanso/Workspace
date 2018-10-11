class Livro {
    private String ISBN;
    private String titulo;
    private String autor;

    public Livro(String autor, String ISBN, String titulo) {
        this.autor = autor;
        this.ISBN = ISBN;
        this.titulo = titulo;
    }

    public String getTitulo()   {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }
}
