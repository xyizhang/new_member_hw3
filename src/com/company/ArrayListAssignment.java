package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAssignment {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter numbers. \"stop\" to stop.");
        ArrayList<Integer> input = new ArrayList<Integer>();
        ArrayList<Integer> output = new ArrayList<Integer>();

        while (true){
            String in = scanner.nextLine();
            try {
                input.add(Integer.parseInt(in));
            }catch (NumberFormatException e){
                if(in.equals("stop")){
                    break;
                }
            }
        }
        for(int i = 0; i < input.size(); i++){
            if(input.get(i) > 0){
                output.add(i);
            }
        }
        System.out.println(output.toString());
    }
}
