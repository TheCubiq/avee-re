package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
@zzadh
/* loaded from: classes2.dex */
public final class zzaak extends zzaal implements com.google.android.gms.ads.internal.gmsg.zzv<zzaqw> {
    private final Context mContext;
    private final WindowManager zzaeu;
    private DisplayMetrics zzagj;
    private final zzaqw zzbnd;
    private final zzmw zzbww;
    private float zzbwx;
    private int zzbwy;
    private int zzbwz;
    private int zzbxa;
    private int zzbxb;
    private int zzbxc;
    private int zzbxd;
    private int zzbxe;

    public zzaak(zzaqw zzaqwVar, Context context, zzmw zzmwVar) {
        super(zzaqwVar);
        this.zzbwy = -1;
        this.zzbwz = -1;
        this.zzbxb = -1;
        this.zzbxc = -1;
        this.zzbxd = -1;
        this.zzbxe = -1;
        this.zzbnd = zzaqwVar;
        this.mContext = context;
        this.zzbww = zzmwVar;
        this.zzaeu = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final /* synthetic */ void zza(zzaqw zzaqwVar, Map map) {
        int i;
        this.zzagj = new DisplayMetrics();
        Display defaultDisplay = this.zzaeu.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zzagj);
        this.zzbwx = this.zzagj.density;
        this.zzbxa = defaultDisplay.getRotation();
        zzkb.zzif();
        DisplayMetrics displayMetrics = this.zzagj;
        this.zzbwy = zzamu.zzb(displayMetrics, displayMetrics.widthPixels);
        zzkb.zzif();
        DisplayMetrics displayMetrics2 = this.zzagj;
        this.zzbwz = zzamu.zzb(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzto = this.zzbnd.zzto();
        if (zzto == null || zzto.getWindow() == null) {
            this.zzbxb = this.zzbwy;
            i = this.zzbwz;
        } else {
            com.google.android.gms.ads.internal.zzbv.zzek();
            int[] zzf = zzakk.zzf(zzto);
            zzkb.zzif();
            this.zzbxb = zzamu.zzb(this.zzagj, zzf[0]);
            zzkb.zzif();
            i = zzamu.zzb(this.zzagj, zzf[1]);
        }
        this.zzbxc = i;
        if (this.zzbnd.zzud().zzvs()) {
            this.zzbxd = this.zzbwy;
            this.zzbxe = this.zzbwz;
        } else {
            this.zzbnd.measure(0, 0);
        }
        zza(this.zzbwy, this.zzbwz, this.zzbxb, this.zzbxc, this.zzbwx, this.zzbxa);
        this.zzbnd.zza("onDeviceFeaturesReceived", new zzaah(new zzaaj().zzo(this.zzbww.zziw()).zzn(this.zzbww.zzix()).zzp(this.zzbww.zziz()).zzq(this.zzbww.zziy()).zzr(true)).zzng());
        int[] iArr = new int[2];
        this.zzbnd.getLocationOnScreen(iArr);
        zzkb.zzif();
        int zzb = zzamu.zzb(this.mContext, iArr[0]);
        zzkb.zzif();
        zzc(zzb, zzamu.zzb(this.mContext, iArr[1]));
        if (zzakb.isLoggable(2)) {
            zzakb.zzdj("Dispatching Ready Event.");
        }
        zzbx(this.zzbnd.zztq().zzcw);
    }

    public final void zzc(int i, int i2) {
        int i3 = this.mContext instanceof Activity ? com.google.android.gms.ads.internal.zzbv.zzek().zzh((Activity) this.mContext)[0] : 0;
        if (this.zzbnd.zzud() == null || !this.zzbnd.zzud().zzvs()) {
            zzkb.zzif();
            this.zzbxd = zzamu.zzb(this.mContext, this.zzbnd.getWidth());
            zzkb.zzif();
            this.zzbxe = zzamu.zzb(this.mContext, this.zzbnd.getHeight());
        }
        zzc(i, i2 - i3, this.zzbxd, this.zzbxe);
        this.zzbnd.zzuf().zzb(i, i2);
    }
}
