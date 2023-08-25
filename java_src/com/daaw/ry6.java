package com.daaw;

import java.util.logging.Logger;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class ry6 {
    public static final Logger a = Logger.getLogger(ry6.class.getName());
    public static final qy6 b = new qy6(null);

    public static String a(@CheckForNull String str) {
        return str == null ? "" : str;
    }

    public static boolean b(@CheckForNull String str) {
        return str == null || str.isEmpty();
    }
}
