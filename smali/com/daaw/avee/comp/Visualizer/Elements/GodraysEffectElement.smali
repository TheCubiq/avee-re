.class public Lcom/daaw/avee/comp/Visualizer/Elements/GodraysEffectElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;
.source "GodraysEffectElement.java"


# static fields
# .field private static color2:I = -0x7f600000

# .field private static textBlendMode:I = 0x4

.field public static final typeName:Ljava/lang/String; = "GodraysEffect"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 18
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;-><init>()V
    return-void
.end method


# virtual methods
.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/GodraysEffectElement;->typeName:Ljava/lang/String;

    return-object v0
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 0

    .line 41
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    return-void
.end method

.method public isShaderEditable()Z
    .locals 1

    const v0, 0x0

    return v0
.end method

.method public initCustomShader()V

    .locals 5

    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;
    move-result-object v2
    invoke-virtual {v2}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;
    move-result-object v2
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    move-result-object v2


    # load the default shadervert
    const v3, 0x7f0f0034
    invoke-static {v2, v3}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;
    move-result-object v3
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderVert:Ljava/lang/String;


    new-instance v3, Ljava/lang/StringBuilder;
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    # boilerplate
    # const-string v4, "precision mediump float;\nprecision mediump int;\nprecision lowp sampler2D;\nprecision lowp samplerCube;\n\n"
    # invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    # shaderFrag:
    const-string v4, "// Godrays Effect\n// Thanks to the Vizzy Team: vizzy.io \nprecision mediump float;\nprecision mediump int;\nprecision lowp sampler2D;\nprecision lowp samplerCube;  \n    \nuniform sampler2D u_texture;\n\n// uniform float u_time;\nuniform float u_decay;\nuniform float u_density;\nuniform float u_weight;\nuniform float u_rayCenterX;\nuniform float u_rayCenterY;\nuniform float u_rayOpacity;\nuniform float u_saturation;\n\nuniform float u_ignoreDark;\nuniform float u_renderInputOnTop;\n\nuniform float u_sampleCount;\n\n#define ignoreDark floatToBool(u_ignoreDark)\n#define renderInputOnTop floatToBool(u_renderInputOnTop)\n#define nsamples floatToInt(u_sampleCount)\n\nvarying vec2 vTexCoord;\n\nint floatToInt(float f) { return int(f); }\n\nbool floatToBool(float f) { return f > 0.5; }\n\n\n// Algorithm found in https://medium.com/community-play-3d/god-rays-whats-that-5a67f26aeac2 // https://www.shadertoy.com/view/ls2Xzd\n\n// https://github.com/jamieowen/glsl-blend\nfloat blendScreen(float base, float blend) {\n    return 1.0-((1.0-base)*(1.0-blend));\n}\n    \nvec4 blendScreen(vec4 base, vec4 blend) {\n    return vec4(blendScreen(base.r,blend.r),blendScreen(base.g,blend.g),blendScreen(base.b,blend.b),blendScreen(base.a,blend.a));\n}\n    \nvec4 blendScreen(vec4 base, vec4 blend, float opacity) {\n    return (blendScreen(base, blend) * opacity + base * (1.0 - opacity));\n}\n\nvec3 blendScreen(vec3 base, vec3 blend) {\n    return vec3(blendScreen(base.r,blend.r),blendScreen(base.g,blend.g),blendScreen(base.b,blend.b));\n}\n    \nvec3 blendScreen(vec3 base, vec3 blend, float opacity) {\n    return (blendScreen(base, blend) * opacity + base * (1.0 - opacity));\n}\n    \nvec4 saturation(vec4 col, float adjustment)\n{\n    const vec3 W = vec3(0.2125, 0.7154, 0.0721);\n    vec3 color = col.rgb;\n    vec3 intensityRGB = vec3(dot(color, W));\n    vec4 intensityRGBA = vec4(intensityRGB, col.a);\n    return mix(intensityRGBA, col, adjustment);\n}\n    \nvec4 crepuscular_rays(vec2 texCoords, vec2 pos) {\n    //float u_decay = 0.92;\n    //float u_density = 1.0;\n    //float u_weight = 0.58767;\n    /// NUM_SAMPLES will describe the rays quality, you can play with\n    //const int nsamples =50;\n\n    vec2 tc = vTexCoord;\n    \n    vec2 deltaTexCoord = tc - pos.xy;\n    \n    deltaTexCoord *= (1.0 / float(nsamples) * u_density);\n    \n    float illuminationDecay = 1.0;\n  \n    vec4 color = texture2D(u_texture, tc.xy);\n  \n    tc += deltaTexCoord * fract( sin(dot(texCoords.xy+fract(0.), vec2(12.9898, 78.233)))* 43758.5453 );\n    \n    for (int i = 0; i < nsamples; i++)\n    {\n        tc -= deltaTexCoord;\n        vec4 sampl = texture2D(u_texture, tc.xy);\n\n        sampl *= illuminationDecay * u_weight;\n        \n        if(!ignoreDark)\n          color = blendScreen(color, sampl, u_rayOpacity);\n        else {\n          color = vec4(blendScreen(color.rgb, sampl.rgb, u_rayOpacity), color.a);\n        }\n        illuminationDecay *= u_decay;\n    }\n\n    color = saturation(color, u_saturation);\n\n    if(renderInputOnTop) {\n      color.rgb *= vec3(1.0 - texture2D(u_texture, vTexCoord).a);\n      color.rgb += texture2D(u_texture, vTexCoord).rgb;\n    }\n\n    return color;\n}\n\nvoid main(){\n  vec2 uv = vTexCoord;\n  vec2 pos = vec2((u_rayCenterX * -1. + 0.5), (u_rayCenterY * -1. + 0.5));\n  gl_FragColor = crepuscular_rays(uv, pos.xy);\n}"
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    move-result-object v3
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderFrag:Ljava/lang/String;


    return-void
.end method

.method public initCustomValues()V

    .locals 5

    const/4 v2, 0x0 # min 0.0f
    const/high16 v3, 0x3f800000    # max 1.0f

    const v1, 0x3f666666
    const-string v0, "decay"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const v1, 0x3f800000
    const-string v0, "density"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const v1, 0x3e4ccccd
    const-string v0, "weight"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const/high16 v1, 0x3f800000    # default 1.0f
    # max 2.0f
    const/high16 v3, 0x40000000    # max 2.0f
    const-string v0, "rayOpacity"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "saturation"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const/high16 v3, 0x3f800000    #max 1.0f
    const/4 v1, 0x0    # default 0.0f
    const-string v0, "ignoreDarkColors"
    invoke-virtual {p0, v0, v1, v1, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "renderInputOnTop"
    invoke-virtual {p0, v0, v1, v1, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    # default : 0.0f
    # min : -1
    # max : 1

    const/high16 v2, 0xbf800000    # min -1.0f
    const-string v0, "rayCenterX"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
     
    const-string v0, "rayCenterY"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    

    # default : 50f
    # min : 0
    # max : 100

    const v1, 0x42480000
    const v2, 0x0
    const v3, 0x42c80000

    const-string v0, "sampleCount"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    return-void
.end method
