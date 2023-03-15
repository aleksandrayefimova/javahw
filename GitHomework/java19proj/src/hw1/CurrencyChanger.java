package hw1;

import java.util.Scanner;

public class CurrencyChanger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float valueToConvert = scanner.nextFloat();
        ToUsd(valueToConvert);
    }
    public static void ToUsd(float toExchange){
        float exchangedValue = toExchange * 1.07f;
        System.out.println(exchangedValue);
    }
}
