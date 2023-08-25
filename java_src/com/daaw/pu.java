package com.daaw;

import android.graphics.drawable.Drawable;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.daaw.us1;
/* loaded from: classes.dex */
public class pu<T extends Drawable> implements g70<T> {
    public final vs1<T> a;
    public final int b;
    public qu<T> c;
    public qu<T> d;

    /* loaded from: classes.dex */
    public static class a implements us1.a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        @Override // com.daaw.us1.a
        public Animation a() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(this.a);
            return alphaAnimation;
        }
    }

    public pu() {
        this(300);
    }

    public pu(int i) {
        this(new vs1(new a(i)), i);
    }

    public pu(vs1<T> vs1Var, int i) {
        this.a = vs1Var;
        this.b = i;
    }

    @Override // com.daaw.g70
    public f70<T> a(boolean z, boolean z2) {
        return z ? vs0.c() : z2 ? b() : c();
    }

    public final f70<T> b() {
        if (this.c == null) {
            this.c = new qu<>(this.a.a(false, true), this.b);
        }
        return this.c;
    }

    public final f70<T> c() {
        if (this.d == null) {
            this.d = new qu<>(this.a.a(false, false), this.b);
        }
        return this.d;
    }
}
