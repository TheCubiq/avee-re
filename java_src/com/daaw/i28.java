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
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14601a(Object obj) {
        if (tu7.f28081c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (tu7.f28082d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String m19094c = super.m19094c();
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid boolean value for ");
        sb.append(m19094c);
        sb.append(": ");
        sb.append((String) obj);
        return null;
    }
}
