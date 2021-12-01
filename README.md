
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

"name": "foo",
"first_name": "doe",
"last_name": "john",
"phone_number": "000-111-2222"

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
