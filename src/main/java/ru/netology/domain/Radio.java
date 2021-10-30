package ru.netology.domain;

public class Radio {
    public int currentRadioStation;

    public int setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            currentRadioStation = 9;
        }
        if (newCurrentRadioStation > 9) {
            currentRadioStation = 0;
        }
        if (newCurrentRadioStation > 0 && newCurrentRadioStation < 9) {
            currentRadioStation = newCurrentRadioStation;
        }

        return currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int currentVolume;

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }



    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            currentVolume = currentVolume;
        }

    }

    public void reducerVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            currentVolume = currentVolume;
        }
    }

    public void increaseRadioStation() {

        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }
    }

    public void reducerRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
    }














}
