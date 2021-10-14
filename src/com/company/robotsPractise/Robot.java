package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;


//named class will always be default export
public class Robot {
    /// Creates default Constructor // Blueprint //

    String name = "";
    String color = "";
    int age = 0;
    String job = "";
    boolean running = false;
    String workGroup ="";
    Robot next;

    //this constructor function runs right away
    public Robot(String name, String color, int age) {
        /// creates overloaded Constructor, with stuff passed into it

        this.name = name;
        this.color = color;
        this.age = age;
        this.job = "Jobless";
        this.workGroup ="None Assigned";

//        this.greet();  Cant put great here bc all subclasses are Robots first then become something else
        // this would greet as jobless, put greet when subclass is made
    }


// Getters and Setters

    public void setAge(int age){
        this.age = age;
        System.out.println("Age has been updated to "  + this.age);

    }

    public void initRobot(String job, String workGroup){
        this.job = job;
        this.workGroup = workGroup;
        this.greet();
    }
    public Integer getAge(){
        return this.age;
    }


    public void setJob(String job){
        this.job = job;
        System.out.println("Job has been updated to "  + this.job);

    }
    public String getJob(){
        return this.job;
    }

    public boolean getRunningStatus(){
        return this.running;
    }

    public void start() {

        if (this.running) {
            System.out.println(this.job + " is Already working... Would you like to stop it? Scanner");
        } else {
            System.out.println("Starting..." + this.job + " " + this.name);
            this.running = true;
        }

    }

    public void stop() {

        if (!this.running) {
            System.out.println(this.job + " is not running... Would you like to start it? Scanner");
        } else {
            System.out.println("Stopping..." + this.job + " " + this.name);
            this.running = false;
        }
    }

    public void greet(){
        System.out.println("New " + this.job + " Robot detected: " + this.name + " Workgroup: " + this.workGroup);
    }


    // Literally the MAIN method the program runs this first

    // since that method is static i dont have to say tom. or something else
    // methods can be ran without making a version of said class
    // calling getrollercount class method



//        System.out.println(Tom.count);  Count is private inside of roller. Must use getter I
//        System.out.println(Roller.count);
    //  System.out.println(Roller.getCount()); need to use getter for best practice // can create reusable get count

//        System.out.println(Rob.count); // Bender objects can track there count as well
//        System.out.println(Bender.getCount());

    //
//
    public static void main(String[] args) {

        //  Roller Sam = new Roller("sam","red",1,"First");
//        Roller Tom = new Roller("tom","red",1,"First");
        Bender Rob = new Bender("rob", "red", 2, "second");

        ///  type [] = new type[length] // Arrays
        // Arrays have a FIXED LENGTH. cant be added to or taken away f rom
//        int[] nums = new int[3];
//        nums[0] = 1;
//        nums[1] = 2;
//        nums[2] = 3;

//String[] pets = {"Luck","aapa","falco"};
//        // if you know items ahead of time // React??
//        int[] nums2 = {200,3,43,5};
//        Arrays.sort(nums2);
//
//
//        System.out.println(Arrays.toString(nums2));
//
//

        Box box1 = new Box("cardboard", 275.4);
        Box box2 = new Box("cardboard", 300.9);
        Box box3 = new Box("metal", 2000);

        Box[] boxes = {box1, box2, box3};


//        System.out.println("For Each Loop");
        /// SHow info on each item in array
//        for (Box box:boxes){
//            System.out.println(box.type + box.weight);
//        }
//
//        System.out.println("For Loop");
//        for (int i = 0; i < boxes.length;i++){
//            System.out.println(boxes[i].type + boxes[i].weight);
//        }


        /// Sorting Boxes by weight
//        for (Box box:boxes){
//            boolean tooHeavy = box.weight > 500;
//            if (tooHeavy){
//                System.out.println("Box Rejected... Box is too heavy... Maximum weight limit is 500 \n This box was " + box.weight + "lbs");
//            }
//
//            System.out.println("Box Accepted...weight is under weight limit \n This box was " + box.weight + "lbs");
//        }


/// Assignign status by weight
//        for (int i =0;i < boxes.length;i++) {
//            boolean tooHeavy = boxes[i].weight > 500;
//
//            if (!tooHeavy)
//                boxes[i].status = "accepted";
//            else
//                boxes[i].status = "rejected";
//
//        }


        // counting accepted boxes
//        int acceptedBoxes = 0;
//            for (Box box:boxes) {
//                boolean status = box.status.equals("accepted");
//
//                if (status){
//                    acceptedBoxes++;
//                }
//
//        }
//        System.out.println("Out of " + boxes.length +" boxes " + acceptedBoxes + " have been accepted");


        Box[] boxes2 = new Box[20];
        String[] boxTypes = {"metal", "cardboard", "paper"};
        for (int i = 0; i < 20; i++) {

            int weightMultiplier = 1;
            double weight;



            // Getting a random boxtype
            String boxType = boxTypes[(int) (Math.random() * boxTypes.length - 1)];

            // weight Multiplier for material
            switch (boxType) {
                case "metal":
                    weightMultiplier = 2000;
                    break;
                case "paper":
                    weightMultiplier = 50;
                    break;
                case "cardboard":
                    weightMultiplier = 1000;
                    break;
            }


            weight = (Math.random() * weightMultiplier) + 200;

            boolean tooHeavy = weight > 1000;



            boxes2[i] = new Box(boxType, weight);

            if (!tooHeavy)
                boxes2[i].status = "accepted";
            else
                boxes2[i].status = "rejected";

        }




        int acceptedBoxes = 0;
        for (Box box : boxes2) {
            boolean status = box.status.equals("accepted");

            if (status) {
                acceptedBoxes++;
            }
            System.out.println(box.type + " " + box.status + " " + (int) box.weight);
        }
        System.out.println("Out of " + boxes2.length + " boxes " + acceptedBoxes + " have been accepted");


        int i = 020;
        System.out.println(i);
    }





    }




