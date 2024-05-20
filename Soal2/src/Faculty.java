public class Faculty extends Employee {
    private int officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, 
            String email, String office, double salary, MyDate dateHired, 
            int officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty:\n" +
                super.toString() + "\n" +
                "Office Hours: " + officeHours + "\n" +
                "Rank: " + rank;
    }
}
