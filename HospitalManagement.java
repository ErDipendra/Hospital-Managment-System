package com.lenova.javapractice.corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

class Reservation extends Exception{
    protected Object name;
    protected Object address;
    protected Object bedType;
    protected Object checkDate;
    protected Object checkOutDate;
    protected Object ammount;
    protected Object roomType;
    protected long mobile;
    protected Object roomNo;

    Scanner sc = new Scanner(System.in);
    
    //Doctor consult 
    Reservation(String msg){
        super(msg);
    }
    //hold data of patient
        public void patientData(int registeration_no, int roomNo) throws IOException, InterruptedException{

          System.out.println(" \n       JAGANNATH HOSPITAL MANAGEMENT\n\n");
          System.out.println("             Reservation Form        \n\n  ");
          System.out.println("Receipt No. "+registeration_no);
          System.out.print("\nEnter Your Good Name : ");
          name = sc.nextLine().toUpperCase();
          char[] broking = ((String) name).toCharArray();
           int vituran = broking.length;
           if(vituran>=5) {
                 int count = 0;
                 count = vituran;
                 boolean vui = count <= 5;
                 if (vui==true) {}
            } else {
              System.out.println("(WARNING : \"PLEASE ENTER YOUR VALID NAME THAT MUST BE FULL NAME\")");
            } 
          System.out.print("\nEnter Your address : ");
          address = sc.nextLine().toUpperCase();
          char[] rebroking = ((String) address).toCharArray();
           int revituran = rebroking.length;
           if(revituran>=10) {
                 int count = 0;
                 count = vituran;
                 boolean vui = count >= 10;
                 if (vui==true) {}
            } else {
              System.out.println("(WARNING : \"PLEASE ENTER YOUR VALID ADDRESS THAT MUST BE LOCATED ADDRESS\")");
            } 
          System.out.print("\nEnter Your Mobile Number : ");
          mobile = sc.nextLong();
          if (mobile > 1000000000) {
          } else {
            System.out.println("(WARNING : \"PLEASE ENTER YOUR VALID MOBILE NUMBER THAT SHOULD BE 10 DIGIT\")");
          }
          System.out.print("\nFill Date to Attempt :  ");
          Date date = new Date();
          DateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
          String dateString = dateFormat.format(date);
          System.out.println(dateString);
          System.out.print("\nCheck Out Date : ");
          Thread.sleep(2000);
          LocalDate future4days=LocalDate.now().plusDays(4);
          System.out.println(future4days);
        //   Thread.sleep(2000);
          System.out.println("\nRoom Type should be : ");
          System.out.println("01. AC     02. Non AC    03. VIP Room    04. EnterTainment Room");
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          // roomType = sc.nextLine();
          String roomType = br.readLine().toUpperCase();
          if (((String) roomType).equalsIgnoreCase("ac")|| ((String) roomType).equalsIgnoreCase("non ac")||
          ((String) roomType).equalsIgnoreCase("vip room")||((String) roomType).equalsIgnoreCase("entertainment room")) {
            System.out.print("");
          } 
          else if(((String) roomType).equalsIgnoreCase("01")|| ((String) roomType).equalsIgnoreCase("02")||
          ((String) roomType).equalsIgnoreCase("03")||((String) roomType).equalsIgnoreCase("04")){
            System.out.print("");
          }
          else {
            System.out.println("Please Select A Room For You From Above");
          }
          System.out.print("\nBed Type should be : ");
          bedType = br.readLine().toUpperCase();
          if (((String) bedType).equalsIgnoreCase("single")||((String) bedType).equalsIgnoreCase("double")) {} 
          else {
            System.out.println("(WARNING : PLEASE ENTER ONLY BED -> SINGLE OR DOUBLE)");
          }
          //total amount for all facilities
          int ac,nonAc,vip,entertainment;
          int required = 500;
          System.out.print("\nYour Total Bill : ");
          ammount = "ac"; Object ammount1 = "non ac"; Object ammount2 = "vip room"; Object ammount3 = "entertainment room";
        //   System.out.println(ammount1.equals(roomType));
          if (((String) ammount).equalsIgnoreCase((String) roomType)||("01".equalsIgnoreCase((String) roomType))||("1".equalsIgnoreCase((String) roomType))) {
              ac = 1500;
              System.out.println(required+ac+" Rupees");
          }
          else if(((String) ammount1).equalsIgnoreCase((String) roomType)||("02".equalsIgnoreCase((String) roomType))||("2".equalsIgnoreCase((String) roomType))){
              nonAc = 200;
              System.out.println(required+nonAc+" Rupees");
          }
          else if(((String) ammount2).equalsIgnoreCase((String) roomType)||("03".equalsIgnoreCase((String) roomType))||("3".equalsIgnoreCase((String) roomType))){
              vip = 5000;
              System.out.println(required+vip+" Rupees");
          }
          else if(((String) ammount3).equalsIgnoreCase((String) roomType)||("04".equalsIgnoreCase((String) roomType))||("4".equalsIgnoreCase((String) roomType))){
              entertainment = 8000;
              System.out.println(required+entertainment+" Rupees");
          }else{
            System.out.println("Please select any room above");
          }

          //waiting for short time
          System.out.println("\n\n\nPlease wait for few minute");
          Thread.sleep(5000);
          //********************Short Data Is Founded************************ */
          
        System.out.println("\n\n        Registeration Form \n\n");
        System.out.println("   Full Name  :  "+name);
        System.out.println("   Address    :  "+address);
        System.out.println("   Mobile     :  "+"+91 "+mobile);
        System.out.println("   Check In   :  "+dateString);
        System.out.println("   Check Out  :  "+future4days);
        System.out.println("   Room Type  :  "+roomType);
        System.out.println("   Room No.   :  "+roomNo);
        System.out.println("   Bed Type   :  "+bedType);
        String checking = roomType;
        if (checking.equalsIgnoreCase((String) ammount)||("01".equalsIgnoreCase((String) roomType))) {
          System.out.println("   Amount     :  "+2000+" (including AC room)");
        }
        else if (checking.equalsIgnoreCase((String) ammount1)||("02".equalsIgnoreCase((String) roomType))) {
          System.out.println("   Amount     :  "+700);
        }
        else if (checking.equalsIgnoreCase((String) ammount2)||("03".equalsIgnoreCase((String) roomType))) {
          System.out.println("   Amount     :  "+5500+" (including vip room)");
        }
        else if (checking.equalsIgnoreCase((String) ammount3)||("04".equalsIgnoreCase((String) roomType))) {
          System.out.println("   Amount     :  "+8500+" (including Entertainment room)");
        }  
        else {
          System.out.println("   Amount     :  Not filled");  
        }
  
          //****************************************/

    }
    void submittedForm(){
        System.out.println("\n   Your Form has filled successfully\n\n");
    }

}
class CopyDetailsOfPatientForDoctor extends Reservation{
    // Doctor can take print of this receipt

    CopyDetailsOfPatientForDoctor(String msg) {
        super(msg);
    }
}
public class HospitalManagement {
    public static void main(String[] args) throws IOException, InterruptedException {
        Reservation res = new Reservation("Regard");
        res.patientData(2345,145);
        res.submittedForm();
        // CopyDetailsOfPatientForDoctor cd = new CopyDetailsOfPatientForDoctor("access patient data");
        // res = cd;
        // ((CopyDetailsOfPatientForDoctor) res).patientData();
    }
}