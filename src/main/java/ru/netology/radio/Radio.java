package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Radio {
    private int currentStation;
    private int currentVolume;
    private int numberStations;

    public Radio(int currentStation, int currentVolume, int numberStations) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.numberStations = numberStations;
    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public int getNumberStations() {
        return this.numberStations;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > numberStations - 1) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setNumberStations(int numberStations) {
        this.numberStations = numberStations;
    }

    public void next() {
        if (currentStation < numberStations - 1) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = numberStations - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ru.netology.radio.Radio)) {
            return false;
        } else {
            ru.netology.radio.Radio other = (ru.netology.radio.Radio) o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getCurrentStation() != other.getCurrentStation()) {
                return false;
            } else if (this.getCurrentVolume() != other.getCurrentVolume()) {
                return false;
            } else {
                return this.getNumberStations() == other.getNumberStations();
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof ru.netology.radio.Radio;
    }

    public int hashCode() {
        int PRIME = true;
        int result = 1;
        result = result * 59 + this.getCurrentStation();
        result = result * 59 + this.getCurrentVolume();
        result = result * 59 + this.getNumberStations();
        return result;
    }

    public String toString() {
        int var10000 = this.getCurrentStation();
        return "Radio(currentStation=" + var10000 + ", currentVolume=" + this.getCurrentVolume() + ", numberStations=" + this.getNumberStations() + ")";
    }

    public Radio() {
        this.numberStations = 10;
    }

    public Radio(int numberStations) {
        this.numberStations = numberStations;
    }
}

