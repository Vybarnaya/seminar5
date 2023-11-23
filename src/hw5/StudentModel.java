package hw5;

public class StudentModel {

    private Integer studentID;

    private String nameStudent;

    private String secondNameStudent;

    public StudentModel(Integer studentID, String nameStudent, String secondNameStudent) {
        this.studentID = studentID;
        this.nameStudent = nameStudent;
        this.secondNameStudent = secondNameStudent;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getSecondNameStudent() {
        return secondNameStudent;
    }

    public void setSecondNameStudent(String secondNameStudent) {
        this.secondNameStudent = secondNameStudent;
    }

    public String toString() {
        return "Ученик № " + getStudentID() + ";  фамилия, имя  " + getSecondNameStudent() +"  " + getNameStudent();
    }
}
