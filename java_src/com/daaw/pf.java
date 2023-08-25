package com.daaw;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
/* loaded from: classes2.dex */
public interface pf {

    /* loaded from: classes2.dex */
    public static class b implements TypeEvaluator<e> {
        public static final TypeEvaluator<e> b = new b();
        public final e a = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public e evaluate(float f, e eVar, e eVar2) {
            this.a.a(rn0.c(eVar.a, eVar2.a, f), rn0.c(eVar.b, eVar2.b, f), rn0.c(eVar.c, eVar2.c, f));
            return this.a;
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends Property<pf, e> {
        public static final Property<pf, e> a = new c("circularReveal");

        public c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public e get(pf pfVar) {
            return pfVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(pf pfVar, e eVar) {
            pfVar.setRevealInfo(eVar);
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends Property<pf, Integer> {
        public static final Property<pf, Integer> a = new d("circularRevealScrimColor");

        public d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Integer get(pf pfVar) {
            return Integer.valueOf(pfVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(pf pfVar, Integer num) {
            pfVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* loaded from: classes2.dex */
    public static class e {
        public float a;
        public float b;
        public float c;

        public e() {
        }

        public e(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        public void a(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);
}
