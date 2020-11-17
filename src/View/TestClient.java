package View;
import Model.API.*;
import Model.API.Character;
import Model.TestMainHero;

public class TestClient {

   public static void main()
   {

       TestMainHero tm=new TestMainHero();


   }



    public void showAllStates(Character c)
    {

        for (String key : c.getLevel_1_attributes().keySet()) {

            System.out.println(key+": "+c.getLevel_1_attributes().get(key));
        }

        for (String key : c.getLevel_2_attributes().keySet()) {

            System.out.println(key+": "+c.getLevel_2_attributes().get(key));
        }

        for (String key : c.getLevel_2_attributes().keySet()) {

            System.out.println(key+": "+c.getLevel_2_attributes().get(key));
        }

        for (String key : c.getLevel_2_attributes().keySet()) {

            System.out.println(key+": "+c.getLevel_2_attributes().get(key));
        }


    }
}
