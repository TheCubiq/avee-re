package com.daaw;

import android.content.res.ColorStateList;
/* renamed from: com.daaw.ce */
/* loaded from: classes.dex */
public class C0948ce implements InterfaceC1273fe {
    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: a */
    public ColorStateList mo22766a(InterfaceC1179ee interfaceC1179ee) {
        return m25411n(interfaceC1179ee).m20995b();
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: b */
    public void mo22765b(InterfaceC1179ee interfaceC1179ee, float f) {
        m25411n(interfaceC1179ee).m20989h(f);
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: c */
    public float mo22764c(InterfaceC1179ee interfaceC1179ee) {
        return mo22761f(interfaceC1179ee) * 2.0f;
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: d */
    public void mo22763d(InterfaceC1179ee interfaceC1179ee, float f) {
        m25411n(interfaceC1179ee).m20990g(f, interfaceC1179ee.m23550d(), interfaceC1179ee.m23551c());
        m25410o(interfaceC1179ee);
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: e */
    public void mo22762e(InterfaceC1179ee interfaceC1179ee, ColorStateList colorStateList) {
        m25411n(interfaceC1179ee).m20991f(colorStateList);
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: f */
    public float mo22761f(InterfaceC1179ee interfaceC1179ee) {
        return m25411n(interfaceC1179ee).m20993d();
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: g */
    public float mo22760g(InterfaceC1179ee interfaceC1179ee) {
        return mo22761f(interfaceC1179ee) * 2.0f;
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: h */
    public void mo22759h() {
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: i */
    public void mo22758i(InterfaceC1179ee interfaceC1179ee) {
        mo22763d(interfaceC1179ee, mo22756k(interfaceC1179ee));
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: j */
    public float mo22757j(InterfaceC1179ee interfaceC1179ee) {
        return interfaceC1179ee.m23548f().getElevation();
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: k */
    public float mo22756k(InterfaceC1179ee interfaceC1179ee) {
        return m25411n(interfaceC1179ee).m20994c();
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: l */
    public void mo22755l(InterfaceC1179ee interfaceC1179ee, float f) {
        interfaceC1179ee.m23548f().setElevation(f);
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: m */
    public void mo22754m(InterfaceC1179ee interfaceC1179ee) {
        mo22763d(interfaceC1179ee, mo22756k(interfaceC1179ee));
    }

    /* renamed from: n */
    public final h61 m25411n(InterfaceC1179ee interfaceC1179ee) {
        return (h61) interfaceC1179ee.m23549e();
    }

    /* renamed from: o */
    public void m25410o(InterfaceC1179ee interfaceC1179ee) {
        if (!interfaceC1179ee.m23550d()) {
            interfaceC1179ee.m23553a(0, 0, 0, 0);
            return;
        }
        float mo22756k = mo22756k(interfaceC1179ee);
        float mo22761f = mo22761f(interfaceC1179ee);
        int ceil = (int) Math.ceil(i61.m20067c(mo22756k, mo22761f, interfaceC1179ee.m23551c()));
        int ceil2 = (int) Math.ceil(i61.m20066d(mo22756k, mo22761f, interfaceC1179ee.m23551c()));
        interfaceC1179ee.m23553a(ceil, ceil2, ceil, ceil2);
    }
}
