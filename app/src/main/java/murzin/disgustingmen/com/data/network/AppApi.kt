package murzin.disgustingmen.com.data.network

import io.reactivex.Single
import murzin.disgustingmen.com.data.parsed.MainPageParsed
import retrofit2.http.GET

interface AppApi {

    @GET("/")
    fun getMainPageArticle() : Single<MainPageParsed>

}