/* program to generate random passowrd which include numbers, lowerCase letters, upperCase letter, special characters and the length will be 
given by user  */
import java.util.Scanner;
import java.util.Random;

public class task4 {
    //creating a String function named as passwordGenerator
    public static String passwordGenerator(int length, boolean includeNumbers, boolean includeLowercase, boolean includeUppercase, boolean includeSpecialChars){
        String numbers = "0123456789";
        String lowerCaseLetter = "abcdefghijklmnopqrstuvwxyz";
        String upperCaseLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialCharacter = "!@#$%^&*()+=<>?";
        
        
        StringBuilder characterSet = new StringBuilder(); // creating an mutable string variable using StringBuilder class
        Random random = new Random();

        if(includeNumbers){
            characterSet.append(numbers);
        }

        if(includeLowercase){
            characterSet.append(lowerCaseLetter);

        }

        if(includeUppercase){
            characterSet.append(upperCaseLetter);

        }

        if(includeSpecialChars){
            characterSet.append(specialCharacter);

        }

        //exception case, if the choice for charcters is null , default value would be lowerCase

        if(characterSet.length() == 0){
            characterSet.append(includeLowercase);

        }

        StringBuilder password = new StringBuilder();
        for(int i = 0; i < length; i++){
            int index = random.nextInt(characterSet.length());
            password.append(characterSet.charAt(index));

        }
        
        return password.toString();


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the Desired length for the password !");
        int length = sc.nextInt();


        System.out.println("Do you want to add number in your password ?  : true/false");
        boolean includeNumbers = sc.nextBoolean();

        System.out.println("Do you want to add lowercase in your password ? : true/false");
        boolean includeLowercase = sc.nextBoolean();

        System.out.println("Do you want to add UPPER Case letter in your password ? : true/false");
        boolean includeUppercase = sc.nextBoolean();

        System.out.println("Do you want to add special Character in your password ? : true/false");
        boolean includeSpecialChars = sc.nextBoolean();


        String password = passwordGenerator(length, includeNumbers, includeLowercase, includeUppercase, includeSpecialChars);
        System.out.println("Generated Password : " + password);


        sc.close();


        
    }
    

    
        
    }
    
        
    

    
