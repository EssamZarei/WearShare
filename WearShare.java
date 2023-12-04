
import java.util.*;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class WearShare {
    public static void main(String[] args) throws NoSuchAlgorithmException {

        Scanner in = new Scanner(System.in);
        /*
         * System.out.println("Enter you password");
         * String pass = in.nextLine();
         * String encPass = encryptString(pass);
         * System.out.println("Your encrepted password is: " + encPass);
         */
        // User userHead = new User();
        Beneficiary beneHead = new Beneficiary();
        Store storeHead = new Store();
        Donor donorHead = new Donor();
        Association assHead = new Association();

        // test
        // System.out.println(donorHead.getRewards());

        // Create additional Beneficiary objects and add them to the end of the list
        Beneficiary bene1 = new Beneficiary(1, "Ali Mohammed", encryptString("pass1"), "Riyadh", "0512345678", 70, 170, 42.5, null);
        Beneficiary bene2 = new Beneficiary(2, "Mohammed Ali", encryptString("pass2"), "Jeddah", "0598765432", 80, 175, 40.0, null);
        Beneficiary bene3 = new Beneficiary(3, "Ahmed Khalid", encryptString("pass3"), "Dammam", "0555555555", 60, 160, 38.5, null);

        // Add beneficiaries to the end of the list using addLast
        beneHead.addLast(bene1);
        beneHead.addLast(bene2);
        beneHead.addLast(bene3);
        /*
         * // Print the header
         * System.out.println(Beneficiary.toStringHeader());
         * // Print data for the current object (head)
         * System.out.println(beneHead.toString() + "\n\n");
         * // Print all objects in the list
         * System.out.println(Beneficiary.toStringAll(beneHead) + "\n\n");
         */

        // Create additional Store objects and add them to the end of the list
        Store store1 = new Store(2, "Perfume Shop", encryptString("pass1"), "Jeddah", "0502345678", "50", "StCode2");
        Store store2 = new Store(3, "Furniture Store", encryptString("pass2"), "Dammam", "0503456789", "50", "StCode3");
        Store store3 = new Store(4, "Knowledge Bookstore", encryptString("pass3"), "Medina", "0504567890", "50",
                "StCode4");
        Store store4 = new Store(5, "Farouq Supermarket", encryptString("pass4"), "Taif", "0505678901", "50",
                "StCode5");

        // Add stores to the end of the list using addLast
        storeHead.addLast(store1);
        storeHead.addLast(store2);
        storeHead.addLast(store3);
        storeHead.addLast(store4);
        /*
         * // Print the header
         * System.out.println(Store.toStringHeader());
         * // Print data for the current object (head)
         * System.out.println(storeHead.toString() + "\n\n");
         * // Print all objects in the list
         * System.out.println(Store.toStringAll(storeHead) + "\n\n");
         */

        // Create additional Donor objects and add them to the end of the list
        Donor donor1 = new Donor(2, "Mariam Abdullah", encryptString("pass1"), "Jeddah", "0502222222");
        Donor donor2 = new Donor(3, "Mohammed Sulaiman", encryptString("pass2"), "Dammam", "0503333333");
        Donor donor3 = new Donor(4, "Layla Mohammed", encryptString("pass3"), "Medina", "0504444444");
        Donor donor4 = new Donor(5, "Sara Ali", encryptString("pass4"), "Khobar", "0505555555");

        // Add donors to the end of the list using addLast
        donorHead.addLast(donor1);
        donorHead.addLast(donor2);
        donorHead.addLast(donor3);
        donorHead.addLast(donor4);
        /*
         * // Print the header
         * System.out.println(User.toStringHeader());
         * // Print data for the current object (head)
         * System.out.println(donorHead.toString() + "\n\n");
         * // Print all objects in the list
         * System.out.println(User.toStringAll(donorHead) + "\n\n");
         */

        // Create additional Association objects and add them to the end of the list
        Association ass1 = new Association(2, "Ass1", encryptString("pass1"), "Jeddah", "0502222222");
        Association ass2 = new Association(3, "Ass2", encryptString("pass2"), "Dammam", "0503333333");
        Association ass3 = new Association(4, "Ass3", encryptString("pass3"), "Medina", "0504444444");
        Association ass4 = new Association(5, "Ass4", encryptString("pass4"), "Khobar", "0505555555");

        // Add associations to the end of the list using addLast
        assHead.addLast(ass1);
        assHead.addLast(ass2);
        assHead.addLast(ass3);
        assHead.addLast(ass4);

        // Add Clothes to each Association
        // For Association 1
        ass1.getHeadClothes().addLast(new Clothes(101, "Men", 40));
        ass1.getHeadClothes().addLast(new Clothes(102, "Women", 36));

        // For Association 2
        ass2.getHeadClothes().addLast(new Clothes(201, "Child", 30));
        ass2.getHeadClothes().addLast(new Clothes(202, "Men", 42));

        // For Association 3
        ass3.getHeadClothes().addLast(new Clothes(301, "Women", 38));
        ass3.getHeadClothes().addLast(new Clothes(302, "Child", 32));

        // For Association 4
        ass4.getHeadClothes().addLast(new Clothes(401, "Men", 44));
        ass4.getHeadClothes().addLast(new Clothes(402, "Women", 34));

        // Print the header
        // System.out.println(User.toStringHeader());
        // Print data for the current object (head)
        // System.out.println(assHead.toString() + "\n\n");

        // Calls to print lists
        // beneList(beneHead);
        // storeList(storeHead);
        // assList(assHead);

        System.out.println(
                "-----------------------          WELCOME TO WearShare              -----------------------\n ");

        System.out.print("Choose  : 1 if you Association  2 if you Beneficiary  3 if you  Donor  :");
        int TypeOfUser = in.nextInt();
        System.out.println("");
        System.out.println("Please enter your user name and your password\n");
        System.out.print("  user Name  :  ");
        String Username1 = in.nextLine();
        String Username = in.nextLine();
        System.out.println("");
        System.out.print("  password  :  ");
        String password = encryptString(in.next());
        /*
         * System.out.println(password);
         * System.out.println(ass1.getPassword());
         */

        // Mariam Abdullah pass1
        if (TypeOfUser == 1) {
            assHead.printList();
        }

        if (TypeOfUser == 2) {
            if (logIn(beneHead, Username, password)) {
                System.out.println("\n  -----------------------          WELCOME\t" + Username + "                -----------------------\n  ");
                System.out.println("1 for Request Clothes  ");
                TypeOfUser = in.nextInt();
                if (TypeOfUser == 1) {
                    ass1.getHeadClothes().printList();
                    ass2.getHeadClothes().printList();
                    ass3.getHeadClothes().printList();
                    System.out.print("Please insert your ID \t");
                    int yourID = in.nextInt();
                    System.out.println("\n Choose What you want ");
                    int ID = 0;

                    System.out.print("  BY THE ID : ");
                    ID = in.nextInt();
                    if ((yourID + "").charAt(0) == '1') {

                        if ((ID + "").charAt(0) == '1') {
                            requestBenf(bene1, ass1, ID);

                        }
                        if ((ID + "").charAt(0) == '2') {
                            requestBenf(bene1, ass2, ID);

                        }
                        if ((ID + "").charAt(0) == '3') {
                            requestBenf(bene1, ass3, ID);

                        }

                    }
                    if ((yourID + "").charAt(0) == '2') {

                        if ((ID + "").charAt(0) == '1') {
                            requestBenf(bene2, ass1, ID);

                        }
                        if ((ID + "").charAt(0) == '2') {
                            requestBenf(bene2, ass2, ID);

                        }
                        if ((ID + "").charAt(0) == '3') {
                            requestBenf(bene2, ass3, ID);

                        }

                    }
                    if ((yourID + "").charAt(0) == '3') {
                        if ((ID + "").charAt(0) == '1') {
                            requestBenf(bene3, ass1, ID);

                        }
                        if ((ID + "").charAt(0) == '2') {
                            requestBenf(bene3, ass2, ID);

                        }
                        if ((ID + "").charAt(0) == '3') {
                            requestBenf(bene3, ass3, ID);

                        }
                    }

                }
            };

        }
        if (TypeOfUser == 3) {

            // Donor donor1 = new Donor(2, "Mariam Abdullah", "pass1", "Jeddah",
            // "0502222222");
            if (logIn(donorHead, Username, password)) {
                System.out.println("\n  -----------------------          WELCOME\t" + Username
                        + "                -----------------------\n  ");

                int ID = 0;
                String Type = "";
                int size = 0;
                System.out.print("Please insert your ID \t");
                ID = in.nextInt();
                System.out.print("Please insert the size \t");
                size = in.nextInt();
                System.out.print("Please insert the type \t");
                Type = in.next();

                System.out.println("\n\n");
                storeHead.printList();
                System.out.println("\n\n\n");
                System.out.println("Enter the store ID");
                int SID = in.nextInt();
                System.out.println("Enter the required points for the store");
                int reqPoints = in.nextInt();

                if ((ID + "").charAt(0) == '2') {
                    requestDonor(donor2, ass1, ID, size, Type);
                    useReward(storeHead, SID, donor2, donor2.getID(), donor2.getRewards(), reqPoints);
                }
                if ((ID + "").charAt(0) == '3') {
                    requestDonor(donor3, ass2, ID, size, Type);
                    useReward(storeHead, SID, donor3, donor3.getID(), donor3.getRewards(), reqPoints);
                }
                if ((ID + "").charAt(0) == '4') {
                    requestDonor(donor4, ass3, ID, size, Type);
                    useReward(storeHead, SID, donor4, donor4.getID(), donor4.getRewards(), reqPoints);
                }

            }

        }

    }

    /*
     * // IMPORTANT
     * // The following method (multi, encryptString) written by Essam
     */
    // Define a static method named 'multi' which takes an integer 'a' as input and returns an integer.
public static int multi(int a) {
    // Add 2 to the input integer 'a' and store the result in the variable 'sum'.
    int sum = a + 2;
    // Return the value of 'sum'.
    return sum;
}

// Define a static method named 'encryptString' which takes a String 'text' as input and returns a String.
// This method declares that it can throw a NoSuchAlgorithmException, which must be handled by the caller.
public static String encryptString(String text) throws NoSuchAlgorithmException {
    // Create a MessageDigest instance for MD5 hashing.
    MessageDigest MD = MessageDigest.getInstance("MD5");

    // Convert the input text to a byte array and compute its digest (hash).
    byte[] massageDigest = MD.digest(text.getBytes());

    // Convert the byte array of the hash into a positive BigInteger.
    BigInteger bigInteger = new BigInteger(1, massageDigest);

    // Convert the BigInteger to a hexadecimal string and return it.
    return bigInteger.toString(16);
}


    /*
     * // IMPORTANT
     * // The following method (logIn) written by Muhanned
     */
    // Define a static method named 'logIn' which returns a boolean value.
    // It takes three parameters: a User object 'check', and two strings 'userName' and 'password'.

    public static boolean logIn(User check, String userName, String password) {
    // Call the login method on the 'check' object with the provided username and password.
    // If the login is successful (returns true),
    if (check.login(check, userName, password)) {
        // Print a welcome message with the user's name.
        System.out.println(" welcome    " + userName);
        // Return true indicating a successful login.
        return true;
    } else {
        // If login fails, print an error message asking to check the username or password.
        System.out.println(" please check you name or you password ");
    }
    // Return false indicating the login was not successful.
    return false;
}


    // will complete it when merge all methods
    public static void generalList() {
        System.out.println("");
    }

    /*
     * // IMPORTANT
     * // The following method (beneList, storeList, assList) written by Essam
     */
    public static void beneList(Beneficiary beneHead) {
        // Print all objects in the list
        System.out.println(User.toStringAll(beneHead) + "\n\n");
    }

    public static void storeList(Store storeHead) {
        // Print all objects in the list
        System.out.println(User.toStringAll(storeHead) + "\n\n");
    }

    public static void assList(Association assHead) {
        // Print all objects in the list
        System.out.println(User.toStringAll(assHead) + "\n\n");
    }

    
    // IMPORTANT
    // The following method (requestBenf) written by Muhanned
    // Define a static method named 'requestBenf' that returns a boolean value.
    // This method takes a Beneficiary object 'reqBenf', an Association object 'headAss', and an integer 'clotheID' as parameters.
public static boolean requestBenf(Beneficiary reqBenf, Association headAss, int clotheID) {

    // Check if the clothing item with the specified ID exists in the association's inventory.
    if (headAss.getHeadClothes().searchByID(clotheID) != null) {
        // Retrieve and store the ID of the clothing item.
        int ID = headAss.getHeadClothes().searchByID(clotheID).getID();
        // Retrieve and store the Type of the clothing item.
        String Type = headAss.getHeadClothes().searchByID(clotheID).getType(); 
        // Retrieve and store the Size of the clothing item.
        double Size = headAss.getHeadClothes().searchByID(clotheID).getSize();

        // Add the found clothing item to the beginning of the beneficiary's clothing list.
        reqBenf.getHeadClothes().addFirst(new Clothes(ID, Type, Size));

        // Remove the clothing item from the association's inventory.
        headAss.getHeadClothes().removeItem(headAss.getHeadClothes().searchByID(clotheID));
        // Print a confirmation message indicating the request was successful.
        System.out.println("    You got your request :)    ");
        // Return true indicating the request was fulfilled successfully.
        return true;
    } else {
        // If the clothing item is not found, print an error message.
        System.out.println("    You have a problem with your request :(    ");
    }
    // Return false indicating the request was not fulfilled.
    return false;
}


    
    // IMPORTANT
    // The following method (requestDonor) written by Salman
// Define a static method named 'requestDonor' that returns a boolean value.
// This method takes a Donor object 'reqDonor', an Association object 'headAss', 
// and three parameters 'ID', 'size', and 'type' for the clothes to be donated.
public static boolean requestDonor(Donor reqDonor, Association headAss, int ID, int size, String type) {
    // Create a temporary Association object and assign it the value of headAss.
    Association temp = headAss;
    // Create a new Clothes object with default values.
    Clothes tempClothes = new Clothes();
    // Move to the next Association in the linked list (if any).
    temp = (Association) temp.getNext();

    // Check if the size is less than or equal to 0, return false if it is.
    if (size <= 0) {
        return false;
    }

    // Check if the type of clothes is not one of the specified categories ('women', 'men', 'child').
    // If it's not one of these types, return false.
    if (!("women".equalsIgnoreCase(type) || "men".equalsIgnoreCase(type) || "child".equalsIgnoreCase(type))) {
        return false;
    }

    // Check if the clothes with the given ID already exist in the association's inventory.
    if (temp.getHeadClothes().searchByID(ID) == null) {
        // If the clothes don't exist, add the new clothes item to the end of the association's clothes list.
        temp.getHeadClothes().addLast(tempClothes);
        // Add the association to the beginning of the donor's list.
        reqDonor.addFirst(temp);
        // Print a thank you message indicating successful coordination.
        System.out.println("We added the clothes thanks for your cordination :)");
    }
    // Return true indicating the process was successful.
    return true;
}


    
    // IMPORTANT
    // The following method (useReward) written by Salman
// Define a static method named 'useReward' that returns a boolean value.
// This method manages the use of rewards in a store by a donor.
// It takes a Store object 'headStore', store and donor IDs, and point values as parameters.
public static boolean useReward(Store headStore, int storeID, Donor heaDonor, int ID, int points, int requiredPoints) {
    // Variable to check if the donor has enough points.
    boolean hasEnoughPoints = false;

    // Check if the donor with the given ID exists. If not, return false.
    if (heaDonor.searchByID(ID) == null) {
        // Set 'hasEnoughPoints' based on whether the donor has more or equal points than required.
        hasEnoughPoints = points >= requiredPoints;
        return false;
    }

    // Check if the store with the given ID exists.
    if (headStore.searchByID(storeID) != null) {
        // Set 'hasEnoughPoints' based on whether the donor has more or equal points than required.
        hasEnoughPoints = points >= requiredPoints;
        // Deduct the required points from the donor's total points, ensuring it doesn't go below zero.
        points = Math.max(0, points - requiredPoints);
        // Retrieve the user object corresponding to the store ID.
        User userObj = headStore.searchByID(storeID);
        // Cast the user object to a Store object.
        Store storeObj = (Store) userObj;
        // Print the store's code.
        System.out.println("\n\nStore code : " + storeObj.getCode());
        // Return true indicating the process was successful.
        return true;
    }
    // Return false if the store with the given ID does not exist.
    return false;
}


    // HIIII

}



