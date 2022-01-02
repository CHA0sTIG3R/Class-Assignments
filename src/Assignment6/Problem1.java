package Assignment6;
import java.util.Scanner;

import Assignment5.Account;

public class Problem1 {
    public static void main(String[] args) {
        boolean bool = true;
        String menu = "\nMain menu"+"\n"+
        "1: check balance"+"\n"+
        "2: withdraw"+"\n"+
        "3: deposit"+"\n"+
        "4: exit"+"\n";
        int choice, id;
        Account [] acc = new Account[]{
            new Account(0,100), new Account(1,100),
            new Account(2,100), new Account(3,100),
            new Account(4,100), new Account(5,100),
            new Account(6,100), new Account(7,100),
            new Account(8,100), new Account(9,100)};

            Scanner input = new Scanner(System.in);
            System.out.print("Enter an id: ");
            id = input.nextInt();
            for (int i = 4; i > 0; i--){
                if (id >= 0 && id <= 9){
                    break;
                }
                else{
                    System.out.println("Warning Incorrect ID you have "+i+" more tries");
                    System.out.print("Enter an id: ");
                    id = input.nextInt();
                }
            }

            if (id >= 0 && id <= 9){
                System.out.println(menu);
                while (bool){
                    System.out.print("Enter a choice: ");
                    choice = input.nextInt();
                    if (choice == 4){
                        bool = false;
                    }
                    if(choice == 1){
                        System.out.println("The balance is "+acc[id].getBalance());
                        System.out.println(menu);
                    }
                    if(choice == 2){
                        System.out.print("Enter amount to withdraw: ");
                        acc[id].withdraw(input.nextInt());
                        System.out.println(menu);
                    }
                    if(choice == 3){
                        System.out.print("Enter amount to deposit: ");
                        acc[id].deposit(input.nextInt());
                        System.out.println(menu);
                    }
                }
                input.close();
            }
            else{
                System.out.println("The System is Shutting Down");
            }
            
    }
}
