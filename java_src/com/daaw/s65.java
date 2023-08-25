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

    /* renamed from: a */
    public final Context f25916a;

    /* renamed from: b */
    public final y55 f25917b;

    /* renamed from: c */
    public final sl2 f25918c;

    /* renamed from: d */
    public final zzchu f25919d;

    /* renamed from: e */
    public final zza f25920e;

    /* renamed from: f */
    public final x33 f25921f;

    /* renamed from: g */
    public final Executor f25922g;

    /* renamed from: h */
    public final zzblz f25923h;

    /* renamed from: i */
    public final k75 f25924i;

    /* renamed from: j */
    public final ia5 f25925j;

    /* renamed from: k */
    public final ScheduledExecutorService f25926k;

    /* renamed from: l */
    public final a95 f25927l;

    /* renamed from: m */
    public final kd5 f25928m;

    /* renamed from: n */
    public final on6 f25929n;

    /* renamed from: o */
    public final op6 f25930o;

    /* renamed from: p */
    public final cq5 f25931p;

    public s65(Context context, y55 y55Var, sl2 sl2Var, zzchu zzchuVar, zza zzaVar, x33 x33Var, Executor executor, ri6 ri6Var, k75 k75Var, ia5 ia5Var, ScheduledExecutorService scheduledExecutorService, kd5 kd5Var, on6 on6Var, op6 op6Var, cq5 cq5Var, a95 a95Var) {
        this.f25916a = context;
        this.f25917b = y55Var;
        this.f25918c = sl2Var;
        this.f25919d = zzchuVar;
        this.f25920e = zzaVar;
        this.f25921f = x33Var;
        this.f25922g = executor;
        this.f25923h = ri6Var.f25349i;
        this.f25924i = k75Var;
        this.f25925j = ia5Var;
        this.f25926k = scheduledExecutorService;
        this.f25928m = kd5Var;
        this.f25929n = on6Var;
        this.f25930o = op6Var;
        this.f25931p = cq5Var;
        this.f25927l = a95Var;
    }

    /* renamed from: i */
    public static final zzel m10652i(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return m10643r(optJSONObject);
    }

    /* renamed from: j */
    public static final List m10651j(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return y17.m4260u();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return y17.m4260u();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            zzel m10643r = m10643r(optJSONArray.optJSONObject(i));
            if (m10643r != null) {
                arrayList.add(m10643r);
            }
        }
        return y17.m4262s(arrayList);
    }

    /* renamed from: l */
    public static f77 m10649l(f77 f77Var, Object obj) {
        return s67.m10636g(f77Var, Exception.class, new w57(null) { // from class: com.daaw.p65
            @Override // com.daaw.w57
            public final f77 zza(Object obj2) {
                zze.zzb("Error during loading assets.", (Exception) obj2);
                return s67.m10634i(null);
            }
        }, z04.f34310f);
    }

    /* renamed from: m */
    public static f77 m10648m(boolean z, final f77 f77Var, Object obj) {
        return z ? s67.m10629n(f77Var, new w57() { // from class: com.daaw.n65
            @Override // com.daaw.w57
            public final f77 zza(Object obj2) {
                return obj2 != null ? f77.this : s67.m10635h(new yu5(1, "Retrieve required value in native ad response failed."));
            }
        }, z04.f34310f) : m10649l(f77Var, null);
    }

    /* renamed from: q */
    public static Integer m10644q(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: r */
    public static final zzel m10643r(JSONObject jSONObject) {
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

    /* renamed from: a */
    public final /* synthetic */ ac3 m10660a(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer m10644q = m10644q(jSONObject, "bg_color");
        Integer m10644q2 = m10644q(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new ac3(optString, list, m10644q, m10644q2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.f25923h.f36847t, optBoolean);
    }

    /* renamed from: b */
    public final /* synthetic */ f77 m10659b(zzq zzqVar, th6 th6Var, wh6 wh6Var, String str, String str2, Object obj) {
        a74 m20001a = this.f25925j.m20001a(zzqVar, th6Var, wh6Var);
        final d14 m24799e = d14.m24799e(m20001a);
        x85 m27551b = this.f25927l.m27551b();
        m20001a.zzP().mo9452J(m27551b, m27551b, m27551b, m27551b, m27551b, false, null, new zzb(this.f25916a, null, null), null, null, this.f25931p, this.f25930o, this.f25928m, this.f25929n, null, m27551b, null, null);
        if (((Boolean) zzba.zzc().m23658b(g93.f10735k3)).booleanValue()) {
            m20001a.mo6392y("/getNativeAdViewSignals", yg3.f33662s);
        }
        m20001a.mo6392y("/getNativeClickMeta", yg3.f33663t);
        m20001a.zzP().mo9454E(new o84() { // from class: com.daaw.m65
            @Override // com.daaw.o84
            public final void zza(boolean z) {
                d14 d14Var = d14.this;
                if (z) {
                    d14Var.m24798g();
                } else {
                    d14Var.m23796c(new yu5(1, "Image Web View failed to load."));
                }
            }
        });
        m20001a.mo6423b0(str, str2, null);
        return m24799e;
    }

    /* renamed from: c */
    public final /* synthetic */ f77 m10658c(String str, Object obj) {
        zzt.zzz();
        a74 m13613a = p74.m13613a(this.f25916a, v84.m7337a(), "native-omid", false, false, this.f25918c, null, this.f25919d, null, null, this.f25920e, this.f25921f, null, null);
        final d14 m24799e = d14.m24799e(m13613a);
        m13613a.zzP().mo9454E(new o84() { // from class: com.daaw.f65
            @Override // com.daaw.o84
            public final void zza(boolean z) {
                d14.this.m24798g();
            }
        });
        if (((Boolean) zzba.zzc().m23658b(g93.f10375B4)).booleanValue()) {
            m13613a.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            m13613a.loadData(str, "text/html", "UTF-8");
        }
        return m24799e;
    }

    /* renamed from: d */
    public final f77 m10657d(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return s67.m10634i(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return m10648m(optJSONObject.optBoolean("require"), s67.m10630m(m10646o(optJSONArray, false, true), new ey6() { // from class: com.daaw.g65
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                return s65.this.m10660a(optJSONObject, (List) obj);
            }
        }, this.f25922g), null);
    }

    /* renamed from: e */
    public final f77 m10656e(JSONObject jSONObject, String str) {
        return m10647n(jSONObject.optJSONObject(str), this.f25923h.f36844q);
    }

    /* renamed from: f */
    public final f77 m10655f(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        zzblz zzblzVar = this.f25923h;
        return m10646o(optJSONArray, zzblzVar.f36844q, zzblzVar.f36846s);
    }

    /* renamed from: g */
    public final f77 m10654g(JSONObject jSONObject, String str, final th6 th6Var, final wh6 wh6Var) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10470K8)).booleanValue()) {
            JSONArray optJSONArray = jSONObject.optJSONArray("images");
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                return s67.m10634i(null);
            }
            JSONObject optJSONObject = optJSONArray.optJSONObject(0);
            if (optJSONObject == null) {
                return s67.m10634i(null);
            }
            final String optString = optJSONObject.optString("base_url");
            final String optString2 = optJSONObject.optString("html");
            final zzq m10650k = m10650k(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
            if (TextUtils.isEmpty(optString2)) {
                return s67.m10634i(null);
            }
            final f77 m10629n = s67.m10629n(s67.m10634i(null), new w57() { // from class: com.daaw.h65
                @Override // com.daaw.w57
                public final f77 zza(Object obj) {
                    return s65.this.m10659b(m10650k, th6Var, wh6Var, optString, optString2, obj);
                }
            }, z04.f34309e);
            return s67.m10629n(m10629n, new w57() { // from class: com.daaw.l65
                @Override // com.daaw.w57
                public final f77 zza(Object obj) {
                    f77 f77Var = f77.this;
                    if (((a74) obj) != null) {
                        return f77Var;
                    }
                    throw new yu5(1, "Retrieve Web View from image ad response failed.");
                }
            }, z04.f34310f);
        }
        return s67.m10634i(null);
    }

    /* renamed from: h */
    public final f77 m10653h(JSONObject jSONObject, th6 th6Var, wh6 wh6Var) {
        f77 m17992a;
        JSONObject zzg = zzbu.zzg(jSONObject, "html_containers", "instream");
        if (zzg == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("vast_xml");
                boolean z = false;
                if (((Boolean) zzba.zzc().m23658b(g93.f10460J8)).booleanValue() && optJSONObject.has("html")) {
                    z = true;
                }
                if (TextUtils.isEmpty(optString)) {
                    if (!z) {
                        k04.zzj("Required field 'vast_xml' or 'html' is missing");
                    }
                } else if (!z) {
                    m17992a = this.f25924i.m17992a(optJSONObject);
                    return m10649l(s67.m10628o(m17992a, ((Integer) zzba.zzc().m23658b(g93.f10746l3)).intValue(), TimeUnit.SECONDS, this.f25926k), null);
                }
                m17992a = m10645p(optJSONObject, th6Var, wh6Var);
                return m10649l(s67.m10628o(m17992a, ((Integer) zzba.zzc().m23658b(g93.f10746l3)).intValue(), TimeUnit.SECONDS, this.f25926k), null);
            }
            return s67.m10634i(null);
        }
        return m10645p(zzg, th6Var, wh6Var);
    }

    /* renamed from: k */
    public final zzq m10650k(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return zzq.zzc();
            }
            i = 0;
        }
        return new zzq(this.f25916a, new AdSize(i, i2));
    }

    /* renamed from: n */
    public final f77 m10647n(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return s67.m10634i(null);
        }
        final String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return s67.m10634i(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return s67.m10634i(new dc3(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return m10648m(jSONObject.optBoolean("require"), s67.m10630m(this.f25917b.m4093b(optString, optDouble, optBoolean), new ey6() { // from class: com.daaw.q65
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                String str = optString;
                return new dc3(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), optDouble, optInt, optInt2);
            }
        }, this.f25922g), null);
    }

    /* renamed from: o */
    public final f77 m10646o(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return s67.m10634i(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(m10647n(jSONArray.optJSONObject(i), z));
        }
        return s67.m10630m(s67.m10638e(arrayList), new ey6() { // from class: com.daaw.o65
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
        }, this.f25922g);
    }

    /* renamed from: p */
    public final f77 m10645p(JSONObject jSONObject, th6 th6Var, wh6 wh6Var) {
        final f77 m17991b = this.f25924i.m17991b(jSONObject.optString("base_url"), jSONObject.optString("html"), th6Var, wh6Var, m10650k(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return s67.m10629n(m17991b, new w57() { // from class: com.daaw.r65
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                f77 f77Var = f77.this;
                a74 a74Var = (a74) obj;
                if (a74Var == null || a74Var.zzs() == null) {
                    throw new yu5(1, "Retrieve video view in html5 ad response failed.");
                }
                return f77Var;
            }
        }, z04.f34310f);
    }
}
