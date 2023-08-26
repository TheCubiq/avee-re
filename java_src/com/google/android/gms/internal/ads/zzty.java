package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.ParametersAreNonnullByDefault;
/* JADX INFO: Access modifiers changed from: package-private */
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzty {
    private final LinkedList<zztz> zzbon;
    private zzjj zzboo;
    private final int zzbop;
    private boolean zzboq;
    private final String zzye;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzty(zzjj zzjjVar, String str, int i) {
        Preconditions.checkNotNull(zzjjVar);
        Preconditions.checkNotNull(str);
        this.zzbon = new LinkedList<>();
        this.zzboo = zzjjVar;
        this.zzye = str;
        this.zzbop = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String getAdUnitId() {
        return this.zzye;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int getNetworkType() {
        return this.zzbop;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int size() {
        return this.zzbon.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzss zzssVar, zzjj zzjjVar) {
        this.zzbon.add(new zztz(this, zzssVar, zzjjVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzb(zzss zzssVar) {
        zztz zztzVar = new zztz(this, zzssVar);
        this.zzbon.add(zztzVar);
        return zztzVar.load();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zztz zzl(zzjj zzjjVar) {
        if (zzjjVar != null) {
            this.zzboo = zzjjVar;
        }
        return this.zzbon.remove();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzjj zzlf() {
        return this.zzboo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzlg() {
        Iterator<zztz> it = this.zzbon.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().zzwa) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzlh() {
        Iterator<zztz> it = this.zzbon.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().load()) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzli() {
        this.zzboq = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzlj() {
        return this.zzboq;
    }
}
