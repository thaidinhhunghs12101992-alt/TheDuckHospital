package com.theduckhospital.api.constant;

import org.apache.commons.codec.binary.Hex;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class MomoConfig {
    public static String partnerCode = System.getenv("MOMO_PARTNER_CODE");
    public static String secretKey = System.getenv("MOMO_SECRET_KEY");
    public static String accessKey = System.getenv("MOMO_ACCESS_KEY");
    public static String hashSignature(String data, String key) throws Exception {
        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(key.getBytes(), "HmacSHA256");
        sha256_HMAC.init(secret_key);

        return Hex.encodeHexString(sha256_HMAC.doFinal(data.getBytes()));
    }
}
