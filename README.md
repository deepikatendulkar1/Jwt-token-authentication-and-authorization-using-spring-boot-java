# 🔐 JWT Authentication & Authorization with Spring Boot  
This project demonstrates how to implement JWT-based authentication and authorization in a Spring Boot application using Java. It secures RESTful endpoints using industry-standard practices and showcases Spring Security integration with stateless token-based login.  
## 📌 Description  
Secure Spring Boot API with JWT tokens. Includes login authentication, protected routes, custom filters, and token validation. Designed to showcase best practices in building secure Java backend services.  
## 🛠️ Tech Stack  
- Java 17  
- Spring Boot  
- Spring Security  
- JWT (JSON Web Token)  
- Maven  
## 🧩 Features  
- ✅ User login with credentials  
- ✅ JWT token generation on successful authentication  
- ✅ Custom authentication filter (JwtAuthenticationFilter)  
- ✅ Stateless security configuration  
- ✅ Token validation for protected endpoints  
- ✅ Role-based authorization support (extendable)  
## 📁 Folder Structure  
| Folder / File           | Description                               |  
|--------------------------|-------------------------------------------|  
| controller/              | Exposes /login endpoint for authentication |  
| config/                  | Contains JwtUtils, JwtAuthenticationFilter, and SecurityConfig |  
| model/                   | Data classes for User, JwtRequest, JwtResponse |  
| service/                 | Business logic for authentication and user validation |  
| pom.xml                  | Maven dependencies                        |  
| application.properties   | App config (e.g., secret keys, ports)     |  
## 🚀 Getting Started  
🔧 Prerequisites  
- Java 17+  
- Maven  
- Postman (for testing)  
▶️ Run the App  
./mvnw spring-boot:run  
🧪 Test Endpoints  
1. Login  
POST /login  
Body (JSON):  
{  
  "username": "admin",  
  "password": "admin123"  
}  
Response will return a JWT token.  
2. Access Secured Route  
GET /protected  
Header:  
Authorization: Bearer <JWT_TOKEN>  
## 🔐 Security Highlights  
- Token expiration and validation  
- Bearer token support in headers  
- Centralized JWT utility for encoding/decoding  
- Custom Spring Security configuration  
## 📬 Contact  
📧 deepikatenduulkar5@gmail.com  
🔗 LinkedIn: https://www.linkedin.com/in/deepika-tendulkar-a88bb8166/  
*This project is intended for learning and demonstration purposes. It forms a solid foundation for securing enterprise-level Spring Boot REST APIs.*
