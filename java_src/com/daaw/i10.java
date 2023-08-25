package com.daaw;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class i10<T> implements d51<File, T> {

    /* renamed from: c */
    public static final C1651a f13151c = new C1651a();

    /* renamed from: a */
    public d51<InputStream, T> f13152a;

    /* renamed from: b */
    public final C1651a f13153b;

    /* renamed from: com.daaw.i10$a */
    /* loaded from: classes.dex */
    public static class C1651a {
        /* renamed from: a */
        public InputStream m20218a(File file) {
            return new FileInputStream(file);
        }
    }

    public i10(d51<InputStream, T> d51Var) {
        this(d51Var, f13151c);
    }

    public i10(d51<InputStream, T> d51Var, C1651a c1651a) {
        this.f13152a = d51Var;
        this.f13153b = c1651a;
    }

    @Override // com.daaw.d51
    /* renamed from: a */
    public z41<T> mo2793c(File file, int i, int i2) {
        InputStream inputStream = null;
        try {
            inputStream = this.f13153b.m20218a(file);
            z41<T> mo2793c = this.f13152a.mo2793c(inputStream, i, i2);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return mo2793c;
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
