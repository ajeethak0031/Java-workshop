

public class wordcount {
     public static void main(String[] args) {
        String sentence="this program show how can we split a string into multipls strings.we need find sentence ,word and lette count" ;
        String[]words = sentence.split(" ");
        int wordcount = words.length;
        System.out.println(wordcount);
        String sen[] = sentence.split("");
        int sentenceCount=sen.length;
        System.out.println(sentenceCount);
        String letter[] = sentence.split("\\.");
        int letterCount=letter.length;
        System.out.println(letterCount);


}
}