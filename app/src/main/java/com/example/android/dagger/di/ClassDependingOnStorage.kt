package com.example.android.dagger.di

import com.example.android.dagger.storage.Storage
import javax.inject.Inject

//in a method
class ClassDependingOnStorage(@RegistrationStorage storage: Storage) {}
//
//    //as an inject method
//    @Inject
//    @field:LoginStorage
//    lateinit var loginStorage: Storage
//}

