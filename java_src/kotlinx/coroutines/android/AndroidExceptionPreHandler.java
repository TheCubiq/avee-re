package kotlinx.coroutines.android;

import android.os.Build;
import androidx.annotation.Keep;
import com.daaw.AbstractC1347g;
import com.daaw.InterfaceC2307nl;
import com.daaw.InterfaceC2739ql;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
@Keep
/* loaded from: classes2.dex */
public final class AndroidExceptionPreHandler extends AbstractC1347g implements InterfaceC2739ql {
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(InterfaceC2739ql.f24127c);
        this._preHandler = this;
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z = true;
                }
            }
            if (z) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // com.daaw.InterfaceC2739ql
    public void handleException(InterfaceC2307nl interfaceC2307nl, Throwable th) {
        int i = Build.VERSION.SDK_INT;
        if (26 <= i && i < 28) {
            Method preHandler = preHandler();
            Object invoke = preHandler == null ? null : preHandler.invoke(null, new Object[0]);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
            if (uncaughtExceptionHandler == null) {
                return;
            }
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
