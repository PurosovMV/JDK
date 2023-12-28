public class Employee {
    private int serviceNumber;
    private int phoneNum;
    private String name;
    private int experience;

    public Employee(int serviceNumber, int phoneNum, String name, int experience) {
        this.serviceNumber = serviceNumber;
        this.phoneNum = phoneNum;
        this.name = name;
        this.experience = experience;
    }

    public int getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(int serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Сотрудник: " + name + ", Табельный номер: " + serviceNumber + ", Номер телефона: " + phoneNum
                + ", Стаж: "
                + experience + " лет";
    }

}
