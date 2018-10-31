package com.ebay.app.stepDefinitions;

import com.ebay.app.helpers.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    TestContext testContext;

    public Hooks(TestContext context) {
        testContext = context;
    }

    @Before
    public void BeforeSteps() {
		/*
			Here, it has not been started the driver in the @Before method,
			because It have been doing the same in the TestContext class constructor.
			Because our PageObjectModel needs the driver at the early stage.
		*/
    }

    @After
    public void AfterSteps() {
        //testContext.getWebDriverManager().closeDriver();
    }
}
