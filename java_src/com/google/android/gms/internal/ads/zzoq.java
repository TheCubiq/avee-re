package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzoq extends zzqp implements zzpc {
    private Bundle mExtras;
    private Object mLock = new Object();
    private String zzbhw;
    private List<zzon> zzbhx;
    private String zzbhy;
    private String zzbia;
    private zzoj zzbie;
    private zzlo zzbif;
    private View zzbig;
    private IObjectWrapper zzbih;
    private String zzbii;
    private zzoz zzbij;
    private zzpw zzbil;
    private String zzbim;

    public zzoq(String str, List<zzon> list, String str2, zzpw zzpwVar, String str3, String str4, zzoj zzojVar, Bundle bundle, zzlo zzloVar, View view, IObjectWrapper iObjectWrapper, String str5) {
        this.zzbhw = str;
        this.zzbhx = list;
        this.zzbhy = str2;
        this.zzbil = zzpwVar;
        this.zzbia = str3;
        this.zzbim = str4;
        this.zzbie = zzojVar;
        this.mExtras = bundle;
        this.zzbif = zzloVar;
        this.zzbig = view;
        this.zzbih = iObjectWrapper;
        this.zzbii = str5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzoz zza(zzoq zzoqVar, zzoz zzozVar) {
        zzoqVar.zzbij = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void destroy() {
        zzakk.zzcrm.post(new zzor(this));
        this.zzbhw = null;
        this.zzbhx = null;
        this.zzbhy = null;
        this.zzbil = null;
        this.zzbia = null;
        this.zzbim = null;
        this.zzbie = null;
        this.mExtras = null;
        this.mLock = null;
        this.zzbif = null;
        this.zzbig = null;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final String getAdvertiser() {
        return this.zzbim;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final String getBody() {
        return this.zzbhy;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final String getCallToAction() {
        return this.zzbia;
    }

    @Override // com.google.android.gms.internal.ads.zzpb
    public final String getCustomTemplateId() {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final Bundle getExtras() {
        return this.mExtras;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final String getHeadline() {
        return this.zzbhw;
    }

    @Override // com.google.android.gms.internal.ads.zzqo, com.google.android.gms.internal.ads.zzpc
    public final List getImages() {
        return this.zzbhx;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final String getMediationAdapterClassName() {
        return this.zzbii;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final zzlo getVideoController() {
        return this.zzbif;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void performClick(Bundle bundle) {
        synchronized (this.mLock) {
            if (this.zzbij == null) {
                zzakb.e("#001 Attempt to perform click before app native ad initialized.");
            } else {
                this.zzbij.performClick(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final boolean recordImpression(Bundle bundle) {
        synchronized (this.mLock) {
            if (this.zzbij == null) {
                zzakb.e("#002 Attempt to record impression before native ad initialized.");
                return false;
            }
            return this.zzbij.recordImpression(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final void reportTouchEvent(Bundle bundle) {
        synchronized (this.mLock) {
            if (this.zzbij == null) {
                zzakb.e("#003 Attempt to report touch event before native ad initialized.");
            } else {
                this.zzbij.reportTouchEvent(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpb
    public final void zzb(zzoz zzozVar) {
        synchronized (this.mLock) {
            this.zzbij = zzozVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final IObjectWrapper zzka() {
        return ObjectWrapper.wrap(this.zzbij);
    }

    @Override // com.google.android.gms.internal.ads.zzpb
    public final String zzkb() {
        return "1";
    }

    @Override // com.google.android.gms.internal.ads.zzpb
    public final zzoj zzkc() {
        return this.zzbie;
    }

    @Override // com.google.android.gms.internal.ads.zzpb
    public final View zzkd() {
        return this.zzbig;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final IObjectWrapper zzke() {
        return this.zzbih;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final zzps zzkf() {
        return this.zzbie;
    }

    @Override // com.google.android.gms.internal.ads.zzqo
    public final zzpw zzkg() {
        return this.zzbil;
    }
}
