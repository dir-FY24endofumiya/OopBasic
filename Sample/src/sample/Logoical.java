package sample;

public class Logoical {

    public static void main(String[] args) {
        int score = 59; //成績
        
        System.out.println("scoreが４０以上、かつ５０以下");
        System.out.println(score >= 40 && 50 >= score);
        
        System.out.println("scoreが４０以下、または５０以上");
        System.out.println(score <= 40 || 50 <= score);
        
        System.out.println("scoreが６０以上でない");
        System.out.println(! ( score >= 60 ) );

    }

}
