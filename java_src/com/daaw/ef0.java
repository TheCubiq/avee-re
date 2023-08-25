package com.daaw;

import android.graphics.Bitmap;
import com.daaw.jr1;
/* loaded from: classes.dex */
public class ef0 extends df0 {

    /* renamed from: c */
    public w40<Integer> f8436c;

    /* renamed from: d */
    public InterfaceC1492h0 f8437d;

    /* renamed from: e */
    public InterfaceC1492h0 f8438e;

    /* renamed from: f */
    public w40<Bitmap> f8439f;

    /* renamed from: com.daaw.ef0$a */
    /* loaded from: classes.dex */
    public class C1181a implements jr1.InterfaceC1858b<Bitmap> {
        public C1181a() {
        }

        @Override // com.daaw.jr1.InterfaceC1858b
        /* renamed from: b */
        public Bitmap mo18314a() {
            return (Bitmap) ef0.this.f8439f.mo3478a();
        }
    }

    /* renamed from: com.daaw.ef0$b */
    /* loaded from: classes.dex */
    public class C1182b implements jr1.InterfaceC1857a<Bitmap> {
        public C1182b() {
        }

        @Override // com.daaw.jr1.InterfaceC1857a
        /* renamed from: b */
        public void mo18315a(Bitmap bitmap) {
        }
    }

    public ef0(Bitmap bitmap, w40<Integer> w40Var, InterfaceC1492h0 interfaceC1492h0, InterfaceC1492h0 interfaceC1492h02, w40<Bitmap> w40Var2, InterfaceC1492h0 interfaceC1492h03) {
        super(bitmap, interfaceC1492h03);
        this.f8436c = w40Var;
        this.f8437d = interfaceC1492h0;
        this.f8438e = interfaceC1492h02;
        this.f8439f = w40Var2;
    }

    @Override // com.daaw.df0
    /* renamed from: a */
    public void mo23531a() {
        this.f8438e.mo3002a();
    }

    @Override // com.daaw.df0
    /* renamed from: d */
    public int mo23530d() {
        return this.f8436c.mo3478a().intValue();
    }

    @Override // com.daaw.df0
    /* renamed from: e */
    public jr1<Bitmap> mo23529e() {
        jr1<Bitmap> jr1Var = new jr1<>(new C1181a());
        jr1Var.m18318a(new C1182b());
        return jr1Var;
    }

    @Override // com.daaw.df0
    /* renamed from: h */
    public void mo23528h() {
        this.f8437d.mo3002a();
    }
}
