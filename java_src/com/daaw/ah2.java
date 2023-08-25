package com.daaw;

import java.io.UnsupportedEncodingException;
import java.util.Map;
/* loaded from: classes.dex */
public class ah2 extends qf2 {
    public final Object B;
    public final vf2 C;

    public ah2(int i, String str, vf2 vf2Var, uf2 uf2Var) {
        super(i, str, uf2Var);
        this.B = new Object();
        this.C = vf2Var;
    }

    @Override // com.daaw.qf2
    public final wf2 a(mf2 mf2Var) {
        String str;
        String str2;
        try {
            byte[] bArr = mf2Var.b;
            Map map = mf2Var.c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(mf2Var.b);
        }
        return wf2.b(str, sg2.b(mf2Var));
    }

    public void i(String str) {
        vf2 vf2Var;
        synchronized (this.B) {
            vf2Var = this.C;
        }
        vf2Var.zza(str);
    }
}
