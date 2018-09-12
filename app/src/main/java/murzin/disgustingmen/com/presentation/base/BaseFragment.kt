package murzin.disgustingmen.com.presentation.base

import android.content.Context
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import com.arellomobile.mvp.MvpAppCompatFragment

import dagger.android.support.AndroidSupportInjection

abstract class BaseFragment : MvpAppCompatFragment() {

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(layoutRes(), container, false)

    @LayoutRes
    protected abstract fun layoutRes(): Int

}
