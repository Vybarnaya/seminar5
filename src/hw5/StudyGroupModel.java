package hw5;

import java.util.List;

public class StudyGroupModel {

    private Integer numberGroup;

    private TeacherModel teacherModel;


    private List<StudentModel> students;

//    public StudyGroupModel(Integer number, TeacherModel teacherModel, List<StudentModel> studentModels) {
//        this.numberGroup = numberGroup;
//        this.teacherModel = this.teacherModel;
//        this.students = students;
//    }

    public StudyGroupModel() {

    }

    public Integer getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(Integer numberGroup) {
        this.numberGroup = numberGroup;
    }

    public TeacherModel getTeacherModel() {
        return teacherModel;
    }

    public void setTeacherModel(TeacherModel teacherModel) {
        this.teacherModel = teacherModel;
    }

    public List<StudentModel> getStudents() {
        return students;
    }

    public void setStudents(List<StudentModel> students) {
        this.students = students;
    }

    public String toString() {
        return "Учебная группа № " + getNumberGroup()+ " "+ getTeacherModel() + ", список учеников " + getStudents();
    }
}
