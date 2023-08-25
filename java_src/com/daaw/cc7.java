package com.daaw;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class cc7 {

    /* renamed from: a */
    public static final String f5719a;
    @Deprecated

    /* renamed from: b */
    public static final co7 f5720b;
    @Deprecated

    /* renamed from: c */
    public static final co7 f5721c;

    static {
        new bc7();
        f5719a = "type.googleapis.com/google.crypto.tink.AesSivKey";
        f5720b = co7.m25169M();
        f5721c = co7.m25169M();
        try {
            w97.m6284o(new ec7());
            if (yb7.m3938b()) {
                return;
            }
            w97.m6285n(new bc7(), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
