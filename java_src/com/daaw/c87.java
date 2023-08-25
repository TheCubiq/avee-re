package com.daaw;

import java.io.OutputStream;
/* loaded from: classes.dex */
public final class c87 {

    /* renamed from: a */
    public final OutputStream f5623a;

    public c87(OutputStream outputStream) {
        this.f5623a = outputStream;
    }

    /* renamed from: b */
    public static c87 m25510b(OutputStream outputStream) {
        return new c87(outputStream);
    }

    /* renamed from: a */
    public final void m25511a(dn7 dn7Var) {
        try {
            dn7Var.m20482h(this.f5623a);
        } finally {
            this.f5623a.close();
        }
    }
}
