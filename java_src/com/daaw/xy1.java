package com.daaw;

import android.net.Uri;
import android.os.Build;
import com.daaw.C3552xk;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
/* loaded from: classes.dex */
public class xy1 {

    /* renamed from: com.daaw.xy1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C3652a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33113a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f33114b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f33115c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f33116d;

        static {
            int[] iArr = new int[zu0.values().length];
            f33116d = iArr;
            try {
                iArr[zu0.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33116d[zu0.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[qs0.values().length];
            f33115c = iArr2;
            try {
                iArr2[qs0.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33115c[qs0.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33115c[qs0.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33115c[qs0.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33115c[qs0.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[EnumC1520ha.values().length];
            f33114b = iArr3;
            try {
                iArr3[EnumC1520ha.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f33114b[EnumC1520ha.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[yx1.values().length];
            f33113a = iArr4;
            try {
                iArr4[yx1.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f33113a[yx1.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f33113a[yx1.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f33113a[yx1.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f33113a[yx1.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f33113a[yx1.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* renamed from: a */
    public static int m4410a(EnumC1520ha enumC1520ha) {
        int i = C3652a.f33114b[enumC1520ha.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            throw new IllegalArgumentException("Could not convert " + enumC1520ha + " to int");
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0053 -> B:33:0x0056). Please submit an issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3552xk m4409b(byte[] bArr) {
        ObjectInputStream objectInputStream;
        Throwable th;
        IOException e;
        C3552xk c3552xk = new C3552xk();
        if (bArr == null) {
            return c3552xk;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    try {
                        for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                            c3552xk.m5040a(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean());
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                        byteArrayInputStream.close();
                    } catch (IOException e3) {
                        e = e3;
                        e.printStackTrace();
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        byteArrayInputStream.close();
                        return c3552xk;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (objectInputStream != null) {
                        try {
                            objectInputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                    throw th;
                }
            } catch (IOException e7) {
                e7.printStackTrace();
            }
        } catch (IOException e8) {
            objectInputStream = null;
            e = e8;
        } catch (Throwable th3) {
            objectInputStream = null;
            th = th3;
            if (objectInputStream != null) {
            }
            byteArrayInputStream.close();
            throw th;
        }
        return c3552xk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0067 -> B:35:0x006a). Please submit an issue!!! */
    /* renamed from: c */
    public static byte[] m4408c(C3552xk c3552xk) {
        ObjectOutputStream objectOutputStream;
        boolean hasNext;
        ObjectOutputStream objectOutputStream2 = null;
        ObjectOutputStream objectOutputStream3 = null;
        objectOutputStream2 = null;
        if (c3552xk.m5038c() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e) {
                e = e;
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            objectOutputStream2 = objectOutputStream2;
        }
        try {
            objectOutputStream.writeInt(c3552xk.m5038c());
            Iterator<C3552xk.C3553a> it = c3552xk.m5039b().iterator();
            while (true) {
                hasNext = it.hasNext();
                if (hasNext != 0) {
                    C3552xk.C3553a next = it.next();
                    objectOutputStream.writeUTF(next.m5037a().toString());
                    objectOutputStream.writeBoolean(next.m5036b());
                } else {
                    try {
                        break;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
            }
            objectOutputStream.close();
            byteArrayOutputStream.close();
            objectOutputStream2 = hasNext;
        } catch (IOException e4) {
            e = e4;
            objectOutputStream3 = objectOutputStream;
            e.printStackTrace();
            if (objectOutputStream3 != null) {
                try {
                    objectOutputStream3.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            byteArrayOutputStream.close();
            objectOutputStream2 = objectOutputStream3;
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e7) {
                e7.printStackTrace();
            }
            throw th;
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: d */
    public static EnumC1520ha m4407d(int i) {
        if (i != 0) {
            if (i == 1) {
                return EnumC1520ha.LINEAR;
            }
            throw new IllegalArgumentException("Could not convert " + i + " to BackoffPolicy");
        }
        return EnumC1520ha.EXPONENTIAL;
    }

    /* renamed from: e */
    public static qs0 m4406e(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (Build.VERSION.SDK_INT < 30 || i != 5) {
                                throw new IllegalArgumentException("Could not convert " + i + " to NetworkType");
                            }
                            return qs0.TEMPORARILY_UNMETERED;
                        }
                        return qs0.METERED;
                    }
                    return qs0.NOT_ROAMING;
                }
                return qs0.UNMETERED;
            }
            return qs0.CONNECTED;
        }
        return qs0.NOT_REQUIRED;
    }

    /* renamed from: f */
    public static zu0 m4405f(int i) {
        if (i != 0) {
            if (i == 1) {
                return zu0.DROP_WORK_REQUEST;
            }
            throw new IllegalArgumentException("Could not convert " + i + " to OutOfQuotaPolicy");
        }
        return zu0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    }

    /* renamed from: g */
    public static yx1 m4404g(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return yx1.CANCELLED;
                            }
                            throw new IllegalArgumentException("Could not convert " + i + " to State");
                        }
                        return yx1.BLOCKED;
                    }
                    return yx1.FAILED;
                }
                return yx1.SUCCEEDED;
            }
            return yx1.RUNNING;
        }
        return yx1.ENQUEUED;
    }

    /* renamed from: h */
    public static int m4403h(qs0 qs0Var) {
        int i = C3652a.f33115c[qs0Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (Build.VERSION.SDK_INT < 30 || qs0Var != qs0.TEMPORARILY_UNMETERED) {
                                throw new IllegalArgumentException("Could not convert " + qs0Var + " to int");
                            }
                            return 5;
                        }
                        return 4;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    /* renamed from: i */
    public static int m4402i(zu0 zu0Var) {
        int i = C3652a.f33116d[zu0Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            throw new IllegalArgumentException("Could not convert " + zu0Var + " to int");
        }
        return 0;
    }

    /* renamed from: j */
    public static int m4401j(yx1 yx1Var) {
        switch (C3652a.f33113a[yx1Var.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + yx1Var + " to int");
        }
    }
}
