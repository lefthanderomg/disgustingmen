package murzin.disgustingmen.com.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import murzin.disgustingmen.com.App
import murzin.disgustingmen.com.di.module.*

@PerApplication
@Component(modules = [
    AppModule::class,
    RxModule::class,
    NetworkModule::class,
    AppBuilderModule::class,
    RepoModule::class,
    AndroidSupportInjectionModule::class])
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()

}