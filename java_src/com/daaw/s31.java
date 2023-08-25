package com.daaw;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class s31 {

    /* renamed from: com.daaw.s31$a */
    /* loaded from: classes.dex */
    public static class C2909a {
        /* renamed from: a */
        public static void m10744a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        /* renamed from: b */
        public static RemoteInput m10743b(s31 s31Var) {
            throw null;
        }

        /* renamed from: c */
        public static Bundle m10742c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* renamed from: a */
    public static RemoteInput m10746a(s31 s31Var) {
        return C2909a.m10743b(s31Var);
    }

    /* renamed from: b */
    public static RemoteInput[] m10745b(s31[] s31VarArr) {
        if (s31VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[s31VarArr.length];
        for (int i = 0; i < s31VarArr.length; i++) {
            s31 s31Var = s31VarArr[i];
            remoteInputArr[i] = m10746a(null);
        }
        return remoteInputArr;
    }
}
