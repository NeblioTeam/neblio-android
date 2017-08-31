package io.nebl.core.wallet.families.bitcoin;

import io.nebl.core.network.AddressStatus;
import io.nebl.core.network.ServerClient.UnspentTx;
import io.nebl.core.network.interfaces.TransactionEventListener;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
public interface BitTransactionEventListener extends TransactionEventListener<BitTransaction> {
    void onUnspentTransactionUpdate(AddressStatus status, List<UnspentTx> UnspentTxes);
}
