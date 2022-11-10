package org.senai.prjjava;


//import org.springframework.boot.autoconfigure.domain.EntityScan;
@Entity
//@EntityScan
public class Usuario {

    @Id
    @GeneratedValue(strategy=Generated.AUTO)

    private Integer id;
    private String nome;
    private String email;

    //@Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   

   
    
    
}
