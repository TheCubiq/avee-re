package com.daaw;
/* loaded from: classes.dex */
public final class jz7 extends oz7 {
    public final String a;

    public jz7(String str) {
        this.a = str;
    }

    @Override // com.daaw.oz7
    public final void a(String str) {
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
    }
}
