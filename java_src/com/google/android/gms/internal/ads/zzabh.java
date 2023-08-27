package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
@zzadh
/* loaded from: classes2.dex */
public abstract class zzabh extends zzajx {
    protected final Context mContext;
    protected final Object mLock;
    protected final zzabm zzbzd;
    protected final zzaji zzbze;
    protected zzaej zzbzf;
    protected final Object zzbzh;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzabh(Context context, zzaji zzajiVar, zzabm zzabmVar) {
        super(true);
        this.mLock = new Object();
        this.zzbzh = new Object();
        this.mContext = context;
        this.zzbze = zzajiVar;
        this.zzbzf = zzajiVar.zzcos;
        this.zzbzd = zzabmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public void onStop() {
    }

    protected abstract zzajh zzaa(int i);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000c, B:21:0x0050, B:22:0x005e, B:8:0x0015, B:13:0x0020, B:15:0x002f, B:17:0x0033, B:18:0x0038, B:20:0x0045, B:19:0x003b, B:14:0x0028), top: B:29:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:4:0x0003, B:5:0x000c, B:21:0x0050, B:22:0x005e, B:8:0x0015, B:13:0x0020, B:15:0x002f, B:17:0x0033, B:18:0x0038, B:20:0x0045, B:19:0x003b, B:14:0x0028), top: B:29:0x0003, inners: #1 }] */
    @Override // com.google.android.gms.internal.ads.zzajx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzdn() {
        synchronized (this.mLock) {
            zzakb.zzck("AdRendererBackgroundTask started.");
            int i = this.zzbze.errorCode;
            try {
                zze(SystemClock.elapsedRealtime());
            } catch (zzabk e) {
                int errorCode = e.getErrorCode();
                if (errorCode != 3 && errorCode != -1) {
                    zzakb.zzdk(e.getMessage());
                    this.zzbzf = this.zzbzf != null ? new zzaej(errorCode) : new zzaej(errorCode, this.zzbzf.zzbsu);
                    zzakk.zzcrm.post(new zzabi(this));
                    i = errorCode;
                }
                zzakb.zzdj(e.getMessage());
                this.zzbzf = this.zzbzf != null ? new zzaej(errorCode) : new zzaej(errorCode, this.zzbzf.zzbsu);
                zzakk.zzcrm.post(new zzabi(this));
                i = errorCode;
            }
            zzakk.zzcrm.post(new zzabj(this, zzaa(i)));
        }
    }

    protected abstract void zze(long j) throws zzabk;
}
