/**
 * Created by rb21776 on 2016-07-27.
 */
public class FotokopiarkaLexus implements Photocopier {
    @Override
    public double voltage() {
        return 0;
    }

    @Override
    public int getPagesPerMinute() {
        return 0;
    }

    @Override
    public double scanningResolution() {
        return 0;
    }

    @Override
    public boolean internetConnection() {
        return false;
    }
}
