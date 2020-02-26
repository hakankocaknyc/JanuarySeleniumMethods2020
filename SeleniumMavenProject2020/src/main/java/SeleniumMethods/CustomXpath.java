package SeleniumMethods;


public class CustomXpath {

	public static void main(String[] args) {
		
		//Definition
		
		//htmlTag[@attributeName='value']
		
		// command + f
		
		//input[@id='username']
		//input[@class='form-control input-text' and @placeholder='First Name']
		
		//Dynamic Xpath
		
		//contains()
		//option[contains(text(), 'CRMPRO - $29.95 user/mo.')]
		//option[contains(text(), 'Free Edition')]
		
		//text()
		//i18n-string[text()='Sign up']
		//i18n-string[text()= 'Privacy Policy']
		//i18n-string[contains(text(), 'Privacy Policy')]
		//i18n-string[@data-key='login.footer.privacy'] different
		
		//parent child (sibling)
		//div[@class='private-alert__inner']//h5
		//div[@class='form-group has-feedback']/input[@name='first_name']
		
		// following::
		//div[@class='private-form__input-wrapper']/following::input[@id='password']
		//div[@class='private-form__label-wrapper']/following::input[@id='username']
		
		//preceding::
		//input[@id='password']/preceding::div[@class='private-form__input-wrapper']
		//input[@name='surname']/preceding::div[@class='form-group has-feedback']
		
		//parent::
		//input[@name='surname']//parent::div
		
		//ancestor::
		//input[@name='surname']//ancestor::body
		
		//startwith
		// id = test_123
		

	}

}
