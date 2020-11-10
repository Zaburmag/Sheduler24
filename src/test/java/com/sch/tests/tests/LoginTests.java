package com.sch.tests.tests;

import com.sch.tests.fw.ApplicationManager;
import com.sch.tests.model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    private ApplicationManager ap;

    @Test
    public void testLogin() throws InterruptedException {
        app.getUserHelper().fillLoginForm(new User().withEmail("nomi@11.com").withPassword("Mamasita1"));
        app.getUserHelper().tapLoginButton();
        app.getUserHelper().closeKeyboard();
        Thread.sleep(5000);

        Assert.assertFalse(app.getUserHelper().isLoginButtonPresent());



    }
}
