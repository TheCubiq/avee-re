package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public abstract class kk8 implements hi8 {

    /* renamed from: b */
    public di8 f16433b;

    /* renamed from: c */
    public di8 f16434c;

    /* renamed from: d */
    public di8 f16435d;

    /* renamed from: e */
    public di8 f16436e;

    /* renamed from: f */
    public ByteBuffer f16437f;

    /* renamed from: g */
    public ByteBuffer f16438g;

    /* renamed from: h */
    public boolean f16439h;

    public kk8() {
        ByteBuffer byteBuffer = hi8.f12557a;
        this.f16437f = byteBuffer;
        this.f16438g = byteBuffer;
        di8 di8Var = di8.f7132e;
        this.f16435d = di8Var;
        this.f16436e = di8Var;
        this.f16433b = di8Var;
        this.f16434c = di8Var;
    }

    @Override // com.daaw.hi8
    /* renamed from: a */
    public final di8 mo3499a(di8 di8Var) {
        this.f16435d = di8Var;
        this.f16436e = mo3570c(di8Var);
        return zzg() ? this.f16436e : di8.f7132e;
    }

    /* renamed from: c */
    public abstract di8 mo3570c(di8 di8Var);

    /* renamed from: d */
    public final ByteBuffer m17680d(int i) {
        if (this.f16437f.capacity() < i) {
            this.f16437f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f16437f.clear();
        }
        ByteBuffer byteBuffer = this.f16437f;
        this.f16438g = byteBuffer;
        return byteBuffer;
    }

    /* renamed from: e */
    public void mo8013e() {
    }

    /* renamed from: f */
    public void mo8012f() {
    }

    /* renamed from: g */
    public void mo8011g() {
    }

    /* renamed from: h */
    public final boolean m17679h() {
        return this.f16438g.hasRemaining();
    }

    @Override // com.daaw.hi8
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.f16438g;
        this.f16438g = hi8.f12557a;
        return byteBuffer;
    }

    @Override // com.daaw.hi8
    public final void zzc() {
        this.f16438g = hi8.f12557a;
        this.f16439h = false;
        this.f16433b = this.f16435d;
        this.f16434c = this.f16436e;
        mo8013e();
    }

    @Override // com.daaw.hi8
    public final void zzd() {
        this.f16439h = true;
        mo8012f();
    }

    @Override // com.daaw.hi8
    public final void zzf() {
        zzc();
        this.f16437f = hi8.f12557a;
        di8 di8Var = di8.f7132e;
        this.f16435d = di8Var;
        this.f16436e = di8Var;
        this.f16433b = di8Var;
        this.f16434c = di8Var;
        mo8011g();
    }

    @Override // com.daaw.hi8
    public boolean zzg() {
        return this.f16436e != di8.f7132e;
    }

    @Override // com.daaw.hi8
    public boolean zzh() {
        return this.f16439h && this.f16438g == hi8.f12557a;
    }
}
