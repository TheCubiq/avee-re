package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class kr7 implements iu7 {

    /* renamed from: a */
    public final jr7 f16715a;

    /* renamed from: b */
    public int f16716b;

    /* renamed from: c */
    public int f16717c;

    /* renamed from: d */
    public int f16718d = 0;

    public kr7(jr7 jr7Var) {
        vs7.m6815f(jr7Var, "input");
        this.f16715a = jr7Var;
        jr7Var.f15358c = this;
    }

    /* renamed from: A */
    public static kr7 m17478A(jr7 jr7Var) {
        kr7 kr7Var = jr7Var.f15358c;
        return kr7Var != null ? kr7Var : new kr7(jr7Var);
    }

    /* renamed from: y */
    public static final void m17453y(int i) {
        if ((i & 3) != 0) {
            throw xs7.m4537g();
        }
    }

    /* renamed from: z */
    public static final void m17452z(int i) {
        if ((i & 7) != 0) {
            throw xs7.m4537g();
        }
    }

    @Override // com.daaw.iu7
    @Deprecated
    /* renamed from: a */
    public final void mo17477a(List list, cv7 cv7Var, vr7 vr7Var) {
        int mo18288r;
        int i = this.f16716b;
        if ((i & 7) != 3) {
            throw xs7.m4543a();
        }
        do {
            Object zze = cv7Var.zze();
            m17457u(zze, cv7Var, vr7Var);
            cv7Var.mo24960b(zze);
            list.add(zze);
            if (this.f16715a.mo18304b() || this.f16718d != 0) {
                return;
            }
            mo18288r = this.f16715a.mo18288r();
        } while (mo18288r == i);
        this.f16718d = mo18288r;
    }

    @Override // com.daaw.iu7
    /* renamed from: b */
    public final void mo17476b(List list) {
        int mo18288r;
        int mo18288r2;
        if (!(list instanceof ms7)) {
            int i = this.f16716b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.f16715a.mo18293m()));
                    if (this.f16715a.mo18304b()) {
                        return;
                    }
                    mo18288r = this.f16715a.mo18288r();
                } while (mo18288r == this.f16716b);
                this.f16718d = mo18288r;
                return;
            } else if (i != 2) {
                throw xs7.m4543a();
            } else {
                int mo18295k = this.f16715a.mo18295k() + this.f16715a.mo18287s();
                do {
                    list.add(Integer.valueOf(this.f16715a.mo18293m()));
                } while (this.f16715a.mo18295k() < mo18295k);
                m17455w(mo18295k);
                return;
            }
        }
        ms7 ms7Var = (ms7) list;
        int i2 = this.f16716b & 7;
        if (i2 == 0) {
            do {
                ms7Var.mo12226i(this.f16715a.mo18293m());
                if (this.f16715a.mo18304b()) {
                    return;
                }
                mo18288r2 = this.f16715a.mo18288r();
            } while (mo18288r2 == this.f16716b);
            this.f16718d = mo18288r2;
        } else if (i2 != 2) {
            throw xs7.m4543a();
        } else {
            int mo18295k2 = this.f16715a.mo18295k() + this.f16715a.mo18287s();
            do {
                ms7Var.mo12226i(this.f16715a.mo18293m());
            } while (this.f16715a.mo18295k() < mo18295k2);
            m17455w(mo18295k2);
        }
    }

    @Override // com.daaw.iu7
    /* renamed from: c */
    public final void mo17475c(List list) {
        int mo18288r;
        int mo18288r2;
        if (!(list instanceof mt7)) {
            int i = this.f16716b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.f16715a.mo18285u()));
                    if (this.f16715a.mo18304b()) {
                        return;
                    }
                    mo18288r = this.f16715a.mo18288r();
                } while (mo18288r == this.f16716b);
                this.f16718d = mo18288r;
                return;
            } else if (i != 2) {
                throw xs7.m4543a();
            } else {
                int mo18295k = this.f16715a.mo18295k() + this.f16715a.mo18287s();
                do {
                    list.add(Long.valueOf(this.f16715a.mo18285u()));
                } while (this.f16715a.mo18295k() < mo18295k);
                m17455w(mo18295k);
                return;
            }
        }
        mt7 mt7Var = (mt7) list;
        int i2 = this.f16716b & 7;
        if (i2 == 0) {
            do {
                mt7Var.m15767h(this.f16715a.mo18285u());
                if (this.f16715a.mo18304b()) {
                    return;
                }
                mo18288r2 = this.f16715a.mo18288r();
            } while (mo18288r2 == this.f16716b);
            this.f16718d = mo18288r2;
        } else if (i2 != 2) {
            throw xs7.m4543a();
        } else {
            int mo18295k2 = this.f16715a.mo18295k() + this.f16715a.mo18287s();
            do {
                mt7Var.m15767h(this.f16715a.mo18285u());
            } while (this.f16715a.mo18295k() < mo18295k2);
            m17455w(mo18295k2);
        }
    }

    @Override // com.daaw.iu7
    /* renamed from: d */
    public final void mo17474d(List list) {
        int mo18288r;
        int mo18288r2;
        if (!(list instanceof mt7)) {
            int i = this.f16716b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.f16715a.mo18282x()));
                    if (this.f16715a.mo18304b()) {
                        return;
                    }
                    mo18288r = this.f16715a.mo18288r();
                } while (mo18288r == this.f16716b);
                this.f16718d = mo18288r;
                return;
            } else if (i != 2) {
                throw xs7.m4543a();
            } else {
                int mo18295k = this.f16715a.mo18295k() + this.f16715a.mo18287s();
                do {
                    list.add(Long.valueOf(this.f16715a.mo18282x()));
                } while (this.f16715a.mo18295k() < mo18295k);
                m17455w(mo18295k);
                return;
            }
        }
        mt7 mt7Var = (mt7) list;
        int i2 = this.f16716b & 7;
        if (i2 == 0) {
            do {
                mt7Var.m15767h(this.f16715a.mo18282x());
                if (this.f16715a.mo18304b()) {
                    return;
                }
                mo18288r2 = this.f16715a.mo18288r();
            } while (mo18288r2 == this.f16716b);
            this.f16718d = mo18288r2;
        } else if (i2 != 2) {
            throw xs7.m4543a();
        } else {
            int mo18295k2 = this.f16715a.mo18295k() + this.f16715a.mo18287s();
            do {
                mt7Var.m15767h(this.f16715a.mo18282x());
            } while (this.f16715a.mo18295k() < mo18295k2);
            m17455w(mo18295k2);
        }
    }

    @Override // com.daaw.iu7
    /* renamed from: e */
    public final void mo17473e(List list) {
        int mo18288r;
        int mo18288r2;
        if (!(list instanceof sr7)) {
            int i = this.f16716b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(this.f16715a.mo18297i()));
                    if (this.f16715a.mo18304b()) {
                        return;
                    }
                    mo18288r = this.f16715a.mo18288r();
                } while (mo18288r == this.f16716b);
                this.f16718d = mo18288r;
                return;
            } else if (i != 2) {
                throw xs7.m4543a();
            } else {
                int mo18287s = this.f16715a.mo18287s();
                m17452z(mo18287s);
                int mo18295k = this.f16715a.mo18295k() + mo18287s;
                do {
                    list.add(Double.valueOf(this.f16715a.mo18297i()));
                } while (this.f16715a.mo18295k() < mo18295k);
                return;
            }
        }
        sr7 sr7Var = (sr7) list;
        int i2 = this.f16716b & 7;
        if (i2 == 1) {
            do {
                sr7Var.m9934e(this.f16715a.mo18297i());
                if (this.f16715a.mo18304b()) {
                    return;
                }
                mo18288r2 = this.f16715a.mo18288r();
            } while (mo18288r2 == this.f16716b);
            this.f16718d = mo18288r2;
        } else if (i2 != 2) {
            throw xs7.m4543a();
        } else {
            int mo18287s2 = this.f16715a.mo18287s();
            m17452z(mo18287s2);
            int mo18295k2 = this.f16715a.mo18295k() + mo18287s2;
            do {
                sr7Var.m9934e(this.f16715a.mo18297i());
            } while (this.f16715a.mo18295k() < mo18295k2);
        }
    }

    @Override // com.daaw.iu7
    /* renamed from: f */
    public final void mo17472f(List list) {
        int mo18288r;
        if ((this.f16716b & 7) != 2) {
            throw xs7.m4543a();
        }
        do {
            list.add(zzp());
            if (this.f16715a.mo18304b()) {
                return;
            }
            mo18288r = this.f16715a.mo18288r();
        } while (mo18288r == this.f16716b);
        this.f16718d = mo18288r;
    }

    @Override // com.daaw.iu7
    /* renamed from: g */
    public final void mo17471g(List list) {
        int mo18288r;
        int mo18288r2;
        if (!(list instanceof ms7)) {
            int i = this.f16716b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.f16715a.mo18291o()));
                    if (this.f16715a.mo18304b()) {
                        return;
                    }
                    mo18288r = this.f16715a.mo18288r();
                } while (mo18288r == this.f16716b);
                this.f16718d = mo18288r;
                return;
            } else if (i != 2) {
                throw xs7.m4543a();
            } else {
                int mo18295k = this.f16715a.mo18295k() + this.f16715a.mo18287s();
                do {
                    list.add(Integer.valueOf(this.f16715a.mo18291o()));
                } while (this.f16715a.mo18295k() < mo18295k);
                m17455w(mo18295k);
                return;
            }
        }
        ms7 ms7Var = (ms7) list;
        int i2 = this.f16716b & 7;
        if (i2 == 0) {
            do {
                ms7Var.mo12226i(this.f16715a.mo18291o());
                if (this.f16715a.mo18304b()) {
                    return;
                }
                mo18288r2 = this.f16715a.mo18288r();
            } while (mo18288r2 == this.f16716b);
            this.f16718d = mo18288r2;
        } else if (i2 != 2) {
            throw xs7.m4543a();
        } else {
            int mo18295k2 = this.f16715a.mo18295k() + this.f16715a.mo18287s();
            do {
                ms7Var.mo12226i(this.f16715a.mo18291o());
            } while (this.f16715a.mo18295k() < mo18295k2);
            m17455w(mo18295k2);
        }
    }

    @Override // com.daaw.iu7
    /* renamed from: h */
    public final void mo17470h(Object obj, cv7 cv7Var, vr7 vr7Var) {
        m17454x(3);
        m17457u(obj, cv7Var, vr7Var);
    }

    @Override // com.daaw.iu7
    /* renamed from: i */
    public final void mo17469i(List list) {
        int mo18288r;
        int mo18288r2;
        if (!(list instanceof mt7)) {
            int i = this.f16716b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.f16715a.mo18284v()));
                    if (this.f16715a.mo18304b()) {
                        return;
                    }
                    mo18288r = this.f16715a.mo18288r();
                } while (mo18288r == this.f16716b);
                this.f16718d = mo18288r;
                return;
            } else if (i != 2) {
                throw xs7.m4543a();
            } else {
                int mo18287s = this.f16715a.mo18287s();
                m17452z(mo18287s);
                int mo18295k = this.f16715a.mo18295k() + mo18287s;
                do {
                    list.add(Long.valueOf(this.f16715a.mo18284v()));
                } while (this.f16715a.mo18295k() < mo18295k);
                return;
            }
        }
        mt7 mt7Var = (mt7) list;
        int i2 = this.f16716b & 7;
        if (i2 == 1) {
            do {
                mt7Var.m15767h(this.f16715a.mo18284v());
                if (this.f16715a.mo18304b()) {
                    return;
                }
                mo18288r2 = this.f16715a.mo18288r();
            } while (mo18288r2 == this.f16716b);
            this.f16718d = mo18288r2;
        } else if (i2 != 2) {
            throw xs7.m4543a();
        } else {
            int mo18287s2 = this.f16715a.mo18287s();
            m17452z(mo18287s2);
            int mo18295k2 = this.f16715a.mo18295k() + mo18287s2;
            do {
                mt7Var.m15767h(this.f16715a.mo18284v());
            } while (this.f16715a.mo18295k() < mo18295k2);
        }
    }

    @Override // com.daaw.iu7
    /* renamed from: j */
    public final void mo17468j(List list) {
        int mo18288r;
        int mo18288r2;
        if (!(list instanceof ms7)) {
            int i = this.f16716b & 7;
            if (i == 2) {
                int mo18287s = this.f16715a.mo18287s();
                m17453y(mo18287s);
                int mo18295k = this.f16715a.mo18295k() + mo18287s;
                do {
                    list.add(Integer.valueOf(this.f16715a.mo18290p()));
                } while (this.f16715a.mo18295k() < mo18295k);
                return;
            } else if (i != 5) {
                throw xs7.m4543a();
            } else {
                do {
                    list.add(Integer.valueOf(this.f16715a.mo18290p()));
                    if (this.f16715a.mo18304b()) {
                        return;
                    }
                    mo18288r = this.f16715a.mo18288r();
                } while (mo18288r == this.f16716b);
                this.f16718d = mo18288r;
                return;
            }
        }
        ms7 ms7Var = (ms7) list;
        int i2 = this.f16716b & 7;
        if (i2 == 2) {
            int mo18287s2 = this.f16715a.mo18287s();
            m17453y(mo18287s2);
            int mo18295k2 = this.f16715a.mo18295k() + mo18287s2;
            do {
                ms7Var.mo12226i(this.f16715a.mo18290p());
            } while (this.f16715a.mo18295k() < mo18295k2);
        } else if (i2 != 5) {
            throw xs7.m4543a();
        } else {
            do {
                ms7Var.mo12226i(this.f16715a.mo18290p());
                if (this.f16715a.mo18304b()) {
                    return;
                }
                mo18288r2 = this.f16715a.mo18288r();
            } while (mo18288r2 == this.f16716b);
            this.f16718d = mo18288r2;
        }
    }

    @Override // com.daaw.iu7
    /* renamed from: k */
    public final void mo17467k(Object obj, cv7 cv7Var, vr7 vr7Var) {
        m17454x(2);
        m17456v(obj, cv7Var, vr7Var);
    }

    @Override // com.daaw.iu7
    /* renamed from: l */
    public final void mo17466l(List list) {
        int mo18288r;
        int mo18288r2;
        if (!(list instanceof ms7)) {
            int i = this.f16716b & 7;
            if (i == 2) {
                int mo18287s = this.f16715a.mo18287s();
                m17453y(mo18287s);
                int mo18295k = this.f16715a.mo18295k() + mo18287s;
                do {
                    list.add(Integer.valueOf(this.f16715a.mo18292n()));
                } while (this.f16715a.mo18295k() < mo18295k);
                return;
            } else if (i != 5) {
                throw xs7.m4543a();
            } else {
                do {
                    list.add(Integer.valueOf(this.f16715a.mo18292n()));
                    if (this.f16715a.mo18304b()) {
                        return;
                    }
                    mo18288r = this.f16715a.mo18288r();
                } while (mo18288r == this.f16716b);
                this.f16718d = mo18288r;
                return;
            }
        }
        ms7 ms7Var = (ms7) list;
        int i2 = this.f16716b & 7;
        if (i2 == 2) {
            int mo18287s2 = this.f16715a.mo18287s();
            m17453y(mo18287s2);
            int mo18295k2 = this.f16715a.mo18295k() + mo18287s2;
            do {
                ms7Var.mo12226i(this.f16715a.mo18292n());
            } while (this.f16715a.mo18295k() < mo18295k2);
        } else if (i2 != 5) {
            throw xs7.m4543a();
        } else {
            do {
                ms7Var.mo12226i(this.f16715a.mo18292n());
                if (this.f16715a.mo18304b()) {
                    return;
                }
                mo18288r2 = this.f16715a.mo18288r();
            } while (mo18288r2 == this.f16716b);
            this.f16718d = mo18288r2;
        }
    }

    @Override // com.daaw.iu7
    /* renamed from: m */
    public final void mo17465m(List list) {
        int mo18288r;
        int mo18288r2;
        if (!(list instanceof mt7)) {
            int i = this.f16716b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.f16715a.mo18283w()));
                    if (this.f16715a.mo18304b()) {
                        return;
                    }
                    mo18288r = this.f16715a.mo18288r();
                } while (mo18288r == this.f16716b);
                this.f16718d = mo18288r;
                return;
            } else if (i != 2) {
                throw xs7.m4543a();
            } else {
                int mo18295k = this.f16715a.mo18295k() + this.f16715a.mo18287s();
                do {
                    list.add(Long.valueOf(this.f16715a.mo18283w()));
                } while (this.f16715a.mo18295k() < mo18295k);
                m17455w(mo18295k);
                return;
            }
        }
        mt7 mt7Var = (mt7) list;
        int i2 = this.f16716b & 7;
        if (i2 == 0) {
            do {
                mt7Var.m15767h(this.f16715a.mo18283w());
                if (this.f16715a.mo18304b()) {
                    return;
                }
                mo18288r2 = this.f16715a.mo18288r();
            } while (mo18288r2 == this.f16716b);
            this.f16718d = mo18288r2;
        } else if (i2 != 2) {
            throw xs7.m4543a();
        } else {
            int mo18295k2 = this.f16715a.mo18295k() + this.f16715a.mo18287s();
            do {
                mt7Var.m15767h(this.f16715a.mo18283w());
            } while (this.f16715a.mo18295k() < mo18295k2);
            m17455w(mo18295k2);
        }
    }

    @Override // com.daaw.iu7
    /* renamed from: n */
    public final void mo17464n(List list) {
        int mo18288r;
        int mo18288r2;
        if (!(list instanceof mt7)) {
            int i = this.f16716b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.f16715a.mo18286t()));
                    if (this.f16715a.mo18304b()) {
                        return;
                    }
                    mo18288r = this.f16715a.mo18288r();
                } while (mo18288r == this.f16716b);
                this.f16718d = mo18288r;
                return;
            } else if (i != 2) {
                throw xs7.m4543a();
            } else {
                int mo18287s = this.f16715a.mo18287s();
                m17452z(mo18287s);
                int mo18295k = this.f16715a.mo18295k() + mo18287s;
                do {
                    list.add(Long.valueOf(this.f16715a.mo18286t()));
                } while (this.f16715a.mo18295k() < mo18295k);
                return;
            }
        }
        mt7 mt7Var = (mt7) list;
        int i2 = this.f16716b & 7;
        if (i2 == 1) {
            do {
                mt7Var.m15767h(this.f16715a.mo18286t());
                if (this.f16715a.mo18304b()) {
                    return;
                }
                mo18288r2 = this.f16715a.mo18288r();
            } while (mo18288r2 == this.f16716b);
            this.f16718d = mo18288r2;
        } else if (i2 != 2) {
            throw xs7.m4543a();
        } else {
            int mo18287s2 = this.f16715a.mo18287s();
            m17452z(mo18287s2);
            int mo18295k2 = this.f16715a.mo18295k() + mo18287s2;
            do {
                mt7Var.m15767h(this.f16715a.mo18286t());
            } while (this.f16715a.mo18295k() < mo18295k2);
        }
    }

    @Override // com.daaw.iu7
    /* renamed from: o */
    public final void mo17463o(List list) {
        int mo18288r;
        int mo18288r2;
        if (!(list instanceof ms7)) {
            int i = this.f16716b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.f16715a.mo18289q()));
                    if (this.f16715a.mo18304b()) {
                        return;
                    }
                    mo18288r = this.f16715a.mo18288r();
                } while (mo18288r == this.f16716b);
                this.f16718d = mo18288r;
                return;
            } else if (i != 2) {
                throw xs7.m4543a();
            } else {
                int mo18295k = this.f16715a.mo18295k() + this.f16715a.mo18287s();
                do {
                    list.add(Integer.valueOf(this.f16715a.mo18289q()));
                } while (this.f16715a.mo18295k() < mo18295k);
                m17455w(mo18295k);
                return;
            }
        }
        ms7 ms7Var = (ms7) list;
        int i2 = this.f16716b & 7;
        if (i2 == 0) {
            do {
                ms7Var.mo12226i(this.f16715a.mo18289q());
                if (this.f16715a.mo18304b()) {
                    return;
                }
                mo18288r2 = this.f16715a.mo18288r();
            } while (mo18288r2 == this.f16716b);
            this.f16718d = mo18288r2;
        } else if (i2 != 2) {
            throw xs7.m4543a();
        } else {
            int mo18295k2 = this.f16715a.mo18295k() + this.f16715a.mo18287s();
            do {
                ms7Var.mo12226i(this.f16715a.mo18289q());
            } while (this.f16715a.mo18295k() < mo18295k2);
            m17455w(mo18295k2);
        }
    }

    @Override // com.daaw.iu7
    /* renamed from: p */
    public final void mo17462p(List list) {
        int mo18288r;
        int mo18288r2;
        if (!(list instanceof ms7)) {
            int i = this.f16716b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.f16715a.mo18287s()));
                    if (this.f16715a.mo18304b()) {
                        return;
                    }
                    mo18288r = this.f16715a.mo18288r();
                } while (mo18288r == this.f16716b);
                this.f16718d = mo18288r;
                return;
            } else if (i != 2) {
                throw xs7.m4543a();
            } else {
                int mo18295k = this.f16715a.mo18295k() + this.f16715a.mo18287s();
                do {
                    list.add(Integer.valueOf(this.f16715a.mo18287s()));
                } while (this.f16715a.mo18295k() < mo18295k);
                m17455w(mo18295k);
                return;
            }
        }
        ms7 ms7Var = (ms7) list;
        int i2 = this.f16716b & 7;
        if (i2 == 0) {
            do {
                ms7Var.mo12226i(this.f16715a.mo18287s());
                if (this.f16715a.mo18304b()) {
                    return;
                }
                mo18288r2 = this.f16715a.mo18288r();
            } while (mo18288r2 == this.f16716b);
            this.f16718d = mo18288r2;
        } else if (i2 != 2) {
            throw xs7.m4543a();
        } else {
            int mo18295k2 = this.f16715a.mo18295k() + this.f16715a.mo18287s();
            do {
                ms7Var.mo12226i(this.f16715a.mo18287s());
            } while (this.f16715a.mo18295k() < mo18295k2);
            m17455w(mo18295k2);
        }
    }

    @Override // com.daaw.iu7
    /* renamed from: q */
    public final void mo17461q(List list) {
        int mo18288r;
        int mo18288r2;
        if (!(list instanceof mq7)) {
            int i = this.f16716b & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(this.f16715a.mo18303c()));
                    if (this.f16715a.mo18304b()) {
                        return;
                    }
                    mo18288r = this.f16715a.mo18288r();
                } while (mo18288r == this.f16716b);
                this.f16718d = mo18288r;
                return;
            } else if (i != 2) {
                throw xs7.m4543a();
            } else {
                int mo18295k = this.f16715a.mo18295k() + this.f16715a.mo18287s();
                do {
                    list.add(Boolean.valueOf(this.f16715a.mo18303c()));
                } while (this.f16715a.mo18295k() < mo18295k);
                m17455w(mo18295k);
                return;
            }
        }
        mq7 mq7Var = (mq7) list;
        int i2 = this.f16716b & 7;
        if (i2 == 0) {
            do {
                mq7Var.m15837e(this.f16715a.mo18303c());
                if (this.f16715a.mo18304b()) {
                    return;
                }
                mo18288r2 = this.f16715a.mo18288r();
            } while (mo18288r2 == this.f16716b);
            this.f16718d = mo18288r2;
        } else if (i2 != 2) {
            throw xs7.m4543a();
        } else {
            int mo18295k2 = this.f16715a.mo18295k() + this.f16715a.mo18287s();
            do {
                mq7Var.m15837e(this.f16715a.mo18303c());
            } while (this.f16715a.mo18295k() < mo18295k2);
            m17455w(mo18295k2);
        }
    }

    @Override // com.daaw.iu7
    /* renamed from: r */
    public final void mo17460r(List list, cv7 cv7Var, vr7 vr7Var) {
        int mo18288r;
        int i = this.f16716b;
        if ((i & 7) != 2) {
            throw xs7.m4543a();
        }
        do {
            Object zze = cv7Var.zze();
            m17456v(zze, cv7Var, vr7Var);
            cv7Var.mo24960b(zze);
            list.add(zze);
            if (this.f16715a.mo18304b() || this.f16718d != 0) {
                return;
            }
            mo18288r = this.f16715a.mo18288r();
        } while (mo18288r == i);
        this.f16718d = mo18288r;
    }

    @Override // com.daaw.iu7
    /* renamed from: s */
    public final void mo17459s(List list) {
        int mo18288r;
        int mo18288r2;
        if (!(list instanceof cs7)) {
            int i = this.f16716b & 7;
            if (i == 2) {
                int mo18287s = this.f16715a.mo18287s();
                m17453y(mo18287s);
                int mo18295k = this.f16715a.mo18295k() + mo18287s;
                do {
                    list.add(Float.valueOf(this.f16715a.mo18296j()));
                } while (this.f16715a.mo18295k() < mo18295k);
                return;
            } else if (i != 5) {
                throw xs7.m4543a();
            } else {
                do {
                    list.add(Float.valueOf(this.f16715a.mo18296j()));
                    if (this.f16715a.mo18304b()) {
                        return;
                    }
                    mo18288r = this.f16715a.mo18288r();
                } while (mo18288r == this.f16716b);
                this.f16718d = mo18288r;
                return;
            }
        }
        cs7 cs7Var = (cs7) list;
        int i2 = this.f16716b & 7;
        if (i2 == 2) {
            int mo18287s2 = this.f16715a.mo18287s();
            m17453y(mo18287s2);
            int mo18295k2 = this.f16715a.mo18295k() + mo18287s2;
            do {
                cs7Var.m24988e(this.f16715a.mo18296j());
            } while (this.f16715a.mo18295k() < mo18295k2);
        } else if (i2 != 5) {
            throw xs7.m4543a();
        } else {
            do {
                cs7Var.m24988e(this.f16715a.mo18296j());
                if (this.f16715a.mo18304b()) {
                    return;
                }
                mo18288r2 = this.f16715a.mo18288r();
            } while (mo18288r2 == this.f16716b);
            this.f16718d = mo18288r2;
        }
    }

    /* renamed from: t */
    public final void m17458t(List list, boolean z) {
        int mo18288r;
        int mo18288r2;
        if ((this.f16716b & 7) != 2) {
            throw xs7.m4543a();
        }
        if (!(list instanceof ct7) || z) {
            do {
                list.add(z ? zzs() : zzr());
                if (this.f16715a.mo18304b()) {
                    return;
                }
                mo18288r = this.f16715a.mo18288r();
            } while (mo18288r == this.f16716b);
            this.f16718d = mo18288r;
            return;
        }
        ct7 ct7Var = (ct7) list;
        do {
            ct7Var.mo24979l(zzp());
            if (this.f16715a.mo18304b()) {
                return;
            }
            mo18288r2 = this.f16715a.mo18288r();
        } while (mo18288r2 == this.f16716b);
        this.f16718d = mo18288r2;
    }

    /* renamed from: u */
    public final void m17457u(Object obj, cv7 cv7Var, vr7 vr7Var) {
        int i = this.f16717c;
        this.f16717c = ((this.f16716b >>> 3) << 3) | 4;
        try {
            cv7Var.mo24954h(obj, this, vr7Var);
            if (this.f16716b == this.f16717c) {
                return;
            }
            throw xs7.m4537g();
        } finally {
            this.f16717c = i;
        }
    }

    /* renamed from: v */
    public final void m17456v(Object obj, cv7 cv7Var, vr7 vr7Var) {
        jr7 jr7Var;
        int mo18287s = this.f16715a.mo18287s();
        jr7 jr7Var2 = this.f16715a;
        if (jr7Var2.f15356a >= jr7Var2.f15357b) {
            throw new xs7("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int mo18294l = jr7Var2.mo18294l(mo18287s);
        this.f16715a.f15356a++;
        cv7Var.mo24954h(obj, this, vr7Var);
        this.f16715a.mo18306B(0);
        jr7Var.f15356a--;
        this.f16715a.mo18305a(mo18294l);
    }

    /* renamed from: w */
    public final void m17455w(int i) {
        if (this.f16715a.mo18295k() != i) {
            throw xs7.m4534j();
        }
    }

    /* renamed from: x */
    public final void m17454x(int i) {
        if ((this.f16716b & 7) != i) {
            throw xs7.m4543a();
        }
    }

    @Override // com.daaw.iu7
    public final boolean zzN() {
        m17454x(0);
        return this.f16715a.mo18303c();
    }

    @Override // com.daaw.iu7
    public final boolean zzO() {
        int i;
        if (this.f16715a.mo18304b() || (i = this.f16716b) == this.f16717c) {
            return false;
        }
        return this.f16715a.mo18302d(i);
    }

    @Override // com.daaw.iu7
    public final double zza() {
        m17454x(1);
        return this.f16715a.mo18297i();
    }

    @Override // com.daaw.iu7
    public final float zzb() {
        m17454x(5);
        return this.f16715a.mo18296j();
    }

    @Override // com.daaw.iu7
    public final int zzc() {
        int i = this.f16718d;
        if (i != 0) {
            this.f16716b = i;
            this.f16718d = 0;
        } else {
            i = this.f16715a.mo18288r();
            this.f16716b = i;
        }
        if (i == 0 || i == this.f16717c) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    @Override // com.daaw.iu7
    public final int zzd() {
        return this.f16716b;
    }

    @Override // com.daaw.iu7
    public final int zze() {
        m17454x(0);
        return this.f16715a.mo18293m();
    }

    @Override // com.daaw.iu7
    public final int zzf() {
        m17454x(5);
        return this.f16715a.mo18292n();
    }

    @Override // com.daaw.iu7
    public final int zzg() {
        m17454x(0);
        return this.f16715a.mo18291o();
    }

    @Override // com.daaw.iu7
    public final int zzh() {
        m17454x(5);
        return this.f16715a.mo18290p();
    }

    @Override // com.daaw.iu7
    public final int zzi() {
        m17454x(0);
        return this.f16715a.mo18289q();
    }

    @Override // com.daaw.iu7
    public final int zzj() {
        m17454x(0);
        return this.f16715a.mo18287s();
    }

    @Override // com.daaw.iu7
    public final long zzk() {
        m17454x(1);
        return this.f16715a.mo18286t();
    }

    @Override // com.daaw.iu7
    public final long zzl() {
        m17454x(0);
        return this.f16715a.mo18285u();
    }

    @Override // com.daaw.iu7
    public final long zzm() {
        m17454x(1);
        return this.f16715a.mo18284v();
    }

    @Override // com.daaw.iu7
    public final long zzn() {
        m17454x(0);
        return this.f16715a.mo18283w();
    }

    @Override // com.daaw.iu7
    public final long zzo() {
        m17454x(0);
        return this.f16715a.mo18282x();
    }

    @Override // com.daaw.iu7
    public final yq7 zzp() {
        m17454x(2);
        return this.f16715a.mo18281y();
    }

    @Override // com.daaw.iu7
    public final String zzr() {
        m17454x(2);
        return this.f16715a.mo18280z();
    }

    @Override // com.daaw.iu7
    public final String zzs() {
        m17454x(2);
        return this.f16715a.mo18307A();
    }
}
