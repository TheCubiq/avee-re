package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class z97 {

    /* renamed from: a */
    public static final String f34628a;

    /* renamed from: b */
    public static final String f34629b;
    @Deprecated

    /* renamed from: c */
    public static final co7 f34630c;
    @Deprecated

    /* renamed from: d */
    public static final co7 f34631d;
    @Deprecated

    /* renamed from: e */
    public static final co7 f34632e;

    static {
        new fa7();
        f34628a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new ra7();
        f34629b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new ua7();
        new oa7();
        new ab7();
        new eb7();
        new xa7();
        new hb7();
        co7 m25169M = co7.m25169M();
        f34630c = m25169M;
        f34631d = m25169M;
        f34632e = m25169M;
        try {
            m2585a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m2585a() {
        w97.m6284o(new ca7());
        fh7.m22636a();
        w97.m6285n(new fa7(), true);
        w97.m6285n(new ra7(), true);
        if (yb7.m3938b()) {
            return;
        }
        w97.m6285n(new oa7(), true);
        ua7.m8361k(true);
        w97.m6285n(new xa7(), true);
        w97.m6285n(new ab7(), true);
        w97.m6285n(new eb7(), true);
        w97.m6285n(new hb7(), true);
    }
}
