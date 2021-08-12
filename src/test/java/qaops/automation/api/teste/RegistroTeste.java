package qaops.automation.api.teste;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.BeforeClass;
import org.junit.Test;
import qaops.automation.api.dominio.Usuario;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.is;

public class RegistroTeste {

    @BeforeClass
    public static void setup(){
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails(); // Define para log seja mais verboso e facil de entender.
        baseURI = "https://reqres.in"; // Define url base de todos os testes
        basePath = "/api";  // define caminho base de todos os testes
    }

    @Test
    public void testNaoEfetuaRegistroQuandoSenhaEstaFaltando() {
        Usuario usuario = new Usuario();
        usuario.setEmail("sydney@fife");

        given().
            contentType(ContentType.JSON).
            body(usuario).
        when().
            post("/register").
        then().
            statusCode(HttpStatus.SC_BAD_REQUEST).
            body("error", is("Missing password"));
    }
}
