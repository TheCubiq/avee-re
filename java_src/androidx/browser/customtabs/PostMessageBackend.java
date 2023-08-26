package androidx.browser.customtabs;

import android.content.Context;
import android.os.Bundle;
/* loaded from: classes.dex */
public interface PostMessageBackend {
    void onDisconnectChannel(Context context);

    boolean onNotifyMessageChannelReady(Bundle bundle);

    boolean onPostMessage(String str, Bundle bundle);
}
