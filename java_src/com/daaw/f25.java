package com.daaw;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzchu;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class f25 implements r35 {
    public zzcs A;
    public final Context a;
    public final u35 b;
    public final JSONObject c;
    public final u85 d;
    public final j35 e;
    public final sl2 f;
    public final gr4 g;
    public final jq4 h;
    public final ty4 i;
    public final th6 j;
    public final zzchu k;
    public final ri6 l;
    public final ah4 m;
    public final p45 n;
    public final ag o;
    public final ny4 p;
    public final op6 q;
    public final to6 r;
    public boolean t;
    public boolean s = false;
    public boolean u = false;
    public boolean v = false;
    public Point w = new Point();
    public Point x = new Point();
    public long y = 0;
    public long z = 0;

    public f25(Context context, u35 u35Var, JSONObject jSONObject, u85 u85Var, j35 j35Var, sl2 sl2Var, gr4 gr4Var, jq4 jq4Var, ty4 ty4Var, th6 th6Var, zzchu zzchuVar, ri6 ri6Var, ah4 ah4Var, p45 p45Var, ag agVar, ny4 ny4Var, op6 op6Var, to6 to6Var) {
        this.a = context;
        this.b = u35Var;
        this.c = jSONObject;
        this.d = u85Var;
        this.e = j35Var;
        this.f = sl2Var;
        this.g = gr4Var;
        this.h = jq4Var;
        this.i = ty4Var;
        this.j = th6Var;
        this.k = zzchuVar;
        this.l = ri6Var;
        this.m = ah4Var;
        this.n = p45Var;
        this.o = agVar;
        this.p = ny4Var;
        this.q = op6Var;
        this.r = to6Var;
    }

    @Override // com.daaw.r35
    public final void a(View view, MotionEvent motionEvent, View view2) {
        this.w = zzbx.zza(motionEvent, view2);
        long a = this.o.a();
        this.z = a;
        if (motionEvent.getAction() == 0) {
            this.y = a;
            this.x = this.w;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.w;
        obtain.setLocation(point.x, point.y);
        this.f.d(obtain);
        obtain.recycle();
    }

    @Override // com.daaw.r35
    public final void b(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        String zzh;
        JSONObject zzd = zzbx.zzd(this.a, map, map2, view, scaleType);
        JSONObject zzg = zzbx.zzg(this.a, view);
        JSONObject zzf = zzbx.zzf(view);
        JSONObject zze = zzbx.zze(this.a, view);
        if (((Boolean) zzba.zzc().b(g93.Z2)).booleanValue()) {
            try {
                zzh = this.f.c().zzh(this.a, view, null);
            } catch (Exception unused) {
                k04.zzg("Exception getting data.");
            }
            t(zzg, zzd, zzf, zze, zzh, null, zzbx.zzh(this.a, this.j));
        }
        zzh = null;
        t(zzg, zzd, zzf, zze, zzh, null, zzbx.zzh(this.a, this.j));
    }

    @Override // com.daaw.r35
    public final void c(View view, Map map) {
        this.w = new Point();
        this.x = new Point();
        if (view != null) {
            this.p.D0(view);
        }
        this.t = false;
    }

    @Override // com.daaw.r35
    public final boolean d(Bundle bundle) {
        if (r("impression_reporting")) {
            return t(null, null, null, null, null, zzay.zzb().p(bundle, null), false);
        }
        k04.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.daaw.r35
    public final void e(View view) {
        if (!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            k04.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        p45 p45Var = this.n;
        if (view == null) {
            return;
        }
        view.setOnClickListener(p45Var);
        view.setClickable(true);
        p45Var.v = new WeakReference(view);
    }

    @Override // com.daaw.r35
    public final void f(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.w = new Point();
        this.x = new Point();
        if (!this.t) {
            this.p.C0(view);
            this.t = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.m.e(this);
        boolean zzi = zzbx.zzi(this.k.r);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    if (zzi) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) entry2.getValue()).get();
                if (view3 != null) {
                    if (zzi) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.daaw.r35
    public final void g(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        JSONObject zzd = zzbx.zzd(this.a, map, map2, view2, scaleType);
        JSONObject zzg = zzbx.zzg(this.a, view2);
        JSONObject zzf = zzbx.zzf(view2);
        JSONObject zze = zzbx.zze(this.a, view2);
        String q = q(view, map);
        x(true == ((Boolean) zzba.zzc().b(g93.b3)).booleanValue() ? view2 : view, zzg, zzd, zzf, zze, q, zzbx.zzc(q, this.a, this.x, this.w), null, z, false);
    }

    @Override // com.daaw.r35
    public final void h(Bundle bundle) {
        if (bundle == null) {
            k04.zze("Click data is null. No click is reported.");
        } else if (!r("click_reporting")) {
            k04.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            x(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, zzay.zzb().p(bundle, null), false, false);
        }
    }

    @Override // com.daaw.r35
    public final void i(Bundle bundle) {
        if (bundle == null) {
            k04.zze("Touch event data is null. No touch event is reported.");
        } else if (!r("touch_reporting")) {
            k04.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            float f = bundle.getFloat("x");
            float f2 = bundle.getFloat("y");
            this.f.c().zzl((int) f, (int) f2, bundle.getInt("duration_ms"));
        }
    }

    @Override // com.daaw.r35
    public final JSONObject j(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject zzd = zzbx.zzd(this.a, map, map2, view, scaleType);
        JSONObject zzg = zzbx.zzg(this.a, view);
        JSONObject zzf = zzbx.zzf(view);
        JSONObject zze = zzbx.zze(this.a, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", zzd);
            jSONObject.put("ad_view_signal", zzg);
            jSONObject.put("scroll_view_signal", zzf);
            jSONObject.put("lock_screen_signal", zze);
            return jSONObject;
        } catch (JSONException e) {
            k04.zzh("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // com.daaw.r35
    public final void k(zzcs zzcsVar) {
        this.A = zzcsVar;
    }

    @Override // com.daaw.r35
    public final void l(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        JSONObject jSONObject;
        boolean z2 = false;
        if (this.c.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) zzba.zzc().b(g93.w9)).booleanValue()) {
                z2 = true;
            }
        }
        if (!z2) {
            if (!this.v) {
                k04.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!s()) {
                k04.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject zzd = zzbx.zzd(this.a, map, map2, view2, scaleType);
        JSONObject zzg = zzbx.zzg(this.a, view2);
        JSONObject zzf = zzbx.zzf(view2);
        JSONObject zze = zzbx.zze(this.a, view2);
        String q = q(view, map);
        JSONObject zzc = zzbx.zzc(q, this.a, this.x, this.w);
        if (z2) {
            try {
                JSONObject jSONObject2 = this.c;
                Point point = this.x;
                Point point2 = this.w;
                try {
                    jSONObject = new JSONObject();
                } catch (Exception e) {
                    e = e;
                    jSONObject = null;
                }
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    if (point != null) {
                        jSONObject3.put("x", point.x);
                        jSONObject3.put("y", point.y);
                    }
                    if (point2 != null) {
                        jSONObject4.put("x", point2.x);
                        jSONObject4.put("y", point2.y);
                    }
                    jSONObject.put("start_point", jSONObject3);
                    jSONObject.put("end_point", jSONObject4);
                    jSONObject.put("duration_ms", i);
                } catch (Exception e2) {
                    e = e2;
                    k04.zzh("Error occurred while grabbing custom click gesture signals.", e);
                    jSONObject2.put("custom_click_gesture_signal", jSONObject);
                    x(view2, zzg, zzd, zzf, zze, q, zzc, null, z, true);
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e3) {
                k04.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                zzt.zzo().u(e3, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        x(view2, zzg, zzd, zzf, zze, q, zzc, null, z, true);
    }

    @Override // com.daaw.r35
    public final void m(ve3 ve3Var) {
        if (this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.n.c(ve3Var);
        } else {
            k04.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.daaw.r35
    public final void n(String str) {
        x(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.daaw.r35
    public final void o(zzcw zzcwVar) {
        try {
            if (this.u) {
                return;
            }
            if (zzcwVar == null) {
                j35 j35Var = this.e;
                if (j35Var.S() != null) {
                    this.u = true;
                    this.q.c(j35Var.S().zzf(), this.r);
                    zzg();
                    return;
                }
            }
            this.u = true;
            this.q.c(zzcwVar.zzf(), this.r);
            zzg();
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.daaw.r35
    public final JSONObject p(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject j = j(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.v && s()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (j != null) {
                jSONObject.put("nas", j);
            }
        } catch (JSONException e) {
            k04.zzh("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    public final String q(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int K = this.e.K();
        if (K != 1) {
            if (K != 2) {
                if (K != 6) {
                    return null;
                }
                return "3099";
            }
            return "2099";
        }
        return "1099";
    }

    public final boolean r(String str) {
        JSONObject optJSONObject = this.c.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    public final boolean s() {
        return this.c.optBoolean("allow_custom_click_gesture", false);
    }

    public final boolean t(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) {
        u85 u85Var;
        zg3 a25Var;
        String str2;
        ry0.e("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) zzba.zzc().b(g93.Z2)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.a;
            JSONObject jSONObject7 = new JSONObject();
            zzt.zzp();
            DisplayMetrics zzr = zzs.zzr((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put("width", zzay.zzb().g(context, zzr.widthPixels));
                jSONObject7.put("height", zzay.zzb().g(context, zzr.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) zzba.zzc().b(g93.E7)).booleanValue()) {
                u85Var = this.d;
                a25Var = new c25(this, null);
                str2 = "/clickRecorded";
            } else {
                u85Var = this.d;
                a25Var = new a25(this, null);
                str2 = "/logScionEvent";
            }
            u85Var.i(str2, a25Var);
            this.d.i("/nativeImpression", new e25(this, null));
            c14.a(this.d.d("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.s) {
                return true;
            }
            this.s = zzt.zzs().zzn(this.a, this.k.p, this.j.D.toString(), this.l.f);
            return true;
        } catch (JSONException e) {
            k04.zzh("Unable to create impression JSON.", e);
            return false;
        }
    }

    public final void x(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        String str2;
        ry0.e("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.b.c(this.e.g0()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.e.K());
            jSONObject8.put("view_aware_api_used", z);
            zzblz zzblzVar = this.l.i;
            jSONObject8.put("custom_mute_requested", zzblzVar != null && zzblzVar.v);
            jSONObject8.put("custom_mute_enabled", (this.e.f().isEmpty() || this.e.S() == null) ? false : true);
            if (this.n.a() != null && this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.o.a());
            if (this.v && s()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.b.c(this.e.g0()) != null);
            try {
                JSONObject optJSONObject = this.c.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.f.c().zze(this.a, optJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                k04.zzh("Exception obtaining click signals", e);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) zzba.zzc().b(g93.c4)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) zzba.zzc().b(g93.I7)).booleanValue() && vw0.k()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) zzba.zzc().b(g93.J7)).booleanValue() && vw0.k()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long a = this.o.a();
            jSONObject9.put("time_from_last_touch_down", a - this.y);
            jSONObject9.put("time_from_last_touch", a - this.z);
            jSONObject7.put("touch_signal", jSONObject9);
            c14.a(this.d.d("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            k04.zzh("Unable to create click JSON.", e2);
        }
    }

    @Override // com.daaw.r35
    public final boolean zzA() {
        if (zza() != 0) {
            if (((Boolean) zzba.zzc().b(g93.w9)).booleanValue()) {
                return this.l.i.y;
            }
            return true;
        }
        return true;
    }

    @Override // com.daaw.r35
    public final boolean zzB() {
        return s();
    }

    @Override // com.daaw.r35
    public final int zza() {
        if (this.l.i != null) {
            if (((Boolean) zzba.zzc().b(g93.w9)).booleanValue()) {
                return this.l.i.x;
            }
            return 0;
        }
        return 0;
    }

    @Override // com.daaw.r35
    public final void zzg() {
        try {
            zzcs zzcsVar = this.A;
            if (zzcsVar != null) {
                zzcsVar.zze();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.daaw.r35
    public final void zzh() {
        if (this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.n.b();
        }
    }

    @Override // com.daaw.r35
    public final void zzi() {
        this.d.f();
    }

    @Override // com.daaw.r35
    public final void zzp() {
        ry0.e("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.c);
            c14.a(this.d.d("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.daaw.r35
    public final void zzr() {
        t(null, null, null, null, null, null, false);
    }

    @Override // com.daaw.r35
    public final void zzv() {
        this.v = true;
    }
}
