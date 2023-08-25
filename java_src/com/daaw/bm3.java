package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class bm3 implements nl3 {

    /* renamed from: a */
    public final pl3 f4959a;

    /* renamed from: b */
    public final ql3 f4960b;

    /* renamed from: c */
    public final jl3 f4961c;

    /* renamed from: d */
    public final String f4962d;

    public bm3(jl3 jl3Var, String str, ql3 ql3Var, pl3 pl3Var) {
        this.f4961c = jl3Var;
        this.f4962d = str;
        this.f4960b = ql3Var;
        this.f4959a = pl3Var;
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m25995c(bm3 bm3Var, al3 al3Var, kl3 kl3Var, Object obj, e14 e14Var) {
        try {
            zzt.zzp();
            String uuid = UUID.randomUUID().toString();
            yg3.f33658o.m15175c(uuid, new am3(bm3Var, al3Var, e14Var));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", bm3Var.f4960b.mo6074a(obj));
            kl3Var.mo6461C0(bm3Var.f4962d, jSONObject);
        } catch (Exception e) {
            try {
                e14Var.m23796c(e);
                k04.zzh("Unable to invokeJavascript", e);
            } finally {
                al3Var.m27356g();
            }
        }
    }

    @Override // com.daaw.nl3
    /* renamed from: a */
    public final f77 mo15045a(Object obj) {
        e14 e14Var = new e14();
        al3 m18433b = this.f4961c.m18433b(null);
        m18433b.m17206e(new yl3(this, m18433b, obj, e14Var), new zl3(this, e14Var, m18433b));
        return e14Var;
    }

    @Override // com.daaw.w57
    public final f77 zza(Object obj) {
        return mo15045a(obj);
    }
}
