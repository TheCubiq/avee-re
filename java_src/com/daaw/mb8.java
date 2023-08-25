package com.daaw;

import java.io.IOException;
/* loaded from: classes2.dex */
public class mb8 extends IOException {
    public mb8(String str) {
        super(str);
    }

    public static jb8 a() {
        return new jb8("Protocol message tag had invalid wire type.");
    }

    public static mb8 b() {
        return new mb8("Protocol message contained an invalid tag (zero).");
    }

    public static mb8 c() {
        return new mb8("Protocol message had invalid UTF-8.");
    }

    public static mb8 d() {
        return new mb8("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static mb8 e() {
        return new mb8("Failed to parse the message.");
    }

    public static mb8 f() {
        return new mb8("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
