package utilities;


import pojos.Country;
import pojos.Messages;

import java.io.*;
import java.util.ArrayList;
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



    public static void saveTestDataMessage(Messages test) {

        try {
            FileWriter fileWriter = new FileWriter("./src/test/resources/testdata/Messages.txt",
                    false);



            BufferedWriter writer = new BufferedWriter(fileWriter);


            writer.append("Messages " + test + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveMessageId(String fileName, List<Object> idList) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < idList.size(); i++)

                writer.append(idList.get(i).toString() + ",\n");

            writer.close();

        } catch (IOException e) {
        }
    }



    public static void saveCountryId(String fileName, List<Object> idList) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < idList.size(); i++)

                writer.append(idList.get(i).toString() + ",\n");

            writer.close();

        } catch (IOException e) {
        }
    }

    public static void saveCountryName(String fileName, List<Object> nameList) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < nameList.size(); i++)

                writer.append(nameList.get(i).toString() + ",\n");

            writer.close();

        } catch (IOException e) {
        }
    }
    public static List<Object> returnCountryIDsList(String filePath) {

        List<Object> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Country country = new Country();
                country.setId(Integer.parseInt(line.split(",")[0]));
                sb.append(System.lineSeparator());
                line = br.readLine();
                all.add(country.getId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }

    public static void saveStateId(String fileName, List<Object> idList) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < idList.size(); i++)

                writer.append(idList.get(i).toString() + ",\n");

            writer.close();

        } catch (IOException e) {
        }
    }
    public static void saveStateName(String fileName, List<Object> nameList) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false));

            for (int i = 0; i < nameList.size(); i++)

                writer.append(nameList.get(i).toString() + ",\n");

            writer.close();

        } catch (IOException e) {
        }
    }


}