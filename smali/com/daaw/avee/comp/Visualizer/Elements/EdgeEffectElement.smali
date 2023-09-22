.class public Lcom/daaw/avee/comp/Visualizer/Elements/EdgeEffectElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;
.source "EdgeEffectElement.java"


# static fields
# .field private static color2:I = -0x7f600000

# .field private static textBlendMode:I = 0x4

.field public static final typeName:Ljava/lang/String; = "EdgeEffect"


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

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/EdgeEffectElement;->typeName:Ljava/lang/String;

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
    const-string v4, "// Cubiqued - https://www.shadertoy.com/view/td2yDm\nprecision mediump float;\nprecision mediump int;\nprecision lowp sampler2D;\nprecision lowp samplerCube;\n\nuniform float u_amount;\nuniform sampler2D u_texture;\n\nvarying vec2 vTexCoord;\n\nvoid main()\n{\n    // I suggest playing around with this value\n    float h = u_amount / 200.;\n    \n    vec4 o = texture2D(u_texture, vTexCoord);\n    vec4 n = texture2D(u_texture, vTexCoord + vec2(0, h));\n    vec4 e = texture2D(u_texture, vTexCoord + vec2(h, 0));\n    vec4 s = texture2D(u_texture, vTexCoord - vec2(0, h));\n    vec4 w = texture2D(u_texture, vTexCoord - vec2(h, 0));\n    \n    vec4 dy = (n - s) * 0.5;\n    vec4 dx = (e - w) * 0.5;\n    \n    vec4 edge = sqrt(dx * dx + dy * dy);\n    vec4 angle = atan(dy, dx);\n   \n    gl_FragColor = vec4(edge * 5.0); \n}"
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    move-result-object v3
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderFrag:Ljava/lang/String;


    return-void
.end method

.method public initCustomValues()V

    .locals 10

    # addValueWithProperties("value1", 0.0f, -1.0f, 1.0f);

    # 0.5/0/1
    const v1, 0x3f000000    
    const v2, 0x0
    const v3, 0x3f800000   
    
    const-string v0, "amount"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V

    return-void
.end method
