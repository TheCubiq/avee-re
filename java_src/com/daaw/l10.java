package com.daaw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/* loaded from: classes2.dex */
public class l10 {

    /* renamed from: a */
    public File f16945a;

    /* renamed from: b */
    public long f16946b;

    /* renamed from: c */
    public long f16947c;

    public l10(String str) {
        this.f16945a = new File(str);
        m17222b();
    }

    /* renamed from: a */
    public long m17223a() {
        return this.f16946b;
    }

    /* renamed from: b */
    public final void m17222b() {
        if (!this.f16945a.exists()) {
            throw new FileNotFoundException("File not found " + this.f16945a.getPath());
        } else if (this.f16945a.canRead()) {
            this.f16946b = this.f16945a.length();
            this.f16947c = this.f16945a.lastModified();
        } else {
            throw new IOException("File not readable " + this.f16945a.getPath());
        }
    }
}
