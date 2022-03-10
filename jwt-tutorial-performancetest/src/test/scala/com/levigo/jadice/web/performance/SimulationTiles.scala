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
    .exec(_.set("uuid", java.util.UUID.randomUUID))
    .exec(http("Load tile of page 1")
        .get("/jwt/tile?c=f74e2810-cf50-2c17-cf50-2c17cf502c17&v=f74e2811-f4ba-85cc-f4ba-85ccf4ba85cc&r=7*0*12**BC65E46031293C4E9F9F02C3D19AA219*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData/4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings/3358781670*[I/2970817851*[Lcom.levigo.jadice.web.shared.model.PageSegmentHandle;/270004123*org.jadice.shared.model.UrlHandle/309448720*https://www.levigo.de/fileadmin/download/jadicewebtoolkit.pdf*document*38a83150-fb77-4bc0-8ce3-a26877c6afd4*[Ljava.lang.String;/2600011424*ROT_000*1*2*3*4*0*0*96*5*4*0*0*255*255*6*1*7*8*9*0*10*11*0*1122*793*0*0*12*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     .exec(http("Load tile of page 2")
        .get("/jwt/tile?c=f74e2810-cf50-2c17-cf50-2c17cf502c17&v=f74e2811-f4ba-85cc-f4ba-85ccf4ba85cc&r=7*0*12**BC65E46031293C4E9F9F02C3D19AA219*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData/4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings/3358781670*[I/2970817851*[Lcom.levigo.jadice.web.shared.model.PageSegmentHandle;/270004123*org.jadice.shared.model.UrlHandle/309448720*https://www.levigo.de/fileadmin/download/jadicewebtoolkit.pdf*document*b3c0d069-1579-4d90-817c-381ddbf092b4*[Ljava.lang.String;/2600011424*ROT_000*1*2*3*4*0*0*96*5*4*0*0*255*255*6*1*7*8*9*1*10*11*0*1122*793*0*0*12*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     .exec(http("Load tile of page 3")
        .get("/jwt/tile?c=f74e2810-cf50-2c17-cf50-2c17cf502c17&v=f74e2811-f4ba-85cc-f4ba-85ccf4ba85cc&r=7*0*12**BC65E46031293C4E9F9F02C3D19AA219*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData/4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings/3358781670*[I/2970817851*[Lcom.levigo.jadice.web.shared.model.PageSegmentHandle;/270004123*org.jadice.shared.model.UrlHandle/309448720*https://www.levigo.de/fileadmin/download/jadicewebtoolkit.pdf*document*6e1d9e13-9be9-4d1d-b793-96bd079c1db1*[Ljava.lang.String;/2600011424*ROT_000*1*2*3*4*0*0*96*5*4*0*0*255*255*6*1*7*8*9*2*10*11*0*1122*793*0*0*12*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     .exec(http("Load tile of page 4")
        .get("/jwt/tile?c=f74e2810-cf50-2c17-cf50-2c17cf502c17&v=f74e2811-f4ba-85cc-f4ba-85ccf4ba85cc&r=7*0*12**BC65E46031293C4E9F9F02C3D19AA219*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData/4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings/3358781670*[I/2970817851*[Lcom.levigo.jadice.web.shared.model.PageSegmentHandle;/270004123*org.jadice.shared.model.UrlHandle/309448720*https://www.levigo.de/fileadmin/download/jadicewebtoolkit.pdf*document*7d097569-b91d-43f9-98cc-e7611fc56d53*[Ljava.lang.String;/2600011424*ROT_000*1*2*3*4*0*0*96*5*4*0*0*255*255*6*1*7*8*9*3*10*11*0*1122*793*0*0*12*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     .exec(http("Load tile of page 5")
        .get("/jwt/tile?c=f74e2810-cf50-2c17-cf50-2c17cf502c17&v=f74e2811-f4ba-85cc-f4ba-85ccf4ba85cc&r=7*0*12**BC65E46031293C4E9F9F02C3D19AA219*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData/4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings/3358781670*[I/2970817851*[Lcom.levigo.jadice.web.shared.model.PageSegmentHandle;/270004123*org.jadice.shared.model.UrlHandle/309448720*https://www.levigo.de/fileadmin/download/jadicewebtoolkit.pdf*document*07a8fe59-aea2-48fc-8698-d00e63e9718f*[Ljava.lang.String;/2600011424*ROT_000*1*2*3*4*0*0*96*5*4*0*0*255*255*6*1*7*8*9*4*10*11*0*1122*793*0*0*12*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     .exec(http("Load tile of page 6")
        .get("/jwt/tile?c=f74e2810-cf50-2c17-cf50-2c17cf502c17&v=f74e2811-f4ba-85cc-f4ba-85ccf4ba85cc&r=7*0*12**BC65E46031293C4E9F9F02C3D19AA219*com.levigo.jadice.web.shared.model.internal.FlattenedRenderSpecificationData/4206259206*com.levigo.jadice.web.shared.model.settings.AnnotationRenderSettings/3358781670*[I/2970817851*[Lcom.levigo.jadice.web.shared.model.PageSegmentHandle;/270004123*org.jadice.shared.model.UrlHandle/309448720*https://www.levigo.de/fileadmin/download/jadicewebtoolkit.pdf*document*f813f048-7733-45e1-bb10-976bd4e7838f*[Ljava.lang.String;/2600011424*ROT_000*1*2*3*4*0*0*96*5*4*0*0*255*255*6*1*7*8*9*5*10*11*0*1122*793*0*0*12*1*")
        .headers(defaultHeader)
        .check(status.is(200))
     )
     
    setUp(scn.inject(atOnceUsers(5)))
    .protocols(theHttpProtocolBuilder)
    .assertions(
      global.responseTime.max.lte(10000)
    )
}