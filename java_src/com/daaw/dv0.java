package com.daaw;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class dv0 implements oe1 {

    /* renamed from: a */
    public transient pe1 f7835a = null;

    /* renamed from: b */
    public final List<String> f7836b = new ArrayList();

    /* renamed from: c */
    public String f7837c = "HARP";

    @Override // com.daaw.oe1
    /* renamed from: a */
    public pe1 mo2137a() {
        return this.f7835a;
    }

    @Override // com.daaw.oe1
    /* renamed from: b */
    public void mo2136b(OutputStream outputStream, String str) {
        if (str == null) {
            str = "UTF-16LE";
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, str));
        bufferedWriter.write("PLP PLAYLIST");
        bufferedWriter.write(13);
        bufferedWriter.write(10);
        bufferedWriter.write("VERSION 1.20");
        bufferedWriter.write(13);
        bufferedWriter.write(10);
        bufferedWriter.write(13);
        bufferedWriter.write(10);
        for (String str2 : this.f7836b) {
            bufferedWriter.write(this.f7837c);
            bufferedWriter.write(", ");
            bufferedWriter.write(str2);
            bufferedWriter.write(13);
            bufferedWriter.write(10);
        }
        bufferedWriter.flush();
    }

    /* renamed from: c */
    public List<String> m23931c() {
        return this.f7836b;
    }

    /* renamed from: d */
    public void m23930d(String str) {
        this.f7837c = str.trim();
    }

    /* renamed from: e */
    public void m23929e(pe1 pe1Var) {
        this.f7835a = pe1Var;
    }
}
