package test;
import com.company.TalkingBot;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TalkingBotTest {

    public TalkingBot inst;

    // assert = säkerställa
    // assert måste aktiveras i Run configurations, VM options: -ea
    // om condition inte stämmer (false), får man error när man kör, annars dyker ingenting upp

    public TalkingBotTest(String aName) {

        this.inst = new TalkingBot(aName);
        assert this.inst.botName.equals(aName)  : "Name does not match";
    }

    public void testGetGreetingMsg() {
        String msg = this.inst.getGreetingMsg();
        assert msg.equals("Hello, I am " + this.inst.botName) : "Invalid greeting message";
    }

    public void testSetRdmMood() {
        // Test if the mood is set to one of the moods in the array
        inst.setRdmMood();
        assert Arrays.asList(this.inst.moods).contains(inst.mood) : "Invalid mood set";
        System.out.println("Tested setRdmMood() without issues");
    }

    public void testSetRdmWeather() {
        // Test if the weather is set to one of the types in the array
        inst.setRdmWeather();
        assert Arrays.asList(this.inst.weatherTypes).contains(this.inst.weather): "Invalid weather set";
        System.out.println("Tested setRdmWeather() without issues");
    }

    public void testSetRdmTemperature() {
        // Test if the temperature is set to a random number between 10 and 35
        inst.setRdmTemperature();
        assert inst.temperature >= 10 && inst.temperature <= 35 : "Invalid temperature value set";
        System.out.println("Tested setRdmTemperature() without issues");
    }

    public void testSetDateTime() {
        // Test if the time is set
        inst.setDateTime();
        assert inst.dateTime.equals(LocalDateTime.now()) || inst.dateTime.isBefore(LocalDateTime.now()): "Invalid dateTime set";
        // System.out.println(inst.dateTime);
        // System.out.println(LocalDateTime.now());
        System.out.println("Tested setDateTime() without issues");
    }

    public void testSetRdmMovie() {
        // Test if movie is set to one of the movies in the array
        inst.setRdmMovie();
        assert Arrays.asList(this.inst.movies).contains(this.inst.movie) : "Invalid movie set";
        System.out.println("Tested setRdmMovie() without issues");
    }
}


