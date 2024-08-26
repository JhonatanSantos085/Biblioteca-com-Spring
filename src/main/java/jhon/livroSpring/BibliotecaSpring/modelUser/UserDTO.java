package jhon.livroSpring.BibliotecaSpring.modelUser;

public record UserDTO(
        String nome,
        String email,
        String cpf,
        UserType userType
) {
}
