package com.daaw;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.daaw.f70;
/* loaded from: classes.dex */
public class qu<T extends Drawable> implements f70<T> {
    public final f70<T> a;
    public final int b;

    public qu(f70<T> f70Var, int i) {
        this.a = f70Var;
        this.b = i;
    }

    @Override // com.daaw.f70
    /* renamed from: b */
    public boolean a(T t, f70.a aVar) {
        Drawable f = aVar.f();
        if (f == null) {
            this.a.a(t, aVar);
            return false;
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{f, t});
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(this.b);
        aVar.d(transitionDrawable);
        return true;
    }
}
