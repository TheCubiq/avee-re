package com.daaw;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.internal.ads.zzcao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
/* loaded from: classes.dex */
public final class zs3 {
    @Nonnull

    /* renamed from: a */
    public final View f35456a;

    /* renamed from: b */
    public final Map f35457b;

    /* renamed from: c */
    public final zy3 f35458c;

    public zs3(ys3 ys3Var) {
        View view;
        Map map;
        View view2;
        view = ys3Var.f34000a;
        this.f35456a = view;
        map = ys3Var.f34001b;
        this.f35457b = map;
        view2 = ys3Var.f34000a;
        zy3 m8842a = ts3.m8842a(view2.getContext());
        this.f35458c = m8842a;
        if (m8842a == null || map.isEmpty()) {
            return;
        }
        try {
            m8842a.zzf(new zzcao(nt0.m14830g3(view).asBinder(), nt0.m14830g3(map).asBinder()));
        } catch (RemoteException unused) {
            k04.zzg("Failed to call remote method.");
        }
    }

    /* renamed from: a */
    public final void m1940a(List list) {
        if (list == null || list.isEmpty()) {
            k04.zzj("No click urls were passed to recordClick");
            return;
        }
        if (this.f35458c == null) {
            k04.zzj("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            this.f35458c.zzg(list, nt0.m14830g3(this.f35456a), new xs3(this, list));
        } catch (RemoteException e) {
            k04.zzg("RemoteException recording click: ".concat(e.toString()));
        }
    }

    /* renamed from: b */
    public final void m1939b(List list) {
        if (list == null || list.isEmpty()) {
            k04.zzj("No impression urls were passed to recordImpression");
            return;
        }
        zy3 zy3Var = this.f35458c;
        if (zy3Var == null) {
            k04.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        try {
            zy3Var.zzh(list, nt0.m14830g3(this.f35456a), new ws3(this, list));
        } catch (RemoteException e) {
            k04.zzg("RemoteException recording impression urls: ".concat(e.toString()));
        }
    }

    /* renamed from: c */
    public final void m1938c(MotionEvent motionEvent) {
        zy3 zy3Var = this.f35458c;
        if (zy3Var == null) {
            k04.zze("Failed to get internal reporting info generator.");
            return;
        }
        try {
            zy3Var.zzj(nt0.m14830g3(motionEvent));
        } catch (RemoteException unused) {
            k04.zzg("Failed to call remote method.");
        }
    }

    /* renamed from: d */
    public final void m1937d(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.f35458c == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.f35458c.zzk(new ArrayList(Arrays.asList(uri)), nt0.m14830g3(this.f35456a), new vs3(this, updateClickUrlCallback));
        } catch (RemoteException e) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }

    /* renamed from: e */
    public final void m1936e(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.f35458c == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.f35458c.zzl(list, nt0.m14830g3(this.f35456a), new us3(this, updateImpressionUrlsCallback));
        } catch (RemoteException e) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }
}
