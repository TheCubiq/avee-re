package com.daaw;

import java.io.OutputStream;
/* loaded from: classes.dex */
public final class c87 {
    public final OutputStream a;

    public c87(OutputStream outputStream) {
        this.a = outputStream;
    }

    public static c87 b(OutputStream outputStream) {
        return new c87(outputStream);
    }

    public final void a(dn7 dn7Var) {
        try {
            dn7Var.h(this.a);
        } finally {
            this.a.close();
        }
    }
}
