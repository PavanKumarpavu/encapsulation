package encapsulation;

public class main extends student
{

	public static void main(String[] args)
	{
		
			student s = new student();
			s.setId("abc123");
			System.out.println(s.getId());
			
			
			s.setMarks(75.0);
			System.out.println(s.getMarks());
    }


}


