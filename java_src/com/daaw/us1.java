package com.daaw;

import android.view.View;
import android.view.animation.Animation;
import com.daaw.f70;
/* loaded from: classes.dex */
public class us1<R> implements f70<R> {

    /* renamed from: a */
    public final InterfaceC3254a f29504a;

    /* renamed from: com.daaw.us1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3254a {
        /* renamed from: a */
        Animation mo7743a();
    }

    public us1(InterfaceC3254a interfaceC3254a) {
        this.f29504a = interfaceC3254a;
    }

    @Override // com.daaw.f70
    /* renamed from: a */
    public boolean mo6825a(R r, f70.InterfaceC1258a interfaceC1258a) {
        View view = interfaceC1258a.getView();
        if (view != null) {
            view.clearAnimation();
            view.startAnimation(this.f29504a.mo7743a());
            return false;
        }
        return false;
    }
}
