package com.daaw.avee.comp.VisualizerExporter;

import android.graphics.Rect;
import android.media.cts.InputSurface;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.android.grafika.TextureMovieEncoder2B;
import com.android.grafika.VideoEncoderCoreB;
import com.daaw.avee.Common.ISimpleListShort;
import com.daaw.avee.Common.ShortBufferResourcePool;
import com.daaw.avee.Common.StatusMsg;
import com.daaw.avee.Common.StreamToFileBridge;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.comp.Visualizer.Graphic.FullscreenQuad;
import com.daaw.avee.comp.VisualizerExporter.AudioEncoderCore;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.File;
import java.io.OutputStream;
import mdesl.graphics.Texture;
/* loaded from: classes.dex */
public class AudioVideoCTSRecorder {
    public static final long MICROS_PER_SECOND = 1000000;
    private AudioEncoderManager2B audioEncoder;
    private AudioEncoderCore audioEncoderCore;
    private FullscreenQuad fullQuad;
    private InputSurface inputSurface;
    private File mOutputFile;
    private MediaMuxerWrapper muxerCore;
    private int outHeight;
    private int outWidth;
    private TextureMovieEncoder2B videoEncoder;
    private VideoEncoderCoreB videoEncoderCore;
    StreamToFileBridge streamToFileBridge = null;
    private int frameRate = 30;
    private ShortBufferResourcePool shortBufferResourcePool = new ShortBufferResourcePool(3);
    private Rect mVideoRect = new Rect();

    public static String getOutputFileExtensionWithDot() {
        return ".mp4";
    }

    public static String getOutputFileMimeType() {
        return MimeTypes.VIDEO_MP4;
    }

    private static long secondsToUs(float f) {
        return f * 1000000.0f;
    }

    private static int durationUsToFrames(long j, long j2) {
        return (int) ((j * j2) / 1000000);
    }

    public static int getCompatibleVideoWidth(int i) {
        return roundUp16(i);
    }

    public static int getCompatibleVideoHeight(int i) {
        return roundUp16(i);
    }

    private static int roundUp16(int i) {
        int i2 = i % 16;
        return i2 == 0 ? i : (16 - i2) + i;
    }

    private static int roundDown16(int i) {
        return i - (i % 16);
    }

    public String initialize(File file, OutputStream outputStream, int i, int i2, int i3, float f, boolean z, float f2, int i4, int i5, String str, String str2, int i6) {
        if (outputStream != null) {
            this.streamToFileBridge = new StreamToFileBridge(file, outputStream);
        }
        this.mOutputFile = file;
        return startEncoder(z, i2, i3, Math.min(90.0f, Math.max(0.1f, f)), i, 5, f2, i4, i5, str, str2, i6);
    }

    private String startEncoder(boolean z, int i, int i2, float f, int i3, int i4, float f2, int i5, int i6, String str, String str2, int i7) {
        float f3 = f < 0.0f ? 4.0f : f;
        int i8 = i3 < 0 ? 30 : i3;
        int i9 = i4 < 0 ? 5 : i4;
        this.frameRate = i8;
        this.outWidth = i;
        this.outHeight = i2;
        tlog.d("starting to record " + this.outWidth + "x" + this.outHeight);
        int i10 = (int) (f3 * 1000000.0f);
        int i11 = (int) (1000.0f * f2);
        try {
            this.muxerCore = new MediaMuxerWrapper(this.mOutputFile, z ? 2 : 1);
            double d = i8;
            Double.isNaN(d);
            long ceil = (long) Math.ceil(1000000.0d / d);
            if (z) {
                try {
                    this.audioEncoderCore = new AudioEncoderCore(this.muxerCore, i6, i5, i11, durationUsToFrames(ceil, i6) + 8);
                } catch (Exception e) {
                    return "AudioEncoder: " + e.toString();
                }
            }
            if (z) {
                try {
                    this.audioEncoder = new AudioEncoderManager2B(this.audioEncoderCore);
                } catch (Exception e2) {
                    return "AudioEncoderManager: " + e2.toString();
                }
            }
            try {
                VideoEncoderCoreB videoEncoderCoreB = new VideoEncoderCoreB(this.muxerCore, this.outWidth, this.outHeight, i10, i8, i9, str, str2, i7);
                this.videoEncoderCore = videoEncoderCoreB;
                try {
                    this.videoEncoder = new TextureMovieEncoder2B(videoEncoderCoreB);
                    return null;
                } catch (Exception e3) {
                    return "TextureEncoder: " + e3.toString();
                }
            } catch (Exception e4) {
                return "VideoEncoder: " + e4.toString();
            }
        } catch (Exception e5) {
            return "MediaMuxer: " + e5.toString();
        }
    }

    public void release() {
        FullscreenQuad fullscreenQuad = this.fullQuad;
        if (fullscreenQuad != null) {
            fullscreenQuad.dispose();
        }
        this.fullQuad = null;
    }

    public int getScreenWidth() {
        return this.mVideoRect.width();
    }

    public int getScreenHeight() {
        return this.mVideoRect.height();
    }

    public static long computePresentationTime(long j, int i) {
        return (j * 1000000) / i;
    }

    public static long computePresentationTime2(long j, int i) {
        return (j * 1000000) / i;
    }

