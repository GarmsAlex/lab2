import java.io.*;
import java.net.*;
import java.rmi.registry.*;
import java.util.Locale;

public class Client {
    public static void main(String args[])throws Exception{
        System.out.println("Хочешь увидеть подарок? \n ДА - подарок \n НЕТ - ну как знаешь...");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String input = reader.readLine();
        IServer s;

        Registry re = LocateRegistry.getRegistry();
        s = (IServer)re.lookup("server");
        if(input.toLowerCase(Locale.ROOT).equals("да")) System.out.println(s.letGoodOut());
        else if(input.toLowerCase(Locale.ROOT).equals("нет")) System.out.println(s.letBadOut());
        else System.out.println("Загрузка...Загрузка...Загрузка...(только да или нет)");

    }
}