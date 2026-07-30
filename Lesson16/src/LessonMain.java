public class LessonMain {
    public static void main(String[] args) {
        //why we need regular expressions?
        String info = "Milk: 256, butter: 321, cookie: 54, chocolate: 32";

//        int price1 = Integer.parseInt(info.substring(info.indexOf(' '), info.indexOf(',')).trim());
//
//        String temp = info.substring(info.indexOf(','), info.lastIndexOf(',')).trim();
//
//        int price2 = Integer.parseInt(temp.substring(temp.lastIndexOf(' ')).trim());
//        int price3 = Integer.parseInt(info.substring(info.lastIndexOf(' ')).trim());
        //this is the reason!!

        info = info.replaceAll("\\D+", " ").trim();
        String[] split = info.split("\\s");
        int sum = 0;
        for(String s : split){
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);
        // \\s replace spaces
        // \\d replace digits
        // \\w replace words and digits but only on English
        // \\S replace everything but not spaces
        // \\D replace everything but not digits
        // \\W replace everything but not numbers and words only on English
        // [А-я]
        // *
        // +
        // ?
        // {3}
        // .+
    }
}
