package com.daaw;
/* loaded from: classes.dex */
public final class jz7 extends oz7 {

    /* renamed from: a */
    public final String f15559a;

    public jz7(String str) {
        this.f15559a = str;
    }

    @Override // com.daaw.oz7
    /* renamed from: a */
    public final void mo13794a(String str) {
        String str2 = this.f15559a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
    }
}
