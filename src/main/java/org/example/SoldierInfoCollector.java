package org.example;

import java.util.Scanner;

public class SoldierInfoCollector {
    Soldier collectInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String fio = scanner.nextLine();
        System.out.print("Введите категорию годности: ");
        String KatGodString = scanner.nextLine();
        char category = KatGodString.charAt(0);
        System.out.print("Введите военную специальность: ");
        String specialityString = scanner.nextLine();
        Speciality speciality = null;
        Speciality[] specialities = Speciality.values();
        for (int i=0 ; i <specialities.length; i++){
            if (specialities[i].getSpeciality().compareToIgnoreCase(specialityString)==0){
                speciality=specialities[i];
                break;
            }
        }

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        System.out.print("Введите количество детей: ");
        int children = scanner.nextInt();
        return new Soldier(age, fio, children, category, speciality);


    }
}