package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.daaw.an3;
import com.daaw.ar3;
import com.daaw.ay5;
import com.daaw.b94;
import com.daaw.cc6;
import com.daaw.ci3;
import com.daaw.dc6;
import com.daaw.f45;
import com.daaw.fd3;
import com.daaw.fv3;
import com.daaw.g93;
import com.daaw.h45;
import com.daaw.hr3;
import com.daaw.if5;
import com.daaw.mh6;
import com.daaw.nt0;
import com.daaw.sf6;
import com.daaw.td6;
import com.daaw.wv3;
import com.daaw.yd0;
import com.daaw.zc3;
import com.daaw.zh3;
import com.daaw.zy3;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.internal.ads.zzchu;
import java.util.HashMap;
/* loaded from: classes.dex */
public class ClientApi extends zzcd {
    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(yd0 yd0Var, String str, an3 an3Var, int i) {
        Context context = (Context) nt0.M(yd0Var);
        return new ay5(b94.f(context, an3Var, i), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(yd0 yd0Var, zzq zzqVar, String str, an3 an3Var, int i) {
        Context context = (Context) nt0.M(yd0Var);
        cc6 w = b94.f(context, an3Var, i).w();
        w.zza(str);
        w.a(context);
        dc6 zzc = w.zzc();
        return i >= ((Integer) zzba.zzc().b(g93.I4)).intValue() ? zzc.zzb() : zzc.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(yd0 yd0Var, zzq zzqVar, String str, an3 an3Var, int i) {
        Context context = (Context) nt0.M(yd0Var);
        td6 x = b94.f(context, an3Var, i).x();
        x.b(context);
        x.a(zzqVar);
        x.zzb(str);
        return x.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(yd0 yd0Var, zzq zzqVar, String str, an3 an3Var, int i) {
        Context context = (Context) nt0.M(yd0Var);
        sf6 y = b94.f(context, an3Var, i).y();
        y.b(context);
        y.a(zzqVar);
        y.zzb(str);
        return y.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(yd0 yd0Var, zzq zzqVar, String str, int i) {
        return new zzs((Context) nt0.M(yd0Var), zzqVar, str, new zzchu(224400000, i, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(yd0 yd0Var, int i) {
        return b94.f((Context) nt0.M(yd0Var), null, i).g();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(yd0 yd0Var, an3 an3Var, int i) {
        return b94.f((Context) nt0.M(yd0Var), an3Var, i).q();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zc3 zzi(yd0 yd0Var, yd0 yd0Var2) {
        return new h45((FrameLayout) nt0.M(yd0Var), (FrameLayout) nt0.M(yd0Var2), 224400000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final fd3 zzj(yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3) {
        return new f45((View) nt0.M(yd0Var), (HashMap) nt0.M(yd0Var2), (HashMap) nt0.M(yd0Var3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final ci3 zzk(yd0 yd0Var, an3 an3Var, int i, zh3 zh3Var) {
        Context context = (Context) nt0.M(yd0Var);
        if5 o = b94.f(context, an3Var, i).o();
        o.a(context);
        o.b(zh3Var);
        return o.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final ar3 zzl(yd0 yd0Var, an3 an3Var, int i) {
        return b94.f((Context) nt0.M(yd0Var), an3Var, i).r();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final hr3 zzm(yd0 yd0Var) {
        Activity activity = (Activity) nt0.M(yd0Var);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new com.google.android.gms.ads.internal.overlay.zzt(activity);
        }
        int i = zza.zzk;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new com.google.android.gms.ads.internal.overlay.zzt(activity) : new zzac(activity) : new zzy(activity, zza) : new zzaf(activity) : new zzae(activity) : new com.google.android.gms.ads.internal.overlay.zzs(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final fv3 zzn(yd0 yd0Var, an3 an3Var, int i) {
        Context context = (Context) nt0.M(yd0Var);
        mh6 z = b94.f(context, an3Var, i).z();
        z.a(context);
        return z.zzc().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final wv3 zzo(yd0 yd0Var, String str, an3 an3Var, int i) {
        Context context = (Context) nt0.M(yd0Var);
        mh6 z = b94.f(context, an3Var, i).z();
        z.a(context);
        z.zza(str);
        return z.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zy3 zzp(yd0 yd0Var, an3 an3Var, int i) {
        return b94.f((Context) nt0.M(yd0Var), an3Var, i).u();
    }
}