    public boolean addFrameImageOGL(Texture texture, long j, int i) {
        if (this.videoEncoderCore != null && this.videoEncoder != null) {
            EGLDisplay eglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
            EGLSurface eglGetCurrentSurface = EGL14.eglGetCurrentSurface(12378);
            EGLSurface eglGetCurrentSurface2 = EGL14.eglGetCurrentSurface(12377);
            EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
            if (eglGetCurrentContext == null) {
                tlog.w("oldEGLContext is null");
                return false;
            }
            if (this.inputSurface == null) {
                try {
                    this.inputSurface = new InputSurface(this.videoEncoderCore.getInputSurface(), eglGetCurrentContext);
                } catch (Exception unused) {
                    return false;
                }
            }
            if (!texture.valid()) {
                return false;
            }
            try {
                this.inputSurface.makeCurrent();
                this.inputSurface.setPresentationTime(j * 1000);
                if (this.fullQuad == null) {
                    this.fullQuad = new FullscreenQuad();
                }
                GLES20.glClearColor(1.0f, 1.0f, 0.0f, 1.0f);
                GLES20.glClear(16640);
                this.mVideoRect.set(0, 0, texture.getWidth(), texture.getHeight());
                GLES20.glViewport(this.mVideoRect.left, this.mVideoRect.top, this.mVideoRect.width(), this.mVideoRect.height());
                texture.bind();
                this.fullQuad.draw();
                this.inputSurface.swapBuffers();
                if (EGL14.eglMakeCurrent(eglGetCurrentDisplay, eglGetCurrentSurface2, eglGetCurrentSurface, eglGetCurrentContext)) {
                    return true;
                }
                tlog.w("EGL14.eglMakeCurrent failed");
                return false;
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    private void stopEncoder() {
        MediaMuxerWrapper mediaMuxerWrapper = this.muxerCore;
        if (mediaMuxerWrapper != null) {
            mediaMuxerWrapper.release();
        }
        if (this.audioEncoder != null) {
            tlog.d("stopping recorder, audioEncoder=" + this.audioEncoder);
            if (this.audioEncoder.isRecording()) {
                this.audioEncoder.stopRecording();
            }
            this.audioEncoder = null;
        }
        if (this.videoEncoder != null) {
            tlog.d("stopping recorder, videoEncoder=" + this.videoEncoder);
            if (this.videoEncoder.isRecording()) {
                this.videoEncoder.stopRecording();
            }
            this.videoEncoder = null;
        }
        InputSurface inputSurface = this.inputSurface;
        if (inputSurface != null) {
            inputSurface.release();
            this.inputSurface = null;
        }
    }

    public boolean stop(StatusMsg statusMsg) {
        TextureMovieEncoder2B textureMovieEncoder2B;
        if (this.videoEncoder != null) {
            tlog.d("stopping video recorder, videoEncoder=" + this.videoEncoder);
            if (this.videoEncoder.isRecording()) {
                this.videoEncoder.stopRecording();
            }
        }
        if (this.audioEncoder != null) {
            tlog.d("stopping audio recorder, videoEncoder=" + this.videoEncoder);
            if (this.audioEncoder.isRecording()) {
                this.audioEncoder.stopRecording();
            }
        }
        int i = 0;
        while (true) {
            AudioEncoderManager2B audioEncoderManager2B = this.audioEncoder;
            if ((audioEncoderManager2B == null || !audioEncoderManager2B.isRecording()) && ((textureMovieEncoder2B = this.videoEncoder) == null || !textureMovieEncoder2B.isRecording())) {
                break;
            }
            i++;
            if (i % 1000 == 0) {
                tlog.e(new RuntimeException("Waiting on .isRecording for " + (i / 100) + " seconds already"), "");
            }
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                tlog.e(e, null);
            }
        }
        MediaMuxerWrapper mediaMuxerWrapper = this.muxerCore;
        if (mediaMuxerWrapper != null) {
            mediaMuxerWrapper.release();
        }
        AudioEncoderManager2B audioEncoderManager2B2 = this.audioEncoder;
        if (audioEncoderManager2B2 != null) {
            audioEncoderManager2B2.reportMessages(statusMsg);
        }
        return true;
    }

    public boolean finish(StatusMsg statusMsg) {
        tlog.w("### finish");
        this.videoEncoder = null;
        InputSurface inputSurface = this.inputSurface;
        if (inputSurface != null) {
            inputSurface.release();
            this.inputSurface = null;
        }
        StreamToFileBridge streamToFileBridge = this.streamToFileBridge;
        boolean finish = streamToFileBridge != null ? streamToFileBridge.finish(statusMsg) : true;
        this.streamToFileBridge = null;
        return finish;
    }

    public void frameAvailableSoon() {
        TextureMovieEncoder2B textureMovieEncoder2B = this.videoEncoder;
        if (textureMovieEncoder2B != null) {
            textureMovieEncoder2B.frameAvailableSoon();
        }
    }

    public int getAudioInputFormatChannelCount() {
        AudioEncoderCore audioEncoderCore = this.audioEncoderCore;
        if (audioEncoderCore == null) {
            return 2;
        }
        return audioEncoderCore.getInputFormatChannelCount();
    }

    public void audioFrameAvailableSoon(ISimpleListShort iSimpleListShort, long j) {
        if (iSimpleListShort.size() <= 0 || this.audioEncoder == null || this.audioEncoderCore == null) {
            return;
        }
        AudioEncoderCore.EncodeData encodeData = new AudioEncoderCore.EncodeData();
        encodeData.buffer = this.shortBufferResourcePool.acquire(iSimpleListShort.size(), 10L);
        for (int i = 0; i < encodeData.buffer.obj.length; i++) {
            encodeData.buffer.obj[i] = iSimpleListShort.get(i);
        }
        encodeData.length = encodeData.buffer.obj.length;
        encodeData.presentationTimeUs = j;
        this.audioEncoder.frameAvailableSoon(encodeData);
    }
}
