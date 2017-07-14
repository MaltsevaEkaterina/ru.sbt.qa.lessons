package ru.sbt.lesson5.steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import ru.sbt.lesson5.pages.Ya;

/**
 * Created by dmitriy on 22.06.17.
 */
public class YaSteps {
    public Ya yaPage;

    @Step("Открыта страница Ya")
    public void openYa() {
        yaPage.open();
    }

    @Step("Выполнить вход в почту")
    public void init(String login, String password) {
        yaPage.inputLogin.type(login);
        yaPage.inputPassword.type(password);
        yaPage.btnSearch.click();
    }

    @Step("Отправить письмо")
    public void send(String whom, String topic, String text) throws InterruptedException {
        yaPage.inputWhoom.sendKeys(whom);
        yaPage.inputTopic.sendKeys(topic);
        yaPage.getDriver().switchTo().frame(yaPage.getDriver().findElement(By.xpath("//iframe[contains(@id , 'toolkit')]")));
        yaPage.inputText.sendKeys(text);
        yaPage.getDriver().switchTo().parentFrame();
        yaPage.btnSend.click();
    }

    @Step("Написать письмо")
    public void write(){
        yaPage.btnWrite.click();
    }

    @Step("Проверить отправку письма")
    public String check(){
        return yaPage.getResult.getText();
    }


}
