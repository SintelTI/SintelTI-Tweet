import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 * Author: Benek
 * Date: 07/08/13
 * Time: 21:44
 * www.javamexico.org
 */
public class SendTweet {

    public static void main(String[] args) {
        String mensaje = "twitter4j test";
        Twitter twitter = TwitterFactory.getSingleton();
        try {
            Status status = twitter.updateStatus(mensaje);
        } catch (TwitterException e) {
            e.printStackTrace();
        }
    }

}
