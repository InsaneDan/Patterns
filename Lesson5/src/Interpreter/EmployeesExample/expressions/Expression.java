package Interpreter.EmployeesExample.expressions;

import Interpreter.EmployeesExample.Employee;

public interface Expression {
	
	public boolean interpret(Employee context);
}
