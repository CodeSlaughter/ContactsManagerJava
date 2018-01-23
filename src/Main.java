
public class Main {

    public static void main(String[] args) {
	// write your code here
        ContactsManager myContactManager = new ContactsManager();

        Contact jamie = new Contact();
        jamie.name = "Jamie";
        jamie.phoneNumber = "555-555-5555";

        myContactManager.addContact(jamie);

        Contact melissa = new Contact();
        jamie.name = "Melissa";
        jamie.phoneNumber = "555-555-5555";

        Contact joi = new Contact();
        jamie.name = "Joi";
        jamie.phoneNumber = "555-555-5555";

        Contact found = myContactManager.searchContact("Joi");
        System.out.println(found.phoneNumber);

        //System.out.println("Test");
    }
}
