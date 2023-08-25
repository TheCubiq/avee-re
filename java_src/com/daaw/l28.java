package com.daaw;

import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class l28 extends j38 {
    public l28(r28 r28Var, String str, Double d, boolean z) {
        super(r28Var, "measurement.test.double_flag", d, true, null);
    }

    @Override // com.daaw.j38
    @Nullable
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14601a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String m19094c = super.m19094c();
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid double value for ");
            sb.append(m19094c);
            sb.append(": ");
            sb.append((String) obj);
            return null;
        }
    }
}
