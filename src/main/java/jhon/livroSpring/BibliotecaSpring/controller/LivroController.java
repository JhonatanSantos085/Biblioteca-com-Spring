package jhon.livroSpring.BibliotecaSpring.controller;


import jhon.livroSpring.BibliotecaSpring.model.Livro;
import jhon.livroSpring.BibliotecaSpring.model.LivroDTO;
import jhon.livroSpring.BibliotecaSpring.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public ResponseEntity<List<Livro>> getAllBooks(){
        var livros = this.livroService.getAllBooks();
        return new ResponseEntity<>(livros, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Livro> createBook(@RequestBody LivroDTO livroDTO){
        Livro newLivro = livroService.createBook(livroDTO);
        return new ResponseEntity<>(newLivro, HttpStatus.CREATED);
    }
}
