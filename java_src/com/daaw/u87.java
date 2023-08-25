package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class u87 {
    public static final Logger b = Logger.getLogger(u87.class.getName());
    public final ConcurrentMap a;

    public u87() {
        this.a = new ConcurrentHashMap();
    }

    public u87(u87 u87Var) {
        this.a = new ConcurrentHashMap(u87Var.a);
    }

    public final n87 a(String str, Class cls) {
        t87 g = g(str);
        if (g.zze().contains(cls)) {
            return g.a(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(g.zzc());
        Set<Class> zze = g.zze();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : zze) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb2);
    }

    public final n87 b(String str) {
        return g(str).zzb();
    }

    public final synchronized void c(df7 df7Var, ee7 ee7Var) {
        Class zzd;
        int f = ee7Var.f();
        if (!xb7.a(1)) {
            String valueOf = String.valueOf(df7Var.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        } else if (!xb7.a(f)) {
            String valueOf2 = String.valueOf(ee7Var.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
        } else {
            String d = df7Var.d();
            String d2 = ee7Var.d();
            if (this.a.containsKey(d) && ((t87) this.a.get(d)).zzd() != null && (zzd = ((t87) this.a.get(d)).zzd()) != null && !zzd.getName().equals(ee7Var.getClass().getName())) {
                Logger logger = b;
                Level level = Level.WARNING;
                logger.logp(level, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + d + " with inconsistent public key type " + d2);
                throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", df7Var.getClass().getName(), zzd.getName(), ee7Var.getClass().getName()));
            }
            h(new s87(df7Var, ee7Var), true);
            h(new r87(ee7Var), false);
        }
    }

    public final synchronized void d(n87 n87Var) {
        if (!xb7.a(1)) {
            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
        }
        h(new q87(n87Var), false);
    }

    public final synchronized void e(ee7 ee7Var) {
        if (!xb7.a(ee7Var.f())) {
            String valueOf = String.valueOf(ee7Var.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
        h(new r87(ee7Var), false);
    }

    public final boolean f(String str) {
        return this.a.containsKey(str);
    }

    public final synchronized t87 g(String str) {
        if (!this.a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (t87) this.a.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
        r6.a.putIfAbsent(r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void h(com.daaw.t87 r7, boolean r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.daaw.n87 r0 = r7.zzb()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = r0.zzf()     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.ConcurrentMap r1 = r6.a     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L6b
            com.daaw.t87 r1 = (com.daaw.t87) r1     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L5b
            java.lang.Class r2 = r1.zzc()     // Catch: java.lang.Throwable -> L6b
            java.lang.Class r3 = r7.zzc()     // Catch: java.lang.Throwable -> L6b
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L22
            goto L5b
        L22:
            java.util.logging.Logger r8 = com.daaw.u87.b     // Catch: java.lang.Throwable -> L6b
            java.util.logging.Level r2 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = "com.google.crypto.tink.KeyManagerRegistry"
            java.lang.String r4 = "registerKeyManagerContainer"
            java.lang.String r5 = "Attempted overwrite of a registered key manager for key type "
            java.lang.String r5 = r5.concat(r0)     // Catch: java.lang.Throwable -> L6b
            r8.logp(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L6b
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L6b
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L6b
            r3 = 0
            r2[r3] = r0     // Catch: java.lang.Throwable -> L6b
            r0 = 1
            java.lang.Class r1 = r1.zzc()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L6b
            r2[r0] = r1     // Catch: java.lang.Throwable -> L6b
            r0 = 2
            java.lang.Class r7 = r7.zzc()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L6b
            r2[r0] = r7     // Catch: java.lang.Throwable -> L6b
            java.lang.String r7 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            java.lang.String r7 = java.lang.String.format(r7, r2)     // Catch: java.lang.Throwable -> L6b
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L6b
            throw r8     // Catch: java.lang.Throwable -> L6b
        L5b:
            if (r8 != 0) goto L64
            java.util.concurrent.ConcurrentMap r8 = r6.a     // Catch: java.lang.Throwable -> L6b
            r8.putIfAbsent(r0, r7)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r6)
            return
        L64:
            java.util.concurrent.ConcurrentMap r8 = r6.a     // Catch: java.lang.Throwable -> L6b
            r8.put(r0, r7)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r6)
            return
        L6b:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.u87.h(com.daaw.t87, boolean):void");
    }
}
