import java.util.ArrayList;

/**
 * Created by Denis on 04.09.2016.
 */
public class Student
{
	protected int exams;
	private ArrayList<Integer> mMarks;

	public Student(int exams)
	{
		this.exams = exams; // количество экзаменов
		mMarks = new ArrayList<>();
	}

	public void addMark(int mark) //добавляем оценку
	{
		mMarks.add(mark);
	}

	public float everegeVal()
	{
		int sum = 0;
		int count = 0;
		for (int i = 0; i < mMarks.size(); i++)
		{
			sum += mMarks.get(i);
			count++;
		}
		float result = (float) sum / count;
		return result;
	}

}
