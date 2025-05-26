public class Livro {

    private String titulo;
    private String autores;
    private int ano;
    private String codigo;
    private String isbn;

    public Livro(String titulo, String autores, int ano, String codigo, String isbn) {
        this.titulo = titulo;
        this.autores = autores;
        this.ano = ano;
        this.codigo = codigo;
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getAutores() {
        return autores;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\n" +
               "Autor(es): " + autores + "\n" +
               "Ano: " + ano + "\n" +
               "Código: " + codigo + "\n" +
               "ISBN: " + isbn;
    }

}