package com.google.android.gms.internal.ads;
@zzadh
/* loaded from: classes2.dex */
public final class zzkb {
    private static final Object sLock = new Object();
    private static zzkb zzarz;
    private final zzamu zzasa = new zzamu();
    private final zzjr zzasb = new zzjr(new zzjh(), new zzjg(), new zzme(), new zzrv(), new zzahi(), new zzaao(), new zzrw());
    private final String zzasc = zzamu.zzsi();
    private final zzng zzasd = new zzng();
    private final zznh zzase = new zznh();
    private final zzni zzasf = new zzni();

    static {
        zzkb zzkbVar = new zzkb();
        synchronized (sLock) {
            zzarz = zzkbVar;
        }
    }

    protected zzkb() {
    }

    private static zzkb zzie() {
        zzkb zzkbVar;
        synchronized (sLock) {
            zzkbVar = zzarz;
        }
        return zzkbVar;
    }

    public static zzamu zzif() {
        return zzie().zzasa;
    }

    public static zzjr zzig() {
        return zzie().zzasb;
    }

    public static String zzih() {
        return zzie().zzasc;
    }

    public static zznh zzii() {
        return zzie().zzase;
    }

    public static zzng zzij() {
        return zzie().zzasd;
    }

    public static zzni zzik() {
        return zzie().zzasf;
    }
}
