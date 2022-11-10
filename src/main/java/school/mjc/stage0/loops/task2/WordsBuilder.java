package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int i = 0;
        String sent = "";
        while(i < chars.length) {
            sent = sent+chars[i];
            i++;
        }
        System.out.print(sent);
    }
}
