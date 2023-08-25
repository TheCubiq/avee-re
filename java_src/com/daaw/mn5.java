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

    /* renamed from: p */
    public final Context f19006p;

    /* renamed from: q */
    public final e96 f19007q;

    /* renamed from: r */
    public final c96 f19008r;

    /* renamed from: s */
    public final yn5 f19009s;

    /* renamed from: t */
    public final g77 f19010t;

    /* renamed from: u */
    public final vn5 f19011u;

    /* renamed from: v */
    public final yu3 f19012v;

    public mn5(Context context, e96 e96Var, c96 c96Var, vn5 vn5Var, yn5 yn5Var, g77 g77Var, yu3 yu3Var, byte[] bArr) {
        this.f19006p = context;
        this.f19007q = e96Var;
        this.f19008r = c96Var;
        this.f19011u = vn5Var;
        this.f19009s = yn5Var;
        this.f19010t = g77Var;
        this.f19012v = yu3Var;
    }

    @Override // com.daaw.bu3
    /* renamed from: F0 */
    public final void mo1907F0(zzcbf zzcbfVar, eu3 eu3Var) {
        int callingUid = Binder.getCallingUid();
        e96 e96Var = this.f19007q;
        e96Var.mo10481a(new t86(zzcbfVar, callingUid));
        final f96 zzb = e96Var.zzb();
        en6 mo5334b = zzb.mo5334b();
        gm6 m7037a = mo5334b.m5975b(ym6.GMS_SIGNALS, s67.m10633j()).m7032f(new w57() { // from class: com.daaw.jn5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                Void r2 = (Void) obj;
                return f96.this.mo5335a().m17110a(new JSONObject());
            }
        }).m7033e(new em6() { // from class: com.daaw.in5
            @Override // com.daaw.em6
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                zze.zza("GMS AdRequest Signals: ");
                zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).m7032f(new w57() { // from class: com.daaw.hn5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return s67.m10634i(new ByteArrayInputStream(((JSONObject) obj).toString().getBytes(StandardCharsets.UTF_8)));
            }
        }).m7037a();
        m15890h3(m7037a, eu3Var);
        if (((Boolean) ab3.f3050d.m16137e()).booleanValue()) {
            final yn5 yn5Var = this.f19009s;
            yn5Var.getClass();
            m7037a.mo6515f(new Runnable() { // from class: com.daaw.fn5
                @Override // java.lang.Runnable
                public final void run() {
                    yn5.this.m3480b();
                }
            }, this.f19010t);
        }
    }

    @Override // com.daaw.bu3
    /* renamed from: U1 */
    public final void mo1906U1(zzcbj zzcbjVar, eu3 eu3Var) {
        m15890h3(m15891g3(zzcbjVar, Binder.getCallingUid()), eu3Var);
    }

    /* renamed from: g3 */
    public final f77 m15891g3(zzcbj zzcbjVar, int i) {
        f77 m10634i;
        String str = zzcbjVar.f36953p;
        int i2 = zzcbjVar.f36954q;
        Bundle bundle = zzcbjVar.f36955r;
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                String string = bundle.getString(str2);
                if (string != null) {
                    hashMap.put(str2, string);
                }
            }
        }
        final on5 on5Var = new on5(str, i2, hashMap, zzcbjVar.f36956s, "", zzcbjVar.f36957t);
        c96 c96Var = this.f19008r;
        c96Var.mo14431a(new ma6(zzcbjVar));
        d96 zzb = c96Var.zzb();
        if (on5Var.f21691f) {
            String str3 = zzcbjVar.f36953p;
            String str4 = (String) lb3.f17223c.m16137e();
            if (!TextUtils.isEmpty(str4)) {
                String host = Uri.parse(str3).getHost();
                if (!TextUtils.isEmpty(host)) {
                    for (String str5 : fz6.m22122c(by6.m25734b(';')).m22121d(str4)) {
                        if (host.endsWith(str5)) {
                            m10634i = s67.m10630m(zzb.mo12651a().m17110a(new JSONObject()), new ey6() { // from class: com.daaw.kn5
                                @Override // com.daaw.ey6
                                public final Object apply(Object obj) {
                                    on5 on5Var2 = on5.this;
                                    yn5.m3481a(on5Var2.f21688c, (JSONObject) obj);
                                    return on5Var2;
                                }
                            }, this.f19010t);
                            break;
                        }
                    }
                }
            }
        }
        m10634i = s67.m10634i(on5Var);
        en6 mo12650b = zzb.mo12650b();
        return s67.m10629n(mo12650b.m5975b(ym6.HTTP, m10634i).m7033e(new un5(this.f19006p, "", this.f19012v, i, null)).m7037a(), new w57() { // from class: com.daaw.gn5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                pn5 pn5Var = (pn5) obj;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("response", pn5Var.f23079a);
                    JSONObject jSONObject2 = new JSONObject();
                    for (String str6 : pn5Var.f23080b.keySet()) {
                        if (str6 != null) {
                            JSONArray jSONArray = new JSONArray();
                            for (String str7 : (List) pn5Var.f23080b.get(str6)) {
                                if (str7 != null) {
                                    jSONArray.put(str7);
                                }
                            }
                            jSONObject2.put(str6, jSONArray);
                        }
                    }
                    jSONObject.put("headers", jSONObject2);
                    Object obj2 = pn5Var.f23081c;
                    if (obj2 != null) {
                        jSONObject.put("body", obj2);
                    }
                    jSONObject.put("latency", pn5Var.f23082d);
                    return s67.m10634i(new ByteArrayInputStream(jSONObject.toString().getBytes(StandardCharsets.UTF_8)));
                } catch (JSONException e) {
                    k04.zzj("Error converting response to JSONObject: ".concat(String.valueOf(e.getMessage())));
                    throw new JSONException("Parsing HTTP Response: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.f19010t);
    }

    /* renamed from: h3 */
    public final void m15890h3(f77 f77Var, eu3 eu3Var) {
        s67.m10625r(s67.m10629n(j67.m18784D(f77Var), new w57() { // from class: com.daaw.en5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return s67.m10634i(sj6.m10282a((InputStream) obj));
            }
        }, z04.f34305a), new ln5(this, eu3Var), z04.f34310f);
    }
}
