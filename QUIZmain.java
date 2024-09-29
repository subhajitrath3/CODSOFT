package internship;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class QUIZmain {
    public static void getquestion() {
        String arr[] = new String[5];
        arr[0] = "Is this program working ?";
        arr[1] = "Am I going to finish this within 2 days ?";
        arr[2] = "Is the timer working ? ";
        arr[3] = "What is 2+2 ?";
        arr[4] = "Is 2+2 and 2 X 2 same ?";
        String ans[] = new String[5];
        ans[0] = " 1. NO\n 2. YES \n 3. MAYBE \n 4. NONE OF THE ABOVE";
        ans[1] = " 1. NO\n 2. YES \n 3. MAYBE \n 4. TUM SE NA HO PAYEGA";
        ans[2] = " 1. NO \n 2. YES \n 3. CANT YOU SEE \n 4. NOT INTERESTED";
        ans[3] = " 1. 26 \n 2. 69 \n 3. 345 \n 4. NONE OF THE ABOVE";
        ans[4] = " 1. NO \n 2. YES \n 3. PATA NAHI \n 4. NOT SAME";
        System.out.println("Can you answer these question within 15 seconds !!!");
        int arr1[] = new int[5];
        arr1[0] = 1;
        arr1[1] = 4;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 2;
        int ans1[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int score = 0;
        for (int i = 0; i < 5;) {
            System.out.println();
            for (int k = 0; k < 30; k++) {
                System.out.print("=");
            }
            System.out.println();
            System.out.println("Question number " + (i + 1) + ".");
            System.out.println();
            System.out.println(arr[i]);
            System.out.println();
            System.out.println(ans[i]);
            System.out.println();

            System.out.println("Answer for Question " + (i + 1));
            boolean answered = false;
            ans1[i] = -1;

            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                int c = 15;

                @Override

                public void run() {
                    if (c > 0) {
                        System.out.println(c + " Seconds");
                        c--;
                    }

                    else if (c == 0) {
                        System.out.println("Times up !!");
                        timer.cancel();

                    }
                }

            };

            timer.scheduleAtFixedRate(task, 0, 1000);

            boolean correct = false;
            while (!correct) {
                try {
                    String input = sc.next();
                    int number = Integer.parseInt(input);
                    ans1[i] = number;
                    correct = true;
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                }
            }
            if ((ans1[i] < 5 && ans1[i] > 0) || (ans1[i] == -1)) {
                answered = true;
                timer.cancel();
                if (arr1[i] == ans1[i]) {
                    score++;
                    i++;
                } else if (arr1[i] != ans1[i]) {
                    i++;
                } else if (ans1[i] == -1) {
                    i++;
                }

            } else {
                for (int o = 0; o < 20; o++) {
                    System.out.print("~");
                }
                System.out.println();
                System.out.println("Ohh oh!! \nInvalid Option !! Try again ");
                for (int o = 0; o < 20; o++) {
                    System.out.print("~");
                }
                while (!answered) {
                    if (ans1[i] < 5 && ans1[i] > 0) {
                        answered = true;
                        i++;
                        timer.cancel();
                    } else {
                        System.out.println("Ohh oh!! \nInvalid Option !! Try again ");
                        ans1[i] = sc.nextInt();
                    }
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("The correct answers were :");
        for (int j = 0; j < 5; j++) {

            System.out.println("Question numeber " + (j + 1) + "\nCorrect Answer was :" + arr1[j]);
            System.out.println();
        }
        System.out.println();
        System.out.println("Your number of correct answer was :" + score + " out of 5");
    }

    public static void main(String[] args) {
        getquestion();
    }
}
