
# Oauth2_authentication

This is a simple Spring Boot application that demonstrates OAuth2 authentication using GitHub and Google as providers. The application allows users to authenticate using their GitHub or Google accounts and saves their information to a database.

## Features

- OAuth2 authentication with GitHub and Google
- User information stored in a database
- Basic user information displayed after login

## Technologies Used

- Spring Boot
- Spring Security OAuth2
- MYSQL Database (for simplicity; can be replaced with any other database)
- Lombok (for reducing boilerplate code)

## Prerequisites

- Java 17 or later
- Maven 3.6.3 or later

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/yourusername/oauth2_authentication.git
cd oauth2_authentication
```

### Configuration

1. **Google OAuth2 Configuration**

   Register your application in the [Google Cloud Console](https://console.cloud.google.com/) and get the `client-id` and `client-secret`.

2. **GitHub OAuth2 Configuration**

   Register your application on [GitHub Developer Settings](https://github.com/settings/developers) and get the `client-id` and `client-secret`.

3. **Application Properties**

   Update the `src/main/resources/application.properties` file with your Google and GitHub credentials:

   ```properties
   # Google OAuth2 config
   spring.security.oauth2.client.registration.google.client-id=your-google-client-id
   spring.security.oauth2.client.registration.google.client-secret=your-google-client-secret
   spring.security.oauth2.client.registration.google.redirect-uri={baseUrl}/login/oauth2/code/google
   spring.security.oauth2.client.registration.google.scope=email,profile
   spring.security.oauth2.client.registration.google.client-name=Google

   spring.security.oauth2.client.provider.google.authorization-uri=https://accounts.google.com/o/oauth2/v2/auth
   spring.security.oauth2.client.provider.google.token-uri=https://www.googleapis.com/oauth2/v4/token
   spring.security.oauth2.client.provider.google.user-info-uri=https://www.googleapis.com/oauth2/v3/userinfo
   spring.security.oauth2.client.provider.google.jwk-set-uri=https://www.googleapis.com/oauth2/v3/certs

   # GitHub OAuth2 config
   spring.security.oauth2.client.registration.github.client-id=your-github-client-id
   spring.security.oauth2.client.registration.github.client-secret=your-github-client-secret
   spring.security.oauth2.client.registration.github.redirect-uri={baseUrl}/login/oauth2/code/github
   spring.security.oauth2.client.registration.github.scope=user:email
   spring.security.oauth2.client.registration.github.client-name=GitHub

   spring.security.oauth2.client.provider.github.authorization-uri=https://github.com/login/oauth/authorize
   spring.security.oauth2.client.provider.github.token-uri=https://github.com/login/oauth/access_token
   spring.security.oauth2.client.provider.github.user-info-uri=https://api.github.com/user
   spring.security.oauth2.client.provider.github.jwk-set-uri=https://api.github.com/meta/public_keys
   ```

### Build and Run the Application

```bash
mvn clean install
mvn spring-boot:run
```

### Access the Application

Open your web browser and go to `http://localhost:8080`. You should see the home page with options to log in using Google or GitHub.


## Contributing

Feel free to submit issues and pull requests for new features, improvements, and bugs.

