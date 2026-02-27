class College {
    private String collegeName;
    private int totalStudents;

    // Constructor to initialize values
    College(String collegeName, int totalStudents) {
        this.collegeName = collegeName;
        this.totalStudents = totalStudents;
    }

    // Getter for collegeName
    public String getCollegeName() {
        return collegeName;
    }

    // Getter for totalStudents
    public int getTotalStudents() {
        return totalStudents;
    }
}

public class Collegeclass{
    public static void main(String[] args) {

        // Creating object using constructor
        College college = new College("ABC Engineering College", 1200);

        // Accessing values using getters
        System.out.println("College Name: " + college.getCollegeName());
        System.out.println("Total Students: " + college.getTotalStudents());
    }
}