package org.jesperancinha.b2b2java8;

import org.apache.commons.codec.DecoderException;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by joaofilipesabinoesperancinha on 09-04-16.
 */
public class HashingManagerTest {
    @Test
    public void getHashStringSHA1() throws UnsupportedEncodingException, NoSuchAlgorithmException {
        final HashingManager hashingManager = new HashingManager();
        final String hashedString = hashingManager.getHashStringSHA1("The quick brown fox jumps over the lazy dog");
        assertThat("2fd4e1c67a2d28fced849ee1bb76e7391b93eb12").isEqualTo(hashedString);
    }

    @Test
    public void getHashedStringMD5() throws NoSuchAlgorithmException, DecoderException, UnsupportedEncodingException {
        final HashingManager hashingManager = new HashingManager();

        final String hashedString = hashingManager.getHashedStringMD5("The quick brown fox jumps over the lazy dog");
        assertThat("9e107d9d372bb6826bd81d3542a419d6").isEqualTo(hashedString);
    }
}