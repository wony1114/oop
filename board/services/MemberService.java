package board.services;
import board.domains.MemberDTO;
import board.domains.StudentDTO;
import board.domains.TeacherDTO;
public interface MemberService {
   public void resisterMember(MemberDTO member);
   public void resisterTeacher(TeacherDTO teacher);
   public void modifyMember(MemberDTO member);
   public void removeMember(MemberDTO member); 
   public StudentDTO login(StudentDTO student);
   public TeacherDTO access(TeacherDTO teacher);
   public StudentDTO[] fetchStudentList();
   public StudentDTO fetchStudentDetail(String userId);
   public int sum(StudentDTO student);
   public float avg(int sum);
   public boolean existId(String userId);
}
