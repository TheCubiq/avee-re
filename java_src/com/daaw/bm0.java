package com.daaw;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class bm0 implements oe1 {
    public transient pe1 a = null;
    public final List<y41> b = new ArrayList();

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
        bufferedWriter.write("MPCPLAYLIST");
        bufferedWriter.newLine();
        int i = 1;
        for (y41 y41Var : this.b) {
            bufferedWriter.write(Integer.toString(i));
            bufferedWriter.write(",type,");
            bufferedWriter.write(y41Var.c());
            bufferedWriter.newLine();
            bufferedWriter.write(Integer.toString(i));
            bufferedWriter.write(",filename,");
            bufferedWriter.write(y41Var.a());
            bufferedWriter.newLine();
            if (y41Var.b() != null) {
                bufferedWriter.write(Integer.toString(i));
                bufferedWriter.write(",subtitle,");
                bufferedWriter.write(y41Var.b());
                bufferedWriter.newLine();
            }
            i++;
        }
        bufferedWriter.flush();
    }

    public List<y41> c() {
        return this.b;
    }

    public void d(pe1 pe1Var) {
        this.a = pe1Var;
    }
}
