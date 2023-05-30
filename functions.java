package org.example.stepDefs;

import org.example.pages.RequestsPackage.historyPage;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class functions {
    historyPage historyPageObj=new historyPage();
    public void checkHistoryIsAddedARequest(String request,String dateOfRequest){
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(historyPageObj.firstElementInHistory().getText(),request);
        System.out.println("first ele + "+historyPageObj.firstElementInHistory().getText());
        soft.assertEquals(historyPageObj.dateOfFirstElementInHistory().getText(),dateOfRequest);
        System.out.println("date  + "+historyPageObj.dateOfFirstElementInHistory().getText());
        soft.assertAll();
    }
    public String dateOFToday(){
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM, yyyy");
        String formattedDate = currentDate.format(formatter);
        System.out.println(formattedDate);
        return formattedDate;
    }
    public boolean checkIfDownloadedFileDownload(String fileName){
        boolean check = false;

        // Check if the file exists in the download directory
        File fileLocation = new File("C:\\Users\\Rofaida\\Downloads");
        File[] totalFiles = fileLocation.listFiles();
        for (File file : totalFiles) {
            if (file.getName().equals(fileName)) {
                check = true;
                break;
            }
        }
        System.out.println(check);

        return check;
    }
}
