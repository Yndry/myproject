package golovach_coyrses.Lekciya10;

import java.util.Arrays;

public class ConnectionManager {
    public static void main(String[] args) {
        Connection [] x = new Connection[5];
        for(int i = 0; i<x.length; i++) {
            x[i] = Connection.newConnection();

        }

        System.out.print(Arrays.toString(x));
    }
}

class Connection {
    private Connection() {
        System.out.print("Hi");

    }
    public static Connection newConnection() {
     return new Connection();
    }

}
