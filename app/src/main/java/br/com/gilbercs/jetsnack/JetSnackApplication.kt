package br.com.gilbercs.jetsnack

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import dagger.hilt.android.lifecycle.HiltViewModel
//------------------------------------------------
//Criado e adicionado no manifest a class com anotação
//Hilt para gerencia o ciclo de vida
//------------------------------------------------
@HiltAndroidApp
class JetSnackApplication: Application()