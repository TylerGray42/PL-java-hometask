package com.example;

import java.util.Arrays;
import java.util.List;
import ru.pflb.mq.dummy.implementation.*;
import ru.pflb.mq.dummy.interfaces.*;

public class App {

    public static void main(String[] args) {
        List<String> messages = Arrays.asList("Четыре", "Пять", "Шесть");

        try {
            Connection connection = new ConnectionImpl();
            connection.start();

            Session session = connection.createSession(true);

            Destination destination = session.createDestination("test");

            Producer producer = session.createProducer(destination);

            for (String message : messages) {
                producer.send(message);
                Thread.sleep(2000);
            }

            session.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Caught: " + e);
            e.printStackTrace();
        }
    }
}
