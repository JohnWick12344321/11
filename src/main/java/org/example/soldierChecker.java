package org.example;

public class soldierChecker {
    public boolean check(Soldier soldier) {
        if (soldier.age > 18 && soldier.age < 30 && soldier.Children < 3 && soldier.category == 'A' && (soldier.speciality == Speciality.SVYAZIST || soldier.speciality == Speciality.SNIPER || soldier.speciality == Speciality.TANKIST)) {
            System.out.println("Вы попадаете в первый эшелон");
            return true;

        } else if (soldier.age > 18 && soldier.age <= 45 && (soldier.Children == 3 || soldier.Children < 4 && soldier.category == 'B' || soldier.category == 'A' && soldier.speciality == Speciality.TEXNIK || soldier.speciality == Speciality.VODITEL)) {
            System.out.println("Вы попадаете во второй эешелон");
            return true;

        } else if (soldier.age >= 60 || soldier.category == 'D') {
            System.out.println("Вы не подходите");
            return true;
        } else {
            System.out.println("Вы попадаете в третий эшелон");
            return false;
        }
    }
}