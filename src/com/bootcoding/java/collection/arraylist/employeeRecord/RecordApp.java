package com.bootcoding.java.collection.arraylist.employeeRecord;

import java.util.ArrayList;

public class RecordApp {
    public static void main(String[] args) {
        RecordService rec = new RecordService();
        ArrayList<Record> records = rec.getRecords(10000);

        for (int i = 0; i < records.size(); i++){
            System.out.println(i+1);

            System.out.println("Name: " + records.get(i).getName());
            System.out.println("Experience: " + records.get(i).getExperience());
            System.out.println("Age: " + records.get(i).getAge());
            System.out.println("Salary: " + records.get(i).getSalary());
        }
    }
}
