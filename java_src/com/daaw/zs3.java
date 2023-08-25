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
    public final View a;
    public final Map b;
    public final zy3 c;

    public zs3(ys3 ys3Var) {
        View view;
        Map map;
        View view2;
        view = ys3Var.a;
        this.a = view;
        map = ys3Var.b;
        this.b = map;
        view2 = ys3Var.a;
        zy3 a = ts3.a(view2.getContext());
        this.c = a;
        if (a == null || map.isEmpty()) {
            return;
        }
        try {
            a.zzf(new zzcao(nt0.g3(view).asBinder(), nt0.g3(map).asBinder()));
        } catch (RemoteException unused) {
            k04.zzg("Failed to call remote method.");
        }
    }

    public final void a(List list) {
        if (list == null || list.isEmpty()) {
            k04.zzj("No click urls were passed to recordClick");
            return;
        }
        if (this.c == null) {
            k04.zzj("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            this.c.zzg(list, nt0.g3(this.a), new xs3(this, list));
        } catch (RemoteException e) {
            k04.zzg("RemoteException recording click: ".concat(e.toString()));
        }
    }

    public final void b(List list) {
        if (list == null || list.isEmpty()) {
            k04.zzj("No impression urls were passed to recordImpression");
            return;
        }
        zy3 zy3Var = this.c;
        if (zy3Var == null) {
            k04.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        try {
            zy3Var.zzh(list, nt0.g3(this.a), new ws3(this, list));
        } catch (RemoteException e) {
            k04.zzg("RemoteException recording impression urls: ".concat(e.toString()));
        }
    }

    public final void c(MotionEvent motionEvent) {
        zy3 zy3Var = this.c;
        if (zy3Var == null) {
            k04.zze("Failed to get internal reporting info generator.");
            return;
        }
        try {
            zy3Var.zzj(nt0.g3(motionEvent));
        } catch (RemoteException unused) {
            k04.zzg("Failed to call remote method.");
        }
    }

    public final void d(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.c == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.c.zzk(new ArrayList(Arrays.asList(uri)), nt0.g3(this.a), new vs3(this, updateClickUrlCallback));
        } catch (RemoteException e) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }

    public final void e(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.c == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.c.zzl(list, nt0.g3(this.a), new us3(this, updateImpressionUrlsCallback));
        } catch (RemoteException e) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }
}
