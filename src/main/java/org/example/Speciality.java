package org.example;

public enum Speciality {
    TANKIST("танкист"),
    SNIPER("снайпер"),
    SVYAZIST("связист"),
    VODITEL ("водитель "),
    TEXNIK("техник");

    String speciality;
    String getSpeciality(){
        return speciality;
    }


    Speciality(String speciality) {
        this.speciality = speciality;
    }
}