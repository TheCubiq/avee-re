package com.daaw.avee.comp.Visualizer.Elements;

import android.graphics.RectF;
import com.daaw.avee.Common.Action3;
import com.daaw.avee.Common.Func.Func3;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.Common.Vec3f;
import com.daaw.avee.Design.GeneralDesign;
import com.daaw.avee.comp.Common.MeasureDefs;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Base.Element;
import com.daaw.avee.comp.Visualizer.Elements.Base.ElementImageLoader;
import com.daaw.avee.comp.Visualizer.Elements.Base.IArea;
import com.daaw.avee.comp.Visualizer.Elements.Base.MeasuredVar;
import com.daaw.avee.comp.Visualizer.Elements.Particles.AreaFactory;
import com.daaw.avee.comp.Visualizer.Elements.Particles.AreaRect;
import com.daaw.avee.comp.Visualizer.Elements.Particles.BasicParticleFactory;
import com.daaw.avee.comp.Visualizer.Elements.Particles.ForceFieldFactory;
import com.daaw.avee.comp.Visualizer.Elements.Particles.IForceField;
import com.daaw.avee.comp.Visualizer.Elements.Particles.IParticle;
import com.daaw.avee.comp.Visualizer.Elements.Particles.IParticleFactory;
import com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture;
import com.daaw.avee.comp.Visualizer.Graphic.GraphicsUtils;
import com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.Graphic.RenderPassData;
import com.daaw.avee.comp.Visualizer.Graphic.RenderState;
import com.daaw.avee.comp.Visualizer.Graphic.VMatrix;
import com.daaw.avee.comp.Visualizer.Graphic.VShaderProgram;
import com.daaw.avee.comp.Visualizer.ICompositionDependencies;
import com.daaw.avee.comp.Visualizer.IDependencyResourceCounter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.ConnectionResult;
import mdesl.graphics.glutils.FrameBuffer;
/* loaded from: classes.dex */
public class ParticlesElement extends Element {
    public static final String[] internalParticles = {"internalres:particle_blur01", "internalres:particle_circle_blur4", "internalres:particle_circle_w_a_64", "internalres:particle_sharp", "composition:0"};
    public static final String[] internalParticlesCelebration = {"internalres:particle_blur01", "internalres:particle_circle_blur4", "internalres:particle_circle_w_a_64", "internalres:particle_sharp", "internalres:snowflake", "internalres:year2018", "composition:0"};
    public static final String typeName = "Particles";
    Func3<Integer, float[], int[], Boolean> MirrorXRender;
    Func3<Integer, float[], int[], Boolean> MirrorXYRender;
    Func3<Integer, float[], int[], Boolean> MirrorYRender;
    Func3<Integer, float[], float[], Boolean> RenderEmpty;
    private Vec2f additionalRelativeVel;
    private IArea areaField;
    private AtlasTexture atlasTex1;
    private int color1;
    private float[] colorRgbaTmp;
    final float[] colorRgbaTmp0;
    private Vec2f dirx0;
    private Vec2f dirx1;
    float drawRectCenterXTmp;
    float drawRectCenterYTmp;
    ElementImageLoader elementImageLoader;
    private float emittingTimeAcc;
    private float everySec;
    private IForceField forceField;
    private MeasuredVar measureOverallScale;
    private MeasuredVar measureOverallSpeed;
    private boolean mirrorX;
    private boolean mirrorY;
    private float nearCameraFadeOutDistance;
    private float overallScale;
    private float overallSpeed;
    private Vec2f particeVisibleBounds;
    private Vec2f particeVisiblePos;
    private IParticleFactory particleFactory;
    private IParticle[] particles;
    private int particlesLowCount;
    private Vec3f pathPointOut;
    private Vec3f pathPointVecOut;
    private float perspectiveDepth;
    private float perspectiveFov;
    final float pi2;
    private Action3<RenderState, VShaderProgram, RenderPassData> shaderOnBindAction;
    public final VMatrix vpMat;

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public String getElementTypeName() {
        return typeName;
    }

