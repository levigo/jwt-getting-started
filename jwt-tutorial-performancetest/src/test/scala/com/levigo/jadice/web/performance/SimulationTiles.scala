import io.gatling.core.Predef._
import io.gatling.http.Predef._


class SimulationTiles extends Simulation {
  val httpProtocol = http
    .baseURL("http://localhost:8080/jwt-tutorial-003-5.10.52.2")
       
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
    .exec(_.set("uuid", java.util.UUID.randomUUID))
    .exec(http("Load tile of page 1")
        .get("/jwt/tile?c=725f42d2-ce1a-371b-ce1a-371bce1a371b&v=725f42d3-0b9c-48a1-0b9c-48a10b9c48a1&r=7*0*12**241C25C3C0A22649F75ED36B9CA6DC5B*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData%2F4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings%2F3358781670*%5BI%2F2970817851*%5BLcom.levigo.jadice.web.shared.model.PageSegmentHandle%3B%2F270004123*org.jwt.shared.model.UrlHandle%2F3547804392*https%3A%2F%2Fwww.levigo.de%2Ffileadmin%2Fdownload%2Fjadicewebtoolkit.pdf*document*3bb2c62f-61fa-46c4-9242-7f5a7265b7e5*%5BLjava.lang.String%3B%2F2600011424*ROT_000*1*2*3*4*0*0*96*5*4*0*0*255*255*6*1*7*8*9*0*10*11*0*1122*793*0*0*12*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     .exec(http("Load tile of page 2")
        .get("/jwt/tile?c=725f42d2-ce1a-371b-ce1a-371bce1a371b&v=725f42d3-0b9c-48a1-0b9c-48a10b9c48a1&r=7*0*12**241C25C3C0A22649F75ED36B9CA6DC5B*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData%2F4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings%2F3358781670*%5BI%2F2970817851*%5BLcom.levigo.jadice.web.shared.model.PageSegmentHandle%3B%2F270004123*org.jwt.shared.model.UrlHandle%2F3547804392*https%3A%2F%2Fwww.levigo.de%2Ffileadmin%2Fdownload%2Fjadicewebtoolkit.pdf*document*e0596aca-eb82-429a-b5f5-4eea6f8d1612*%5BLjava.lang.String%3B%2F2600011424*ROT_000*1*2*3*4*0*0*96*5*4*0*0*255*255*6*1*7*8*9*1*10*11*0*1122*793*0*0*12*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     .exec(http("Load tile of page 3")
        .get("/jwt/tile?c=725f42d2-ce1a-371b-ce1a-371bce1a371b&v=725f42d3-0b9c-48a1-0b9c-48a10b9c48a1&r=7*0*12**241C25C3C0A22649F75ED36B9CA6DC5B*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData%2F4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings%2F3358781670*%5BI%2F2970817851*%5BLcom.levigo.jadice.web.shared.model.PageSegmentHandle%3B%2F270004123*org.jwt.shared.model.UrlHandle%2F3547804392*https%3A%2F%2Fwww.levigo.de%2Ffileadmin%2Fdownload%2Fjadicewebtoolkit.pdf*document*a4267a56-0594-4151-a4a8-7a37564f8c7d*%5BLjava.lang.String%3B%2F2600011424*ROT_000*1*2*3*4*0*0*96*5*4*0*0*255*255*6*1*7*8*9*2*10*11*0*1122*793*0*0*12*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     .exec(http("Load tile of page 4")
        .get("/jwt/tile?c=725f42d2-ce1a-371b-ce1a-371bce1a371b&v=725f42d3-0b9c-48a1-0b9c-48a10b9c48a1&r=7*0*12**241C25C3C0A22649F75ED36B9CA6DC5B*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData%2F4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings%2F3358781670*%5BI%2F2970817851*%5BLcom.levigo.jadice.web.shared.model.PageSegmentHandle%3B%2F270004123*org.jwt.shared.model.UrlHandle%2F3547804392*https%3A%2F%2Fwww.levigo.de%2Ffileadmin%2Fdownload%2Fjadicewebtoolkit.pdf*document*86b4a17a-9c11-4c2f-9c44-d27c9a852d55*%5BLjava.lang.String%3B%2F2600011424*ROT_000*1*2*3*4*0*0*96*5*4*0*0*255*255*6*1*7*8*9*3*10*11*0*1122*793*0*0*12*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     .exec(http("Load tile of page 5")
        .get("/jwt/tile?c=725f42d2-ce1a-371b-ce1a-371bce1a371b&v=725f42d3-0b9c-48a1-0b9c-48a10b9c48a1&r=7*0*12**241C25C3C0A22649F75ED36B9CA6DC5B*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData%2F4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings%2F3358781670*%5BI%2F2970817851*%5BLcom.levigo.jadice.web.shared.model.PageSegmentHandle%3B%2F270004123*org.jwt.shared.model.UrlHandle%2F3547804392*https%3A%2F%2Fwww.levigo.de%2Ffileadmin%2Fdownload%2Fjadicewebtoolkit.pdf*document*472468b1-860a-4faa-9f02-4fcd379a7d1d*%5BLjava.lang.String%3B%2F2600011424*ROT_000*1*2*3*4*0*0*96*5*4*0*0*255*255*6*1*7*8*9*4*10*11*0*1122*793*0*0*12*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     .exec(http("Load tile of page 6")
        .get("/jwt/tile?c=725f0be0-b663-1154-b663-1154b6631154&v=725f0be1-cc9c-6aae-cc9c-6aaecc9c6aae&r=7*0*12**241C25C3C0A22649F75ED36B9CA6DC5B*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData%2F4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings%2F3358781670*%5BI%2F2970817851*%5BLcom.levigo.jadice.web.shared.model.PageSegmentHandle%3B%2F270004123*org.jwt.shared.model.UrlHandle%2F3547804392*https%3A%2F%2Fwww.levigo.de%2Ffileadmin%2Fdownload%2Fjadicewebtoolkit.pdf*document*ddc2d042-f5ba-48d2-88bc-ad2a6d35be5a*%5BLjava.lang.String%3B%2F2600011424*ROT_000*1*2*3*4*0*0*96*5*4*0*0*255*255*6*1*7*8*9*5*10*11*0*1122*793*0*0*12*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     
    setUp(scn.inject(atOnceUsers(5)))
    .protocols(httpProtocol)
    .assertions(
      global.responseTime.max.lte(10000)
    )
}