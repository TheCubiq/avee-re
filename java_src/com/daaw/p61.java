package com.daaw;

import com.daaw.ki1;
import java.io.File;
/* loaded from: classes.dex */
public class p61 implements ki1.c {
    public final String a;
    public final File b;
    public final ki1.c c;

    public p61(String str, File file, ki1.c cVar) {
        this.a = str;
        this.b = file;
        this.c = cVar;
    }

    @Override // com.daaw.ki1.c
    public ki1 a(ki1.b bVar) {
        return new o61(bVar.a, this.a, this.b, bVar.c.a, this.c.a(bVar));
    }
}
