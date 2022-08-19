public class Main {
    public static void main(String[] args)
    {
        int T=20;
        String basic="";
        if(T<17)
        {
            basic="hit";

        }
        if(T>=17&&T<=21)
        {
            basic="stay";

        }
        if(T>21)
        {
            basic="bust";

        }
    }
}