package com.daaw;

import android.graphics.Bitmap;
import com.daaw.jr1;
/* loaded from: classes.dex */
public class ef0 extends df0 {
    public w40<Integer> c;
    public h0 d;
    public h0 e;
    public w40<Bitmap> f;

    /* loaded from: classes.dex */
    public class a implements jr1.b<Bitmap> {
        public a() {
        }

        @Override // com.daaw.jr1.b
        /* renamed from: b */
        public Bitmap a() {
            return (Bitmap) ef0.this.f.a();
        }
    }

    /* loaded from: classes.dex */
    public class b implements jr1.a<Bitmap> {
        public b() {
        }

        @Override // com.daaw.jr1.a
        /* renamed from: b */
        public void a(Bitmap bitmap) {
        }
    }

    public ef0(Bitmap bitmap, w40<Integer> w40Var, h0 h0Var, h0 h0Var2, w40<Bitmap> w40Var2, h0 h0Var3) {
        super(bitmap, h0Var3);
        this.c = w40Var;
        this.d = h0Var;
        this.e = h0Var2;
        this.f = w40Var2;
    }

    @Override // com.daaw.df0
    public void a() {
        this.e.a();
    }

    @Override // com.daaw.df0
    public int d() {
        return this.c.a().intValue();
    }

    @Override // com.daaw.df0
    public jr1<Bitmap> e() {
        jr1<Bitmap> jr1Var = new jr1<>(new a());
        jr1Var.a(new b());
        return jr1Var;
    }

    @Override // com.daaw.df0
    public void h() {
        this.d.a();
    }
}
