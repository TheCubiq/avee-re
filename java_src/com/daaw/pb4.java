package com.daaw;

import android.content.Context;
import java.util.Objects;
/* loaded from: classes.dex */
public final class pb4 implements cc6 {

    /* renamed from: a */
    public final bb4 f22805a;

    /* renamed from: b */
    public Context f22806b;

    /* renamed from: c */
    public String f22807c;

    public /* synthetic */ pb4(bb4 bb4Var, ob4 ob4Var) {
        this.f22805a = bb4Var;
    }

    @Override // com.daaw.cc6
    /* renamed from: a */
    public final /* synthetic */ cc6 mo13469a(Context context) {
        Objects.requireNonNull(context);
        this.f22806b = context;
        return this;
    }

    @Override // com.daaw.cc6
    public final /* synthetic */ cc6 zza(String str) {
        Objects.requireNonNull(str);
        this.f22807c = str;
        return this;
    }

    @Override // com.daaw.cc6
    public final dc6 zzc() {
        e08.m23800c(this.f22806b, Context.class);
        e08.m23800c(this.f22807c, String.class);
        return new rb4(this.f22805a, this.f22806b, this.f22807c, null);
    }
}
