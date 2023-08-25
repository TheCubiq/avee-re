package com.daaw;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class fv0 implements oe1 {

    /* renamed from: a */
    public transient pe1 f9986a = null;

    /* renamed from: b */
    public final List<a51> f9987b = new ArrayList();

    @Override // com.daaw.oe1
    /* renamed from: a */
    public pe1 mo2137a() {
        return this.f9986a;
    }

    @Override // com.daaw.oe1
    /* renamed from: b */
    public void mo2136b(OutputStream outputStream, String str) {
        if (str == null) {
            str = "UTF-8";
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, str));
        bufferedWriter.write("[Playlist]");
        bufferedWriter.newLine();
        bufferedWriter.write("NumberOfEntries=");
        bufferedWriter.write(Integer.toString(this.f9987b.size()));
        bufferedWriter.newLine();
        int i = 1;
        for (a51 a51Var : this.f9987b) {
            bufferedWriter.write("File");
            bufferedWriter.write(Integer.toString(i));
            bufferedWriter.write("=");
            bufferedWriter.write(a51Var.m27608b());
            bufferedWriter.newLine();
            if (a51Var.m27607c() != null) {
                bufferedWriter.write("Title");
                bufferedWriter.write(Integer.toString(i));
                bufferedWriter.write("=");
                bufferedWriter.write(a51Var.m27607c());
                bufferedWriter.newLine();
            }
            if (a51Var.m27609a() >= 0) {
                bufferedWriter.write("Length");
                bufferedWriter.write(Integer.toString(i));
                bufferedWriter.write("=");
                bufferedWriter.write(Long.toString(a51Var.m27609a()));
                bufferedWriter.newLine();
            }
            i++;
        }
        bufferedWriter.write("Version=2");
        bufferedWriter.newLine();
        bufferedWriter.flush();
    }

    /* renamed from: c */
    public List<a51> m22252c() {
        return this.f9987b;
    }

    /* renamed from: d */
    public void m22251d(pe1 pe1Var) {
        this.f9986a = pe1Var;
    }
}
