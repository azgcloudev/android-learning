package com.example.introtooop;

public class IntroToOOP {

    public static void main(String[] args) {
        Microphone microphone = new Microphone(); // creates an object microphone of type: class Microphone

        microphone.color = "Blue";
        microphone.name = "Blue Yeti";
        microphone.model = 133456;

        System.out.println(microphone.model);

        Microphone gHMic = new Microphone();
        gHMic.name = "GH";

        microphone.turnOn();
        microphone.setVolume();
        System.out.println(microphone.showDescription());
        microphone.turnOff();

        gHMic.turnOn();
    }
}