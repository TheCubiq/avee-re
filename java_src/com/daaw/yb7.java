package com.daaw;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.conscrypt.Conscrypt;
/* loaded from: classes.dex */
public final class yb7 {
    public static final Logger a = Logger.getLogger(yb7.class.getName());
    public static final AtomicBoolean b = new AtomicBoolean(false);

    public static Boolean a() {
        try {
            int i = Conscrypt.a;
            return (Boolean) Conscrypt.class.getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return b.get();
    }
}
