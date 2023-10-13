package com.example.lunchbox

import androidx.core.os.bundleOf
import androidx.navigation.NavController
import com.example.lunchbox.home.HomeFragmentDirections
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import java.lang.ref.WeakReference

object Coordinator {

    var navController: WeakReference<NavController>? = null

    private val scopeMain = CoroutineScope(Dispatchers.Main + SupervisorJob())
    private fun getNavController(): NavController? {
        return this.navController?.get()
    }

    fun goToMeal(){
        scopeMain.launch {
            getNavController()?.navigate(R.id.mealFragment, args = bundleOf("mealType" to "this"))
        }
    }

    fun homeToMeal(mealType: String){
        scopeMain.launch {
            getNavController()?.navigate(
                HomeFragmentDirections.actionHomeFragmentToMealFragment(mealType)
            )
        }
    }

    fun popToHome(){
        scopeMain.launch {
            getNavController()?.popBackStack(R.id.homeFragment, false)
        }
    }

    fun popToMeal(){
        scopeMain.launch {
            getNavController()?.popBackStack(R.id.mealFragment, false)
        }
    }

}