import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder


class SimulationTiles extends Simulation {
  val theHttpProtocolBuilder: HttpProtocolBuilder = http.baseUrl("http://localhost:8080/")
       
  val defaultHeader= Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "de-DE,de;q=0.9,en-US;q=0.8,en;q=0.7",
    "Cache-Control" -> "no-cache",
    "Connection" -> "keep-alive",
    "Content-Type" -> "text/plain;charset=UTF-8",
    "DNT" -> "1",
    "Origin" -> "http://localhost:8080",
    "Pragma" -> "no-cache",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36")
     
    val scn = scenario("Tile retrieval Scenario")
    .exec(_.set("uuid", java.util.UUID.randomUUID().toString()))
    .exec(http("Load tile of page 1")
        .get("/jwt/tile?c=${uuid}&v=019c0409-5df4-72df-5df4-72df5df472df&r=7*0*13**66754C2DF513E2720B84E09C94CF7155*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData%2F4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings%2F3358781670*%5BI%2F2970817851*%5BLcom.levigo.jadice.web.shared.model.PageSegmentHandle%3B%2F270004123*com.levigo.jadice.web.demo.common.shared.service.sources.ClassPathWithAnnoHandle%2F1755717260*Factsheet+jadice+web+toolkit+(PDF)*%2FInfo_jadice_web_toolkit.pdf*document*cb802809-ecb1-430d-8e0e-76106578cc57*%5BLjava.lang.String%3B%2F2600011424*ROT_000*1*2*3*4*0*0*96*5*4*0*0*255*255*6*1*7*8*9*0*10*0*11*12*0*1122*793*0*0*13*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     .exec(http("Load tile of page 2")
        .get("/jwt/tile?c=${uuid}&v=019c0409-5df4-72df-5df4-72df5df472df&r=7*0*13**66754C2DF513E2720B84E09C94CF7155*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData%2F4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings%2F3358781670*%5BI%2F2970817851*%5BLcom.levigo.jadice.web.shared.model.PageSegmentHandle%3B%2F270004123*com.levigo.jadice.web.demo.common.shared.service.sources.ClassPathWithAnnoHandle%2F1755717260*Factsheet+jadice+web+toolkit+(PDF)*%2FInfo_jadice_web_toolkit.pdf*document*dc34cdf1-ffbf-4a8b-be89-b13ba3e0dd5e*%5BLjava.lang.String%3B%2F2600011424*ROT_000*1*2*3*4*0*0*96*5*4*0*0*255*255*6*1*7*8*9*0*10*1*11*12*0*1122*793*0*0*13*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     .exec(http("Load tile of page 3")
        .get("/jwt/tile?c=${uuid}&v=019c0409-5df4-72df-5df4-72df5df472df&r=7*0*13**66754C2DF513E2720B84E09C94CF7155*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData%2F4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings%2F3358781670*%5BI%2F2970817851*%5BLcom.levigo.jadice.web.shared.model.PageSegmentHandle%3B%2F270004123*com.levigo.jadice.web.demo.common.shared.service.sources.ClassPathWithAnnoHandle%2F1755717260*Factsheet+jadice+web+toolkit+(PDF)*%2FInfo_jadice_web_toolkit.pdf*document*938a9145-db6a-4493-aca1-4de1164dc908*%5BLjava.lang.String%3B%2F2600011424*ROT_000*1*2*3*4*0*0*96*5*4*0*0*255*255*6*1*7*8*9*0*10*2*11*12*0*1122*793*0*0*13*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     .exec(http("Load tile of page 4")
        .get("/jwt/tile?c=${uuid}&v=019c0409-5df4-72df-5df4-72df5df472df&r=7*0*13**66754C2DF513E2720B84E09C94CF7155*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData%2F4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings%2F3358781670*%5BI%2F2970817851*%5BLcom.levigo.jadice.web.shared.model.PageSegmentHandle%3B%2F270004123*com.levigo.jadice.web.demo.common.shared.service.sources.ClassPathWithAnnoHandle%2F1755717260*Factsheet+jadice+web+toolkit+(PDF)*%2FInfo_jadice_web_toolkit.pdf*document*eb4c8fdd-6bd9-4bbf-b7b5-cbba5fe482d8*%5BLjava.lang.String%3B%2F2600011424*ROT_000*1*2*3*4*0*0*96*5*4*0*0*255*255*6*1*7*8*9*0*10*3*11*12*0*1122*793*0*0*13*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     .exec(http("Load tile of page 5")
        .get("/jwt/tile?c=${uuid}&v=019c0409-5df4-72df-5df4-72df5df472df&r=7*0*13**66754C2DF513E2720B84E09C94CF7155*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData%2F4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings%2F3358781670*%5BI%2F2970817851*%5BLcom.levigo.jadice.web.shared.model.PageSegmentHandle%3B%2F270004123*com.levigo.jadice.web.demo.common.shared.service.sources.ClassPathWithAnnoHandle%2F1755717260*Factsheet+jadice+web+toolkit+(PDF)*%2FInfo_jadice_web_toolkit.pdf*document*5f32591f-beb3-492b-abbf-9af274bc73c3*%5BLjava.lang.String%3B%2F2600011424*ROT_000*1*2*3*4*0*0*96*5*4*0*0*255*255*6*1*7*8*9*0*10*4*11*12*0*1122*793*0*0*13*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     .exec(http("Load tile of page 6")
        .get("/jwt/tile?c=${uuid}&v=019c0409-5df4-72df-5df4-72df5df472df&r=7*0*15**66754C2DF513E2720B84E09C94CF7155*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData%2F4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings%2F3358781670*%5BI%2F2970817851*%5BLcom.levigo.jadice.web.shared.model.PageSegmentHandle%3B%2F270004123*com.levigo.jadice.web.demo.common.shared.service.sources.ClassPathWithAnnoHandle%2F1755717260*Factsheet+jadice+web+toolkit+(PDF)*%2FInfo_jadice_web_toolkit.pdf*document*7e11fd1d-fdce-4b50-902d-4f66412cc74d*annotations*efe681ce-724c-44d9-93b0-be9c944e04da*%5BLjava.lang.String%3B%2F2600011424*ROT_000*1*2*3*4*0*0*96*5*4*0*0*255*255*6*2*7*8*9*0*10*5*11*7*8*9*0*12*5*13*14*0*1122*793*0*0*15*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     
    setUp(
        scn.inject(
            nothingFor(4), // 1
            atOnceUsers(2), // 2
            rampUsers(3).during(20), // 3
            // constantUsersPerSec(1).during(30), // 4
            rampUsersPerSec(1).to(2).during(30)
    )
    )
    .protocols(theHttpProtocolBuilder)
    .assertions(
      global.responseTime.max.lte(10000)
    )
}