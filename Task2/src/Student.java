import java.util.ArrayList;

class Student extends Person {
    private int numCourses = 0;
    private ArrayList<String> courses = new ArrayList<>();
    private ArrayList<Integer> grades = new ArrayList<>();

    Student(String name, String address){
        super(name , address);
    }

    public void addCourseGrade(String course, int grade){
        if (!courses.contains(course)) {
            courses.add(course);
            grades.add(grade);
            numCourses += numCourses;
        }
    }

    public void printGrades(){
        for(int i=0; i< grades.size(); i++){
            System.out.println(courses.get(i) + " : " + grades.get(i));
        }
    }

    public double getAverageGrade(){
        int sum = 0;
        for(int i = 0; i < grades.size(); i++)
            sum += grades.get(i);
        return sum / grades.size();
    }  

    @Override
    public String toString() {
        return String.format("Student: %s(%s)", getName(), getAddress());
    }
}
