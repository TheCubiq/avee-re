package com.daaw;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.conscrypt.Conscrypt;
/* loaded from: classes.dex */
public final class yb7 {

    /* renamed from: a */
    public static final Logger f33482a = Logger.getLogger(yb7.class.getName());

    /* renamed from: b */
    public static final AtomicBoolean f33483b = new AtomicBoolean(false);

    /* renamed from: a */
    public static Boolean m3939a() {
        try {
            int i = Conscrypt.f38014a;
            return (Boolean) Conscrypt.class.getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            f33482a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    /* renamed from: b */
    public static boolean m3938b() {
        return f33483b.get();
    }
}
