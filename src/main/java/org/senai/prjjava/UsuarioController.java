package org.senai.prjjava;

import org.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


//Import org.springframework.stereotype.Controller;
//Import org.springframework.web.bind.annotation.RequestMapping;
//http;//localhost:8080/api/usuario/add?nome=Pedro&email=pedro.o.sousa
@Controller
@RequestMapping(path = "/api/usuario")
@CrossOrigin("*")

public class UsuarioController {

    @Autowired
    UsuarioRepository uRepository;

    @PostMapping("/add")
    public @ResponseBody String AddUsuario(
        @RequestParam
        String nome,
        @RequestParam String email
    ){
       Usuario objU = new Usuario();
       objU.setNome(nome);
       objU.setEmail(email);
       uRepository.save(objU); 
        return "Salvo";
        
    }
    @GetMapping("/all")
    public @ResponseBody Iterable<Usuario> buscarusuario(){
        return uRepository.findAll();
    }    
}
