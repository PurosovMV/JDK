public class Main {
    public static void main(String[] args) {
        ListOfEmployees listOfEmployees = new ListOfEmployees();

        listOfEmployees.addEmploee(new Employee(123123, 4545, "Виктор Иванович Иванов", 5));
        listOfEmployees.addEmploee(new Employee(123124, 5657, "Виктория Александровна Захарова", 3));
        listOfEmployees.addEmploee(new Employee(123125, 9674, "Сергей Викторович Карповский", 2));
        listOfEmployees.addEmploee(new Employee(123126, 5557, "Виктория Владимировна Крючкова", 1));

        System.out.println(listOfEmployees.getListOfEmployees());
        System.out.println(listOfEmployees.searchByExperience(5));
        System.out.println();
        System.out.println(listOfEmployees.searchByPhoneNumber("Сергей Викторович Карповский"));
        System.out.println();
        System.out.println(listOfEmployees.searchByServiceNumber(123125));

    }
}