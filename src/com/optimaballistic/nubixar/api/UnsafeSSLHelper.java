/*
* Project Intelligence SAS ©
* info@i-project.co 
* See licences file at resources/licenses
ENum conteniendo las url de API nubixar
 */
package com.optimaballistic.nubixar.api;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;

public class UnsafeSSLHelper {
    private static final Log LOG = LogFactory.getLog(UnsafeSSLHelper.class.getName());
    private static boolean warnUnsecureMode = false;
    public SSLContext ignoreSSLCertif() {
        if (!warnUnsecureMode) { 
            LOG.warn("SSL Exchanges: UNSECURE mode activated");
        }
        warnUnsecureMode = true;
        HostnameVerifier allHostsValid = getPassiveHostnameVerifier();
        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        // Install the all-trusting trust manager
        SSLContext sc = createUnsecureSSLContext();
        try {
            SSLContext.setDefault(sc);
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (Exception e) {
            LOG.warn(String.format("SSL Exchanges: UNSECURE mode exception : %s", e.getMessage()), e);
        }
        return sc;
    }

    public SSLContext createUnsecureSSLContext() {
        SSLContext sc = null;
        try {
            TrustManager[] trustAllCerts = new TrustManager[]{getPassiveTrustManager()};
            sc = SSLContext.getInstance("TLS");
            sc.init(null, trustAllCerts, new SecureRandom());
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            String msg = "error while creating unsecure SSLContext";
            LOG.error(msg, e);
            throw new RuntimeException(msg, e);
        }
        return sc;
    }

    public HostnameVerifier getPassiveHostnameVerifier() {
        return new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
    }

    public X509TrustManager getPassiveTrustManager() {
        return new X509TrustManager() {

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            @Override
            public void checkServerTrusted(X509Certificate[] arg0, String arg1)
                    throws CertificateException {
            }

            @Override
            public void checkClientTrusted(X509Certificate[] arg0, String arg1)
                    throws CertificateException {
            }
        };
    }

    public X509HostnameVerifier getPassiveX509HostnameVerifier() {
        return new X509HostnameVerifier() {
            @Override
            public boolean verify(String arg0, SSLSession arg1) {
                return true;
            }

            @Override
            public void verify(String host, SSLSocket ssl)
                    throws IOException {
            }

            @Override
            public void verify(String host, X509Certificate cert)
                    throws SSLException {
            }

            @Override
            public void verify(String host, String[] cns,
                    String[] subjectAlts) throws SSLException {
            }
        };
    }
}