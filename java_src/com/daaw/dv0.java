package com.daaw;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class dv0 implements oe1 {
    public transient pe1 a = null;
    public final List<String> b = new ArrayList();
    public String c = "HARP";

    @Override // com.daaw.oe1
    public pe1 a() {
        return this.a;
    }

    @Override // com.daaw.oe1
    public void b(OutputStream outputStream, String str) {
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
        for (String str2 : this.b) {
            bufferedWriter.write(this.c);
            bufferedWriter.write(", ");
            bufferedWriter.write(str2);
            bufferedWriter.write(13);
            bufferedWriter.write(10);
        }
        bufferedWriter.flush();
    }

    public List<String> c() {
        return this.b;
    }

    public void d(String str) {
        this.c = str.trim();
    }

    public void e(pe1 pe1Var) {
        this.a = pe1Var;
    }
}
