package com.daaw;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class w97 {

    /* renamed from: a */
    public static final Logger f31082a = Logger.getLogger(w97.class.getName());

    /* renamed from: b */
    public static final AtomicReference f31083b = new AtomicReference(new u87());

    /* renamed from: c */
    public static final ConcurrentMap f31084c = new ConcurrentHashMap();

    /* renamed from: d */
    public static final ConcurrentMap f31085d = new ConcurrentHashMap();

    /* renamed from: e */
    public static final ConcurrentMap f31086e = new ConcurrentHashMap();

    /* renamed from: f */
    public static final ConcurrentMap f31087f = new ConcurrentHashMap();

    /* renamed from: g */
    public static final ConcurrentMap f31088g = new ConcurrentHashMap();

    @Deprecated
    /* renamed from: a */
    public static d87 m6298a(String str) {
        String valueOf;
        String str2;
        if (str != null) {
            ConcurrentMap concurrentMap = f31086e;
            Locale locale = Locale.US;
            d87 d87Var = (d87) concurrentMap.get(str.toLowerCase(locale));
            if (d87Var == null) {
                String format = String.format("no catalogue found for %s. ", str);
                if (str.toLowerCase(locale).startsWith("tinkaead")) {
                    format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
                }
                if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
                    valueOf = String.valueOf(format);
                    str2 = "Maybe call DeterministicAeadConfig.register().";
                } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
                    valueOf = String.valueOf(format);
                    str2 = "Maybe call StreamingAeadConfig.register().";
                } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
                    valueOf = String.valueOf(format);
                    str2 = "Maybe call HybridConfig.register().";
                } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
                    valueOf = String.valueOf(format);
                    str2 = "Maybe call MacConfig.register().";
                } else if (!str.toLowerCase(locale).startsWith("tinkpublickeysign") && !str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                    if (str.toLowerCase(locale).startsWith("tink")) {
                        valueOf = String.valueOf(format);
                        str2 = "Maybe call TinkConfig.register().";
                    }
                    throw new GeneralSecurityException(format);
                } else {
                    valueOf = String.valueOf(format);
                    str2 = "Maybe call SignatureConfig.register().";
                }
                format = valueOf.concat(str2);
                throw new GeneralSecurityException(format);
            }
            return d87Var;
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    /* renamed from: b */
    public static n87 m6297b(String str) {
        return ((u87) f31083b.get()).m8420b(str);
    }

    /* renamed from: c */
    public static synchronized nm7 m6296c(vm7 vm7Var) {
        nm7 mo13585c;
        synchronized (w97.class) {
            n87 m6297b = m6297b(vm7Var.m7023Q());
            if (!((Boolean) f31085d.get(vm7Var.m7023Q())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(vm7Var.m7023Q())));
            }
            mo13585c = m6297b.mo13585c(vm7Var.m7024P());
        }
        return mo13585c;
    }

    /* renamed from: d */
    public static synchronized xt7 m6295d(vm7 vm7Var) {
        xt7 mo13584d;
        synchronized (w97.class) {
            n87 m6297b = m6297b(vm7Var.m7023Q());
            if (!((Boolean) f31085d.get(vm7Var.m7023Q())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(vm7Var.m7023Q())));
            }
            mo13584d = m6297b.mo13584d(vm7Var.m7024P());
        }
        return mo13584d;
    }

    @Nullable
    /* renamed from: e */
    public static Class m6294e(Class cls) {
        t97 t97Var = (t97) f31087f.get(cls);
        if (t97Var == null) {
            return null;
        }
        return t97Var.zza();
    }

    /* renamed from: f */
    public static Object m6293f(nm7 nm7Var, Class cls) {
        return m6292g(nm7Var.m15029Q(), nm7Var.m15030P(), cls);
    }

    /* renamed from: g */
    public static Object m6292g(String str, yq7 yq7Var, Class cls) {
        return ((u87) f31083b.get()).m8421a(str, cls).mo13586b(yq7Var);
    }

    /* renamed from: h */
    public static Object m6291h(String str, xt7 xt7Var, Class cls) {
        return ((u87) f31083b.get()).m8421a(str, cls).mo13587a(xt7Var);
    }

    /* renamed from: i */
    public static Object m6290i(String str, byte[] bArr, Class cls) {
        return m6292g(str, yq7.m3424F(bArr), cls);
    }

    /* renamed from: j */
    public static Object m6289j(s97 s97Var, Class cls) {
        t97 t97Var = (t97) f31087f.get(cls);
        if (t97Var != null) {
            if (t97Var.zza().equals(s97Var.m10488c())) {
                return t97Var.mo9420a(s97Var);
            }
            String obj = t97Var.zza().toString();
            String obj2 = s97Var.m10488c().toString();
            throw new GeneralSecurityException("Wrong input primitive class, expected " + obj + ", got " + obj2);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(s97Var.m10488c().getName()));
    }

    /* renamed from: k */
    public static synchronized Map m6288k() {
        Map unmodifiableMap;
        synchronized (w97.class) {
            unmodifiableMap = Collections.unmodifiableMap(f31088g);
        }
        return unmodifiableMap;
    }

    /* renamed from: l */
    public static synchronized void m6287l(df7 df7Var, ee7 ee7Var, boolean z) {
        synchronized (w97.class) {
            AtomicReference atomicReference = f31083b;
            u87 u87Var = new u87((u87) atomicReference.get());
            u87Var.m8419c(df7Var, ee7Var);
            String mo5328d = df7Var.mo5328d();
            String mo5328d2 = ee7Var.mo5328d();
            m6283p(mo5328d, df7Var.mo5331a().mo6263c(), true);
            m6283p(mo5328d2, Collections.emptyMap(), false);
            if (!((u87) atomicReference.get()).m8416f(mo5328d)) {
                f31084c.put(mo5328d, new v97(df7Var));
                m6282q(df7Var.mo5328d(), df7Var.mo5331a().mo6263c());
            }
            ConcurrentMap concurrentMap = f31085d;
            concurrentMap.put(mo5328d, Boolean.TRUE);
            concurrentMap.put(mo5328d2, Boolean.FALSE);
            atomicReference.set(u87Var);
        }
    }

    /* renamed from: m */
    public static synchronized void m6286m(n87 n87Var, boolean z) {
        synchronized (w97.class) {
            try {
                if (n87Var == null) {
                    throw new IllegalArgumentException("key manager must be non-null.");
                }
                AtomicReference atomicReference = f31083b;
                u87 u87Var = new u87((u87) atomicReference.get());
                u87Var.m8418d(n87Var);
                if (!xb7.m5296a(1)) {
                    throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                }
                String zzf = n87Var.zzf();
                m6283p(zzf, Collections.emptyMap(), z);
                f31085d.put(zzf, Boolean.valueOf(z));
                atomicReference.set(u87Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: n */
    public static synchronized void m6285n(ee7 ee7Var, boolean z) {
        synchronized (w97.class) {
            AtomicReference atomicReference = f31083b;
            u87 u87Var = new u87((u87) atomicReference.get());
            u87Var.m8417e(ee7Var);
            String mo5328d = ee7Var.mo5328d();
            m6283p(mo5328d, ee7Var.mo5331a().mo6263c(), true);
            if (!((u87) atomicReference.get()).m8416f(mo5328d)) {
                f31084c.put(mo5328d, new v97(ee7Var));
                m6282q(mo5328d, ee7Var.mo5331a().mo6263c());
            }
            f31085d.put(mo5328d, Boolean.TRUE);
            atomicReference.set(u87Var);
        }
    }

    /* renamed from: o */
    public static synchronized void m6284o(t97 t97Var) {
        synchronized (w97.class) {
            if (t97Var == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class zzb = t97Var.zzb();
            ConcurrentMap concurrentMap = f31087f;
            if (concurrentMap.containsKey(zzb)) {
                t97 t97Var2 = (t97) concurrentMap.get(zzb);
                if (!t97Var.getClass().getName().equals(t97Var2.getClass().getName())) {
                    f31082a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(zzb.toString()));
                    throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", zzb.getName(), t97Var2.getClass().getName(), t97Var.getClass().getName()));
                }
            }
            concurrentMap.put(zzb, t97Var);
        }
    }

    /* renamed from: p */
    public static synchronized void m6283p(String str, Map map, boolean z) {
        synchronized (w97.class) {
            if (z) {
                ConcurrentMap concurrentMap = f31085d;
                if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
                if (((u87) f31083b.get()).m8416f(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!f31088g.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (f31088g.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.daaw.xt7, java.lang.Object] */
    /* renamed from: q */
    public static void m6282q(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f31088g.put((String) entry.getKey(), w87.m6338e(str, ((ce7) entry.getValue()).f5768a.mo4516a(), ((ce7) entry.getValue()).f5769b));
        }
    }
}
