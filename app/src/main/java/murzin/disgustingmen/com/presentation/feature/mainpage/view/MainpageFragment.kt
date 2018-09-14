package murzin.disgustingmen.com.presentation.feature.mainpage.view

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import murzin.disgustingmen.com.R
import murzin.disgustingmen.com.presentation.base.BaseFragment
import murzin.disgustingmen.com.presentation.feature.mainpage.model.DisgustingmentArtilceUI
import murzin.disgustingmen.com.presentation.feature.mainpage.presenter.MainPagePresenter
import javax.inject.Inject

class MainpageFragment : BaseFragment(), MainpageView {

    companion object {
        fun getNewInstance(): MainpageFragment = MainpageFragment()
    }

    @Inject
    @InjectPresenter
    lateinit var presenter: MainPagePresenter

    @ProvidePresenter
    fun provideMainpagerPresenter() = presenter

    private lateinit var articleRecuclerView: RecyclerView
    private lateinit var adapter: MainpageAdapter

    override fun viewCreated(view: View) {
        adapter = MainpageAdapter(mutableListOf())
        articleRecuclerView = view.findViewById(R.id.recycler_view)
        articleRecuclerView.layoutManager = LinearLayoutManager(context)
        articleRecuclerView.adapter = adapter

    }

    override fun layoutRes(): Int = R.layout.fragment_main_page

    override fun show(error: String) {

    }

    override fun displayArticle(article: List<DisgustingmentArtilceUI>) {
        adapter.setArticle(article.toMutableList())
    }

}