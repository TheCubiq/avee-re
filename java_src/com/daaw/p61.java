package com.daaw;

import com.daaw.ki1;
import java.io.File;
/* loaded from: classes.dex */
public class p61 implements ki1.InterfaceC1952c {

    /* renamed from: a */
    public final String f22641a;

    /* renamed from: b */
    public final File f22642b;

    /* renamed from: c */
    public final ki1.InterfaceC1952c f22643c;

    public p61(String str, File file, ki1.InterfaceC1952c interfaceC1952c) {
        this.f22641a = str;
        this.f22642b = file;
        this.f22643c = interfaceC1952c;
    }

    @Override // com.daaw.ki1.InterfaceC1952c
    /* renamed from: a */
    public ki1 mo13616a(ki1.C1950b c1950b) {
        return new o61(c1950b.f16394a, this.f22641a, this.f22642b, c1950b.f16396c.f16393a, this.f22643c.mo13616a(c1950b));
    }
}
