package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {

    public static Long getLongFromConsole(String description){
        Long toReturn = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(description);
            toReturn = Long.parseLong(br.readLine());
        } catch(NumberFormatException nfe) {
            return getLongFromConsole(description);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return toReturn;

    }
}
