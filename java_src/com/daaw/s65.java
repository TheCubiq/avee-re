package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzel;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzchu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class s65 {
    public final Context a;
    public final y55 b;
    public final sl2 c;
    public final zzchu d;
    public final zza e;
    public final x33 f;
    public final Executor g;
    public final zzblz h;
    public final k75 i;
    public final ia5 j;
    public final ScheduledExecutorService k;
    public final a95 l;
    public final kd5 m;
    public final on6 n;
    public final op6 o;
    public final cq5 p;

    public s65(Context context, y55 y55Var, sl2 sl2Var, zzchu zzchuVar, zza zzaVar, x33 x33Var, Executor executor, ri6 ri6Var, k75 k75Var, ia5 ia5Var, ScheduledExecutorService scheduledExecutorService, kd5 kd5Var, on6 on6Var, op6 op6Var, cq5 cq5Var, a95 a95Var) {
        this.a = context;
        this.b = y55Var;
        this.c = sl2Var;
        this.d = zzchuVar;
        this.e = zzaVar;
        this.f = x33Var;
        this.g = executor;
        this.h = ri6Var.i;
        this.i = k75Var;
        this.j = ia5Var;
        this.k = scheduledExecutorService;
        this.m = kd5Var;
        this.n = on6Var;
        this.o = op6Var;
        this.p = cq5Var;
        this.l = a95Var;
    }

    public static final zzel i(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return r(optJSONObject);
    }

    public static final List j(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return y17.u();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return y17.u();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            zzel r = r(optJSONArray.optJSONObject(i));
            if (r != null) {
                arrayList.add(r);
            }
        }
        return y17.s(arrayList);
    }

    public static f77 l(f77 f77Var, Object obj) {
        return s67.g(f77Var, Exception.class, new w57(null) { // from class: com.daaw.p65
            @Override // com.daaw.w57
            public final f77 zza(Object obj2) {
                zze.zzb("Error during loading assets.", (Exception) obj2);
                return s67.i(null);
            }
        }, z04.f);
    }

    public static f77 m(boolean z, final f77 f77Var, Object obj) {
        return z ? s67.n(f77Var, new w57() { // from class: com.daaw.n65
            @Override // com.daaw.w57
            public final f77 zza(Object obj2) {
                return obj2 != null ? f77.this : s67.h(new yu5(1, "Retrieve required value in native ad response failed."));
            }
        }, z04.f) : l(f77Var, null);
    }

    public static Integer q(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final zzel r(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzel(optString, optString2);
    }

    public final /* synthetic */ ac3 a(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer q = q(jSONObject, "bg_color");
        Integer q2 = q(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new ac3(optString, list, q, q2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.h.t, optBoolean);
    }

    public final /* synthetic */ f77 b(zzq zzqVar, th6 th6Var, wh6 wh6Var, String str, String str2, Object obj) {
        a74 a = this.j.a(zzqVar, th6Var, wh6Var);
        final d14 e = d14.e(a);
        x85 b = this.l.b();
        a.zzP().J(b, b, b, b, b, false, null, new zzb(this.a, null, null), null, null, this.p, this.o, this.m, this.n, null, b, null, null);
        if (((Boolean) zzba.zzc().b(g93.k3)).booleanValue()) {
            a.y("/getNativeAdViewSignals", yg3.s);
        }
        a.y("/getNativeClickMeta", yg3.t);
        a.zzP().E(new o84() { // from class: com.daaw.m65
            @Override // com.daaw.o84
            public final void zza(boolean z) {
                d14 d14Var = d14.this;
                if (z) {
                    d14Var.g();
                } else {
                    d14Var.c(new yu5(1, "Image Web View failed to load."));
                }
            }
        });
        a.b0(str, str2, null);
        return e;
    }

    public final /* synthetic */ f77 c(String str, Object obj) {
        zzt.zzz();
        a74 a = p74.a(this.a, v84.a(), "native-omid", false, false, this.c, null, this.d, null, null, this.e, this.f, null, null);
        final d14 e = d14.e(a);
        a.zzP().E(new o84() { // from class: com.daaw.f65
            @Override // com.daaw.o84
            public final void zza(boolean z) {
                d14.this.g();
            }
        });
        if (((Boolean) zzba.zzc().b(g93.B4)).booleanValue()) {
            a.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            a.loadData(str, "text/html", "UTF-8");
        }
        return e;
    }

    public final f77 d(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return s67.i(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return m(optJSONObject.optBoolean("require"), s67.m(o(optJSONArray, false, true), new ey6() { // from class: com.daaw.g65
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                return s65.this.a(optJSONObject, (List) obj);
            }
        }, this.g), null);
    }

    public final f77 e(JSONObject jSONObject, String str) {
        return n(jSONObject.optJSONObject(str), this.h.q);
    }

    public final f77 f(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        zzblz zzblzVar = this.h;
        return o(optJSONArray, zzblzVar.q, zzblzVar.s);
    }

    public final f77 g(JSONObject jSONObject, String str, final th6 th6Var, final wh6 wh6Var) {
        if (((Boolean) zzba.zzc().b(g93.K8)).booleanValue()) {
            JSONArray optJSONArray = jSONObject.optJSONArray("images");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return s67.i(null);
            }
            JSONObject optJSONObject = optJSONArray.optJSONObject(0);
            if (optJSONObject == null) {
                return s67.i(null);
            }
            final String optString = optJSONObject.optString("base_url");
            final String optString2 = optJSONObject.optString("html");
            final zzq k = k(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
            if (TextUtils.isEmpty(optString2)) {
                return s67.i(null);
            }
            final f77 n = s67.n(s67.i(null), new w57() { // from class: com.daaw.h65
                @Override // com.daaw.w57
                public final f77 zza(Object obj) {
                    return s65.this.b(k, th6Var, wh6Var, optString, optString2, obj);
                }
            }, z04.e);
            return s67.n(n, new w57() { // from class: com.daaw.l65
                @Override // com.daaw.w57
                public final f77 zza(Object obj) {
                    f77 f77Var = f77.this;
                    if (((a74) obj) != null) {
                        return f77Var;
                    }
                    throw new yu5(1, "Retrieve Web View from image ad response failed.");
                }
            }, z04.f);
        }
        return s67.i(null);
    }

    public final f77 h(JSONObject jSONObject, th6 th6Var, wh6 wh6Var) {
        f77 a;
        JSONObject zzg = zzbu.zzg(jSONObject, "html_containers", "instream");
        if (zzg == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("vast_xml");
                boolean z = false;
                if (((Boolean) zzba.zzc().b(g93.J8)).booleanValue() && optJSONObject.has("html")) {
                    z = true;
                }
                if (TextUtils.isEmpty(optString)) {
                    if (!z) {
                        k04.zzj("Required field 'vast_xml' or 'html' is missing");
                    }
                } else if (!z) {
                    a = this.i.a(optJSONObject);
                    return l(s67.o(a, ((Integer) zzba.zzc().b(g93.l3)).intValue(), TimeUnit.SECONDS, this.k), null);
                }
                a = p(optJSONObject, th6Var, wh6Var);
                return l(s67.o(a, ((Integer) zzba.zzc().b(g93.l3)).intValue(), TimeUnit.SECONDS, this.k), null);
            }
            return s67.i(null);
        }
        return p(zzg, th6Var, wh6Var);
    }

    public final zzq k(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return zzq.zzc();
            }
            i = 0;
        }
        return new zzq(this.a, new AdSize(i, i2));
    }

    public final f77 n(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return s67.i(null);
        }
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return s67.i(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return s67.i(new dc3(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return m(jSONObject.optBoolean("require"), s67.m(this.b.b(optString, optDouble, optBoolean), new ey6() { // from class: com.daaw.q65
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                String str = optString;
                return new dc3(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), optDouble, optInt, optInt2);
            }
        }, this.g), null);
    }

    public final f77 o(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return s67.i(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(n(jSONArray.optJSONObject(i), z));
        }
        return s67.m(s67.e(arrayList), new ey6() { // from class: com.daaw.o65
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (dc3 dc3Var : (List) obj) {
                    if (dc3Var != null) {
                        arrayList2.add(dc3Var);
                    }
                }
                return arrayList2;
            }
        }, this.g);
    }

    public final f77 p(JSONObject jSONObject, th6 th6Var, wh6 wh6Var) {
        final f77 b = this.i.b(jSONObject.optString("base_url"), jSONObject.optString("html"), th6Var, wh6Var, k(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return s67.n(b, new w57() { // from class: com.daaw.r65
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                f77 f77Var = f77.this;
                a74 a74Var = (a74) obj;
                if (a74Var == null || a74Var.zzs() == null) {
                    throw new yu5(1, "Retrieve video view in html5 ad response failed.");
                }
                return f77Var;
            }
        }, z04.f);
    }
}
