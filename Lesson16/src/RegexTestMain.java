import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexTestMain {
    public static void main(String[] args) {
        String str = "Morning arrived; the sun slowly rose above the hills. Birds sang, and the wind rustled through " +
                "the trees' leaves. Have you ever stopped to notice how beautiful this moment is? Silence, calm, " +
                "a light mist — all of it created a sense of harmony: nature seemed to pause, letting a person " +
                "enjoy this simple, yet meaningful, instant of life.";
        str = str.replaceAll("\\W+", "\n");
        System.out.println(str);

    }
}
