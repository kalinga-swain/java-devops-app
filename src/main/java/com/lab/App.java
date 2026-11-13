
package com.lab;

public class App {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" Welcome to Java DevOps Lab!");
        System.out.println("=================================");

        System.out.println("Application : java-devops-app");
        System.out.println("Environment : " +
            System.getenv().getOrDefault("APP_ENV", "development"));

        System.out.println("Version     : 1.0.0");
        System.out.println("Status      : Running successfully!");
    }
}

