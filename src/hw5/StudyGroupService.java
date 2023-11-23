package hw5;

import java.util.List;

public class StudyGroupService {

    public StudyGroupModel studyGroupModel = new StudyGroupModel();

    public StudyGroupModel createStudyGroup(Integer numberGroup, TeacherModel teacherModel, List<StudentModel> studentModels) {
        studyGroupModel.setNumberGroup(numberGroup);
        studyGroupModel.setTeacherModel(teacherModel);
        studyGroupModel.setStudents(studentModels);
        return studyGroupModel;
    }

}

