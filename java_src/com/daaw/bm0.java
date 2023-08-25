package com.daaw;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class bm0 implements oe1 {

    /* renamed from: a */
    public transient pe1 f4952a = null;

    /* renamed from: b */
    public final List<y41> f4953b = new ArrayList();

    @Override // com.daaw.oe1
    /* renamed from: a */
    public pe1 mo2137a() {
        return this.f4952a;
    }

    @Override // com.daaw.oe1
    /* renamed from: b */
    public void mo2136b(OutputStream outputStream, String str) {
        if (str == null) {
            str = "UTF-8";
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, str));
        bufferedWriter.write("MPCPLAYLIST");
        bufferedWriter.newLine();
        int i = 1;
        for (y41 y41Var : this.f4953b) {
            bufferedWriter.write(Integer.toString(i));
            bufferedWriter.write(",type,");
            bufferedWriter.write(y41Var.m4133c());
            bufferedWriter.newLine();
            bufferedWriter.write(Integer.toString(i));
            bufferedWriter.write(",filename,");
            bufferedWriter.write(y41Var.m4135a());
            bufferedWriter.newLine();
            if (y41Var.m4134b() != null) {
                bufferedWriter.write(Integer.toString(i));
                bufferedWriter.write(",subtitle,");
                bufferedWriter.write(y41Var.m4134b());
                bufferedWriter.newLine();
            }
            i++;
        }
        bufferedWriter.flush();
    }

    /* renamed from: c */
    public List<y41> m25999c() {
        return this.f4953b;
    }

    /* renamed from: d */
    public void m25998d(pe1 pe1Var) {
        this.f4952a = pe1Var;
    }
}
