package pro.sky.skyprospringstyulkovhw28;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.groupingBy;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    private final EmployeeService employeeService;

    public DepartmentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public Employee findEmployeeWithMinSalary(int departmentId) {
        return employeeService.findAll().stream()
                .filter(employee -> employee.getDepartmentId() == departmentId)
                .min(comparingInt(Employee :: getSalary))
                .orElseThrow(EmployeeNotFoundExeption :: new);
    }

    @Override
    public Employee findEmployeeWithMaxSalary(int departmentId) {
        return employeeService.findAll().stream()
                .filter(employee -> employee.getDepartmentId() == departmentId)
                .max(comparingInt(Employee :: getSalary))
                .orElseThrow(EmployeeNotFoundExeption :: new);
    }

    @Override
    public Collection<Employee> findEmployeesByDepartment(int departmentId) {
        return employeeService.findAll().stream()
                .filter(employee -> employee.getDepartmentId() == departmentId)
                .collect(Collectors.toList());
    }

    @Override
    public Map<Integer, List<Employee>> findEmployeesByDepartment() {
        return employeeService.findAll().stream()
                .collect(groupingBy(Employee :: getDepartmentId));
    }
}
