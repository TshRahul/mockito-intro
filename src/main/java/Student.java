public class Student {

    StudentService studentService;

    Student(StudentService studentService){
        this.studentService = studentService;
    }

    int getAverageMarks(){
        return studentService.getTotalMarks() / studentService.getTotalStudents();
    }
}
