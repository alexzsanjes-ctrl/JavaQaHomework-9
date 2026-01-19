import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRadio {

    @Test
    public void shouldSetLastStation() {
        Radio wave = new Radio();

        wave.setLastStation();

        int expected = 9;
        int actual = wave.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetFirstStation() {
        Radio wave = new Radio();

        wave.setFirstStation();

        int expected = 0;
        int actual = wave.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAfterLastStation() {
        Radio wave = new Radio();

        wave.setCurrentStation(10);

        int expected = 9;
        int actual = wave.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBeforeFirstStation() {
        Radio wave = new Radio();

        wave.setCurrentStation(-1);

        int expected = 0;
        int actual = wave.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextAccessStation() {
        Radio wave = new Radio();

        wave.setCurrentStation(5);
        wave.next();

        int expected = 6;
        int actual = wave.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchAfterLastStation() {
        Radio wave = new Radio();

        wave.setLastStation();
        wave.next();

        int expected = 0;
        int actual = wave.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchBeforeLastStation() {
        Radio wave = new Radio();

        wave.setLastStation();
        wave.prev();

        int expected = 8;
        int actual = wave.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchBeforeFirstStation() {
        Radio wave = new Radio();

        wave.setFirstStation();
        wave.prev();

        int expected = 9;
        int actual = wave.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(99);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio volume = new Radio();

        volume.setMaxVolume();
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(1);
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeBelowMin() {
        Radio volume = new Radio();

        volume.setMinVolume();
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}