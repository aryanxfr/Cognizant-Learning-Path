# SME Walkthrough: Spring Web Project Structure

This document explains the key components of the Spring Boot project created using Spring Initializr (`spring-learn`) and walks through the essential files and configurations.

---

## 1.`src/main/java` – Application Code

This is the **main source folder** containing:
- Your base package (e.g., `com.cognizant.spring_learn`)
- Application logic such as:
    - Controllers (e.g., `CountryController.java`)
    - Services (e.g., `BookingService.java`)
    - Models/Entities (e.g., `Country.java`)

---

## 2.  `src/main/resources` – Configuration Files

This is where all non-code resources live:
- `application.properties` – for Spring Boot configuration (logging, ports, app name, etc.)
- XML config files – like `country.xml`, `date-format.xml`, etc.
- Static assets or templates if needed

 Files here are also packaged inside the JAR and read at runtime.

---

## 3.`src/test/java` – Unit & Integration Tests

Used for:
- Writing **JUnit tests** to validate application logic
- Mocking dependencies and verifying controller/service behavior

This structure mirrors `src/main/java` to follow the same package organization.

---

## 4. `SpringLearnApplication.java` – Main Class

Located in `src/main/java/com/cognizant/spring_learn/`

### Example:
```java
@SpringBootApplication
public class SpringLearnApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);
    }
}
