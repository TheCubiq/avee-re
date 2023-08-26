package com.google.android.exoplayer2.drm;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DefaultDrmSession<T extends ExoMediaCrypto> implements DrmSession<T> {
    private static final int MAX_LICENSE_DURATION_TO_RENEW = 60;
    private static final int MSG_KEYS = 1;
    private static final int MSG_PROVISION = 0;
    private static final String TAG = "DefaultDrmSession";
    final MediaDrmCallback callback;
    private final DefaultDrmSessionEventListener.EventDispatcher eventDispatcher;
    private final byte[] initData;
    private final int initialDrmRequestRetryCount;
    private DrmSession.DrmSessionException lastException;
    private T mediaCrypto;
    private final ExoMediaDrm<T> mediaDrm;
    private final String mimeType;
    private final int mode;
    private byte[] offlineLicenseKeySetId;
    private int openCount;
    private final HashMap<String, String> optionalKeyRequestParameters;
    private DefaultDrmSession<T>.PostRequestHandler postRequestHandler;
    final DefaultDrmSession<T>.PostResponseHandler postResponseHandler;
    private final ProvisioningManager<T> provisioningManager;
    private HandlerThread requestHandlerThread;
    private byte[] sessionId;
    private int state = 2;
    final UUID uuid;

    /* loaded from: classes.dex */
    public interface ProvisioningManager<T extends ExoMediaCrypto> {
        void onProvisionCompleted();

        void onProvisionError(Exception exc);

        void provisionRequired(DefaultDrmSession<T> defaultDrmSession);
    }

    public DefaultDrmSession(UUID uuid, ExoMediaDrm<T> exoMediaDrm, ProvisioningManager<T> provisioningManager, byte[] bArr, String str, int i, byte[] bArr2, HashMap<String, String> hashMap, MediaDrmCallback mediaDrmCallback, Looper looper, DefaultDrmSessionEventListener.EventDispatcher eventDispatcher, int i2) {
        this.uuid = uuid;
        this.provisioningManager = provisioningManager;
        this.mediaDrm = exoMediaDrm;
        this.mode = i;
        this.offlineLicenseKeySetId = bArr2;
        this.optionalKeyRequestParameters = hashMap;
        this.callback = mediaDrmCallback;
        this.initialDrmRequestRetryCount = i2;
        this.eventDispatcher = eventDispatcher;
        this.postResponseHandler = new PostResponseHandler(looper);
        HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
        this.requestHandlerThread = handlerThread;
        handlerThread.start();
        this.postRequestHandler = new PostRequestHandler(this.requestHandlerThread.getLooper());
        if (bArr2 == null) {
            this.initData = bArr;
            this.mimeType = str;
            return;
        }
        this.initData = null;
        this.mimeType = null;
    }

    public void acquire() {
        int i = this.openCount + 1;
        this.openCount = i;
        if (i == 1 && this.state != 1 && openInternal(true)) {
            doLicense(true);
        }
    }

    public boolean release() {
        int i = this.openCount - 1;
        this.openCount = i;
        if (i == 0) {
            this.state = 0;
            this.postResponseHandler.removeCallbacksAndMessages(null);
            this.postRequestHandler.removeCallbacksAndMessages(null);
            this.postRequestHandler = null;
            this.requestHandlerThread.quit();
            this.requestHandlerThread = null;
            this.mediaCrypto = null;
            this.lastException = null;
            byte[] bArr = this.sessionId;
            if (bArr != null) {
                this.mediaDrm.closeSession(bArr);
                this.sessionId = null;
            }
            return true;
        }
        return false;
    }

    public boolean hasInitData(byte[] bArr) {
        return Arrays.equals(this.initData, bArr);
    }

    public boolean hasSessionId(byte[] bArr) {
        return Arrays.equals(this.sessionId, bArr);
    }

    public void provision() {
        this.postRequestHandler.obtainMessage(0, (Object) this.mediaDrm.getProvisionRequest(), true).sendToTarget();
    }

    public void onProvisionCompleted() {
        if (openInternal(false)) {
            doLicense(true);
        }
    }

    public void onProvisionError(Exception exc) {
        onError(exc);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return this.state;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        if (this.state == 1) {
            return this.lastException;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final T getMediaCrypto() {
        return this.mediaCrypto;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public Map<String, String> queryKeyStatus() {
        byte[] bArr = this.sessionId;
        if (bArr == null) {
            return null;
        }
        return this.mediaDrm.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public byte[] getOfflineLicenseKeySetId() {
        return this.offlineLicenseKeySetId;
    }

    private boolean openInternal(boolean z) {
        if (isOpen()) {
            return true;
        }
        try {
            byte[] openSession = this.mediaDrm.openSession();
            this.sessionId = openSession;
            this.mediaCrypto = this.mediaDrm.createMediaCrypto(openSession);
            this.state = 3;
            return true;
        } catch (NotProvisionedException e) {
            if (z) {
                this.provisioningManager.provisionRequired(this);
                return false;
            }
            onError(e);
            return false;
        } catch (Exception e2) {
            onError(e2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProvisionResponse(Object obj) {
        if (this.state == 2 || isOpen()) {
            if (obj instanceof Exception) {
                this.provisioningManager.onProvisionError((Exception) obj);
                return;
            }
            try {
                this.mediaDrm.provideProvisionResponse((byte[]) obj);
                this.provisioningManager.onProvisionCompleted();
            } catch (Exception e) {
                this.provisioningManager.onProvisionError(e);
            }
        }
    }

    private void doLicense(boolean z) {
        int i = this.mode;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.offlineLicenseKeySetId == null) {
                    postKeyRequest(2, z);
                } else if (restoreKeys()) {
                    postKeyRequest(2, z);
                }
            } else if (i == 3 && restoreKeys()) {
                postKeyRequest(3, z);
            }
        } else if (this.offlineLicenseKeySetId == null) {
            postKeyRequest(1, z);
        } else if (this.state == 4 || restoreKeys()) {
            long licenseDurationRemainingSec = getLicenseDurationRemainingSec();
            if (this.mode != 0 || licenseDurationRemainingSec > 60) {
                if (licenseDurationRemainingSec <= 0) {
                    onError(new KeysExpiredException());
                    return;
                }
                this.state = 4;
                this.eventDispatcher.drmKeysRestored();
                return;
            }
            Log.d(TAG, "Offline license has expired or will expire soon. Remaining seconds: " + licenseDurationRemainingSec);
            postKeyRequest(2, z);
        }
    }

    private boolean restoreKeys() {
        try {
            this.mediaDrm.restoreKeys(this.sessionId, this.offlineLicenseKeySetId);
            return true;
        } catch (Exception e) {
            Log.e(TAG, "Error trying to restore Widevine keys.", e);
            onError(e);
            return false;
        }
    }

    private long getLicenseDurationRemainingSec() {
        if (C.WIDEVINE_UUID.equals(this.uuid)) {
            Pair<Long, Long> licenseDurationRemainingSec = WidevineUtil.getLicenseDurationRemainingSec(this);
            return Math.min(((Long) licenseDurationRemainingSec.first).longValue(), ((Long) licenseDurationRemainingSec.second).longValue());
        }
        return Long.MAX_VALUE;
    }

    private void postKeyRequest(int i, boolean z) {
        try {
            ExoMediaDrm.KeyRequest keyRequest = this.mediaDrm.getKeyRequest(i == 3 ? this.offlineLicenseKeySetId : this.sessionId, this.initData, this.mimeType, i, this.optionalKeyRequestParameters);
            if (C.CLEARKEY_UUID.equals(this.uuid)) {
                keyRequest = new ExoMediaDrm.DefaultKeyRequest(ClearKeyUtil.adjustRequestData(keyRequest.getData()), keyRequest.getDefaultUrl());
            }
            this.postRequestHandler.obtainMessage(1, keyRequest, z).sendToTarget();
        } catch (Exception e) {
            onKeysError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onKeyResponse(Object obj) {
        if (isOpen()) {
            if (obj instanceof Exception) {
                onKeysError((Exception) obj);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj;
                if (C.CLEARKEY_UUID.equals(this.uuid)) {
                    bArr = ClearKeyUtil.adjustResponseData(bArr);
                }
                if (this.mode == 3) {
                    this.mediaDrm.provideKeyResponse(this.offlineLicenseKeySetId, bArr);
                    this.eventDispatcher.drmKeysRemoved();
                    return;
                }
                byte[] provideKeyResponse = this.mediaDrm.provideKeyResponse(this.sessionId, bArr);
                if ((this.mode == 2 || (this.mode == 0 && this.offlineLicenseKeySetId != null)) && provideKeyResponse != null && provideKeyResponse.length != 0) {
                    this.offlineLicenseKeySetId = provideKeyResponse;
                }
                this.state = 4;
                this.eventDispatcher.drmKeysLoaded();
            } catch (Exception e) {
                onKeysError(e);
            }
        }
    }

    private void onKeysExpired() {
        if (this.state == 4) {
            this.state = 3;
            onError(new KeysExpiredException());
        }
    }

    private void onKeysError(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.provisioningManager.provisionRequired(this);
        } else {
            onError(exc);
        }
    }

    private void onError(Exception exc) {
        this.lastException = new DrmSession.DrmSessionException(exc);
        this.eventDispatcher.drmSessionManagerError(exc);
        if (this.state != 4) {
            this.state = 1;
        }
    }

    private boolean isOpen() {
        int i = this.state;
        return i == 3 || i == 4;
    }

    public void onMediaDrmEvent(int i) {
        if (isOpen()) {
            if (i == 1) {
                this.state = 3;
                this.provisioningManager.provisionRequired(this);
            } else if (i == 2) {
                doLicense(false);
            } else if (i != 3) {
            } else {
                onKeysExpired();
            }
        }
    }

    /* loaded from: classes.dex */
    private class PostResponseHandler extends Handler {
        public PostResponseHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                DefaultDrmSession.this.onProvisionResponse(message.obj);
            } else if (i != 1) {
            } else {
                DefaultDrmSession.this.onKeyResponse(message.obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class PostRequestHandler extends Handler {
        public PostRequestHandler(Looper looper) {
            super(looper);
        }

        Message obtainMessage(int i, Object obj, boolean z) {
            return obtainMessage(i, z ? 1 : 0, 0, obj);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                int i = message.what;
                if (i == 0) {
                    e = DefaultDrmSession.this.callback.executeProvisionRequest(DefaultDrmSession.this.uuid, (ExoMediaDrm.ProvisionRequest) message.obj);
                } else if (i == 1) {
                    e = DefaultDrmSession.this.callback.executeKeyRequest(DefaultDrmSession.this.uuid, (ExoMediaDrm.KeyRequest) message.obj);
                } else {
                    throw new RuntimeException();
                }
            } catch (Exception e) {
                e = e;
                if (maybeRetryRequest(message)) {
                    return;
                }
            }
            DefaultDrmSession.this.postResponseHandler.obtainMessage(message.what, e).sendToTarget();
        }

        private boolean maybeRetryRequest(Message message) {
            int i;
            if ((message.arg1 == 1) && (i = message.arg2 + 1) <= DefaultDrmSession.this.initialDrmRequestRetryCount) {
                Message obtain = Message.obtain(message);
                obtain.arg2 = i;
                sendMessageDelayed(obtain, getRetryDelayMillis(i));
                return true;
            }
            return false;
        }

        private long getRetryDelayMillis(int i) {
            return Math.min((i - 1) * 1000, 5000);
        }
    }
}
