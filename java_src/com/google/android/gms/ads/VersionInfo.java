package com.google.android.gms.ads;

import java.util.Locale;
/* loaded from: classes.dex */
public class VersionInfo {

    /* renamed from: a */
    public int f36037a;

    /* renamed from: b */
    public int f36038b;

    /* renamed from: c */
    public int f36039c;

    public VersionInfo(int i, int i2, int i3) {
        this.f36037a = i;
        this.f36038b = i2;
        this.f36039c = i3;
    }

    public int getMajorVersion() {
        return this.f36037a;
    }

    public int getMicroVersion() {
        return this.f36039c;
    }

    public int getMinorVersion() {
        return this.f36038b;
    }

    public String toString() {
        return String.format(Locale.US, "%d.%d.%d", Integer.valueOf(this.f36037a), Integer.valueOf(this.f36038b), Integer.valueOf(this.f36039c));
    }
}
