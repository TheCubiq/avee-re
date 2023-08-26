package com.daaw.avee.comp.Visualizer.Graphic;

import android.content.Context;
import android.content.res.Resources;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.Design.VisualizerThemes;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.comp.Visualizer.CustomScene;
import com.daaw.avee.comp.Visualizer.Elements.Base.Element;
import com.daaw.avee.comp.Visualizer.Elements.RootElement;
import com.daaw.avee.comp.Visualizer.FrameCaptureDesc;
import com.daaw.avee.comp.Visualizer.FrameStats;
import com.daaw.avee.comp.Visualizer.IDependencyResourceCounter;
import com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
/* loaded from: classes.dex */
public class RendererCore implements GLSurfaceView.Renderer {
    private Context context;
    private final RenderState renderState;
    InternalVisualizationDataProvider visualizationData;
    private RootElement rootElement = null;
    private boolean surfaceCreated = false;
    long startTime = System.currentTimeMillis();

    public RendererCore(Context context, Resources resources, InternalVisualizationDataProvider internalVisualizationDataProvider) {
        this.context = null;
        this.context = context;
        this.visualizationData = internalVisualizationDataProvider;
        RenderState renderState = new RenderState(internalVisualizationDataProvider);
        this.renderState = renderState;
        renderState.onResources(resources);
        requestRefreshThemeElements();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.surfaceCreated = true;
        this.renderState.onSurfaceCreated();
        RootElement rootElement = this.rootElement;
        if (rootElement != null) {
            rootElement.markNeedReCreateGLResources();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        tlog.w("onSurfaceChanged: " + i + " ; " + i2);
        this.renderState.onSurfaceChanged(PlayerCore.s().getAppContext(), i, i2);
        RootElement rootElement = this.rootElement;
        if (rootElement != null) {
            rootElement.markNeedReCreateGLResources();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        if (this.surfaceCreated && this.renderState.res.isValid()) {
            RootElement rootElement = this.rootElement;
            FrameCaptureDesc invoke = VisualizerViewCore.onRequestFrameCaptureMode.invoke(null);
            GLES20.glClearColor(0.1f, 0.1f, 0.1f, 1.0f);
            GLES20.glClear(16640);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            boolean z = true;
            this.renderState.setTextureWrapping(1);
            if (invoke != null) {
                this.renderState.onFrameStart(invoke.overrideFrameTimeMs, invoke.overrideScreenWidth, invoke.overrideScreenHeight);
            } else {
                this.renderState.onFrameStart(-1, -1, -1);
            }
            VisualizerViewCore.onFrameStart.invoke(Float.valueOf(this.renderState.getFrameTimeF()), Float.valueOf(this.renderState.getTotalFrameTimeF()));
            if (rootElement != null) {
                rootElement.onEarlyUpdate(this.renderState, null, null);
            }
            if (rootElement != null) {
                rootElement.setOffscreenRenderingEnabled(invoke != null, (invoke == null || !invoke.captureToImageBuffer) ? false : false, invoke != null ? invoke.reuseBuffer0 : null);
            }
            if (rootElement != null) {
                rootElement.onRender(this.renderState, null);
            }
            this.renderState.onFrameEnd();
            this.renderState.bindFrameBuffer(null);
            if (rootElement == null || invoke == null || rootElement.getOffscreenImageBuffer() == null) {
                return;
            }
            int[] offscreenImageBuffer = rootElement.getOffscreenImageBuffer();
            VisualizerViewCore.onFrameCaptured.invoke(offscreenImageBuffer, Integer.valueOf(rootElement.getOffscreenImageWidth()), Integer.valueOf(rootElement.getOffscreenImageHeight()), offscreenImageBuffer);
        }
    }

    public FrameStats getFrameStats() {
        return this.renderState.getFrameStats();
    }

    public int getFrameTimeMs() {
        return this.renderState.getFrameTime();
    }

    public void requestRefreshThemeElements() {
        CustomScene invoke = VisualizerViewCore.onRequestSelectedSkinThemePreset.invoke(null);
        if (invoke != null) {
            setThemeElements(invoke);
        }
    }

    public void setThemeElements(RootElement rootElement) {
        this.rootElement = rootElement;
        if (rootElement != null) {
            rootElement.markNeedReCreateGLResources();
        }
        this.visualizationData.onThemeChanged();
    }

    public void setThemeElements(CustomScene customScene) {
        if (this.rootElement == null) {
            this.rootElement = VisualizerThemes.s().getThemeObjectForLoading2(0, false, "");
        }
        this.rootElement.setThemeCustomizationData(customScene);
        RootElement rootElement = this.rootElement;
        if (rootElement != null) {
            rootElement.markNeedReCreateGLResources();
        }
        this.visualizationData.onThemeChanged();
    }

    public void setThemeCustomizationData(CustomScene customScene) {
        RootElement rootElement = this.rootElement;
        if (rootElement != null) {
            rootElement.setThemeCustomizationData(customScene);
        }
    }

    public void readThemeCustomizationData(CustomScene customScene, IDependencyResourceCounter iDependencyResourceCounter) {
        RootElement rootElement = this.rootElement;
        if (rootElement != null) {
            rootElement.readThemeCustomizationData(customScene, iDependencyResourceCounter);
        }
    }

    public void resetVisualizer() {
        RootElement rootElement = this.rootElement;
        if (rootElement != null) {
            rootElement.markNeedReCreateGLResources();
        }
    }

    public void setTriggerLogo(int i, int i2) {
        if (i2 > 0) {
            Element findElementById = this.rootElement.findElementById(i2);
            if (findElementById != null) {
                findElementById.setTrigger(i);
                return;
            }
            return;
        }
        this.renderState.setTriggerLogo(i);
    }
}
