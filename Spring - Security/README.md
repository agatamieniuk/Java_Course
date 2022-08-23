# spring-security

### Run database
```bash
docker run -p 3307:3306 --name mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=example --rm -d mysql
```

### Run app
```bash
./mvnw spring-boot:run
```
… and go to [http://localhost:8080](http://localhost:8080)
