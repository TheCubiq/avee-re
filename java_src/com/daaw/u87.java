package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class u87 {

    /* renamed from: b */
    public static final Logger f28797b = Logger.getLogger(u87.class.getName());

    /* renamed from: a */
    public final ConcurrentMap f28798a;

    public u87() {
        this.f28798a = new ConcurrentHashMap();
    }

    public u87(u87 u87Var) {
        this.f28798a = new ConcurrentHashMap(u87Var.f28798a);
    }

    /* renamed from: a */
    public final n87 m8421a(String str, Class cls) {
        t87 m8415g = m8415g(str);
        if (m8415g.zze().contains(cls)) {
            return m8415g.mo9437a(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(m8415g.zzc());
        Set<Class> zze = m8415g.zze();
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

    /* renamed from: b */
    public final n87 m8420b(String str) {
        return m8415g(str).zzb();
    }

    /* renamed from: c */
    public final synchronized void m8419c(df7 df7Var, ee7 ee7Var) {
        Class zzd;
        int mo11546f = ee7Var.mo11546f();
        if (!xb7.m5296a(1)) {
            String valueOf = String.valueOf(df7Var.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        } else if (!xb7.m5296a(mo11546f)) {
            String valueOf2 = String.valueOf(ee7Var.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
        } else {
            String mo5328d = df7Var.mo5328d();
            String mo5328d2 = ee7Var.mo5328d();
            if (this.f28798a.containsKey(mo5328d) && ((t87) this.f28798a.get(mo5328d)).zzd() != null && (zzd = ((t87) this.f28798a.get(mo5328d)).zzd()) != null && !zzd.getName().equals(ee7Var.getClass().getName())) {
                Logger logger = f28797b;
                Level level = Level.WARNING;
                logger.logp(level, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + mo5328d + " with inconsistent public key type " + mo5328d2);
                throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", df7Var.getClass().getName(), zzd.getName(), ee7Var.getClass().getName()));
            }
            m8414h(new s87(df7Var, ee7Var), true);
            m8414h(new r87(ee7Var), false);
        }
    }

    /* renamed from: d */
    public final synchronized void m8418d(n87 n87Var) {
        if (!xb7.m5296a(1)) {
            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
        }
        m8414h(new q87(n87Var), false);
    }

    /* renamed from: e */
    public final synchronized void m8417e(ee7 ee7Var) {
        if (!xb7.m5296a(ee7Var.mo11546f())) {
            String valueOf = String.valueOf(ee7Var.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
        m8414h(new r87(ee7Var), false);
    }

    /* renamed from: f */
    public final boolean m8416f(String str) {
        return this.f28798a.containsKey(str);
    }

    /* renamed from: g */
    public final synchronized t87 m8415g(String str) {
        if (!this.f28798a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (t87) this.f28798a.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
        r6.f28798a.putIfAbsent(r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
        return;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void m8414h(t87 t87Var, boolean z) {
        String zzf = t87Var.zzb().zzf();
        t87 t87Var2 = (t87) this.f28798a.get(zzf);
        if (t87Var2 != null && !t87Var2.zzc().equals(t87Var.zzc())) {
            f28797b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(zzf));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", zzf, t87Var2.zzc().getName(), t87Var.zzc().getName()));
        }
        this.f28798a.put(zzf, t87Var);
    }
}
