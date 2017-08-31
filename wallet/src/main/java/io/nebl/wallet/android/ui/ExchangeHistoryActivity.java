package io.nebl.wallet.android.ui;

import android.os.Bundle;

import io.nebl.wallet.android.R;

/**
 * @author John L. Jegutanis
 */
public class ExchangeHistoryActivity extends BaseWalletActivity {
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_wrapper);

        if (savedInstanceState == null) {
            ExchangeHistoryFragment fragment = new ExchangeHistoryFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, fragment)
                    .commit();
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(false);
    }
}
