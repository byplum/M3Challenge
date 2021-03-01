public class Person
{
  private int age;
  private boolean isStudent; 
  private boolean isTeacher;
  // List<Integer> ... = new ArrayList<Integer>();
  public Person(int a, boolean isStu, boolean isTea)
  {
    age = a;
    isStudent = isStu;
    isTeacher = isTea;
  }

  public int getAge()
  {
    return age;
  }

  public boolean getIsStudent()
  {
    return isStudent;
  }

  public boolean getIsTeacher()
  {
    return isTeacher;
  }
}
