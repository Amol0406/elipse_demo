package com15dec;
 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


             public class loginpage {
	         @Test (enabled = false) //1
	         public void tesyweb() {
		     WebDriver driver = new  ChromeDriver();
		     driver.get("https://www.saucedemo.com/");
		     driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		     driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		     driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		     String actualresult = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div")).getText();
		     String expectedresult = "Swag Labs";
	}
	        @Test (enabled = false) //2
	        public void invalidlogincredentials() {
	    	WebDriver driver = new  ChromeDriver();
	 		driver.get("https://www.saucedemo.com/");
	 		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_");
	 		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_");
	 		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	     	String actualresult =	driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
	        String  expectedresult = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3";
	        Assert.assertEquals(actualresult, expectedresult);
	     }
	            @Test  (enabled = false) //3
	             public void withoutvaluecredentials() {
	    	     WebDriver driver = new  ChromeDriver();
		 		 driver.get("https://www.saucedemo.com/");
		 		 driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
		 		 driver.findElement(By.xpath("//*[@id=\"password\"]"));
		 		 driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		 	     String actualresult = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
		 	     String expectedresult = "Epic sadface: Username is required";
		 	     Assert.assertEquals(actualresult, expectedresult);
	     }
	     
	              @Test   (enabled = false) //4
	              public void checkdashboard() {
	    	      WebDriver driver = new  ChromeDriver();
	 		      driver.get("https://www.saucedemo.com/");
	 		      driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	 		      driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	 		      driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	 		      String actualresult = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
	 		      String expectedresult = "Products";
	     }
	 			  @Test  (enabled = false)   //5
        
	 		        public void selectmenu() {
	 		    	 WebDriver driver = new  ChromeDriver();
	 		 		 driver.get("https://www.saucedemo.com/");
	 		 		 driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	 		 		 driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	 		 		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	 		 		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
	 		 		
	 			 }
	 			              @Test  (enabled = false)                   //6
	 	        
	 		                 public void selectoption() {
	 		    	         WebDriver driver = new  ChromeDriver();
	 		 		         driver.get("https://www.saucedemo.com/");
	 		 		         driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	 		 		         driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	 		 		         driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	 		 		         WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
	 		 		         dropdown.click();
	 		 		         Select sc = new Select(dropdown);
	 		 		sc.selectByIndex(3);
	 		 		
	 		 		
	 		 		
	 		 		
	 			 }
	 			              @Test   (enabled = false)    //7                
		 	        
	 		                  public void addtwocard() {
	 		    	          WebDriver driver = new  ChromeDriver();
	 		 		          driver.get("https://www.saucedemo.com/");
	 		 		          driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	 		 		          driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	 		 		          driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	 		 		          String actualresult = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
	 		 		          String expectedresult = "Sauce Labs Backpack";
	 		 		          Assert.assertEquals(actualresult, expectedresult);
	 			 }

                        @Test    (enabled = false)  // 8              
                        public void testlowhigh() {
	                    WebDriver driver = new  ChromeDriver();
		                driver.get("https://www.saucedemo.com/");
		                driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		                driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		                driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		                WebElement menu =   driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		                 menu.click();
		                 Select sc = new Select(menu);
		                 sc.selectByContainsVisibleText("price (low to high)");
		              //   sc.selectByIndex(3);
		                 String actualresult = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[5]/div[2]/div[2]/div")).getText();
		                 String expectedresult = "$7.99";
		                 Assert.assertEquals(actualresult, expectedresult);
                        }

                        
                        @Test     (enabled = false) // 9             
                        public void highlow() {
	                    WebDriver driver = new  ChromeDriver();
		                driver.get("https://www.saucedemo.com/");
		                driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		                driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		                driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		                 WebElement dropdown =  driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		                 dropdown.click();
		                 Select sc = new Select(dropdown);
		                 sc.selectByIndex(3);
		                 String actualresult =    driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[4]/div[2]/div[2]/div")).getText();
		                 String expectedresult = "$49.99";
		                 Assert.assertEquals(actualresult,expectedresult);
		                 
		                 
                        }
                        @Test    (enabled = false)  // 10            
                        public void checkoderztoA() {
	                    WebDriver driver = new  ChromeDriver();
		                driver.get("https://www.saucedemo.com/");
		                driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		                driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		                driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		                WebElement dr = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
		                dr.click();
		                Select sel = new Select(dr);
		                  sel.selectByIndex(1);
		                 String actual = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText();
		                 String expected = "$15.99";
                        }
                        @Test   (enabled = false)  // 11            
                        public void testremovefromcard() {
	                    WebDriver driver = new  ChromeDriver();
		                driver.get("https://www.saucedemo.com/");
		                driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		                driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		                driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
		                System.out.println(1);
		                driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		                System.out.println(2);
		                driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-fleece-jacket\"]")).click();
		                System.out.println(3);
		                String  actualcardmessage = driver.findElement(By.xpath("//*[@class='card_footer']/div")).getText();
		                String expectedcardmessage = "your card is empty";
		                Assert.assertEquals(actualcardmessage, expectedcardmessage);
                        }
                        
                        
                        
                        
                        @Test    (enabled = false)  // 12           
                        public void checkall() {
	                    WebDriver driver = new  ChromeDriver();
		                driver.get("https://www.saucedemo.com/");
		                driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		                driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		                driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		                driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("srk");
		                driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("don");
		                driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("411024");
		                driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
		                String actualresult =   driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText();
		                String expectedresult = "Thank you for your order!";
		                Assert.assertEquals(actualresult, expectedresult);
		                
		                
                        }
                        @Test   (enabled = false)   // 13          
                        public void verifyitemcount() {
	                    WebDriver driver = new  ChromeDriver();
		                driver.get("https://www.saucedemo.com/");
		                driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		                driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		                driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		              //  driver.findElement(By.xpath("//*[@id=\\\"shopping_cart_container\\\"]/a")).click();
		                driver.findElement(By.id("shopping_cart_container")).getText();
		               WebElement  cartbadge  = driver.findElement(By.id("shopping_cart_container"));
		               String cartext = cartbadge.getText();
		               System.out.println("print no of item" + cartext +"items" );
		               Assert.assertTrue(cartext.contains("1"));
                        }
                        @Test  (enabled = false)  // 14         
                        public void checkcontinueshopmenu() {
	                    WebDriver driver = new  ChromeDriver();
		                driver.get("https://www.saucedemo.com/");
		                driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		                driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		                driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();
		                driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		                driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]")).click();
		                String actualresult =  driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div")).getText();
		                String expectedresult =  "Swag Labs";
		                Assert.assertEquals(actualresult, expectedresult);
                        }
                        @Test (enabled = false) // 15 
                        public void verifycountf2() {
	                    WebDriver driver = new  ChromeDriver();
		                driver.get("https://www.saucedemo.com/");
		                driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		                driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		                driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		                WebElement  srk  = driver.findElement(By.id("shopping_cart_container"));
		                String smin = srk.getText();
		                System.out.println("total item"+ smin +"items");
		                Assert.assertTrue(smin.contains("2"));
                        }
                        @Test  (enabled = false)// 16       
                        public void removeoneItemfrotwo() {
	                    WebDriver driver = new  ChromeDriver();
		                driver.get("https://www.saucedemo.com/");
		                driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		                driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		                driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).click();
		                WebElement  srk =   driver.findElement(By.id("//*[@id=\"shopping_cart_container\"]/a"));
		                String smin = srk.getText();
		                driver.close();
		                Assert.assertEquals(smin, "1");
                        }
                        @Test  // 17     
                        public void removeoneItemfrotwolist () {
	                    WebDriver driver = new  ChromeDriver();
		                driver.get("https://www.saucedemo.com/");
		                driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		                driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		                driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		                driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-bolt-t-shirt\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-fleece-jacket\"]")).click();
		                driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-onesie\"]")).click();
		                WebElement  srk =   driver.findElement(By.id("shopping_cart_container"));
		                String smin =srk.getText();
		                Assert.assertEquals(smin, "1");
		                
		                
		                
		                
		                
		                
		                
		                
		                
		                
		                
		                
		                
		               		                
		                
		                
		                
		                
		                
		                
                        
		                
		                
		                
		                
		                
		                
		                
		                
		                
		                
                        
                        
		               
		               
		              
		                
		                
		                
		                
		                
		                
		                
		            
		                
		                
		                
		                
                        }
                        
		                
                        
                        
                        

                        

                      
		                
		                
		                
		                
		                
		              
		                
		                
		                
		              




		                 
		                 
		                 
		                  
		                  
		                  
		                  
		                 

		               


}
