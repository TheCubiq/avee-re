package com.daaw;
/* loaded from: classes2.dex */
public final class he8 implements ve8 {
    public final zd8 a;
    public final og8 b;
    public final boolean c;
    public final o88 d;

    public he8(og8 og8Var, o88 o88Var, zd8 zd8Var) {
        this.b = og8Var;
        this.c = o88Var.c(zd8Var);
        this.d = o88Var;
        this.a = zd8Var;
    }

    public static he8 h(og8 og8Var, o88 o88Var, zd8 zd8Var) {
        return new he8(og8Var, o88Var, zd8Var);
    }

    @Override // com.daaw.ve8
    public final int a(Object obj) {
        int hashCode = this.b.d(obj).hashCode();
        if (this.c) {
            this.d.a(obj);
            throw null;
        }
        return hashCode;
    }

    @Override // com.daaw.ve8
    public final void b(Object obj) {
        this.b.g(obj);
        this.d.b(obj);
    }

    @Override // com.daaw.ve8
    public final boolean c(Object obj) {
        this.d.a(obj);
        throw null;
    }

    @Override // com.daaw.ve8
    public final void d(Object obj, Object obj2) {
        ze8.f(this.b, obj, obj2);
        if (this.c) {
            ze8.e(this.d, obj, obj2);
        }
    }

    @Override // com.daaw.ve8
    public final boolean e(Object obj, Object obj2) {
        if (this.b.d(obj).equals(this.b.d(obj2))) {
            if (this.c) {
                this.d.a(obj);
                this.d.a(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.daaw.ve8
    public final void f(Object obj, ki8 ki8Var) {
        this.d.a(obj);
        throw null;
    }

    @Override // com.daaw.ve8
    public final void g(Object obj, byte[] bArr, int i, int i2, e58 e58Var) {
        ja8 ja8Var = (ja8) obj;
        if (ja8Var.zzc == qg8.c()) {
            ja8Var.zzc = qg8.f();
        }
        ba8 ba8Var = (ba8) obj;
        throw null;
    }

    @Override // com.daaw.ve8
    public final int zza(Object obj) {
        og8 og8Var = this.b;
        int b = og8Var.b(og8Var.d(obj));
        if (this.c) {
            this.d.a(obj);
            throw null;
        }
        return b;
    }

    @Override // com.daaw.ve8
    public final Object zze() {
        zd8 zd8Var = this.a;
        return zd8Var instanceof ja8 ? ((ja8) zd8Var).k() : zd8Var.a().q();
    }
}
