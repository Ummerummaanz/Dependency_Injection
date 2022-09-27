package com.example.dependencyinjection;


import javax.inject.Singleton;

import dagger.Component;

/**
 * MyComponent -- real estate agent who knows both the buyer and seller
 */

@Singleton
@Component(modules = {SharedPrefModule.class}) //SharedPrefModule -- seller
public interface MyComponent {

    void inject(MainActivity activity); //DependencyInjectionActivity --- buyer


}