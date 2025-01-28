package VII;

class UniversityMember {
    void role() {
        System.out.println("General university member.");
    }

    public void display() {
    }
}

class Student extends UniversityMember {
    @Override
    void role() {
        System.out.println("Students attend lectures.");
    }
}

class Professor extends UniversityMember {
    @Override
    void role() {
        System.out.println("Professors teach classes.");
    }
}

public class UniversityRoles {
    public static void main(String[] args) {
        UniversityMember student = new Student();
        UniversityMember professor = new Professor();
        student.role();
        professor.role();
    }
}
