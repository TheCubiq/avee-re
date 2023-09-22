.class public Lcom/daaw/avee/comp/Visualizer/Elements/FOVElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;
.source "FOVElement.java"


# static fields
# .field private static color2:I = -0x7f600000

# .field private static textBlendMode:I = 0x4

.field public static final typeName:Ljava/lang/String; = "FOV"


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

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/FOVElement;->typeName:Ljava/lang/String;

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
    const-string v4, "precision mediump float;\nprecision mediump int;\nprecision lowp sampler2D;\nprecision lowp samplerCube;\n\nvarying vec2 vTexCoord;\nuniform sampler2D u_texture;\n\nuniform float u_scale;\nuniform float u_curvature;\nuniform float u_aspectRatio;\nuniform float u_repeatTexture;\n\n#define REPEAT_TEXTURE !floatToBool(u_repeatTexture)\n\nbool floatToBool(float f) { return f > 0.5; }\n\nvec2 GLCoord2TextureCoord(vec2 glCoord) {\n    return glCoord * vec2(1.0, -1.0) / 2.0 +vec2(0.5);\n}\nvoid main() {\n\n    vec2 vPosition = (vTexCoord - vec2(0.5));\n    vPosition.y *= -1.0;\n\n    float b = 1280./720.;\n    float scale = u_scale; // Set your uniform value here\n\n    float _A = 2.0;\n    float _B = b;\n    float _F = u_curvature*4.;\n    float L = length(vec3(vPosition.xy / scale, _F));\n\n    vec2 vMapping = vPosition.xy * _F / L;\n    vMapping = vMapping * vec2(u_aspectRatio, 1.);\n\n    vMapping = GLCoord2TextureCoord(vMapping / scale);\n\n    vec4 textureColor = texture2D(u_texture, vMapping);\n\n    // if (vMapping.x > 0.99 || vMapping.x < 0.01 || vMapping.y > 0.99 || vMapping.y < 0.01) {\n    //     textureColor = vec4(0.0, 0.0, 0.0, 1.0);\n    // }\n\n    gl_FragColor = textureColor;\n\n\n\n    vec4 image2 = texture2D(u_texture, vMapping);\n    \n    if (REPEAT_TEXTURE &&\n        (vMapping.x > 0.99 || vMapping.x < 0.01 || vMapping.y > 0.99 || vMapping.y < 0.01)) {\n        image2 = vec4(0.0);\n    }\n    \n    gl_FragColor = image2;\n}\n"
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    move-result-object v3
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderFrag:Ljava/lang/String;


    return-void
.end method

.method public initCustomValues()V

    .locals 10

    # addValueWithProperties("value1", 0.0f, -1.0f, 1.0f);

    const/4 v1, 0x0

    const/high16 v2, 0xbf800000    # -1.0f
    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, 0xc1200000    # -10.0f
    const/high16 v5, 0x41200000    # 10.0f

    # const/high16 v6, 0xc3b40000   # -360.0f
    # const/high16 v7, 0x43b40000    # 360.0f

    # const/high16 v8, 0xc0000000    # -2.0f
    const/high16 v6, 0x40000000   # 2.0f

    const v7, 0x3e99999a    # 0.3f
    # -0.5f, 0.5f
    # const/high16 v7, 0xbf000000   # -0.5f
    const/high16 v8, 0x3f000000   # 0.5f



    const-string v0, "curvature" #0.5/0/1
    invoke-virtual {p0, v0, v8, v1, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "scale" #0.5/0/1
    invoke-virtual {p0, v0, v8, v1, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
     
    const-string v0, "aspectRatio" #1/0/4
    invoke-virtual {p0, v0, v3, v1, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
     
    const-string v0, "repeatTexture" #1/0/1
    invoke-virtual {p0, v0, v3, v1, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
     
    return-void
.end method
