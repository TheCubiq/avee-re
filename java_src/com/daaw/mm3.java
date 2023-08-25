package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class mm3 implements w57 {

    /* renamed from: a */
    public final pl3 f18978a;

    /* renamed from: b */
    public final ql3 f18979b;

    /* renamed from: c */
    public final String f18980c = "google.afma.activeView.handleUpdate";

    /* renamed from: d */
    public final f77 f18981d;

    public mm3(f77 f77Var, String str, ql3 ql3Var, pl3 pl3Var) {
        this.f18981d = f77Var;
        this.f18979b = ql3Var;
        this.f18978a = pl3Var;
    }

    /* renamed from: a */
    public final f77 m15933a(final Object obj) {
        return s67.m10629n(this.f18981d, new w57() { // from class: com.daaw.km3
            @Override // com.daaw.w57
            public final f77 zza(Object obj2) {
                return mm3.this.m15932b(obj, (kl3) obj2);
            }
        }, z04.f34310f);
    }

    /* renamed from: b */
    public final /* synthetic */ f77 m15932b(Object obj, kl3 kl3Var) {
        e14 e14Var = new e14();
        zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        yg3.f33658o.m15175c(uuid, new lm3(this, e14Var));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        kl3Var.mo6461C0(this.f18980c, jSONObject);
        return e14Var;
    }

    @Override // com.daaw.w57
    public final f77 zza(Object obj) {
        return m15933a(obj);
    }
}
