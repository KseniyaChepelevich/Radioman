package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int setCurrentRadioStation(int currentRadioStation) {

        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }

        if (currentRadioStation < 0) {
            currentRadioStation = 0;
        }

        if (currentRadioStation > 0) {
            this.currentRadioStation = currentRadioStation;
        }

        this.currentRadioStation = currentRadioStation;


        return currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
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
         else {
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
