import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) throws JsonProcessingException{
        ObjectMapper objectMapper = new ObjectMapper();

        User userObject = new User("Danylo","Sydorchuk","+48123123123","danylo.sydorchuk@microsoft.wsei.edu.pl", 13309);
        String userJson = objectMapper.writeValueAsString(userObject);

        System.out.println(userJson);
    }
}
