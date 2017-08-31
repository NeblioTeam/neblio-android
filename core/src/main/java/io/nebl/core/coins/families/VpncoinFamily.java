package io.nebl.core.coins.families;

import io.nebl.core.messages.MessageFactory;
import io.nebl.core.wallet.families.vpncoin.VpncoinTxMessage;

import javax.annotation.Nullable;

/**
 * @author John L. Jegutanis
 *
 * This family contains Vpncoin
 */
public abstract class VpncoinFamily extends BitFamily {
    {
        family = Families.VPNCOIN;
    }

    @Override
    @Nullable
    public MessageFactory getMessagesFactory() {
        return VpncoinTxMessage.getFactory();
    }
}