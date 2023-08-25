package com.daaw;

import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class lz7 extends oz7 {

    /* renamed from: a */
    public final Logger f17929a;

    public lz7(String str) {
        this.f17929a = Logger.getLogger(str);
    }

    @Override // com.daaw.oz7
    /* renamed from: a */
    public final void mo13794a(String str) {
        this.f17929a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
