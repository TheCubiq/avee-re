package org.conscrypt;

import java.security.PublicKey;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
/* loaded from: classes2.dex */
public final class TrustedCertificateIndex {
    private final Map<X500Principal, List<TrustAnchor>> subjectToTrustAnchors = new HashMap();

    public TrustedCertificateIndex() {
    }

    public TrustedCertificateIndex(Set<TrustAnchor> set) {
        index(set);
    }

    private static TrustAnchor findBySubjectAndPublicKey(X509Certificate x509Certificate, Collection<TrustAnchor> collection) {
        PublicKey publicKey;
        PublicKey publicKey2 = x509Certificate.getPublicKey();
        for (TrustAnchor trustAnchor : collection) {
            try {
                X509Certificate trustedCert = trustAnchor.getTrustedCert();
                publicKey = trustedCert != null ? trustedCert.getPublicKey() : trustAnchor.getCAPublicKey();
            } catch (Exception unused) {
            }
            if (publicKey.equals(publicKey2)) {
                return trustAnchor;
            }
            if ("X.509".equals(publicKey.getFormat()) && "X.509".equals(publicKey2.getFormat())) {
                byte[] encoded = publicKey.getEncoded();
                byte[] encoded2 = publicKey2.getEncoded();
                if (encoded2 != null && encoded != null && Arrays.equals(encoded, encoded2)) {
                    return trustAnchor;
                }
            }
        }
        return null;
    }

    private void index(Set<TrustAnchor> set) {
        for (TrustAnchor trustAnchor : set) {
            index(trustAnchor);
        }
    }

    public Set<TrustAnchor> findAllByIssuerAndSignature(X509Certificate x509Certificate) {
        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
        synchronized (this.subjectToTrustAnchors) {
            List<TrustAnchor> list = this.subjectToTrustAnchors.get(issuerX500Principal);
            if (list == null) {
                return Collections.emptySet();
            }
            HashSet hashSet = new HashSet();
            for (TrustAnchor trustAnchor : list) {
                try {
                    X509Certificate trustedCert = trustAnchor.getTrustedCert();
                    PublicKey publicKey = trustedCert != null ? trustedCert.getPublicKey() : trustAnchor.getCAPublicKey();
                    if (publicKey != null) {
                        x509Certificate.verify(publicKey);
                        hashSet.add(trustAnchor);
                    }
                } catch (Exception unused) {
                }
            }
            return hashSet;
        }
    }

    public TrustAnchor findByIssuerAndSignature(X509Certificate x509Certificate) {
        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
        synchronized (this.subjectToTrustAnchors) {
            List<TrustAnchor> list = this.subjectToTrustAnchors.get(issuerX500Principal);
            if (list == null) {
                return null;
            }
            for (TrustAnchor trustAnchor : list) {
                try {
                    X509Certificate trustedCert = trustAnchor.getTrustedCert();
                    x509Certificate.verify(trustedCert != null ? trustedCert.getPublicKey() : trustAnchor.getCAPublicKey());
                    return trustAnchor;
                } catch (Exception unused) {
                }
            }
            return null;
        }
    }

    public TrustAnchor findBySubjectAndPublicKey(X509Certificate x509Certificate) {
        X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
        synchronized (this.subjectToTrustAnchors) {
            List<TrustAnchor> list = this.subjectToTrustAnchors.get(subjectX500Principal);
            if (list == null) {
                return null;
            }
            return findBySubjectAndPublicKey(x509Certificate, list);
        }
    }

    public TrustAnchor index(X509Certificate x509Certificate) {
        TrustAnchor trustAnchor = new TrustAnchor(x509Certificate, null);
        index(trustAnchor);
        return trustAnchor;
    }

    public void index(TrustAnchor trustAnchor) {
        X509Certificate trustedCert = trustAnchor.getTrustedCert();
        X500Principal subjectX500Principal = trustedCert != null ? trustedCert.getSubjectX500Principal() : trustAnchor.getCA();
        synchronized (this.subjectToTrustAnchors) {
            List<TrustAnchor> list = this.subjectToTrustAnchors.get(subjectX500Principal);
            if (list == null) {
                list = new ArrayList<>(1);
                this.subjectToTrustAnchors.put(subjectX500Principal, list);
            } else if (trustedCert != null) {
                for (TrustAnchor trustAnchor2 : list) {
                    if (trustedCert.equals(trustAnchor2.getTrustedCert())) {
                        return;
                    }
                }
            }
            list.add(trustAnchor);
        }
    }

    public void reset() {
        synchronized (this.subjectToTrustAnchors) {
            this.subjectToTrustAnchors.clear();
        }
    }

    public void reset(Set<TrustAnchor> set) {
        synchronized (this.subjectToTrustAnchors) {
            reset();
            index(set);
        }
    }
}
