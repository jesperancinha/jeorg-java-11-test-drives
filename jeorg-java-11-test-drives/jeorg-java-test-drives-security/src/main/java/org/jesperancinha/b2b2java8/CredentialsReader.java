package org.jesperancinha.b2b2java8;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by jesperancinha on 9-5-16.
 */
public class CredentialsReader {

    public List<Certificate> readAllCredentials(final InputStream keyInput, char[] passwordArray) throws KeyStoreException, IOException, CertificateException, NoSuchAlgorithmException, UnrecoverableKeyException {
        List<Certificate> certificateList = new ArrayList<>();
        KeyStore keystore_client = KeyStore.getInstance("JKS");

        keystore_client.load(keyInput, passwordArray);

        Enumeration<String> e = keystore_client.aliases();
        while (e.hasMoreElements()) {
            final String alias = e.nextElement();
            final Certificate certificate = keystore_client.getCertificate(alias);
            certificateList.add(certificate);
            if (certificate == null)
                throw new RuntimeException("No certificat loaded. You must enter a password when creating keystores!");
        }
        return certificateList;
    }

}
