package Composite.Departments;

public class DemoAppComposite {

    public static void main(String args[]) {
        Department salesDepartment = new SalesDepartment(1, "Sales department");
        Department financialDepartment = new FinancialDepartment(2, "Financial department");

        HeadDepartment headDepartment = new HeadDepartment(3, "Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        System.out.println("Print names of departments:");
        headDepartment.printDepartmentName();
    }
}

/* РЕЗУЛЬТАТ (консоль):

Print names of departments:
SalesDepartment
FinancialDepartment

 */