package com.accucode.sheetsquickstart;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by bcarr on 9/16/2016.
 */
public class UserSingleton {


    private static UserSingleton singleton = new UserSingleton( );

//    ArrayList<List<Object>> sResults = new ArrayList<List<Object>>();
    List<Object> sResults = new ArrayList<Object>();

    //    ArrayList<List<String>> nameArray = new ArrayList<List<String>>();
//    ArrayList<List<String>> emailArray = new ArrayList<List<String>>();
    List<Object> objectList = new ArrayList<Object>();
    List<String> nameArray = new ArrayList<String>();
    List<String> emailArray = new ArrayList<String>();
//    String name = "Default name";
    /* A private Constructor prevents any other
     * class from instantiating.
     */
    private UserSingleton(){
    }

    public static UserSingleton getInstance(){ //BC 9/18 creates instance
        return singleton;
    }
    protected void SetResults(String arg0){
            this.sResults.add(arg0);
//        System.out.println("Shit Stored");
//        System.out.println(sResults.get(0));

    }
    protected List<String> GetResults(){

//        String userName = "No change in GetResults";
//        if (arg0 >= 0) {
//            Boolean check = true;



//               Object subResults = sResults.get(0);


                return nameArray;
//            }

//            String nameArrayValue = nameArray.get(arg0); //BC 9/18 String variable set to the name of person (within the row that contains person info).
//
//            if(nameArrayValue == null || nameArrayValue == ""){  //BC 9/18 logic to check if name value is absent or invalid. Returns a List of strings because the Google API method onPostExecute requires a List to be passed as a parameter...
//                List<String> notificationList = new ArrayList<String>();
//                String notification = "Row Skipped because name value absent!";
//                notificationList.add(notification);
//                return notification;
//            }
//            else if (nameArrayValue == "Name:" || nameArrayValue == "Accucode Toll Free" || nameArrayValue == "Accucode Denver Local" || nameArrayValue == "Rapid Inventory Support" || nameArrayValue == "vMail Support (Internal)" || nameArrayValue == "vMail Support (External Tier 1)" || nameArrayValue == "AO: Sales" || nameArrayValue == "AccuCode Louisville Office" || nameArrayValue == "Other AccuCode Numbers" || nameArrayValue == "Other Important Phone Numbers"){
//                List<String> notificationList = new ArrayList<String>();
//                String notification = "Row Skipped because name value invalid!";
//                notificationList.add(notification);
//                return notification;
//            }
//            else{
//                List<String> notificationList = new ArrayList<String>();
//                notificationList.add(nameArrayValue);
//                return nameArrayValue;
//
//        else{
//            List<String> notificationList = new ArrayList<String>();
//            String notification = "Row Skipped because name value invalid!";
//            notificationList.add(notification);
//            return notificationList;
//        }


    }
    protected void ClearArray(){
        this.sResults.clear();
        this.nameArray.clear();
        this.emailArray.clear();
    }

    protected static void demoMethod( ) {
        System.out.println("demoMethod for singleton");
    }
}