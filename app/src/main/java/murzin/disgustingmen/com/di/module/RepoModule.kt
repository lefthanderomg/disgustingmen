package murzin.disgustingmen.com.di.module

import dagger.Binds
import dagger.Module
import murzin.disgustingmen.com.data.repository.DisgustingmenRepositoryImpl
import murzin.disgustingmen.com.domain.repository.DisgustingmenRepository

@Module
interface RepoModule {

    @Binds
    fun provideDisgustingmenRepository(repo : DisgustingmenRepositoryImpl) : DisgustingmenRepository
}