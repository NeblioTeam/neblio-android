package io.nebl.wallet.android.ui;

import android.support.v4.app.Fragment;

import io.nebl.core.wallet.WalletAccount;

/**
 * @author John L. Jegutanis
 */
public abstract class WalletFragment extends Fragment implements ViewUpdateble {
    abstract public WalletAccount getAccount();
}
