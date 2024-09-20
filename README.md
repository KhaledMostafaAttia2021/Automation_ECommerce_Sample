Sample - Automation Testing Project - ECommerce Applicaion

--- *Prerequisites* ---

A. JDK Version: JDK 23

B. Used IDE: 
   Eclipse IDE for Java Developers (includes Incubating components)
   Version: 2024-06 (4.32.0)
   Build id: 20240606-1231
   OS: Windows 11, v.10.0, x86_64 / win32
   Java vendor: Eclipse Adoptium
   Java runtime version: 21.0.4+7-LTS
   Java version: 21.0.4

C. Used Frameworks
   (1) Maven
   (2) TestNG
   (3) Page Object Model
   (4) Git

C. Maven Dependencies: 
   (1) selenium-java
   (2) webdrivermanager (To Download, Setup, maintenance) Drivers
   (3) testng
   (4) slf4j-simple (The Simple Logging Facade for Java) 
   (5) assertj-core .... For Assertion.
   (6) junit-bom
   (7) junit-jupiter-api
   (8) junit-jupiter-params

---*Implemented Browsers*---
We are using webdrivermanager which supports the following browser and automatically downloads OS specific binaries for:
- Chrome Headless (default) 
- Chrome

---*Full control over certain test methods and classes by annotations*---
The project includes custom annotations to comfortably set some test conditions and/or assumptions like skip/require certain tests on execution with specific browsers and/or override driver options like browser dimension, headers, cookies, etc. This will increase the possibility to write easily readable and flexible tests.

@Browser
Overwrite used (default) browser by annotating test classes or test methods with:
@Browser(use = CHROME)


---*Take Screenshots*---
On test failures screenshots will automatically be taken and stored under build/screenshots. The screenshot files will be named with a combination of the class name and the test method name.

🚨 Assertions
Fluentlenium extends AssertJ with FluentWebElement, FluentList and FluentPage custom assertions. Therefore We are able to write more intuitive and selenium specific assertions to give us the possibility to easily assert things like if an element is displayed etc.

⏱️ Waits
Testing web applications that are asynchroniously loading / rerendering parts of the page can become hard to test with Selenium. Awaitility is a DSL that allows us to express expectations of an asynchronous system in a concise and easy to read manner and is therefore added to this project.




📍 Instruction to setup and run tha automated test suite:-
1. Open Eclipse IDE.
2. Navigate to the project folder.
3. Right click on the project folder.
4. From the Side Navigation Dropdown menu, navigate to the option Run As (TestNG Test).
5. Click on TestNG Test.
6. The testing result will be displayed on the Tab "Results of running classes" once the running tests finished, So we can identify how many tests passed and how many tests failed.


Please refer to the below screenshot and video.

https://drive.google.com/file/d/17BHygXRRIAI1StPgIJ6s32w-57rkToFH/view?usp=sharing

https://drive.google.com/file/d/1OMTeu5MOuYkGsHwMGM9OeHUjbS5HHFKd/view?usp=drive_link

📍Steps to get Testing Report:-
1. After running test suite, we will get file index.html under the foler "test-output"
2. Get the url from properties and open the html file through the browser.
3. We will get the testing report (How many tests passed and how many tests failed).

   Please refer to the below screenshot.

 https://drive.google.com/file/d/1Q5_tL-dy6mQJ6a4AS_8pPxzRY-wDi6N-/view?usp=drive_link




Thank you.
