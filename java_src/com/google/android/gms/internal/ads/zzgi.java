package com.google.android.gms.internal.ads;

import java.util.List;
/* loaded from: classes2.dex */
final class zzgi implements Runnable {
    private final /* synthetic */ zzgh zzahx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgi(zzgh zzghVar) {
        this.zzahx = zzghVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List<zzgj> list;
        obj = this.zzahx.mLock;
        synchronized (obj) {
            z = this.zzahx.zzahr;
            if (z) {
                z2 = this.zzahx.zzahs;
                if (z2) {
                    zzgh.zza(this.zzahx, false);
                    zzakb.zzck("App went background");
                    list = this.zzahx.zzaht;
                    for (zzgj zzgjVar : list) {
                        try {
                            zzgjVar.zzh(false);
                        } catch (Exception e) {
                            zzane.zzb("", e);
                        }
                    }
                }
            }
            zzakb.zzck("App is still foreground");
        }
    }
}
