package generic_Utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {

	public int getRandomNumbers() {

		Random r = new Random();
		int num = r.nextInt();
		return num;
	}

	public String getDataFromCalender() {
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
		String modifiedDate = sdf.format(d);
		return modifiedDate;
	}
}

