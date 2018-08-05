import com.ximu.google.authenticator.core.DynamicToken;
import com.ximu.google.authenticator.core.IntervalEnum;
import com.ximu.google.authenticator.core.TokenHelper;

/**
 * Created by leon on 2018/8/6.
 */
public class TokenTest {

    public static void main(String... args) {
        try {
            DynamicToken token = new DynamicToken("hello", IntervalEnum.INTERVAL_HALF);
            TokenHelper helper = new TokenHelper();
            System.out.println(helper.getToken(token));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
