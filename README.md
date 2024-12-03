### Objective

Your assignment is to write automated test cases for an online shop to test the core functionality of the site.

### Brief

The product team at Waracle has come up with a [simple MVP for an online shop](https://qa-challenge.codesubmit.io). Help the team get confidence in further development by automatically testing the most critical features of the app by doing the following:

### Tasks

-   Compile a list of several testable user flows, cases, or scenarios. This doesn't have to cover every possible real-life case; please focus on what you think is most fundamental (e.g., sign in).

| Site        | URL                                |
| ----------- | ---------------------------------- |
| Online Shop | https://qa-challenge.codesubmit.io |

Make sure to test scenarios for all provided user accounts.

| User                    | Description                                                             |
| ----------------------- | ----------------------------------------------------------------------- |
| standard_user           | The site should work as expected for this user                          |
| locked_out_user         | User is locked out and should not be able to log in.                    |
| problem_user            | Images are not loading for this user.                                   |
| performance_glitch_user | This user has high loading times. Does the site still work as expected? |

-   Implement automated browser tests for all flows. Use any testing technology you'd like – Cypress, Selenium, or any other you think would work well

### Evaluation Criteria

-   **Automation & QA** best practices
-   Show us your work through your commit history
-   We're looking for you to produce working code, with enough room to demonstrate how to structure components in a small program
-   Completeness: did you complete the features?
-   Correctness: does the functionality act in sensible, thought-out ways?
-   Maintainability: is it written in a clean, maintainable way?

### CodeSubmit

Please organize, design, test and document your code as if it were going into production - then push your changes to the master branch. After you have pushed your code, you may submit the assignment on the assignment page.

**Have fun building!** 🚀

The Waracle Team

*************************************

README: Automation Testing Framework

Overview
This is a Selenium-based automation testing framework using the Page Object Model (POM) and BDD approach with Cucumber. It supports multi-browser testing, logging, and parallel execution.

Prerequisites
Java (JDK 8 or above)
Maven (build tool)
Browser Drivers (Managed via WebDriverManager)
IDE (IntelliJ IDEA, Eclipse, etc.)

Setup

git clone <repository-url>

Install Dependencies: Run the following Maven command:

mvn clean install

How to Run Tests
Sequential Execution:

Run TestRunner.java directly from the IDE.

Parallel Execution:

Run ParallelRun.java for parallel execution.
 mvn command 
 mvn clean test


Features
BDD with Cucumber: Tests written in Gherkin syntax for readability.
Page Object Model (POM): Clean and modular code.
Multi-Browser Support: Test on different browsers.
Logging: Logs for better debugging.
Parallel Execution: Faster test runs.


