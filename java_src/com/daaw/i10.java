package com.daaw;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class i10<T> implements d51<File, T> {
    public static final a c = new a();
    public d51<InputStream, T> a;
    public final a b;

    /* loaded from: classes.dex */
    public static class a {
        public InputStream a(File file) {
            return new FileInputStream(file);
        }
    }

    public i10(d51<InputStream, T> d51Var) {
        this(d51Var, c);
    }

    public i10(d51<InputStream, T> d51Var, a aVar) {
        this.a = d51Var;
        this.b = aVar;
    }

    @Override // com.daaw.d51
    /* renamed from: a */
    public z41<T> c(File file, int i, int i2) {
        InputStream inputStream = null;
        try {
            inputStream = this.b.a(file);
            z41<T> c2 = this.a.c(inputStream, i, i2);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return c2;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    @Override // com.daaw.d51
    public String getId() {
        return "";
    }
}
