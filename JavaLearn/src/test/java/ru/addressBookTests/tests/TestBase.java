package ru.addressBookTests.tests;
//Данный класс содержит общие методы для всех тестов.
// Перед запуском теста, в классе создается новый объект app = new ApplicationManager() в который по средствам делегирования перенесены все общие методы для всех тестов
// тепреь при запуске тестов создаетется новый объект и вызываются методы из него, после окончания теста объект разрушается.

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.addressBookTests.appmanager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        app.stop();
    }

    public ApplicationManager getApp() {
        return app;
    }
}
