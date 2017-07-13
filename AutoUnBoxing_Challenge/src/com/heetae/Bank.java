package com.heetae;

import java.util.ArrayList;

/**
 * Created by hsMacbook on 2017. 7. 9..
 */

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch (String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomer (String branchName, String customer, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customer, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction (String branchName, String customer, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addTransaction(customer, amount);
        }
        return false;
    }


    private Branch findBranch (String branchName) {
       for (int i = 0; i < branches.size(); i++) {
          Branch branch = this.branches.get(i);
          if (branch.getName().equals(branchName)) {
                    return branch;
                }
            }
            return null;
        }

    public boolean listCustomers (String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();

            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j) + "\n");
                    }
                }
            }
            return true;
        } else {
        return false;
        }
    }

}







