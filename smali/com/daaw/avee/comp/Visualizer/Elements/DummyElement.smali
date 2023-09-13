.class public Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;
.super Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;
.source "DummyElement.java"


# static fields
.field public static final internalImages:[Ljava/lang/String;

.field public static final typeName:Ljava/lang/String; = "DummyElement"


# instance fields
.field public shaderFrag:Ljava/lang/String;
.field public shaderVert:Ljava/lang/String;


# .field public u_value1:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
# .field public u_value2:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
# .field public u_value3:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
# .field public u_value4:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
# .field public u_value5:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
# .field public u_value6:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

# public HashMap<String, MVariableFloat> u_values

.field public u_values:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;",
            ">;"
        }
    .end annotation
.end field

# public HashMap<String, float[]> valueProperties

.field public valueProperties:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "[F",
            ">;"
        }
    .end annotation
.end field


# private VShaderProgram loadedShader;
# private boolean reloadShader;

.field private loadedShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;
.field private reloadShader:Z


.field private shaderOnBindAction:Lcom/daaw/avee/Common/Action3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Action3<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;",
            ">;"
        }
    .end annotation
.end field

.field targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

.field public final vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "composition:0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 32
    sput-object v1, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->internalImages:[Ljava/lang/String;


    .line 33

    # 

    return-void
.end method

.method public constructor <init>()V
    .locals 15

    

    const/4 v0, 0x4

    const/high16 v1, 0x3f800000    # 1.0f

    .line 55
    invoke-direct {p0, v0, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;-><init>(IFF)V

    
    new-instance v2, Ljava/util/HashMap;
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_values:Ljava/util/HashMap;

    
    new-instance v2, Ljava/util/HashMap;
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->valueProperties:Ljava/util/HashMap;


    # init u_values as new HashMap<String, MVariableFloat>()

    .line 69

    .line 51
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;-><init>()V

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;
  
    # initcustomShader()

    .line 61

    

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->initCustomShader()V

    # const/4 v2, 0x0

    # # this.u_value1 = MVariableFloat.CreateConstantFloat(6.0f);

    # # const/high16 v3, 0x40c00000    # 6.0f
    # const v3, 0x40accccd    # 5.4

    # .line 68
    # invoke-static {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->CreateConstantFloat(F)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    # move-result-object v3

    # iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value1:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;



    # # this.u_value2 = MVariableFloat.CreateConstantFloat(6.0f);

    # # const/high16 v3, 0x40c00000    # 6.0f

    # const v3, 0x40000000    # 2.0f

    # .line 68
    # invoke-static {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->CreateConstantFloat(F)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    # move-result-object v3

    # iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value2:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;


    # # u_value3 (0f)

    # const v3, 0x0

    # invoke-static {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->CreateConstantFloat(F)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    # move-result-object v3

    # iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value3:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    # iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value4:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    # iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value5:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    
    # iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value6:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->initCustomValues()V


    .line 184
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement$2;

    invoke-direct {v2, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement$2;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;)V

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    .line 56
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setBlendMode(I)V

    .line 57
    invoke-virtual {p0, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setScale(FF)V

    .line 59
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement$1;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;-><init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func2;Lcom/daaw/avee/Common/Func/Func2;)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const-string v0, "composition:1"

    .line 66
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setTargetImage(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;)V
    .locals 0

    .line 28
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->markNeedReCreateGLResourcesDontOverride()V

    return-void
.end method


# virtual methods
.method public getElementTypeName()Ljava/lang/String;
    .locals 1

    const-string v0, "DummyElement"

    return-object v0
.end method

.method public getFlipMirror()Z
    .locals 1

    .line 108
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->flipMirror:Z

    return v0
.end method

.method public getMirrorMode()I
    .locals 1

    .line 98
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->mirrorMode:I

    return v0
.end method

.method public getTargetImage()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getCustomImagePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public isShaderEditable()Z
    .locals 1

    const v0, 0x1

    return v0
.end method

.method private setupFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 3

    const/16 v0, 0x2601

    const/16 v1, 0xde1

    const/16 v2, 0x2801

    .line 501
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v2, 0x2800

    .line 502
    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/4 v0, 0x1

    .line 504
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->setTextureWrapping(I)V

    return-void
.end method

.method protected markNeedReCreateGLResources()V
    .locals 1

    .line 151
    invoke-super {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->markNeedReCreateGLResources()V

    .line 152
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->markNeedReCreateGLResources()V

    :cond_0
    return-void
.end method

.method protected onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V
    .locals 8

    .line 113
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    .line 114
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onApplyCustomizationAdditional(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    const-string v0, "TargetImage"

    const-string v1, "composition:1"

    .line 117
    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setTargetImage(Ljava/lang/String;)V




    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderVert:Ljava/lang/String;

    const-string v1, "shaderVertex"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderVert:Ljava/lang/String;

    
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderFrag:Ljava/lang/String;

    const-string v1, "shaderFragment"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderFrag:Ljava/lang/String;


    # todo: prettier with a loop..

    # # this.u_value1 = customPropertiesList.getPropertyMVariableFloat("u_value1", this.u_value1);
    # iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value1:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # const-string v1, "value1"
    # invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # move-result-object v0
    # iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value1:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;


    # # this.u_value2 = customPropertiesList.getPropertyMVariableFloat("u_value2", this.u_value2);
    # iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value2:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # const-string v1, "value2"
    # invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # move-result-object v0
    # iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value2:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;


    # # this.u_value3 = customPropertiesList.getPropertyMVariableFloat("u_value3", this.u_value3);
    # iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value3:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # const-string v1, "value3"
    # invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # move-result-object v0
    # iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value3:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;


    # # this.u_value4 = customPropertiesList.getPropertyMVariableFloat("u_value4", this.u_value4);
    # iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value4:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # const-string v1, "value4"
    # invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # move-result-object v0
    # iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value4:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;


    # # this.u_value5 = customPropertiesList.getPropertyMVariableFloat("u_value5", this.u_value5);
    # iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value5:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # const-string v1, "value5"
    # invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # move-result-object v0
    # iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value5:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;


    # # this.u_value6 = customPropertiesList.getPropertyMVariableFloat("u_value6", this.u_value6);
    # iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value6:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # const-string v1, "value6"
    # invoke-virtual {p1, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # move-result-object v0
    # iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value6:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;






    # for (String propertyName : u_values.keySet()) {
    #     MVariableFloat variableFloat = customPropertiesList.getPropertyMVariableFloat(propertyName, u_values.get(propertyName));
    #     u_values.put(propertyName, variableFloat);
    # }



    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_values:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :goto_1 # exit loop

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2 # propertyName

    check-cast v2, Ljava/lang/String;


    .line 130
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3 # u_values.get(propertyName)

    check-cast v3, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    invoke-virtual {p1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    
    move-result-object v3 # variableFloat

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :goto_1


    # this.reloadShader = true;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->reloadShader:Z



    return-void
.end method

.method protected onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z
    .locals 3

    .line 165
    iget-object v0, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v0, v0, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->meter:Lcom/daaw/avee/comp/Visualizer/Meter;

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->measureDrawRectMaxScaleValues(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v0

    .line 166
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/RectF;I)Z

    .line 167
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Z

    move-result p1

    return p1
.end method

.method protected onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)Z

    .line 173
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)V

    return-void
.end method

.method protected onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 1

    .line 157
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 159
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    :cond_0
    return-void
.end method

.method public onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V
    .locals 1

    .line 178
    invoke-super {p0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    .line 180
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V

    return-void
.end method

.method protected onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V
    .locals 10

    .line 130
    invoke-super {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomization(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;)V

    .line 131
    invoke-super {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onReadCustomizationAdditional(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    # const-string v0, "Dummy Element omg"

    # this.typeName (getTypeName)

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->getElementTypeName()Ljava/lang/String;

    move-result-object v0

    .line 133
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->setCustomizationName(Ljava/lang/String;)V

    .line 136
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->getTargetImage()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Lcom/daaw/avee/comp/Visualizer/IDependencyResourceCounter;->PutDependencyResourceName(Ljava/lang/String;)V

    .line 137
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->getTargetImage()Ljava/lang/String;

    move-result-object v3

    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->internalImages:[Ljava/lang/String;

    const-string v1, "1_appearance"

    const-string v2, "TargetImage"

    invoke-virtual {p1, v2, v3, v1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

 
    # if enableCustomShader 
    # isShaderEditable

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->isShaderEditable()Z

    move-result v0
    


    if-eqz v0, :cond_0

    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderFrag:Ljava/lang/String;

    const-string v0, "shader"

    const-string v1, "shaderFragment"

    invoke-virtual {p1, v1, v3, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsTxtPr(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V




    iget-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderVert:Ljava/lang/String;

    const-string v0, "shader"

    const-string v1, "shaderVertex"

    invoke-virtual {p1, v1, v3, v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyStringAsTxtPr(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0



    # # customPropertiesList.putPropertyMVariableFloat("u_value1", this.u_value1, "3_variables", 0.0f, 6.0f);
    # iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value1:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # const-string v1, "value1"
    # const-string v3, "variables"
    # # const/high16 v4, 0xc1200000    # -10.0f
    # # const/high16 v5, 0x41200000    # 10.0f

    # const/high16 v4, 0xbf800000    # -1.0f
    # const/high16 v5, 0x3f800000    # 1.0f

    # move-object v0, p1
    # invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V


    # # value2
    # iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value2:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # const-string v1, "value2"
    # # const-string v3, "variables"
    # # const/high16 v4, 0xc1200000    # -10.0f
    # # const/high16 v5, 0x41200000    # 10.0f
    # invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V


    # # value3
    # iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value3:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # const-string v1, "value3"
    # invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V


    # # value4
    # iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value4:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # const-string v1, "value4"
    # invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V


    # # value5
    # iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value5:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # const-string v1, "value5"
    # invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V

    # # value5
    # iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_value6:Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;
    # const-string v1, "value6"
    # invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V





    # for (String propertyName : u_values.keySet()) {
    #     float[] properties = valueProperties.get(propertyName);
    #     # float defaultValue = properties[0];
    #     float minValue = properties[1];
    #     float maxValue = properties[2];

    #     customPropertiesList.putPropertyMVariableFloat(propertyName, u_values.get(propertyName), "variables", minValue, maxValue);
    # }

    # iget uvalues 

    





    iget-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->valueProperties:Ljava/util/HashMap;

    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_values:Ljava/util/HashMap;

    # keyset
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
    move-result-object v1
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
    move-result-object v1

    :goto_0

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :goto_1 # exit loop

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
    
    move-result-object v5 # propertyName
    
    check-cast v5, Ljava/lang/String;

    # t.log("addValueWithProperties: " + propertyName);

    # init string builder

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    # append string

    const-string v3, "addValueWithProperties: "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V


    # Get the float array 

    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4 # float[]

    check-cast v4, [F

    const/4 v8, 0x1
    aget v8, v4, v8 # minValue

    const/4 v9, 0x2
    aget v9, v4, v9 # maxValue

    const-string v7, "variables"

    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    # given that we wanna use invoke-virtual/range {x .. y}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V
    # we need to organize the arguments in the stack in the order of the method signature

    # customPropertiesList.putPropertyMVariableFloat("value1", this.u_value1, "variables", -1.0f, 1.0f);

    # v4 = customPropertiesList
    move-object v4, p1

    invoke-virtual/range {v4 .. v9}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putPropertyMVariableFloat(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;Ljava/lang/String;FF)V

    goto :goto_0

    :goto_1








    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 16

    move-object/from16 v6, p0

    move-object/from16 v15, p1

    .line 194
    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    move-object/from16 v1, p2

    invoke-virtual {v0, v15, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    .line 199


    iget-object v0, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->getTexture(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    move-result-object v13

    if-nez v13, :cond_0

    # .line 428
    invoke-super/range {p0 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V

    return-void

    # .line 433
    :cond_0


    invoke-virtual/range {p0 .. p1}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->onRenderCheckResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    .line 204
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->measureDrawRect(Lcom/daaw/avee/comp/Visualizer/Meter;)Landroid/graphics/RectF;

    move-result-object v14

    .line 205
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getRes()Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->getMeter()Lcom/daaw/avee/comp/Visualizer/Meter;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->measureDrawRot(Lcom/daaw/avee/comp/Visualizer/Meter;)F

    move-result v5

    .line 206
    iget-object v2, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->vpMatTmp:Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;

    invoke-virtual {v14}, Landroid/graphics/RectF;->centerX()F

    move-result v3

    invoke-virtual {v14}, Landroid/graphics/RectF;->centerY()F

    move-result v4

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->createRotationAndVpMat(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/Visualizer/Graphic/VMatrix;FFF)V


    invoke-direct/range {p0 .. p1}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->setupFrameBuffer(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V

    invoke-super/range {p0 .. p2}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    
    .line 215

    # VShaderBinder bufferRenderer_FishEyeEffect = renderState.res.getBufferRenderer_FishEyeEffect();

    # iget-object v4, v15, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    # invoke-virtual {v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getBufferRenderer_FishEyeEffect()Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    # move-result-object v4


    # VShaderBinder customShaderBinder = renderState.res.createCustomShaderBinder(renderState.res.loadShaderFromString(this.shaderVert, this.shaderFrag));

    move-object/from16 v6, p0

    iget-object v5, v15, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    # iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderVert:Ljava/lang/String;

    # iget-object v6, v0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderFrag:Ljava/lang/String;

    # invoke-virtual {v5, v4, v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->loadShaderFromString(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    # move-result-object v9





    # if (this.loadedShader == null || this.reloadShader ){
    #     this.reloadShader = false;
    #     this.loadedShader = renderResources.safeDisposeShader(this.loadedShader);
    #     this.loadedShader = renderResources.loadShaderFromString(this.shaderVert, this.shaderFrag);
    # }´

    iget-object v4, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->loadedShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    if-eqz v4, :cond_1

    iget-boolean v4, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->reloadShader:Z

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    

    const/4 v4, 0x0

    iput-boolean v4, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->reloadShader:Z

    iget-object v4, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->loadedShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    # invoke-interface {v5, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState$IRenderResources;->safeDisposeShader(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    invoke-virtual {v5, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->safeDisposeShader(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v4

    iput-object v4, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->loadedShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;


    iget-object v4, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderVert:Ljava/lang/String;

    iget-object v7, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderFrag:Ljava/lang/String;

    invoke-virtual {v5, v4, v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->loadShaderFromString(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    move-result-object v9

    iput-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->loadedShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    # tlog.d("shaderReload")
    const-string v9, "shaderReload"

    invoke-static {v9}, Lcom/daaw/avee/Common/tlog;->d(Ljava/lang/String;)V

    :goto_0

    iget-object v9, v6, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->loadedShader:Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;

    # check if v4 is not null
    const/4 v4, 0x0

    if-eqz v9, :cond_2

    invoke-virtual {v5, v9}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->createCustomShaderBinder(Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderProgram;)Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;

    move-result-object v4

    :cond_2

    # test pass, didn't crash

    .line 218

    move-object/from16 v5, v13

    .line 221
    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->getBlendMode()I

    move-result v7

    iget-object v8, v0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderOnBindAction:Lcom/daaw/avee/Common/Action3;

    invoke-direct {v13, v7, v5, v4, v8}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;-><init>(ILcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;Lcom/daaw/avee/comp/Visualizer/Graphic/VShaderBinder;Lcom/daaw/avee/Common/Action3;)V

    iget v8, v14, Landroid/graphics/RectF;->left:F

    iget v9, v14, Landroid/graphics/RectF;->top:F

    const/4 v10, -0x1 # white

    move-object/from16 v7, p1

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->zero()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v11

    invoke-static {}, Lcom/daaw/avee/Common/Vec2f;->one()Lcom/daaw/avee/Common/Vec2f;

    move-result-object v12
    invoke-virtual/range {v7 .. v13}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->drawFullscreenQuad(FFILcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/Common/Vec2f;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderPassData;)V

    return-void
.end method

.method public setTargetImage(Ljava/lang/String;)V
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->targetImageLoader:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setCustomImage(Ljava/lang/String;)V

    return-void
.end method

# initCustomShader()

.method public initCustomShader()V

    .locals 5

    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;
    move-result-object v2
    invoke-virtual {v2}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;
    move-result-object v2
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
    move-result-object v2



    const v3, 0x7f0f0034
    invoke-static {v2, v3}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;
    move-result-object v3
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderVert:Ljava/lang/String;



    const v3, 0x7f0f0033
    invoke-static {v2, v3}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;
    move-result-object v3
    iput-object v3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->shaderFrag:Ljava/lang/String;


    return-void
.end method


# private void addValueWithProperties(String propertyName, float defaultValue, float minValue, float maxValue) {

.method public addValueWithProperties(Ljava/lang/String;FFF)V
    .locals 8

    # MVariableFloat variableFloat = MVariableFloat.CreateConstantFloat(defaultValue);

    invoke-static {p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;->CreateConstantFloat(F)Lcom/daaw/avee/comp/Visualizer/Elements/Base/MVariableFloat;

    move-result-object v0


    # u_values.put(propertyName, variableFloat);

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->u_values:Ljava/util/HashMap;

    
    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;


    # float[] properties = {defaultValue, minValue, maxValue};

    const/4 v1, 0x3
    new-array v2, v1, [F

    const/4 v1, 0x0
    aput p2, v2, v1
    const/4 v1, 0x1
    aput p3, v2, v1
    const/4 v1, 0x2
    aput p4, v2, v1

    # valueProperties.put(propertyName, properties);

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->valueProperties:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    
    return-void
.end method

.method public initCustomValues()V

    .locals 5

    # addValueWithProperties("value1", 0.0f, -1.0f, 1.0f);

    const-string v0, "value1"
    const/4 v1, 0x0
    const/high16 v2, 0xbf800000    # -1.0f
    const/high16 v3, 0x3f800000    # 1.0f
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V

    const-string v0, "value2"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    const-string v0, "value3"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    const-string v0, "value4"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V
    const-string v0, "value5"
    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/DummyElement;->addValueWithProperties(Ljava/lang/String;FFF)V

    return-void
.end method