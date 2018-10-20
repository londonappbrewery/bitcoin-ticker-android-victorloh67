package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

public class BitcoinDataModel {

    // TODO: Declare the member variables here
    private String mPrice;

    // TODO: Create a BitcoinDataModel from a JSON:
    public static BitcoinDataModel fromJson(JSONObject jsonObject) {

        try {
            BitcoinDataModel bitcoinData = new BitcoinDataModel();
            bitcoinData.mPrice = jsonObject.getString("ask");
            return bitcoinData;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    // TODO: Create getter methods for price:


    public String getPrice() {
        return mPrice;
    }


}
