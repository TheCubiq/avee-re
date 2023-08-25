package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class bm3 implements nl3 {
    public final pl3 a;
    public final ql3 b;
    public final jl3 c;
    public final String d;

    public bm3(jl3 jl3Var, String str, ql3 ql3Var, pl3 pl3Var) {
        this.c = jl3Var;
        this.d = str;
        this.b = ql3Var;
        this.a = pl3Var;
    }

    public static /* bridge */ /* synthetic */ void c(bm3 bm3Var, al3 al3Var, kl3 kl3Var, Object obj, e14 e14Var) {
        try {
            zzt.zzp();
            String uuid = UUID.randomUUID().toString();
            yg3.o.c(uuid, new am3(bm3Var, al3Var, e14Var));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", bm3Var.b.a(obj));
            kl3Var.C0(bm3Var.d, jSONObject);
        } catch (Exception e) {
            try {
                e14Var.c(e);
                k04.zzh("Unable to invokeJavascript", e);
            } finally {
                al3Var.g();
            }
        }
    }

    @Override // com.daaw.nl3
    public final f77 a(Object obj) {
        e14 e14Var = new e14();
        al3 b = this.c.b(null);
        b.e(new yl3(this, b, obj, e14Var), new zl3(this, e14Var, b));
        return e14Var;
    }

    @Override // com.daaw.w57
    public final f77 zza(Object obj) {
        return a(obj);
    }
}
