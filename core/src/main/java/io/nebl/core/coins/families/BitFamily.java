package io.nebl.core.coins.families;

import io.nebl.core.coins.CoinType;
import io.nebl.core.wallet.AbstractAddress;
import io.nebl.core.exceptions.AddressMalformedException;
import io.nebl.core.wallet.families.bitcoin.BitAddress;

import org.bitcoinj.core.AddressFormatException;

/**
 * @author John L. Jegutanis
 *
 * This is the classical Bitcoin family that includes Litecoin, Dogecoin, Dash, etc
 */
public abstract class BitFamily extends CoinType {
    {
        family = Families.BITCOIN;
    }

    @Override
    public BitAddress newAddress(String addressStr) throws AddressMalformedException {
        return BitAddress.from(this, addressStr);
    }
}
