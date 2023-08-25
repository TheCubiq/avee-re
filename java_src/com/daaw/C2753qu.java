package com.daaw;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.daaw.f70;
/* renamed from: com.daaw.qu */
/* loaded from: classes.dex */
public class C2753qu<T extends Drawable> implements f70<T> {

    /* renamed from: a */
    public final f70<T> f24325a;

    /* renamed from: b */
    public final int f24326b;

    public C2753qu(f70<T> f70Var, int i) {
        this.f24325a = f70Var;
        this.f24326b = i;
    }

    @Override // com.daaw.f70
    /* renamed from: b */
    public boolean mo6825a(T t, f70.InterfaceC1258a interfaceC1258a) {
        Drawable mo16044f = interfaceC1258a.mo16044f();
        if (mo16044f == null) {
            this.f24325a.mo6825a(t, interfaceC1258a);
            return false;
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{mo16044f, t});
        transitionDrawable.setCrossFadeEnabled(true);
        transitionDrawable.startTransition(this.f24326b);
        interfaceC1258a.mo16045d(transitionDrawable);
        return true;
    }
}
