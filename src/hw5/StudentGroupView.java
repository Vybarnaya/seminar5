package hw5;

import java.util.List;
public class StudentGroupView {

    public void showStudyGroup(Integer numberGroup, TeacherModel teacherModel, List<StudentModel> studentModels){
    System.out.println(" Учебная группа № " + numberGroup );
        System.out.println("Учитель " + teacherModel.getNameTeacher()+" " + teacherModel.getSecondNameTeacher()+",  (ID) " + teacherModel.getTeacherID());
        System.out.println("Список  учеников: " );
        for(StudentModel  item: studentModels) {
            System.out.println("Ученик: ID  " + item.getStudentID() + ", ФИО " + item.getSecondNameStudent() + " " + item.getNameStudent());
        }

    }
    public void showListId(Integer numberGroup, TeacherModel teacherModel, List<StudentModel> studentModels) {
        System.out.println("Учитель (ID " + teacherModel.getTeacherID() + ") группы № " + numberGroup);
        System.out.println("Список ID учеников");
        for (StudentModel item : studentModels) {
            System.out.println("Ученик " + item.getStudentID());

        }
    }
}

