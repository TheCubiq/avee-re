package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* renamed from: com.daaw.c */
/* loaded from: classes.dex */
public abstract class AbstractC0901c implements InterfaceC0841bh {

    /* renamed from: a */
    public C0627ah f5306a;

    /* renamed from: b */
    public List<C3073tg> f5307b = new ArrayList();

    @Override // com.daaw.InterfaceC0841bh
    /* renamed from: b */
    public C0627ah mo25714b() {
        if (this.f5306a == null) {
            this.f5306a = new C0627ah();
        }
        return this.f5306a;
    }

    @Override // com.daaw.InterfaceC0841bh
    /* renamed from: c */
    public void mo25713c(C0627ah c0627ah) {
        this.f5306a = c0627ah;
        this.f5307b.clear();
    }

    @Override // com.daaw.InterfaceC0841bh
    /* renamed from: d */
    public List<C3073tg> mo25712d() {
        return this.f5307b;
    }

    /* renamed from: e */
    public int m25711e(float f, float f2) {
        return Math.max(1, (int) ((3.063052912151454d / Math.asin(f2 / f)) + 0.5d));
    }

    /* renamed from: f */
    public int m25710f() {
        return Math.round(this.f5306a.f3189e * 255.0f);
    }
}
