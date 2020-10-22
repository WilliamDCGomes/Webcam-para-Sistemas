package functioncontroller;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author willi
 */
public class GetDate {
    public String dateOfSystem(){
        Date data = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String formatedDate = format.format(data);
        return formatedDate;
    }
}