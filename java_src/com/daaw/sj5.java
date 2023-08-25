package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class sj5 {

    /* renamed from: a */
    public final b94 f26309a;

    /* renamed from: b */
    public final Context f26310b;

    /* renamed from: c */
    public final zzchu f26311c;

    /* renamed from: d */
    public final ri6 f26312d;

    /* renamed from: e */
    public final Executor f26313e;

    /* renamed from: f */
    public final String f26314f;

    /* renamed from: g */
    public final to6 f26315g;

    /* renamed from: h */
    public final dj6 f26316h;

    /* renamed from: i */
    public final fd5 f26317i;

    public sj5(b94 b94Var, Context context, zzchu zzchuVar, ri6 ri6Var, Executor executor, String str, to6 to6Var, fd5 fd5Var) {
        this.f26309a = b94Var;
        this.f26310b = context;
        this.f26311c = zzchuVar;
        this.f26312d = ri6Var;
        this.f26313e = executor;
        this.f26314f = str;
        this.f26315g = to6Var;
        this.f26316h = b94Var.mo26314A();
        this.f26317i = fd5Var;
    }

    /* renamed from: e */
    public static final String m10283e(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f77 m10287a() {
        Boolean bool;
        String str = this.f26312d.f25344d.zzx;
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10826s6)).booleanValue()) {
                String m10283e = m10283e(str);
                y83 y83Var = g93.f10408E6;
                if (((Boolean) zzba.zzc().m23658b(y83Var)).booleanValue() && m10283e.isEmpty()) {
                    int lastIndexOf = str.lastIndexOf("&request_id=");
                    m10283e = lastIndexOf != -1 ? str.substring(lastIndexOf + 12) : "";
                }
                if (TextUtils.isEmpty(m10283e)) {
                    return s67.m10635h(new yu5(15, "Invalid ad string."));
                }
                String zzb = this.f26309a.mo26247s().zzb(m10283e, this.f26317i);
                if (((Boolean) zzba.zzc().m23658b(y83Var)).booleanValue()) {
                    fd5 fd5Var = this.f26317i;
                    if (!TextUtils.isEmpty(zzb)) {
                        if (new JSONObject(zzb).optString("is_gbid").equals("true")) {
                            bool = Boolean.TRUE;
                            if (bool.booleanValue()) {
                                int lastIndexOf2 = str.lastIndexOf("&");
                                String str2 = null;
                                String substring = lastIndexOf2 != -1 ? str.substring(0, lastIndexOf2) : null;
                                if (!TextUtils.isEmpty(substring)) {
                                    try {
                                        byte[] decode = Base64.decode(substring, 11);
                                        byte[] bytes = m10283e.getBytes("UTF-8");
                                        try {
                                            str2 = new JSONObject(zzb).getString("arek");
                                        } catch (JSONException e) {
                                            zze.zza("Failed to get key from QueryJSONMap".concat(e.toString()));
                                            zzt.zzo().m11902u(e, "CryptoUtils.getKeyFromQueryJsonMap");
                                        }
                                        str = dj6.m24341b(decode, bytes, str2, fd5Var);
                                    } catch (UnsupportedEncodingException e2) {
                                        zze.zza("Failed to decode the adResponse. ".concat(e2.toString()));
                                        zzt.zzo().m11902u(e2, "PreloadedLoader.decryptAdResponseIfNecessary");
                                    }
                                }
                            }
                        }
                        bool = Boolean.FALSE;
                        if (bool.booleanValue()) {
                        }
                    }
                }
                if (!TextUtils.isEmpty(zzb)) {
                    return m10285c(str, m10284d(zzb));
                }
            }
        }
        zzc zzcVar = this.f26312d.f25344d.zzs;
        if (zzcVar != null) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10804q6)).booleanValue()) {
                String m10283e2 = m10283e(zzcVar.zza);
                String m10283e3 = m10283e(zzcVar.zzb);
                if (TextUtils.isEmpty(m10283e3) || !m10283e2.equals(m10283e3)) {
                    this.f26317i.m22773a().put("ridmm", "true");
                } else {
                    this.f26309a.mo26247s().zzf(m10283e2);
                    this.f26317i.m22773a().put("rid", m10283e2);
                }
            }
            return m10285c(zzcVar.zza, m10284d(zzcVar.zzb));
        }
        return s67.m10635h(new yu5(14, "Mismatch request IDs."));
    }

    /* renamed from: b */
    public final /* synthetic */ f77 m10286b(JSONObject jSONObject) {
        return s67.m10634i(new fi6(new ci6(this.f26312d), ei6.m23453a(new StringReader(jSONObject.toString()))));
    }

    /* renamed from: c */
    public final f77 m10285c(final String str, final String str2) {
        io6 m20568a = ho6.m20568a(this.f26310b, 11);
        m20568a.zzh();
        xl3 m14178a = zzt.zzf().m14178a(this.f26310b, this.f26311c, this.f26309a.mo26308D());
        rl3 rl3Var = ul3.f29176b;
        final nl3 m5010a = m14178a.m5010a("google.afma.response.normalize", rl3Var, rl3Var);
        f77 m10629n = s67.m10629n(s67.m10629n(s67.m10629n(s67.m10634i(""), new w57() { // from class: com.daaw.pj5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                String str3 = str;
                String str4 = str2;
                String str5 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", "");
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return s67.m10634i(jSONObject);
                } catch (JSONException e) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getCause())));
                }
            }
        }, this.f26313e), new w57() { // from class: com.daaw.qj5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return nl3.this.mo15045a((JSONObject) obj);
            }
        }, this.f26313e), new w57() { // from class: com.daaw.rj5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return sj5.this.m10286b((JSONObject) obj);
            }
        }, this.f26313e);
        so6.m10114a(m10629n, this.f26315g, m20568a);
        return m10629n;
    }

    /* renamed from: d */
    public final String m10284d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f26314f));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            k04.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }
}
