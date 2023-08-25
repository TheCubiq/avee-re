package com.daaw;

import java.io.IOException;
/* loaded from: classes.dex */
public final class c81 extends IOException {
    public c81(String str) {
        super("Unable to bind a sample queue to TrackGroup with mime type " + str + ".");
    }
}
