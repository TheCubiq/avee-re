.class public Lcom/daaw/avee/comp/Visualizer/Elements/BulgePinchEffectElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;
.source "BulgePinchEffectElement.java"


# static fields
# .field private static color2:I = -0x7f600000

# .field private static textBlendMode:I = 0x4

.field public static final typeName:Ljava/lang/String; = "bulgePinchEffect"


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

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/BulgePinchEffectElement;->typeName:Ljava/lang/String;

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

    const v0, 0x1

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
    const-string v4, "\n// BulgePinch - Cubified xd \n// original from pixiJS : https://github.com/pixijs/filters/blob/main/filters/bulge-pinch/src/bulgePinch.frag\n\n\nprecision mediump float;\nprecision mediump int;\nprecision lowp sampler2D;\nprecision lowp samplerCube;\n\n\n\nuniform float u_radius;\nuniform float u_strength;\nuniform float u_centerX;\nuniform float u_centerY;\nuniform float u_aspectRatio;\n\nuniform sampler2D u_texture;\nvarying vec2 vTexCoord;\n\n\nvoid main()\n{\n    vec2 center = (vec2(u_centerX,u_centerY) + 1.0)/2.0;\n    float strength = u_strength * 2.;\n    vec2 uv = vTexCoord.xy - center;\n    float distance = length(uv* vec2(u_aspectRatio, 1.));\n    if (distance < u_radius) {\n        float percent = distance / u_radius;\n        if (strength > 0.0) {\n            uv *= mix(1.0, smoothstep(0.0, u_radius / distance, percent), strength * 0.75);\n        } else {\n            uv *= mix(1.0, pow(percent, 1.0 + strength * 0.75) * u_radius / distance, 1.0 - percent);\n        }\n    }\n    uv += center;\n    vec2 clampedCoord = clamp(uv, 0.0, 1.0);\n    vec4 color = texture2D(u_texture, clampedCoord);\n    if (uv != clampedCoord) {\n        color *= max(0.0, 1.0 - length(uv - clampedCoord));\n    }\n\n    gl_FragColor = color;\n}"
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    move-result-object v3
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderFrag:Ljava/lang/String;


    return-void
.end method

.method public initCustomValues()V

    .locals 5

    const/high16 v3, 0x3f800000    # max 1.0f

    const/4 v2, 0x0
    const v1, 0x3e4ccccd   # 0.2f
    const-string v0, "radius"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const/high16 v2, 0xbf800000    # min -1.0f
    const/high16 v1, 0x3f000000   # 0.5f
    const-string v0, "strength"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const/high16 v1, 0x0
    const-string v0, "centerX"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "centerY"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const/high16 v1, 0x40000000    #def 2.0f
    const/high16 v2, 0x0
    const/high16 v3, 0x40800000    #def 4.0f
    const-string v0, "aspectRatio"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    return-void
.end method
