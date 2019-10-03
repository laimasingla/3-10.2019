
  
package com.cg.ibs.cardmanagement.ui;

import java.util.*;

import com.cg.ibs.cardmanagement.service.CustomerServiceImpl;

import java.io.*;

enum CardMenu{

 APPLY,UPGRADE,RESET,QUIT

}

public class CardManagementui

{

    

    

    

    public static void main(String args []){
    	Scanner scan=new Scanner(System.in);
        CardManagementui obj = new CardManagementui();


       

         CustomerServiceImpl  customService=new CustomerServiceImpl();
    

        CardMenu choice=null;

        while(choice!=CardMenu.QUIT){

            System.out.println("Welcome to card management System");

            System.out.println("Enter 1 to login as a customer");

            System.out.println("Enter 2 to login as a bank admin");

            int userInput=scan.nextInt();
            
            

            if(userInput==1){

               

               
				

                System.out.println("Choice");

                choice=scan.nextInt();

                 

                 switch(choice){

                     case APPLY:

                     

                     case UPGRADE:

                     

                     case RESET:

                     

                     case QUIT:

            }

            if(userInput==2){

              

            }

            

            

            

        }
        }}}
        

        

      


