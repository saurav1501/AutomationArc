import java.text.SimpleDateFormat;
import java.util.Date;
public class TimeDiff {



	public static void main(String[] args) throws InterruptedException {

		
		//HH converts hour in 24 hours format (0-23), day calculation
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

		Date date, date1 ;
		date= new Date($date1);
		String dateStart = format.format(date);
		Thread.sleep(10000);
		date1= new Date(System.currentTimeMillis());
		String dateStop = format.format(date1);

		Date d1 = null;
		Date d2 = null;

		try {
			d1 = format.parse(dateStart);
			d2 = format.parse(dateStop);

			//in milliseconds
			long diff = d2.getTime() - d1.getTime();

			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);

			System.out.print(diffDays + " days, ");
			System.out.print(diffHours + " hours, ");
			System.out.print(diffMinutes + " minutes, ");
			System.out.print(diffSeconds + " seconds.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
