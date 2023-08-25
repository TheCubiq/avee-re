package com.daaw;

import com.daaw.InterfaceC3255ut;
import java.io.File;
/* renamed from: com.daaw.zt */
/* loaded from: classes.dex */
public class C3894zt implements InterfaceC3255ut.InterfaceC3256a {

    /* renamed from: a */
    public final int f35477a;

    /* renamed from: b */
    public final InterfaceC3895a f35478b;

    /* renamed from: com.daaw.zt$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3895a {
        /* renamed from: a */
        File mo1921a();
    }

    public C3894zt(InterfaceC3895a interfaceC3895a, int i) {
        this.f35477a = i;
        this.f35478b = interfaceC3895a;
    }

    @Override // com.daaw.InterfaceC3255ut.InterfaceC3256a
    /* renamed from: a */
    public InterfaceC3255ut mo1922a() {
        File mo1921a = this.f35478b.mo1921a();
        if (mo1921a == null) {
            return null;
        }
        if (mo1921a.mkdirs() || (mo1921a.exists() && mo1921a.isDirectory())) {
            return C0674au.m27030d(mo1921a, this.f35477a);
        }
        return null;
    }
}
