package com.daaw;

import android.text.TextUtils;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class f54 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ String f9126p;

    /* renamed from: q */
    public final /* synthetic */ String f9127q;

    /* renamed from: r */
    public final /* synthetic */ String f9128r;

    /* renamed from: s */
    public final /* synthetic */ String f9129s;

    /* renamed from: t */
    public final /* synthetic */ j54 f9130t;

    public f54(j54 j54Var, String str, String str2, String str3, String str4) {
        this.f9130t = j54Var;
        this.f9126p = str;
        this.f9127q = str2;
        this.f9128r = str3;
        this.f9129s = str4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.f9126p);
        if (!TextUtils.isEmpty(this.f9127q)) {
            hashMap.put("cachedSrc", this.f9127q);
        }
        String str = this.f9128r;
        switch (str.hashCode()) {
            case -1947652542:
                if (str.equals("interrupted")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1396664534:
                if (str.equals("badUrl")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1347010958:
                if (str.equals("inProgress")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -918817863:
                if (str.equals("downloadTimeout")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -659376217:
                if (str.equals("contentLengthMissing")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -642208130:
                if (str.equals("playerFailed")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -354048396:
                if (str.equals("sizeExceeded")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -32082395:
                if (str.equals("externalAbort")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 3387234:
                if (str.equals("noop")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 96784904:
                if (str.equals("error")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 580119100:
                if (str.equals("expireFailed")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 725497484:
                if (str.equals("noCacheDir")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str2 = "internal";
        switch (c) {
            case 6:
            case 7:
                str2 = "io";
                break;
            case '\b':
            case '\t':
                str2 = "network";
                break;
            case '\n':
            case 11:
                str2 = "policy";
                break;
        }
        hashMap.put("type", str2);
        hashMap.put("reason", this.f9128r);
        if (!TextUtils.isEmpty(this.f9129s)) {
            hashMap.put("message", this.f9129s);
        }
        j54.m18857b(this.f9130t, "onPrecacheEvent", hashMap);
    }
}
