package com.daaw.avee.comp.InAppBilling;

import com.daaw.avee.Common.SecR;
import junit.framework.Assert;
/* loaded from: classes.dex */
public class BSecLoad {
    static SecR.RandomString randomString = new SecR.RandomString(38);
    static SecR.RandomString randomString0 = new SecR.RandomString(19);
    static SecR.RandomString randomString1 = new SecR.RandomString(9);
    static SecR.RandomString randomString2 = new SecR.RandomString(4);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[LOOP:0: B:15:0x003e->B:16:0x0040, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean validLoad(String str) {
        char c;
        char c2;
        char c3;
        char c4;
        int i;
        int i2;
        int length = str.length();
        int i3 = length - 1;
        try {
            c = str.charAt(Math.min(i3, 1));
            try {
                c2 = str.charAt(Math.min(i3, 2));
                try {
                    c3 = str.charAt(Math.min(i3, length / 4));
                    try {
                        c4 = str.charAt(Math.max(i3, length / 8));
                        try {
                            i = str.charAt(Math.min(i3, length / 16));
                        } catch (Exception unused) {
                            i = 0;
                            while (i2 < length) {
                            }
                            int i4 = c2 + c3 + c4 + i;
                            int i5 = c3 + c4 + i;
                            int i6 = c4 + i;
                            int i7 = ((((((((((i4 + i5) + i6) + i4) - i5) + i6) - i4) + i5) - i6) + i4) + i5) - i6;
                            if ((((((((((((((((((((c + c2) + c3) + c4) + i) - i4) - i5) + i4) - i5) - i6) + i4) - i5) - i6) + i4) - i5) - i6) % 2) + (i7 % 2)) + ((((((((((((i7 - i5) - i6) + i7) - i5) - i6) + i7) - i5) - i6) + i7) - i5) - i6) % 2)) + (i6 % 2)) + (i % 2) == 0) {
                            }
                        }
                    } catch (Exception unused2) {
                        c4 = 0;
                        i = 0;
                        while (i2 < length) {
                        }
                        int i42 = c2 + c3 + c4 + i;
                        int i52 = c3 + c4 + i;
                        int i62 = c4 + i;
                        int i72 = ((((((((((i42 + i52) + i62) + i42) - i52) + i62) - i42) + i52) - i62) + i42) + i52) - i62;
                        if ((((((((((((((((((((c + c2) + c3) + c4) + i) - i42) - i52) + i42) - i52) - i62) + i42) - i52) - i62) + i42) - i52) - i62) % 2) + (i72 % 2)) + ((((((((((((i72 - i52) - i62) + i72) - i52) - i62) + i72) - i52) - i62) + i72) - i52) - i62) % 2)) + (i62 % 2)) + (i % 2) == 0) {
                        }
                    }
                } catch (Exception unused3) {
                    c3 = 0;
                    c4 = 0;
                    i = 0;
                    while (i2 < length) {
                    }
                    int i422 = c2 + c3 + c4 + i;
                    int i522 = c3 + c4 + i;
                    int i622 = c4 + i;
                    int i722 = ((((((((((i422 + i522) + i622) + i422) - i522) + i622) - i422) + i522) - i622) + i422) + i522) - i622;
                    if ((((((((((((((((((((c + c2) + c3) + c4) + i) - i422) - i522) + i422) - i522) - i622) + i422) - i522) - i622) + i422) - i522) - i622) % 2) + (i722 % 2)) + ((((((((((((i722 - i522) - i622) + i722) - i522) - i622) + i722) - i522) - i622) + i722) - i522) - i622) % 2)) + (i622 % 2)) + (i % 2) == 0) {
                    }
                }
            } catch (Exception unused4) {
                c2 = 0;
                c3 = 0;
                c4 = 0;
                i = 0;
                while (i2 < length) {
                }
                int i4222 = c2 + c3 + c4 + i;
                int i5222 = c3 + c4 + i;
                int i6222 = c4 + i;
                int i7222 = ((((((((((i4222 + i5222) + i6222) + i4222) - i5222) + i6222) - i4222) + i5222) - i6222) + i4222) + i5222) - i6222;
                if ((((((((((((((((((((c + c2) + c3) + c4) + i) - i4222) - i5222) + i4222) - i5222) - i6222) + i4222) - i5222) - i6222) + i4222) - i5222) - i6222) % 2) + (i7222 % 2)) + ((((((((((((i7222 - i5222) - i6222) + i7222) - i5222) - i6222) + i7222) - i5222) - i6222) + i7222) - i5222) - i6222) % 2)) + (i6222 % 2)) + (i % 2) == 0) {
                }
            }
        } catch (Exception unused5) {
            c = 0;
        }
        for (i2 = 0; i2 < length; i2++) {
            i += str.charAt(i2);
        }
        int i42222 = c2 + c3 + c4 + i;
        int i52222 = c3 + c4 + i;
        int i62222 = c4 + i;
        int i72222 = ((((((((((i42222 + i52222) + i62222) + i42222) - i52222) + i62222) - i42222) + i52222) - i62222) + i42222) + i52222) - i62222;
        return (((((((((((((((((((c + c2) + c3) + c4) + i) - i42222) - i52222) + i42222) - i52222) - i62222) + i42222) - i52222) - i62222) + i42222) - i52222) - i62222) % 2) + (i72222 % 2)) + ((((((((((((i72222 - i52222) - i62222) + i72222) - i52222) - i62222) + i72222) - i52222) - i62222) + i72222) - i52222) - i62222) % 2)) + (i62222 % 2)) + (i % 2) == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean notValidLoad(String str) {
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        int length = str.length();
        int i = length - 1;
        try {
            c = str.charAt(Math.min(i, 1));
            try {
                c2 = str.charAt(Math.min(i, 2));
                try {
                    c3 = str.charAt(Math.min(i, length / 4));
                    try {
                        c4 = str.charAt(Math.max(i, length / 8));
                        try {
                            c5 = str.charAt(Math.min(i, length / 16));
                        } catch (Exception unused) {
                            c5 = 0;
                            int i2 = c2 + c3 + c4 + c5;
                            int i3 = c3 + c4 + c5;
                            int i4 = c4 + c5;
                            int i5 = (((((((((((i2 + i3) + i4) + i2) - i3) + i4) - i2) + i3) - i4) + i2) + i3) - i4) % 255;
                            int i6 = i5 % 2;
                            int i7 = ((((((((((((i5 - i3) - i4) + i5) - i3) - i4) + i5) - i3) - i4) + i5) - i3) - i4) % 255) % 2;
                            int i8 = i4 % 2;
                            if ((((((((((((((((((((((((c + c2) + c3) + c4) + c5) - i2) - i3) + i2) - i3) - i4) + i2) - i3) - i4) + i2) - i3) - i4) % 255) % 2) + i6) + i7) + i8) + (((i6 + i7) + i8) + (c5 % 2))) + (((i6 + i6) + i6) + i6)) + (((i7 + i7) + i7) + i7)) + (((i8 + i8) + i8) + i8) == 22) {
                            }
                        }
                    } catch (Exception unused2) {
                        c4 = 0;
                        c5 = 0;
                        int i22 = c2 + c3 + c4 + c5;
                        int i32 = c3 + c4 + c5;
                        int i42 = c4 + c5;
                        int i52 = (((((((((((i22 + i32) + i42) + i22) - i32) + i42) - i22) + i32) - i42) + i22) + i32) - i42) % 255;
                        int i62 = i52 % 2;
                        int i72 = ((((((((((((i52 - i32) - i42) + i52) - i32) - i42) + i52) - i32) - i42) + i52) - i32) - i42) % 255) % 2;
                        int i82 = i42 % 2;
                        if ((((((((((((((((((((((((c + c2) + c3) + c4) + c5) - i22) - i32) + i22) - i32) - i42) + i22) - i32) - i42) + i22) - i32) - i42) % 255) % 2) + i62) + i72) + i82) + (((i62 + i72) + i82) + (c5 % 2))) + (((i62 + i62) + i62) + i62)) + (((i72 + i72) + i72) + i72)) + (((i82 + i82) + i82) + i82) == 22) {
                        }
                    }
                } catch (Exception unused3) {
                    c3 = 0;
                    c4 = 0;
                    c5 = 0;
                    int i222 = c2 + c3 + c4 + c5;
                    int i322 = c3 + c4 + c5;
                    int i422 = c4 + c5;
                    int i522 = (((((((((((i222 + i322) + i422) + i222) - i322) + i422) - i222) + i322) - i422) + i222) + i322) - i422) % 255;
                    int i622 = i522 % 2;
                    int i722 = ((((((((((((i522 - i322) - i422) + i522) - i322) - i422) + i522) - i322) - i422) + i522) - i322) - i422) % 255) % 2;
                    int i822 = i422 % 2;
                    if ((((((((((((((((((((((((c + c2) + c3) + c4) + c5) - i222) - i322) + i222) - i322) - i422) + i222) - i322) - i422) + i222) - i322) - i422) % 255) % 2) + i622) + i722) + i822) + (((i622 + i722) + i822) + (c5 % 2))) + (((i622 + i622) + i622) + i622)) + (((i722 + i722) + i722) + i722)) + (((i822 + i822) + i822) + i822) == 22) {
                    }
                }
            } catch (Exception unused4) {
                c2 = 0;
                c3 = 0;
                c4 = 0;
                c5 = 0;
                int i2222 = c2 + c3 + c4 + c5;
                int i3222 = c3 + c4 + c5;
                int i4222 = c4 + c5;
                int i5222 = (((((((((((i2222 + i3222) + i4222) + i2222) - i3222) + i4222) - i2222) + i3222) - i4222) + i2222) + i3222) - i4222) % 255;
                int i6222 = i5222 % 2;
                int i7222 = ((((((((((((i5222 - i3222) - i4222) + i5222) - i3222) - i4222) + i5222) - i3222) - i4222) + i5222) - i3222) - i4222) % 255) % 2;
                int i8222 = i4222 % 2;
                if ((((((((((((((((((((((((c + c2) + c3) + c4) + c5) - i2222) - i3222) + i2222) - i3222) - i4222) + i2222) - i3222) - i4222) + i2222) - i3222) - i4222) % 255) % 2) + i6222) + i7222) + i8222) + (((i6222 + i7222) + i8222) + (c5 % 2))) + (((i6222 + i6222) + i6222) + i6222)) + (((i7222 + i7222) + i7222) + i7222)) + (((i8222 + i8222) + i8222) + i8222) == 22) {
                }
            }
        } catch (Exception unused5) {
            c = 0;
        }
        int i22222 = c2 + c3 + c4 + c5;
        int i32222 = c3 + c4 + c5;
        int i42222 = c4 + c5;
        int i52222 = (((((((((((i22222 + i32222) + i42222) + i22222) - i32222) + i42222) - i22222) + i32222) - i42222) + i22222) + i32222) - i42222) % 255;
        int i62222 = i52222 % 2;
        int i72222 = ((((((((((((i52222 - i32222) - i42222) + i52222) - i32222) - i42222) + i52222) - i32222) - i42222) + i52222) - i32222) - i42222) % 255) % 2;
        int i82222 = i42222 % 2;
        return (((((((((((((((((((((((c + c2) + c3) + c4) + c5) - i22222) - i32222) + i22222) - i32222) - i42222) + i22222) - i32222) - i42222) + i22222) - i32222) - i42222) % 255) % 2) + i62222) + i72222) + i82222) + (((i62222 + i72222) + i82222) + (c5 % 2))) + (((i62222 + i62222) + i62222) + i62222)) + (((i72222 + i72222) + i72222) + i72222)) + (((i82222 + i82222) + i82222) + i82222) == 22;
    }

    public static String getLoad(int[] iArr) {
        Assert.assertNotNull(iArr);
        int i = 0;
        while (true) {
            String nextString = randomString.nextString();
            if (validLoad(nextString)) {
                iArr[0] = i;
                return nextString;
            } else if (notValidLoad(nextString)) {
                while (true) {
                    String nextString2 = randomString0.nextString();
                    if (validLoad(nextString2)) {
                        iArr[0] = i;
                        return nextString2;
                    } else if (notValidLoad(nextString2)) {
                        while (true) {
                            String nextString3 = randomString1.nextString();
                            if (validLoad(nextString3)) {
                                iArr[0] = i;
                                return nextString3;
                            } else if (notValidLoad(nextString3)) {
                                while (true) {
                                    String nextString4 = randomString2.nextString();
                                    if (validLoad(nextString4)) {
                                        iArr[0] = i;
                                        return nextString4;
                                    }
                                    i++;
                                }
                            } else {
                                i++;
                            }
                        }
                    } else {
                        i++;
                    }
                }
            } else {
                i++;
            }
        }
    }

    public static boolean isLoadValid(String str) {
        return !notValidLoad(str) && validLoad(str);
    }

    public static void test() {
        int[] iArr = {0};
        Assert.assertTrue(isLoadValid(""));
        for (int i = 0; i < 200; i++) {
            String load = getLoad(iArr);
            Assert.assertFalse(notValidLoad(randomString.nextString()));
            Assert.assertTrue(isLoadValid(load));
        }
    }
}
