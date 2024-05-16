package pro.sky.skyprospringstyulkovhw28;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

public interface EmployeeService {

    Employee add(String firstName, String lastName);
    Employee remove(String firstName, String lastName);
    Employee find(String firstName, String lastName);
    Collection<Employee> findAll();
}
