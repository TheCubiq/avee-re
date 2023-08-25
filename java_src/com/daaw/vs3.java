package com.daaw;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;
/* loaded from: classes.dex */
public final class vs3 extends qs3 {

    /* renamed from: p */
    public final /* synthetic */ UpdateClickUrlCallback f30553p;

    public vs3(zs3 zs3Var, UpdateClickUrlCallback updateClickUrlCallback) {
        this.f30553p = updateClickUrlCallback;
    }

    @Override // com.daaw.rs3
    /* renamed from: a */
    public final void mo4546a(String str) {
        this.f30553p.onFailure(str);
    }

    @Override // com.daaw.rs3
    /* renamed from: x0 */
    public final void mo4545x0(List list) {
        this.f30553p.onSuccess((Uri) list.get(0));
    }
}
