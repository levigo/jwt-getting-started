import io.gatling.core.Predef._
import io.gatling.http.Predef._


class SimulationTiles extends Simulation {
  val httpProtocol = http
    .baseURL("http://localhost:8080/jwt-tutorial-003-5.8.0.0")
       
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
    .exec(http("Load tile")
        .get("/jwt/tile?v=1539858587974v7*0*12**3CB61F98B7DF8C3FF5247FFCF595044E*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData%2F4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings%2F3358781670*%5BI%2F2970817851*%5BLcom.levigo.jadice.web.shared.model.PageSegmentHandle%3B%2F270004123*org.jwt.shared.model.UrlHandle%2F3547804392*https%3A%2F%2Fwww.levigo.de%2Ffileadmin%2Fdownload%2Fjadicewebtoolkit.pdf*document*23be8204-e817-44c3-9609-eb68b68c5756*%5BLjava.lang.String%3B%2F2600011424*ROT_000*1*2*3*4*0*0*72*5*4*0*0*255*255*6*1*7*8*9*0*10*11*0*842*595*0*0*12*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     .exec(http("Load tile")
        .get("/jwt/tile?v=1539858587974v7*0*12**3CB61F98B7DF8C3FF5247FFCF595044E*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData%2F4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings%2F3358781670*%5BI%2F2970817851*%5BLcom.levigo.jadice.web.shared.model.PageSegmentHandle%3B%2F270004123*org.jwt.shared.model.UrlHandle%2F3547804392*https%3A%2F%2Fwww.levigo.de%2Ffileadmin%2Fdownload%2Fjadicewebtoolkit.pdf*document*8e7d1964-d4ee-41f6-a980-eb73e8fbc477*%5BLjava.lang.String%3B%2F2600011424*ROT_000*1*2*3*4*0*0*72*5*4*0*0*255*255*6*1*7*8*9*1*10*11*0*842*595*0*0*12*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     .exec(http("Load tile")
        .get("/jwt/tile?v=1539858587974v7*0*12**3CB61F98B7DF8C3FF5247FFCF595044E*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData%2F4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings%2F3358781670*%5BI%2F2970817851*%5BLcom.levigo.jadice.web.shared.model.PageSegmentHandle%3B%2F270004123*org.jwt.shared.model.UrlHandle%2F3547804392*https%3A%2F%2Fwww.levigo.de%2Ffileadmin%2Fdownload%2Fjadicewebtoolkit.pdf*document*e34eb16e-a812-46c2-8367-47e37a9edb97*%5BLjava.lang.String%3B%2F2600011424*ROT_000*1*2*3*4*0*0*72*5*4*0*0*255*255*6*1*7*8*9*2*10*11*0*842*595*0*0*12*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     .exec(http("Load tile")
        .get("/jwt/tile?v=1539858587974v7*0*12**3CB61F98B7DF8C3FF5247FFCF595044E*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData%2F4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings%2F3358781670*%5BI%2F2970817851*%5BLcom.levigo.jadice.web.shared.model.PageSegmentHandle%3B%2F270004123*org.jwt.shared.model.UrlHandle%2F3547804392*https%3A%2F%2Fwww.levigo.de%2Ffileadmin%2Fdownload%2Fjadicewebtoolkit.pdf*document*07d7f425-6f06-477c-aba1-6dc0d13f6123*%5BLjava.lang.String%3B%2F2600011424*ROT_000*1*2*3*4*0*0*72*5*4*0*0*255*255*6*1*7*8*9*3*10*11*0*842*595*0*0*12*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     .exec(http("Load tile")
        .get("/jwt/tile?v=1539858587974v7*0*12**3CB61F98B7DF8C3FF5247FFCF595044E*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData%2F4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings%2F3358781670*%5BI%2F2970817851*%5BLcom.levigo.jadice.web.shared.model.PageSegmentHandle%3B%2F270004123*org.jwt.shared.model.UrlHandle%2F3547804392*https%3A%2F%2Fwww.levigo.de%2Ffileadmin%2Fdownload%2Fjadicewebtoolkit.pdf*document*3cd7ffc0-be55-44f0-942d-cf3d9b18be31*%5BLjava.lang.String%3B%2F2600011424*ROT_000*1*2*3*4*0*0*72*5*4*0*0*255*255*6*1*7*8*9*4*10*11*0*842*595*0*0*12*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     .exec(http("Load tile")
        .get("/jwt/tile?v=1539858587974v7*0*12**3CB61F98B7DF8C3FF5247FFCF595044E*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData%2F4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings%2F3358781670*%5BI%2F2970817851*%5BLcom.levigo.jadice.web.shared.model.PageSegmentHandle%3B%2F270004123*org.jwt.shared.model.UrlHandle%2F3547804392*https%3A%2F%2Fwww.levigo.de%2Ffileadmin%2Fdownload%2Fjadicewebtoolkit.pdf*document*eb5ccca6-2da7-476f-8326-05b6531b8144*%5BLjava.lang.String%3B%2F2600011424*ROT_000*1*2*3*4*0*0*72*5*4*0*0*255*255*6*1*7*8*9*5*10*11*0*842*595*0*0*12*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     
    setUp(scn.inject(atOnceUsers(5)))
    .protocols(httpProtocol)
    .assertions(
      global.responseTime.max.lte(10000)
    )
}