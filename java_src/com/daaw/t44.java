package com.daaw;
/* loaded from: classes.dex */
public final class t44 extends eh2 {
    public static final t44 c = new t44();

    @Override // com.daaw.eh2
    public final ih2 b(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new kh2() : "mvhd".equals(str) ? new lh2() : new mh2(str);
    }
}
