package com.daaw;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class zl0 implements oe1 {
    public transient pe1 a = null;
    public final List<a51> b = new ArrayList();
    public boolean c = false;

    @Override // com.daaw.oe1
    public pe1 a() {
        return this.a;
    }

    @Override // com.daaw.oe1
    public void b(OutputStream outputStream, String str) {
        if (str == null) {
            str = "UTF-8";
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, str));
        if (this.c) {
            bufferedWriter.write("#EXTM3U");
            bufferedWriter.newLine();
        }
        for (a51 a51Var : this.b) {
            if (this.c) {
                bufferedWriter.write("#EXTINF:");
                bufferedWriter.write(Long.toString(a51Var.a()));
                bufferedWriter.write(",");
                bufferedWriter.write(a51Var.c() == null ? a51Var.b() : a51Var.c());
                bufferedWriter.newLine();
            }
            bufferedWriter.write(a51Var.b());
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
    }

    public List<a51> c() {
        return this.b;
    }

    public void d(boolean z) {
        this.c = z;
    }

    public void e(pe1 pe1Var) {
        this.a = pe1Var;
    }
}
