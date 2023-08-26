package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* loaded from: classes2.dex */
final class zzahp implements Runnable {
    private final /* synthetic */ zzxq zzclu;
    private final /* synthetic */ zzahn zzclv;
    private final /* synthetic */ zzahv zzclw;
    private final /* synthetic */ zzjj zzyh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzahp(zzahn zzahnVar, zzxq zzxqVar, zzjj zzjjVar, zzahv zzahvVar) {
        this.zzclv = zzahnVar;
        this.zzclu = zzxqVar;
        this.zzyh = zzjjVar;
        this.zzclw = zzahvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        String str;
        try {
            zzxq zzxqVar = this.zzclu;
            context = this.zzclv.mContext;
            IObjectWrapper wrap = ObjectWrapper.wrap(context);
            zzjj zzjjVar = this.zzyh;
            zzahv zzahvVar = this.zzclw;
            str = this.zzclv.zzcln;
            zzxqVar.zza(wrap, zzjjVar, (String) null, zzahvVar, str);
        } catch (RemoteException e) {
            String valueOf = String.valueOf(this.zzclv.zzbth);
            zzakb.zzc(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "), e);
            zzahn zzahnVar = this.zzclv;
            zzahnVar.zza(zzahnVar.zzbth, 0);
        }
    }
}
