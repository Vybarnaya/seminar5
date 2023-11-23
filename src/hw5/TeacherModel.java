package hw5;

public class TeacherModel {

    private Integer teacherID;

    private String nameTeacher;

    private String secondNameTeacher;


    public TeacherModel(Integer teacherID, String nameTeacher, String secondNameTeacher) {
        this.teacherID = teacherID;
        this.nameTeacher = nameTeacher;
        this.secondNameTeacher = secondNameTeacher;
    }

    public Integer getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getSecondNameTeacher() {
        return secondNameTeacher;
    }

    public void setSecondNameTeacher(String secondNameTeacher) {
        this.secondNameTeacher = secondNameTeacher;
    }

    public String toString() {
        return "Учитель №  " + getTeacherID() + "; " + getNameTeacher() +" " + getSecondNameTeacher();
    }
}
