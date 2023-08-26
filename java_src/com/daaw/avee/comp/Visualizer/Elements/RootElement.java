package com.daaw.avee.comp.Visualizer.Elements;

import android.opengl.GLES20;
import com.daaw.avee.Common.Vec2i;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.comp.Visualizer.CustomComposition;
import com.daaw.avee.comp.Visualizer.CustomScene;
import com.daaw.avee.comp.Visualizer.Elements.Base.Element;
import com.daaw.avee.comp.Visualizer.Elements.Base.ElementGroup;
import com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture;
import com.daaw.avee.comp.Visualizer.Graphic.GraphicsUtils;
import com.daaw.avee.comp.Visualizer.Graphic.RenderState;
import com.daaw.avee.comp.Visualizer.Graphic.VFrameBuffer;
import com.daaw.avee.comp.Visualizer.IDependencyResourceCounter;
import java.util.List;
import junit.framework.Assert;
import mdesl.graphics.glutils.FrameBuffer;
/* loaded from: classes.dex */
public class RootElement extends ElementGroup<Composition, CustomComposition, CustomScene> {
    public static final String typeName = "Root";
    private int basedOnTemplate;
    private boolean captureToImageBuffer;
    private int compareIdentifier;
    private int[] offscreenImageBuffer;
    private String versionId;
    private boolean offscreenRenderingEnabled = false;
    private VFrameBuffer[] offscreenTargetContent = new VFrameBuffer[1];
    private VFrameBuffer fxaaContent = null;
    private boolean showOffscreenContent = false;
    private int offscreenImageWidth = 0;
    private int offscreenImageHeight = 0;
    private int frameCounter = 0;

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public String getElementTypeName() {
        return typeName;
    }

    public RootElement(String str, int i) {
        this.versionId = "10";
        this.versionId = str;
        this.compareIdentifier = i;
        this.basedOnTemplate = i;
    }

    public String getVersionId() {
        return this.versionId;
    }

