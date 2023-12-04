
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import java.security.NoSuchAlgorithmException;

public class WearShareTest {

    /*
    // IMPORTANT
    // The following TWO methods written by Essam
    // requestBenfTest and testLogIn
    */
    @Test
    public void test() {
        int result = WearShare.multi(6);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testEncryptString() throws NoSuchAlgorithmException {
        String input = "Im Essam hhh";
        String expectedHash = "e9a8878942aea2433c8562644bceb8d8"; // This is the MD5 hash of "Im Essam hhh"

        try {
            String encrypted = WearShare.encryptString(input);
            assertEquals(expectedHash, encrypted);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    /*
    // IMPORTANT
    // The following TWO methods written by Muhanned
    // requestBenfTest and testLogIn
    */
    @Test
    public void requestBenfTest() {

        Beneficiary beneHead = new Beneficiary();
        Association assHead = new Association();

        // Create additional Beneficiary objects and add them to the end of the list
        Beneficiary bene1 = new Beneficiary(2, "Ali Mohammed", "pass1", "Riyadh", "0512345678", 70, 170, 42.5, null);
        Beneficiary bene2 = new Beneficiary(3, "Mohammed Ali", "pass2", "Jeddah", "0598765432", 80, 175, 40.0, null);
        Beneficiary bene3 = new Beneficiary(4, "Ahmed Khalid", "pass3", "Dammam", "0555555555", 60, 160, 38.5, null);

        // Add beneficiaries to the end of the list using addLast
        beneHead.addLast(bene1);
        beneHead.addLast(bene2);
        beneHead.addLast(bene3);

        // Create additional Association objects and add them to the end of the list
        Association ass1 = new Association(2, "Ass1", "pass1", "Jeddah", "0502222222");
        Association ass2 = new Association(3, "Ass2", "pass2", "Dammam", "0503333333");
        Association ass3 = new Association(4, "Ass3", "pass3", "Medina", "0504444444");
        Association ass4 = new Association(5, "Ass4", "pass4", "Khobar", "0505555555");

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

        assertEquals(WearShare.requestBenf(bene1, ass1, 101), true);

    }

    @Test
    public void LogInTest() {

        Association assHead = new Association();

        // Create additional Association objects and add them to the end of the list
        Association ass1 = new Association(2, "Ass1", "pass1", "Jeddah", "0502222222");
        Association ass2 = new Association(3, "Ass2", "pass2", "Dammam", "0503333333");
        Association ass3 = new Association(4, "Ass3", "pass3", "Medina", "0504444444");
        Association ass4 = new Association(5, "Ass4", "pass4", "Khobar", "0505555555");

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

        assertEquals(WearShare.logIn(assHead, "Ass1", "pass1"), true);

    }


    /*
    // IMPORTANT
    // The following TWO methods written by Salman
    // requestBenfTest and testLogIn
    */
    @Test
    public void requestDonorTest() {
    Donor donorhead=new Donor();
    Donor  donor1 = new Donor(2, "Mariam Abdullah", "pass1", "Jeddah", "0502222222");
    Donor donor2 = new Donor(3, "Mohammed Sulaiman", "pass2", "Dammam", "0503333333");
    donorhead.addLast(donor1);
    donorhead.addLast(donor2);

    Association assHead=new Association();
    Association ass1 = new Association(2, "Ass1", "pass1", "Jeddah", "0502222222");
    Association ass2 = new Association(3, "Ass2", "pass2", "Dammam", "0503333333");
    assHead.addLast(ass1);
    assHead.addLast(ass2);
    ass1.getHeadClothes().addLast(new Clothes(101, "Men", 40));
    ass1.getHeadClothes().addLast(new Clothes(102, "Women", 36));

    assertEquals(WearShare.requestDonor((Donor)donorhead.getNext(), (Association)assHead.getNext(), 10, 40, "Men"),true);


    }

    public void useRewardTest() {
        Beneficiary beneHead=new Beneficiary();
        Beneficiary bene1 = new Beneficiary(2, "Ali Mohammed", "pass1", "Riyadh", "0512345678", 70, 170, 42.5, null);
        beneHead.addLast(bene1);
     
        Store storeHead=new Store();
        Store store1 = new Store(2, "Perfume Shop", "pass1", "Jeddah", "0502345678", "50", "StCode2");
        storeHead.addLast(store1);
     
         Donor donorhead=new Donor();
         Donor  donor1 = new Donor(2, "Mariam Abdullah", "pass1", "Jeddah", "0502222222");
         donorhead.addLast(donor1);
     
         assertEquals(WearShare.useReward((Beneficiary) beneHead.getNext(), (Store) storeHead.getNext(), 20, (Donor)donorhead.getNext(), 1, 30, 10),true);
     
     
     
         }

}