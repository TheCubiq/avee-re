package com.daaw;

import android.view.View;
/* loaded from: classes2.dex */
public class pt1 {

    /* renamed from: a */
    public final View f23258a;

    /* renamed from: b */
    public int f23259b;

    /* renamed from: c */
    public int f23260c;

    /* renamed from: d */
    public int f23261d;

    /* renamed from: e */
    public int f23262e;

    /* renamed from: f */
    public boolean f23263f = true;

    /* renamed from: g */
    public boolean f23264g = true;

    public pt1(View view) {
        this.f23258a = view;
    }

    /* renamed from: a */
    public void m13154a() {
        View view = this.f23258a;
        xs1.m4732c0(view, this.f23261d - (view.getTop() - this.f23259b));
        View view2 = this.f23258a;
        xs1.m4734b0(view2, this.f23262e - (view2.getLeft() - this.f23260c));
    }

    /* renamed from: b */
    public int m13153b() {
        return this.f23261d;
    }

    /* renamed from: c */
    public void m13152c() {
        this.f23259b = this.f23258a.getTop();
        this.f23260c = this.f23258a.getLeft();
    }

    /* renamed from: d */
    public boolean m13151d(int i) {
        if (!this.f23264g || this.f23262e == i) {
            return false;
        }
        this.f23262e = i;
        m13154a();
        return true;
    }

    /* renamed from: e */
    public boolean m13150e(int i) {
        if (!this.f23263f || this.f23261d == i) {
            return false;
        }
        this.f23261d = i;
        m13154a();
        return true;
    }
}
