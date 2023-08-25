package com.daaw;

import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;
/* loaded from: classes.dex */
public final class us3 extends qs3 {

    /* renamed from: p */
    public final /* synthetic */ UpdateImpressionUrlsCallback f29505p;

    public us3(zs3 zs3Var, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.f29505p = updateImpressionUrlsCallback;
    }

    @Override // com.daaw.rs3
    /* renamed from: a */
    public final void mo4546a(String str) {
        this.f29505p.onFailure(str);
    }

    @Override // com.daaw.rs3
    /* renamed from: x0 */
    public final void mo4545x0(List list) {
        this.f29505p.onSuccess(list);
    }
}
