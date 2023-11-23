package hw5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentModel studentModel1 = new StudentModel(12,"Ivan", "Petrov");
        StudentModel studentModel2 = new StudentModel(22,"Anna", "Nicolaeva");
        StudentModel studentModel3 = new StudentModel(232,"Egor", "Sidorov");
        StudentModel studentModel4 = new StudentModel(78,"Natalya","Smirnova");
        StudentModel studentModel5 = new StudentModel(92,"Pavel", "Ivanov");
        StudentModel studentModel6 = new StudentModel(58,"Ivan", "Lobasenko");

        TeacherModel teacherModel1 = new TeacherModel(123,"Anna","Ivanovna");
        TeacherModel teacherModel2 = new TeacherModel(985,"Nicolay","Ivanovich");

        List<StudentModel> studens1 = new ArrayList<>();
        studens1.add(0,studentModel1);
        studens1.add(1,studentModel2);
        studens1.add(2,studentModel3);

        List<StudentModel> studens2 = new ArrayList<>();
        studens2.add(0,studentModel4);
        studens2.add(1,studentModel5);
        studens2.add(2,studentModel6);

        Controller controller1 = new Controller();
        Controller controller2 = new Controller();

        controller1.createFullGroup(1,teacherModel1,studens1);
        controller2.createFullGroup(2,teacherModel2,studens2);

        StudentGroupView studentGroupView1 = new StudentGroupView();
        StudentGroupView studentGroupView2 = new StudentGroupView();

        studentGroupView1.showStudyGroup(1,teacherModel1,studens1);
        System.out.println();
        studentGroupView2.showStudyGroup(2,teacherModel2,studens2);
        System.out.println();

        studentGroupView1.showListId(1,teacherModel1,studens1);
        System.out.println();
        studentGroupView2.showListId(2,teacherModel2,studens2);


//        Controller controller1 = new Controller();
//        Controller controller2 = new Controller();

//        StudyGroupModel studyGroupModel1 = controller1.createFullGroup(1,teacherModel1,studens1);
//        StudyGroupModel studyGroupModel2 = controller2.createFullGroup(2,teacherModel2,studens2);

//        System.out.println(studyGroupModel1);
//        System.out.println(studyGroupModel2);
//
//        System.out.println();

//        System.out.println(" Учебная группа № " + studyGroupModel1.getNumberGroup());
//        System.out.println( studyGroupModel1.getTeacherModel());
//        System.out.println("Список  учеников" );
//        for(StudentModel  item: studens1){
//            System.out.println("Ученик № " + item.getStudentID()+" " + item.getSecondNameStudent()+" " + item.getNameStudent());
//
//        }
//        System.out.println();
//
//        System.out.println(" Учебная группа № " + studyGroupModel2.getNumberGroup());
//        System.out.println( studyGroupModel2.getTeacherModel());
//        System.out.println("Список  учеников" );
//        for(StudentModel  item: studens2){
//            System.out.println("Ученик № " + item.getStudentID()+" " + item.getSecondNameStudent()+" " + item.getNameStudent());
//
//        }
//
//
//        System.out.println();

//        System.out.println("Учитель " + studyGroupModel1.getTeacherModel().getTeacherID()+ " группы № " + studyGroupModel1.getNumberGroup());
//        System.out.println("Список ID учеников" );
//        for(StudentModel  item: studens1){
//            System.out.println("Ученик " + item.getStudentID());
//
//        }
//        System.out.println();
//
//        System.out.println("Учитель  " +  studyGroupModel2.getTeacherModel().getTeacherID() + " группы № " + studyGroupModel2.getNumberGroup());
//        System.out.println("Список ID учеников" );
//        for(StudentModel  item: studens2){
//            System.out.println("Ученик " + item.getStudentID());
//
//        }
    }
}
