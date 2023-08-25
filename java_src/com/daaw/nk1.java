package com.daaw;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
/* loaded from: classes2.dex */
public class nk1 {

    /* renamed from: c */
    public float f20189c;

    /* renamed from: f */
    public ik1 f20192f;

    /* renamed from: a */
    public final TextPaint f20187a = new TextPaint(1);

    /* renamed from: b */
    public final kk1 f20188b = new C2305a();

    /* renamed from: d */
    public boolean f20190d = true;

    /* renamed from: e */
    public WeakReference<InterfaceC2306b> f20191e = new WeakReference<>(null);

    /* renamed from: com.daaw.nk1$a */
    /* loaded from: classes2.dex */
    public class C2305a extends kk1 {
        public C2305a() {
        }

        @Override // com.daaw.kk1
        /* renamed from: a */
        public void mo784a(int i) {
            nk1.this.f20190d = true;
            InterfaceC2306b interfaceC2306b = (InterfaceC2306b) nk1.this.f20191e.get();
            if (interfaceC2306b != null) {
                interfaceC2306b.mo691a();
            }
        }

        @Override // com.daaw.kk1
        /* renamed from: b */
        public void mo783b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            nk1.this.f20190d = true;
            InterfaceC2306b interfaceC2306b = (InterfaceC2306b) nk1.this.f20191e.get();
            if (interfaceC2306b != null) {
                interfaceC2306b.mo691a();
            }
        }
    }

    /* renamed from: com.daaw.nk1$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC2306b {
        /* renamed from: a */
        void mo691a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public nk1(InterfaceC2306b interfaceC2306b) {
        m15120g(interfaceC2306b);
    }

    /* renamed from: c */
    public final float m15124c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f20187a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public ik1 m15123d() {
        return this.f20192f;
    }

    /* renamed from: e */
    public TextPaint m15122e() {
        return this.f20187a;
    }

    /* renamed from: f */
    public float m15121f(String str) {
        if (this.f20190d) {
            float m15124c = m15124c(str);
            this.f20189c = m15124c;
            this.f20190d = false;
            return m15124c;
        }
        return this.f20189c;
    }

    /* renamed from: g */
    public void m15120g(InterfaceC2306b interfaceC2306b) {
        this.f20191e = new WeakReference<>(interfaceC2306b);
    }

    /* renamed from: h */
    public void m15119h(ik1 ik1Var, Context context) {
        if (this.f20192f != ik1Var) {
            this.f20192f = ik1Var;
            if (ik1Var != null) {
                ik1Var.m19732k(context, this.f20187a, this.f20188b);
                InterfaceC2306b interfaceC2306b = this.f20191e.get();
                if (interfaceC2306b != null) {
                    this.f20187a.drawableState = interfaceC2306b.getState();
                }
                ik1Var.m19733j(context, this.f20187a, this.f20188b);
                this.f20190d = true;
            }
            InterfaceC2306b interfaceC2306b2 = this.f20191e.get();
            if (interfaceC2306b2 != null) {
                interfaceC2306b2.mo691a();
                interfaceC2306b2.onStateChange(interfaceC2306b2.getState());
            }
        }
    }

    /* renamed from: i */
    public void m15118i(boolean z) {
        this.f20190d = z;
    }

    /* renamed from: j */
    public void m15117j(Context context) {
        this.f20192f.m19733j(context, this.f20187a, this.f20188b);
    }
}
