package guru.qa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;



public class TestBoxTest {

    @BeforeEach
     void beforeAll(){
       Configuration.startMaximized = true;

    }

    @Test
    void fillFormTest(){
        open("https://demoqa.com/text-box");
        $("[id=userName]").setValue("Some name");
        $("#userEmail").setValue("aaa@gmail.com");
        $("#currentAddress").setValue("Moscow");
        $("#permanentAddress").setValue("Moscow 1");
        $("#submit").scrollIntoView(true).click();
        $("#output #name").shouldHave((text("Some name")));
        $("#output").$("#email").shouldHave((text("aaa@gmail.com")));
        $("#output").$("#currentAddress").shouldHave((text("Moscow")));
        $("#output").$("#permanentAddress").shouldHave((text("Moscow 1")));
    }
}
