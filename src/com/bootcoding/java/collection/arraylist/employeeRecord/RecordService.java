package com.bootcoding.java.collection.arraylist.employeeRecord;

import java.util.ArrayList;
import java.util.Random;

public class RecordService {
    int randomIndex;
     private String getRandomName() {
         String[] names ={"Abhishek","Nachiket","Rizwan","Nikhil"};
         randomIndex = new Random().nextInt(names.length);
         return names[randomIndex];
     }
     private int getRandomExperience() {
         int[] experiences = {2,3,4,1};
         randomIndex = new Random().nextInt(experiences.length);
         return experiences[randomIndex];
     }

     public double getRandomSalary() {
         double[] salaries = {50000,60000,70000,40000};
         randomIndex = new Random().nextInt(salaries.length);
         return salaries[randomIndex];
     }
     private int getRandomAge() {
         int[] ages = {20,21,22,23};
         randomIndex = new Random().nextInt(ages.length);
         return ages[randomIndex];
     }
     public Record buildRecord(){
         Record record = new Record();
         record.setName(getRandomName());
         record.setExperience(getRandomExperience());
         record.setAge(getRandomAge());
         record.setSalary(getRandomSalary());
         return record;
     }
     public ArrayList<Record> getRecords(int size){
         ArrayList<Record> records = new ArrayList<>();
         for (int i =0; i < size; i++){
             Record record = buildRecord();
             records.add(record);
         }
         return records;
     }
}
