package murzin.disgustingmen.com.di.module

import murzin.disgustingmen.com.di.ComputationScheduler;
import murzin.disgustingmen.com.di.MainScheduler;
import murzin.disgustingmen.com.di.IoScheduler;
import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

@Module
class RxModule {

    @Provides
    @IoScheduler
    fun provideSchedulerIO(): Scheduler = Schedulers.io()

    @Provides
    @ComputationScheduler
    fun provideSchedulerComputation(): Scheduler = Schedulers.computation()

    @Provides
    @MainScheduler
    fun provideSchedulerMainThread(): Scheduler = AndroidSchedulers.mainThread()

}
