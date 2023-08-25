package com.daaw;

import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class i28 extends j38 {
    public i28(r28 r28Var, String str, Boolean bool, boolean z) {
        super(r28Var, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daaw.j38
    @Nullable
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (tu7.c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (tu7.d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String c = super.c();
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid boolean value for ");
        sb.append(c);
        sb.append(": ");
        sb.append((String) obj);
        return null;
    }
}
