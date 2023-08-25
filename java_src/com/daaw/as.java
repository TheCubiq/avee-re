package com.daaw;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import java.util.Locale;
/* loaded from: classes.dex */
public class as implements rm1 {
    public final Resources a;

    public as(Resources resources) {
        this.a = (Resources) s6.e(resources);
    }

    public static int g(Format format) {
        int g = hq0.g(format.u);
        if (g != -1) {
            return g;
        }
        if (hq0.j(format.r) != null) {
            return 2;
        }
        if (hq0.a(format.r) != null) {
            return 1;
        }
        if (format.y == -1 && format.z == -1) {
            return (format.G == -1 && format.H == -1) ? -1 : 1;
        }
        return 2;
    }

    @Override // com.daaw.rm1
    public String a(Format format) {
        int g = g(format);
        String h = g == 2 ? h(f(format), c(format)) : g == 1 ? h(d(format), b(format), c(format)) : d(format);
        return h.length() == 0 ? this.a.getString(e21.exo_track_unknown) : h;
    }

    public final String b(Format format) {
        Resources resources;
        int i;
        int i2 = format.G;
        if (i2 == -1 || i2 < 1) {
            return "";
        }
        if (i2 == 1) {
            resources = this.a;
            i = e21.exo_track_mono;
        } else if (i2 == 2) {
            resources = this.a;
            i = e21.exo_track_stereo;
        } else if (i2 == 6 || i2 == 7) {
            resources = this.a;
            i = e21.exo_track_surround_5_point_1;
        } else if (i2 != 8) {
            resources = this.a;
            i = e21.exo_track_surround;
        } else {
            resources = this.a;
            i = e21.exo_track_surround_7_point_1;
        }
        return resources.getString(i);
    }

    public final String c(Format format) {
        int i = format.q;
        return i == -1 ? "" : this.a.getString(e21.exo_track_bitrate, Float.valueOf(i / 1000000.0f));
    }

    public final String d(Format format) {
        String str = format.N;
        return (TextUtils.isEmpty(str) || "und".equals(str)) ? "" : e(str);
    }

    public final String e(String str) {
        return (sq1.a >= 21 ? Locale.forLanguageTag(str) : new Locale(str)).getDisplayLanguage();
    }

    public final String f(Format format) {
        int i = format.y;
        int i2 = format.z;
        return (i == -1 || i2 == -1) ? "" : this.a.getString(e21.exo_track_resolution, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public final String h(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                str = TextUtils.isEmpty(str) ? str2 : this.a.getString(e21.exo_item_list, str, str2);
            }
        }
        return str;
    }
}
