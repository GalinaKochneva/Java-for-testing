package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getContactHelper().editContact();
        app.getContactHelper().fillContactForm(new ContactData("Testname1",
                "Testlastname1", "+19999999999", "test@gmail.com", null), false);
        app.getContactHelper().updateContact();
    }
}
