public class Radio {
    private int lastStation = 9;
    private int firstStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentStation = firstStation; //номер текущей радиостанции
    private int currentVolume = minVolume; //громкость звука

    public Radio() {
        this.lastStation = lastStation;
    }

    public Radio(int countStation) {
        lastStation = countStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < firstStation) {
            currentStation = firstStation;
            return;
        }
        if (newCurrentStation > lastStation) {
            currentStation = lastStation;
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        currentVolume = newCurrentVolume;
    }

    public void next() {
        if (currentStation < lastStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = firstStation;
        }
    }

    public void prev() {
        if (currentStation > firstStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = lastStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

}
