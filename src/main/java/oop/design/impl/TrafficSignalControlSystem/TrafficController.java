package oop.design.impl.TrafficSignalControlSystem;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TrafficController {
    private static TrafficController instance;
    private final List<Road> roads;

    private boolean halt;

    private TrafficController() {
        roads = new LinkedList<>();
        halt = false;
    }

    public static synchronized TrafficController getInstance() {
        if (instance == null) {
            instance = new TrafficController();
        }
        return instance;
    }

    public void addRoad(Road road) {
        roads.add(road);
    }

    public void removeRoad(String roadId) {
        roads.remove(roadId);
    }

    public void startTrafficControl() {
        while (!halt) {
            for (Road road : roads) {
                TrafficLight trafficLight = road.getTrafficLight();
                try {
                    trafficLight.changeSignal(Signal.GREEN);
                    System.out.println(road.getName() + " is " + Signal.GREEN);
                    Thread.sleep(trafficLight.getGreenDuration());
                    trafficLight.changeSignal(Signal.YELLOW);
                    System.out.println(road.getName() + " is " + Signal.YELLOW);
                    Thread.sleep(trafficLight.getYellowDuration());
                    trafficLight.changeSignal(Signal.RED);
                    System.out.println(road.getName() + " is " + Signal.RED);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void startTrafficControlOld() {
        if (halt) {
            System.out.println("Stopping normal flow for emergency");
        }
        for (Road road : roads) {
            TrafficLight trafficLight = road.getTrafficLight();
            new Thread(() -> {
                while (true) {
                    try {
                        Thread.sleep(trafficLight.getRedDuration());
                        trafficLight.changeSignal(Signal.GREEN);
                        System.out.println(road.getName() +" is "+ Signal.GREEN);
                        Thread.sleep(trafficLight.getGreenDuration());
                        trafficLight.changeSignal(Signal.YELLOW);
                        System.out.println(road.getName() +" is "+ Signal.YELLOW);
                        Thread.sleep(trafficLight.getYellowDuration());
                        trafficLight.changeSignal(Signal.RED);
                        System.out.println(road.getName() +" is "+ Signal.RED);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    public void handleEmergency(String roadId) throws InterruptedException {
        Road road = roads.stream().filter(road1 -> road1.getId() == roadId).findFirst().get();
        System.out.println("Handling emergency for "+ road.getName());
        halt = true;
        TrafficLight trafficLight = road.getTrafficLight();
        trafficLight.changeSignal(Signal.GREEN);
        System.out.println(road.getName() + " is " + Signal.GREEN);
        Thread.sleep(trafficLight.getGreenDuration());
        trafficLight.changeSignal(Signal.YELLOW);
        System.out.println(road.getName() + " is " + Signal.YELLOW);
        Thread.sleep(trafficLight.getYellowDuration());
        trafficLight.changeSignal(Signal.RED);
        System.out.println(road.getName() + " is " + Signal.RED);
        Thread.sleep(1000);
        halt = false;
        startTrafficControl();
    }
}
