package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
@zzadh
/* loaded from: classes2.dex */
final class zzaoa {
    private final Object zzcvu = new Object();
    private final List<Runnable> zzcvv = new ArrayList();
    private boolean zzcvw = false;

    public final void zza(final Runnable runnable, final Executor executor) {
        synchronized (this.zzcvu) {
            if (this.zzcvw) {
                executor.execute(runnable);
            } else {
                this.zzcvv.add(new Runnable(executor, runnable) { // from class: com.google.android.gms.internal.ads.zzaob
                    private final Executor zzcvx;
                    private final Runnable zzxi;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzcvx = executor;
                        this.zzxi = runnable;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzcvx.execute(this.zzxi);
                    }
                });
            }
        }
    }

    public final void zzsm() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.zzcvu) {
            if (this.zzcvw) {
                return;
            }
            arrayList.addAll(this.zzcvv);
            this.zzcvv.clear();
            this.zzcvw = true;
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
    }
}
