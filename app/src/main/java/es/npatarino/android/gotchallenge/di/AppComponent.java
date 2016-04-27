package es.npatarino.android.gotchallenge.di;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;
import es.npatarino.android.gotchallenge.data.GotCharacterJsonMapper;
import es.npatarino.android.gotchallenge.domain.repository.GotCharacterRepository;
import okhttp3.OkHttpClient;
import rx.Scheduler;

/**
 * @author Antonio López.
 */
@Singleton @Component(modules = AppModule.class)
public interface AppComponent {


    @Named("executorThread") Scheduler executorThread();
    @Named("mainThread") Scheduler mainThread();
    OkHttpClient okHttpClient();
    GotCharacterJsonMapper gotCharacterJsonMapper();
    GotCharacterRepository gotCharacterRepository();
}
