package org.example;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    static Map<Integer, Boolean> statistics;

    public static void main(String[] args) {

        int doorsCount = 3;
        statistics = new HashMap<>();

        //количество игр
        for (int i = 0; i < 1000; i++) {
            round(i, doorsCount);
        }

        //статистика побед
        int win = 0;

        for (Map.Entry<Integer, Boolean> entry : statistics.entrySet()) {
            if (entry.getValue()) {
                win++;
            }
        }
        System.out.println("Игрок выиграл " + win + " раз");
    }

    private static void round(int numRound, int doorsCount) {
        Random random = new Random();
        int success = random.nextInt(doorsCount);
        int firstChoice = random.nextInt(doorsCount);
        int freeOpenDoor = -1;
        int secondChoice = -1;

        //ведущий открывает дверь, где нет приза
        for (int i = 0; i < doorsCount; i++) {
            if (i != success && i != firstChoice) {
                freeOpenDoor = i;
            }
        }

        //игрок меняет выбор
        for (int i = 0; i < doorsCount; i++) {
            if (i != freeOpenDoor && i != firstChoice) {
                secondChoice = i;
            }
        }

        //проверка выигрыша

        statistics.put(numRound, success == secondChoice);
    }
}