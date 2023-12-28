
import java.util.ArrayList;
import java.util.List;

public class ListOfEmployees {
    private List<Employee> listOfEmployees;

    public ListOfEmployees() {
        this.listOfEmployees = new ArrayList<>();
    }

    //Метод для красивого отображения полного списка сотрудников
    public String getListOfEmployees() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Employee employee : listOfEmployees) {
            stringBuilder.append(employee);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    // Добавление нового сотрудника
    public void addEmploee(Employee emploee) {
        listOfEmployees.add(emploee);
    }

    // метод поиска сотрудника по стажу
    public ArrayList<Employee> searchByExperience(int workExperience) {
        ArrayList<Employee> searchResult = new ArrayList<>();
        for (Employee emploee : this.listOfEmployees) {
            if (emploee.getExperience() == workExperience) {
                searchResult.add(emploee);

            }
        }
        return searchResult;
    }

    // метод, возвращающий номер телефона сотрудника по имени

    public String searchByPhoneNumber(String name) {
        for (Employee employee : this.listOfEmployees) {
            if (employee.getName().equals(name)) {
                return Integer.toString(employee.getPhoneNum());

            }
        }
        return "Сотрудник не найден";
    }

    // метод поиска сотрудника по табельному номеру
    public Employee searchByServiceNumber(int serviceNumber) {
        for (Employee employee : this.listOfEmployees) {
            if (employee.getServiceNumber() == serviceNumber) {
                return employee;

            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Сотрудники: " + listOfEmployees;
    }

}