// This Java program will create Student Objects from the StudentInfo class and print information about the students.
// like student name, roll number, and course.
public class StudentInfo {

    private String name;
    private String course;
    private int rolnum;
    private static int studentNo = 0;
    
    
    // set functions
    public void setName(String name){
    this.name = name;
    }
    
    public void setCourse(String course){
    this.course = course;
    }
    
    public void setRolnum(int rolnum){
    this.rolnum = rolnum;
    }
    
    // get functions
    public String getName(){
    return name;
    }
    
    public String getCourse(){
    return course;
    }

    public int getRolnum(){
    return rolnum;
    }
    
    // default constructor
    public StudentInfo(){
    name = "not set";
    course = "not specified";
    rolnum = 0;
    }
    // parameterized constructor for a new student object
    public StudentInfo(String name, String course, int rolnum){
    setName(name);
    setCourse(course);
    setRolnum(rolnum);

    }
    // copy constructor for a new student object
    public StudentInfo(StudentInfo std){
    name = std.name;
    course = std.course;
    rolnum = std.rolnum;
    }
    
    public static String getStudentNo(){
        studentNo = studentNo + 1;
        // System.out.print("Student " + studentNo);
        return "Student " + studentNo;
    }
    public void print(){
            System.out.print("--- " + StudentInfo.getStudentNo() + " ---\n");
            System.out.print("Name: " + name + "\n") ;
            System.out.print("Roll number: " + rolnum + "\n");
            System.out.print("Course: " + course + "\n");
        }
    public static void main(String args[]) {
       StudentInfo student1 = new StudentInfo("Sam", "BSCS", 012);
       student1.print();
       
       StudentInfo student2 = new StudentInfo();
       student2.print();
    }
}
