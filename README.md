# Cars Backend

A RESTful API backend service for managing used car sales data built with Spring Boot 3.5.6 and Java 21.

## Features

- RESTful API for used car sales management
- Comprehensive search functionality with multiple parameters
- Support for both MySQL and H2 databases
- Interactive API documentation with Swagger/OpenAPI
- H2 Console for database management (H2 profile)
- Cross-origin resource sharing (CORS) enabled

## Technology Stack

- **Framework:** Spring Boot 3.5.6
- **Language:** Java 21
- **Build Tool:** Maven
- **Database:** MySQL 8+ / H2 (in-memory)
- **ORM:** Hibernate / JPA
- **API Documentation:** SpringDoc OpenAPI 2.8.13
- **Testing:** JUnit 4.13.2, Google Truth 1.4.5

## Prerequisites

- Java 21 or higher
- Maven 3.9+
- MySQL 8+ (for production/mysql profile)

## Project Structure

```
cars-backend/
├── src/
│   ├── main/
│   │   ├── java/id/my/hendisantika/carsbackend/
│   │   │   ├── controller/      # REST API endpoints
│   │   │   ├── entity/          # JPA entities
│   │   │   ├── model/           # DTOs and request/response models
│   │   │   ├── repository/      # Data access layer
│   │   │   ├── service/         # Business logic layer
│   │   │   └── util/            # Utility classes
│   │   └── resources/
│   │       ├── application.properties  # MySQL configuration
│   │       ├── application-h2.yml      # H2 profile configuration
│   │       ├── schema.sql              # Database schema
│   │       ├── data.sql                # Sample data
│   │       └── yml/                    # Additional profile configs
│   └── test/                    # Test classes
├── pom.xml
└── README.md
```

## Database Configuration

### MySQL (Default Profile)

The application is configured to use MySQL by default. Update `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/cars?createDatabaseIfNotExist=true&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Asia/Jakarta&useSSL=false&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=root
```

### H2 (Development Profile)

For development and testing, you can use the H2 in-memory database:

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=h2
```

Note: The H2 profile uses a schema compatible with MySQL MODE.

## Build and Run

### 1. Clone the Repository

```bash
git clone <repository-url>
cd cars-backend
```

### 2. Build the Project

```bash
mvn clean install
```

### 3. Run the Application

#### Using Maven (Recommended for Development)

```bash
# With MySQL
mvn spring-boot:run

# With H2
mvn spring-boot:run -Dspring-boot.run.profiles=h2
```

#### Using JAR

```bash
# Build the JAR
mvn package

# Run with MySQL
java -jar target/cars-backend-0.0.1-SNAPSHOT.jar

# Run with H2
java -jar target/cars-backend-0.0.1-SNAPSHOT.jar --spring.profiles.active=h2
```

The application will start on `http://localhost:8080`

## API Documentation

Once the application is running, access the Swagger UI at:

```
http://localhost:8080/swagger-ui.html
```

Or view the OpenAPI specification at:

```
http://localhost:8080/v3/api-docs
```

## API Endpoints

### Get Cars with Search Parameters

```
GET /cars
```

#### Query Parameters

| Parameter        | Type   | Description                            |
|------------------|--------|----------------------------------------|
| maker            | String | Car manufacturer (e.g., Toyota, Honda) |
| model            | String | Car model name                         |
| year             | String | Manufacturing year or range            |
| odometer         | String | Odometer reading or range              |
| vehicleCondition | String | Condition of the vehicle               |
| states           | String | State/location                         |
| customDate       | String | Custom date filter                     |
| saleCategory     | String | Category of sale                       |
| badges           | String | Car badges/trim                        |
| bodyType         | String | Body type (sedan, SUV, etc.)           |
| bodyTypeConfig   | String | Body type configuration                |
| fuelType         | String | Fuel type (petrol, diesel, electric)   |
| transmission     | String | Transmission type                      |
| engine           | String | Engine specification                   |
| cylinders        | String | Number of cylinders                    |
| division         | String | Division/segment                       |
| drive            | String | Drive type (FWD, RWD, AWD)             |
| seat             | String | Number of seats                        |
| doors            | String | Number of doors                        |
| description      | String | Search in description field            |
| sort             | String | Field to sort by                       |
| asc              | String | Sort direction (true/false)            |

#### Example Request

```bash
curl "http://localhost:8080/cars?maker=Toyota&year=2020&sort=salePrice&asc=true"
```

#### Response Format

```json
{
  "status": "SUCCESS",
  "message": "Operation successful",
  "data": [
    {
      "id": "uuid",
      "make": "Toyota",
      "model": "Camry",
      "year": 2020,
      "description": "Well maintained",
      "odometer": 50000,
      "vehicleCondition": "Excellent",
      "salePrice": 25000.00,
      "colour": "Blue",
      "engine": "2.5L",
      "transmission": "Automatic",
      ...
    }
  ]
}
```

## H2 Console (Development Only)

When running with the H2 profile, access the H2 console at:

```
http://localhost:8080/h2-console
```

**Connection Details:**

- JDBC URL: `jdbc:h2:mem:UsedCarSalesDemo`
- Username: `yuji`
- Password: `S3cret`

## Database Schema

The application uses two main tables:

### `used_car_sales`

Stores information about used car sales including:

- Vehicle details (make, model, year, etc.)
- Sale information (price, date, location)
- Specifications (engine, transmission, fuel type)
- Condition and description

### `users`

Stores user information for the system.

## Development Notes

### Lombok Configuration

This project uses Lombok for reducing boilerplate code. The Maven compiler plugin is configured with Lombok annotation
processing.

If you encounter Lombok-related compilation issues, ensure:

1. Your IDE has Lombok plugin installed
2. Annotation processing is enabled in your IDE settings

### Testing

Run tests with:

```bash
mvn test
```

## Configuration Profiles

- **default (mysql):** Uses MySQL database
- **h2:** Uses H2 in-memory database for development

## Troubleshooting

### Compilation Errors

If you encounter Lombok-related compilation errors:

```bash
mvn clean install -U
```

### Database Connection Issues

**MySQL:**

- Ensure MySQL is running
- Verify credentials in `application.properties`
- Check if the database exists (auto-created if `createDatabaseIfNotExist=true`)

**H2:**

- The database is in-memory and auto-created
- No external setup required

## Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## Author

**Hendi Santika**

- Email: hendisantika@gmail.com
- Telegram: @hendisantika34

## License

This project is developed for educational and demonstration purposes.

## Version History

- **0.0.1-SNAPSHOT** - Initial release
    - RESTful API for used car sales
    - Search and filter functionality
    - Swagger/OpenAPI documentation
    - MySQL and H2 database support
