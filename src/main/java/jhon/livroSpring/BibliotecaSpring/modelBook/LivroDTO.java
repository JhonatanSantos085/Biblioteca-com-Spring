package jhon.livroSpring.BibliotecaSpring.modelBook;

public record LivroDTO(
        String titulo,
        String autor,
        int anoPublicacao,
        Editora editora
) {
}
