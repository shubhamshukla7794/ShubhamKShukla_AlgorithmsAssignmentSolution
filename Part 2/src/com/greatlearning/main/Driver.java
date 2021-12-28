package com.greatlearning.main;

import com.greatlearning.service.DisplayService;
import com.greatlearning.service.SearchService;
import com.greatlearning.service.SortService;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        SearchService searchService = new  SearchService();
        SortService sortService = new SortService();
        DisplayService displayService = new DisplayService();

        Scanner input = new Scanner(System.in);
        int noOfCompanies, choice;

        System.out.println(" enter the no of companies");
        noOfCompanies = input.nextInt();

        double[] sharePrice =  new double[noOfCompanies];
        boolean[] comparedPrice = new boolean[noOfCompanies];

        for (int i = 0; i < noOfCompanies; i++) {
            System.out.println(" Enter current stock price of the company " + (i+1));
            sharePrice[i] = input.nextDouble();
            System.out.println(" Whether company's stock price rose today compare to yesterday?");
            comparedPrice[i] = input.nextBoolean();
        }

        sortService.sortSharePrice(sharePrice);

        do {
            System.out.println();
            System.out.println("-----------------------------------------------");
            System.out.println("Enter the operation that you want to perform");
            System.out.println(" 1. Display the companies stock prices in ascending order");
            System.out.println(" 2. Display the companies stock prices in descending order");
            System.out.println(" 3. Display the total no of companies for which stock prices rose today");
            System.out.println(" 4. Display the total no of companies for which stock prices declined today");
            System.out.println(" 5. Search a specific stock price");
            System.out.println(" 6. press 0 to exit");
            System.out.println("-----------------------------------------------");
            choice = input.nextInt();

            switch (choice){
                case 0 :
                    break;
                case 1 :
                    displayService.displaySharePriceInAscendingOrder(sharePrice);
                    break;
                case 2 :
                    displayService.displaySharePriceInDescendingOrder(sharePrice);
                    break;
                case 3 :
                    searchService.displayNoOfCompanyRoseToday(comparedPrice);
                    break;
                case 4 :
                    searchService.displayNoOfCompanyFellToday(comparedPrice);
                    break;
                case 5 :
                    System.out.println("enter the key value");
                    double key = input.nextDouble();
                    searchService.searchKeyValue(sharePrice, key);
                    break;
                default:
                    System.out.println("enter a valid option");
                    break;
            }

        }while (choice!=0);

        System.out.println("Exited successfully");
        input.close();

    }

}
