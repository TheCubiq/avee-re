package com.daaw;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
/* renamed from: com.daaw.w3 */
/* loaded from: classes.dex */
public class C3396w3 {

    /* renamed from: a */
    public final CompoundButton f30851a;

    /* renamed from: b */
    public ColorStateList f30852b = null;

    /* renamed from: c */
    public PorterDuff.Mode f30853c = null;

    /* renamed from: d */
    public boolean f30854d = false;

    /* renamed from: e */
    public boolean f30855e = false;

    /* renamed from: f */
    public boolean f30856f;

    public C3396w3(CompoundButton compoundButton) {
        this.f30851a = compoundButton;
    }

    /* renamed from: a */
    public void m6566a() {
        Drawable m3734a = C3708yi.m3734a(this.f30851a);
        if (m3734a != null) {
            if (this.f30854d || this.f30855e) {
                Drawable mutate = C2366nu.m14809r(m3734a).mutate();
                if (this.f30854d) {
                    C2366nu.m14812o(mutate, this.f30852b);
                }
                if (this.f30855e) {
                    C2366nu.m14811p(mutate, this.f30853c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f30851a.getDrawableState());
                }
                this.f30851a.setButtonDrawable(mutate);
            }
        }
    }

    /* renamed from: b */
    public int m6565b(int i) {
        return i;
    }

    /* renamed from: c */
    public ColorStateList m6564c() {
        return this.f30852b;
    }

    /* renamed from: d */
    public PorterDuff.Mode m6563d() {
        return this.f30853c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m6562e(AttributeSet attributeSet, int i) {
        boolean z;
        int i2;
        int i3;
        int m8045n;
        int m8045n2;
        Context context = this.f30851a.getContext();
        int[] iArr = x21.f31859U0;
        ul1 m8037v = ul1.m8037v(context, attributeSet, iArr, i, 0);
        CompoundButton compoundButton = this.f30851a;
        xs1.m4706p0(compoundButton, compoundButton.getContext(), iArr, attributeSet, m8037v.m8041r(), i, 0);
        try {
            int i4 = x21.f31867W0;
            if (m8037v.m8040s(i4) && (m8045n2 = m8037v.m8045n(i4, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f30851a;
                    compoundButton2.setButtonDrawable(C2818r4.m11783b(compoundButton2.getContext(), m8045n2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                }
                if (!z) {
                    int i5 = x21.f31863V0;
                    if (m8037v.m8040s(i5) && (m8045n = m8037v.m8045n(i5, 0)) != 0) {
                        CompoundButton compoundButton3 = this.f30851a;
                        compoundButton3.setButtonDrawable(C2818r4.m11783b(compoundButton3.getContext(), m8045n));
                    }
                }
                i2 = x21.f31871X0;
                if (m8037v.m8040s(i2)) {
                    C3708yi.m3732c(this.f30851a, m8037v.m8056c(i2));
                }
                i3 = x21.f31875Y0;
                if (m8037v.m8040s(i3)) {
                    C3708yi.m3731d(this.f30851a, C3373vu.m6785e(m8037v.m8048k(i3, -1), null));
                }
            }
            z = false;
            if (!z) {
            }
            i2 = x21.f31871X0;
            if (m8037v.m8040s(i2)) {
            }
            i3 = x21.f31875Y0;
            if (m8037v.m8040s(i3)) {
            }
        } finally {
            m8037v.m8036w();
        }
    }

    /* renamed from: f */
    public void m6561f() {
        if (this.f30856f) {
            this.f30856f = false;
            return;
        }
        this.f30856f = true;
        m6566a();
    }

    /* renamed from: g */
    public void m6560g(ColorStateList colorStateList) {
        this.f30852b = colorStateList;
        this.f30854d = true;
        m6566a();
    }

    /* renamed from: h */
    public void m6559h(PorterDuff.Mode mode) {
        this.f30853c = mode;
        this.f30855e = true;
        m6566a();
    }
}
