package com.daaw;

import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class lz7 extends oz7 {
    public final Logger a;

    public lz7(String str) {
        this.a = Logger.getLogger(str);
    }

    @Override // com.daaw.oz7
    public final void a(String str) {
        this.a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
