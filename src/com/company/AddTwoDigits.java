package com.company;

import java.util.ArrayList;
import java.util.List;

public class AddTwoDigits {
    public static void main(String[] args) {
            int n = 29;
            int sum = 0;
            List<Integer> digits = new ArrayList<>();
            while (n > 0) {
                digits.add(n % 10);
                n = n / 10;
            }
            for (int i = 0; i < digits.size(); i++) {
                sum = sum + digits.get(i);
            }

            System.out.println(sum);
        }
    }