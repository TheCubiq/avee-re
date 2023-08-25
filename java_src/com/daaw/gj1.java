package com.daaw;

import android.view.View;
/* loaded from: classes.dex */
public abstract class gj1 {

    /* renamed from: d */
    public static InterfaceC1427b f11358d = new C1426a();

    /* renamed from: a */
    public View f11359a;

    /* renamed from: b */
    public int f11360b;

    /* renamed from: c */
    public InterfaceC1427b f11361c = f11358d;

    /* renamed from: com.daaw.gj1$a */
    /* loaded from: classes.dex */
    public class C1426a implements InterfaceC1427b {
        @Override // com.daaw.gj1.InterfaceC1427b
        /* renamed from: a */
        public void mo14171a(boolean z) {
        }
    }

    /* renamed from: com.daaw.gj1$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1427b {
        /* renamed from: a */
        void mo14171a(boolean z);
    }

    public gj1(View view, int i) {
        this.f11359a = view;
        this.f11360b = i;
    }

    /* renamed from: a */
    public abstract void mo19755a();

    /* renamed from: b */
    public void m21566b(InterfaceC1427b interfaceC1427b) {
        if (interfaceC1427b == null) {
            interfaceC1427b = f11358d;
        }
        this.f11361c = interfaceC1427b;
    }

    /* renamed from: c */
    public abstract void mo19754c();

    /* renamed from: d */
    public abstract void mo19753d();
}
