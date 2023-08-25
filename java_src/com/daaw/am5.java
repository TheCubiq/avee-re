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
    public final fl5 a;
    public final en6 b;
    public final ri6 c;
    public final zzchu d;
    public final vo6 e;
    public final to6 f;
    public final Context g;
    public final g77 h;
    public f77 i;

    public am5(fl5 fl5Var, en6 en6Var, ri6 ri6Var, zzchu zzchuVar, vo6 vo6Var, to6 to6Var, Context context, g77 g77Var) {
        this.a = fl5Var;
        this.b = en6Var;
        this.c = ri6Var;
        this.d = zzchuVar;
        this.e = vo6Var;
        this.f = to6Var;
        this.g = context;
        this.h = g77Var;
    }

    public final /* synthetic */ zzcbj a(zzccb zzccbVar, on5 on5Var) {
        Context context = this.g;
        on5Var.c.put("Content-Type", on5Var.e);
        on5Var.c.put("User-Agent", zzt.zzp().zzc(context, zzccbVar.q.p));
        String str = on5Var.a;
        int i = on5Var.b;
        Map map = on5Var.c;
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzcbj(str, i, bundle, on5Var.d, on5Var.f, zzccbVar.s, zzccbVar.w);
    }

    public final f77 b(final zzccb zzccbVar, final JSONObject jSONObject, final pu3 pu3Var) {
        vm6 b = this.b.b(ym6.PROXY, s67.m(this.b.b(ym6.PREPARE_HTTP_REQUEST, s67.i(new wn5(jSONObject, pu3Var))).e(new xn5(zzccbVar.v, this.f, ho6.a(this.g, 9))).a(), new ey6() { // from class: com.daaw.zl5
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                return am5.this.a(zzccbVar, (on5) obj);
            }
        }, this.h));
        final fl5 fl5Var = this.a;
        gm6 a = b.f(new w57() { // from class: com.daaw.wl5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return fl5.this.c((zzcbj) obj);
            }
        }).a();
        this.i = a;
        return s67.n(this.b.b(ym6.PRE_PROCESS, a).e(new em6() { // from class: com.daaw.yl5
            @Override // com.daaw.em6
            public final Object zza(Object obj) {
                return new bn5(pn5.a(new InputStreamReader((InputStream) obj)), jSONObject, pu3Var);
            }
        }).f(zzt.zzf().a(this.g, this.d, this.e).a("google.afma.response.normalize", bn5.d, ul3.c)).a(), new w57() { // from class: com.daaw.xl5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return am5.this.c((InputStream) obj);
            }
        }, this.h);
    }

    public final /* synthetic */ f77 c(InputStream inputStream) {
        return s67.i(new fi6(new ci6(this.c), ei6.a(new InputStreamReader(inputStream))));
    }
}
