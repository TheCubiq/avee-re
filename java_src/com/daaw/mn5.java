package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzcbf;
import com.google.android.gms.internal.ads.zzcbj;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class mn5 extends au3 {
    public final Context p;
    public final e96 q;
    public final c96 r;
    public final yn5 s;
    public final g77 t;
    public final vn5 u;
    public final yu3 v;

    public mn5(Context context, e96 e96Var, c96 c96Var, vn5 vn5Var, yn5 yn5Var, g77 g77Var, yu3 yu3Var, byte[] bArr) {
        this.p = context;
        this.q = e96Var;
        this.r = c96Var;
        this.u = vn5Var;
        this.s = yn5Var;
        this.t = g77Var;
        this.v = yu3Var;
    }

    @Override // com.daaw.bu3
    public final void F0(zzcbf zzcbfVar, eu3 eu3Var) {
        int callingUid = Binder.getCallingUid();
        e96 e96Var = this.q;
        e96Var.a(new t86(zzcbfVar, callingUid));
        final f96 zzb = e96Var.zzb();
        en6 b = zzb.b();
        gm6 a = b.b(ym6.GMS_SIGNALS, s67.j()).f(new w57() { // from class: com.daaw.jn5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                Void r2 = (Void) obj;
                return f96.this.a().a(new JSONObject());
            }
        }).e(new em6() { // from class: com.daaw.in5
            @Override // com.daaw.em6
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                zze.zza("GMS AdRequest Signals: ");
                zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).f(new w57() { // from class: com.daaw.hn5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return s67.i(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).a();
        h3(a, eu3Var);
        if (((Boolean) ab3.d.e()).booleanValue()) {
            final yn5 yn5Var = this.s;
            yn5Var.getClass();
            a.f(new Runnable() { // from class: com.daaw.fn5
                @Override // java.lang.Runnable
                public final void run() {
                    yn5.this.b();
                }
            }, this.t);
        }
    }

    @Override // com.daaw.bu3
    public final void U1(zzcbj zzcbjVar, eu3 eu3Var) {
        h3(g3(zzcbjVar, Binder.getCallingUid()), eu3Var);
    }

    public final f77 g3(zzcbj zzcbjVar, int i) {
        f77 i2;
        String str = zzcbjVar.p;
        int i3 = zzcbjVar.q;
        Bundle bundle = zzcbjVar.r;
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                String string = bundle.getString(str2);
                if (string != null) {
                    hashMap.put(str2, string);
                }
            }
        }
        final on5 on5Var = new on5(str, i3, hashMap, zzcbjVar.s, "", zzcbjVar.t);
        c96 c96Var = this.r;
        c96Var.a(new ma6(zzcbjVar));
        d96 zzb = c96Var.zzb();
        if (on5Var.f) {
            String str3 = zzcbjVar.p;
            String str4 = (String) lb3.c.e();
            if (!TextUtils.isEmpty(str4)) {
                String host = Uri.parse(str3).getHost();
                if (!TextUtils.isEmpty(host)) {
                    for (String str5 : fz6.c(by6.b(';')).d(str4)) {
                        if (host.endsWith(str5)) {
                            i2 = s67.m(zzb.a().a(new JSONObject()), new ey6() { // from class: com.daaw.kn5
                                @Override // com.daaw.ey6
                                public final Object apply(Object obj) {
                                    on5 on5Var2 = on5.this;
                                    yn5.a(on5Var2.c, (JSONObject) obj);
                                    return on5Var2;
                                }
                            }, this.t);
                            break;
                        }
                    }
                }
            }
        }
        i2 = s67.i(on5Var);
        en6 b = zzb.b();
        return s67.n(b.b(ym6.HTTP, i2).e(new un5(this.p, "", this.v, i, null)).a(), new w57() { // from class: com.daaw.gn5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                pn5 pn5Var = (pn5) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("response", pn5Var.a);
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str6 : pn5Var.b.keySet()) {
                        if (str6 != null) {
                            JSONArray jSONArray = new JSONArray();
                            for (String str7 : (List) pn5Var.b.get(str6)) {
                                if (str7 != null) {
                                    jSONArray.put(str7);
                                }
                            }
                            jSONObject2.put(str6, jSONArray);
                        }
                    }
                    jSONObject.put("headers", jSONObject2);
                    Object obj2 = pn5Var.c;
                    if (obj2 != null) {
                        jSONObject.put("body", obj2);
                    }
                    jSONObject.put("latency", pn5Var.d);
                    return s67.i(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e) {
                    k04.zzj("Error converting response to JSONObject: ".concat(String.valueOf(e.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.t);
    }

    public final void h3(f77 f77Var, eu3 eu3Var) {
        s67.r(s67.n(j67.D(f77Var), new w57() { // from class: com.daaw.en5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return s67.i(sj6.a((InputStream) obj));
            }
        }, z04.a), new ln5(this, eu3Var), z04.f);
    }
}
