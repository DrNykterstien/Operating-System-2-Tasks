import java.util.ArrayList;

class Teacher extends Person {
    private int numCourses = 0;
    private ArrayList<String> courses = new ArrayList<>();
    
    Teacher(String name , String address){
        super(name , address);
    }

    public boolean addCourse(String course){
        if (courses.contains(course)) return false;
        courses.add(course);
        numCourses += numCourses;
        return true;
    }

    public boolean removeCourse(String course){
        int courseIndex = courses.indexOf(course);
        if (!(courseIndex >= 0)) return false;
        courses.remove(courseIndex);
        numCourses -= numCourses;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Teacher: %s(%s)", getName(), getAddress());
    }
}
