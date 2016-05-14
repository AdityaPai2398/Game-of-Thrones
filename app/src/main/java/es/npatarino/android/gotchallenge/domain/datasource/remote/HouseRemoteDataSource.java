package es.npatarino.android.gotchallenge.domain.datasource.remote;

import java.util.List;

import es.npatarino.android.gotchallenge.domain.GoTHouse;
import rx.Observable;

public interface HouseRemoteDataSource {
    Observable<List<GoTHouse>> getAll();
}