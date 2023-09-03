package com.daaw.avee.comp.Visualizer.Graphic;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.SystemClock;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.daaw.avee.Common.Action2;
import com.daaw.avee.Common.Action3;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.UtilsFileSys;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.Common.Vec2i;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.EventsGlobal.EventsGlobalTextNotifier;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.R;
import com.daaw.avee.comp.Visualizer.FrameStats;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider;
import com.daaw.avee.comp.Visualizer.Meter;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import mdesl.graphics.ITexture;
import mdesl.graphics.Texture;
import mdesl.graphics.glutils.FrameBuffer;
import mdesl.graphics.glutils.ShaderProgram;
/* loaded from: classes.dex */
public class RenderState implements IRenderState {
    public final RenderResources res;
    public final float defaultZOffset = -10.0f;
    private final float[] vPMatrix = new float[16];
    private final float[] projectionMatrix = new float[16];
    private final float[] viewMatrix = new float[16];
    private float frameTimeF = 0.0f;
    private float frameTimeSmooth = 0.0f;
    private int frameTime = 0;
    private long fpsTimeAcc = 0;
    private long lastTimeMs = 0;
    private long totalFrameTime = 0;
    private float totalFrameTimeF = 0.0f;
    private int fullscreenWidth = 2;
    private int fullscreenHeight = 2;
    private int screenWidth = 2;
    private int screenHeight = 2;
    public int overrideScreenWidth = 0;
    public int overrideScreenHeight = 0;
    private int currentBlendMode = -1;
    private FrameStats frameStats = new FrameStats();
    FrameBuffer boundFb = null;
    List<VFrameBuffer> renderedCompositions = new ArrayList();
    private boolean renderEdges = false;
    private boolean audioProcessMultiThread = true;
    private int currentGradualLoadingIndex = 0;
    private int logoTrigger = 0;
    public final VMatrix viewMat2Tmp = new VMatrix();
    public final VMatrix viewMat3Tmp = new VMatrix();
    public final VMatrix viewMat4Tmp = new VMatrix();
    private final VMatrix viewMatTmp = new VMatrix();
    private final VMatrix matTmp2 = new VMatrix();

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public boolean getRenderEdgesPaths() {
        return true;
    }

    public boolean isVisibleOnScreen(Vec2f vec2f, float f) {
        return true;
    }

    public void unbindShader() {
    }

    public RenderState(InternalVisualizationDataProvider internalVisualizationDataProvider) {
        this.res = new RenderResources(this, internalVisualizationDataProvider);
        Matrix.setIdentityM(this.viewMatrix, 0);
        Matrix.translateM(this.viewMatrix, 0, 0.0f, 0.0f, -10.0f);
    }

    public void setTriggerLogo(int i) {
        this.logoTrigger = i;
    }

