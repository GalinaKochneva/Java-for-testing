package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.getContactHelper().goToAddNewPage();
        app.getContactHelper().fillContactForm(new ContactData("Testname", "Testlastname", "+19999999999", "test@gmail.com"));
        app.getContactHelper().submitContactCreation();
    }

}
