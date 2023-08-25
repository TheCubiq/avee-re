package com.daaw;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
/* renamed from: com.daaw.de */
/* loaded from: classes.dex */
public class C1076de implements InterfaceC1273fe {

    /* renamed from: a */
    public final RectF f6969a = new RectF();

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: a */
    public ColorStateList mo22766a(InterfaceC1179ee interfaceC1179ee) {
        return m24453n(interfaceC1179ee).m20064f();
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: b */
    public void mo22765b(InterfaceC1179ee interfaceC1179ee, float f) {
        m24453n(interfaceC1179ee).m20054p(f);
        m24452o(interfaceC1179ee);
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: c */
    public float mo22764c(InterfaceC1179ee interfaceC1179ee) {
        return m24453n(interfaceC1179ee).m20060j();
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: d */
    public void mo22763d(InterfaceC1179ee interfaceC1179ee, float f) {
        m24453n(interfaceC1179ee).m20053q(f);
        m24452o(interfaceC1179ee);
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: e */
    public void mo22762e(InterfaceC1179ee interfaceC1179ee, ColorStateList colorStateList) {
        m24453n(interfaceC1179ee).m20055o(colorStateList);
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: f */
    public float mo22761f(InterfaceC1179ee interfaceC1179ee) {
        return m24453n(interfaceC1179ee).m20063g();
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: g */
    public float mo22760g(InterfaceC1179ee interfaceC1179ee) {
        return m24453n(interfaceC1179ee).m20059k();
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: i */
    public void mo22758i(InterfaceC1179ee interfaceC1179ee) {
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: j */
    public float mo22757j(InterfaceC1179ee interfaceC1179ee) {
        return m24453n(interfaceC1179ee).m20058l();
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: k */
    public float mo22756k(InterfaceC1179ee interfaceC1179ee) {
        return m24453n(interfaceC1179ee).m20061i();
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: l */
    public void mo22755l(InterfaceC1179ee interfaceC1179ee, float f) {
        m24453n(interfaceC1179ee).m20052r(f);
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: m */
    public void mo22754m(InterfaceC1179ee interfaceC1179ee) {
        m24453n(interfaceC1179ee).m20057m(interfaceC1179ee.m23551c());
        m24452o(interfaceC1179ee);
    }

    /* renamed from: n */
    public final i61 m24453n(InterfaceC1179ee interfaceC1179ee) {
        return (i61) interfaceC1179ee.m23549e();
    }

    /* renamed from: o */
    public void m24452o(InterfaceC1179ee interfaceC1179ee) {
        Rect rect = new Rect();
        m24453n(interfaceC1179ee).m20062h(rect);
        interfaceC1179ee.m23552b((int) Math.ceil(mo22760g(interfaceC1179ee)), (int) Math.ceil(mo22764c(interfaceC1179ee)));
        interfaceC1179ee.m23553a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
