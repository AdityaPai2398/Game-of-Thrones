package es.npatarino.android.gotchallenge.data.source.remote;

/**
 * @author Antonio López.
 */
public class EndPoint {

    private String endPoint;

    public EndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public String toString() {
        return endPoint;
    }
}
