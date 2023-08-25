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
    public static final Logger a = Logger.getLogger(w97.class.getName());
    public static final AtomicReference b = new AtomicReference(new u87());
    public static final ConcurrentMap c = new ConcurrentHashMap();
    public static final ConcurrentMap d = new ConcurrentHashMap();
    public static final ConcurrentMap e = new ConcurrentHashMap();
    public static final ConcurrentMap f = new ConcurrentHashMap();
    public static final ConcurrentMap g = new ConcurrentHashMap();

    @Deprecated
    public static d87 a(String str) {
        String valueOf;
        String str2;
        if (str != null) {
            ConcurrentMap concurrentMap = e;
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

    public static n87 b(String str) {
        return ((u87) b.get()).b(str);
    }

    public static synchronized nm7 c(vm7 vm7Var) {
        nm7 c2;
        synchronized (w97.class) {
            n87 b2 = b(vm7Var.Q());
            if (!((Boolean) d.get(vm7Var.Q())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(vm7Var.Q())));
            }
            c2 = b2.c(vm7Var.P());
        }
        return c2;
    }

    public static synchronized xt7 d(vm7 vm7Var) {
        xt7 d2;
        synchronized (w97.class) {
            n87 b2 = b(vm7Var.Q());
            if (!((Boolean) d.get(vm7Var.Q())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(vm7Var.Q())));
            }
            d2 = b2.d(vm7Var.P());
        }
        return d2;
    }

    @Nullable
    public static Class e(Class cls) {
        t97 t97Var = (t97) f.get(cls);
        if (t97Var == null) {
            return null;
        }
        return t97Var.zza();
    }

    public static Object f(nm7 nm7Var, Class cls) {
        return g(nm7Var.Q(), nm7Var.P(), cls);
    }

    public static Object g(String str, yq7 yq7Var, Class cls) {
        return ((u87) b.get()).a(str, cls).b(yq7Var);
    }

    public static Object h(String str, xt7 xt7Var, Class cls) {
        return ((u87) b.get()).a(str, cls).a(xt7Var);
    }

    public static Object i(String str, byte[] bArr, Class cls) {
        return g(str, yq7.F(bArr), cls);
    }

    public static Object j(s97 s97Var, Class cls) {
        t97 t97Var = (t97) f.get(cls);
        if (t97Var != null) {
            if (t97Var.zza().equals(s97Var.c())) {
                return t97Var.a(s97Var);
            }
            String obj = t97Var.zza().toString();
            String obj2 = s97Var.c().toString();
            throw new GeneralSecurityException("Wrong input primitive class, expected " + obj + ", got " + obj2);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(s97Var.c().getName()));
    }

    public static synchronized Map k() {
        Map unmodifiableMap;
        synchronized (w97.class) {
            unmodifiableMap = Collections.unmodifiableMap(g);
        }
        return unmodifiableMap;
    }

    public static synchronized void l(df7 df7Var, ee7 ee7Var, boolean z) {
        synchronized (w97.class) {
            AtomicReference atomicReference = b;
            u87 u87Var = new u87((u87) atomicReference.get());
            u87Var.c(df7Var, ee7Var);
            String d2 = df7Var.d();
            String d3 = ee7Var.d();
            p(d2, df7Var.a().c(), true);
            p(d3, Collections.emptyMap(), false);
            if (!((u87) atomicReference.get()).f(d2)) {
                c.put(d2, new v97(df7Var));
                q(df7Var.d(), df7Var.a().c());
            }
            ConcurrentMap concurrentMap = d;
            concurrentMap.put(d2, Boolean.TRUE);
            concurrentMap.put(d3, Boolean.FALSE);
            atomicReference.set(u87Var);
        }
    }

    public static synchronized void m(n87 n87Var, boolean z) {
        synchronized (w97.class) {
            try {
                if (n87Var == null) {
                    throw new IllegalArgumentException("key manager must be non-null.");
                }
                AtomicReference atomicReference = b;
                u87 u87Var = new u87((u87) atomicReference.get());
                u87Var.d(n87Var);
                if (!xb7.a(1)) {
                    throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                }
                String zzf = n87Var.zzf();
                p(zzf, Collections.emptyMap(), z);
                d.put(zzf, Boolean.valueOf(z));
                atomicReference.set(u87Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void n(ee7 ee7Var, boolean z) {
        synchronized (w97.class) {
            AtomicReference atomicReference = b;
            u87 u87Var = new u87((u87) atomicReference.get());
            u87Var.e(ee7Var);
            String d2 = ee7Var.d();
            p(d2, ee7Var.a().c(), true);
            if (!((u87) atomicReference.get()).f(d2)) {
                c.put(d2, new v97(ee7Var));
                q(d2, ee7Var.a().c());
            }
            d.put(d2, Boolean.TRUE);
            atomicReference.set(u87Var);
        }
    }

    public static synchronized void o(t97 t97Var) {
        synchronized (w97.class) {
            if (t97Var == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class zzb = t97Var.zzb();
            ConcurrentMap concurrentMap = f;
            if (concurrentMap.containsKey(zzb)) {
                t97 t97Var2 = (t97) concurrentMap.get(zzb);
                if (!t97Var.getClass().getName().equals(t97Var2.getClass().getName())) {
                    a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(zzb.toString()));
                    throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", zzb.getName(), t97Var2.getClass().getName(), t97Var.getClass().getName()));
                }
            }
            concurrentMap.put(zzb, t97Var);
        }
    }

    public static synchronized void p(String str, Map map, boolean z) {
        synchronized (w97.class) {
            if (z) {
                ConcurrentMap concurrentMap = d;
                if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
                if (((u87) b.get()).f(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!g.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (g.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.daaw.xt7, java.lang.Object] */
    public static void q(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            g.put((String) entry.getKey(), w87.e(str, ((ce7) entry.getValue()).a.a(), ((ce7) entry.getValue()).b));
        }
    }
}
