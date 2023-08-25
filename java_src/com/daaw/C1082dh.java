package com.daaw;

import com.daaw.InterfaceC2307nl;
import java.io.Serializable;
/* renamed from: com.daaw.dh */
/* loaded from: classes2.dex */
public final class C1082dh implements InterfaceC2307nl, Serializable {

    /* renamed from: p */
    public final InterfaceC2307nl f7053p;

    /* renamed from: q */
    public final InterfaceC2307nl.InterfaceC2310b f7054q;

    /* renamed from: com.daaw.dh$a */
    /* loaded from: classes2.dex */
    public static final class C1083a extends si0 implements n50<String, InterfaceC2307nl.InterfaceC2310b, String> {

        /* renamed from: q */
        public static final C1083a f7055q = new C1083a();

        public C1083a() {
            super(2);
        }

        @Override // com.daaw.n50
        /* renamed from: d */
        public final String mo15095c(String str, InterfaceC2307nl.InterfaceC2310b interfaceC2310b) {
            ug0.m8268f(str, "acc");
            ug0.m8268f(interfaceC2310b, "element");
            if (str.length() == 0) {
                return interfaceC2310b.toString();
            }
            return str + ", " + interfaceC2310b;
        }
    }

    public C1082dh(InterfaceC2307nl interfaceC2307nl, InterfaceC2307nl.InterfaceC2310b interfaceC2310b) {
        ug0.m8268f(interfaceC2307nl, "left");
        ug0.m8268f(interfaceC2310b, "element");
        this.f7053p = interfaceC2307nl;
        this.f7054q = interfaceC2310b;
    }

    /* renamed from: a */
    public final boolean m24417a(InterfaceC2307nl.InterfaceC2310b interfaceC2310b) {
        return ug0.m8273a(get(interfaceC2310b.getKey()), interfaceC2310b);
    }

    /* renamed from: b */
    public final boolean m24416b(C1082dh c1082dh) {
        while (m24417a(c1082dh.f7054q)) {
            InterfaceC2307nl interfaceC2307nl = c1082dh.f7053p;
            if (!(interfaceC2307nl instanceof C1082dh)) {
                ug0.m8270d(interfaceC2307nl, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m24417a((InterfaceC2307nl.InterfaceC2310b) interfaceC2307nl);
            }
            c1082dh = (C1082dh) interfaceC2307nl;
        }
        return false;
    }

    /* renamed from: c */
    public final int m24415c() {
        int i = 2;
        C1082dh c1082dh = this;
        while (true) {
            InterfaceC2307nl interfaceC2307nl = c1082dh.f7053p;
            c1082dh = interfaceC2307nl instanceof C1082dh ? (C1082dh) interfaceC2307nl : null;
            if (c1082dh == null) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1082dh) {
                C1082dh c1082dh = (C1082dh) obj;
                if (c1082dh.m24415c() != m24415c() || !c1082dh.m24416b(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.daaw.InterfaceC2307nl
    public <R> R fold(R r, n50<? super R, ? super InterfaceC2307nl.InterfaceC2310b, ? extends R> n50Var) {
        ug0.m8268f(n50Var, "operation");
        return n50Var.mo15095c((Object) this.f7053p.fold(r, n50Var), this.f7054q);
    }

    @Override // com.daaw.InterfaceC2307nl
    public <E extends InterfaceC2307nl.InterfaceC2310b> E get(InterfaceC2307nl.InterfaceC2312c<E> interfaceC2312c) {
        ug0.m8268f(interfaceC2312c, "key");
        C1082dh c1082dh = this;
        while (true) {
            E e = (E) c1082dh.f7054q.get(interfaceC2312c);
            if (e != null) {
                return e;
            }
            InterfaceC2307nl interfaceC2307nl = c1082dh.f7053p;
            if (!(interfaceC2307nl instanceof C1082dh)) {
                return (E) interfaceC2307nl.get(interfaceC2312c);
            }
            c1082dh = (C1082dh) interfaceC2307nl;
        }
    }

    public int hashCode() {
        return this.f7053p.hashCode() + this.f7054q.hashCode();
    }

    @Override // com.daaw.InterfaceC2307nl
    public InterfaceC2307nl minusKey(InterfaceC2307nl.InterfaceC2312c<?> interfaceC2312c) {
        ug0.m8268f(interfaceC2312c, "key");
        if (this.f7054q.get(interfaceC2312c) != null) {
            return this.f7053p;
        }
        InterfaceC2307nl minusKey = this.f7053p.minusKey(interfaceC2312c);
        return minusKey == this.f7053p ? this : minusKey == C2215mw.f19172p ? this.f7054q : new C1082dh(minusKey, this.f7054q);
    }

    public String toString() {
        return '[' + ((String) fold("", C1083a.f7055q)) + ']';
    }
}
