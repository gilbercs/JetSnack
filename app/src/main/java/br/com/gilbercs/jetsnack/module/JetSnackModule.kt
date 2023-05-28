package br.com.gilbercs.jetsnack.module

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.ktx.storage
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
//---------------------------------------------
//Criar module p/ instância a base de dados
//---------------------------------------------
@Module
@InstallIn(SingletonComponent::class)
object JetSnackModule {
    /**
     * Firebase Auth
     */
    @Provides
    fun ProvidesFirebaseAuth(): FirebaseAuth = Firebase.auth
    /**
     * Firebase Firestore
     */
    @Provides
    fun ProvidesFirebaseStore(): FirebaseFirestore = Firebase.firestore
    /**
     * Firebase Storage
     */
    @Provides
    fun ProvidesFirebaseStorage(): FirebaseStorage = Firebase.storage
}