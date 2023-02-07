package rf.PruebaAcceso.dao;

import java.util.List;

import rf.PruebaAcceso.models.Employee;

public interface Employee_DAOI {
	public Employee LeerUno(int employee_id);

	public List<Employee> leerTodos();

	public int actualizar(Employee empleado);

	public int delete(Employee empleado);

	public int delete(int employee_id);

	public Employee nuevoEmployee(Employee empleado);
}
