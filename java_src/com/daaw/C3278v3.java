package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
/* renamed from: com.daaw.v3 */
/* loaded from: classes.dex */
public class C3278v3 {

    /* renamed from: a */
    public final CheckedTextView f29791a;

    /* renamed from: b */
    public ColorStateList f29792b = null;

    /* renamed from: c */
    public PorterDuff.Mode f29793c = null;

    /* renamed from: d */
    public boolean f29794d = false;

    /* renamed from: e */
    public boolean f29795e = false;

    /* renamed from: f */
    public boolean f29796f;

    public C3278v3(CheckedTextView checkedTextView) {
        this.f29791a = checkedTextView;
    }

    /* renamed from: a */
    public void m7538a() {
        Drawable m3840a = C3695ye.m3840a(this.f29791a);
        if (m3840a != null) {
            if (this.f29794d || this.f29795e) {
                Drawable mutate = C2366nu.m14809r(m3840a).mutate();
                if (this.f29794d) {
                    C2366nu.m14812o(mutate, this.f29792b);
                }
                if (this.f29795e) {
                    C2366nu.m14811p(mutate, this.f29793c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f29791a.getDrawableState());
                }
                this.f29791a.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* renamed from: b */
    public ColorStateList m7537b() {
        return this.f29792b;
    }

    /* renamed from: c */
    public PorterDuff.Mode m7536c() {
        return this.f29793c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m7535d(AttributeSet attributeSet, int i) {
        boolean z;
        int i2;
        int i3;
        int m8045n;
        int m8045n2;
        Context context = this.f29791a.getContext();
        int[] iArr = x21.f31834P0;
        ul1 m8037v = ul1.m8037v(context, attributeSet, iArr, i, 0);
        CheckedTextView checkedTextView = this.f29791a;
        xs1.m4706p0(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, m8037v.m8041r(), i, 0);
        try {
            int i4 = x21.f31844R0;
            if (m8037v.m8040s(i4) && (m8045n2 = m8037v.m8045n(i4, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f29791a;
                    checkedTextView2.setCheckMarkDrawable(C2818r4.m11783b(checkedTextView2.getContext(), m8045n2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                }
                if (!z) {
                    int i5 = x21.f31839Q0;
                    if (m8037v.m8040s(i5) && (m8045n = m8037v.m8045n(i5, 0)) != 0) {
                        CheckedTextView checkedTextView3 = this.f29791a;
                        checkedTextView3.setCheckMarkDrawable(C2818r4.m11783b(checkedTextView3.getContext(), m8045n));
                    }
                }
                i2 = x21.f31849S0;
                if (m8037v.m8040s(i2)) {
                    C3695ye.m3839b(this.f29791a, m8037v.m8056c(i2));
                }
                i3 = x21.f31854T0;
                if (m8037v.m8040s(i3)) {
                    C3695ye.m3838c(this.f29791a, C3373vu.m6785e(m8037v.m8048k(i3, -1), null));
                }
            }
            z = false;
            if (!z) {
            }
            i2 = x21.f31849S0;
            if (m8037v.m8040s(i2)) {
            }
            i3 = x21.f31854T0;
            if (m8037v.m8040s(i3)) {
            }
        } finally {
            m8037v.m8036w();
        }
    }

    /* renamed from: e */
    public void m7534e() {
        if (this.f29796f) {
            this.f29796f = false;
            return;
        }
        this.f29796f = true;
        m7538a();
    }

    /* renamed from: f */
    public void m7533f(ColorStateList colorStateList) {
        this.f29792b = colorStateList;
        this.f29794d = true;
        m7538a();
    }

    /* renamed from: g */
    public void m7532g(PorterDuff.Mode mode) {
        this.f29793c = mode;
        this.f29795e = true;
        m7538a();
    }
}
