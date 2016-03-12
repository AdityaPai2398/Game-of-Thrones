package es.npatarino.android.gotchallenge.presenter;


import es.npatarino.android.gotchallenge.view.View;

/**
 * @author Antonio López.
 */
public interface Presenter<T extends View> {
    void init();
    void setView(T view);
}
