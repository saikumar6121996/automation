package org.step;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Reusableclass {
@Before
public void beforeDate() {
	dateandTime();
}

@After
public void afterDate() {
	dateandTime();

}

}
