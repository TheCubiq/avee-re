package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class hg5 implements yx4 {

    /* renamed from: p */
    public final Bundle f12531p = new Bundle();

    /* renamed from: a */
    public final synchronized Bundle m20799a() {
        return new Bundle(this.f12531p);
    }

    @Override // com.daaw.yx4
    /* renamed from: c */
    public final synchronized void mo3090c(String str, String str2) {
        this.f12531p.putInt(str, 3);
    }

    @Override // com.daaw.yx4
    /* renamed from: l */
    public final synchronized void mo3089l(String str) {
        this.f12531p.putInt(str, 2);
    }

    @Override // com.daaw.yx4
    /* renamed from: m */
    public final synchronized void mo3088m(String str) {
        this.f12531p.putInt(str, 1);
    }

    @Override // com.daaw.yx4
    public final void zza(String str) {
    }

    @Override // com.daaw.yx4
    public final void zze() {
    }

    @Override // com.daaw.yx4
    public final void zzf() {
    }
}
