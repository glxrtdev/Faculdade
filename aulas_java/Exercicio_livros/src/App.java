public class App {
    public static void main(String[] args) throws Exception {
        

        Livro livro1 = new Livro("Core Java 2", "Cay S. Horstmann e Gary Cornell", 2005, "1598FHK", "0130819336");
        Livro livro2 = new Livro("Java, como programar", "Harvey Deitel", 2015, "9865PLO", "0130341517");


        System.out.println("Aqui estão os livros cadastrados: ");
        System.out.println(livro1);
        System.out.println("------------------------------");
        System.out.println(livro2);
    }
}
