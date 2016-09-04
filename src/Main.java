import java.util.ArrayList;

/**
 * Created by Denis on 04.09.2016.
 */
public class Main
{
	public static void main(String[] args)
	{
		Student student = new Student(5);
		int arrayLength = student.exams;
		int[] array = new int[arrayLength];
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(5));
		students.get(0).addMark(12);
		students.get(0).addMark(10);
		students.get(0).addMark(8);
		System.out.println(students.get(0).everegeVal());
	}
}
