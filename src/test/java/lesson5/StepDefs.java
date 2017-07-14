package lesson5;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import ru.sbt.lesson5.steps.YaSteps;

/**
 * Created by dmitriy on 22.06.17.
 */

public class StepDefs {
    @Steps
    YaSteps yaSteps;

    @Дано("открыта страница почты mail")
    public void openPageYa(){
        yaSteps.openYa();
    }

    @Когда("Выполнен вход на аккаунт почты")
    public void initPage(String login, String password){
        yaSteps.init(login, password);
    }

    @Когда("Пишем письмо")
    public void writeLetter(){
        yaSteps.write();
    }

    @Когда("Отправленно письмо")
    public void send(String whom, String topic, String text) throws InterruptedException {
        yaSteps.send(whom, topic, text);
    }

    @Тогда("Проверка отправки")
    public void thenYa() {
        Assert.assertEquals("Ваше письмо отправлено. Перейти во Входящие", yaSteps.check());
    }
}
