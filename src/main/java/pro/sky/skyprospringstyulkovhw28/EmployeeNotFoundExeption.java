package pro.sky.skyprospringstyulkovhw28;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class EmployeeNotFoundExeption extends RuntimeException {
    public EmployeeNotFoundExeption() {
        super("Сотрудник не найден");
    }
}