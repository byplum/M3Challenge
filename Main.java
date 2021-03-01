import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("How many people are there in their household?");
    int numPeople = kb.nextInt();
    ArrayList<Person> people = new ArrayList<Person>();
    for(int i =0; i < numPeople; i++){
      System.out.println("How old is person " + (i + 1) + "?");
      int age = kb.nextInt();
      System.out.println("Are they a student (true/false)");
      boolean stu = kb.nextBoolean();
      System.out.println("Are they a teacher (true/false)");
      boolean tea = kb.nextBoolean();
      Person per = new Person(age, stu, tea);
      people.add(per);
    }

    double sum = 0.0;
    for(Person p : people)
    {
      if(p.getAge() >= 65)
      {
        sum += 15.555;
      }
      else if(p.getAge() >= 50)
      {
        sum += 20.74;
      }
      else if(p.getAge() >= 35)
      {
        sum += 25.925;
      }
      else
      {
        sum += 31.11;
      }
      if(p.getIsStudent() || p.getIsTeacher())
      {
        sum += 2.5;
      }
    }

    System.out.println("The minimum bandwidth for this household is " + sum + "Mbps.");
    
  }
}

  
