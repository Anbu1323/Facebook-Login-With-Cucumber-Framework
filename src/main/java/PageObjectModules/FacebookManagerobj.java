package PageObjectModules;

import org.openqa.selenium.WebDriver;

public class FacebookManagerobj {

	public WebDriver test;

	private Loginpagerepo lr;
	private Createnewaccountrepo cnar;
	private Fbverificationrepo fbv;

	public FacebookManagerobj(WebDriver test2) {
		this.test = test2;
	}

	public Loginpagerepo Home_page() {
		if (lr == null) {
			lr = new Loginpagerepo(test);
		}
		return lr;
	}

	public Createnewaccountrepo Register_account() {
		if (cnar == null) {
			cnar = new Createnewaccountrepo(test);
		}
		return cnar;
	}

	public Fbverificationrepo Verification_Field() {
		if(fbv==null) {
			fbv = new Fbverificationrepo(test);
		}
		return fbv;
	}
}
