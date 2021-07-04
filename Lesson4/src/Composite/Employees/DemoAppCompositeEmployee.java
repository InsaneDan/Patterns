package Composite.Employees;
// https://www.tutorialspoint.com/design_pattern/composite_pattern.htm


public class DemoAppCompositeEmployee {

    static Employee CEO;

    public static void main(String[] args) {

        // генеральный директор (от него начинается построение дерева подчиненных)
        Employee CEO = new Employee("James", "CEO", 1001);
        // начальники отделов
        Employee headSales = new Employee("Lucas", "Head Sales", 20000);
        Employee headMarketing = new Employee("Henry", "Head Financial", 20000);
        // добавляем подчиненных генерального директора
        CEO.add(headSales);
        CEO.add(headMarketing);

        // сотрудники финансового отдела
        Employee finance1 = new Employee("Noah", "Financial", 10000);
        Employee finance2 = new Employee("Oliver", "Financial", 10000);
        // добавляем подчиненных начальнику финансового отдела
        headMarketing.add(finance1);
        headMarketing.add(finance2);

        // сотрудники отдела продаж
        Employee salesExecutive1 = new Employee("Elijah", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Benjamin", "Sales", 10000);
        // добавляем подчиненных начальнику отдела продаж
        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

    }

    private void PrintEmployees() {
        // напечатать список сотрудников
        System.out.println(CEO);

        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }



}