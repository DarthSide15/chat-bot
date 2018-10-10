package com.company;
import java.util.Random;
import java.time.LocalDateTime;

public class TalkingBot {

    // Class variables
    public String[] movies =        {"Inception", "Gladiator", "Star Wars: The Empire Strikes Back", "Terminator"};
    public String[] weatherTypes =  {"sunny", "cloudy", "rainy", "windy"};
    public String[] moods =         {"happy", "sad", "angry"};
    public String botName;          // Can be used in greetings
    public String mood;             // When answering to 'How are you?'
    public String weather;          // When answering to 'What's the weather like?'
    public int temperature;         // Will be randomly generated
    public LocalDateTime dateTime;  // When user asks for time
    public String movie;            // Will be randomly chosen from movies[]
    public String answer;           // The bot's answer will be stored here
    public Random random;           // Randomizer

    public TalkingBot(String aName) {
        this.botName = aName;
        random = new Random();
    }

    public String getGreetingMsg() {
        return "Hello, I am " + this.botName;
    }

    public void setRdmMood() { mood = moods[random.nextInt(3)]; }

    public void setRdmWeather(){
        weather = weatherTypes[random.nextInt(4)];
    }

    public void setRdmTemperature() {
        this.temperature = random.nextInt(26) + 10;
    }

    public void setDateTime() {
        this.dateTime = LocalDateTime.now();
    }

    public void setRdmMovie() { movie = movies[random.nextInt(4)]; }
}
