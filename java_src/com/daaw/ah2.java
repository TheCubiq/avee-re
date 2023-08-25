package com.daaw;

import java.io.UnsupportedEncodingException;
import java.util.Map;
/* loaded from: classes.dex */
public class ah2 extends qf2 {

    /* renamed from: B */
    public final Object f3196B;

    /* renamed from: C */
    public final vf2 f3197C;

    public ah2(int i, String str, vf2 vf2Var, uf2 uf2Var) {
        super(i, str, uf2Var);
        this.f3196B = new Object();
        this.f3197C = vf2Var;
    }

    @Override // com.daaw.qf2
    /* renamed from: a */
    public final wf2 mo1348a(mf2 mf2Var) {
        String str;
        String str2;
        try {
            byte[] bArr = mf2Var.f18850b;
            Map map = mf2Var.f18851c;
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
            str = new String(mf2Var.f18850b);
        }
        return wf2.m6088b(str, sg2.m10372b(mf2Var));
    }

    /* renamed from: i */
    public void mo14488i(String str) {
        vf2 vf2Var;
        synchronized (this.f3196B) {
            vf2Var = this.f3197C;
        }
        vf2Var.zza(str);
    }
}
