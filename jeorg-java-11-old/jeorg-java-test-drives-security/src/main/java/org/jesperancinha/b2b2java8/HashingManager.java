package org.jesperancinha.b2b2java8;

import org.apache.commons.codec.DecoderException;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by joaofilipesabinoesperancinha on 09-04-16.
 */
public class HashingManager {

    public static final String UTF_8 = "UTF-8";

    public String getHashedStringMD5(String stringToHash) throws NoSuchAlgorithmException, UnsupportedEncodingException, DecoderException {
        final MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        return getDigestedString(stringToHash, messageDigest);
    }

    public String getHashStringSHA1(String stringToHash) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        final MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
        return getDigestedString(stringToHash, messageDigest);
    }

    private String getDigestedString(String stringToHash, MessageDigest messageDigest) throws UnsupportedEncodingException {
        messageDigest.update(stringToHash.getBytes(UTF_8));
        final StringBuffer sb = new StringBuffer();
        byte[] digest = messageDigest.digest();
        for (byte b : digest) {
            sb.append(String.format("%02x", b & 0xff));
        }
        return sb.toString();
    }
}
