package hw5;

import java.util.List;

public class Controller {

    private StudyGroupService studyGroupService;

    //private StudentGroupView studentGroupView;

    public Controller() {
        studyGroupService = new StudyGroupService();

    }
    public StudyGroupModel createFullGroup(Integer numberGroup, TeacherModel teacherModel, List<StudentModel> studentModels) {
        return studyGroupService.createStudyGroup(numberGroup, teacherModel, studentModels);
    }

}

