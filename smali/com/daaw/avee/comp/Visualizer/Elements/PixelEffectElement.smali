.class public Lcom/daaw/avee/comp/Visualizer/Elements/PixelEffectElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;
.source "PixelEffectElement.java"


# static fields
# .field private static color2:I = -0x7f600000

# .field private static textBlendMode:I = 0x4

.field public static final typeName:Ljava/lang/String; = "PixelEffect"


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

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/PixelEffectElement;->typeName:Ljava/lang/String;

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
    const-string v4, "precision mediump float;\nprecision mediump int;\nprecision lowp sampler2D;\nprecision lowp samplerCube;\n\n"
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    # shaderFrag:
    const-string v4, "// Cubiq - Pixel shader\n\nuniform sampler2D u_texture;\nuniform float u_amount;\nuniform float u_aspectRatio;\nuniform vec2 resolution;\nvarying vec2 vTexCoord;\n  \n  void main() {\n    vec2 resolution = vec2(u_aspectRatio* 2., 1.);\n    vec2 coordinates = vTexCoord;\n    float amount = u_amount/10.;\n    vec2 pixelSize = vec2(amount/resolution.x, amount/resolution.y);\n    vec2 position = (pixelSize.x == 0.) ? vTexCoord : floor(coordinates/pixelSize)*pixelSize;\n\n    vec4 finalColor = texture2D(u_texture, position);\n    gl_FragColor = finalColor;\n}"
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

    const v6, 0x3e99999a    # 0.3f
    const/high16 v7, 0x3f000000    # 0.5f

    const/high16 v8, 0x40000000   # 2.0f


    const-string v0, "amount" #0.5/0/1
    invoke-virtual {p0, v0, v7, v1, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    
    const-string v0, "aspectRatio" # 0.5/0/2
    invoke-virtual {p0, v0, v7, v1, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V

    return-void
.end method
