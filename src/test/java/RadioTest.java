import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RadioTest {

    private int numberStations;

    @Test
    public void ShouldSetVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        int expected = 8;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotSetVolumeAboveMax () {
        Radio radio = new Radio();
        radio.setCurrentVolume(1000);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotSetVolumeBelowMin () {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        int expected = 7;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetNextStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetPrevStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetMinStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    public void ShouldSetMaxStation () {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotSetStationAboveMax () {
        Radio radio = new Radio();
        radio.setCurrentStation(15);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotSetStationBelowMin () {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldIncreaseVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldDecreaseVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();
        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotIncreaseVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotDecreaseVolume () {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();
        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetNumberStations () {
        Radio radio = new Radio(30);
        this.numberStations = numberStations;
    }

}
