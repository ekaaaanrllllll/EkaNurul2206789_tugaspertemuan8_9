public class Test {
    public static void main(String[] args) {
        Person person = new Person("Eka Nurul", "Jl.Setiabudi 119B", 
                "0813-1936-2861", "ekaaanrll@154.upi.edu");
       
        Student student = new Student("Philooo", "Secapa",
                "0857-2173-6024", "philo@email.com", Student.SENIOR);
      
        MyDate dateHired = new MyDate(2020, 5, 15);
        
        Employee employee = new Employee("Apning", "Brocoli BBS", 
                "555-555-1111", "ningg@email.com", "B-301", 500000, dateHired);
        
        Faculty faculty = new Faculty("Prof. Hafnie", "Jalan-in", 
                "555-555-2222", "hafniee@email.com", "S-202", 7500000, dateHired,
                10, "Professor");
       
        Staff staff = new Staff("Tatang", "Ciwaruga", 
                "1111-2222-3333", "tatang@email.com", "C-303", 4500000, dateHired, 
                "Manager");

        System.out.println(person);
        System.out.println();
        System.out.println(student);
        System.out.println();
        System.out.println(employee);
        System.out.println();
        System.out.println(faculty);
        System.out.println();
        System.out.println(staff);
    }
}
