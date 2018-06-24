package net.cryptobrewery.macaddress;

import android.util.Log;

import java.net.NetworkInterface;
import java.util.Collections;
import java.util.List;

/**
 * Created by CryptoBrewery on 6/24/2018.
 */

public class MacAddress {

    public static String getMacAddr() {
        try {
            List<NetworkInterface> all = Collections.list(NetworkInterface.getNetworkInterfaces());
            for (NetworkInterface nif : all) {
                if (!nif.getName().equalsIgnoreCase("wlan0")) continue;

                byte[] macBytes = nif.getHardwareAddress();
                if (macBytes == null) {
                    return "";
                }

                StringBuilder res1 = new StringBuilder();
                for (byte b : macBytes) {
                    res1.append(Integer.toHexString(b & 0xFF) + ":");
                }

                if (res1.length() > 0) {
                    res1.deleteCharAt(res1.length() - 1);
                }
                return res1.toString();
            }
        } catch (Exception ex) {
            Log.e("MACADDRESSERROR","MAC ADDRESS RETRIEVE FAILED");
        }
        return "00:00:00:00:00:00";
    }
}
