package com.jedivision;

import org.junit.Test;

import java.security.NoSuchAlgorithmException;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class HashTest {

    private static final String GLOBAL_VALUE = "JDV";
    private static final String GLOBAL_ENCODED_MD5_VALUE = "d7df1f0388aa696ce6ca0750afdebda5";
    private static final String GLOBAL_ENCODED_SHA_256_VALUE = "d5a5d16c2b9261544191204c5e3344071b0cbc064cbd04a8b9238b946bd7a5ad";

    @Test
    public void md5ViaPureJava() throws NoSuchAlgorithmException {
        // Act
        String encodedValue = Hash.md5ViaPureJava(GLOBAL_VALUE);

        // Assert
        assertThat(encodedValue, equalTo(GLOBAL_ENCODED_MD5_VALUE));
    }

    @Test
    public void md5ViaCommonsCodec() throws NoSuchAlgorithmException {
        // Act
        String encodedValue = Hash.md5ViaCommonsCodec(GLOBAL_VALUE);

        // Assert
        assertThat(encodedValue, equalTo(GLOBAL_ENCODED_MD5_VALUE));
    }

    @Test
    public void sha256ViaCommonsCodec() throws NoSuchAlgorithmException {
        // Act
        String encodedValue = Hash.sha256ViaCommonsCodec(GLOBAL_VALUE);

        // Assert
        assertThat(encodedValue, equalTo(GLOBAL_ENCODED_SHA_256_VALUE));
    }
}
