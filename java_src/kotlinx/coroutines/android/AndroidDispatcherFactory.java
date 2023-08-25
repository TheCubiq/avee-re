package kotlinx.coroutines.android;

import android.os.Looper;
import com.daaw.r80;
import com.daaw.rm0;
import com.daaw.sm0;
import com.daaw.t80;
import java.util.List;
/* loaded from: classes2.dex */
public final class AndroidDispatcherFactory implements sm0 {
    @Override // com.daaw.sm0
    public rm0 createDispatcher(List<? extends sm0> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new r80(t80.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // com.daaw.sm0
    public int getLoadPriority() {
        return 1073741823;
    }

    @Override // com.daaw.sm0
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
