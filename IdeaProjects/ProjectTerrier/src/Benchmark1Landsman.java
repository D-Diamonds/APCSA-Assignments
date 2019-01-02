class Benchmark1Landsman
{
    public static void main(String[] args)
    {
        // switch Charizard and Jigglypuff
        String s1 = "My favorite Pokemon has always been Jigglypuff. I mean, what's not to " +
                "like? Jigglypuff is a large, orange, dragon-like Pokemon. When Jigglypuff " +
                "gets angry, it breathes fire. Which isn't so bad, unless your name is Ash. " +
                "On the other hand, my least-favorite Pokemon is probably Charizard. As we " +
                "all know, Charizard is a round, pink pokemon. Charizard's only redeeming quality " +
                "is its singing voice, which isn't even that impressive considering it puts " +
                "everyone to sleep. Very disappointing indeed.";

        // switch worst and best
        String s2 = "The Philadelphia Flyers are the worst hockey team in the NHL. Of " +
                "all teams in the Metropolitan division, they are the worst to support. Their " +
                "new mascot, Gritty, is the worst in the league. On the other hand, the best " +
                "team is the New Jersey Devils. They play in the best stadium, and their " +
                "mascot, the New Jersey Devil, is obviously \"creative\" and best in " +
                "the league.";

        String swap1 = "Jigglypuff";
        String swap2 = "Charizard";


        // Change s1, swap1, swap2 variables.
        System.out.println(wordSwap(s1, swap1, swap2));


    } // main(String[])


    public static String wordSwap(String text, String current, String change)
    {

        /*
            Basically this determines if the index in the array contains the current word or change word and swaps them
            the + str[i].substring adds on any punctuation at that index
         */
        String result = "";
        String[] str = text.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (str[i].contains(current))
                str[i] = change + str[i].substring(current.length());
            else if (str[i].contains(change))
                str[i] = current + str[i].substring(change.length());
            result += str[i] + " ";

        }
        return  result;
    } // wordSwap(String, String, String)

} // Benchmark1