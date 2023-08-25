package com.daaw;

import android.net.Uri;
import com.daaw.jk0;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class vv0<T> implements jk0.InterfaceC1836c {

    /* renamed from: a */
    public final C2570pp f30638a;

    /* renamed from: b */
    public final int f30639b;

    /* renamed from: c */
    public final InterfaceC2200mp f30640c;

    /* renamed from: d */
    public final InterfaceC3379a<? extends T> f30641d;

    /* renamed from: e */
    public volatile T f30642e;

    /* renamed from: f */
    public volatile long f30643f;

    /* renamed from: com.daaw.vv0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3379a<T> {
        /* renamed from: a */
        T mo3834a(Uri uri, InputStream inputStream);
    }

    public vv0(InterfaceC2200mp interfaceC2200mp, Uri uri, int i, InterfaceC3379a<? extends T> interfaceC3379a) {
        this(interfaceC2200mp, new C2570pp(uri, 3), i, interfaceC3379a);
    }

    public vv0(InterfaceC2200mp interfaceC2200mp, C2570pp c2570pp, int i, InterfaceC3379a<? extends T> interfaceC3379a) {
        this.f30640c = interfaceC2200mp;
        this.f30638a = c2570pp;
        this.f30639b = i;
        this.f30641d = interfaceC3379a;
    }

    @Override // com.daaw.jk0.InterfaceC1836c
    /* renamed from: a */
    public final void mo6740a() {
        C2464op c2464op = new C2464op(this.f30640c, this.f30638a);
        try {
            c2464op.m14113q();
            this.f30642e = this.f30641d.mo3834a(this.f30640c.mo8640d(), c2464op);
        } finally {
            this.f30643f = c2464op.m14115d();
            sq1.m10007i(c2464op);
        }
    }

    @Override // com.daaw.jk0.InterfaceC1836c
    /* renamed from: b */
    public final void mo6739b() {
    }

    /* renamed from: c */
    public long m6738c() {
        return this.f30643f;
    }

    /* renamed from: d */
    public final T m6737d() {
        return this.f30642e;
    }
}
