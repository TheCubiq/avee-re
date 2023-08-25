package com.daaw;

import android.graphics.Typeface;
/* renamed from: com.daaw.sd */
/* loaded from: classes2.dex */
public final class C2932sd extends kk1 {

    /* renamed from: a */
    public final Typeface f26081a;

    /* renamed from: b */
    public final InterfaceC2933a f26082b;

    /* renamed from: c */
    public boolean f26083c;

    /* renamed from: com.daaw.sd$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC2933a {
        /* renamed from: a */
        void mo10454a(Typeface typeface);
    }

    public C2932sd(InterfaceC2933a interfaceC2933a, Typeface typeface) {
        this.f26081a = typeface;
        this.f26082b = interfaceC2933a;
    }

    @Override // com.daaw.kk1
    /* renamed from: a */
    public void mo784a(int i) {
        m10455d(this.f26081a);
    }

    @Override // com.daaw.kk1
    /* renamed from: b */
    public void mo783b(Typeface typeface, boolean z) {
        m10455d(typeface);
    }

    /* renamed from: c */
    public void m10456c() {
        this.f26083c = true;
    }

    /* renamed from: d */
    public final void m10455d(Typeface typeface) {
        if (this.f26083c) {
            return;
        }
        this.f26082b.mo10454a(typeface);
    }
}
