public class Radio {
    private int currentStation; //номер текущей радиостанции

    public int getCurrentStation() {
        return currentStation;
    }

    private int currentVolume; //громкость звука

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setFirstStation() {
        currentStation = 0;
    }

    public void setLastStation () {
        currentStation = 9;
    }

    public void setMaxVolume() {
        currentVolume = 100;
    }

    public void setMinVolume() {
        currentVolume = 0;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
           setFirstStation();
           return;
        }
        if (newCurrentStation > 9) {
            setLastStation();
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            setFirstStation();
        }
    }

    public void prev () {
        if (currentStation > 0) {
            currentStation = currentStation -1;
        } else {
            setLastStation();
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
//        if (currentVolume > 100) {
//            setMaxVolume();
//            return;
//        }
//        if (currentVolume < 0) {
//            setMinVolume ();
//            return;
//        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume () {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}
