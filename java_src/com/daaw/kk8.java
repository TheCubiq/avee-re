package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public abstract class kk8 implements hi8 {
    public di8 b;
    public di8 c;
    public di8 d;
    public di8 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public kk8() {
        ByteBuffer byteBuffer = hi8.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        di8 di8Var = di8.e;
        this.d = di8Var;
        this.e = di8Var;
        this.b = di8Var;
        this.c = di8Var;
    }

    @Override // com.daaw.hi8
    public final di8 a(di8 di8Var) {
        this.d = di8Var;
        this.e = c(di8Var);
        return zzg() ? this.e : di8.e;
    }

    public abstract di8 c(di8 di8Var);

    public final ByteBuffer d(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    public final boolean h() {
        return this.g.hasRemaining();
    }

    @Override // com.daaw.hi8
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.g;
        this.g = hi8.a;
        return byteBuffer;
    }

    @Override // com.daaw.hi8
    public final void zzc() {
        this.g = hi8.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        e();
    }

    @Override // com.daaw.hi8
    public final void zzd() {
        this.h = true;
        f();
    }

    @Override // com.daaw.hi8
    public final void zzf() {
        zzc();
        this.f = hi8.a;
        di8 di8Var = di8.e;
        this.d = di8Var;
        this.e = di8Var;
        this.b = di8Var;
        this.c = di8Var;
        g();
    }

    @Override // com.daaw.hi8
    public boolean zzg() {
        return this.e != di8.e;
    }

    @Override // com.daaw.hi8
    public boolean zzh() {
        return this.h && this.g == hi8.a;
    }
}
