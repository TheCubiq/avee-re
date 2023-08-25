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

    /* renamed from: b */
    public static final Logger f8655b = Logger.getLogger(ep7.class.getName());

    /* renamed from: c */
    public static final List f8656c;

    /* renamed from: d */
    public static final boolean f8657d;

    /* renamed from: e */
    public static final ep7 f8658e;

    /* renamed from: f */
    public static final ep7 f8659f;

    /* renamed from: g */
    public static final ep7 f8660g;

    /* renamed from: h */
    public static final ep7 f8661h;

    /* renamed from: i */
    public static final ep7 f8662i;

    /* renamed from: j */
    public static final ep7 f8663j;

    /* renamed from: k */
    public static final ep7 f8664k;

    /* renamed from: a */
    public final mp7 f8665a;

    static {
        if (yb7.m3938b()) {
            f8656c = m23313b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f8657d = false;
        } else {
            f8656c = wp7.m5869a() ? m23313b("GmsCore_OpenSSL", "AndroidOpenSSL") : new ArrayList();
            f8657d = true;
        }
        f8658e = new ep7(new fp7());
        f8659f = new ep7(new jp7());
        f8660g = new ep7(new lp7());
        f8661h = new ep7(new kp7());
        f8662i = new ep7(new gp7());
        f8663j = new ep7(new ip7());
        f8664k = new ep7(new hp7());
    }

    public ep7(mp7 mp7Var) {
        this.f8665a = mp7Var;
    }

    /* renamed from: b */
    public static List m23313b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f8655b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Object m23314a(String str) {
        Exception exc = null;
        for (Provider provider : f8656c) {
            try {
                return this.f8665a.mo15861a(str, provider);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (f8657d) {
            return this.f8665a.mo15861a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
