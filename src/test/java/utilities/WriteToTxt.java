package utilities;
import pojos.Registrant1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToTxt {

      public static void savePhysicianIds(String fileName, List<Object> id){
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,false));

                for (int i=0; i< id.size(); i++)
                    writer.append(id.get(i).toString()+",\n");

                writer.close();
            } catch (IOException e){
            }
        }

        public static void savePhysicianFirstName(String fileName, List<Object> firstname){
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,false));

                for (int i=0; i< firstname.size(); i++)
                    writer.append(firstname.get(i).toString()+",\n");

                writer.close();
            } catch (IOException e){
            }
        }

        public static void savePhysicianLastName(String fileName, List<Object> lastname){
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,false));

                for (int i=0; i< lastname.size(); i++)
                    writer.append(lastname.get(i).toString()+",\n");

                writer.close();
            } catch (IOException e){
            }
        }



    public static void saveRegistrantData(Registrant1 registrant1){


        try {
            FileWriter fileWriter = new FileWriter(ConfigReader1.getProperty("registrantFile"), true);


            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(registrant1.toString() + ", \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveRegistrantApiData(Registrant1 register){

        try {
            FileWriter fileWriter = new FileWriter(ConfigReader1.getProperty("registrantApiFile"), true);


            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.append(register.toString() + ", \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/*
    public static void saveAppointmentIds(String fileName, List<Object> id){

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

    public static void savePhysicianIds(String fileName, List<Object> id){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName,false));


            for (int i=0; i< id.size(); i++)
                writer.append(id.get(i).toString()+",\n");

            writer.close();


        } catch (IOException e) {
        }

    }


    public static void savePhysician(String fileName, List<Object> id){

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i=0; i< id.size(); i++)
                writer.append(id.get(i).toString()+",\n");

            writer.close();

        } catch (IOException e) {
        }

 */

    }





