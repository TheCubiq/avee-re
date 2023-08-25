package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.daaw.a30;
import com.daaw.b30;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class yo1 extends zo1 {
    /* renamed from: l */
    public static int m3476l(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // com.daaw.zo1
    /* renamed from: b */
    public Typeface mo2059b(Context context, a30.C0570c c0570c, Resources resources, int i) {
        a30.C0571d[] m27735a;
        try {
            FontFamily.Builder builder = null;
            for (a30.C0571d c0571d : c0570c.m27735a()) {
                try {
                    Font build = new Font.Builder(resources, c0571d.m27733b()).setWeight(c0571d.m27730e()).setSlant(c0571d.m27729f() ? 1 : 0).setTtcIndex(c0571d.m27732c()).setFontVariationSettings(c0571d.m27731d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m3477k(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.daaw.zo1
    /* renamed from: c */
    public Typeface mo2058c(Context context, CancellationSignal cancellationSignal, b30.C0805b[] c0805bArr, int i) {
        int i2;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = c0805bArr.length;
            FontFamily.Builder builder = null;
            while (i2 < length) {
                b30.C0805b c0805b = c0805bArr[i2];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(c0805b.m26504d(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(c0805b.m26503e()).setSlant(c0805b.m26502f() ? 1 : 0).setTtcIndex(c0805b.m26505c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                } else {
                    i2 = openFileDescriptor == null ? i2 + 1 : 0;
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m3477k(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.daaw.zo1
    /* renamed from: d */
    public Typeface mo2057d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // com.daaw.zo1
    /* renamed from: e */
    public Typeface mo2056e(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.daaw.zo1
    /* renamed from: h */
    public b30.C0805b mo2053h(b30.C0805b[] c0805bArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* renamed from: k */
    public final Font m3477k(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int m3476l = m3476l(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int m3476l2 = m3476l(fontStyle, font2.getStyle());
            if (m3476l2 < m3476l) {
                font = font2;
                m3476l = m3476l2;
            }
        }
        return font;
    }
}
