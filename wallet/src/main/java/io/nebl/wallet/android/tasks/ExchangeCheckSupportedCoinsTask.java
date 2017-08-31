package io.nebl.wallet.android.tasks;

import android.os.AsyncTask;

import io.nebl.core.exchange.shapeshift.data.ShapeShiftCoins;
import io.nebl.core.exchange.shapeshift.data.ShapeShiftException;
import io.nebl.wallet.android.WalletApplication;

/**
 * @author John L. Jegutanis
 */
public class ExchangeCheckSupportedCoinsTask extends AsyncTask<Void, Void, Void> {
    private final Listener listener;
    private final WalletApplication application;
    private Exception error;
    private ShapeShiftCoins shapeShiftCoins;

    public interface Listener {
        void onExchangeCheckSupportedCoinsTaskStarted();
        void onExchangeCheckSupportedCoinsTaskFinished(Exception error, ShapeShiftCoins shapeShiftCoins);
    }

    public ExchangeCheckSupportedCoinsTask(Listener listener, WalletApplication application) {
        this.listener = listener;
        this.application = application;
    }


    @Override
    protected void onPreExecute() {
        listener.onExchangeCheckSupportedCoinsTaskStarted();
    }

    @Override
    protected Void doInBackground(Void... params) {
        if (application.isConnected()) {
            try {
                shapeShiftCoins = application.getShapeShift().getCoins();
            } catch (Exception e) {
                error = e;
            }
        } else {
            error = new ShapeShiftException("No connection");
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void v) {
        listener.onExchangeCheckSupportedCoinsTaskFinished(error, shapeShiftCoins);
    }
}