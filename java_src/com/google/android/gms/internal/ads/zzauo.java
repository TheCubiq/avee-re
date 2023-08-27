package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxr;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes2.dex */
public final class zzauo {
    private static final Logger logger = Logger.getLogger(zzauo.class.getName());
    private static final ConcurrentMap<String, zzaug> zzdhq = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> zzdhr = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zzaua> zzdhs = new ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public static <P> zzaum<P> zza(zzauh zzauhVar, zzaug<P> zzaugVar) throws GeneralSecurityException {
        zzaup.zzc(zzauhVar.zzwg());
        zzaum<P> zzaumVar = (zzaum<P>) new zzaum();
        for (zzaxr.zzb zzbVar : zzauhVar.zzwg().zzzl()) {
            if (zzbVar.zzzq() == zzaxl.ENABLED) {
                zzaun zza = zzaumVar.zza(zza(zzbVar.zzzp().zzyw(), zzbVar.zzzp().zzyx()), zzbVar);
                if (zzbVar.zzzr() == zzauhVar.zzwg().zzzk()) {
                    zzaumVar.zza(zza);
                }
            }
        }
        return zzaumVar;
    }

    public static <P> zzaxi zza(zzaxn zzaxnVar) throws GeneralSecurityException {
        zzaug zzdz = zzdz(zzaxnVar.zzyw());
        if (zzdhr.get(zzaxnVar.zzyw()).booleanValue()) {
            return zzdz.zzc(zzaxnVar.zzyx());
        }
        String valueOf = String.valueOf(zzaxnVar.zzyw());
        throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
    }

    public static <P> zzbcu zza(String str, zzbcu zzbcuVar) throws GeneralSecurityException {
        zzaug zzdz = zzdz(str);
        if (zzdhr.get(str).booleanValue()) {
            return zzdz.zzb(zzbcuVar);
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
    }

    private static <P> P zza(String str, zzbah zzbahVar) throws GeneralSecurityException {
        return (P) zzdz(str).zza(zzbahVar);
    }

    public static <P> P zza(String str, byte[] bArr) throws GeneralSecurityException {
        return (P) zza(str, zzbah.zzo(bArr));
    }

    public static synchronized <P> void zza(String str, zzaua<P> zzauaVar) throws GeneralSecurityException {
        synchronized (zzauo.class) {
            if (zzdhs.containsKey(str.toLowerCase()) && !zzauaVar.getClass().equals(zzdhs.get(str.toLowerCase()).getClass())) {
                Logger logger2 = logger;
                Level level = Level.WARNING;
                String valueOf = String.valueOf(str);
                logger2.logp(level, "com.google.crypto.tink.Registry", "addCatalogue", valueOf.length() != 0 ? "Attempted overwrite of a catalogueName catalogue for name ".concat(valueOf) : new String("Attempted overwrite of a catalogueName catalogue for name "));
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
                sb.append("catalogue for name ");
                sb.append(str);
                sb.append(" has been already registered");
                throw new GeneralSecurityException(sb.toString());
            }
            zzdhs.put(str.toLowerCase(), zzauaVar);
        }
    }

    public static <P> void zza(String str, zzaug<P> zzaugVar) throws GeneralSecurityException {
        zza(str, zzaugVar, true);
    }

    public static synchronized <P> void zza(String str, zzaug<P> zzaugVar, boolean z) throws GeneralSecurityException {
        synchronized (zzauo.class) {
            if (zzaugVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            if (zzdhq.containsKey(str)) {
                zzaug zzdz = zzdz(str);
                boolean booleanValue = zzdhr.get(str).booleanValue();
                if (!zzaugVar.getClass().equals(zzdz.getClass()) || (!booleanValue && z)) {
                    Logger logger2 = logger;
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(str);
                    logger2.logp(level, "com.google.crypto.tink.Registry", "registerKeyManager", valueOf.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(valueOf) : new String("Attempted overwrite of a registered key manager for key type "));
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, zzdz.getClass().getName(), zzaugVar.getClass().getName()));
                }
            }
            zzdhq.put(str, zzaugVar);
            zzdhr.put(str, Boolean.valueOf(z));
        }
    }

    public static <P> zzbcu zzb(zzaxn zzaxnVar) throws GeneralSecurityException {
        zzaug zzdz = zzdz(zzaxnVar.zzyw());
        if (zzdhr.get(zzaxnVar.zzyw()).booleanValue()) {
            return zzdz.zzb(zzaxnVar.zzyx());
        }
        String valueOf = String.valueOf(zzaxnVar.zzyw());
        throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
    }

    public static <P> P zzb(String str, zzbcu zzbcuVar) throws GeneralSecurityException {
        return (P) zzdz(str).zza(zzbcuVar);
    }

    public static <P> zzaua<P> zzdy(String str) throws GeneralSecurityException {
        String valueOf;
        String str2;
        if (str != null) {
            zzaua<P> zzauaVar = zzdhs.get(str.toLowerCase());
            if (zzauaVar == null) {
                String format = String.format("no catalogue found for %s. ", str);
                if (str.toLowerCase().startsWith("tinkaead")) {
                    format = String.valueOf(format).concat("Maybe call AeadConfig.init().");
                }
                if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                    valueOf = String.valueOf(format);
                    str2 = "Maybe call DeterministicAeadConfig.init().";
                } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                    valueOf = String.valueOf(format);
                    str2 = "Maybe call StreamingAeadConfig.init().";
                } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                    valueOf = String.valueOf(format);
                    str2 = "Maybe call HybridConfig.init().";
                } else if (str.toLowerCase().startsWith("tinkmac")) {
                    valueOf = String.valueOf(format);
                    str2 = "Maybe call MacConfig.init().";
                } else if (!str.toLowerCase().startsWith("tinkpublickeysign") && !str.toLowerCase().startsWith("tinkpublickeyverify")) {
                    if (str.toLowerCase().startsWith("tink")) {
                        valueOf = String.valueOf(format);
                        str2 = "Maybe call TinkConfig.init().";
                    }
                    throw new GeneralSecurityException(format);
                } else {
                    valueOf = String.valueOf(format);
                    str2 = "Maybe call SignatureConfig.init().";
                }
                format = valueOf.concat(str2);
                throw new GeneralSecurityException(format);
            }
            return zzauaVar;
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    private static <P> zzaug<P> zzdz(String str) throws GeneralSecurityException {
        zzaug<P> zzaugVar = zzdhq.get(str);
        if (zzaugVar != null) {
            return zzaugVar;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
        sb.append("No key manager found for key type: ");
        sb.append(str);
        sb.append(".  Check the configuration of the registry.");
        throw new GeneralSecurityException(sb.toString());
    }
}
