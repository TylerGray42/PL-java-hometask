package com.example;

import java.io.RandomAccessFile;
import ru.pflb.mq.dummy.implementation.*;
import ru.pflb.mq.dummy.interfaces.*;

public class App {

    public static void main(String[] args) {
        String filePath = "src/main/resources/messages.dat";

        if (args.length > 0) {
            filePath = args[0];
        }

        try {
            Connection connection = new ConnectionImpl();
            connection.start();

            Session session = connection.createSession(true);

            Destination destination = session.createDestination("test");

            Producer producer = session.createProducer(destination);

            RandomAccessFile file = new RandomAccessFile(filePath, "r");

            String line;

            while (true) {
                while ((line = file.readLine()) != null) {
                    producer.send(line);
                    Thread.sleep(2000);
                }
                file.seek(0);
            }
            // session.close();
            // connection.close();
        } catch (Exception e) {
            System.out.println("Caught: " + e);
            e.printStackTrace();
        }
    }
}
