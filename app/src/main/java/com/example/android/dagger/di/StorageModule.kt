package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class StorageModule {

    // whenever there is a @Provides whose implementation is simple and common enough to be
    // inferred by Dagger, it makes sense to just declare that
    // as a method without a body (an abstract method) and have Dagger apply the behavior.

    //a @Provides method can have any number of parameters of any type, but a @Binds method can
    // only have a single parameter whose type is assignable to the return type. Separating those
    // specifications makes it easier to reason about correctness because the annotation determines
    // the constraints


    @Binds
    abstract fun bindStorage(sharedPreferencesStorage: SharedPreferencesStorage): Storage


    //@Binds helps your code stay efficient. @Provides methods can be instance methods,
    // which require Dagger to instantiate your Module in order to call them. Making your
    // @Provides method static will also accomplish this, but your @Provides method will
    // still compile if you forget the static. @Binds methods will not.

//    @Provides
//    @RegistrationStorage
//     fun   provideRegistrationStorage(context: Context): Storage {
//        return SharedPreferencesStorage(context)
//    }
//
//    @Provides
//    @LoginStorage
//    fun  provideLoginStorage(context: Context): Storage {
//        return SharedPreferencesStorage(context)
//    }

    /*
        Dagger is a fully static,
        There are other DI frameworks that have annotation processors that run at compile time that
         are not fully static.
       For example Roboguice had an optional annotation processor. So in some sense it could claim
       to have a "compile time" aspect. However, it still relied on reflection at run time for
       injection and so you could not claim that it was "fully static".

     Qualifying "compile-time" with "fully static" distinguishes Dagger 2's salient feature i.e.,
     complete DI code generation using an annotation processor without any need to rely on reflection.
    *
    * */

    //what is reflection ?
    //Q: how does dagger generate code at compile time using the concept of reflection
    //Q : what is the meaning of component of custom annotation


}