package jhon.livroSpring.BibliotecaSpring.modelUser;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String cpf;
    private UserType userType;

    public User(UserDTO userDTO){
        this.nome = userDTO.nome();
        this.email = userDTO.email();
        this.cpf = userDTO.cpf();
        this.userType = userDTO.userType();
    }

}