    public int getBasedOnTemplate() {
        return this.basedOnTemplate;
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ElementGroup
    public void addChildAtEnd(Composition composition) {
        if (this.childList.size() == 0) {
            Assert.assertTrue(composition.isFinalComposition());
        }
        super.addChildAtEnd((RootElement) composition);
    }

    public void addToCompositionAtEnd(Element element) {
        Assert.assertTrue(this.childList.size() > 0);
        ((Composition) this.childList.get(0)).addChildAtEnd(element);
    }

    public void setOffscreenRenderingEnabled(boolean z, boolean z2, int[] iArr) {
        this.captureToImageBuffer = z2;
        if (z2) {
            this.offscreenImageBuffer = iArr;
        } else {
            this.offscreenImageBuffer = null;
        }
        if (this.offscreenRenderingEnabled == z) {
            return;
        }
        this.offscreenRenderingEnabled = z;
        markNeedReCreateGLResources();
    }

    public int[] getOffscreenImageBuffer() {
        return this.offscreenImageBuffer;
    }

    public int getOffscreenImageWidth() {
        return this.offscreenImageWidth;
    }

    public int getOffscreenImageHeight() {
        return this.offscreenImageHeight;
    }

    VFrameBuffer createFrameBuffer(RenderState renderState, VFrameBuffer vFrameBuffer) {
        try {
            Vec2i safeRenderBufferSizeTextureDim = renderState.getSafeRenderBufferSizeTextureDim();
            VFrameBuffer createSafe = VFrameBuffer.createSafe(safeRenderBufferSizeTextureDim.x, safeRenderBufferSizeTextureDim.y, 9729, 10497, false);
            return createSafe != null ? createSafe.checkIfValid() : createSafe;
        } catch (Exception e) {
            tlog.w(e.getMessage());
            return vFrameBuffer;
        }
    }

    VFrameBuffer destroyFrameBuffer(VFrameBuffer vFrameBuffer) {
        if (vFrameBuffer != null) {
            vFrameBuffer.dispose();
            return null;
        }
        return null;
    }

    void renderToFrameBuffer(RenderState renderState, VFrameBuffer vFrameBuffer, FrameBuffer frameBuffer) {
        super.onRender(renderState, vFrameBuffer);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        setupFrameBuffer(renderState);
        renderChilds(renderState, vFrameBuffer);
        if (this.captureToImageBuffer) {
            int[][] iArr = {this.offscreenImageBuffer};
            renderState.bindFrameBuffer(vFrameBuffer);
            this.offscreenImageBuffer = GraphicsUtils.getFrameBufferPixelsRGB(0, 0, vFrameBuffer.getWidth(), vFrameBuffer.getHeight(), iArr);
            this.offscreenImageWidth = vFrameBuffer.getWidth();
            this.offscreenImageHeight = vFrameBuffer.getHeight();
        }
        VFrameBuffer vFrameBuffer2 = this.fxaaContent;
        if (vFrameBuffer2 != null) {
            renderState.bindFrameBuffer(vFrameBuffer2);
            renderState.setBlendMode(0);
            renderState.bindShaderForceFlush(renderState.res.getFxaaShader());
            renderState.res.getFxaaShader().setUniformf("resolutionW", vFrameBuffer.getTexture().getWidth() * 1.0f);
            renderState.res.getFxaaShader().setUniformf("resolutionH", vFrameBuffer.getTexture().getHeight() * 1.0f);
            vFrameBuffer.getTexture().bind();
            renderState.res.getFullQuad().drawShader(renderState.res.getFxaaShader(), "Position");
            super.onRender(renderState, this.fxaaContent);
            if (this.showOffscreenContent) {
                renderState.drawFullscreenQuad(-1, new AtlasTexture(vFrameBuffer.getTexture(), false), getBlendMode());
            }
            GLES20.glFinish();
            renderState.onOffScreenContentRendered(this.fxaaContent.getTexture());
            return;
        }
        super.onRender(renderState, frameBuffer);
        if (this.showOffscreenContent) {
            renderState.drawFullscreenQuad(-1, new AtlasTexture(vFrameBuffer.getTexture(), false), getBlendMode());
        }
        GLES20.glFinish();
        renderState.onOffScreenContentRendered(vFrameBuffer.getTexture());
    }

    public int hashCode() {
        return (this.compareIdentifier * 45) + 47;
    }

    public boolean equals(Object obj) {
        return (obj instanceof RootElement) && this.compareIdentifier == ((RootElement) obj).compareIdentifier;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onDestroyGLResources(RenderState renderState) {
        super.onDestroyGLResources(renderState);
        int i = 0;
        while (true) {
            VFrameBuffer[] vFrameBufferArr = this.offscreenTargetContent;
            if (i < vFrameBufferArr.length) {
                vFrameBufferArr[i] = destroyFrameBuffer(vFrameBufferArr[i]);
                i++;
            } else {
                this.fxaaContent = destroyFrameBuffer(this.fxaaContent);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public boolean onCreateGLResources(RenderState renderState) {
        int i = 0;
        if (this.offscreenRenderingEnabled) {
            while (true) {
                VFrameBuffer[] vFrameBufferArr = this.offscreenTargetContent;
                if (i >= vFrameBufferArr.length) {
                    break;
                }
                vFrameBufferArr[i] = destroyFrameBuffer(vFrameBufferArr[i]);
                VFrameBuffer[] vFrameBufferArr2 = this.offscreenTargetContent;
                vFrameBufferArr2[i] = createFrameBuffer(renderState, vFrameBufferArr2[i]);
                i++;
            }
            this.fxaaContent = destroyFrameBuffer(this.fxaaContent);
        } else {
            while (true) {
                VFrameBuffer[] vFrameBufferArr3 = this.offscreenTargetContent;
                if (i >= vFrameBufferArr3.length) {
                    break;
                }
                vFrameBufferArr3[i] = destroyFrameBuffer(vFrameBufferArr3[i]);
                i++;
            }
            this.fxaaContent = destroyFrameBuffer(this.fxaaContent);
        }
        return super.onCreateGLResources(renderState);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ElementGroup
    public void renderChilds(RenderState renderState, FrameBuffer frameBuffer) {
        renderCompositionIndex(renderState, frameBuffer, 0);
    }

    private void renderCompositionIndex(RenderState renderState, FrameBuffer frameBuffer, int i) {
        if (i >= this.childList.size()) {
            return;
        }
        Composition composition = (Composition) this.childList.get(i);
        if (composition.shouldRender()) {
            composition.markRenderedForThisFrame();
            List<Integer> compositionDependencies = composition.getCompositionDependencies();
            for (int i2 = 0; i2 < compositionDependencies.size(); i2++) {
                renderCompositionIndex(renderState, frameBuffer, compositionDependencies.get(i2).intValue());
            }
            composition.onRenderOffscreenContent(renderState);
            composition.onRender(renderState, frameBuffer);
            renderState.setCompositionResult(i, composition.getCompositionFrameBuffer());
        }
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onRenderOffscreenContent(RenderState renderState) {
        super.onRenderOffscreenContent(renderState);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onRender(RenderState renderState, FrameBuffer frameBuffer) {
        onRenderCheckResources(renderState);
        VFrameBuffer[] vFrameBufferArr = this.offscreenTargetContent;
        int i = this.frameCounter;
        if (vFrameBufferArr[i % vFrameBufferArr.length] == null) {
            super.onRender(renderState, frameBuffer);
            renderChilds(renderState, frameBuffer);
            return;
        }
        renderToFrameBuffer(renderState, vFrameBufferArr[i % vFrameBufferArr.length], frameBuffer);
        this.frameCounter++;
    }

    public void setThemeCustomizationData(CustomScene customScene) {
        if (customScene == null) {
            return;
        }
        this.basedOnTemplate = customScene.getBasedOnTemplate();
        setCustomization(customScene);
    }

    public void readThemeCustomizationData(CustomScene customScene, IDependencyResourceCounter iDependencyResourceCounter) {
        if (getCustomization(customScene, iDependencyResourceCounter)) {
            customScene.setVersionId(getVersionId());
            customScene.setBasedOnTemplate(getBasedOnTemplate());
            customScene.setTypeId(typeName);
        }
    }

    private void setupFrameBuffer(RenderState renderState) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        renderState.setTextureWrapping(1);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ElementGroup
    public Composition CreateFactoryElement(int i, String str, String str2) {
        Assert.assertEquals(Composition.typeName, str);
        Assert.assertTrue(Element.DEFAULT_VERSION.equals(str2) || str2.length() == 0);
        return new Composition(i == 0);
    }
}
