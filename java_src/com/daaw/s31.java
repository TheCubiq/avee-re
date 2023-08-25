package com.daaw;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class s31 {

    /* loaded from: classes.dex */
    public static class a {
        public static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(s31 s31Var) {
            throw null;
        }

        public static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    public static RemoteInput a(s31 s31Var) {
        return a.b(s31Var);
    }

    public static RemoteInput[] b(s31[] s31VarArr) {
        if (s31VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[s31VarArr.length];
        for (int i = 0; i < s31VarArr.length; i++) {
            s31 s31Var = s31VarArr[i];
            remoteInputArr[i] = a(null);
        }
        return remoteInputArr;
    }
}
