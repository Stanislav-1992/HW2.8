package pro.sky.skyprospringstyulkovhw28;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.logging.Logger;

@RestController
@RequestMapping("/employee")

public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController (EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/add")
    public Employee add (@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.add (firstName, lastName);
    }
    @GetMapping("/remove")
    public Employee remove (@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.remove (firstName, lastName);
    }
    @GetMapping("/find")
    public Employee find (@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.find (firstName, lastName);
    }

    @GetMapping
    public Collection<Employee> findAll() {
        return employeeService.findAll();
    }
}

