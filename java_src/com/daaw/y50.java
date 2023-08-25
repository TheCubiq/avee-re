package com.daaw;

import com.daaw.qe0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class y50 {

    /* renamed from: c */
    public static final qe0.InterfaceC2708b f33364c = new C3669a();

    /* renamed from: d */
    public static final Pattern f33365d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f33366a = -1;

    /* renamed from: b */
    public int f33367b = -1;

    /* renamed from: com.daaw.y50$a */
    /* loaded from: classes.dex */
    public static class C3669a implements qe0.InterfaceC2708b {
        @Override // com.daaw.qe0.InterfaceC2708b
        /* renamed from: a */
        public boolean mo4098a(int i, int i2, int i3, int i4, int i5) {
            return i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2);
        }
    }

    /* renamed from: a */
    public boolean m4102a() {
        return (this.f33366a == -1 || this.f33367b == -1) ? false : true;
    }

    /* renamed from: b */
    public final boolean m4101b(String str, String str2) {
        if ("iTunSMPB".equals(str)) {
            Matcher matcher = f33365d.matcher(str2);
            if (matcher.find()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1), 16);
                    int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                    if (parseInt > 0 || parseInt2 > 0) {
                        this.f33366a = parseInt;
                        this.f33367b = parseInt2;
                        return true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m4100c(Metadata metadata) {
        for (int i = 0; i < metadata.m1648b(); i++) {
            Metadata.Entry m1649a = metadata.m1649a(i);
            if (m1649a instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) m1649a;
                if (m4101b(commentFrame.f35796r, commentFrame.f35797s)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean m4099d(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 > 0 || i3 > 0) {
            this.f33366a = i2;
            this.f33367b = i3;
            return true;
        }
        return false;
    }
}
