package io.nebl.core.coins;

import io.nebl.core.coins.families.PeerFamily;

/**
 * @author John L. Jegutanis
 */
public class NeblioMain extends PeerFamily {
    private NeblioMain() {
        id = "neblio.main";

        addressHeader = 53;
        p2shHeader = 112;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 30;
        dumpedPrivateKeyHeader = 128;

        name = "Neblio";
        symbol = "NEBL";
        uriScheme = "neblio";
        bip44Index = 146;
        unitExponent = 8;
        feeValue = value(100000);
        minNonDust = value(1000); // 0.00001 NEBL mininput
        softDustLimit = value(10000); // 0.0001 NEBL
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("Neblio Signed Message:\n");
    }

    private static NeblioMain instance = new NeblioMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
