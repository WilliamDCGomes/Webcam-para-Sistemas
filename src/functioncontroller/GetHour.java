package functioncontroller;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class GetHour {
    public int informHour(){
        Calendar calendar = new GregorianCalendar();
        Date trialTime = new Date();
        calendar.setTime(trialTime);
        return calendar.get(Calendar.HOUR_OF_DAY) + calendar.get(Calendar.MINUTE) + calendar.get(Calendar.SECOND) + calendar.get(Calendar.MILLISECOND);
    }
}
