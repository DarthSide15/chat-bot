package com.company;
import test.TalkingBotTest;

public class Program {

    public static void main (String[] args) {

        TalkingBotTest bot = new TalkingBotTest("Siri");
        bot.testSetRdmMood();
        bot.testSetRdmWeather();
        bot.testSetRdmTemperature();
        bot.testSetDateTime();
        bot.testSetRdmMovie();
    }
}
