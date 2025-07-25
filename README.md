# 🧾 Customer Relationship Management (CRM) - CRUD Web Application (Thymeleaf + Bootstrap)

A web-based CRM application built using **Spring Boot 3.x**, **Spring Web MVC**, **Thymeleaf**, and **Bootstrap 5**. It supports full **CRUD operations** for managing customer records with a modern UI and layered architecture.

---

## 🚀 Tech Stack

- Spring Boot 3.x
- Spring Web MVC
- Spring Data JPA
- Thymeleaf (View layer)
- Bootstrap (Styling and Layout)
- Lombok
- MySQL (or H2 for in-memory testing)

---

## 🎯 Features

- View, add, update, and delete customer records
- Form validation and error handling
- Bootstrap-styled responsive UI
- Clean separation of layers: controller, service, DAO, model
- Uses Lombok to reduce boilerplate

---

## 📂 Project Structure

```plaintext
src/
└── main/
    ├── java/
    │   └── com/abhi/
    │       ├── controller/
    │       ├── dao/
    │       ├── model/
    │       ├── service/
    │       └── BootMvcCrmCrudappThymeleafApplication.java
    ├── resources/
    │   ├── static/
    │   │   └── index.html
    │   ├── templates/
    │   │   └── customers/
    │   │       ├── customer-form.html
    │   │       └── list-customers.html
    │   └── application.properties
```

---

## 🛠 How to Run This Project

1. **Clone the Repository**
   ```bash
   git clone https://github.com/abhi1-byte/springbootmvc-crm-thymeleaf-bootstrap.git
   cd springbootmvc-crm-thymeleaf-bootstrap
   ```

2. **Open in IntelliJ or Eclipse**
   - Open the project folder as a Maven project

3. **Install Lombok Plugin**
   - Preferences > Plugins → Search for **Lombok** → Install
   - Preferences > Build, Execution, Compiler > Annotation Processors → ✅ Enable annotation processing

4. **Set Up the Database**

   **Option 1: MySQL**
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/crm_db
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

   **Option 2: H2 (In-Memory)**
   ```properties
   spring.datasource.url=jdbc:h2:mem:crm_db
   spring.datasource.driverClassName=org.h2.Driver
   spring.datasource.username=sa
   spring.datasource.password=
   spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
   spring.jpa.hibernate.ddl-auto=update
   spring.h2.console.enabled=true
   ```

5. **Run the Application**
   - **In IntelliJ:** Right-click on `BootMvcCrmCrudappThymeleafApplication.java` and select **Run**
   - **Or using terminal:**
     ```bash
     mvn spring-boot:run
     ```

6. **Access the App:**  
   Open your browser and go to: [http://localhost:9999/crm](http://localhost:8080/customers)

---

## 🧠 Learning Highlights

- Built using **Spring Boot 3.x** with layered architecture
- Implemented **Thymeleaf** for clean and dynamic HTML rendering
- Used **Bootstrap** for responsive UI and styling
- Configured **Spring Data JPA** for database operations
- Managed routing and form-binding using **Spring Web MVC**
- Leveraged **Lombok** to simplify entity and model classes

---