    public int getTriggerLogo() {
        return this.logoTrigger;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public IRenderState.IRenderResources getRes() {
        return this.res;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public BufferRenderer getBufferRenderer() {
        return this.res.getBufferRenderer();
    }

    public float[] getVPMatrix() {
        return this.vPMatrix;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public float getFrameTimeF() {
        return this.frameTimeF;
    }

    public float getFrameTimeSmooth() {
        return this.frameTimeSmooth;
    }

    public int getFrameTime() {
        return this.frameTime;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public float getTotalFrameTimeF() {
        return this.totalFrameTimeF;
    }

    public FrameStats getFrameStats() {
        return this.frameStats;
    }

    public int getFullscreenWidth() {
        int i = this.overrideScreenWidth;
        return i < 2 ? this.fullscreenWidth : i;
    }

    public int getFullscreenHeight() {
        int i = this.overrideScreenHeight;
        return i < 2 ? this.fullscreenHeight : i;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public int getScreenWidth() {
        int i = this.overrideScreenWidth;
        return i < 2 ? this.fullscreenWidth : i;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public int getScreenHeight() {
        int i = this.overrideScreenHeight;
        return i < 2 ? this.fullscreenHeight : i;
    }

    public static boolean checkOGLError(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            tlog.w("OGL Error (" + str + ") : " + glGetError);
            return false;
        }
        return true;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public boolean getRenderEdges() {
        return this.renderEdges;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public boolean getMultiThread() {
        return this.audioProcessMultiThread;
    }

    public void onResources(Resources resources) {
        this.res.onResources(resources);
    }

    public void onSurfaceCreated() {
        unsetBlendMode();
        GLES20.glEnable(3042);
        this.res.onSurfaceCreated();
    }

    public boolean onSurfaceChanged(Context context, int i, int i2) {
        if (this.screenWidth == i && this.screenHeight == i2) {
            return false;
        }
        this.screenWidth = i;
        this.screenHeight = i2;
        this.fullscreenWidth = i;
        this.fullscreenHeight = i2;
        return true;
    }

    public void onFrameStart(int i, int i2, int i3) {
        FrameStats frameStats = this.frameStats;
        frameStats.statFlushCount = frameStats.statFlushCounter;
        this.frameStats.statFlushCounter = 0;
        FrameStats frameStats2 = this.frameStats;
        frameStats2.statResourceLoadCount = frameStats2.statResourceLoadCounter;
        this.frameStats.statResourceLoadCounter = 0;
        FrameStats frameStats3 = this.frameStats;
        frameStats3.statGradualResourceLoadCount = frameStats3.statGradualResourceLoadCounter;
        this.frameStats.statGradualResourceLoadCounter = 0;
        FrameStats frameStats4 = this.frameStats;
        frameStats4.statRTSwitchCount = frameStats4.statRTSwitchCounter;
        this.frameStats.statRTSwitchCounter = 0;
        this.overrideScreenWidth = i2;
        this.overrideScreenHeight = i3;
        if (i > 0) {
            this.frameTime = i;
            this.lastTimeMs = 0L;
            float f = i * 0.001f;
            this.frameTimeF = f;
            this.frameTimeSmooth = f;
            this.frameStats.fps = (int) (1.0f / f);
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.frameTime = (int) (uptimeMillis - this.lastTimeMs);
            this.frameStats.fpsAcc++;
            if (uptimeMillis - this.fpsTimeAcc >= 1000) {
                FrameStats frameStats5 = this.frameStats;
                frameStats5.fps = frameStats5.fpsAcc;
                this.frameStats.fpsAcc = 0;
                this.fpsTimeAcc = uptimeMillis;
            }
            this.lastTimeMs = uptimeMillis;
            if (this.frameTime < 0) {
                this.frameTime = 0;
            }
            if (this.frameTime > 200) {
                this.frameTime = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
            }
            float f2 = this.frameTime * 0.001f;
            this.frameTimeF = f2;
            this.frameTimeSmooth = (this.frameTimeSmooth * 0.5f) + (f2 * 0.5f);
        }
        long j = this.totalFrameTime + this.frameTime;
        this.totalFrameTime = j;
        this.totalFrameTimeF = ((float) j) * 0.001f;
        this.frameStats.frameResourcesLoadingCount = 0;
        this.renderEdges = this.res.visualizationData.onRequestAntiAliasingValue() > 0;
        this.audioProcessMultiThread = (this.res.visualizationData.onRequestAudioProcessMultiThreadValue() & 1) != 0;
        clearCompositionResults();
        bindFrameBuffer(null, true);
        this.res.getBufferRenderer_atlasBuffer().setOnBindAction1(true, new Action2<RenderState, VShaderProgram>() { // from class: com.daaw.avee.comp.Visualizer.Graphic.RenderState.1
            @Override // com.daaw.avee.Common.Action2
            public void onInvoke(RenderState renderState, VShaderProgram vShaderProgram) {
                vShaderProgram.setUniformMatrix("u_projView", false, RenderState.this.getVPMatrix());
                vShaderProgram.setUniformi("u_texture", 0);
            }
        });
        this.res.getBufferRenderer_atlasBufferVPMat().setOnBindAction1(true, new Action2<RenderState, VShaderProgram>() { // from class: com.daaw.avee.comp.Visualizer.Graphic.RenderState.2
            @Override // com.daaw.avee.Common.Action2
            public void onInvoke(RenderState renderState, VShaderProgram vShaderProgram) {
                vShaderProgram.setUniformi("u_texture", 0);
            }
        });
        bindShaderForceFlush(this.res.getAtlasBufferFxLightShader());
        this.res.getAtlasBufferFxLightShader().setUniformMatrix("u_projView", false, getVPMatrix());
        this.res.getAtlasBufferFxLightShader().setUniformi("u_texture", 0);
        this.res.getAtlasBufferFxLightShader().setUniformi("u_texture2", 1);
        this.res.getAtlasBufferFxLightShader().setUniformf("maskadd", 0.0f);
        this.res.getAtlasBufferFxLightShader().setUniformf("maskmul", 1.0f);
        this.res.getAtlasBufferFxLightShader().setUniformf("mask_l_add", 1.0f);
        this.res.getAtlasBufferFxLightShader().setUniformf("mask_l_mul", 0.0f);
        this.res.getAtlasBufferFxLightShader().setUniformf("tex2_y_add", 0.0f);
        this.res.getAtlasBufferFxLightShader().setUniformf("tex2_y_mul", 1.0f);
        this.res.getAtlasBufferFxLightShader().setUniformf("Color2", 0.0f, 0.0f, 0.0f, 1.0f);
        this.res.getAtlasBufferFxLightShader().setUniformf("saturation", 1.0f);
        if (this.res.atlasTexLoadingPlaceholerClone != null) {
            this.res.atlasTexLoadingPlaceholerClone.onFrameStart(this.frameTimeF);
        }
        this.res.bufferRenderer.onFrameStart(this);
        this.res.getMeter().onFrameStart();
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public void frameResourcesLoadingAdd() {
        this.frameStats.frameResourcesLoadingCount++;
    }

    public void addStatFlush() {
        this.frameStats.statFlushCounter++;
    }

    public void addStatResourceLoad() {
        this.frameStats.statResourceLoadCounter++;
    }

    public void addStatGradualResourceLoad() {
        this.frameStats.statGradualResourceLoadCounter++;
    }

    public void addStatRTSwitch() {
        this.frameStats.statRTSwitchCounter++;
    }

    public void onFrameEnd() {
        this.res.bufferRenderer.onFrameEnd(this);
        this.logoTrigger = 0;
    }

    public void unsetBlendMode() {
        this.currentBlendMode = -1;
    }

    public void setBlendModeForce(int i) {
        this.currentBlendMode = -1;
        setBlendMode(i);
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public void setBlendMode(int i) {
        if (this.currentBlendMode == i) {
            return;
        }
        this.res.bufferRenderer.onFrameEnd(this);
        if (i == 0) {
            GLES20.glBlendFunc(770, 771);
        } else if (i == 1) {
            GLES20.glBlendFunc(1, 769);
        } else if (i == 2) {
            GLES20.glBlendFunc(1, 1);
        } else if (i == 3) {
            GLES20.glBlendFunc(1, 0);
        } else if (i == 4) {
            GLES20.glBlendFunc(1, 771);
        } else if (i == 5) {
            GLES20.glBlendFunc(770, 1);
        }
        this.currentBlendMode = i;
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public void setTextureWrapping(int i) {
        if (i == 2) {
            GLES20.glTexParameteri(3553, 10242, Texture.CLAMP_TO_EDGE);
            GLES20.glTexParameteri(3553, 10243, Texture.CLAMP_TO_EDGE);
        } else if (i == 1) {
            GLES20.glTexParameteri(3553, 10242, 33648);
            GLES20.glTexParameteri(3553, 10243, 33648);
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState
    public void bindFrameBuffer(FrameBuffer frameBuffer) {
        bindFrameBuffer(frameBuffer, false);
    }

    public void bindFrameBuffer(FrameBuffer frameBuffer, boolean z) {
        if (z || this.boundFb != frameBuffer) {
            this.boundFb = frameBuffer;
            addStatRTSwitch();
            this.res.bufferRenderer.onFrameEnd(this);
            if (frameBuffer == null) {
                GLES20.glViewport(0, 0, getScreenWidth(), getScreenHeight());
                GLES20.glBindFramebuffer(36160, 0);
                Matrix.orthoM(this.projectionMatrix, 0, 0.0f, getScreenWidth(), getScreenHeight(), 0.0f, 0.01f, 100.0f);
                Matrix.multiplyMM(this.vPMatrix, 0, this.projectionMatrix, 0, this.viewMatrix, 0);
                return;
            }
            frameBuffer.begin();
            Matrix.orthoM(this.projectionMatrix, 0, 0.0f, frameBuffer.getWidth(), frameBuffer.getHeight(), 0.0f, 0.01f, 100.0f);
            Matrix.multiplyMM(this.vPMatrix, 0, this.projectionMatrix, 0, this.viewMatrix, 0);
        }
    }

    public void createViewProjMatrix(VMatrix vMatrix, VMatrix vMatrix2) {
        Matrix.multiplyMM(vMatrix.getObj(), 0, this.projectionMatrix, 0, vMatrix2.getObj(), 0);
    }

    public void createViewProjMatrixPerspectiveBoundsAtZ(Vec2f vec2f, float f, FrameBuffer frameBuffer, float f2, float f3) {
        double d = f;
        double tan = Math.tan(Math.toRadians(f3 * 0.5f));
        Double.isNaN(d);
        vec2f.y = (float) Math.abs(d * tan);
        vec2f.x = vec2f.y * f2;
    }

    public void createViewProjMatrixPerspective(VMatrix vMatrix, Vec2f vec2f, FrameBuffer frameBuffer, float f, float f2, float f3, float f4, float f5, float f6) {
        float width;
        int height;
        if (frameBuffer == null) {
            width = getScreenWidth();
            height = getScreenHeight();
        } else {
            width = frameBuffer.getWidth();
            height = frameBuffer.getHeight();
        }
        float f7 = height;
        vec2f.x = width;
        vec2f.y = f7;
        this.viewMatTmp.setIdentity();
        this.viewMatTmp.translate(width * f4, f7 * f5, f6);
        Matrix.perspectiveM(this.matTmp2.getObj(), 0, f, width / f7, f2, f3);
        Matrix.multiplyMM(vMatrix.getObj(), 0, this.matTmp2.getObj(), 0, this.viewMatTmp.getObj(), 0);
    }

    public void bindShaderForceFlush(ShaderProgram shaderProgram) {
        this.res.bufferRenderer.onFrameEnd(this);
        if (shaderProgram != null) {
            shaderProgram.use();
        }
    }

    public void bindShaderNoFlush(ShaderProgram shaderProgram) {
        shaderProgram.use();
    }

    public Vec2i getSafeRenderBufferSizeTextureDim() {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(34024, iArr, 0);
        int i = iArr[0];
        tlog.d("OGL Max render buffer size: " + i);
        tlog.d("fullscreen size: " + getFullscreenWidth() + "; " + getFullscreenHeight());
        return new Vec2i(Math.min(getFullscreenWidth(), i), Math.min(getFullscreenHeight(), i));
    }

    public Vec2i getSafeFullScreenSizeTextureDim() {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i = iArr[0];
        tlog.d("OGL Max texture size: " + i);
        tlog.d("fullscreen size: " + getFullscreenWidth() + "; " + getFullscreenHeight());
        return new Vec2i(Math.min(getFullscreenWidth(), i), Math.min(getFullscreenHeight(), i));
    }

    public Vec2i getSafeScreenSizeTextureDim() {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i = iArr[0];
        tlog.d("OGL Max texture size: " + i);
        return new Vec2i(Math.min(getScreenWidth(), i), Math.min(getScreenHeight(), i));
    }

    public void drawFullscreenQuad(int i, RenderPassData renderPassData) {
        drawFullscreenQuad(0.0f, 0.0f, i, renderPassData);
    }

    public void drawFullscreenQuad(float f, float f2, int i, RenderPassData renderPassData) {
        this.res.bufferRenderer.drawRectangleWHBottom(this, f, f2, 0.0f, getScreenWidth(), getScreenHeight(), i, Vec2f.zero(), Vec2f.one(), renderPassData, true);
    }

    public void drawFullscreenQuad(float f, float f2, int i, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData) {
        this.res.bufferRenderer.drawRectangleWHBottom(this, f, f2, 0.0f, getScreenWidth(), getScreenHeight(), i, vec2f, vec2f2, renderPassData, false);
    }

    public void drawFullscreenQuadM1P1(int i, Vec2f vec2f, Vec2f vec2f2, RenderPassData renderPassData) {
        this.res.bufferRenderer.drawRectangleWHBottom(this, -1.0f, -1.0f, 0.0f, 2.0f, 2.0f, i, vec2f, vec2f2, renderPassData, false);
    }

    public void drawFullscreenQuad(int i, IAtlasTexture iAtlasTexture, int i2) {
        this.res.bufferRenderer.drawRectangleWHBottom(this, 0.0f, 0.0f, 0.0f, getScreenWidth(), getScreenHeight(), i, Vec2f.zero(), Vec2f.one(), new RenderPassData(i2, iAtlasTexture, (VShaderBinder) null, (Action3<RenderState, VShaderProgram, RenderPassData>) null), false);
    }

    public void drawFullscreenQuadNonAtlasBuffer() {
        this.res.fullQuad.draw();
    }

    public void onOffScreenContentRendered(Texture texture) {
        this.res.visualizationData.onOffScreenContentRendered(texture, this.frameStats.getFrameResourcesLoadingCount() > 0, "" + this.frameStats.frameResourcesLoadingCount + " / " + this.frameStats.statResourceLoadCount + " / " + this.frameStats.statGradualResourceLoadCount);
    }

    public void clearCompositionResults() {
        for (int i = 0; i < this.renderedCompositions.size(); i++) {
            this.renderedCompositions.set(i, null);
        }
    }

    public void setCompositionResult(int i, VFrameBuffer vFrameBuffer) {
        while (i >= this.renderedCompositions.size()) {
            this.renderedCompositions.add(null);
        }
        this.renderedCompositions.set(i, vFrameBuffer);
    }

    public VFrameBuffer getCompositionResult(int i) {
        if (i < this.renderedCompositions.size()) {
            return this.renderedCompositions.get(i);
        }
        return null;
    }

    public void bindTexture(AtlasTexture atlasTexture, int i) {
        if (atlasTexture == null) {
            bindTexture((ITexture) null, i);
        } else {
            bindTexture(atlasTexture.getTexture2D(), i);
        }
    }

    public void bindTexture(ITexture iTexture, int i) {
        GLES20.glActiveTexture(i + 33984);
        if (iTexture != null) {
            iTexture.getTexture().bind();
        } else {
            this.res.getAtlasTexWhite().getTexture2D().getTexture().bind();
        }
    }

    public void resetBindTexture() {
        GLES20.glActiveTexture(33984);
    }

    /* loaded from: classes.dex */
    public static class RenderResources implements IRenderState.IRenderResources {
        private VShaderProgram atlasBufferFxLightShader;
        private VShaderProgram atlasBufferShader;
        private AtlasTexture atlasTexBlack;
        private AtlasTexture atlasTexEdge;
        private AtlasTexture atlasTexLoadingPlaceholer;
        private LoadingAtlasTexture atlasTexLoadingPlaceholerClone;
        private AtlasTexture[] atlasTexParticles = new AtlasTexture[5];
        private AtlasTexture atlasTexRandom16;
        private AtlasTexture atlasTexRoundSegment;
        private AtlasTexture atlasTexSquareSegment;
        private AtlasTexture atlasTexSquareYSidesSegment;
        private AtlasTexture atlasTexWhite;
        private Bitmap bitmapEdge;
        private Bitmap bitmapLoadingPlaceholer;
        private Bitmap bitmapLogoBW;
        private Bitmap bitmapRandom16;
        private Bitmap bitmapRoundSegment;
        private Bitmap bitmapSquareSegment;
        private Bitmap bitmapSquareYSidesSegment;
        private VShaderProgram blurKernelShader;
        private VShaderProgram blurShader;
        private VShaderProgram blurShader2;
        private VShaderProgram blurStackShader;
        private BufferRenderer bufferRenderer;
        private VShaderBinder bufferRenderer_MotionBlurEffect;
        private VShaderBinder bufferRenderer_RgbSplitEffect;
        private VShaderBinder bufferRenderer_atlasBuffer;
        private VShaderBinder bufferRenderer_atlasBufferCustomVPMat;
        private VShaderBinder bufferRenderer_atlasBufferFxLight;
        private VShaderBinder bufferRenderer_blurShader;
        private VShaderBinder bufferRenderer_blurShader2;
        private VShaderBinder bufferRenderer_blurShaderKernel;
        private VShaderBinder bufferRenderer_blurStackShader;
        private SpriteFontRenderer fontRenderer;
        private FullscreenQuad fullQuad;
        private VShaderProgram fxaaShader;
        public final Meter meter;
        private VShaderProgram motionBlurEffectShader;
        private VShaderProgram rgbSplitEffectShader;
        public final InternalVisualizationDataProvider visualizationData;

        public AtlasTexture getAtlasTexLogoBW() {
            return null;
        }

        RenderResources(RenderState renderState, InternalVisualizationDataProvider internalVisualizationDataProvider) {
            this.visualizationData = internalVisualizationDataProvider;
            this.meter = new Meter(renderState);
        }

        public boolean isValid() {
            return (this.bufferRenderer == null || this.fontRenderer == null || this.atlasBufferShader == null) ? false : true;
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState.IRenderResources
        public Meter getMeter() {
            return this.meter;
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState.IRenderResources
        public InternalVisualizationDataProvider getVisualizationData() {
            return this.visualizationData;
        }

        public VShaderProgram getAtlasBufferShader() {
            return this.atlasBufferShader;
        }

        public VShaderProgram getAtlasBufferFxLightShader() {
            return this.atlasBufferFxLightShader;
        }

        public VShaderProgram getFxaaShader() {
            return this.fxaaShader;
        }

        public VShaderProgram getBlurShader2() {
            return this.blurShader2;
        }

        public VShaderProgram getBlurShader() {
            return this.blurShader;
        }

        public VShaderProgram getBlurKernelShader() {
            return this.blurKernelShader;
        }

        public VShaderProgram getBlurStackShader() {
            return this.blurStackShader;
        }

        public BufferRenderer getBufferRenderer() {
            return this.bufferRenderer;
        }

        public VShaderBinder getBufferRenderer_atlasBuffer() {
            return this.bufferRenderer_atlasBuffer;
        }

        public VShaderBinder getBufferRenderer_atlasBufferVPMat() {
            return this.bufferRenderer_atlasBufferCustomVPMat;
        }

        public VShaderBinder getBufferRenderer_atlasBufferFxLight() {
            return this.bufferRenderer_atlasBufferFxLight;
        }

        public VShaderBinder getBufferRenderer_RgbSplitEffect() {
            return this.bufferRenderer_RgbSplitEffect;
        }

        public VShaderBinder getBufferRenderer_MotionBlurEffect() {
            return this.bufferRenderer_MotionBlurEffect;
        }

        public VShaderBinder getBufferRenderer_blurShader() {
            return this.bufferRenderer_blurShader;
        }

        public VShaderBinder getBufferRenderer_blurShader2() {
            return this.bufferRenderer_blurShader2;
        }

        public VShaderBinder getBufferRenderer_blurShaderKernel() {
            return this.bufferRenderer_blurShaderKernel;
        }

        public VShaderBinder getBufferRenderer_blurStackShader() {
            return this.bufferRenderer_blurStackShader;
        }

        public SpriteFontRenderer getFontRenderer() {
            return this.fontRenderer;
        }

        public FullscreenQuad getFullQuad() {
            return this.fullQuad;
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState.IRenderResources
        public AtlasTexture getAtlasTexWhite() {
            return this.atlasTexWhite;
        }

        public AtlasTexture getAtlasTexEdge() {
            return this.atlasTexEdge;
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState.IRenderResources
        public AtlasTexture getAtlasTexRoundSegment() {
            return this.atlasTexRoundSegment;
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState.IRenderResources
        public AtlasTexture getAtlasTexSquareSegment() {
            return this.atlasTexSquareSegment;
        }

        @Override // com.daaw.avee.comp.Visualizer.Graphic.IRenderState.IRenderResources
        public AtlasTexture getAtlasTexSquareYSidesSegment() {
            return this.atlasTexSquareYSidesSegment;
        }

        public AtlasTexture getAtlasTexBlack() {
            return this.atlasTexBlack;
        }

        public AtlasTexture getAtlasTexParticle(int i) {
            AtlasTexture[] atlasTextureArr = this.atlasTexParticles;
            if (i < atlasTextureArr.length) {
                return atlasTextureArr[i];
            }
            return atlasTextureArr[0];
        }

        public AtlasTexture getAtlasTexRandom16() {
            return this.atlasTexRandom16;
        }

        public AtlasTexture getAtlasTexLoadingPlaceholer() {
            return this.atlasTexLoadingPlaceholerClone;
        }

        public void onSurfaceCreated() {
            Context appContext = PlayerCore.s().getAppContext();
            if (appContext == null) {
                return;
            }
            Resources resources = appContext.getResources();
            FullscreenQuad fullscreenQuad = this.fullQuad;
            if (fullscreenQuad != null) {
                fullscreenQuad.dispose();
            }
            this.fullQuad = new FullscreenQuad();
            VTexture vTexture = new VTexture(-1, 2, 2, 9729, 9729, 10497, false);
            VTexture vTexture2 = new VTexture(ViewCompat.MEASURED_STATE_MASK, 2, 2, 9729, 9729, 10497, false);
            AtlasTexture atlasTexture = this.atlasTexWhite;
            if (atlasTexture != null) {
                atlasTexture.dispose();
            }
            this.atlasTexWhite = new AtlasTexture(vTexture, true);
            AtlasTexture atlasTexture2 = this.atlasTexBlack;
            if (atlasTexture2 != null) {
                atlasTexture2.dispose();
            }
            this.atlasTexBlack = new AtlasTexture(vTexture2, true);
            AtlasTexture atlasTexture3 = this.atlasTexEdge;
            if (atlasTexture3 != null) {
                atlasTexture3.dispose();
            }
            this.atlasTexEdge = new AtlasTexture(new VTexture(this.bitmapEdge, 9729, 9729, 10497, true), true);
            AtlasTexture atlasTexture4 = this.atlasTexRoundSegment;
            if (atlasTexture4 != null) {
                atlasTexture4.dispose();
            }
            this.atlasTexRoundSegment = new AtlasTexture(new VTexture(this.bitmapRoundSegment, 9729, 9729, 10497, true), true);
            AtlasTexture atlasTexture5 = this.atlasTexSquareSegment;
            if (atlasTexture5 != null) {
                atlasTexture5.dispose();
            }
            this.atlasTexSquareSegment = new AtlasTexture(new VTexture(this.bitmapSquareSegment, 9729, 9729, 10497, true), true);
            AtlasTexture atlasTexture6 = this.atlasTexSquareYSidesSegment;
            if (atlasTexture6 != null) {
                atlasTexture6.dispose();
            }
            this.atlasTexSquareYSidesSegment = new AtlasTexture(new VTexture(this.bitmapSquareYSidesSegment, 9729, 9729, 10497, true), true);
            AtlasTexture atlasTexture7 = this.atlasTexRandom16;
            if (atlasTexture7 != null) {
                atlasTexture7.dispose();
            }
            this.atlasTexRandom16 = new AtlasTexture(new VTexture(this.bitmapRandom16, 9729, 9729, 10497, false), true);
            AtlasTexture atlasTexture8 = this.atlasTexLoadingPlaceholer;
            if (atlasTexture8 != null) {
                atlasTexture8.dispose();
            }
            this.atlasTexLoadingPlaceholer = new AtlasTexture(new VTexture(this.bitmapLoadingPlaceholer, 9729, 9729, 10497, false), true);
            this.atlasTexLoadingPlaceholerClone = new LoadingAtlasTexture(this.atlasTexLoadingPlaceholer.getTexture2D(), false);
            this.blurShader = disposeShader(this.blurShader);
            VShaderProgram loadShader = loadShader(resources, R.raw.blur_vert, R.raw.blurh_frag);
            this.blurShader = loadShader;
            Assert.assertNotNull(loadShader);
            this.blurShader2 = disposeShader(this.blurShader2);
            VShaderProgram loadShader2 = loadShader(resources, R.raw.blur_vert, R.raw.blurv_frag);
            this.blurShader2 = loadShader2;
            Assert.assertNotNull(loadShader2);
            this.blurKernelShader = disposeShader(this.blurKernelShader);
            VShaderProgram loadShader3 = loadShader(resources, R.raw.buffer_vert, R.raw.blur_kernel_frag);
            this.blurKernelShader = loadShader3;
            Assert.assertNotNull(loadShader3);
            this.blurStackShader = disposeShader(this.blurStackShader);
            VShaderProgram loadShader4 = loadShader(resources, R.raw.blur_vert, R.raw.blur_stack_frag);
            this.blurStackShader = loadShader4;
            Assert.assertNotNull(loadShader4);
            this.fxaaShader = disposeShader(this.fxaaShader);
            VShaderProgram loadShader5 = loadShader(resources, R.raw.fxaa_vert, R.raw.fxaa_frag);
            this.fxaaShader = loadShader5;
            Assert.assertNotNull(loadShader5);
            this.atlasBufferShader = disposeShader(this.atlasBufferShader);
            VShaderProgram loadShader6 = loadShader(resources, R.raw.buffer_vert, R.raw.buffer_frag);
            this.atlasBufferShader = loadShader6;
            Assert.assertNotNull(loadShader6);
            this.atlasBufferFxLightShader = disposeShader(this.atlasBufferFxLightShader);
            VShaderProgram loadShader7 = loadShader(resources, R.raw.buffer_fx_ligh_vert, R.raw.buffer_fx_light_frag);
            this.atlasBufferFxLightShader = loadShader7;
            Assert.assertNotNull(loadShader7);
            this.rgbSplitEffectShader = disposeShader(this.rgbSplitEffectShader);
            VShaderProgram loadShader8 = loadShader(resources, R.raw.buffer_rgb_split_vert, R.raw.buffer_rgb_split_frag);
            this.rgbSplitEffectShader = loadShader8;
            Assert.assertNotNull(loadShader8);
            this.motionBlurEffectShader = disposeShader(this.motionBlurEffectShader);
            VShaderProgram loadShader9 = loadShader(resources, R.raw.buffer_motion_blur_vert, R.raw.buffer_motion_blur_frag);
            this.motionBlurEffectShader = loadShader9;
            Assert.assertNotNull(loadShader9);

            // todo: new shaders here - liquify 

            this.bufferRenderer_atlasBuffer = null;
            this.bufferRenderer_atlasBufferCustomVPMat = null;
            this.bufferRenderer_atlasBufferFxLight = null;
            this.bufferRenderer_RgbSplitEffect = null;
            this.bufferRenderer_MotionBlurEffect = null;
            this.bufferRenderer_blurShader = null;
            this.bufferRenderer_blurShader2 = null;
            this.bufferRenderer_blurShaderKernel = null;
            this.bufferRenderer_blurStackShader = null;
            try {
                this.bufferRenderer = (BufferRenderer) Utils.disposeSafe(this.bufferRenderer);
                BufferRendererEdge bufferRendererEdge = new BufferRendererEdge(400);
                this.bufferRenderer = bufferRendererEdge;
                this.bufferRenderer_atlasBuffer = bufferRendererEdge.CreateShaderBinder(this.atlasBufferShader);
                this.bufferRenderer_atlasBufferCustomVPMat = this.bufferRenderer.CreateShaderBinder(this.atlasBufferShader);
                this.bufferRenderer_atlasBufferFxLight = this.bufferRenderer.CreateShaderBinder(this.atlasBufferFxLightShader);
                this.bufferRenderer_RgbSplitEffect = this.bufferRenderer.CreateShaderBinder(this.rgbSplitEffectShader);
                this.bufferRenderer_MotionBlurEffect = this.bufferRenderer.CreateShaderBinder(this.motionBlurEffectShader);
                this.bufferRenderer_blurShader = this.bufferRenderer.CreateShaderBinder(getBlurShader());
                this.bufferRenderer_blurShader2 = this.bufferRenderer.CreateShaderBinder(getBlurShader2());
                this.bufferRenderer_blurShaderKernel = this.bufferRenderer.CreateShaderBinder(getBlurKernelShader());
                this.bufferRenderer_blurStackShader = this.bufferRenderer.CreateShaderBinder(getBlurStackShader());
            } catch (Exception e) {
                tlog.w("Resources loading error: " + e.getMessage());
                WeakEvent1<String> weakEvent1 = EventsGlobalTextNotifier.onTextMsg;
                weakEvent1.invoke("Resources loading error: " + e.getMessage());
            }
            try {
                this.fontRenderer = new SpriteFontRenderer(this.bufferRenderer);
            } catch (Exception e2) {
                tlog.w("Resources loading error: " + e2.getMessage());
                WeakEvent1<String> weakEvent12 = EventsGlobalTextNotifier.onTextMsg;
                weakEvent12.invoke("Resources loading error: " + e2.getMessage());
            }
        }

        public VShaderProgram disposeShader(VShaderProgram vShaderProgram) {
            if (vShaderProgram != null) {
                vShaderProgram.dispose();
                return null;
            }
            return null;
        }

        // todo:

        public VShaderBinder createCustomShaderBinder(VShaderProgram shaderProgram) {
            return this.bufferRenderer.CreateShaderBinder(shaderProgram);
        }


        // load shader from string data

        public VShaderProgram loadShaderFromString(String vert, String frag) {
            try {
                VShaderProgram vShaderProgram = new VShaderProgram(vert, frag);
                if (vShaderProgram.getLog().length() != 0) {
                    tlog.w(vShaderProgram.getLog());
                }
                return vShaderProgram;
            } catch (Exception e) {
                tlog.w("(" + vert + "; " + frag + ") Resources loading error: " + e.getMessage());
                return null;
            }
        }

        public VShaderProgram loadShader(Resources resources, int i, int i2) {
            try {
                VShaderProgram vShaderProgram = new VShaderProgram(UtilsFileSys.readResource(resources, i), UtilsFileSys.readResource(resources, i2));
                if (vShaderProgram.getLog().length() != 0) {
                    tlog.w(vShaderProgram.getLog());
                }
                return vShaderProgram;
            } catch (Exception e) {
                tlog.w("(" + i + "; " + i2 + ") Resources loading error: " + e.getMessage());
                return null;
            }
        }

        public void onResources(Resources resources) {
            this.bitmapEdge = BitmapFactory.decodeResource(resources, R.drawable.path_edge);
            this.bitmapRoundSegment = BitmapFactory.decodeResource(resources, R.drawable.circle_w_a_64);
            this.bitmapSquareSegment = BitmapFactory.decodeResource(resources, R.drawable.square_w_a_64);
            this.bitmapSquareYSidesSegment = BitmapFactory.decodeResource(resources, R.drawable.square_ysides_w_a_64);
            this.bitmapRandom16 = BitmapFactory.decodeResource(resources, R.drawable.random16);
            this.bitmapLogoBW = BitmapFactory.decodeResource(resources, R.drawable.ic_launcher);
            this.bitmapLoadingPlaceholer = BitmapFactory.decodeResource(resources, R.drawable.loading_placeholder);
        }
    }
}
