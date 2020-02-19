public class alienLang
{
    public static void main(String[] args)
    {
        blurbs(5);
    }//end of main method

    public static void blurbs(int num)
    {
        if(num > 0)
        {
           blurbs(num-1);
        }//end of if

        String whoozit = "x";
        String whatzit = "q";
        for(int i = 0; i < (int)(Math.random() * num); i++)
        {
            whoozit += "z";
        }
            System.out.print(whoozit);
        switch (num)
        {
            case 1:
                for(int i = 0; i < (int)(Math.random() * num); i++)
                {
                    whatzit += "z";
                }
            case 2:
                for(int i = 0; i < (int)(Math.random() * num); i++)
                {
                    whoozit += "d";
                }
            case 3:
                for(int i = 0; i < (int)(Math.random() * num); i++)
                {
                    whatzit += "z";
                }
            case 4:
                for(int i = 0; i < (int)(Math.random() * num); i++)
                {
                    whoozit += "d";
                }
            case 5:
                for(int i = 0; i < (int)(Math.random() * num); i++)
                {
                    whatzit += "z";
                }
            case 6:
                for(int i = 0; i < (int)(Math.random() * num); i++)
                {
                    whoozit += "d";
                }
        }// end of switch

        System.out.print(whatzit);//prints a whatzit to make a blurp
        for(int i = 0; i < (int)(Math.random() * num); i++)//extra whatzits
        {
           System.out.print(whatzit);
        }

    }//end of recursive method

}//end of alienLang class
