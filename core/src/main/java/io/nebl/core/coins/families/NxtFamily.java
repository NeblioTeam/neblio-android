package io.nebl.core.coins.families;

import io.nebl.core.coins.CoinType;
import io.nebl.core.exceptions.AddressMalformedException;
import io.nebl.core.messages.MessageFactory;
import io.nebl.core.wallet.AbstractAddress;
import io.nebl.core.wallet.families.nxt.NxtAddress;
import io.nebl.core.wallet.families.nxt.NxtTxMessage;

import javax.annotation.Nullable;


/**
 * @author John L. Jegutanis
 *
 * Coins that belong to this family are: NXT, Burst, etc
 */
public abstract class NxtFamily extends CoinType {
    public static final short DEFAULT_DEADLINE = 1440;

    {
        family = Families.NXT;
    }

    @Override
    public AbstractAddress newAddress(String addressStr) throws AddressMalformedException {
        return NxtAddress.fromString(this, addressStr);
    }

    @Override
    public boolean canHandleMessages() {
        return true;
    }

    @Override
    @Nullable
    public MessageFactory getMessagesFactory() {
        return NxtTxMessage.getFactory();
    }
}