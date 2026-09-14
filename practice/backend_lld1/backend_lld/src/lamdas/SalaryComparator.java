package lamdas;

public class SalaryComparator implements java.util.Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getSalary().compareTo(e2.getSalary());
    }

}
