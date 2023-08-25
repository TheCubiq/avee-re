package com.daaw;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import java.util.Locale;
/* renamed from: com.daaw.as */
/* loaded from: classes.dex */
public class C0668as implements rm1 {

    /* renamed from: a */
    public final Resources f3514a;

    public C0668as(Resources resources) {
        this.f3514a = (Resources) C2914s6.m10686e(resources);
    }

    /* renamed from: g */
    public static int m27113g(Format format) {
        int m20498g = hq0.m20498g(format.f35721u);
        if (m20498g != -1) {
            return m20498g;
        }
        if (hq0.m20495j(format.f35718r) != null) {
            return 2;
        }
        if (hq0.m20504a(format.f35718r) != null) {
            return 1;
        }
        if (format.f35725y == -1 && format.f35726z == -1) {
            return (format.f35706G == -1 && format.f35707H == -1) ? -1 : 1;
        }
        return 2;
    }

    @Override // com.daaw.rm1
    /* renamed from: a */
    public String mo11182a(Format format) {
        int m27113g = m27113g(format);
        String m27112h = m27113g == 2 ? m27112h(m27114f(format), m27117c(format)) : m27113g == 1 ? m27112h(m27116d(format), m27118b(format), m27117c(format)) : m27116d(format);
        return m27112h.length() == 0 ? this.f3514a.getString(e21.exo_track_unknown) : m27112h;
    }

    /* renamed from: b */
    public final String m27118b(Format format) {
        Resources resources;
        int i;
        int i2 = format.f35706G;
        if (i2 == -1 || i2 < 1) {
            return "";
        }
        if (i2 == 1) {
            resources = this.f3514a;
            i = e21.exo_track_mono;
        } else if (i2 == 2) {
            resources = this.f3514a;
            i = e21.exo_track_stereo;
        } else if (i2 == 6 || i2 == 7) {
            resources = this.f3514a;
            i = e21.exo_track_surround_5_point_1;
        } else if (i2 != 8) {
            resources = this.f3514a;
            i = e21.exo_track_surround;
        } else {
            resources = this.f3514a;
            i = e21.exo_track_surround_7_point_1;
        }
        return resources.getString(i);
    }

    /* renamed from: c */
    public final String m27117c(Format format) {
        int i = format.f35717q;
        return i == -1 ? "" : this.f3514a.getString(e21.exo_track_bitrate, Float.valueOf(i / 1000000.0f));
    }

    /* renamed from: d */
    public final String m27116d(Format format) {
        String str = format.f35713N;
        return (TextUtils.isEmpty(str) || "und".equals(str)) ? "" : m27115e(str);
    }

    /* renamed from: e */
    public final String m27115e(String str) {
        return (sq1.f26525a >= 21 ? Locale.forLanguageTag(str) : new Locale(str)).getDisplayLanguage();
    }

    /* renamed from: f */
    public final String m27114f(Format format) {
        int i = format.f35725y;
        int i2 = format.f35726z;
        return (i == -1 || i2 == -1) ? "" : this.f3514a.getString(e21.exo_track_resolution, Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: h */
    public final String m27112h(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                str = TextUtils.isEmpty(str) ? str2 : this.f3514a.getString(e21.exo_item_list, str, str2);
            }
        }
        return str;
    }
}