    public void setParticlesFactory(IParticleFactory iParticleFactory) {
    }

    public ParticlesElement() {
        super(2, 0.5f, 0.5f);
        this.particlesLowCount = 0;
        this.particles = new IParticle[0];
        this.emittingTimeAcc = 0.0f;
        this.areaField = null;
        this.everySec = 0.03f;
        this.particleFactory = null;
        this.color1 = -1;
        this.overallScale = 1.0f;
        this.overallSpeed = 1.0f;
        this.measureOverallScale = MeasuredVar.AsNothing();
        this.measureOverallSpeed = MeasuredVar.AsNothing();
        this.mirrorY = false;
        this.mirrorX = false;
        this.forceField = null;
        this.perspectiveDepth = 0.0f;
        this.perspectiveFov = 90.0f;
        this.atlasTex1 = null;
        this.pathPointOut = new Vec3f(0.0f, 0.0f, 0.0f);
        this.pathPointVecOut = new Vec3f(0.0f, 0.0f, 0.0f);
        this.particeVisiblePos = new Vec2f(0.0f, 0.0f);
        this.particeVisibleBounds = new Vec2f(0.0f, 0.0f);
        this.additionalRelativeVel = new Vec2f(0.0f, 0.0f);
        this.dirx0 = new Vec2f(0.0f, 0.0f);
        this.dirx1 = new Vec2f(0.0f, 0.0f);
        this.colorRgbaTmp = new float[4];
        this.colorRgbaTmp0 = new float[4];
        this.pi2 = 6.2831855f;
        this.vpMat = new VMatrix();
        this.nearCameraFadeOutDistance = 40.0f;
        this.shaderOnBindAction = new Action3<RenderState, VShaderProgram, RenderPassData>() { // from class: com.daaw.avee.comp.Visualizer.Elements.ParticlesElement.2
            @Override // com.daaw.avee.Common.Action3
            public void onInvoke(RenderState renderState, VShaderProgram vShaderProgram, RenderPassData renderPassData) {
                vShaderProgram.setUniformMatrix("u_projView", false, ParticlesElement.this.vpMat.getObj());
            }
        };
        this.RenderEmpty = new Func3<Integer, float[], float[], Boolean>() { // from class: com.daaw.avee.comp.Visualizer.Elements.ParticlesElement.4
            @Override // com.daaw.avee.Common.Func.Func3
            public Boolean Invoke(Integer num, float[] fArr, float[] fArr2) {
                return false;
            }
        };
        this.MirrorXRender = new Func3<Integer, float[], int[], Boolean>() { // from class: com.daaw.avee.comp.Visualizer.Elements.ParticlesElement.5
            @Override // com.daaw.avee.Common.Func.Func3
            public Boolean Invoke(Integer num, float[] fArr, int[] iArr) {
                Vec3f position = ParticlesElement.this.particles[num.intValue()].getPosition();
                ParticlesElement particlesElement = ParticlesElement.this;
                particlesElement.renderParticle(particlesElement.particles[num.intValue()], ParticlesElement.this.drawRectCenterXTmp + (ParticlesElement.this.drawRectCenterXTmp - position.x), position.y, position.z, -ParticlesElement.this.particles[num.intValue()].getRot(), fArr);
                return true;
            }
        };
        this.MirrorYRender = new Func3<Integer, float[], int[], Boolean>() { // from class: com.daaw.avee.comp.Visualizer.Elements.ParticlesElement.6
            @Override // com.daaw.avee.Common.Func.Func3
            public Boolean Invoke(Integer num, float[] fArr, int[] iArr) {
                Vec3f position = ParticlesElement.this.particles[num.intValue()].getPosition();
                ParticlesElement particlesElement = ParticlesElement.this;
                particlesElement.renderParticle(particlesElement.particles[num.intValue()], position.x, ParticlesElement.this.drawRectCenterYTmp + (ParticlesElement.this.drawRectCenterYTmp - position.y), position.z, -ParticlesElement.this.particles[num.intValue()].getRot(), fArr);
                return true;
            }
        };
        this.MirrorXYRender = new Func3<Integer, float[], int[], Boolean>() { // from class: com.daaw.avee.comp.Visualizer.Elements.ParticlesElement.7
            @Override // com.daaw.avee.Common.Func.Func3
            public Boolean Invoke(Integer num, float[] fArr, int[] iArr) {
                Vec3f position = ParticlesElement.this.particles[num.intValue()].getPosition();
                ParticlesElement particlesElement = ParticlesElement.this;
                particlesElement.renderParticle(particlesElement.particles[num.intValue()], ParticlesElement.this.drawRectCenterXTmp + (ParticlesElement.this.drawRectCenterXTmp - position.x), ParticlesElement.this.drawRectCenterYTmp + (ParticlesElement.this.drawRectCenterYTmp - position.y), position.z, -ParticlesElement.this.particles[num.intValue()].getRot(), fArr);
                return true;
            }
        };
        this.elementImageLoader = new ElementImageLoader(new ElementImageLoader.IOnNeedReCreateGLResources() { // from class: com.daaw.avee.comp.Visualizer.Elements.ParticlesElement.1
            @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ElementImageLoader.IOnNeedReCreateGLResources
            public void markNeedReCreateGLResources() {
                ParticlesElement.this.markNeedReCreateGLResourcesDontOverride();
            }
        }, null, null, null);
        setCustomImage(internalParticles[0]);
        _setParticlesFactory(new BasicParticleFactory());
        setBlendMode(2);
        setScale(0.5f, 0.5f);
        setParticlesCountLimit(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        setParticlesSpawnTime(0.02f);
        setArea(new AreaRect().setVectorZ(1.0f));
        setBlendMode(2);
        setMeasureOverallSpeed(new MeasuredVar(MeasureDefs.beat, 1.5f));
        setParticlesScale(2.0f);
        setCustomImage(internalParticles[1]);
        setPerspectiveDepth(900.0f);
        setPerspectiveFov(150.0f);
        BasicParticleFactory particlesFactory = getParticlesFactory();
        particlesFactory.setSideSineWaveFreq(0.5f);
        particlesFactory.setSideSineWaveMag(0.25f);
        particlesFactory.setColorFrom(-1);
        particlesFactory.setColorTo(-2139062144);
        particlesFactory.setLifetime(8.0f);
        particlesFactory.setFadeInAndOutTime(0.1f);
        particlesFactory.setStartSize(0.0f);
        particlesFactory.setFadeInSize(4.0f);
        particlesFactory.setEndSize(4.0f);
        particlesFactory.setEndSizeRandom(10.0f);
        particlesFactory.setSpeed(100.0f);
        particlesFactory.setSpeedRandom(60.0f);
        particlesFactory.setTrailLength(0.0f);
    }

    public void setCustomImage(String str) {
        this.elementImageLoader.setCustomImage(str);
    }

    public void setArea(IArea iArea) {
        this.areaField = iArea;
    }

    public void setParticlesCountLimit(int i) {
        if (this.particlesLowCount == i) {
            return;
        }
        this.particlesLowCount = i;
        markNeedReCreateGLResources();
    }

    public int getParticlesCountLimit() {
        return this.particlesLowCount;
    }

    public void setParticlesSpawnTime(float f) {
        this.everySec = f;
    }

    public void setParticlesScale(float f) {
        this.overallScale = f;
    }

    public void _setParticlesFactory(IParticleFactory iParticleFactory) {
        this.particleFactory = iParticleFactory;
        markNeedReCreateGLResources();
    }

    public BasicParticleFactory getParticlesFactory() {
        return (BasicParticleFactory) this.particleFactory;
    }

    public void setMeasureOverallScale(MeasuredVar measuredVar) {
        this.measureOverallScale = measuredVar;
    }

    public void setMeasureOverallSpeed(MeasuredVar measuredVar) {
        this.measureOverallSpeed = measuredVar;
    }

    public void setMirrorY(boolean z) {
        this.mirrorY = z;
    }

    public void setMirrorX(boolean z) {
        this.mirrorX = z;
    }

    public void setPerspectiveDepth(float f) {
        this.perspectiveDepth = f;
    }

    public void setPerspectiveFov(float f) {
        this.perspectiveFov = f;
    }

    public void setNearCameraFadeOutDistance(float f) {
        this.nearCameraFadeOutDistance = f;
    }

    public float getNearCameraFadeOutDistance() {
        return this.nearCameraFadeOutDistance;
    }

    int getFreeParticleIndex() {
        int i = 0;
        while (true) {
            IParticle[] iParticleArr = this.particles;
            if (i >= iParticleArr.length || !iParticleArr[i].getAlive()) {
                break;
            }
            i++;
        }
        if (i < this.particles.length) {
            return i;
        }
        return -1;
    }

    public void setColor(int i) {
        this.color1 = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        super.onApplyCustomization(customPropertiesList);
        setCustomImage(customPropertiesList.getPropertyString("customImage", internalParticles[0]));
        this.color1 = customPropertiesList.getPropertyInt(TtmlNode.ATTR_TTS_COLOR, -1);
        setParticlesCountLimit(customPropertiesList.getPropertyInt("CountLimit", ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED));
        this.overallScale = customPropertiesList.getPropertyFloat("particleScale", 2.0f);
        this.everySec = customPropertiesList.getPropertyFloat("spawnTime", 0.02f);
        setMirrorX(customPropertiesList.getPropertyBool("mirrorX", false));
        setMirrorY(customPropertiesList.getPropertyBool("mirrorY", false));
        setPerspectiveDepth(customPropertiesList.getPropertyFloat("perspectiveDepth", 900.0f));
        setPerspectiveFov(customPropertiesList.getPropertyFloat("perspectiveFov", 150.0f));
        CustomPropertiesList child = customPropertiesList.getChild("SpawnArea");
        setArea(AreaFactory.create(child.getTypeName(AreaRect.typeName), this.areaField));
        IArea iArea = this.areaField;
        if (iArea != null) {
            iArea.onApplyCustomization(child);
        }
        this.measureOverallSpeed.onApplyCustomization(customPropertiesList.getChild("MeasureOverallSpeed"), MeasureDefs.beat, 1.5f);
        IParticleFactory iParticleFactory = this.particleFactory;
        if (iParticleFactory != null) {
            iParticleFactory.onApplyCustomization(customPropertiesList);
        }
        CustomPropertiesList child2 = customPropertiesList.getChild("ForceField");
        IForceField create = ForceFieldFactory.create(child2.getTypeName("None"), this.forceField);
        this.forceField = create;
        if (create != null) {
            create.onApplyCustomization(child2);
        }
        setNearCameraFadeOutDistance(customPropertiesList.getPropertyFloat("nearCameraFadeOutDistance", getNearCameraFadeOutDistance()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onReadCustomization(CustomPropertiesList customPropertiesList, IDependencyResourceCounter iDependencyResourceCounter) {
        super.onReadCustomization(customPropertiesList, iDependencyResourceCounter);
        customPropertiesList.setCustomizationName(typeName);
        iDependencyResourceCounter.PutDependencyResourceName(this.elementImageLoader.getCustomImagePath());
        customPropertiesList.putPropertyStringAsImagePr("customImage", this.elementImageLoader.getCustomImagePath(), "appearance", GeneralDesign.celebrationContentAvailable ? internalParticlesCelebration : internalParticles);
        customPropertiesList.putPropertyIntAsCRGBA(TtmlNode.ATTR_TTS_COLOR, this.color1, "1_overall");
        customPropertiesList.putPropertyIntAsRange("CountLimit", getParticlesCountLimit(), "1_overall", 1, 5000);
        customPropertiesList.putPropertyFloatAsRange("particleScale", this.overallScale, "appearance", 0.25f, 8.0f);
        customPropertiesList.putPropertyFloatAsRange("spawnTime", this.everySec, "behaviour", 0.005f, 0.05f);
        customPropertiesList.putPropertyBool("mirrorX", this.mirrorX, "1_overall");
        customPropertiesList.putPropertyBool("mirrorY", this.mirrorY, "1_overall");
        customPropertiesList.putPropertyFloatAsRange("perspectiveDepth", this.perspectiveDepth, "1_overall", 0.0f, 1000.0f);
        customPropertiesList.putPropertyFloatAsRange("perspectiveFov", this.perspectiveFov, "1_overall", 30.0f, 180.0f);
        CustomPropertiesList putEmptyChild = customPropertiesList.putEmptyChild("SpawnArea", AreaFactory.getTypeName(this.areaField), "1_overall", AreaFactory.typeNames);
        IArea iArea = this.areaField;
        if (iArea != null) {
            iArea.onReadCustomization(putEmptyChild);
        }
        CustomPropertiesList putEmptyChild2 = customPropertiesList.putEmptyChild("MeasureOverallSpeed", "", "behaviour", new String[0]);
        MeasuredVar measuredVar = this.measureOverallSpeed;
        if (measuredVar != null) {
            measuredVar.onReadCustomizationSpeed(putEmptyChild2);
        }
        IParticleFactory iParticleFactory = this.particleFactory;
        if (iParticleFactory != null) {
            iParticleFactory.onReadCustomization(customPropertiesList);
        }
        CustomPropertiesList putEmptyChild3 = customPropertiesList.putEmptyChild("ForceField", ForceFieldFactory.getTypeName(this.forceField), "1_overall", ForceFieldFactory.typeNamesAndNone);
        IForceField iForceField = this.forceField;
        if (iForceField != null) {
            iForceField.onReadCustomization(putEmptyChild3);
        }
        customPropertiesList.putPropertyFloatAsRange("nearCameraFadeOutDistance", getNearCameraFadeOutDistance(), "appearance", 0.0f, 500.0f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void markNeedReCreateGLResources() {
        super.markNeedReCreateGLResources();
        ElementImageLoader elementImageLoader = this.elementImageLoader;
        if (elementImageLoader != null) {
            elementImageLoader.markNeedReCreateGLResources();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onDestroyGLResources(RenderState renderState) {
        super.onDestroyGLResources(renderState);
        ElementImageLoader elementImageLoader = this.elementImageLoader;
        if (elementImageLoader != null) {
            elementImageLoader.onDestroyGLResources(renderState);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public boolean onCreateGLResources(RenderState renderState) {
        super.onCreateGLResources(renderState);
        int length = this.particles.length;
        int i = this.particlesLowCount;
        if (length != i) {
            if (this.particleFactory != null) {
                this.particles = new IParticle[i];
                int i2 = 0;
                while (true) {
                    IParticle[] iParticleArr = this.particles;
                    if (i2 >= iParticleArr.length) {
                        break;
                    }
                    iParticleArr[i2] = this.particleFactory.allocateParticle();
                    i2++;
                }
            } else {
                this.particles = new IParticle[0];
            }
        }
        this.elementImageLoader.onCreateGLResources(renderState, new RectF(0.0f, 0.0f, 256.0f, 256.0f), 0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onCreateGradualGLResources(RenderState renderState, int i) {
        super.onCreateGradualGLResources(renderState, i);
        this.elementImageLoader.onCreateGradualGLResources(renderState, i);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onEarlyUpdate(IRenderState iRenderState, FrameBuffer frameBuffer, ICompositionDependencies iCompositionDependencies) {
        super.onEarlyUpdate(iRenderState, frameBuffer, iCompositionDependencies);
        this.elementImageLoader.onEarlyUpdate(iRenderState, frameBuffer, iCompositionDependencies);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onRender(RenderState renderState, FrameBuffer frameBuffer) {
        Action3<RenderState, VShaderProgram, RenderPassData> action3;
        float f;
        float f2;
        float f3;
        Vec2f vec2f;
        Vec2f vec2f2;
        RectF rectF;
        Action3<RenderState, VShaderProgram, RenderPassData> action32;
        super.onRender(renderState, frameBuffer);
        this.elementImageLoader.onRender(renderState, frameBuffer);
        if (this.particles.length != this.particlesLowCount) {
            return;
        }
        RectF measureDrawRect = measureDrawRect(renderState.res.meter);
        Vec2f vec2f3 = new Vec2f(0.0f, 0.0f);
        Vec2f vec2f4 = new Vec2f(0.0f, 0.0f);
        float f4 = this.perspectiveDepth;
        if (f4 > 1.0f) {
            Action3<RenderState, VShaderProgram, RenderPassData> action33 = this.shaderOnBindAction;
            VMatrix vMatrix = this.vpMat;
            float f5 = this.perspectiveFov;
            renderState.getClass();
            renderState.createViewProjMatrixPerspective(vMatrix, vec2f3, frameBuffer, f5, 0.01f, f4 - (-20.0f), -0.5f, -0.5f, -10.0f);
            f2 = measureDrawRect.width() / vec2f3.x;
            f3 = measureDrawRect.height() / vec2f3.y;
            action3 = action33;
            f = -f4;
        } else {
            action3 = null;
            f = 0.0f;
            f2 = 1.0f;
            f3 = 1.0f;
        }
        this.emittingTimeAcc += renderState.getFrameTimeSmooth();
        if (this.particleFactory == null || this.areaField == null) {
            return;
        }
        float max = Math.max(0.01f, this.everySec);
        this.everySec = max;
        float f6 = this.emittingTimeAcc;
        this.emittingTimeAcc = Math.min(max * f6 * 100.0f, f6);
        while (true) {
            float f7 = this.emittingTimeAcc;
            float f8 = this.everySec;
            if (f7 <= f8) {
                break;
            }
            this.emittingTimeAcc = f7 - f8;
            int freeParticleIndex = getFreeParticleIndex();
            if (freeParticleIndex < 0 || freeParticleIndex >= this.particles.length) {
                vec2f = vec2f4;
                vec2f2 = vec2f3;
                rectF = measureDrawRect;
                action32 = action3;
            } else {
                this.areaField.getRandomPointInArea(measureDrawRect, this.pathPointOut, this.pathPointVecOut, this.perspectiveDepth > 1.0f);
                if (this.perspectiveDepth > 1.0f) {
                    vec2f = vec2f4;
                    action32 = action3;
                    vec2f2 = vec2f3;
                    rectF = measureDrawRect;
                    renderState.createViewProjMatrixPerspectiveBoundsAtZ(vec2f4, f, frameBuffer, vec2f3.x / vec2f3.y, this.perspectiveFov);
                    float width = (vec2f.x * 2.0f) / rectF.width();
                    float height = (vec2f.y * 2.0f) / rectF.height();
                    Vec3f vec3f = this.pathPointOut;
                    vec3f.x = ((vec3f.x - rectF.centerX()) * width * f2) + rectF.centerX();
                    Vec3f vec3f2 = this.pathPointOut;
                    vec3f2.y = ((vec3f2.y - rectF.centerY()) * height * f3) + rectF.centerY();
                } else {
                    vec2f = vec2f4;
                    vec2f2 = vec2f3;
                    rectF = measureDrawRect;
                    action32 = action3;
                    this.pathPointVecOut.z = 0.0f;
                }
                this.particleFactory.emitParticleMaybe(renderState, this.particles[freeParticleIndex], new Vec3f(this.pathPointOut.x, this.pathPointOut.y, f), this.pathPointVecOut);
            }
            vec2f4 = vec2f;
            action3 = action32;
            measureDrawRect = rectF;
            vec2f3 = vec2f2;
        }
        Vec2f vec2f5 = vec2f3;
        RectF rectF2 = measureDrawRect;
        Action3<RenderState, VShaderProgram, RenderPassData> action34 = action3;
        IAtlasTexture texture = this.elementImageLoader.getTexture(renderState);
        if (texture == null) {
            texture = renderState.res.getAtlasTexWhite();
        }
        RenderPassData renderPassData = new RenderPassData(getBlendMode(), texture, renderState.res.getBufferRenderer_atlasBufferVPMat(), action34);
        if (this.perspectiveDepth > 1.0f) {
            update(renderState, frameBuffer, rectF2, this.particleFactory.getTrailLength(), renderPassData, new Vec2f(vec2f5.x * 0.5f, vec2f5.y * 0.5f));
        } else {
            update(renderState, frameBuffer, rectF2, this.particleFactory.getTrailLength(), renderPassData, null);
        }
    }

    private void update(final RenderState renderState, FrameBuffer frameBuffer, final RectF rectF, float f, RenderPassData renderPassData, final Vec2f vec2f) {
        float measure = this.overallScale + this.measureOverallScale.measure(renderState.res.meter);
        final float measure2 = this.overallSpeed + (this.measureOverallSpeed.measure(renderState.res.meter) * 5.0f);
        final float measureScreenScale1D = renderState.getRes().getMeter().measureScreenScale1D(measure) * 0.001f;
        final float measureScreenScale1D2 = renderState.getRes().getMeter().measureScreenScale1D(f) * 0.0013888889f;
        final float measureScreenScale1D3 = renderState.getRes().getMeter().measureScreenScale1D(0.0013888889f);
        rectF.centerX();
        rectF.centerY();
        this.drawRectCenterXTmp = rectF.centerX();
        this.drawRectCenterYTmp = rectF.centerY();
        GraphicsUtils.intColorToF4Color(this.colorRgbaTmp0, this.color1);
        final float max = Math.max(1.0E-6f, this.nearCameraFadeOutDistance);
        renderState.res.getBufferRenderer().drawBatchRectangle(renderState, new Func3<Integer, float[], int[], Boolean>() { // from class: com.daaw.avee.comp.Visualizer.Elements.ParticlesElement.3
            @Override // com.daaw.avee.Common.Func.Func3
            public Boolean Invoke(Integer num, float[] fArr, int[] iArr) {
                float f2;
                if (ParticlesElement.this.particles[num.intValue()].getAlive()) {
                    if (ParticlesElement.this.forceField != null) {
                        Vec3f position = ParticlesElement.this.particles[num.intValue()].getPosition();
                        f2 = ParticlesElement.this.forceField.getVelocityAndFactor(position.x - rectF.centerX(), position.y - rectF.centerY(), ParticlesElement.this.additionalRelativeVel);
                    } else {
                        f2 = 0.0f;
                    }
                    if (ParticlesElement.this.particles[num.intValue()].update(renderState.getFrameTimeSmooth(), measureScreenScale1D3, ParticlesElement.this.particeVisiblePos, ParticlesElement.this.particeVisibleBounds, measureScreenScale1D, measure2, ParticlesElement.this.additionalRelativeVel, f2, measureScreenScale1D2, vec2f, ParticlesElement.this.vpMat, max)) {
                        if (renderState.isVisibleOnScreen(ParticlesElement.this.particeVisiblePos, Math.max(ParticlesElement.this.particeVisibleBounds.x, ParticlesElement.this.particeVisibleBounds.y))) {
                            ParticlesElement.this.particles[num.intValue()].setVisible(true);
                            ParticlesElement.this.particles[num.intValue()].updateVisible(renderState.getFrameTimeSmooth());
                            GraphicsUtils.f4ColorMultiply(ParticlesElement.this.colorRgbaTmp, ParticlesElement.this.particles[num.intValue()].getColorArgb(), ParticlesElement.this.colorRgbaTmp0);
                            iArr[0] = GraphicsUtils.f4ColorToIntColorRgba(ParticlesElement.this.colorRgbaTmp, 0);
                            Vec3f position2 = ParticlesElement.this.particles[num.intValue()].getPosition();
                            ParticlesElement particlesElement = ParticlesElement.this;
                            particlesElement.renderParticle(particlesElement.particles[num.intValue()], position2.x, position2.y, position2.z, ParticlesElement.this.particles[num.intValue()].getRot(), fArr);
                            return true;
                        }
                        ParticlesElement.this.particles[num.intValue()].setVisible(false);
                        return false;
                    }
                    return false;
                }
                return false;
            }
        }, this.mirrorX ? this.MirrorXRender : null, this.mirrorY ? this.MirrorYRender : null, (this.mirrorX && this.mirrorY) ? this.MirrorXYRender : null, this.particlesLowCount, 0.0f, new Vec2f(0.0f, 1.0f), new Vec2f(1.0f, 0.0f), renderPassData);
    }

    public void renderParticle(IParticle iParticle, float f, float f2, float f3, float f4, float[] fArr) {
        this.dirx0.x = -iParticle.getSizeX();
        this.dirx0.y = -iParticle.getSizeY();
        this.dirx0.rotate(f4);
        this.dirx1.x = iParticle.getSizeX();
        this.dirx1.y = -iParticle.getSizeY();
        this.dirx1.rotate(f4);
        fArr[0] = this.dirx0.x + f;
        fArr[1] = this.dirx0.y + f2;
        fArr[2] = this.dirx1.x + f;
        fArr[3] = this.dirx1.y + f2;
        fArr[4] = f - this.dirx1.x;
        fArr[5] = f2 - this.dirx1.y;
        fArr[6] = f - this.dirx0.x;
        fArr[7] = f2 - this.dirx0.y;
        fArr[8] = f3;
    }

    private void renderParticle(RenderState renderState, IParticle iParticle, float[] fArr, float f, float f2) {
        Vec3f vec3f;
        AtlasTexture textureFrame = iParticle.getTextureFrame();
        GraphicsUtils.f4ColorMultiply(this.colorRgbaTmp, iParticle.getColorArgb(), fArr);
        int f4ColorToIntColorRgba = GraphicsUtils.f4ColorToIntColorRgba(this.colorRgbaTmp, 0);
        Vec3f position = iParticle.getPosition();
        float rot = iParticle.getRot();
        if (textureFrame == null) {
            textureFrame = renderState.res.getAtlasTexWhite();
        }
        AtlasTexture atlasTexture = textureFrame;
        this.dirx0.x = -iParticle.getSizeX();
        this.dirx0.y = iParticle.getSizeY();
        this.dirx0.rotate(rot);
        this.dirx1.x = iParticle.getSizeX();
        this.dirx1.y = iParticle.getSizeY();
        this.dirx1.rotate(rot);
        renderState.res.getBufferRenderer().drawRectangleFCol(renderState, position.x + this.dirx0.x, position.y + this.dirx0.y, position.x + this.dirx1.x, position.y + this.dirx1.y, position.x - this.dirx1.x, position.y - this.dirx1.y, position.x - this.dirx0.x, position.y - this.dirx0.y, 0.0f, f4ColorToIntColorRgba, Vec2f.zero(), Vec2f.one(), atlasTexture, getBlendMode(), null);
        if (this.mirrorX) {
            position.x = f + (f - position.x);
            vec3f = position;
            renderState.res.getBufferRenderer().drawRectangleFCol(renderState, position.x + this.dirx0.x, position.y + this.dirx0.y, position.x + this.dirx1.x, position.y + this.dirx1.y, position.x - this.dirx1.x, position.y - this.dirx1.y, position.x - this.dirx0.x, position.y - this.dirx0.y, 0.0f, f4ColorToIntColorRgba, Vec2f.zero(), Vec2f.one(), atlasTexture, getBlendMode(), null);
        } else {
            vec3f = position;
        }
        if (this.mirrorY) {
            Vec3f vec3f2 = vec3f;
            vec3f2.y = f2 + (f2 - vec3f2.y);
            renderState.res.getBufferRenderer().drawRectangleFCol(renderState, this.dirx0.x + vec3f2.x, this.dirx0.y + vec3f2.y, this.dirx1.x + vec3f2.x, this.dirx1.y + vec3f2.y, vec3f2.x - this.dirx1.x, vec3f2.y - this.dirx1.y, vec3f2.x - this.dirx0.x, vec3f2.y - this.dirx0.y, 0.0f, f4ColorToIntColorRgba, Vec2f.zero(), Vec2f.one(), atlasTexture, getBlendMode(), null);
        }
    }

    public void setForceField(IForceField iForceField) {
        this.forceField = iForceField;
    }
}
