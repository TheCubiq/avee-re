package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import androidx.room.InterfaceC0468b;
import java.util.HashMap;
/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: p */
    public int f2278p = 0;

    /* renamed from: q */
    public final HashMap<Integer, String> f2279q = new HashMap<>();

    /* renamed from: r */
    public final RemoteCallbackList<InterfaceC0465a> f2280r = new RemoteCallbackListC0463a();

    /* renamed from: s */
    public final InterfaceC0468b.AbstractBinderC0469a f2281s = new BinderC0464b();

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    /* loaded from: classes.dex */
    public class RemoteCallbackListC0463a extends RemoteCallbackList<InterfaceC0465a> {
        public RemoteCallbackListC0463a() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a */
        public void onCallbackDied(InterfaceC0465a interfaceC0465a, Object obj) {
            MultiInstanceInvalidationService.this.f2279q.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    /* loaded from: classes.dex */
    public class BinderC0464b extends InterfaceC0468b.AbstractBinderC0469a {
        public BinderC0464b() {
        }

        @Override // androidx.room.InterfaceC0468b
        /* renamed from: J0 */
        public int mo28089J0(InterfaceC0465a interfaceC0465a, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f2280r) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f2278p + 1;
                multiInstanceInvalidationService.f2278p = i;
                if (multiInstanceInvalidationService.f2280r.register(interfaceC0465a, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f2279q.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f2278p--;
                return 0;
            }
        }

        @Override // androidx.room.InterfaceC0468b
        /* renamed from: M2 */
        public void mo28088M2(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f2280r) {
                String str = MultiInstanceInvalidationService.this.f2279q.get(Integer.valueOf(i));
                if (str == null) {
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f2280r.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    int intValue = ((Integer) MultiInstanceInvalidationService.this.f2280r.getBroadcastCookie(i2)).intValue();
                    String str2 = MultiInstanceInvalidationService.this.f2279q.get(Integer.valueOf(intValue));
                    if (i != intValue && str.equals(str2)) {
                        try {
                            MultiInstanceInvalidationService.this.f2280r.getBroadcastItem(i2).mo28066s0(strArr);
                        } catch (RemoteException unused) {
                        }
                    }
                }
                MultiInstanceInvalidationService.this.f2280r.finishBroadcast();
            }
        }

        @Override // androidx.room.InterfaceC0468b
        /* renamed from: X2 */
        public void mo28087X2(InterfaceC0465a interfaceC0465a, int i) {
            synchronized (MultiInstanceInvalidationService.this.f2280r) {
                MultiInstanceInvalidationService.this.f2280r.unregister(interfaceC0465a);
                MultiInstanceInvalidationService.this.f2279q.remove(Integer.valueOf(i));
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f2281s;
    }
}
