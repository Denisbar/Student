/**
 * Created by Denis on 04.09.2016.
 */
public class Student
{
	protected int exams;

	public Student(int exams)
	{
		this.exams = exams; // количество экзаменов
	}

	public int[] addMark(int mark1, int mark2, int mark3, int mark4, int mark5) //добавляем оценку
	{
		int[] arr = {mark1, mark2, mark3, mark4, mark5};
		return arr;
	}

	public float everegeVal(int[] array)
	{
		int sum = 0;
		int count = 0;
		for (int i = 0; i < array.length; i++)
		{
			sum += array[i];
			count++;
		}
		float result = (float) sum / count;
		return result;
	}

}
