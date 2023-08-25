package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.daaw.pt0;
import com.daaw.ty0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f1168k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f1169a;

    /* renamed from: b */
    public Object f1170b;

    /* renamed from: c */
    public byte[] f1171c;

    /* renamed from: d */
    public Parcelable f1172d;

    /* renamed from: e */
    public int f1173e;

    /* renamed from: f */
    public int f1174f;

    /* renamed from: g */
    public ColorStateList f1175g;

    /* renamed from: h */
    public PorterDuff.Mode f1176h;

    /* renamed from: i */
    public String f1177i;

    /* renamed from: j */
    public String f1178j;

    /* renamed from: androidx.core.graphics.drawable.IconCompat$a */
    /* loaded from: classes.dex */
    public static class C0204a {
        /* renamed from: a */
        public static IconCompat m29715a(Object obj) {
            ty0.m8699f(obj);
            int m29712d = m29712d(obj);
            if (m29712d != 2) {
                if (m29712d != 4) {
                    if (m29712d != 6) {
                        IconCompat iconCompat = new IconCompat(-1);
                        iconCompat.f1170b = obj;
                        return iconCompat;
                    }
                    return IconCompat.m29730c(m29711e(obj));
                }
                return IconCompat.m29728e(m29711e(obj));
            }
            return IconCompat.m29726g(null, m29713c(obj), m29714b(obj));
        }

        /* renamed from: b */
        public static int m29714b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0206c.m29706a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }

        /* renamed from: c */
        public static String m29713c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0206c.m29705b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        /* renamed from: d */
        public static int m29712d(Object obj) {
            StringBuilder sb;
            if (Build.VERSION.SDK_INT >= 28) {
                return C0206c.m29704c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException unused) {
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                return -1;
            } catch (NoSuchMethodException unused2) {
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                return -1;
            } catch (InvocationTargetException unused3) {
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                return -1;
            }
        }

        /* renamed from: e */
        public static Uri m29711e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0206c.m29703d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        /* renamed from: f */
        public static Drawable m29710f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
            if (r0 >= 26) goto L23;
         */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Icon m29709g(IconCompat iconCompat, Context context) {
            Bitmap bitmap;
            Icon createWithResource;
            Bitmap bitmap2;
            switch (iconCompat.f1169a) {
                case -1:
                    return (Icon) iconCompat.f1170b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    bitmap = (Bitmap) iconCompat.f1170b;
                    createWithResource = Icon.createWithBitmap(bitmap);
                    break;
                case 2:
                    createWithResource = Icon.createWithResource(iconCompat.m29724i(), iconCompat.f1173e);
                    break;
                case 3:
                    createWithResource = Icon.createWithData((byte[]) iconCompat.f1170b, iconCompat.f1173e, iconCompat.f1174f);
                    break;
                case 4:
                    createWithResource = Icon.createWithContentUri((String) iconCompat.f1170b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        bitmap2 = (Bitmap) iconCompat.f1170b;
                        bitmap = IconCompat.m29731b(bitmap2, false);
                        createWithResource = Icon.createWithBitmap(bitmap);
                        break;
                    } else {
                        bitmap2 = (Bitmap) iconCompat.f1170b;
                        createWithResource = C0205b.m29707b(bitmap2);
                        break;
                    }
                case 6:
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        createWithResource = C0207d.m29702a(iconCompat.m29722k());
                        break;
                    } else if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m29722k());
                    } else {
                        InputStream m29721l = iconCompat.m29721l(context);
                        if (m29721l == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.m29722k());
                        }
                        bitmap2 = BitmapFactory.decodeStream(m29721l);
                        break;
                    }
            }
            ColorStateList colorStateList = iconCompat.f1175g;
            if (colorStateList != null) {
                createWithResource.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f1176h;
            if (mode != IconCompat.f1168k) {
                createWithResource.setTintMode(mode);
            }
            return createWithResource;
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$b */
    /* loaded from: classes.dex */
    public static class C0205b {
        /* renamed from: a */
        public static Drawable m29708a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        /* renamed from: b */
        public static Icon m29707b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$c */
    /* loaded from: classes.dex */
    public static class C0206c {
        /* renamed from: a */
        public static int m29706a(Object obj) {
            return ((Icon) obj).getResId();
        }

        /* renamed from: b */
        public static String m29705b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        /* renamed from: c */
        public static int m29704c(Object obj) {
            return ((Icon) obj).getType();
        }

        /* renamed from: d */
        public static Uri m29703d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$d */
    /* loaded from: classes.dex */
    public static class C0207d {
        /* renamed from: a */
        public static Icon m29702a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f1169a = -1;
        this.f1171c = null;
        this.f1172d = null;
        this.f1173e = 0;
        this.f1174f = 0;
        this.f1175g = null;
        this.f1176h = f1168k;
        this.f1177i = null;
    }

    public IconCompat(int i) {
        this.f1171c = null;
        this.f1172d = null;
        this.f1173e = 0;
        this.f1174f = 0;
        this.f1175g = null;
        this.f1176h = f1168k;
        this.f1177i = null;
        this.f1169a = i;
    }

    /* renamed from: a */
    public static IconCompat m29732a(Icon icon) {
        return C0204a.m29715a(icon);
    }

    /* renamed from: b */
    public static Bitmap m29731b(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: c */
    public static IconCompat m29730c(Uri uri) {
        pt0.m13158c(uri);
        return m29729d(uri.toString());
    }

    /* renamed from: d */
    public static IconCompat m29729d(String str) {
        pt0.m13158c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f1170b = str;
        return iconCompat;
    }

    /* renamed from: e */
    public static IconCompat m29728e(Uri uri) {
        pt0.m13158c(uri);
        return m29727f(uri.toString());
    }

    /* renamed from: f */
    public static IconCompat m29727f(String str) {
        pt0.m13158c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f1170b = str;
        return iconCompat;
    }

    /* renamed from: g */
    public static IconCompat m29726g(Resources resources, String str, int i) {
        pt0.m13158c(str);
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f1173e = i;
            if (resources != null) {
                try {
                    iconCompat.f1170b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f1170b = str;
            }
            iconCompat.f1178j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    /* renamed from: q */
    public static String m29716q(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: h */
    public int m29725h() {
        int i = this.f1169a;
        if (i != -1 || Build.VERSION.SDK_INT < 23) {
            if (i == 2) {
                return this.f1173e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        return C0204a.m29714b(this.f1170b);
    }

    /* renamed from: i */
    public String m29724i() {
        int i = this.f1169a;
        if (i != -1 || Build.VERSION.SDK_INT < 23) {
            if (i == 2) {
                String str = this.f1178j;
                return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f1170b).split(":", -1)[0] : this.f1178j;
            }
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        return C0204a.m29713c(this.f1170b);
    }

    /* renamed from: j */
    public int m29723j() {
        int i = this.f1169a;
        return (i != -1 || Build.VERSION.SDK_INT < 23) ? i : C0204a.m29712d(this.f1170b);
    }

    /* renamed from: k */
    public Uri m29722k() {
        int i = this.f1169a;
        if (i != -1 || Build.VERSION.SDK_INT < 23) {
            if (i == 4 || i == 6) {
                return Uri.parse((String) this.f1170b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        return C0204a.m29711e(this.f1170b);
    }

    /* renamed from: l */
    public InputStream m29721l(Context context) {
        StringBuilder sb;
        String str;
        Uri m29722k = m29722k();
        String scheme = m29722k.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(m29722k);
            } catch (Exception unused) {
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f1170b));
            } catch (FileNotFoundException unused2) {
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(m29722k);
        return null;
    }

    /* renamed from: m */
    public void m29720m() {
        Parcelable parcelable;
        this.f1176h = PorterDuff.Mode.valueOf(this.f1177i);
        switch (this.f1169a) {
            case -1:
                parcelable = this.f1172d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f1172d;
                if (parcelable == null) {
                    byte[] bArr = this.f1171c;
                    this.f1170b = bArr;
                    this.f1169a = 3;
                    this.f1173e = 0;
                    this.f1174f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f1171c, Charset.forName("UTF-16"));
                this.f1170b = str;
                if (this.f1169a == 2 && this.f1178j == null) {
                    this.f1178j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f1170b = this.f1171c;
                return;
        }
        this.f1170b = parcelable;
    }

    /* renamed from: n */
    public void m29719n(boolean z) {
        this.f1177i = this.f1176h.name();
        switch (this.f1169a) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f1170b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f1171c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f1171c = ((String) this.f1170b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f1171c = (byte[]) this.f1170b;
                return;
            case 4:
            case 6:
                this.f1171c = this.f1170b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f1172d = (Parcelable) this.f1170b;
    }

    @Deprecated
    /* renamed from: o */
    public Icon m29718o() {
        return m29717p(null);
    }

    /* renamed from: p */
    public Icon m29717p(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0204a.m29709g(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public String toString() {
        int height;
        if (this.f1169a == -1) {
            return String.valueOf(this.f1170b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m29716q(this.f1169a));
        switch (this.f1169a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1170b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f1170b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1178j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m29725h())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1173e);
                if (this.f1174f != 0) {
                    sb.append(" off=");
                    height = this.f1174f;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1170b);
                break;
        }
        if (this.f1175g != null) {
            sb.append(" tint=");
            sb.append(this.f1175g);
        }
        if (this.f1176h != f1168k) {
            sb.append(" mode=");
            sb.append(this.f1176h);
        }
        sb.append(")");
        return sb.toString();
    }
}
