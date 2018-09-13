package murzin.disgustingmen.com.presentation.feature.main.view

import android.support.annotation.LayoutRes
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBar
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import murzin.disgustingmen.com.R
import murzin.disgustingmen.com.presentation.base.BaseActivity
import murzin.disgustingmen.com.presentation.feature.main.presenter.MainPresenter
import ru.terrakok.cicerone.Navigator
import javax.inject.Inject


class MainActivity : BaseActivity(), MainView {

    @Inject
    @InjectPresenter
    lateinit var presenter: MainPresenter

    @ProvidePresenter
    fun providePresenter(): MainPresenter = presenter

    @Inject
    lateinit var navigator: Navigator

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var toolbar: Toolbar


    override fun onResume() {
        super.onResume()
        navigatorHolder.setNavigator(navigator)
    }

    private fun initDrawer() {
        drawerLayout = findViewById(R.id.drawer_layout)
        navigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.item_main -> presenter.openMainScreen()
            }
            drawerLayout.closeDrawers()

            true
        }
    }

    private fun initToolbar() {
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        val actionbar: ActionBar? = supportActionBar
        actionbar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                drawerLayout.openDrawer(GravityCompat.START)
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }


    @LayoutRes
    override fun layoutRes() = R.layout.activity_main

    override fun viewCreated() {
        initToolbar()
        initDrawer()
    }
}
