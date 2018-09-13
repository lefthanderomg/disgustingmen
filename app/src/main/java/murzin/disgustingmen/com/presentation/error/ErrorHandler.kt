package murzin.disgustingmen.com.presentation.error

interface ErrorHandler {

    fun proceed(error: Throwable)

    fun attachView(view: CanShowError)

    fun detachView()
}