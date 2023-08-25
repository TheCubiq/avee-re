package com.daaw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/* loaded from: classes2.dex */
public class l10 {
    public File a;
    public long b;
    public long c;

    public l10(String str) {
        this.a = new File(str);
        b();
    }

    public long a() {
        return this.b;
    }

    public final void b() {
        if (!this.a.exists()) {
            throw new FileNotFoundException("File not found " + this.a.getPath());
        } else if (this.a.canRead()) {
            this.b = this.a.length();
            this.c = this.a.lastModified();
        } else {
            throw new IOException("File not readable " + this.a.getPath());
        }
    }
}
