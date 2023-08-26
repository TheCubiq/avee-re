package com.google.android.gms.internal.measurement;

import java.io.PrintStream;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzfw {
    private static final zzfz zza;
    private static final int zzb;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
    /* loaded from: classes2.dex */
    static final class zza extends zzfz {
        zza() {
        }

        @Override // com.google.android.gms.internal.measurement.zzfz
        public final void zza(Throwable th, Throwable th2) {
        }
    }

    public static void zza(Throwable th, Throwable th2) {
        zza.zza(th, th2);
    }

    private static Integer zza() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    static {
        Integer num;
        zzfz zzaVar;
        try {
            num = zza();
        } catch (Throwable th) {
            th = th;
            num = null;
        }
        if (num != null) {
            try {
            } catch (Throwable th2) {
                th = th2;
                PrintStream printStream = System.err;
                String name = zza.class.getName();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 133);
                sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
                sb.append(name);
                sb.append("will be used. The error is: ");
                printStream.println(sb.toString());
                th.printStackTrace(System.err);
                zzaVar = new zza();
                zza = zzaVar;
                zzb = num != null ? num.intValue() : 1;
            }
            if (num.intValue() >= 19) {
                zzaVar = new zzgc();
                zza = zzaVar;
                zzb = num != null ? num.intValue() : 1;
            }
        }
        if (!Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
            zzaVar = new zzga();
        } else {
            zzaVar = new zza();
        }
        zza = zzaVar;
        zzb = num != null ? num.intValue() : 1;
    }
}
