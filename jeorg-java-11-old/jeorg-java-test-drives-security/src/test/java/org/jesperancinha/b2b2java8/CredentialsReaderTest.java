package org.jesperancinha.b2b2java8;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Created by jesperancinha on 9-5-16.
 */

public class CredentialsReaderTest {

    @Test
    public void readAllCredentials() throws UnrecoverableKeyException, CertificateException, NoSuchAlgorithmException, KeyStoreException, IOException {
        final CredentialsReader credentialsReader = new CredentialsReader();
        final InputStream fileInputStreamWithOneKeyStore = getClass().getResourceAsStream("/keyStore.p12");

        final List<Certificate> certificateList = credentialsReader.readAllCredentials(fileInputStreamWithOneKeyStore, "test".toCharArray());

        assertThat(certificateList).isNotNull();
        assertThat(certificateList).hasSize(1);
    }

    @Test
    public void readAllCredentials_nullPassowrd() {
        final InputStream fileInputStreamWithOneKeyStore = getClass().getResourceAsStream("/keyStore_nopass.pfx");
        final CredentialsReader credentialsReader = new CredentialsReader();

        assertThrows(Exception.class, () -> credentialsReader.readAllCredentials(fileInputStreamWithOneKeyStore, null));
    }

}
