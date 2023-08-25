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
    public final sn3 a;
    public final gr4 b;
    public final jq4 c;
    public final ty4 d;
    public final Context e;
    public final th6 f;
    public final zzchu g;
    public final ri6 h;
    public boolean i = false;
    public boolean j = false;
    public boolean k = true;
    public final on3 l;
    public final pn3 m;

    public n55(on3 on3Var, pn3 pn3Var, sn3 sn3Var, gr4 gr4Var, jq4 jq4Var, ty4 ty4Var, Context context, th6 th6Var, zzchu zzchuVar, ri6 ri6Var, byte[] bArr) {
        this.l = on3Var;
        this.m = pn3Var;
        this.a = sn3Var;
        this.b = gr4Var;
        this.c = jq4Var;
        this.d = ty4Var;
        this.e = context;
        this.f = th6Var;
        this.g = zzchuVar;
        this.h = ri6Var;
    }

    public static final HashMap r(Map map) {
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
    public final void a(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.daaw.r35
    public final void b(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.i) {
                this.i = zzt.zzs().zzn(this.e, this.g.p, this.f.D.toString(), this.h.f);
            }
            if (this.k) {
                sn3 sn3Var = this.a;
                if (sn3Var != null && !sn3Var.zzB()) {
                    this.a.zzx();
                    this.b.zza();
                    return;
                }
                on3 on3Var = this.l;
                if (on3Var != null && !on3Var.r3()) {
                    this.l.zzt();
                    this.b.zza();
                    return;
                }
                pn3 pn3Var = this.m;
                if (pn3Var == null || pn3Var.r3()) {
                    return;
                }
                this.m.zzr();
                this.b.zza();
            }
        } catch (RemoteException e) {
            k04.zzk("Failed to call recordImpression", e);
        }
    }

    @Override // com.daaw.r35
    public final void c(View view, Map map) {
        try {
            yd0 g3 = nt0.g3(view);
            sn3 sn3Var = this.a;
            if (sn3Var != null) {
                sn3Var.n0(g3);
                return;
            }
            on3 on3Var = this.l;
            if (on3Var != null) {
                on3Var.w2(g3);
                return;
            }
            pn3 pn3Var = this.m;
            if (pn3Var != null) {
                pn3Var.q3(g3);
            }
        } catch (RemoteException e) {
            k04.zzk("Failed to call untrackView", e);
        }
    }

    @Override // com.daaw.r35
    public final boolean d(Bundle bundle) {
        return false;
    }

    @Override // com.daaw.r35
    public final void e(View view) {
    }

    @Override // com.daaw.r35
    public final void f(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        yd0 zzn;
        try {
            yd0 g3 = nt0.g3(view);
            JSONObject jSONObject = this.f.l0;
            boolean z = true;
            if (((Boolean) zzba.zzc().b(g93.q1)).booleanValue() && jSONObject.length() != 0) {
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
                            if (((Boolean) zzba.zzc().b(g93.r1)).booleanValue() && next.equals("3010")) {
                                sn3 sn3Var = this.a;
                                Object obj2 = null;
                                if (sn3Var != null) {
                                    try {
                                        zzn = sn3Var.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    on3 on3Var = this.l;
                                    if (on3Var != null) {
                                        zzn = on3Var.l3();
                                    } else {
                                        pn3 pn3Var = this.m;
                                        zzn = pn3Var != null ? pn3Var.k3() : null;
                                    }
                                }
                                if (zzn != null) {
                                    obj2 = nt0.M(zzn);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList<String> arrayList = new ArrayList();
                                zzbu.zzc(optJSONArray, arrayList);
                                zzt.zzp();
                                ClassLoader classLoader = this.e.getClassLoader();
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
            this.k = z;
            HashMap r = r(map);
            HashMap r2 = r(map2);
            sn3 sn3Var2 = this.a;
            if (sn3Var2 != null) {
                sn3Var2.n2(g3, nt0.g3(r), nt0.g3(r2));
                return;
            }
            on3 on3Var2 = this.l;
            if (on3Var2 != null) {
                on3Var2.p3(g3, nt0.g3(r), nt0.g3(r2));
                this.l.o3(g3);
                return;
            }
            pn3 pn3Var2 = this.m;
            if (pn3Var2 != null) {
                pn3Var2.p3(g3, nt0.g3(r), nt0.g3(r2));
                this.m.o3(g3);
            }
        } catch (RemoteException e) {
            k04.zzk("Failed to call trackView", e);
        }
    }

    @Override // com.daaw.r35
    public final void g(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (this.j && this.f.M) {
            return;
        }
        q(view);
    }

    @Override // com.daaw.r35
    public final void h(Bundle bundle) {
    }

    @Override // com.daaw.r35
    public final void i(Bundle bundle) {
    }

    @Override // com.daaw.r35
    public final JSONObject j(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.daaw.r35
    public final void k(zzcs zzcsVar) {
        k04.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.daaw.r35
    public final void l(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        String str;
        if (!this.j) {
            str = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.";
        } else if (this.f.M) {
            q(view2);
            return;
        } else {
            str = "Custom click reporting for 3p ads failed. Ad unit id not in allow list.";
        }
        k04.zzj(str);
    }

    @Override // com.daaw.r35
    public final void m(ve3 ve3Var) {
    }

    @Override // com.daaw.r35
    public final void n(String str) {
    }

    @Override // com.daaw.r35
    public final void o(zzcw zzcwVar) {
        k04.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.daaw.r35
    public final JSONObject p(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    public final void q(View view) {
        try {
            sn3 sn3Var = this.a;
            if (sn3Var != null && !sn3Var.zzA()) {
                this.a.w2(nt0.g3(view));
                this.c.onAdClicked();
                if (((Boolean) zzba.zzc().b(g93.W8)).booleanValue()) {
                    this.d.zzq();
                    return;
                }
                return;
            }
            on3 on3Var = this.l;
            if (on3Var != null && !on3Var.q3()) {
                this.l.n3(nt0.g3(view));
                this.c.onAdClicked();
                if (((Boolean) zzba.zzc().b(g93.W8)).booleanValue()) {
                    this.d.zzq();
                    return;
                }
                return;
            }
            pn3 pn3Var = this.m;
            if (pn3Var == null || pn3Var.zzv()) {
                return;
            }
            this.m.n3(nt0.g3(view));
            this.c.onAdClicked();
            if (((Boolean) zzba.zzc().b(g93.W8)).booleanValue()) {
                this.d.zzq();
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
        return this.f.M;
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
        this.j = true;
    }
}
