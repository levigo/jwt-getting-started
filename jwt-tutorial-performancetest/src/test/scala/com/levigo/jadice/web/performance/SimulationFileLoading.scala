import io.gatling.core.Predef._
import io.gatling.http.Predef._
 
class SimulationFileLoading extends Simulation {
    val httpProtocol = http
        .baseURL("http://localhost:8080/jwt-tutorial-003-5.7.0.2")
  
    val defaultHeader = Map(
        "Accept" -> "*/*",
        "Accept-Encoding" -> "gzip, deflate, br",
        "Accept-Language" -> "de-DE,de;q=0.9,en-US;q=0.8,en;q=0.7",
        "Cache-Control" -> "no-cache",
        "Connection" -> "keep-alive",
        "Content-Type" -> "text/plain;charset=UTF-8",
        "DNT" -> "1",
        "Origin" -> "http://localhost:8080",
        "Pragma" -> "no-cache",
        "User-Agent" -> "Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36",
        "X-GWT-Module-Base" -> "http://localhost:8080/jwt-tutorial-003-5.7.0.2/imageviewer/",
        "X-GWT-Permutation" -> "79A1155DD3CB7EBBA33EE56F4B55FD77",
        "X-JWT-Client-ID" ->"${uuid}")
         
    val scn = scenario("File loading Scenario")
        .exec(_.set("uuid", java.util.UUID.randomUUID))
        .exec(http("Load Document")
            .post("/jwt/transport/longpoll")
            .headers(defaultHeader)
            .body(RawFileBody("Request_Load_File.txt"))
        )
         
        setUp(scn.inject(atOnceUsers(5)))
 
        .protocols(httpProtocol)
        .assertions(
            global.responseTime.max.lte(2000)
        )
}