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
		array = student.addMark(12, 10, 5, 8, 5);

		float res = student.everegeVal(array);

	}
}
