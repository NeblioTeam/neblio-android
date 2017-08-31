package io.nebl.core.wallet.families.bitcoin;

import io.nebl.core.network.AddressStatus;
import io.nebl.core.network.interfaces.BlockchainConnection;

/**
 * @author John L. Jegutanis
 */
public interface BitBlockchainConnection extends BlockchainConnection<BitTransaction> {
    void getUnspentTx(AddressStatus status, BitTransactionEventListener listener);
}
