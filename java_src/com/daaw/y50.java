package com.daaw;

import com.daaw.qe0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class y50 {
    public static final qe0.b c = new a();
    public static final Pattern d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    /* loaded from: classes.dex */
    public static class a implements qe0.b {
        @Override // com.daaw.qe0.b
        public boolean a(int i, int i2, int i3, int i4, int i5) {
            return i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2);
        }
    }

    public boolean a() {
        return (this.a == -1 || this.b == -1) ? false : true;
    }

    public final boolean b(String str, String str2) {
        if ("iTunSMPB".equals(str)) {
            Matcher matcher = d.matcher(str2);
            if (matcher.find()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1), 16);
                    int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                    if (parseInt > 0 || parseInt2 > 0) {
                        this.a = parseInt;
                        this.b = parseInt2;
                        return true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            return false;
        }
        return false;
    }

    public boolean c(Metadata metadata) {
        for (int i = 0; i < metadata.b(); i++) {
            Metadata.Entry a2 = metadata.a(i);
            if (a2 instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) a2;
                if (b(commentFrame.r, commentFrame.s)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean d(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 > 0 || i3 > 0) {
            this.a = i2;
            this.b = i3;
            return true;
        }
        return false;
    }
}
