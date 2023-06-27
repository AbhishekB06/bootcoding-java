package com.bootcoding.java.collection.arraylist.doctorRecord;

import java.util.ArrayList;

public class RecordApp {
    public static void main(String[] args) {
        RecordService rec = new RecordService();
        ArrayList<Record> records = rec.getRecords(10000);

        for (int i =0;i < records.size(); i++){
            System.out.println(i);
            System.out.println("Name: "+records.get(i).getName());
            System.out.println("Age: "+records.get(i).getAge());
            System.out.println("Eduction: "+records.get(i).getEducation());
            System.out.println("Type of Doctor: "+records.get(i).getType());
        }
    }
}
