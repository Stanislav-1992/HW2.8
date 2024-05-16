package pro.sky.skyprospringstyulkovhw28;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class InvalidEmployeeDataExeption extends RuntimeException{
    public InvalidEmployeeDataExeption(String message) {
        super(message);
    }
}
