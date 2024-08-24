package jhon.livroSpring.BibliotecaSpring.service;

import jhon.livroSpring.BibliotecaSpring.model.Livro;
import jhon.livroSpring.BibliotecaSpring.model.LivroDTO;
import jhon.livroSpring.BibliotecaSpring.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;


    private void saveBook(Livro livro){
        this.livroRepository.save(livro);
    }

    public Livro createBook(LivroDTO livroDTO){
        Livro newLivro = new Livro(livroDTO);
        this.saveBook(newLivro);
        return newLivro;

    }

    public List<Livro> getAllBooks(){
        return livroRepository.findAll();
    }


}
