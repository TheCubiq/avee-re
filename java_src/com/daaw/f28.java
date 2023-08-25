package com.daaw;

import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class f28 extends j38 {
    public f28(r28 r28Var, String str, Long l, boolean z) {
        super(r28Var, str, l, true, null);
    }

    @Override // com.daaw.j38
    @Nullable
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String c = super.c();
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid long value for ");
            sb.append(c);
            sb.append(": ");
            sb.append((String) obj);
            return null;
        }
    }
}
