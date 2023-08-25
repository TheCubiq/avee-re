package com.daaw;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class ep7 {
    public static final Logger b = Logger.getLogger(ep7.class.getName());
    public static final List c;
    public static final boolean d;
    public static final ep7 e;
    public static final ep7 f;
    public static final ep7 g;
    public static final ep7 h;
    public static final ep7 i;
    public static final ep7 j;
    public static final ep7 k;
    public final mp7 a;

    static {
        if (yb7.b()) {
            c = b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            d = false;
        } else {
            c = wp7.a() ? b("GmsCore_OpenSSL", "AndroidOpenSSL") : new ArrayList();
            d = true;
        }
        e = new ep7(new fp7());
        f = new ep7(new jp7());
        g = new ep7(new lp7());
        h = new ep7(new kp7());
        i = new ep7(new gp7());
        j = new ep7(new ip7());
        k = new ep7(new hp7());
    }

    public ep7(mp7 mp7Var) {
        this.a = mp7Var;
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        Exception exc = null;
        for (Provider provider : c) {
            try {
                return this.a.a(str, provider);
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        if (d) {
            return this.a.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
