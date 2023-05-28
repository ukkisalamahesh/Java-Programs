import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class DifferencesBetweemDays {

	public static void main(String[] args) {
		String date =new SimpleDateFormat("yyyy_MM_dd").
				format(Calendar.getInstance().getTime());
		System.out.println(date);
				
LocalDate now = LocalDate.now();
System.out.println(now);

LocalDateTime no = LocalDateTime.now();
System.out.println(no);


LocalDateTime n1 = LocalDateTime.of(2020,5,20, 10, 20,30);
LocalDateTime n2 = LocalDateTime.of(2021,5,20, 10, 21,30);

Duration b = Duration.between(n1, n2);
System.out.println( "the number days"+b.toDays());
System.out.println(b.toHours());
System.out.println(b.toMinutes());
	}
}
