package com.daaw;
/* loaded from: classes.dex */
public enum k43 implements ns7 {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);
    

    /* renamed from: C */
    public static final os7 f15662C = new os7() { // from class: com.daaw.i43
    };

    /* renamed from: p */
    public final int f15674p;

    k43(int i) {
        this.f15674p = i;
    }

    /* renamed from: a */
    public static k43 m18049a(int i) {
        switch (i) {
            case 0:
                return AD_INITIATER_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return DFP_BANNER;
            case 3:
                return INTERSTITIAL;
            case 4:
                return DFP_INTERSTITIAL;
            case 5:
                return NATIVE_EXPRESS;
            case 6:
                return AD_LOADER;
            case 7:
                return REWARD_BASED_VIDEO_AD;
            case 8:
                return BANNER_SEARCH_ADS;
            case 9:
                return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
            case 10:
                return APP_OPEN;
            case 11:
                return REWARDED_INTERSTITIAL;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static ps7 m18048b() {
        return j43.f14258a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f15674p);
    }

    public final int zza() {
        return this.f15674p;
    }
}
