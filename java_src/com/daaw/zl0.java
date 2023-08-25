package com.daaw;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class zl0 implements oe1 {

    /* renamed from: a */
    public transient pe1 f35197a = null;

    /* renamed from: b */
    public final List<a51> f35198b = new ArrayList();

    /* renamed from: c */
    public boolean f35199c = false;

    @Override // com.daaw.oe1
    /* renamed from: a */
    public pe1 mo2137a() {
        return this.f35197a;
    }

    @Override // com.daaw.oe1
    /* renamed from: b */
    public void mo2136b(OutputStream outputStream, String str) {
        if (str == null) {
            str = "UTF-8";
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, str));
        if (this.f35199c) {
            bufferedWriter.write("#EXTM3U");
            bufferedWriter.newLine();
        }
        for (a51 a51Var : this.f35198b) {
            if (this.f35199c) {
                bufferedWriter.write("#EXTINF:");
                bufferedWriter.write(Long.toString(a51Var.m27609a()));
                bufferedWriter.write(",");
                bufferedWriter.write(a51Var.m27607c() == null ? a51Var.m27608b() : a51Var.m27607c());
                bufferedWriter.newLine();
            }
            bufferedWriter.write(a51Var.m27608b());
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
    }

    /* renamed from: c */
    public List<a51> m2135c() {
        return this.f35198b;
    }

    /* renamed from: d */
    public void m2134d(boolean z) {
        this.f35199c = z;
    }

    /* renamed from: e */
    public void m2133e(pe1 pe1Var) {
        this.f35197a = pe1Var;
    }
}
