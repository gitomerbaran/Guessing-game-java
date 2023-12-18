/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package babugameJava;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ömer
 */
public class Babu {
    int i;
     int newpoint = 0;
     int newpointA=0;
    public int secim;
    public void menu(){
        Scanner input = new Scanner(System.in);
        for(i=0;i<10000;i++){
        System.out.println("**|Welcome to ''BABU GAME''|***"); 
        System.out.println("---------------------------------------");
        System.out.println("1. Number Guessing Game");
        System.out.println("2. Alphabetic Guessing Game");
        System.out.println("3. Points");
            System.out.println("4. Credits");
         System.out.println("5. Exit.");
        
         secim = input.nextInt();
         
    
       switch(secim){
           case 1: Num();
           break;
           case 2: Alphabetic();
           break;
           case 3 : Points();
           break;
           case 4 : Credit();
           case 5: i=10001;
           break;
           default: System.out.println("You entered a different value. Try again.");
           
           
       }

        }
    }
    
    
    public void Alphabetic(){
        
        
     
       Scanner input=new Scanner(System.in);
        
        int chooseA;
        int pointA=0;
       
     
      for(int x=0;x<10000;x++) { 
          
   
          
           
       
           
         
           
                System.out.println("You will try to guess the correct letter");
                System.out.println("1- 3 chances to find \t 2- 5 chances to find\t 3- Return Menu");
            
                chooseA=input.nextInt();
             
           
                if(chooseA==1){
                    Random r = new Random();
     char c = (char)(r.nextInt(26)+'a');
     
                System.out.println("We can start now! You have 3 chances to get it right."); 
                System.out.println("You get 10 points if you guess the correct letter on the first guess, and 5 points on the second guess.");
               
                int j=0;
                char guessA = 0;
                while(j<3){
                    System.out.println("Enter to Guess: ");
                    
                    guessA= input.next().charAt(0);
                  
                    if(guessA==c && j==0){
                        j=3;
                        System.out.println("Congratulations!Found it on your first try");
                        System.out.println(" You earned 10 points");
                        System.out.println("-----------------------");
                        pointA+=10;
                         newpointA=pointA;
                    }
                  
                     
                    else if(guessA==c && j!=0){
                        j=3;
                        System.out.println("Congratulations!Found it");
                        System.out.println(" You earned 5 points");
                        System.out.println("-----------------------");
                        pointA+=5;
                         newpointA=pointA;
                    }
                  
                  
                    else{
                        System.out.println("Sorry not the right answer try again\n-------------------------");
                    } 
                    
               
                 
                    j++;
            }
                if(!(guessA==c)){
                    System.out.println("Sorry you didn't guess the letter correctly :( ");
                    System.out.println("The correct letter :"+c);
                    System.out.println("------------------------");
                    
                }
                
                }
               
               
                else if(chooseA==2){
                    System.out.println("We can start now! You have 5 chances to get it right.");
                    
                     Random r = new Random();
     char c = (char)(r.nextInt(26)+'a');
                    
                     int j=0;
                char guessA='0';
                while(j<5){
                    System.out.println("Enter to Guess: ");
                    
                    guessA=input.next().charAt(0);
                  
                    if(guessA==c && j==0){
                        j=5;
                        System.out.println("Congratulations!Found it on your first try");
                        System.out.println(" You earned 10 points");
                        System.out.println("------------------------");
                        pointA+=10;
                         newpointA=pointA;
                    }
                  
                     
                      else if(guessA==c && j!=0){
                        j=3;
                        System.out.println("Congratulations!Found it");
                        System.out.println(" You earned 5 points");
                        System.out.println("-----------------------");
                        pointA+=5;
                         newpointA=pointA;
                    }
                       else{
                        System.out.println("Sorry not the right answer try again\n-------------------------");
                    }
                         
               
                    j++;
            }
                if(!(guessA==c)){
                    System.out.println("Sorry you didn't guess the letter correctly :( ");
                    System.out.println("The correct letter :"+c);
                    System.out.println("------------------------");
                    
                }
                    
                }
                 else if(chooseA==3){
                i=10001; 
                  menu();
                  return;
                   
                   
                }
                
        
           
           
          
          
          
                if(chooseA!=1 && chooseA!=2 && chooseA!=3 ){
                   System.out.println("You made the wrong choice");
                   
                   
                   }
        
        
        
    }
    
    }
    
    
    
    
    
    
    
    
    
   
    public void Num(){
    Scanner input=new Scanner(System.in);
        
        int choose;
        int point=0;
        newpoint = 0;
     
      for(int x=0;x<10000;x++) { 
          
   
          
           
       
           
         
           
                System.out.println("Is it between 1-10 or 1-100? Choose number ");
                System.out.println("1 Between 1-10 \t 2 Between 1-100\t 3 Return Menu");
            
                choose=input.nextInt();
             
           
                if(choose==1){
                System.out.println("We can start now! You have been given a number from 1-10 and you have 2 chances to get it right.");
                System.out.println("You get 10 points if you guess the correct number on the first guess, and 5 points on the second guess.");
                Random random=new Random();
                int randomnumber=random.nextInt(10)+1;
                int i=0;
                int guess=0;
                while(i<2){
                    System.out.println("Enter to Guess: ");
                    
                    guess=input.nextInt();
                  
                    if(guess==randomnumber && i==0){
                        i=2;
                        System.out.println("Congratulations!Found it on your first try");
                        System.out.println(" You earned 10 points");
                        System.out.println("-----------------------");
                        point+=10;
                         newpoint=point;
                    }
                  
                      else if(guess<randomnumber){
                            System.out.println("Less than the correct number");
                            }
                      else if(guess>randomnumber){
                          System.out.println("Greater than the correct number");
                      }
                    else if(guess==randomnumber){
                            i=2;
                            System.out.println("Congratulations!Found it on your second try");
                            System.out.println("You earned 5 points");
                            System.out.println("-----------------------");
                            point+=5;
                             newpoint=point;
                            }
                   
                           
                    
               
                 
                    i++;
            }
                if(guess!=randomnumber){
                    System.out.println("Sorry you didn't guess the number correctly :( ");
                    System.out.println("The correct number :"+randomnumber);
                    System.out.println("------------------------");
                    
                }
                
                }
               
               
                else if(choose==2){
                    System.out.println("We can start now! You have been given a number from 1-100 and you have 5 chances to get it right.");
                    
                    Random random=new Random();
                    int randomnumber=((random.nextInt(100)+1));
                    
                     int i=0;
                int guess=0;
                while(i<5){
                    System.out.println("Enter to Guess: ");
                    
                    guess=input.nextInt();
                  
                    if(guess==randomnumber && i<3){
                        i=5;
                        System.out.println("Congratulations!Found it on your first try");
                        System.out.println(" You earned 10 points");
                        System.out.println("------------------------");
                        point+=10;
                         newpoint=point;
                    }
                  
                      else if(guess<randomnumber){
                            System.out.println("Less than the correct number");
                            }
                      else if(guess>randomnumber){
                          System.out.println("Greater than the correct number");
                      }
                    else if(guess==randomnumber && i>2){
                            i=5;
                            System.out.println("Congratulations!Found it on your second try");
                            System.out.println("You earned 5 points");
                            System.out.println("------------------------");
                            point+=5;
                             newpoint=point;
                            }
                       
               
                    i++;
            }
                if(guess!=randomnumber){
                    System.out.println("Sorry you didn't guess the number correctly :( ");
                    System.out.println("The correct number :"+randomnumber);
                    System.out.println("------------------------");
                    
                }
                    
                }
                 else if(choose==3){
                i=10001; 
                  menu();
                  return;
                   
                   
                }
                
        
           
           
          
          
          
                if(choose!=1 && choose!=2 && choose!=3 ){
                   System.out.println("You made the wrong choice");
                   
                   
                   }
              
          
      
          
    }
   
    
      
        }
    
    
    
    public void Points(){
        Scanner input = new Scanner(System.in);
        System.out.println("Number Guessing earned from games: "+newpoint);
        System.out.println("Alphabetic Guessing earned from games: "+newpointA);
        System.out.println("Total points earned from all games: "+(newpointA+newpoint));
        System.out.println("3-Return Menu");
        
        int choosep=input.nextInt();
         if(choosep==3){
                i=10001; 
                  menu();
                  return;
                   
                   
                }
        
    }
    
    public void Credit(){
        Scanner input = new Scanner(System.in);
        System.out.println("Omer Berkay Baran...\nStudent Id:*******\n----------------------");
        System.out.println("3-Return Menu");
        
         int choosep=input.nextInt();
         if(choosep==3){
                i=10001; 
                  menu();
                  return;
                   
                   
                }
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
   }