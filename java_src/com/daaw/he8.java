package com.daaw;
/* loaded from: classes2.dex */
public final class he8 implements ve8 {

    /* renamed from: a */
    public final zd8 f12482a;

    /* renamed from: b */
    public final og8 f12483b;

    /* renamed from: c */
    public final boolean f12484c;

    /* renamed from: d */
    public final o88 f12485d;

    public he8(og8 og8Var, o88 o88Var, zd8 zd8Var) {
        this.f12483b = og8Var;
        this.f12484c = o88Var.mo11574c(zd8Var);
        this.f12485d = o88Var;
        this.f12482a = zd8Var;
    }

    /* renamed from: h */
    public static he8 m20832h(og8 og8Var, o88 o88Var, zd8 zd8Var) {
        return new he8(og8Var, o88Var, zd8Var);
    }

    @Override // com.daaw.ve8
    /* renamed from: a */
    public final int mo7205a(Object obj) {
        int hashCode = this.f12483b.mo10361d(obj).hashCode();
        if (this.f12484c) {
            this.f12485d.mo11576a(obj);
            throw null;
        }
        return hashCode;
    }

    @Override // com.daaw.ve8
    /* renamed from: b */
    public final void mo7204b(Object obj) {
        this.f12483b.mo10358g(obj);
        this.f12485d.mo11575b(obj);
    }

    @Override // com.daaw.ve8
    /* renamed from: c */
    public final boolean mo7203c(Object obj) {
        this.f12485d.mo11576a(obj);
        throw null;
    }

    @Override // com.daaw.ve8
    /* renamed from: d */
    public final void mo7202d(Object obj, Object obj2) {
        ze8.m2384f(this.f12483b, obj, obj2);
        if (this.f12484c) {
            ze8.m2385e(this.f12485d, obj, obj2);
        }
    }

    @Override // com.daaw.ve8
    /* renamed from: e */
    public final boolean mo7201e(Object obj, Object obj2) {
        if (this.f12483b.mo10361d(obj).equals(this.f12483b.mo10361d(obj2))) {
            if (this.f12484c) {
                this.f12485d.mo11576a(obj);
                this.f12485d.mo11576a(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.daaw.ve8
    /* renamed from: f */
    public final void mo7200f(Object obj, ki8 ki8Var) {
        this.f12485d.mo11576a(obj);
        throw null;
    }

    @Override // com.daaw.ve8
    /* renamed from: g */
    public final void mo7199g(Object obj, byte[] bArr, int i, int i2, e58 e58Var) {
        ja8 ja8Var = (ja8) obj;
        if (ja8Var.zzc == qg8.m12544c()) {
            ja8Var.zzc = qg8.m12541f();
        }
        ba8 ba8Var = (ba8) obj;
        throw null;
    }

    @Override // com.daaw.ve8
    public final int zza(Object obj) {
        og8 og8Var = this.f12483b;
        int mo10363b = og8Var.mo10363b(og8Var.mo10361d(obj));
        if (this.f12484c) {
            this.f12485d.mo11576a(obj);
            throw null;
        }
        return mo10363b;
    }

    @Override // com.daaw.ve8
    public final Object zze() {
        zd8 zd8Var = this.f12482a;
        return zd8Var instanceof ja8 ? ((ja8) zd8Var).m18671k() : zd8Var.mo2463a().mo3971q();
    }
}
