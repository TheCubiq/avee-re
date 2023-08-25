package com.daaw;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class fv0 implements oe1 {
    public transient pe1 a = null;
    public final List<a51> b = new ArrayList();

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
        bufferedWriter.write("[Playlist]");
        bufferedWriter.newLine();
        bufferedWriter.write("NumberOfEntries=");
        bufferedWriter.write(Integer.toString(this.b.size()));
        bufferedWriter.newLine();
        int i = 1;
        for (a51 a51Var : this.b) {
            bufferedWriter.write("File");
            bufferedWriter.write(Integer.toString(i));
            bufferedWriter.write("=");
            bufferedWriter.write(a51Var.b());
            bufferedWriter.newLine();
            if (a51Var.c() != null) {
                bufferedWriter.write("Title");
                bufferedWriter.write(Integer.toString(i));
                bufferedWriter.write("=");
                bufferedWriter.write(a51Var.c());
                bufferedWriter.newLine();
            }
            if (a51Var.a() >= 0) {
                bufferedWriter.write("Length");
                bufferedWriter.write(Integer.toString(i));
                bufferedWriter.write("=");
                bufferedWriter.write(Long.toString(a51Var.a()));
                bufferedWriter.newLine();
            }
            i++;
        }
        bufferedWriter.write("Version=2");
        bufferedWriter.newLine();
        bufferedWriter.flush();
    }

    public List<a51> c() {
        return this.b;
    }

    public void d(pe1 pe1Var) {
        this.a = pe1Var;
    }
}
