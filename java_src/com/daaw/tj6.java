package com.daaw;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzay;
/* loaded from: classes.dex */
public final class tj6 {
    /* renamed from: a */
    public static zze m9074a(Throwable th) {
        if (th instanceof uq5) {
            uq5 uq5Var = (uq5) th;
            return m9072c(uq5Var.m21570a(), uq5Var.m7803b());
        } else if (th instanceof gi5) {
            return th.getMessage() == null ? m9071d(((gi5) th).m21570a(), null, null) : m9071d(((gi5) th).m21570a(), th.getMessage(), null);
        } else if (th instanceof zzay) {
            zzay zzayVar = (zzay) th;
            return new zze(zzayVar.zza(), hz6.m20316c(zzayVar.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
        } else {
            return m9071d(1, null, null);
        }
    }

    /* renamed from: b */
    public static zze m9073b(Throwable th, vq5 vq5Var) {
        zze zzeVar;
        zze m9074a = m9074a(th);
        int i = m9074a.zza;
        if ((i == 3 || i == 0) && (zzeVar = m9074a.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            m9074a.zzd = null;
        }
        if (vq5Var != null) {
            m9074a.zze = vq5Var.m6914b();
        }
        return m9074a;
    }

    /* renamed from: c */
    public static zze m9072c(int i, zze zzeVar) {
        if (i != 0) {
            if (i == 8) {
                if (((Integer) zzba.zzc().m23658b(g93.f10871w7)).intValue() > 0) {
                    return zzeVar;
                }
                i = 8;
            }
            return m9071d(i, null, zzeVar);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e1  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zze m9071d(int i, String str, zze zzeVar) {
        String str2;
        String str3;
        if (str == null) {
            int i2 = i - 1;
            if (i != 0) {
                switch (i2) {
                    case 1:
                        str = "Invalid request.";
                        break;
                    case 2:
                        str2 = "No fill.";
                        break;
                    case 3:
                        str = "App ID missing.";
                        break;
                    case 4:
                        str = "Network error.";
                        break;
                    case 5:
                        str = "Invalid request: Invalid ad unit ID.";
                        break;
                    case 6:
                        str = "Invalid request: Invalid ad size.";
                        break;
                    case 7:
                        str = "A mediation adapter failed to show the ad.";
                        break;
                    case 8:
                        str = "The ad is not ready.";
                        break;
                    case 9:
                        str = "The ad has already been shown.";
                        break;
                    case 10:
                        str = "The ad can not be shown when app is not in foreground.";
                        break;
                    case 11:
                    default:
                        str = "Internal error.";
                        break;
                    case 12:
                        if (((Integer) zzba.zzc().m23658b(g93.f10904z7)).intValue() <= 0) {
                            str = "The mediation adapter did not return an ad.";
                            break;
                        }
                        str2 = "No fill.";
                        break;
                    case 13:
                        str = "Mismatch request IDs.";
                        break;
                    case 14:
                        str = "Invalid ad string.";
                        break;
                    case 15:
                        str = "Ad inspector had an internal error.";
                        break;
                    case 16:
                        str = "Ad inspector failed to load.";
                        break;
                    case 17:
                        str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                        break;
                    case 18:
                        str = "Ad inspector cannot be opened because it is already open.";
                        break;
                }
                int i3 = i - 1;
                if (i == 0) {
                    int i4 = 0;
                    switch (i3) {
                        case 0:
                        case 11:
                        case 15:
                            break;
                        case 1:
                        case 5:
                        case 6:
                        case 9:
                        case 16:
                            i4 = 1;
                            break;
                        case 2:
                        case 10:
                        case 18:
                            i4 = 3;
                            break;
                        case 3:
                            i4 = 8;
                            break;
                        case 4:
                        case 8:
                        case 17:
                            i4 = 2;
                            break;
                        case 7:
                            i4 = 4;
                            break;
                        case 12:
                            if (((Integer) zzba.zzc().m23658b(g93.f10904z7)).intValue() <= 0) {
                                i4 = 9;
                                break;
                            }
                            i4 = 3;
                            break;
                        case 13:
                            i4 = 10;
                            break;
                        case 14:
                            i4 = 11;
                            break;
                        default:
                            switch (i) {
                                case 1:
                                    str3 = "INTERNAL_ERROR";
                                    break;
                                case 2:
                                    str3 = "INVALID_REQUEST";
                                    break;
                                case 3:
                                    str3 = "NO_FILL";
                                    break;
                                case 4:
                                    str3 = "APP_ID_MISSING";
                                    break;
                                case 5:
                                    str3 = "NETWORK_ERROR";
                                    break;
                                case 6:
                                    str3 = "INVALID_AD_UNIT_ID";
                                    break;
                                case 7:
                                    str3 = "INVALID_AD_SIZE";
                                    break;
                                case 8:
                                    str3 = "MEDIATION_SHOW_ERROR";
                                    break;
                                case 9:
                                    str3 = "NOT_READY";
                                    break;
                                case 10:
                                    str3 = "AD_REUSED";
                                    break;
                                case 11:
                                    str3 = "APP_NOT_FOREGROUND";
                                    break;
                                case 12:
                                    str3 = "INTERNAL_SHOW_ERROR";
                                    break;
                                case 13:
                                    str3 = "MEDIATION_NO_FILL";
                                    break;
                                case 14:
                                    str3 = "REQUEST_ID_MISMATCH";
                                    break;
                                case 15:
                                    str3 = "INVALID_AD_STRING";
                                    break;
                                case 16:
                                    str3 = "AD_INSPECTOR_INTERNAL_ERROR";
                                    break;
                                case 17:
                                    str3 = "AD_INSPECTOR_FAILED_TO_LOAD";
                                    break;
                                case 18:
                                    str3 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                                    break;
                                default:
                                    str3 = "AD_INSPECTOR_ALREADY_OPEN";
                                    break;
                            }
                            throw new AssertionError("Unknown SdkError: ".concat(str3));
                    }
                    return new zze(i4, str2, MobileAds.ERROR_DOMAIN, zzeVar, null);
                }
                throw null;
            }
            throw null;
        }
        str2 = str;
        int i32 = i - 1;
        if (i == 0) {
        }
    }
}
