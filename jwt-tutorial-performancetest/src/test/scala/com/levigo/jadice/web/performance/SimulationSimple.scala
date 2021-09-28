import io.gatling.core.Predef._
import io.gatling.http.Predef._
 
class SimulationSimple extends Simulation {
  val httpProtocol = http
    .baseURL("http://localhost:8080/jwt-tutorial-003-5.10.52.2")
       
  val defaultHeader = Map(
    "Accept" -> "*/*")
     
    val scn = scenario("Simple Scenario")
    .exec(http("Simple Request")
        .get("/")
        .headers(defaultHeader)
        .check(status.is(200))
    )
     
    setUp(scn.inject(atOnceUsers(5)))
 
    .protocols(httpProtocol)
    .assertions(
      global.responseTime.max.lte(10000)
    )
}