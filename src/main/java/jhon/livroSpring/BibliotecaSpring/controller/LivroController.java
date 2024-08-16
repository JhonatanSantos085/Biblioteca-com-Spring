package jhon.livroSpring.BibliotecaSpring.controller;


import jhon.livroSpring.BibliotecaSpring.model.Livro;
import jhon.livroSpring.BibliotecaSpring.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> findAll(){
        return livroService.findAll();
    }

    @PostMapping
    public Livro create(@RequestBody Livro livro){
        return livroService.save(livro);
    }
}
