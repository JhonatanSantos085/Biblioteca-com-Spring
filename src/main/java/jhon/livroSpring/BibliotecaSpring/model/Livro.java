package jhon.livroSpring.BibliotecaSpring.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private Editora editora;


    public Livro(LivroDTO livroDTO) {
        this.titulo = livroDTO.titulo();
        this.autor = livroDTO.autor();
        this.anoPublicacao = livroDTO.anoPublicacao();
        this.editora = livroDTO.editora();
    }
}
