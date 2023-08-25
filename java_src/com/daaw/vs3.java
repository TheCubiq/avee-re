package com.daaw;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;
/* loaded from: classes.dex */
public final class vs3 extends qs3 {
    public final /* synthetic */ UpdateClickUrlCallback p;

    public vs3(zs3 zs3Var, UpdateClickUrlCallback updateClickUrlCallback) {
        this.p = updateClickUrlCallback;
    }

    @Override // com.daaw.rs3
    public final void a(String str) {
        this.p.onFailure(str);
    }

    @Override // com.daaw.rs3
    public final void x0(List list) {
        this.p.onSuccess((Uri) list.get(0));
    }
}
