// import io.restassured.RestAssured;
// import io.restassured.http.ContentType;
// import org.junit.jupiter.api.BeforeAll;
// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;
// import static io.restassured.RestAssured.*;
// import static org.hamcrest.Matchers.*;

// @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
// public class UsuarioControllerTest {

//     @BeforeAll
//     public static void setup() {
//         RestAssured.baseURI = "http://localhost";
//         RestAssured.port = 8080; // Porta padrão do Spring Boot
//     }

//     @Test
//     public void testGetAllUsuarios() {
//         given()
//             .when()
//             .get("/usuarios")
//             .then()
//             // .statusCode(200)
//             .contentType(ContentType.JSON);
//     }

//     @Test
//     public void testGetUsuarioById() {
//         given()
//             .pathParam("id", 1)
//             .when()
//             .get("/usuarios/{id}")
//             .then()
//             .statusCode(200)
//             .contentType(ContentType.JSON)
//             .body("id", equalTo(1));
//     }

//     @Test
//     public void testCreateUsuario() {
//         String newUsuario = "{" +
//                 "\"nome\":\"João Silva\"," +
//                 "\"email\":\"joao.silva@example.com\"}";

//         given()
//             .contentType(ContentType.JSON)
//             .body(newUsuario)
//             .when()
//             .post("/usuarios")
//             .then()
//             .statusCode(201)
//             .contentType(ContentType.JSON)
//             .body("nome", equalTo("João Silva"));
//     }

//     @Test
//     public void testUpdateUsuario() {
//         String updatedUsuario = "{" +
//                 "\"nome\":\"João Silva Atualizado\"," +
//                 "\"email\":\"joao.silva.atualizado@example.com\"}";

//         given()
//             .pathParam("id", 1)
//             .contentType(ContentType.JSON)
//             .body(updatedUsuario)
//             .when()
//             .put("/usuarios/{id}")
//             .then()
//             .statusCode(200)
//             .contentType(ContentType.JSON)
//             .body("nome", equalTo("João Silva Atualizado"));
//     }

//     @Test
//     public void testDeleteUsuario() {
//         given()
//             .pathParam("id", 1)
//             .when()
//             .delete("/usuarios/{id}")
//             .then()
//             .statusCode(204);
//     }
// }