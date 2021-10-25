package guru.qa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class FirstTest {

    @BeforeEach
    void openYandex(){
        open("https://yandex.ru/");
    }
    @AfterEach
    void takeScreen(){
        System.out.println("takeScreen");
    }
    @Test
    void firstTest(){
        System.out.println("YA.ru open");
    }
}
