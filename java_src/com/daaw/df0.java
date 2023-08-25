package com.daaw;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public class df0 {

    /* renamed from: a */
    public Bitmap f7026a;

    /* renamed from: b */
    public InterfaceC1492h0 f7027b;

    public df0(Bitmap bitmap) {
        this.f7026a = bitmap;
        this.f7027b = null;
    }

    public df0(Bitmap bitmap, InterfaceC1492h0 interfaceC1492h0) {
        this.f7026a = bitmap;
        this.f7027b = interfaceC1492h0;
    }

    /* renamed from: c */
    public static void m24433c(df0 df0Var) {
        if (df0Var != null) {
            df0Var.m24434b();
        }
    }

    /* renamed from: g */
    public static Bitmap m24431g(df0 df0Var) {
        if (df0Var != null) {
            return df0Var.m24432f();
        }
        return null;
    }

    /* renamed from: a */
    public void mo23531a() {
    }

    /* renamed from: b */
    public void m24434b() {
        InterfaceC1492h0 interfaceC1492h0 = this.f7027b;
        if (interfaceC1492h0 != null) {
            interfaceC1492h0.mo3002a();
        }
    }

    /* renamed from: d */
    public int mo23530d() {
        return 1;
    }

    /* renamed from: e */
    public jr1<Bitmap> mo23529e() {
        return null;
    }

    /* renamed from: f */
    public final Bitmap m24432f() {
        return this.f7026a;
    }

    /* renamed from: h */
    public void mo23528h() {
    }
}
