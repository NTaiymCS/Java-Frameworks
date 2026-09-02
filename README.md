<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNORS UNIVERSITY 
# Nan Taiym
#B - Updated README 

#C - Change Shop Name

- Filename: mainscreen.html
- Line: 19
- Change: Changed the shop name displayed on the main screen to "GameForge PC."

#D - About Page

- Filename: mainscreen.html
- Line: 20
- Change: Added an About button that links to the custom About page.

- Filename: MainScreenControllerr.java
- Lines: 55-57
- Change: Added the controller mapping for the About page.

- Filename: about.html
- Lines: 10-18
- Change: Added the About heading, company description, and link back to the main screen.

#E - Sample Inventory

- Filename: BootStrapData.java
- Lines: 35-81
- Change: Added five parts that are created when the part inventory is empty.

- Filename: BootStrapData.java
- Lines: 84-96
- Change: Added five products that are created when the product inventory is empty.

#F - Buy Now

- Filename: AddProductController.java
- Lines: 176-188
- Change: Added the Buy Now function that decreases product inventory by one when inventory is available and displays a success or failure message.

- Filename: mainscreen.html
- Lines: 22-23
- Change: Added a message area to display the purchase result.

- Filename: mainscreen.html
- Line: 94
- Change: Added the Buy Now button next to the product Update and Delete buttons.

#G - Minimum and Maximum Inventory

- Filename: Part.java
- Lines: 32-33
- Change: Added minimum and maximum inventory fields.

- Filename: Part.java
- Lines: 84-97
- Change: Added getters and setters for minimum and maximum inventory.

- Filename: mainscreen.html
- Lines: 42-43, 52-53
- Change: Added minimum and maximum inventory columns to the parts table.

- Filename: InhousePartForm.html
- Lines: 23-24
- Change: Added minimum and maximum inventory input fields.

- Filename: OutsourcedPartForm.html
- Lines: 24-25
- Change: Added minimum and maximum inventory input fields.

- Filename: application.properties
- Line: 6
- Change: Changed the persistent H2 database name to D287-013019389.

#H - Inventory Validation

- Filename: ValidPartInventory.java
- Lines: 11-18
- Change: Added validation to make sure inventory stays between the minimum and maximum values.

- Filename: ValidPartInventoryAnnotation.java
- Lines: 8-17
- Change: Added the custom validation annotation and inventory error message.

- Filename: Part.java
- Line: 19
- Change: Applied the inventory validation annotation to the Part class.

- Filename: InhousePartForm.html
- Lines: 25-27
- Change: Added an error message for inventory values outside the minimum and maximum.

- Filename: OutsourcedPartForm.html
- Lines: 26-28
- Change: Added an error message for inventory values outside the minimum and maximum.

#I - Unit Tests

- Filename: PartTest.java
- Lines: 159-170
- Change: Added unit tests for minimum and maximum inventory values.


## D287 – JAVA FRAMEWORKS
Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage existing frameworks, assets, and content for object-oriented programming.
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this project, you will use the Integrated Development Environment (IDE) link in the web links section of this assessment to install the IDE, IntelliJ IDEA (Ultimate Edition). All relevant links are on the course page. Please refer to the course of study for specific links. You will sign up for a free student license using your WGU.edu email address. Please see the “IntelliJ Ultimate Edition Instructions” attachment for instructions on how do this. Next you will download the “Inventory Management Application Template Code” provided in the web links section and open it in IntelliJ IDEA (Ultimate Edition). You will upload this project to a private external GitLab repository and backup regularly. As a part of this, you have been provided with a base code (starting point). 

## SUPPLEMENTAL RESOURCES  
1.	How to clone a project to IntelliJ using Git?

> Ensure that you have Git installed on your system and that IntelliJ is installed using [Toolbox](https://www.jetbrains.com/toolbox-app/). Make sure that you are using version 2022.3.2. Once this has been confirmed, click the clone button and use the 'IntelliJ IDEA (HTTPS)' button. This will open IntelliJ with a prompt to clone the proejct. Save it in a safe location for the directory and press clone. IntelliJ will prompt you for your credentials. Enter in your WGU Credentials and the project will be cloned onto your local machine.  

2. How to create a branch and start Development?

- GitLab method
> Press the '+' button located near your branch name. In the dropdown list, press the 'New branch' button. This will allow you to create a name for your branch. Once the branch has been named, you can select 'Create Branch' to push the branch to your repository.

- IntelliJ method
> In IntelliJ, Go to the 'Git' button on the top toolbar. Select the new branch option and create a name for the branch. Make sure checkout branch is selected and press create. You can now add a commit message and push the new branch to the local repo.

## SUPPORT
If you need additional support, please navigate to the course page and reach out to your course instructor.
## FUTURE USE
Take this opportunity to create or add to a simple resume portfolio to highlight and showcase your work for future use in career search, experience, and education!
