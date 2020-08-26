package net.onefivefour.android.beepme.di

import net.onefivefour.android.beepme.screens.create.CreateViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

/**
 * Dependency injection module for all classes and ViewModels defined in the app module.
 */
val appModule = module {    
    viewModel { CreateViewModel() }
}