package utilities;


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


}