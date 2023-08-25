package com.daaw;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
/* renamed from: com.daaw.pf */
/* loaded from: classes2.dex */
public interface InterfaceC2544pf {

    /* renamed from: com.daaw.pf$b */
    /* loaded from: classes2.dex */
    public static class C2546b implements TypeEvaluator<C2549e> {

        /* renamed from: b */
        public static final TypeEvaluator<C2549e> f22881b = new C2546b();

        /* renamed from: a */
        public final C2549e f22882a = new C2549e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public C2549e evaluate(float f, C2549e c2549e, C2549e c2549e2) {
            this.f22882a.m13409a(rn0.m11158c(c2549e.f22885a, c2549e2.f22885a, f), rn0.m11158c(c2549e.f22886b, c2549e2.f22886b, f), rn0.m11158c(c2549e.f22887c, c2549e2.f22887c, f));
            return this.f22882a;
        }
    }

    /* renamed from: com.daaw.pf$c */
    /* loaded from: classes2.dex */
    public static class C2547c extends Property<InterfaceC2544pf, C2549e> {

        /* renamed from: a */
        public static final Property<InterfaceC2544pf, C2549e> f22883a = new C2547c("circularReveal");

        public C2547c(String str) {
            super(C2549e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public C2549e get(InterfaceC2544pf interfaceC2544pf) {
            return interfaceC2544pf.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(InterfaceC2544pf interfaceC2544pf, C2549e c2549e) {
            interfaceC2544pf.setRevealInfo(c2549e);
        }
    }

    /* renamed from: com.daaw.pf$d */
    /* loaded from: classes2.dex */
    public static class C2548d extends Property<InterfaceC2544pf, Integer> {

        /* renamed from: a */
        public static final Property<InterfaceC2544pf, Integer> f22884a = new C2548d("circularRevealScrimColor");

        public C2548d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Integer get(InterfaceC2544pf interfaceC2544pf) {
            return Integer.valueOf(interfaceC2544pf.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(InterfaceC2544pf interfaceC2544pf, Integer num) {
            interfaceC2544pf.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: com.daaw.pf$e */
    /* loaded from: classes2.dex */
    public static class C2549e {

        /* renamed from: a */
        public float f22885a;

        /* renamed from: b */
        public float f22886b;

        /* renamed from: c */
        public float f22887c;

        public C2549e() {
        }

        public C2549e(float f, float f2, float f3) {
            this.f22885a = f;
            this.f22886b = f2;
            this.f22887c = f3;
        }

        /* renamed from: a */
        public void m13409a(float f, float f2, float f3) {
            this.f22885a = f;
            this.f22886b = f2;
            this.f22887c = f3;
        }
    }

    /* renamed from: a */
    void mo13416a();

    /* renamed from: b */
    void mo13415b();

    int getCircularRevealScrimColor();

    C2549e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C2549e c2549e);
}
