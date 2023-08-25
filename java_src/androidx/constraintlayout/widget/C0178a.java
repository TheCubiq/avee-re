package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.daaw.p21;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: androidx.constraintlayout.widget.a */
/* loaded from: classes.dex */
public class C0178a {

    /* renamed from: a */
    public String f966a;

    /* renamed from: b */
    public EnumC0180b f967b;

    /* renamed from: c */
    public int f968c;

    /* renamed from: d */
    public float f969d;

    /* renamed from: e */
    public String f970e;

    /* renamed from: f */
    public boolean f971f;

    /* renamed from: g */
    public int f972g;

    /* renamed from: androidx.constraintlayout.widget.a$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0179a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f973a;

        static {
            int[] iArr = new int[EnumC0180b.values().length];
            f973a = iArr;
            try {
                iArr[EnumC0180b.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f973a[EnumC0180b.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f973a[EnumC0180b.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f973a[EnumC0180b.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f973a[EnumC0180b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f973a[EnumC0180b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f973a[EnumC0180b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$b */
    /* loaded from: classes.dex */
    public enum EnumC0180b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public C0178a(C0178a c0178a, Object obj) {
        this.f966a = c0178a.f966a;
        this.f967b = c0178a.f967b;
        m29873d(obj);
    }

    public C0178a(String str, EnumC0180b enumC0180b, Object obj) {
        this.f966a = str;
        this.f967b = enumC0180b;
        m29873d(obj);
    }

    /* renamed from: a */
    public static HashMap<String, C0178a> m29876a(HashMap<String, C0178a> hashMap, View view) {
        HashMap<String, C0178a> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C0178a c0178a = hashMap.get(str);
            try {
                hashMap2.put(str, str.equals("BackgroundColor") ? new C0178a(c0178a, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())) : new C0178a(c0178a, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap2;
    }

    /* renamed from: b */
    public static void m29875b(Context context, XmlPullParser xmlPullParser, HashMap<String, C0178a> hashMap) {
        EnumC0180b enumC0180b;
        Object string;
        int integer;
        float f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), p21.f22222B2);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        EnumC0180b enumC0180b2 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == p21.f22228C2) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == p21.f22234D2) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                enumC0180b2 = EnumC0180b.BOOLEAN_TYPE;
            } else {
                if (index == p21.f22246F2) {
                    enumC0180b = EnumC0180b.COLOR_TYPE;
                } else if (index == p21.f22240E2) {
                    enumC0180b = EnumC0180b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == p21.f22270J2) {
                        enumC0180b = EnumC0180b.DIMENSION_TYPE;
                        f = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == p21.f22252G2) {
                        enumC0180b = EnumC0180b.DIMENSION_TYPE;
                        f = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == p21.f22258H2) {
                        enumC0180b = EnumC0180b.FLOAT_TYPE;
                        f = obtainStyledAttributes.getFloat(index, Float.NaN);
                    } else if (index == p21.f22264I2) {
                        enumC0180b = EnumC0180b.INT_TYPE;
                        integer = obtainStyledAttributes.getInteger(index, -1);
                        string = Integer.valueOf(integer);
                        Object obj2 = string;
                        enumC0180b2 = enumC0180b;
                        obj = obj2;
                    } else if (index == p21.f22276K2) {
                        enumC0180b = EnumC0180b.STRING_TYPE;
                        string = obtainStyledAttributes.getString(index);
                        Object obj22 = string;
                        enumC0180b2 = enumC0180b;
                        obj = obj22;
                    }
                    string = Float.valueOf(f);
                    Object obj222 = string;
                    enumC0180b2 = enumC0180b;
                    obj = obj222;
                }
                integer = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(integer);
                Object obj2222 = string;
                enumC0180b2 = enumC0180b;
                obj = obj2222;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new C0178a(str, enumC0180b2, obj));
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public static void m29874c(View view, HashMap<String, C0178a> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C0178a c0178a = hashMap.get(str);
            String str2 = "set" + str;
            try {
                switch (C0179a.f973a[c0178a.f967b.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c0178a.f972g));
                        break;
                    case 2:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(c0178a.f972g);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(c0178a.f968c));
                        break;
                    case 4:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(c0178a.f969d));
                        break;
                    case 5:
                        cls.getMethod(str2, CharSequence.class).invoke(view, c0178a.f970e);
                        break;
                    case 6:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(c0178a.f971f));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(c0178a.f969d));
                        break;
                }
            } catch (IllegalAccessException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.getMessage();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" Custom Attribute \"");
                sb2.append(str);
                sb2.append("\" not found on ");
                sb2.append(cls.getName());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(cls.getName());
                sb3.append(" must have a method ");
                sb3.append(str2);
            } catch (InvocationTargetException e3) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(" Custom Attribute \"");
                sb4.append(str);
                sb4.append("\" not found on ");
                sb4.append(cls.getName());
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public void m29873d(Object obj) {
        switch (C0179a.f973a[this.f967b.ordinal()]) {
            case 1:
            case 2:
                this.f972g = ((Integer) obj).intValue();
                return;
            case 3:
                this.f968c = ((Integer) obj).intValue();
                return;
            case 4:
            case 7:
                this.f969d = ((Float) obj).floatValue();
                return;
            case 5:
                this.f970e = (String) obj;
                return;
            case 6:
                this.f971f = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}
