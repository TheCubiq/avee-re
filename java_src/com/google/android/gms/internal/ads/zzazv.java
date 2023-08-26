package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.util.List;
/* loaded from: classes2.dex */
final class zzazv extends zzazs {
    private final zzazt zzdpb = new zzazt();

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> zza = this.zzdpb.zza(th, false);
        if (zza == null) {
            return;
        }
        synchronized (zza) {
            for (Throwable th2 : zza) {
                printWriter.print("Suppressed: ");
                th2.printStackTrace(printWriter);
            }
        }
    }
}
