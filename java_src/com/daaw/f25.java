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

    /* renamed from: A */
    public zzcs f9020A;

    /* renamed from: a */
    public final Context f9021a;

    /* renamed from: b */
    public final u35 f9022b;

    /* renamed from: c */
    public final JSONObject f9023c;

    /* renamed from: d */
    public final u85 f9024d;

    /* renamed from: e */
    public final j35 f9025e;

    /* renamed from: f */
    public final sl2 f9026f;

    /* renamed from: g */
    public final gr4 f9027g;

    /* renamed from: h */
    public final jq4 f9028h;

    /* renamed from: i */
    public final ty4 f9029i;

    /* renamed from: j */
    public final th6 f9030j;

    /* renamed from: k */
    public final zzchu f9031k;

    /* renamed from: l */
    public final ri6 f9032l;

    /* renamed from: m */
    public final ah4 f9033m;

    /* renamed from: n */
    public final p45 f9034n;

    /* renamed from: o */
    public final InterfaceC0623ag f9035o;

    /* renamed from: p */
    public final ny4 f9036p;

    /* renamed from: q */
    public final op6 f9037q;

    /* renamed from: r */
    public final to6 f9038r;

    /* renamed from: t */
    public boolean f9040t;

    /* renamed from: s */
    public boolean f9039s = false;

    /* renamed from: u */
    public boolean f9041u = false;

    /* renamed from: v */
    public boolean f9042v = false;

    /* renamed from: w */
    public Point f9043w = new Point();

    /* renamed from: x */
    public Point f9044x = new Point();

    /* renamed from: y */
    public long f9045y = 0;

    /* renamed from: z */
    public long f9046z = 0;

    public f25(Context context, u35 u35Var, JSONObject jSONObject, u85 u85Var, j35 j35Var, sl2 sl2Var, gr4 gr4Var, jq4 jq4Var, ty4 ty4Var, th6 th6Var, zzchu zzchuVar, ri6 ri6Var, ah4 ah4Var, p45 p45Var, InterfaceC0623ag interfaceC0623ag, ny4 ny4Var, op6 op6Var, to6 to6Var) {
        this.f9021a = context;
        this.f9022b = u35Var;
        this.f9023c = jSONObject;
        this.f9024d = u85Var;
        this.f9025e = j35Var;
        this.f9026f = sl2Var;
        this.f9027g = gr4Var;
        this.f9028h = jq4Var;
        this.f9029i = ty4Var;
        this.f9030j = th6Var;
        this.f9031k = zzchuVar;
        this.f9032l = ri6Var;
        this.f9033m = ah4Var;
        this.f9034n = p45Var;
        this.f9035o = interfaceC0623ag;
        this.f9036p = ny4Var;
        this.f9037q = op6Var;
        this.f9038r = to6Var;
    }

    @Override // com.daaw.r35
    /* renamed from: a */
    public final void mo11804a(View view, MotionEvent motionEvent, View view2) {
        this.f9043w = zzbx.zza(motionEvent, view2);
        long mo15860a = this.f9035o.mo15860a();
        this.f9046z = mo15860a;
        if (motionEvent.getAction() == 0) {
            this.f9045y = mo15860a;
            this.f9044x = this.f9043w;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.f9043w;
        obtain.setLocation(point.x, point.y);
        this.f9026f.m10201d(obtain);
        obtain.recycle();
    }

    @Override // com.daaw.r35
    /* renamed from: b */
    public final void mo11803b(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        String zzh;
        JSONObject zzd = zzbx.zzd(this.f9021a, map, map2, view, scaleType);
        JSONObject zzg = zzbx.zzg(this.f9021a, view);
        JSONObject zzf = zzbx.zzf(view);
        JSONObject zze = zzbx.zze(this.f9021a, view);
        if (((Boolean) zzba.zzc().m23658b(g93.f10614Z2)).booleanValue()) {
            try {
                zzh = this.f9026f.m10202c().zzh(this.f9021a, view, null);
            } catch (Exception unused) {
                k04.zzg("Exception getting data.");
            }
            m22957t(zzg, zzd, zzf, zze, zzh, null, zzbx.zzh(this.f9021a, this.f9030j));
        }
        zzh = null;
        m22957t(zzg, zzd, zzf, zze, zzh, null, zzbx.zzh(this.f9021a, this.f9030j));
    }

    @Override // com.daaw.r35
    /* renamed from: c */
    public final void mo11802c(View view, Map map) {
        this.f9043w = new Point();
        this.f9044x = new Point();
        if (view != null) {
            this.f9036p.m14719D0(view);
        }
        this.f9040t = false;
    }

    @Override // com.daaw.r35
    /* renamed from: d */
    public final boolean mo11801d(Bundle bundle) {
        if (m22959r("impression_reporting")) {
            return m22957t(null, null, null, null, null, zzay.zzb().m24816p(bundle, null), false);
        }
        k04.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.daaw.r35
    /* renamed from: e */
    public final void mo11800e(View view) {
        if (!this.f9023c.optBoolean("custom_one_point_five_click_enabled", false)) {
            k04.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        p45 p45Var = this.f9034n;
        if (view == null) {
            return;
        }
        view.setOnClickListener(p45Var);
        view.setClickable(true);
        p45Var.f22611v = new WeakReference(view);
    }

    @Override // com.daaw.r35
    /* renamed from: f */
    public final void mo11799f(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f9043w = new Point();
        this.f9044x = new Point();
        if (!this.f9040t) {
            this.f9036p.m14720C0(view);
            this.f9040t = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.f9033m.m27478e(this);
        boolean zzi = zzbx.zzi(this.f9031k.f36995r);
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
    /* renamed from: g */
    public final void mo11798g(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        JSONObject zzd = zzbx.zzd(this.f9021a, map, map2, view2, scaleType);
        JSONObject zzg = zzbx.zzg(this.f9021a, view2);
        JSONObject zzf = zzbx.zzf(view2);
        JSONObject zze = zzbx.zze(this.f9021a, view2);
        String m22960q = m22960q(view, map);
        m22953x(true == ((Boolean) zzba.zzc().m23658b(g93.f10636b3)).booleanValue() ? view2 : view, zzg, zzd, zzf, zze, m22960q, zzbx.zzc(m22960q, this.f9021a, this.f9044x, this.f9043w), null, z, false);
    }

    @Override // com.daaw.r35
    /* renamed from: h */
    public final void mo11797h(Bundle bundle) {
        if (bundle == null) {
            k04.zze("Click data is null. No click is reported.");
        } else if (!m22959r("click_reporting")) {
            k04.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            m22953x(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, zzay.zzb().m24816p(bundle, null), false, false);
        }
    }

    @Override // com.daaw.r35
    /* renamed from: i */
    public final void mo11796i(Bundle bundle) {
        if (bundle == null) {
            k04.zze("Touch event data is null. No touch event is reported.");
        } else if (!m22959r("touch_reporting")) {
            k04.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            float f = bundle.getFloat("x");
            float f2 = bundle.getFloat("y");
            this.f9026f.m10202c().zzl((int) f, (int) f2, bundle.getInt("duration_ms"));
        }
    }

    @Override // com.daaw.r35
    /* renamed from: j */
    public final JSONObject mo11795j(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject zzd = zzbx.zzd(this.f9021a, map, map2, view, scaleType);
        JSONObject zzg = zzbx.zzg(this.f9021a, view);
        JSONObject zzf = zzbx.zzf(view);
        JSONObject zze = zzbx.zze(this.f9021a, view);
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
    /* renamed from: k */
    public final void mo11794k(zzcs zzcsVar) {
        this.f9020A = zzcsVar;
    }

    @Override // com.daaw.r35
    /* renamed from: l */
    public final void mo11793l(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        JSONObject jSONObject;
        boolean z2 = false;
        if (this.f9023c.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10873w9)).booleanValue()) {
                z2 = true;
            }
        }
        if (!z2) {
            if (!this.f9042v) {
                k04.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!m22958s()) {
                k04.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject zzd = zzbx.zzd(this.f9021a, map, map2, view2, scaleType);
        JSONObject zzg = zzbx.zzg(this.f9021a, view2);
        JSONObject zzf = zzbx.zzf(view2);
        JSONObject zze = zzbx.zze(this.f9021a, view2);
        String m22960q = m22960q(view, map);
        JSONObject zzc = zzbx.zzc(m22960q, this.f9021a, this.f9044x, this.f9043w);
        if (z2) {
            try {
                JSONObject jSONObject2 = this.f9023c;
                Point point = this.f9044x;
                Point point2 = this.f9043w;
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
                    m22953x(view2, zzg, zzd, zzf, zze, m22960q, zzc, null, z, true);
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e3) {
                k04.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                zzt.zzo().m11902u(e3, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        m22953x(view2, zzg, zzd, zzf, zze, m22960q, zzc, null, z, true);
    }

    @Override // com.daaw.r35
    /* renamed from: m */
    public final void mo11792m(ve3 ve3Var) {
        if (this.f9023c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f9034n.m13635c(ve3Var);
        } else {
            k04.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.daaw.r35
    /* renamed from: n */
    public final void mo11791n(String str) {
        m22953x(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.daaw.r35
    /* renamed from: o */
    public final void mo11790o(zzcw zzcwVar) {
        try {
            if (this.f9041u) {
                return;
            }
            if (zzcwVar == null) {
                j35 j35Var = this.f9025e;
                if (j35Var.m19137S() != null) {
                    this.f9041u = true;
                    this.f9037q.m14098c(j35Var.m19137S().zzf(), this.f9038r);
                    zzg();
                    return;
                }
            }
            this.f9041u = true;
            this.f9037q.m14098c(zzcwVar.zzf(), this.f9038r);
            zzg();
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.daaw.r35
    /* renamed from: p */
    public final JSONObject mo11789p(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject mo11795j = mo11795j(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f9042v && m22958s()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (mo11795j != null) {
                jSONObject.put("nas", mo11795j);
            }
        } catch (JSONException e) {
            k04.zzh("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    /* renamed from: q */
    public final String m22960q(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int m19145K = this.f9025e.m19145K();
        if (m19145K != 1) {
            if (m19145K != 2) {
                if (m19145K != 6) {
                    return null;
                }
                return "3099";
            }
            return "2099";
        }
        return "1099";
    }

    /* renamed from: r */
    public final boolean m22959r(String str) {
        JSONObject optJSONObject = this.f9023c.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    /* renamed from: s */
    public final boolean m22958s() {
        return this.f9023c.optBoolean("allow_custom_click_gesture", false);
    }

    /* renamed from: t */
    public final boolean m22957t(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) {
        u85 u85Var;
        zg3 a25Var;
        String str2;
        ry0.m10835e("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f9023c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) zzba.zzc().m23658b(g93.f10614Z2)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.f9021a;
            JSONObject jSONObject7 = new JSONObject();
            zzt.zzp();
            DisplayMetrics zzr = zzs.zzr((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put("width", zzay.zzb().m24825g(context, zzr.widthPixels));
                jSONObject7.put("height", zzay.zzb().m24825g(context, zzr.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) zzba.zzc().m23658b(g93.f10409E7)).booleanValue()) {
                u85Var = this.f9024d;
                a25Var = new c25(this, null);
                str2 = "/clickRecorded";
            } else {
                u85Var = this.f9024d;
                a25Var = new a25(this, null);
                str2 = "/logScionEvent";
            }
            u85Var.m8425i(str2, a25Var);
            this.f9024d.m8425i("/nativeImpression", new e25(this, null));
            c14.m25685a(this.f9024d.m8430d("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f9039s) {
                return true;
            }
            this.f9039s = zzt.zzs().zzn(this.f9021a, this.f9031k.f36993p, this.f9030j.f27657D.toString(), this.f9032l.f25346f);
            return true;
        } catch (JSONException e) {
            k04.zzh("Unable to create impression JSON.", e);
            return false;
        }
    }

    /* renamed from: x */
    public final void m22953x(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        String str2;
        ry0.m10835e("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f9023c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.f9022b.m8600c(this.f9025e.m19116g0()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f9025e.m19145K());
            jSONObject8.put("view_aware_api_used", z);
            zzblz zzblzVar = this.f9032l.f25349i;
            jSONObject8.put("custom_mute_requested", zzblzVar != null && zzblzVar.f36849v);
            jSONObject8.put("custom_mute_enabled", (this.f9025e.m19119f().isEmpty() || this.f9025e.m19137S() == null) ? false : true);
            if (this.f9034n.m13637a() != null && this.f9023c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f9035o.mo15860a());
            if (this.f9042v && m22958s()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.f9022b.m8600c(this.f9025e.m19116g0()) != null);
            try {
                JSONObject optJSONObject = this.f9023c.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.f9026f.m10202c().zze(this.f9021a, optJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                k04.zzh("Exception obtaining click signals", e);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) zzba.zzc().m23658b(g93.f10648c4)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) zzba.zzc().m23658b(g93.f10449I7)).booleanValue() && vw0.m6694k()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) zzba.zzc().m23658b(g93.f10459J7)).booleanValue() && vw0.m6694k()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long mo15860a = this.f9035o.mo15860a();
            jSONObject9.put("time_from_last_touch_down", mo15860a - this.f9045y);
            jSONObject9.put("time_from_last_touch", mo15860a - this.f9046z);
            jSONObject7.put("touch_signal", jSONObject9);
            c14.m25685a(this.f9024d.m8430d("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            k04.zzh("Unable to create click JSON.", e2);
        }
    }

    @Override // com.daaw.r35
    public final boolean zzA() {
        if (zza() != 0) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10873w9)).booleanValue()) {
                return this.f9032l.f25349i.f36852y;
            }
            return true;
        }
        return true;
    }

    @Override // com.daaw.r35
    public final boolean zzB() {
        return m22958s();
    }

    @Override // com.daaw.r35
    public final int zza() {
        if (this.f9032l.f25349i != null) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10873w9)).booleanValue()) {
                return this.f9032l.f25349i.f36851x;
            }
            return 0;
        }
        return 0;
    }

    @Override // com.daaw.r35
    public final void zzg() {
        try {
            zzcs zzcsVar = this.f9020A;
            if (zzcsVar != null) {
                zzcsVar.zze();
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.daaw.r35
    public final void zzh() {
        if (this.f9023c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f9034n.m13636b();
        }
    }

    @Override // com.daaw.r35
    public final void zzi() {
        this.f9024d.m8428f();
    }

    @Override // com.daaw.r35
    public final void zzp() {
        ry0.m10835e("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f9023c);
            c14.m25685a(this.f9024d.m8430d("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.daaw.r35
    public final void zzr() {
        m22957t(null, null, null, null, null, null, false);
    }

    @Override // com.daaw.r35
    public final void zzv() {
        this.f9042v = true;
    }
}
