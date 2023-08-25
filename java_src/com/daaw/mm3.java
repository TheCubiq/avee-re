package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class mm3 implements w57 {
    public final pl3 a;
    public final ql3 b;
    public final String c = "google.afma.activeView.handleUpdate";
    public final f77 d;

    public mm3(f77 f77Var, String str, ql3 ql3Var, pl3 pl3Var) {
        this.d = f77Var;
        this.b = ql3Var;
        this.a = pl3Var;
    }

    public final f77 a(final Object obj) {
        return s67.n(this.d, new w57() { // from class: com.daaw.km3
            @Override // com.daaw.w57
            public final f77 zza(Object obj2) {
                return mm3.this.b(obj, (kl3) obj2);
            }
        }, z04.f);
    }

    public final /* synthetic */ f77 b(Object obj, kl3 kl3Var) {
        e14 e14Var = new e14();
        zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        yg3.o.c(uuid, new lm3(this, e14Var));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        kl3Var.C0(this.c, jSONObject);
        return e14Var;
    }

    @Override // com.daaw.w57
    public final f77 zza(Object obj) {
        return a(obj);
    }
}
