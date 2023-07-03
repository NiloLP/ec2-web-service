package com.example.ec2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/api")
public class CursoController {
  @Autowired
  private CursoRepository cursoRepository;

  @GetMapping(path = "/all")
  public @ResponseBody Iterable<Curso> getAllCursos() {
    return cursoRepository.findAll();
  }

  @PutMapping

  @PostMapping(path = "/curso/nuevo")
  public @ResponseBody String addNewCurso(@RequestParam String nombre, @RequestParam int creditos) {

    Curso c = new Curso();
    c.setNombre(nombre);
    c.setCreditos(creditos);
    cursoRepository.save(c);
    return "Saved";
  }

  @DeleteMapping(path = "/curso/eliminar")
  public @ResponseBody String deleteUser(@RequestParam Integer id) {
    Curso c = new Curso();
    c.setId(id);
    cursoRepository.delete(c);
    return "Deleted";
  }

}