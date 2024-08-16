package jhon.livroSpring.BibliotecaSpring.service;

import jhon.livroSpring.BibliotecaSpring.model.Livro;
import jhon.livroSpring.BibliotecaSpring.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> findAll(){
        return livroRepository.findAll();
    }

    public Livro save(Livro livro){
        return livroRepository.save(livro);
    }


}
