package murzin.disgustingmen.com.presentation.error

import java.lang.ref.WeakReference
import javax.inject.Inject

class DefaultErrorHandler @Inject constructor() : ErrorHandler{

    private lateinit var view: WeakReference<CanShowError>

    override fun attachView(view: CanShowError) {
        this.view = WeakReference(view)
    }

    override fun detachView() {
        this.view.clear()
    }

    override fun proceed(error: Throwable) {
        val view = view.get()
                ?: throw IllegalStateException("View must be attached to ErrorHandler")
        view.show(error.localizedMessage)
    }

}