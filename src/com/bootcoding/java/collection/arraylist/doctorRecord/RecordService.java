package com.bootcoding.java.collection.arraylist.doctorRecord;

import java.util.ArrayList;
import java.util.Random;

public class RecordService {
    int randomIndex;
    private String getRandomName() {
        String[] names = {"Om","Sakshi","Prerna","Rashi","Shruti","Nachiket","Mrunmayee"};
        randomIndex = new Random().nextInt(names.length);
        return names[randomIndex];
    }

    public String getRandomEducation() {
        String[] educations = {"PhD"};
        randomIndex = new Random().nextInt(educations.length);
        return educations[randomIndex];
    }

    private int getRandomAge() {
        int[] ages = {20,21,22,23};
        randomIndex = new Random().nextInt(ages.length);
        return ages[randomIndex];
    }
    private String getRandomType() {
        String[] types = {"Neurologist","Cardiologist","Orthopedic"};
        randomIndex = new Random().nextInt(types.length);
        return types[randomIndex];
    }
    public Record buildRecord(){
        Record record = new Record();
        record.setName(getRandomName());
        record.setAge(getRandomAge());
        record.setEducation(getRandomEducation());
        record.setType(getRandomType());
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
