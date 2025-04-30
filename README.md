# Spring REST Employee Management System

This is a simple RESTful web application built using Spring MVC and Hibernate. It performs CRUD operations on an `Employee` database table using MySQL as the backend.

## ✅ Features

- Create, Read, Update, Delete (CRUD) employee records
- Global exception handling with custom messages
- Java-based configuration (no XML)
- RESTful API using Spring MVC
- Transaction management with Hibernate

## 🛠 Technologies Used

- Java 17+
- Spring MVC
- Hibernate 5
- MySQL
- C3P0 (Connection Pooling)
- Maven (for dependency management)

## 🔧 Project Structure

com.sultan.spring.rest ├── configuration # Spring + Hibernate Config ├── controller # (Missing in code but assumed to exist) ├── dao # Data Access Layer (DAO + Impl) ├── entity # Hibernate Entity Class ├── exceptoinHandling # Custom Exceptions + Handler ├── service # Business Logic Layer


## 📦 How to Run

1. **Set up MySQL Database**
    ```sql
    CREATE DATABASE my_db;
    ```

2. **Create `employees` Table**
    ```sql
    CREATE TABLE employees (
        id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(50),
        surname VARCHAR(50),
        department VARCHAR(50),
        salary INT
    );
    ```

3. **Configure application**
    - `MyConfig.java`: Update DB credentials if needed.

4. **Run the Application**
    - Build and deploy using a servlet container (Tomcat).
    - Or run using your IDE (like IntelliJ or Eclipse).

5. **Test Endpoints (example)**
    - `GET /api/employees` — list all employees
    - `GET /api/employees/{id}` — get employee by ID
    - `POST /api/employees` — create/update employee
    - `DELETE /api/employees/{id}` — delete employee

## 🧪 Example JSON for POST/PUT

```json
{
  "name": "John",
  "surname": "Doe",
  "department": "IT",
  "salary": 9000
}


⚠️ Exception Handling

NoSuchEmployeeException: Thrown when employee with specified ID does not exist.
EmployeeIncorrectData: Custom error wrapper returned with meaningful message.
📞 Contact

Project created by Sultan Yermakhan
For issues or contributions, please open a pull request or create an issue.
THANK YOU 
