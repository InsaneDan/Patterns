package Composite.Employees;
// https://www.tutorialspoint.com/design_pattern/composite_pattern.htm


public class DemoAppCompositeEmployee {

    public static void main(String[] args) {

        // генеральный директор (от него начинается построение дерева подчиненных)
        Employee CEO = new Employee("James", "CEO", 1001);
        // начальники отделов
        Employee headFinancial = new Employee("Henry", "Head Financial", 1101);
        Employee headSales = new Employee("Lucas", "Head Sales", 1102);
        // добавляем подчиненных генерального директора
        CEO.add(headFinancial);
        CEO.add(headSales);

        // сотрудники финансового отдела
        Employee finance1 = new Employee("Noah", "Financial", 1111);
        Employee finance2 = new Employee("Oliver", "Financial", 1112);
        // добавляем подчиненных начальнику финансового отдела
        headFinancial.add(finance1);
        headFinancial.add(finance2);

        // сотрудники отдела продаж
        Employee sales1 = new Employee("Elijah", "Sales", 1113);
        Employee sales2 = new Employee("Benjamin", "Sales", 1114);
        // добавляем подчиненных начальнику отдела продаж
        headSales.add(sales1);
        headSales.add(sales2);

        PrintEmployees(CEO);
    }

    private static void PrintEmployees(Employee rootEmployee) {
        // напечатать список сотрудников
        System.out.println(rootEmployee);

        for (Employee headEmployee : rootEmployee.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }



}

/* РЕЗУЛЬТАТ (консоль):

Employee name: James, department: CEO, ID: 1001]
Employee name: Henry, department: Head Financial, ID: 1101]
Employee name: Noah, department: Financial, ID: 1111]
Employee name: Oliver, department: Financial, ID: 1112]
Employee name: Lucas, department: Head Sales, ID: 1102]
Employee name: Elijah, department: Sales, ID: 1113]
Employee name: Benjamin, department: Sales, ID: 1114]

*/