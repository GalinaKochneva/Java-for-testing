package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
    public ContactHelper(FirefoxDriver wd) {
        super (wd);
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
//        wd.findElement(By.name("searchstring")).click();
//        wd.findElement(By.name("searchstring")).sendKeys("\\224");
    }

    public void click(By locator) {
        wd.findElement(locator)
                .click();
        //wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstName());
//        wd.findElement(By.name("middlename")).click();
//        wd.findElement(By.name("middlename")).clear();
//        wd.findElement(By.name("middlename")).sendKeys();
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("mobile"), contactData.getMobile());
        type(By.name("email"), contactData.getEmail());
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void goToAddNewPage() {
        click(By.linkText("add new"));
    }

    public void deleteSelectedContacts() {
        click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
        wd.switchTo().alert().accept();
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }
}
