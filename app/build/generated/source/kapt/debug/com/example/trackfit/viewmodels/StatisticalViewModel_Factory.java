// Generated by Dagger (https://dagger.dev).
package com.example.trackfit.viewmodels;

import android.app.Application;
import com.example.trackfit.repository.Repository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class StatisticalViewModel_Factory implements Factory<StatisticalViewModel> {
  private final Provider<Repository> repositoryProvider;

  private final Provider<Application> applicationProvider;

  public StatisticalViewModel_Factory(Provider<Repository> repositoryProvider,
      Provider<Application> applicationProvider) {
    this.repositoryProvider = repositoryProvider;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public StatisticalViewModel get() {
    return newInstance(repositoryProvider.get(), applicationProvider.get());
  }

  public static StatisticalViewModel_Factory create(Provider<Repository> repositoryProvider,
      Provider<Application> applicationProvider) {
    return new StatisticalViewModel_Factory(repositoryProvider, applicationProvider);
  }

  public static StatisticalViewModel newInstance(Repository repository, Application application) {
    return new StatisticalViewModel(repository, application);
  }
}