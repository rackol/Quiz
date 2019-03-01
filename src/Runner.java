import java.util.Scanner;
public class Runner{
    public static void main(String[] args){
        String q1="What is the best selling album of all time?\n"+"(a)Abbey Road\n(b)Thriller\n(c)roumours\n(d)The Dark side of the moon\n";
        String q2="What country has a sqare national flag?\n"+"(a)India\n(b)Turkey\n(c)Guam\n(d)Nepal\n";
        String q3="What part of the human body has 5 metacarpal bones?\n"+"(a)the foot\n(b)the hand\n(c)the chest\n(d)the hip\n";
        String q4="The song Seventy-Six Trombones first appeared in what musical play?\n"+"(a)The Sound of Music\n(b)A Chorus Line\n"+
                "(c)The Music Man\n(d)Hello Dolly\n";
        String q5="In 1952 Albert Einstein was offerd the presidency of which country?\n"+"(a)Isreal\n(b)Turkey\n(c)France\n(d)Brazil\n";
        String q6="What movie does this quote come from? 'You keep using that word. I do not think it means what you think it means.'\n"+
                "(a)The Breakfast Club\n(b)The Princess Bride\n(c)Top Gun\n(d)The God Father\n";
        String q7="What is the seventh planet from the sun?\n"+"(a)Earth\n(b)Venus\n(c)Uranus\n(d)Pluto\n";
        String q8="Which Actress has won the most Oscars?\n"+"(a)Katharine Hepburn\n(b)Natalie Portman\n(c)Meryl Streep\n(d)Audrey Hepburn\n";
        String q9="What color jersey is worn by the winners of each stage fo the Tour De France?\n"+"(a)Orange\n(b)Red polkadots\n(c)Blue\n(d)Yellow\n";
        String q10="What is Asafoetida?\n"+"(a)A type of drink\n(b)A type of mold\n(c)An exotic animal\n(d)A spice\n";

        Quiz[] questions={
                new Quiz(q1, "b"),
                new Quiz(q2, "d"),
                new Quiz(q3, "b"),
                new Quiz(q4, "c"),
                new Quiz(q5, "a"),
                new Quiz(q6, "b"),
                new Quiz(q7, "c"),
                new Quiz(q8, "a"),
                new Quiz(q9, "d"),
                new Quiz(q10, "d"),

        };
        takeIt(questions);
    }
    public static void takeIt(Quiz[] questions){
        int score=0;
        Scanner keyboardInput=new Scanner(System.in);
        for(int i=0;i<questions.length;i++){
            System.out.println(questions[i].question);
            String answer=keyboardInput.nextLine();
            if(answer.equals(questions[i].answer)){
                score++;
            }
        }
        System.out.println("You got "+score+"/"+questions.length);
        if(score<=1){
            System.out.println("Congrats! You are worse than Sammi");
        }else if(score>=9){
            System.out.println("You definitely cheated!");
        }else{
            System.out.println("Congrats, You finished!");
        }
    }
}