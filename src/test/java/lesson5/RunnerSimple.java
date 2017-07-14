package lesson5;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import ru.sbt.lesson5.steps.YaSteps;


/**
 * Created by dmitriy on 24.06.17.
 */

@RunWith(SerenityRunner.class)
public class RunnerSimple {
    @Managed
    WebDriver driver;

    @Steps
    YaSteps yaSteps;

    @Test
    public void simpleTestYaPage() throws InterruptedException {
        yaSteps.openYa();
        yaSteps.init("max_koval31278", "0607KMa9269");
        yaSteps.write();
        yaSteps.send(" max_koval31278@mail.ru", "pro", "Send");
        Assert.assertEquals("Ваше письмо отправлено. Перейти во Входящие", yaSteps.check());

    }
}
