package io.nebl.core.exchange.shapeshift.data;

import io.nebl.core.coins.CoinType;
import io.nebl.core.coins.Value;
import io.nebl.core.exchange.shapeshift.ShapeShift;
import io.nebl.core.util.ExchangeRate;

import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author John L. Jegutanis
 */
public class ShapeShiftPairBase extends ShapeShiftBase {
    public final String pair;

    public ShapeShiftPairBase(JSONObject data) throws ShapeShiftException {
        super(data);
        if (!isError) {
            try {
                pair = data.getString("pair").toLowerCase();
            } catch (JSONException e) {
                throw new ShapeShiftException("Could not parse object", e);
            }
        } else {
            pair = null;
        }
    }

    public boolean isPair(CoinType sourceType, CoinType destinationType) {
        return isPair(ShapeShift.getPair(sourceType, destinationType));
    }

    public boolean isPair(String otherPair) {
        return pair != null && pair.equalsIgnoreCase(otherPair);
    }
}
