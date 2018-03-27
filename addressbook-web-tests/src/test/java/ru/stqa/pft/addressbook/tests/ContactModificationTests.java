package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Testname",
                    "Testlastname", "+19999999999", "test@gmail.com", "test1"), true);
        }
        app.getNavigationHelper().goToHomePage();
        app.getContactHelper().editContact();
        app.getContactHelper().fillContactForm(new ContactData("Testname1",
                "Testlastname1", "+19999999999", "test@gmail.com", null), false);
        app.getContactHelper().updateContact();
    }
}
