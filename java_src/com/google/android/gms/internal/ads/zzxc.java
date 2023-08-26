package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzxc implements Runnable {
    private final /* synthetic */ zzxa zzbts;
    private final /* synthetic */ zzxb zzbtt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxc(zzxb zzxbVar, zzxa zzxaVar) {
        this.zzbtt = zzxbVar;
        this.zzbts = zzxaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i;
        zzxq zzmj;
        zzxq zzxqVar;
        boolean zzmk;
        boolean zzy;
        String str;
        obj = this.zzbtt.mLock;
        synchronized (obj) {
            i = this.zzbtt.zzbtq;
            if (i != -2) {
                return;
            }
            zzxb zzxbVar = this.zzbtt;
            zzmj = this.zzbtt.zzmj();
            zzxbVar.zzbtp = zzmj;
            zzxqVar = this.zzbtt.zzbtp;
            if (zzxqVar == null) {
                this.zzbtt.zzx(4);
                return;
            }
            zzmk = this.zzbtt.zzmk();
            if (zzmk) {
                zzy = this.zzbtt.zzy(1);
                if (!zzy) {
                    str = this.zzbtt.zzbth;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                    sb.append("Ignoring adapter ");
                    sb.append(str);
                    sb.append(" as delayed impression is not supported");
                    zzakb.zzdk(sb.toString());
                    this.zzbtt.zzx(2);
                    return;
                }
            }
            this.zzbts.zza(this.zzbtt);
            this.zzbtt.zza(this.zzbts);
        }
    }
}
