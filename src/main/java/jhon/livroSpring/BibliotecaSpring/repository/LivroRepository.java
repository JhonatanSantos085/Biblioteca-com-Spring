package jhon.livroSpring.BibliotecaSpring.repository;

import jhon.livroSpring.BibliotecaSpring.modelBook.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
}
