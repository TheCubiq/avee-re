package com.daaw;

import android.graphics.drawable.Drawable;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.daaw.us1;
/* renamed from: com.daaw.pu */
/* loaded from: classes.dex */
public class C2589pu<T extends Drawable> implements g70<T> {

    /* renamed from: a */
    public final vs1<T> f23268a;

    /* renamed from: b */
    public final int f23269b;

    /* renamed from: c */
    public C2753qu<T> f23270c;

    /* renamed from: d */
    public C2753qu<T> f23271d;

    /* renamed from: com.daaw.pu$a */
    /* loaded from: classes.dex */
    public static class C2590a implements us1.InterfaceC3254a {

        /* renamed from: a */
        public final int f23272a;

        public C2590a(int i) {
            this.f23272a = i;
        }

        @Override // com.daaw.us1.InterfaceC3254a
        /* renamed from: a */
        public Animation mo7743a() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(this.f23272a);
            return alphaAnimation;
        }
    }

    public C2589pu() {
        this(300);
    }

    public C2589pu(int i) {
        this(new vs1(new C2590a(i)), i);
    }

    public C2589pu(vs1<T> vs1Var, int i) {
        this.f23268a = vs1Var;
        this.f23269b = i;
    }

    @Override // com.daaw.g70
    /* renamed from: a */
    public f70<T> mo6821a(boolean z, boolean z2) {
        return z ? vs0.m6823c() : z2 ? m13146b() : m13145c();
    }

    /* renamed from: b */
    public final f70<T> m13146b() {
        if (this.f23270c == null) {
            this.f23270c = new C2753qu<>(this.f23268a.mo6821a(false, true), this.f23269b);
        }
        return this.f23270c;
    }

    /* renamed from: c */
    public final f70<T> m13145c() {
        if (this.f23271d == null) {
            this.f23271d = new C2753qu<>(this.f23268a.mo6821a(false, false), this.f23269b);
        }
        return this.f23271d;
    }
}
