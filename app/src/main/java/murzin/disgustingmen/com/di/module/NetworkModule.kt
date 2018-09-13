package murzin.disgustingmen.com.di.module

import dagger.Module
import dagger.Provides
import io.reactivex.schedulers.Schedulers
import murzin.disgustingmen.com.data.network.AppApi
import murzin.disgustingmen.com.di.PerApplication
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import pl.droidsonroids.retrofit2.JspoonConverterFactory
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory

@Module
class NetworkModule {

    companion object {
        private const val BASE_URL = "https://disgustingmen.com"

    }

    @PerApplication
    @Provides
    fun providesHttpLoggingInterceptor(): HttpLoggingInterceptor {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY
        return logging
    }

    @PerApplication
    @Provides
    fun provideOkHttpClient(logging: HttpLoggingInterceptor): OkHttpClient {
        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor(logging)
        return httpClient.build()
    }

    @PerApplication
    @Provides
    fun provideAppApi(httpClient: OkHttpClient): AppApi {
        return Retrofit.Builder()
                .addConverterFactory(JspoonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .client(httpClient)
                .baseUrl(BASE_URL)
                .build().create(AppApi::class.java)
    }

}
