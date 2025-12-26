# JPetStore Automation Testing Project

This is a Selenium WebDriver-based test automation framework for the JPetStore application using TestNG and Maven.

## Project Overview

This SDET (Software Development Engineer in Test) project implements automated testing for the JPetStore e-commerce application, covering functionality across multiple product categories including Birds, Cats, Dogs, Fish, and Reptiles.

## Technology Stack

- **Language**: Java
- **Test Framework**: TestNG
- **Automation Tool**: Selenium WebDriver
- **Build Tool**: Maven
- **Reporting**: Extent Reports
- **Logging**: Log4j2
- **IDE**: Eclipse

## Project Structure

```
SDET_10_JPetStore/
├── src/
│   ├── main/
│   │   └── java/com/JPetStore/
│   │       ├── base/          # BaseClass for common functionality
│   │       ├── Pages/         # Page Object Model classes
│   │       └── Utility/       # Utility classes (logging, waits, reports)
│   └── test/
│       ├── java/com/JPetStore/Test/   # Test classes
│       └── resources/         # Configuration files
├── pom.xml                    # Maven configuration
├── testng.xml                 # TestNG configuration
└── Extent_Reports/            # Test reports
```

## Page Object Model (POM)

The project follows the Page Object Model pattern with separate page classes:
- `LoginPage.java` - Login functionality
- `RegisterationPage.java` - User registration
- `BirdsOrderPage.java` - Bird products
- `CatOrderPage.java` - Cat products
- `DogOrderPage.java` - Dog products
- `FishOrderPage.java` - Fish products
- `ReptilesOrderPage.java` - Reptile products
- `BillPage.java` - Billing/Checkout

## Utilities

- **ExtentManager** - Manages Extent Report generation
- **ExtentLogger** - Logs test execution details
- **WaitUtils** - Handles explicit waits
- **LoggerUtil** - Logs to file using Log4j2

## Setup Instructions

1. **Prerequisites**
   - JDK 8 or higher
   - Maven 3.6+
   - Git

2. **Clone the Repository**
   ```bash
   git clone https://github.com/Rohit-0319/Automation_Project_JPetStore.git
   cd SDET_10_JPetStore
   ```

3. **Install Dependencies**
   ```bash
   mvn clean install
   ```

4. **Configure Properties**
   - Update `src/test/resources/config.Properties` with your test environment details

## Running Tests

**Run all tests:**
```bash
mvn test
```

**Run specific test class:**
```bash
mvn test -Dtest=LoginTest
```

**Run with TestNG:**
```bash
mvn test -DsuiteXmlFile=testng.xml
```

## Test Reports

- **Extent Reports**: `Extent_Reports/ExtentReport.html`
- **TestNG Reports**: `test-output/index.html`
- **Surefire Reports**: `target/surefire-reports/`

## Test Coverage

The project includes test automation for:
- User Login and Registration
- Product Browsing and Selection
- Shopping Cart Operations
- Order Placement
- Billing and Checkout

## Logging

Logs are generated in the `logs/` directory using Log4j2 configuration.

## Author

Rohit

## License

This project is proprietary and intended for testing purposes only.
