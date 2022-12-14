package utilities;

import pojos.Physician;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import pojos.Country;
import pojos.Messages;
import pojos.State;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadTxt {


    public static List<Object> returnCountryNamesList(String filePath) {

        List<Object> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                State state = new State();
                state.setId(Integer.parseInt(line.split(",")[0]));
                sb.append(System.lineSeparator());
                line = br.readLine();
                all.add(state.getId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
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
    public static List<Object> returnStateIDsList(String filePath) {

        List<Object> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                State state = new State();
                state.setId(Integer.parseInt(line.split(",")[0]));
                sb.append(System.lineSeparator());
                line = br.readLine();
                all.add(state.getId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }
    public static List<Object> returnStateNamesList(String filePath) {

        List<Object> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                State state = new State();
                state.setId(Integer.parseInt(line.split(",")[0]));
                sb.append(System.lineSeparator());
                line = br.readLine();
                all.add(state.getId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }
    public static List<Object> returnMessageIDList(String filePath) {
        List<Object> all = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {

                Messages messages = new Messages();
                messages.setId(String.valueOf(Integer.parseInt(line.split(",")[0])));
                sb.append(System.lineSeparator());
                line = br.readLine();
                all.add(messages.getId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return all;
    }

    public static String readLastLinePhysicianList(String filePath,int index) {
        List<String> physicianList = new ArrayList<>();
        String line = "";
        try {
            FileReader fileReader = new FileReader(filePath);


            BufferedReader br = new BufferedReader(fileReader);


            physicianList = br.lines().collect(Collectors.toList());
            line = physicianList.get(physicianList.size() - index);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return line;
    }

    public static List<Object> returnPhysicianIDsList(String filePath){
        List<Object>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Physician physician = new Physician();
                physician.setId(Integer.parseInt(line.split(",")[0]));
                sb.append(System.lineSeparator());
                line = br.readLine();

//                System.out.println(i++);

                all.add(physician.getId());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }





    public static List<String> returnPhysicianFirstName(String filePath){
        List<String>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Physician physician = new Physician();
                physician.setFirstname(line.split(",")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();

//                System.out.println(i++);

                all.add(physician.getFirstname());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }


    public static List<String> returnPhysicianLastName(String filePath){
        List<String>all = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            System.out.println(line);
            int i = 0;
            while (line != null) {
                Physician physician = new Physician();
                physician.setLastname(line.split(",")[0]);
                sb.append(System.lineSeparator());
                line = br.readLine();

//                System.out.println(i++);

                all.add(physician.getFirstname());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return all;
    }

    public static List<String> getSSNIDs(){
        List <String > list = new ArrayList<>();


        try{

            //identify file location
            FileReader fileReader = new FileReader(ConfigReader.getProperty("database_registrant_data"));

            //Read the records of the file in given location
            BufferedReader br = new BufferedReader(fileReader);

            String line = br.readLine();//856-45-6789,

            while(line != null){

                String ssn = line.split(",")[0];
                list.add(ssn);

                line = br.readLine();

            }

        }catch (Exception e){

            e.printStackTrace();

        }

        return list;
    }

}