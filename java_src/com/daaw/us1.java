package com.daaw;

import android.view.View;
import android.view.animation.Animation;
import com.daaw.f70;
/* loaded from: classes.dex */
public class us1<R> implements f70<R> {
    public final a a;

    /* loaded from: classes.dex */
    public interface a {
        Animation a();
    }

    public us1(a aVar) {
        this.a = aVar;
    }

    @Override // com.daaw.f70
    public boolean a(R r, f70.a aVar) {
        View view = aVar.getView();
        if (view != null) {
            view.clearAnimation();
            view.startAnimation(this.a.a());
            return false;
        }
        return false;
    }
}
