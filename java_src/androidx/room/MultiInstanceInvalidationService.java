package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import androidx.room.b;
import java.util.HashMap;
/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {
    public int p = 0;
    public final HashMap<Integer, String> q = new HashMap<>();
    public final RemoteCallbackList<androidx.room.a> r = new a();
    public final b.a s = new b();

    /* loaded from: classes.dex */
    public class a extends RemoteCallbackList<androidx.room.a> {
        public a() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a */
        public void onCallbackDied(androidx.room.a aVar, Object obj) {
            MultiInstanceInvalidationService.this.q.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* loaded from: classes.dex */
    public class b extends b.a {
        public b() {
        }

        @Override // androidx.room.b
        public int J0(androidx.room.a aVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.r) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.p + 1;
                multiInstanceInvalidationService.p = i;
                if (multiInstanceInvalidationService.r.register(aVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.q.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.p--;
                return 0;
            }
        }

        @Override // androidx.room.b
        public void M2(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.r) {
                String str = MultiInstanceInvalidationService.this.q.get(Integer.valueOf(i));
                if (str == null) {
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.r.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    int intValue = ((Integer) MultiInstanceInvalidationService.this.r.getBroadcastCookie(i2)).intValue();
                    String str2 = MultiInstanceInvalidationService.this.q.get(Integer.valueOf(intValue));
                    if (i != intValue && str.equals(str2)) {
                        try {
                            MultiInstanceInvalidationService.this.r.getBroadcastItem(i2).s0(strArr);
                        } catch (RemoteException unused) {
                        }
                    }
                }
                MultiInstanceInvalidationService.this.r.finishBroadcast();
            }
        }

        @Override // androidx.room.b
        public void X2(androidx.room.a aVar, int i) {
            synchronized (MultiInstanceInvalidationService.this.r) {
                MultiInstanceInvalidationService.this.r.unregister(aVar);
                MultiInstanceInvalidationService.this.q.remove(Integer.valueOf(i));
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.s;
    }
}
