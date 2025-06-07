public class Student {
    private int studentId;
    private String studentName;

    /*public Student(int studentId, String studentName){
            //this.studentId = studentId;
         //    this.studentName = studentName;

        //}*/
    public int getStudentId(){
        return studentId;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;

    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
}

class Tester {
    public static void main(String arg[]) {
        Student student = new Student();
        student.setStudentId(1);
        student.setStudentName("Janhavi");

        System.out.println("Displaying student details:");
        System.out.println("Student Id :" + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
    }
}
