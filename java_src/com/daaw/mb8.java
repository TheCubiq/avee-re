package com.daaw;

import java.io.IOException;
/* loaded from: classes2.dex */
public class mb8 extends IOException {
    public mb8(String str) {
        super(str);
    }

    /* renamed from: a */
    public static jb8 m16109a() {
        return new jb8("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    public static mb8 m16108b() {
        return new mb8("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    public static mb8 m16107c() {
        return new mb8("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    public static mb8 m16106d() {
        return new mb8("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    public static mb8 m16105e() {
        return new mb8("Failed to parse the message.");
    }

    /* renamed from: f */
    public static mb8 m16104f() {
        return new mb8("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
