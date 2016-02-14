import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

/**
 * Created by al on 14.02.2016.
 */
@Local
@Stateful
public class InfoBean {

    private String someStr = "Stateful bean data";

    public String getSomeStr() {
        return someStr;
    }

    public void setSomeStr(String someStr) {
        this.someStr = someStr;
    }
}
