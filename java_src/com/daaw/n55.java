package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class n55 implements r35 {

    /* renamed from: a */
    public final sn3 f19480a;

    /* renamed from: b */
    public final gr4 f19481b;

    /* renamed from: c */
    public final jq4 f19482c;

    /* renamed from: d */
    public final ty4 f19483d;

    /* renamed from: e */
    public final Context f19484e;

    /* renamed from: f */
    public final th6 f19485f;

    /* renamed from: g */
    public final zzchu f19486g;

    /* renamed from: h */
    public final ri6 f19487h;

    /* renamed from: i */
    public boolean f19488i = false;

    /* renamed from: j */
    public boolean f19489j = false;

    /* renamed from: k */
    public boolean f19490k = true;

    /* renamed from: l */
    public final on3 f19491l;

    /* renamed from: m */
    public final pn3 f19492m;

    public n55(on3 on3Var, pn3 pn3Var, sn3 sn3Var, gr4 gr4Var, jq4 jq4Var, ty4 ty4Var, Context context, th6 th6Var, zzchu zzchuVar, ri6 ri6Var, byte[] bArr) {
        this.f19491l = on3Var;
        this.f19492m = pn3Var;
        this.f19480a = sn3Var;
        this.f19481b = gr4Var;
        this.f19482c = jq4Var;
        this.f19483d = ty4Var;
        this.f19484e = context;
        this.f19485f = th6Var;
        this.f19486g = zzchuVar;
        this.f19487h = ri6Var;
    }

    /* renamed from: r */
    public static final HashMap m15514r(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry entry : map.entrySet()) {
                View view = (View) ((WeakReference) entry.getValue()).get();
                if (view != null) {
                    hashMap.put((String) entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    @Override // com.daaw.r35
    /* renamed from: a */
    public final void mo11804a(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.daaw.r35
    /* renamed from: b */
    public final void mo11803b(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.f19488i) {
                this.f19488i = zzt.zzs().zzn(this.f19484e, this.f19486g.f36993p, this.f19485f.f27657D.toString(), this.f19487h.f25346f);
            }
            if (this.f19490k) {
                sn3 sn3Var = this.f19480a;
                if (sn3Var != null && !sn3Var.zzB()) {
                    this.f19480a.zzx();
                    this.f19481b.zza();
                    return;
                }
                on3 on3Var = this.f19491l;
                if (on3Var != null && !on3Var.m14128r3()) {
                    this.f19491l.zzt();
                    this.f19481b.zza();
                    return;
                }
                pn3 pn3Var = this.f19492m;
                if (pn3Var == null || pn3Var.m13271r3()) {
                    return;
                }
                this.f19492m.zzr();
                this.f19481b.zza();
            }
        } catch (RemoteException e) {
            k04.zzk("Failed to call recordImpression", e);
        }
    }

    @Override // com.daaw.r35
    /* renamed from: c */
    public final void mo11802c(View view, Map map) {
        try {
            yd0 m14830g3 = nt0.m14830g3(view);
            sn3 sn3Var = this.f19480a;
            if (sn3Var != null) {
                sn3Var.mo10145n0(m14830g3);
                return;
            }
            on3 on3Var = this.f19491l;
            if (on3Var != null) {
                on3Var.m14127w2(m14830g3);
                return;
            }
            pn3 pn3Var = this.f19492m;
            if (pn3Var != null) {
                pn3Var.m13272q3(m14830g3);
            }
        } catch (RemoteException e) {
            k04.zzk("Failed to call untrackView", e);
        }
    }

    @Override // com.daaw.r35
    /* renamed from: d */
    public final boolean mo11801d(Bundle bundle) {
        return false;
    }

    @Override // com.daaw.r35
    /* renamed from: e */
    public final void mo11800e(View view) {
    }

    @Override // com.daaw.r35
    /* renamed from: f */
    public final void mo11799f(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        yd0 zzn;
        try {
            yd0 m14830g3 = nt0.m14830g3(view);
            JSONObject jSONObject = this.f19485f.f27703l0;
            boolean z = true;
            if (((Boolean) zzba.zzc().m23658b(g93.f10799q1)).booleanValue() && jSONObject.length() != 0) {
                Map hashMap = map == null ? new HashMap() : map;
                Map hashMap2 = map2 == null ? new HashMap() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) zzba.zzc().m23658b(g93.f10810r1)).booleanValue() && next.equals("3010")) {
                                sn3 sn3Var = this.f19480a;
                                Object obj2 = null;
                                if (sn3Var != null) {
                                    try {
                                        zzn = sn3Var.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    on3 on3Var = this.f19491l;
                                    if (on3Var != null) {
                                        zzn = on3Var.m14134l3();
                                    } else {
                                        pn3 pn3Var = this.f19492m;
                                        zzn = pn3Var != null ? pn3Var.m13278k3() : null;
                                    }
                                }
                                if (zzn != null) {
                                    obj2 = nt0.m14831M(zzn);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList<String> arrayList = new ArrayList();
                                zzbu.zzc(optJSONArray, arrayList);
                                zzt.zzp();
                                ClassLoader classLoader = this.f19484e.getClassLoader();
                                for (String str : arrayList) {
                                    if (Class.forName(str, false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.f19490k = z;
            HashMap m15514r = m15514r(map);
            HashMap m15514r2 = m15514r(map2);
            sn3 sn3Var2 = this.f19480a;
            if (sn3Var2 != null) {
                sn3Var2.mo10144n2(m14830g3, nt0.m14830g3(m15514r), nt0.m14830g3(m15514r2));
                return;
            }
            on3 on3Var2 = this.f19491l;
            if (on3Var2 != null) {
                on3Var2.m14130p3(m14830g3, nt0.m14830g3(m15514r), nt0.m14830g3(m15514r2));
                this.f19491l.m14131o3(m14830g3);
                return;
            }
            pn3 pn3Var2 = this.f19492m;
            if (pn3Var2 != null) {
                pn3Var2.m13273p3(m14830g3, nt0.m14830g3(m15514r), nt0.m14830g3(m15514r2));
                this.f19492m.m13274o3(m14830g3);
            }
        } catch (RemoteException e) {
            k04.zzk("Failed to call trackView", e);
        }
    }

    @Override // com.daaw.r35
    /* renamed from: g */
    public final void mo11798g(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.f19489j && this.f19485f.f27666M) {
            return;
        }
        m15515q(view);
    }

    @Override // com.daaw.r35
    /* renamed from: h */
    public final void mo11797h(Bundle bundle) {
    }

    @Override // com.daaw.r35
    /* renamed from: i */
    public final void mo11796i(Bundle bundle) {
    }

    @Override // com.daaw.r35
    /* renamed from: j */
    public final JSONObject mo11795j(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.daaw.r35
    /* renamed from: k */
    public final void mo11794k(zzcs zzcsVar) {
        k04.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.daaw.r35
    /* renamed from: l */
    public final void mo11793l(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        String str;
        if (!this.f19489j) {
            str = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.";
        } else if (this.f19485f.f27666M) {
            m15515q(view2);
            return;
        } else {
            str = "Custom click reporting for 3p ads failed. Ad unit id not in allow list.";
        }
        k04.zzj(str);
    }

    @Override // com.daaw.r35
    /* renamed from: m */
    public final void mo11792m(ve3 ve3Var) {
    }

    @Override // com.daaw.r35
    /* renamed from: n */
    public final void mo11791n(String str) {
    }

    @Override // com.daaw.r35
    /* renamed from: o */
    public final void mo11790o(zzcw zzcwVar) {
        k04.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.daaw.r35
    /* renamed from: p */
    public final JSONObject mo11789p(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    /* renamed from: q */
    public final void m15515q(View view) {
        try {
            sn3 sn3Var = this.f19480a;
            if (sn3Var != null && !sn3Var.zzA()) {
                this.f19480a.mo10143w2(nt0.m14830g3(view));
                this.f19482c.onAdClicked();
                if (((Boolean) zzba.zzc().m23658b(g93.f10590W8)).booleanValue()) {
                    this.f19483d.zzq();
                    return;
                }
                return;
            }
            on3 on3Var = this.f19491l;
            if (on3Var != null && !on3Var.m14129q3()) {
                this.f19491l.m14132n3(nt0.m14830g3(view));
                this.f19482c.onAdClicked();
                if (((Boolean) zzba.zzc().m23658b(g93.f10590W8)).booleanValue()) {
                    this.f19483d.zzq();
                    return;
                }
                return;
            }
            pn3 pn3Var = this.f19492m;
            if (pn3Var == null || pn3Var.zzv()) {
                return;
            }
            this.f19492m.m13275n3(nt0.m14830g3(view));
            this.f19482c.onAdClicked();
            if (((Boolean) zzba.zzc().m23658b(g93.f10590W8)).booleanValue()) {
                this.f19483d.zzq();
            }
        } catch (RemoteException e) {
            k04.zzk("Failed to call handleClick", e);
        }
    }

    @Override // com.daaw.r35
    public final boolean zzA() {
        return true;
    }

    @Override // com.daaw.r35
    public final boolean zzB() {
        return this.f19485f.f27666M;
    }

    @Override // com.daaw.r35
    public final int zza() {
        return 0;
    }

    @Override // com.daaw.r35
    public final void zzg() {
        throw null;
    }

    @Override // com.daaw.r35
    public final void zzh() {
    }

    @Override // com.daaw.r35
    public final void zzi() {
    }

    @Override // com.daaw.r35
    public final void zzp() {
    }

    @Override // com.daaw.r35
    public final void zzr() {
    }

    @Override // com.daaw.r35
    public final void zzv() {
        this.f19489j = true;
    }
}
