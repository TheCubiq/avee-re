package com.daaw;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcbj;
import com.google.android.gms.internal.ads.zzccb;
import com.google.android.gms.internal.ads.zzchu;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class am5 {

    /* renamed from: a */
    public final fl5 f3316a;

    /* renamed from: b */
    public final en6 f3317b;

    /* renamed from: c */
    public final ri6 f3318c;

    /* renamed from: d */
    public final zzchu f3319d;

    /* renamed from: e */
    public final vo6 f3320e;

    /* renamed from: f */
    public final to6 f3321f;

    /* renamed from: g */
    public final Context f3322g;

    /* renamed from: h */
    public final g77 f3323h;

    /* renamed from: i */
    public f77 f3324i;

    public am5(fl5 fl5Var, en6 en6Var, ri6 ri6Var, zzchu zzchuVar, vo6 vo6Var, to6 to6Var, Context context, g77 g77Var) {
        this.f3316a = fl5Var;
        this.f3317b = en6Var;
        this.f3318c = ri6Var;
        this.f3319d = zzchuVar;
        this.f3320e = vo6Var;
        this.f3321f = to6Var;
        this.f3322g = context;
        this.f3323h = g77Var;
    }

    /* renamed from: a */
    public final /* synthetic */ zzcbj m27341a(zzccb zzccbVar, on5 on5Var) {
        Context context = this.f3322g;
        on5Var.f21688c.put("Content-Type", on5Var.f21690e);
        on5Var.f21688c.put("User-Agent", zzt.zzp().zzc(context, zzccbVar.f36965q.f36993p));
        String str = on5Var.f21686a;
        int i = on5Var.f21687b;
        Map map = on5Var.f21688c;
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzcbj(str, i, bundle, on5Var.f21689d, on5Var.f21691f, zzccbVar.f36967s, zzccbVar.f36971w);
    }

    /* renamed from: b */
    public final f77 m27340b(final zzccb zzccbVar, final JSONObject jSONObject, final pu3 pu3Var) {
        vm6 m5975b = this.f3317b.m5975b(ym6.PROXY, s67.m10630m(this.f3317b.m5975b(ym6.PREPARE_HTTP_REQUEST, s67.m10634i(new wn5(jSONObject, pu3Var))).m7033e(new xn5(zzccbVar.f36970v, this.f3321f, ho6.m20568a(this.f3322g, 9))).m7037a(), new ey6() { // from class: com.daaw.zl5
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                return am5.this.m27341a(zzccbVar, (on5) obj);
            }
        }, this.f3323h));
        final fl5 fl5Var = this.f3316a;
        gm6 m7037a = m5975b.m7032f(new w57() { // from class: com.daaw.wl5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return fl5.this.m22502c((zzcbj) obj);
            }
        }).m7037a();
        this.f3324i = m7037a;
        return s67.m10629n(this.f3317b.m5975b(ym6.PRE_PROCESS, m7037a).m7033e(new em6() { // from class: com.daaw.yl5
            @Override // com.daaw.em6
            public final Object zza(Object obj) {
                return new bn5(pn5.m13270a(new InputStreamReader((InputStream) obj)), jSONObject, pu3Var);
            }
        }).m7032f(zzt.zzf().m14178a(this.f3322g, this.f3319d, this.f3320e).m5010a("google.afma.response.normalize", bn5.f4981d, ul3.f29177c)).m7037a(), new w57() { // from class: com.daaw.xl5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return am5.this.m27339c((InputStream) obj);
            }
        }, this.f3323h);
    }

    /* renamed from: c */
    public final /* synthetic */ f77 m27339c(InputStream inputStream) {
        return s67.m10634i(new fi6(new ci6(this.f3318c), ei6.m23453a(new InputStreamReader(inputStream))));
    }
}
