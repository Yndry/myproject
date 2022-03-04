package javadeveloperigor.obgectClass;

import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Terminal;

import java.util.List;

public class TestAiroport {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();

        List<Terminal> list = airport.getTerminals();
        for (Terminal terminal : list) {
            System.out.println(terminal);
        }

        List<Aircraft> list2 = airport.getAllAircrafts();
//        for (Aircraft aircraft : list2) {
//            System.out.println(aircraft);
//        }
        System.out.println(list2.size());

    }
}
