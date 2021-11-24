
## JPA sample
### 실행방법
- IDE에서 application 실행
- ./gradlew bootRun

### 테스트
http://localhost:8080/h2-console  
에 데이터 확인

```
POST
curl: localhost:8080/students

name: "aaa"

```

```
PUT
curl: localhost:8080/students/1

name: "bbb"

```

```
GET
curl: localhost:8080/students/1

```
