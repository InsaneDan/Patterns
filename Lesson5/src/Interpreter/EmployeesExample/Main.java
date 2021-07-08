package Interpreter.EmployeesExample;

import Interpreter.EmployeesExample.expressions.Expression;
import Interpreter.EmployeesExample.expressions.ExpressionParser;

public class Main {

	public static void main(String[] args) {
		Engineer ajay = new Engineer(1001L, "Ajay", "Developer", Department.ENGINEERING, 75000);
		Engineer vijay = new Engineer(1002L, "Vijay", "Sr. Developer", Department.ENGINEERING, 90000);
		Engineer jay = new Engineer(1003L, "Jay", "Lead", Department.ENGINEERING, 100000);
		Engineer martin = new Engineer(1004L, "Martin", "QA", Department.ENGINEERING, 70000);
		Manager kim = new Manager(1005L, "Kim", "Manager", Department.ENGINEERING, 110000);
		Engineer andersen = new Engineer(1006L, "Andersen", "Developer", Department.ENGINEERING, 95000);
		Manager niels = new Manager(1007L, "Niels", "Sr. Manager", Department.ENGINEERING, 140000);
		Engineer robert = new Engineer(1008L, "Robert", "Developer", Department.ENGINEERING, 85000);
		Manager rachelle = new Manager(1009L, "Rachelle", "Product Manager", Department.ENGINEERING, 150000);
		Engineer shailesh = new Engineer(1010L, "Shailesh", "Engineer", Department.ENGINEERING, 80000);

		kim.manages(ajay);
		kim.manages(martin);
		kim.manages(vijay);

		niels.manages(jay);
		niels.manages(andersen);
		niels.manages(shailesh);

		rachelle.manages(kim);
		rachelle.manages(robert);
		rachelle.manages(niels);

		String contextString = "Designation:manager, Department:engineering, Manages:martin, Salary:110000";
		Expression expression = ExpressionParser.parseExpression(contextString);
		System.out.println("contextString= " + contextString);
		System.out.println();
		System.out.println(kim);
		System.out.printf("For '%s', %s: %s.\n", kim.getEmployeeName(), expression, expression.interpret(kim));

		System.out.println("=======================================================================\n");
		contextString = "Designation:developer, Department:engineering, salary:<85000";
		expression = ExpressionParser.parseExpression(contextString);
		System.out.println("contextString= " + contextString);
		System.out.println();
		System.out.println(ajay);
		System.out.printf("For '%s', %s: %s.\n", ajay.getEmployeeName(), expression, expression.interpret(ajay));
		System.out.println();
		System.out.println(andersen);
		System.out.printf("For '%s', %s: %s.\n", andersen.getEmployeeName(), expression,
				expression.interpret(andersen));
	}

}

/* РЕЗУЛЬТАТ:

*/
