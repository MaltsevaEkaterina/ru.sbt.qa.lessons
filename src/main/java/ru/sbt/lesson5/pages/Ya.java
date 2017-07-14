package ru.sbt.lesson5.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Created by dmitriy on 22.06.17.
 */
@DefaultUrl("https://mail.ru/")
public class Ya extends PageObject {


    @FindBy(id = "mailbox__login")
    public WebElementFacade inputLogin;

    @FindBy(id = "mailbox__password")
    public WebElementFacade inputPassword;

    @FindBy(id = "mailbox__auth__button")
    public WebElementFacade btnSearch;

    @FindBy(xpath = "//div[@id='LEGO']//a[1]")
    public WebElementFacade btnWrite;

    @FindBy(xpath = "//div/textarea[@tabindex='4']/..")
    public WebElementFacade inputWhoom;

    @FindBy(name = "Subject")
    public WebElementFacade inputTopic;

    @FindBy(id = "tinymce")
    public WebElementFacade inputText;

    @FindBy(xpath = "//div/span[text() = 'Отправить']/..")
    public WebElementFacade btnSend;

    @FindBy(xpath = "//div[@class='message-sent__title']/..")
    public WebElementFacade getResult;

}
