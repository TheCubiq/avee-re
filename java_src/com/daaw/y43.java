package com.daaw;
/* loaded from: classes.dex */
public enum y43 implements ns7 {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);
    

    /* renamed from: B */
    public static final os7 f33337B = new os7() { // from class: com.daaw.w43
    };

    /* renamed from: p */
    public final int f33349p;

    y43(int i) {
        this.f33349p = i;
    }

    /* renamed from: a */
    public static y43 m4129a(int i) {
        switch (i) {
            case 0:
                return AD_FORMAT_TYPE_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return INTERSTITIAL;
            case 3:
                return NATIVE_EXPRESS;
            case 4:
                return NATIVE_CONTENT;
            case 5:
                return NATIVE_APP_INSTALL;
            case 6:
                return NATIVE_CUSTOM_TEMPLATE;
            case 7:
                return DFP_BANNER;
            case 8:
                return DFP_INTERSTITIAL;
            case 9:
                return REWARD_BASED_VIDEO_AD;
            case 10:
                return BANNER_SEARCH_ADS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static ps7 m4128b() {
        return x43.f32091a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f33349p);
    }

    public final int zza() {
        return this.f33349p;
    }
}
