package jhon.livroSpring.BibliotecaSpring.model;

public record LivroDTO(
        String titulo,
        String autor,
        int anoPublicacao,
        Editora editora
) {
}
