.class Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;
.super Lorg/xml/sax/helpers/DefaultHandler;
.source "SVGParser.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/larvalabs/svgandroid/SVGParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SVGHandler"
.end annotation


# instance fields
.field private SVG_FILL:Ljava/lang/String;

.field bounds:Landroid/graphics/RectF;

.field private boundsMode:Z

.field private canvas:Landroid/graphics/Canvas;

.field canvasRestoreCount:Ljava/lang/Integer;

.field drawCharacters:Z

.field fillPaint:Landroid/graphics/Paint;

.field final fillPaintStack:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Landroid/graphics/Paint;",
            ">;"
        }
    .end annotation
.end field

.field fillSet:Z

.field final fillSetStack:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field font_matrix:Landroid/graphics/Matrix;

.field private final gradMatrix:Landroid/graphics/Matrix;

.field gradient:Lcom/larvalabs/svgandroid/SVGParser$Gradient;

.field final gradientMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/larvalabs/svgandroid/SVGParser$Gradient;",
            ">;"
        }
    .end annotation
.end field

.field private hidden:Z

.field private hiddenLevel:I

.field final layerAttributeStack:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lcom/larvalabs/svgandroid/SVGParser$LayerAttributes;",
            ">;"
        }
    .end annotation
.end field

.field final limits:Landroid/graphics/RectF;

.field private limitsAdjustmentX:Ljava/lang/Float;

.field private limitsAdjustmentY:Ljava/lang/Float;

.field final matrixStack:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Landroid/graphics/Matrix;",
            ">;"
        }
    .end annotation
.end field

.field newLineCount:I

.field opacityMultiplier:Ljava/lang/Float;

.field private picture:Landroid/graphics/Picture;

.field final rect:Landroid/graphics/RectF;

.field replaceColor:Ljava/lang/Integer;

.field searchColor:Ljava/lang/Integer;

.field strokePaint:Landroid/graphics/Paint;

.field final strokePaintStack:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Landroid/graphics/Paint;",
            ">;"
        }
    .end annotation
.end field

.field strokeSet:Z

.field final strokeSetStack:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field textPaint:Landroid/graphics/Paint;

.field textSize:Ljava/lang/Float;

.field textX:Ljava/lang/Float;

.field textY:Ljava/lang/Float;

.field private final tmpLimitRect:Landroid/graphics/RectF;

.field final transformStack:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field whiteMode:Z


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 878
    invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    .line 838
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->layerAttributeStack:Ljava/util/LinkedList;

    const/4 v0, 0x0

    .line 841
    iput-boolean v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokeSet:Z

    .line 842
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaintStack:Ljava/util/LinkedList;

    .line 843
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokeSetStack:Ljava/util/LinkedList;

    .line 846
    iput-boolean v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillSet:Z

    .line 847
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaintStack:Ljava/util/LinkedList;

    .line 848
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillSetStack:Ljava/util/LinkedList;

    .line 859
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    const/4 v1, 0x0

    .line 860
    iput-object v1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->bounds:Landroid/graphics/RectF;

    .line 861
    new-instance v2, Landroid/graphics/RectF;

    const/high16 v3, -0x800000    # Float.NEGATIVE_INFINITY

    const/high16 v4, 0x7f800000    # Float.POSITIVE_INFINITY

    invoke-direct {v2, v4, v4, v3, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limits:Landroid/graphics/RectF;

    .line 864
    iput-object v1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->searchColor:Ljava/lang/Integer;

    .line 865
    iput-object v1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->replaceColor:Ljava/lang/Integer;

    .line 866
    iput-object v1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->opacityMultiplier:Ljava/lang/Float;

    .line 868
    iput-boolean v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->whiteMode:Z

    .line 872
    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    iput-object v2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->transformStack:Ljava/util/LinkedList;

    .line 873
    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    iput-object v2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->matrixStack:Ljava/util/LinkedList;

    .line 875
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->gradientMap:Ljava/util/HashMap;

    .line 876
    iput-object v1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->gradient:Lcom/larvalabs/svgandroid/SVGParser$Gradient;

    .line 919
    new-instance v2, Landroid/graphics/Matrix;

    invoke-direct {v2}, Landroid/graphics/Matrix;-><init>()V

    iput-object v2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->gradMatrix:Landroid/graphics/Matrix;

    .line 1194
    iput-boolean v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->hidden:Z

    .line 1195
    iput v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->hiddenLevel:I

    .line 1196
    iput-boolean v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->boundsMode:Z

    .line 1213
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->tmpLimitRect:Landroid/graphics/RectF;

    .line 1248
    iput-object v1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->SVG_FILL:Ljava/lang/String;

    .line 879
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    const/4 v1, 0x1

    .line 880
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 881
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 882
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    .line 883
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 884
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 885
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->textPaint:Landroid/graphics/Paint;

    .line 886
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 887
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->matrixStack:Ljava/util/LinkedList;

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    .line 888
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->layerAttributeStack:Ljava/util/LinkedList;

    new-instance v1, Lcom/larvalabs/svgandroid/SVGParser$LayerAttributes;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v1, v2}, Lcom/larvalabs/svgandroid/SVGParser$LayerAttributes;-><init>(F)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    return-void
.end method

.method private doColor(Lcom/larvalabs/svgandroid/SVGParser$Properties;Ljava/lang/Integer;ZLandroid/graphics/Paint;)V
    .locals 1

    .line 1124
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const v0, 0xffffff

    and-int/2addr p2, v0

    const/high16 v0, -0x1000000

    or-int/2addr p2, v0

    .line 1125
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->searchColor:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, p2, :cond_0

    .line 1126
    iget-object p2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->replaceColor:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    :cond_0
    const/4 v0, 0x0

    .line 1128
    invoke-virtual {p4, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 1129
    invoke-virtual {p4, p2}, Landroid/graphics/Paint;->setColor(I)V

    const-string p2, "opacity"

    .line 1130
    invoke-virtual {p1, p2}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getFloat(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p2

    if-nez p2, :cond_2

    if-eqz p3, :cond_1

    const-string p2, "fill-opacity"

    goto :goto_0

    :cond_1
    const-string p2, "stroke-opacity"

    .line 1132
    :goto_0
    invoke-virtual {p1, p2}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getFloat(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p2

    :cond_2
    if-eqz p2, :cond_3

    .line 1135
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p1

    goto :goto_1

    :cond_3
    const/high16 p1, 0x3f800000    # 1.0f

    .line 1136
    :goto_1
    invoke-virtual {p0}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->currentLayerAttributes()Lcom/larvalabs/svgandroid/SVGParser$LayerAttributes;

    move-result-object p2

    iget p2, p2, Lcom/larvalabs/svgandroid/SVGParser$LayerAttributes;->opacity:F

    mul-float p1, p1, p2

    .line 1137
    iget-object p2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->opacityMultiplier:Ljava/lang/Float;

    if-eqz p2, :cond_4

    .line 1138
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    mul-float p1, p1, p2

    :cond_4
    const/high16 p2, 0x437f0000    # 255.0f

    mul-float p1, p1, p2

    float-to-int p1, p1

    .line 1140
    invoke-virtual {p4, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    return-void
.end method

.method private doFill(Lcom/larvalabs/svgandroid/SVGParser$Properties;Landroid/graphics/RectF;)Z
    .locals 8

    const-string v0, "display"

    .line 922
    invoke-virtual {p1, v0}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "none"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    return v2

    .line 925
    :cond_0
    iget-boolean v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->whiteMode:Z

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_1

    .line 926
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 927
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    const/4 p2, -0x1

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    return v4

    :cond_1
    const-string v0, "fill"

    .line 930
    invoke-virtual {p1, v0}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    .line 931
    iget-object v5, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->SVG_FILL:Ljava/lang/String;

    if-eqz v5, :cond_2

    move-object v0, v5

    :cond_2
    const/high16 v5, -0x1000000

    if-eqz v0, :cond_9

    const-string v6, "url(#"

    .line 935
    invoke-virtual {v0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    const-string v7, "SVGAndroid"

    if-eqz v6, :cond_6

    const/4 v1, 0x5

    .line 938
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 939
    iget-object v1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->gradientMap:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;

    if-eqz v1, :cond_3

    .line 942
    iget-object v2, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->shader:Landroid/graphics/Shader;

    goto :goto_0

    :cond_3
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_5

    .line 946
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 947
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->gradMatrix:Landroid/graphics/Matrix;

    iget-object v0, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->matrix:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 948
    iget-boolean p1, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->boundingBox:Z

    if-eqz p1, :cond_4

    if-eqz p2, :cond_4

    .line 950
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->gradMatrix:Landroid/graphics/Matrix;

    iget v0, p2, Landroid/graphics/RectF;->left:F

    iget v1, p2, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 951
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->gradMatrix:Landroid/graphics/Matrix;

    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result p2

    invoke-virtual {p1, v0, p2}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 953
    :cond_4
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->gradMatrix:Landroid/graphics/Matrix;

    invoke-virtual {v2, p1}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    return v4

    .line 956
    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Didn\'t find shader, using black: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v7, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 957
    iget-object p2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 958
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    invoke-direct {p0, p1, p2, v4, v0}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doColor(Lcom/larvalabs/svgandroid/SVGParser$Properties;Ljava/lang/Integer;ZLandroid/graphics/Paint;)V

    return v4

    .line 961
    :cond_6
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_7

    .line 962
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 963
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    return v4

    .line 966
    :cond_7
    iget-object p2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 967
    invoke-virtual {p1, v0}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getColor(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_8

    .line 969
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    invoke-direct {p0, p1, p2, v4, v0}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doColor(Lcom/larvalabs/svgandroid/SVGParser$Properties;Ljava/lang/Integer;ZLandroid/graphics/Paint;)V

    return v4

    .line 972
    :cond_8
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unrecognized fill color, using black: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v7, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 973
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    invoke-direct {p0, p1, p2, v4, v0}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doColor(Lcom/larvalabs/svgandroid/SVGParser$Properties;Ljava/lang/Integer;ZLandroid/graphics/Paint;)V

    return v4

    .line 978
    :cond_9
    iget-boolean p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillSet:Z

    if-eqz p1, :cond_b

    .line 980
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    move-result p1

    if-eqz p1, :cond_a

    const/4 v2, 0x1

    :cond_a
    return v2

    .line 983
    :cond_b
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 984
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v5}, Landroid/graphics/Paint;->setColor(I)V

    return v4
.end method

.method private doGradient(ZLorg/xml/sax/Attributes;)Lcom/larvalabs/svgandroid/SVGParser$Gradient;
    .locals 3

    .line 1054
    new-instance v0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/larvalabs/svgandroid/SVGParser$Gradient;-><init>(Lcom/larvalabs/svgandroid/SVGParser$1;)V

    const-string v1, "id"

    .line 1055
    invoke-static {v1, p2}, Lcom/larvalabs/svgandroid/SVGParser;->access$100(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->id:Ljava/lang/String;

    .line 1056
    iput-boolean p1, v0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->isLinear:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const-string p1, "x1"

    .line 1058
    invoke-static {p1, p2, v1}, Lcom/larvalabs/svgandroid/SVGParser;->access$400(Ljava/lang/String;Lorg/xml/sax/Attributes;F)F

    move-result p1

    iput p1, v0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->x1:F

    const/high16 p1, 0x3f800000    # 1.0f

    const-string v2, "x2"

    .line 1059
    invoke-static {v2, p2, p1}, Lcom/larvalabs/svgandroid/SVGParser;->access$400(Ljava/lang/String;Lorg/xml/sax/Attributes;F)F

    move-result p1

    iput p1, v0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->x2:F

    const-string p1, "y1"

    .line 1060
    invoke-static {p1, p2, v1}, Lcom/larvalabs/svgandroid/SVGParser;->access$400(Ljava/lang/String;Lorg/xml/sax/Attributes;F)F

    move-result p1

    iput p1, v0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->y1:F

    const-string p1, "y2"

    .line 1061
    invoke-static {p1, p2, v1}, Lcom/larvalabs/svgandroid/SVGParser;->access$400(Ljava/lang/String;Lorg/xml/sax/Attributes;F)F

    move-result p1

    iput p1, v0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->y2:F

    goto :goto_0

    :cond_0
    const-string p1, "cx"

    .line 1063
    invoke-static {p1, p2, v1}, Lcom/larvalabs/svgandroid/SVGParser;->access$400(Ljava/lang/String;Lorg/xml/sax/Attributes;F)F

    move-result p1

    iput p1, v0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->x:F

    const-string p1, "cy"

    .line 1064
    invoke-static {p1, p2, v1}, Lcom/larvalabs/svgandroid/SVGParser;->access$400(Ljava/lang/String;Lorg/xml/sax/Attributes;F)F

    move-result p1

    iput p1, v0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->y:F

    const-string p1, "r"

    .line 1065
    invoke-static {p1, p2, v1}, Lcom/larvalabs/svgandroid/SVGParser;->access$400(Ljava/lang/String;Lorg/xml/sax/Attributes;F)F

    move-result p1

    iput p1, v0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->radius:F

    :goto_0
    const-string p1, "gradientTransform"

    .line 1067
    invoke-static {p1, p2}, Lcom/larvalabs/svgandroid/SVGParser;->access$100(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 1069
    invoke-static {p1}, Lcom/larvalabs/svgandroid/SVGParser;->access$500(Ljava/lang/String;)Landroid/graphics/Matrix;

    move-result-object p1

    iput-object p1, v0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->matrix:Landroid/graphics/Matrix;

    :cond_1
    const-string p1, "spreadMethod"

    .line 1071
    invoke-static {p1, p2}, Lcom/larvalabs/svgandroid/SVGParser;->access$100(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, "pad"

    :cond_2
    const-string v1, "reflect"

    .line 1077
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object p1, Landroid/graphics/Shader$TileMode;->MIRROR:Landroid/graphics/Shader$TileMode;

    goto :goto_1

    :cond_3
    const-string v1, "repeat"

    .line 1078
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    goto :goto_1

    :cond_4
    sget-object p1, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    :goto_1
    iput-object p1, v0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->tilemode:Landroid/graphics/Shader$TileMode;

    const-string p1, "gradientUnits"

    .line 1080
    invoke-static {p1, p2}, Lcom/larvalabs/svgandroid/SVGParser;->access$100(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_5

    const-string p1, "objectBoundingBox"

    :cond_5
    const-string v1, "userSpaceOnUse"

    .line 1084
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v1, 0x1

    xor-int/2addr p1, v1

    iput-boolean p1, v0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->boundingBox:Z

    const-string p1, "href"

    .line 1086
    invoke-static {p1, p2}, Lcom/larvalabs/svgandroid/SVGParser;->access$100(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_7

    const-string p2, "#"

    .line 1088
    invoke-virtual {p1, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 1089
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    .line 1091
    :cond_6
    iput-object p1, v0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->xlink:Ljava/lang/String;

    :cond_7
    return-object v0
.end method

.method private doLimits(Landroid/graphics/RectF;)V
    .locals 1

    const/4 v0, 0x0

    .line 1224
    invoke-direct {p0, p1, v0}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doLimits(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    return-void
.end method

.method private doLimits(Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    .locals 2

    .line 1216
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->matrixStack:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Matrix;

    .line 1217
    iget-object v1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->tmpLimitRect:Landroid/graphics/RectF;

    invoke-virtual {v0, v1, p1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 1218
    :cond_0
    invoke-virtual {p2}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result p1

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p1, p2

    .line 1219
    :goto_0
    iget-object p2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->tmpLimitRect:Landroid/graphics/RectF;

    iget p2, p2, Landroid/graphics/RectF;->left:F

    sub-float/2addr p2, p1

    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->tmpLimitRect:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    sub-float/2addr v0, p1

    invoke-direct {p0, p2, v0}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doLimits2(FF)V

    .line 1220
    iget-object p2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->tmpLimitRect:Landroid/graphics/RectF;

    iget p2, p2, Landroid/graphics/RectF;->right:F

    add-float/2addr p2, p1

    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->tmpLimitRect:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    add-float/2addr v0, p1

    invoke-direct {p0, p2, v0}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doLimits2(FF)V

    return-void
.end method

.method private doLimits2(FF)V
    .locals 1

    .line 1199
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limits:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    .line 1200
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limits:Landroid/graphics/RectF;

    iput p1, v0, Landroid/graphics/RectF;->left:F

    .line 1202
    :cond_0
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limits:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    .line 1203
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limits:Landroid/graphics/RectF;

    iput p1, v0, Landroid/graphics/RectF;->right:F

    .line 1205
    :cond_1
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limits:Landroid/graphics/RectF;

    iget p1, p1, Landroid/graphics/RectF;->top:F

    cmpg-float p1, p2, p1

    if-gez p1, :cond_2

    .line 1206
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limits:Landroid/graphics/RectF;

    iput p2, p1, Landroid/graphics/RectF;->top:F

    .line 1208
    :cond_2
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limits:Landroid/graphics/RectF;

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    cmpl-float p1, p2, p1

    if-lez p1, :cond_3

    .line 1209
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limits:Landroid/graphics/RectF;

    iput p2, p1, Landroid/graphics/RectF;->bottom:F

    :cond_3
    return-void
.end method

.method private doStroke(Lcom/larvalabs/svgandroid/SVGParser$Properties;)Z
    .locals 5

    .line 991
    iget-boolean v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->whiteMode:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const-string v0, "display"

    .line 995
    invoke-virtual {p1, v0}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "none"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const-string v0, "stroke-width"

    .line 1000
    invoke-virtual {p1, v0}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getFloat(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1002
    iget-object v3, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    :cond_2
    const-string v0, "stroke-linecap"

    .line 1005
    invoke-virtual {p1, v0}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "round"

    .line 1006
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 1007
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    goto :goto_0

    :cond_3
    const-string v4, "square"

    .line 1008
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 1009
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    goto :goto_0

    :cond_4
    const-string v4, "butt"

    .line 1010
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1011
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    invoke-virtual {v0, v4}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    :cond_5
    :goto_0
    const-string v0, "stroke-linejoin"

    .line 1014
    invoke-virtual {p1, v0}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "miter"

    .line 1015
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 1016
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    goto :goto_1

    .line 1017
    :cond_6
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 1018
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    goto :goto_1

    :cond_7
    const-string v3, "bevel"

    .line 1019
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 1020
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    :cond_8
    :goto_1
    const-string v0, "stroke-dasharray"

    .line 1023
    invoke-virtual {p1, v0}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "stroke-dashoffset"

    invoke-virtual {p1, v3}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v0, v3}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->pathStyleHelper(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "stroke"

    .line 1025
    invoke-virtual {p1, v0}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getAttr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x1

    if-eqz v0, :cond_b

    .line 1027
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 1028
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    return v1

    .line 1031
    :cond_9
    invoke-virtual {p1, v0}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getColor(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_a

    .line 1033
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    invoke-direct {p0, p1, v2, v1, v0}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doColor(Lcom/larvalabs/svgandroid/SVGParser$Properties;Ljava/lang/Integer;ZLandroid/graphics/Paint;)V

    return v3

    .line 1036
    :cond_a
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unrecognized stroke color, using none: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "SVGAndroid"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 1037
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    return v1

    .line 1042
    :cond_b
    iget-boolean p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokeSet:Z

    if-eqz p1, :cond_d

    .line 1044
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    move-result p1

    if-eqz p1, :cond_c

    const/4 v1, 0x1

    :cond_c
    return v1

    .line 1047
    :cond_d
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    return v1
.end method

.method private finishGradients()V
    .locals 11

    .line 1097
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->gradientMap:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;

    .line 1098
    iget-object v2, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->xlink:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 1099
    iget-object v2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->gradientMap:Ljava/util/HashMap;

    iget-object v3, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->xlink:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/larvalabs/svgandroid/SVGParser$Gradient;

    if-eqz v2, :cond_0

    .line 1101
    invoke-virtual {v1, v2}, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->inherit(Lcom/larvalabs/svgandroid/SVGParser$Gradient;)V

    .line 1104
    :cond_0
    iget-object v2, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->colors:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v8, v2, [I

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v2, :cond_1

    .line 1106
    iget-object v5, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->colors:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    aput v5, v8, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 1108
    :cond_1
    iget-object v4, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->positions:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    new-array v9, v4, [F

    :goto_2
    if-ge v3, v4, :cond_2

    .line 1110
    iget-object v5, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->positions:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    aput v5, v9, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    if-nez v2, :cond_3

    .line 1113
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BAD gradient, id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->id:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "BAD"

    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1115
    :cond_3
    iget-boolean v2, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->isLinear:Z

    if-eqz v2, :cond_4

    .line 1116
    new-instance v2, Landroid/graphics/LinearGradient;

    iget v4, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->x1:F

    iget v5, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->y1:F

    iget v6, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->x2:F

    iget v7, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->y2:F

    iget-object v10, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->tilemode:Landroid/graphics/Shader$TileMode;

    move-object v3, v2

    invoke-direct/range {v3 .. v10}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    iput-object v2, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->shader:Landroid/graphics/Shader;

    goto/16 :goto_0

    .line 1118
    :cond_4
    new-instance v2, Landroid/graphics/RadialGradient;

    iget v4, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->x:F

    iget v5, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->y:F

    iget v6, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->radius:F

    iget-object v10, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->tilemode:Landroid/graphics/Shader$TileMode;

    move-object v3, v2

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    invoke-direct/range {v3 .. v9}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    iput-object v2, v1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->shader:Landroid/graphics/Shader;

    goto/16 :goto_0

    :cond_5
    return-void
.end method

.method private pathStyleHelper(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, "none"

    .line 1151
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1152
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    return-void

    .line 1156
    :cond_1
    new-instance v0, Ljava/util/StringTokenizer;

    const-string v1, " ,"

    invoke-direct {v0, p1, v1}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1157
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->countTokens()I

    move-result p1

    and-int/lit8 v1, p1, 0x1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    mul-int/lit8 p1, p1, 0x2

    .line 1158
    :cond_2
    new-array v1, p1, [F

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 1162
    :goto_0
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    move-result v8

    if-eqz v8, :cond_3

    add-int/lit8 v8, v6, 0x1

    .line 1163
    invoke-virtual {v0}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v3}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->toFloat(Ljava/lang/String;F)F

    move-result v3

    aput v3, v1, v6

    add-float/2addr v7, v3

    move v6, v8

    goto :goto_0

    :cond_3
    :goto_1
    if-ge v6, p1, :cond_4

    .line 1169
    aget v0, v1, v4

    aput v0, v1, v6

    add-float/2addr v7, v0

    add-int/lit8 v6, v6, 0x1

    add-int/2addr v4, v2

    goto :goto_1

    :cond_4
    if-eqz p2, :cond_5

    .line 1175
    :try_start_0
    invoke-static {p2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    rem-float v5, p1, v7

    .line 1181
    :catch_0
    :cond_5
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    new-instance p2, Landroid/graphics/DashPathEffect;

    invoke-direct {p2, v1, v5}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    return-void
.end method

.method private popTransform()V
    .locals 1

    .line 1242
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->transformStack:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1243
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    .line 1244
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->matrixStack:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private pushTransform(Lorg/xml/sax/Attributes;)V
    .locals 3

    const-string v0, "transform"

    .line 1228
    invoke-static {v0, p1}, Lcom/larvalabs/svgandroid/SVGParser;->access$100(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1230
    :goto_0
    iget-object v1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->transformStack:Ljava/util/LinkedList;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    if-eqz v0, :cond_1

    .line 1232
    invoke-static {p1}, Lcom/larvalabs/svgandroid/SVGParser;->access$500(Ljava/lang/String;)Landroid/graphics/Matrix;

    move-result-object p1

    .line 1233
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    .line 1234
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 1235
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->matrixStack:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 1236
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->matrixStack:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method private static toFloat(Ljava/lang/String;F)F
    .locals 0

    .line 1187
    :try_start_0
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return p1
.end method


# virtual methods
.method public characters([CII)V
    .locals 4

    .line 1530
    iget-boolean v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->drawCharacters:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p3, v0, :cond_0

    const/4 v2, 0x0

    .line 1531
    aget-char v2, p1, v2

    const/16 v3, 0xa

    if-ne v2, v3, :cond_0

    .line 1532
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 1533
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 1535
    iget p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->newLineCount:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->newLineCount:I

    .line 1536
    iget-object p2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    int-to-float p1, p1

    iget-object p3, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->textSize:Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p3

    mul-float p1, p1, p3

    invoke-virtual {p2, v1, p1}, Landroid/graphics/Canvas;->translate(FF)V

    goto :goto_1

    .line 1538
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 1539
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->textX:Ljava/lang/Float;

    if-eqz p1, :cond_1

    iget-object p2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->textY:Ljava/lang/Float;

    if-eqz p2, :cond_1

    .line 1540
    iget-object p2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object p3, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->textY:Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p3

    iget-object v2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->textPaint:Landroid/graphics/Paint;

    invoke-virtual {p2, v0, p1, p3, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 1542
    :cond_1
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    iget-object p2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->font_matrix:Landroid/graphics/Matrix;

    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->setMatrix(Landroid/graphics/Matrix;)V

    .line 1543
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    iget-object p2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->textPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v1, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 1545
    :goto_0
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->textPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    .line 1547
    iget-object p2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p2, p1, v1}, Landroid/graphics/Canvas;->translate(FF)V

    :cond_2
    :goto_1
    return-void
.end method

.method public currentLayerAttributes()Lcom/larvalabs/svgandroid/SVGParser$LayerAttributes;
    .locals 1

    .line 1525
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->layerAttributeStack:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/larvalabs/svgandroid/SVGParser$LayerAttributes;

    return-object v0
.end method

.method public endDocument()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    return-void
.end method

.method public endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    const-string p1, "svg"

    .line 1554
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 1555
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvasRestoreCount:Ljava/lang/Integer;

    if-eqz p1, :cond_0

    .line 1556
    iget-object p2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2, p1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 1558
    :cond_0
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limitsAdjustmentX:Ljava/lang/Float;

    if-eqz p1, :cond_1

    .line 1559
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limits:Landroid/graphics/RectF;

    iget p2, p1, Landroid/graphics/RectF;->left:F

    iget-object p3, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limitsAdjustmentX:Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p3

    add-float/2addr p2, p3

    iput p2, p1, Landroid/graphics/RectF;->left:F

    .line 1560
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limits:Landroid/graphics/RectF;

    iget p2, p1, Landroid/graphics/RectF;->right:F

    iget-object p3, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limitsAdjustmentX:Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p3

    add-float/2addr p2, p3

    iput p2, p1, Landroid/graphics/RectF;->right:F

    .line 1562
    :cond_1
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limitsAdjustmentY:Ljava/lang/Float;

    if-eqz p1, :cond_2

    .line 1563
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limits:Landroid/graphics/RectF;

    iget p2, p1, Landroid/graphics/RectF;->top:F

    iget-object p3, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limitsAdjustmentY:Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p3

    add-float/2addr p2, p3

    iput p2, p1, Landroid/graphics/RectF;->top:F

    .line 1564
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limits:Landroid/graphics/RectF;

    iget p2, p1, Landroid/graphics/RectF;->bottom:F

    iget-object p3, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limitsAdjustmentY:Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p3

    add-float/2addr p2, p3

    iput p2, p1, Landroid/graphics/RectF;->bottom:F

    .line 1566
    :cond_2
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->picture:Landroid/graphics/Picture;

    invoke-virtual {p1}, Landroid/graphics/Picture;->endRecording()V

    goto/16 :goto_1

    :cond_3
    const-string p1, "linearGradient"

    .line 1568
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    const-string p1, "radialGradient"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto/16 :goto_0

    :cond_4
    const-string p1, "defs"

    .line 1572
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 1573
    invoke-direct {p0}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->finishGradients()V

    goto/16 :goto_1

    :cond_5
    const-string p1, "g"

    .line 1574
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 p3, 0x0

    if-eqz p1, :cond_8

    .line 1575
    iget-boolean p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->boundsMode:Z

    if-eqz p1, :cond_6

    .line 1576
    iput-boolean p3, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->boundsMode:Z

    .line 1579
    :cond_6
    iget-boolean p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->hidden:Z

    if-eqz p1, :cond_7

    .line 1580
    iget p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->hiddenLevel:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->hiddenLevel:I

    if-nez p1, :cond_7

    .line 1583
    iput-boolean p3, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->hidden:Z

    .line 1588
    :cond_7
    invoke-direct {p0}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->popTransform()V

    .line 1589
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaintStack:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Paint;

    iput-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    .line 1590
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillSetStack:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillSet:Z

    .line 1591
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaintStack:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Paint;

    iput-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    .line 1592
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokeSetStack:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokeSet:Z

    .line 1593
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->layerAttributeStack:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_a

    .line 1594
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->layerAttributeStack:Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;

    goto :goto_1

    :cond_8
    const-string p1, "text"

    .line 1596
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 1597
    iget-boolean p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->drawCharacters:Z

    if-eqz p1, :cond_a

    .line 1598
    iput-boolean p3, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->drawCharacters:Z

    .line 1599
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    goto :goto_1

    .line 1569
    :cond_9
    :goto_0
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->gradient:Lcom/larvalabs/svgandroid/SVGParser$Gradient;

    iget-object p1, p1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->id:Ljava/lang/String;

    if-eqz p1, :cond_a

    .line 1570
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->gradientMap:Ljava/util/HashMap;

    iget-object p2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->gradient:Lcom/larvalabs/svgandroid/SVGParser$Gradient;

    iget-object p2, p2, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->id:Ljava/lang/String;

    iget-object p3, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->gradient:Lcom/larvalabs/svgandroid/SVGParser$Gradient;

    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    :goto_1
    return-void
.end method

.method public setColorSwap(Ljava/lang/Integer;Ljava/lang/Integer;Z)V
    .locals 0

    .line 896
    iput-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->searchColor:Ljava/lang/Integer;

    .line 897
    iput-object p2, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->replaceColor:Ljava/lang/Integer;

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    .line 899
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    shr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    int-to-float p1, p1

    const/high16 p2, 0x437f0000    # 255.0f

    div-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->opacityMultiplier:Ljava/lang/Float;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 901
    iput-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->opacityMultiplier:Ljava/lang/Float;

    :goto_0
    return-void
.end method

.method setPicture(Landroid/graphics/Picture;)V
    .locals 0

    .line 892
    iput-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->picture:Landroid/graphics/Picture;

    return-void
.end method

.method public setWhiteMode(Z)V
    .locals 0

    .line 906
    iput-boolean p1, p0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->whiteMode:Z

    return-void
.end method

.method public startDocument()V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    return-void
.end method

.method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    .line 1254
    iget-object v3, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    const/16 v4, 0xff

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 1255
    iget-object v3, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 1256
    iget-object v3, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->textPaint:Landroid/graphics/Paint;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    const/4 v3, 0x0

    .line 1258
    iput-boolean v3, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->drawCharacters:Z

    .line 1261
    iget-boolean v4, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->boundsMode:Z

    const-string v5, "rect"

    const-string v6, "height"

    const-string v7, "width"

    const-string v8, "y"

    const-string v9, "x"

    const/4 v10, 0x0

    .line 1265
    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    if-eqz v4, :cond_3

    .line 1262
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1263
    invoke-static {v9, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v1

    if-nez v1, :cond_0

    move-object v1, v11

    .line 1267
    :cond_0
    invoke-static {v8, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v11, v3

    .line 1271
    :goto_0
    invoke-static {v7, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v3

    .line 1272
    invoke-static {v6, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v2

    .line 1273
    new-instance v4, Landroid/graphics/RectF;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v6

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    add-float/2addr v1, v3

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    add-float/2addr v3, v2

    invoke-direct {v4, v5, v6, v1, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v4, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->bounds:Landroid/graphics/RectF;

    :cond_2
    return-void

    :cond_3
    const-string v4, "svg"

    .line 1277
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v12, 0x2

    const-string v13, "fill"

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eqz v4, :cond_5

    .line 1278
    iput-object v15, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    .line 1279
    invoke-static {v13, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$100(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->SVG_FILL:Ljava/lang/String;

    const-string v1, "viewBox"

    .line 1280
    invoke-static {v1, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$100(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4

    const/16 v4, 0x2c

    const/16 v5, 0x20

    .line 1282
    invoke-virtual {v1, v4, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    const-string v4, "\\s+"

    invoke-virtual {v1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 1283
    array-length v4, v1

    const/4 v5, 0x4

    if-ne v4, v5, :cond_4

    .line 1284
    aget-object v3, v1, v3

    invoke-static {v3, v15}, Lcom/larvalabs/svgandroid/SVGParser;->access$700(Ljava/lang/String;Ljava/lang/Float;)Ljava/lang/Float;

    move-result-object v3

    .line 1285
    aget-object v4, v1, v14

    invoke-static {v4, v15}, Lcom/larvalabs/svgandroid/SVGParser;->access$700(Ljava/lang/String;Ljava/lang/Float;)Ljava/lang/Float;

    move-result-object v4

    .line 1286
    aget-object v5, v1, v12

    invoke-static {v5, v15}, Lcom/larvalabs/svgandroid/SVGParser;->access$700(Ljava/lang/String;Ljava/lang/Float;)Ljava/lang/Float;

    move-result-object v5

    const/4 v8, 0x3

    .line 1287
    aget-object v1, v1, v8

    invoke-static {v1, v15}, Lcom/larvalabs/svgandroid/SVGParser;->access$700(Ljava/lang/String;Ljava/lang/Float;)Ljava/lang/Float;

    move-result-object v1

    if-eqz v3, :cond_4

    if-eqz v5, :cond_4

    if-eqz v4, :cond_4

    if-eqz v1, :cond_4

    .line 1289
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v8

    add-float/2addr v5, v8

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    .line 1290
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v8

    add-float/2addr v1, v8

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    .line 1292
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v8

    sub-float/2addr v5, v8

    float-to-double v8, v5

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    double-to-float v5, v8

    .line 1293
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v8

    sub-float/2addr v1, v8

    float-to-double v8, v1

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    double-to-float v1, v8

    .line 1294
    iget-object v8, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->picture:Landroid/graphics/Picture;

    float-to-int v9, v5

    float-to-int v11, v1

    invoke-virtual {v8, v9, v11}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    move-result-object v8

    iput-object v8, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    .line 1295
    invoke-virtual {v8}, Landroid/graphics/Canvas;->save()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iput-object v8, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvasRestoreCount:Ljava/lang/Integer;

    .line 1296
    iget-object v8, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    invoke-virtual {v8, v10, v10, v5, v1}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 1297
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v1

    neg-float v1, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iput-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limitsAdjustmentX:Ljava/lang/Float;

    .line 1298
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v1

    neg-float v1, v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iput-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limitsAdjustmentY:Ljava/lang/Float;

    .line 1299
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    iget-object v3, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limitsAdjustmentX:Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    iget-object v4, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->limitsAdjustmentY:Ljava/lang/Float;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 1304
    :cond_4
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    if-nez v1, :cond_2c

    .line 1305
    invoke-static {v7, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    float-to-double v3, v1

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v1, v3

    .line 1306
    invoke-static {v6, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    .line 1307
    iget-object v3, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->picture:Landroid/graphics/Picture;

    invoke-virtual {v3, v1, v2}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    move-result-object v1

    iput-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    .line 1308
    iput-object v15, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvasRestoreCount:Ljava/lang/Integer;

    goto/16 :goto_a

    :cond_5
    const-string v4, "defs"

    .line 1311
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto/16 :goto_a

    :cond_6
    const-string v4, "linearGradient"

    .line 1313
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 1314
    invoke-direct {v0, v14, v2}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doGradient(ZLorg/xml/sax/Attributes;)Lcom/larvalabs/svgandroid/SVGParser$Gradient;

    move-result-object v1

    iput-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->gradient:Lcom/larvalabs/svgandroid/SVGParser$Gradient;

    goto/16 :goto_a

    :cond_7
    const-string v4, "radialGradient"

    .line 1315
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 1316
    invoke-direct {v0, v3, v2}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doGradient(ZLorg/xml/sax/Attributes;)Lcom/larvalabs/svgandroid/SVGParser$Gradient;

    move-result-object v1

    iput-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->gradient:Lcom/larvalabs/svgandroid/SVGParser$Gradient;

    goto/16 :goto_a

    :cond_8
    const-string v4, "stop"

    .line 1317
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/high16 v12, 0x3f800000    # 1.0f

    if-eqz v4, :cond_a

    .line 1318
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->gradient:Lcom/larvalabs/svgandroid/SVGParser$Gradient;

    if-eqz v1, :cond_2c

    .line 1319
    new-instance v1, Lcom/larvalabs/svgandroid/SVGParser$Properties;

    invoke-direct {v1, v2, v15}, Lcom/larvalabs/svgandroid/SVGParser$Properties;-><init>(Lorg/xml/sax/Attributes;Lcom/larvalabs/svgandroid/SVGParser$1;)V

    const-string v2, "stop-color"

    .line 1322
    invoke-virtual {v1, v2}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getAttr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getColor(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-nez v2, :cond_9

    goto :goto_1

    :cond_9
    const-string v3, "stop-opacity"

    .line 1326
    invoke-virtual {v1, v3, v12}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getFloat(Ljava/lang/String;F)F

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->currentLayerAttributes()Lcom/larvalabs/svgandroid/SVGParser$LayerAttributes;

    move-result-object v4

    iget v4, v4, Lcom/larvalabs/svgandroid/SVGParser$LayerAttributes;->opacity:F

    mul-float v3, v3, v4

    const/high16 v4, 0x437f0000    # 255.0f

    mul-float v3, v3, v4

    .line 1327
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    .line 1328
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    shl-int/lit8 v3, v3, 0x18

    or-int/2addr v3, v2

    .line 1330
    :goto_1
    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->gradient:Lcom/larvalabs/svgandroid/SVGParser$Gradient;

    iget-object v2, v2, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->colors:Ljava/util/ArrayList;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, "offset"

    .line 1332
    invoke-virtual {v1, v2, v10}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getFloat(Ljava/lang/String;F)F

    move-result v1

    .line 1333
    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->gradient:Lcom/larvalabs/svgandroid/SVGParser$Gradient;

    iget-object v2, v2, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->positions:Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_a

    :cond_a
    const-string v4, "g"

    .line 1335
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_11

    .line 1336
    new-instance v1, Lcom/larvalabs/svgandroid/SVGParser$Properties;

    invoke-direct {v1, v2, v15}, Lcom/larvalabs/svgandroid/SVGParser$Properties;-><init>(Lorg/xml/sax/Attributes;Lcom/larvalabs/svgandroid/SVGParser$1;)V

    const-string v4, "id"

    .line 1339
    invoke-static {v4, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$100(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "bounds"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_b

    .line 1340
    iput-boolean v14, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->boundsMode:Z

    .line 1342
    :cond_b
    iget-boolean v4, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->hidden:Z

    if-eqz v4, :cond_c

    .line 1343
    iget v4, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->hiddenLevel:I

    add-int/2addr v4, v14

    iput v4, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->hiddenLevel:I

    :cond_c
    const-string v4, "display"

    .line 1347
    invoke-static {v4, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$100(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "none"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    invoke-virtual {v1, v4}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    .line 1348
    :cond_d
    iget-boolean v4, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->hidden:Z

    if-nez v4, :cond_e

    .line 1349
    iput-boolean v14, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->hidden:Z

    .line 1350
    iput v14, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->hiddenLevel:I

    :cond_e
    const-string v4, "opacity"

    .line 1356
    invoke-virtual {v1, v4, v12}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getFloat(Ljava/lang/String;F)F

    move-result v4

    .line 1357
    invoke-virtual/range {p0 .. p0}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->currentLayerAttributes()Lcom/larvalabs/svgandroid/SVGParser$LayerAttributes;

    move-result-object v5

    .line 1358
    new-instance v6, Lcom/larvalabs/svgandroid/SVGParser$LayerAttributes;

    iget v5, v5, Lcom/larvalabs/svgandroid/SVGParser$LayerAttributes;->opacity:F

    mul-float v5, v5, v4

    invoke-direct {v6, v5}, Lcom/larvalabs/svgandroid/SVGParser$LayerAttributes;-><init>(F)V

    .line 1359
    iget-object v4, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->layerAttributeStack:Ljava/util/LinkedList;

    invoke-virtual {v4, v6}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 1361
    invoke-direct {v0, v2}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->pushTransform(Lorg/xml/sax/Attributes;)V

    .line 1362
    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaintStack:Ljava/util/LinkedList;

    new-instance v4, Landroid/graphics/Paint;

    iget-object v5, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    invoke-direct {v4, v5}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    invoke-virtual {v2, v4}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 1363
    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaintStack:Ljava/util/LinkedList;

    new-instance v4, Landroid/graphics/Paint;

    iget-object v5, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    invoke-direct {v4, v5}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    invoke-virtual {v2, v4}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 1364
    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillSetStack:Ljava/util/LinkedList;

    iget-boolean v4, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillSet:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 1365
    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokeSetStack:Ljava/util/LinkedList;

    iget-boolean v4, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokeSet:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 1367
    invoke-direct {v0, v1, v15}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doFill(Lcom/larvalabs/svgandroid/SVGParser$Properties;Landroid/graphics/RectF;)Z

    .line 1368
    invoke-direct {v0, v1}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doStroke(Lcom/larvalabs/svgandroid/SVGParser$Properties;)Z

    .line 1370
    iget-boolean v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillSet:Z

    invoke-virtual {v1, v13}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_f

    const/4 v4, 0x1

    goto :goto_2

    :cond_f
    const/4 v4, 0x0

    :goto_2
    or-int/2addr v2, v4

    iput-boolean v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillSet:Z

    .line 1371
    iget-boolean v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokeSet:Z

    const-string v4, "stroke"

    invoke-virtual {v1, v4}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_10

    const/4 v3, 0x1

    :cond_10
    or-int v1, v2, v3

    iput-boolean v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokeSet:Z

    goto/16 :goto_a

    .line 1373
    :cond_11
    iget-boolean v4, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->hidden:Z

    const-string v12, "ry"

    const-string v3, "rx"

    if-nez v4, :cond_18

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_18

    .line 1374
    invoke-static {v9, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v1

    if-nez v1, :cond_12

    move-object v1, v11

    .line 1378
    :cond_12
    invoke-static {v8, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v4

    if-nez v4, :cond_13

    goto :goto_3

    :cond_13
    move-object v11, v4

    .line 1382
    :goto_3
    invoke-static {v7, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v4

    .line 1383
    invoke-static {v6, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v5

    .line 1384
    invoke-static {v3, v2, v10}, Lcom/larvalabs/svgandroid/SVGParser;->access$400(Ljava/lang/String;Lorg/xml/sax/Attributes;F)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    .line 1385
    invoke-static {v12, v2, v10}, Lcom/larvalabs/svgandroid/SVGParser;->access$400(Ljava/lang/String;Lorg/xml/sax/Attributes;F)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    .line 1386
    invoke-direct {v0, v2}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->pushTransform(Lorg/xml/sax/Attributes;)V

    .line 1387
    new-instance v7, Lcom/larvalabs/svgandroid/SVGParser$Properties;

    invoke-direct {v7, v2, v15}, Lcom/larvalabs/svgandroid/SVGParser$Properties;-><init>(Lorg/xml/sax/Attributes;Lcom/larvalabs/svgandroid/SVGParser$1;)V

    .line 1388
    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v8

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v9

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v12

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v13

    add-float/2addr v12, v13

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v13

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v14

    add-float/2addr v13, v14

    invoke-virtual {v2, v8, v9, v12, v13}, Landroid/graphics/RectF;->set(FFFF)V

    .line 1389
    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    invoke-direct {v0, v7, v2}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doFill(Lcom/larvalabs/svgandroid/SVGParser$Properties;Landroid/graphics/RectF;)Z

    move-result v2

    if-eqz v2, :cond_15

    .line 1390
    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v8

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v9

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v12

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v13

    add-float/2addr v12, v13

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v13

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v14

    add-float/2addr v13, v14

    invoke-virtual {v2, v8, v9, v12, v13}, Landroid/graphics/RectF;->set(FFFF)V

    .line 1391
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v2

    cmpg-float v2, v2, v10

    if-gtz v2, :cond_14

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v2

    cmpg-float v2, v2, v10

    if-gtz v2, :cond_14

    .line 1392
    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    iget-object v8, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    iget-object v9, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    invoke-virtual {v2, v8, v9}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    goto :goto_4

    .line 1394
    :cond_14
    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    iget-object v8, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v9

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v12

    iget-object v13, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    invoke-virtual {v2, v8, v9, v12, v13}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 1396
    :goto_4
    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    invoke-direct {v0, v2}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doLimits(Landroid/graphics/RectF;)V

    .line 1398
    :cond_15
    invoke-direct {v0, v7}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doStroke(Lcom/larvalabs/svgandroid/SVGParser$Properties;)Z

    move-result v2

    if-eqz v2, :cond_17

    .line 1399
    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v7

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v8

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    add-float/2addr v1, v4

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    add-float/2addr v4, v5

    invoke-virtual {v2, v7, v8, v1, v4}, Landroid/graphics/RectF;->set(FFFF)V

    .line 1400
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v1

    cmpg-float v1, v1, v10

    if-gtz v1, :cond_16

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v1

    cmpg-float v1, v1, v10

    if-gtz v1, :cond_16

    .line 1401
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    iget-object v3, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    goto :goto_5

    .line 1403
    :cond_16
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v4

    iget-object v5, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 1405
    :goto_5
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    invoke-direct {v0, v1, v2}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doLimits(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 1407
    :cond_17
    invoke-direct/range {p0 .. p0}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->popTransform()V

    goto/16 :goto_a

    .line 1408
    :cond_18
    iget-boolean v4, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->hidden:Z

    if-nez v4, :cond_19

    const-string v4, "line"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_19

    const-string v1, "x1"

    .line 1409
    invoke-static {v1, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v1

    const-string v3, "x2"

    .line 1410
    invoke-static {v3, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v3

    const-string v4, "y1"

    .line 1411
    invoke-static {v4, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v4

    const-string v5, "y2"

    .line 1412
    invoke-static {v5, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v5

    .line 1413
    new-instance v6, Lcom/larvalabs/svgandroid/SVGParser$Properties;

    invoke-direct {v6, v2, v15}, Lcom/larvalabs/svgandroid/SVGParser$Properties;-><init>(Lorg/xml/sax/Attributes;Lcom/larvalabs/svgandroid/SVGParser$1;)V

    .line 1414
    invoke-direct {v0, v6}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doStroke(Lcom/larvalabs/svgandroid/SVGParser$Properties;)Z

    move-result v6

    if-eqz v6, :cond_2c

    .line 1415
    invoke-direct {v0, v2}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->pushTransform(Lorg/xml/sax/Attributes;)V

    .line 1416
    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v6

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v7

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v8

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v9

    invoke-virtual {v2, v6, v7, v8, v9}, Landroid/graphics/RectF;->set(FFFF)V

    .line 1417
    iget-object v10, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v11

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v12

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v13

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v14

    iget-object v15, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 1418
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    invoke-direct {v0, v1, v2}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doLimits(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 1419
    invoke-direct/range {p0 .. p0}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->popTransform()V

    goto/16 :goto_a

    .line 1421
    :cond_19
    iget-boolean v4, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->hidden:Z

    if-nez v4, :cond_1d

    const-string v4, "text"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1d

    .line 1422
    invoke-static {v9, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v1

    .line 1423
    invoke-static {v8, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v3

    const-string v4, "font-size"

    .line 1424
    invoke-static {v4, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v4

    const-string v5, "transform"

    .line 1425
    invoke-static {v5, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$100(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/larvalabs/svgandroid/SVGParser;->access$500(Ljava/lang/String;)Landroid/graphics/Matrix;

    move-result-object v5

    .line 1427
    iput-boolean v14, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->drawCharacters:Z

    if-eqz v4, :cond_2c

    .line 1429
    iput-object v4, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->textSize:Ljava/lang/Float;

    .line 1430
    invoke-direct {v0, v2}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->pushTransform(Lorg/xml/sax/Attributes;)V

    if-eqz v1, :cond_1a

    if-eqz v3, :cond_1a

    .line 1432
    iput-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->textX:Ljava/lang/Float;

    .line 1433
    iput-object v3, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->textY:Ljava/lang/Float;

    goto :goto_6

    :cond_1a
    if-eqz v5, :cond_1b

    .line 1435
    iput-object v5, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->font_matrix:Landroid/graphics/Matrix;

    .line 1437
    :cond_1b
    :goto_6
    new-instance v1, Lcom/larvalabs/svgandroid/SVGParser$Properties;

    invoke-direct {v1, v2, v15}, Lcom/larvalabs/svgandroid/SVGParser$Properties;-><init>(Lorg/xml/sax/Attributes;Lcom/larvalabs/svgandroid/SVGParser$1;)V

    .line 1438
    invoke-virtual {v1, v13}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getColor(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_1c

    .line 1440
    iget-object v3, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->textPaint:Landroid/graphics/Paint;

    invoke-direct {v0, v1, v2, v14, v3}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doColor(Lcom/larvalabs/svgandroid/SVGParser$Properties;Ljava/lang/Integer;ZLandroid/graphics/Paint;)V

    goto :goto_7

    .line 1442
    :cond_1c
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->textPaint:Landroid/graphics/Paint;

    const/high16 v2, -0x1000000

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    :goto_7
    const/4 v1, 0x0

    .line 1444
    iput v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->newLineCount:I

    .line 1445
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->textPaint:Landroid/graphics/Paint;

    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->textSize:Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 1446
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 1447
    invoke-direct/range {p0 .. p0}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->popTransform()V

    goto/16 :goto_a

    .line 1449
    :cond_1d
    iget-boolean v4, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->hidden:Z

    if-nez v4, :cond_22

    const-string v4, "circle"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v5, "ellipse"

    if-nez v4, :cond_1e

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_22

    :cond_1e
    const-string v4, "cx"

    .line 1452
    invoke-static {v4, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v4

    const-string v6, "cy"

    .line 1453
    invoke-static {v6, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v6

    .line 1454
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1f

    .line 1455
    invoke-static {v3, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v1

    .line 1456
    invoke-static {v12, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v3

    goto :goto_8

    :cond_1f
    const-string v1, "r"

    .line 1459
    invoke-static {v1, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$600(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/Float;

    move-result-object v1

    move-object v3, v1

    :goto_8
    if-eqz v4, :cond_2c

    if-eqz v6, :cond_2c

    if-eqz v1, :cond_2c

    if-eqz v3, :cond_2c

    .line 1462
    invoke-direct {v0, v2}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->pushTransform(Lorg/xml/sax/Attributes;)V

    .line 1463
    new-instance v5, Lcom/larvalabs/svgandroid/SVGParser$Properties;

    invoke-direct {v5, v2, v15}, Lcom/larvalabs/svgandroid/SVGParser$Properties;-><init>(Lorg/xml/sax/Attributes;Lcom/larvalabs/svgandroid/SVGParser$1;)V

    .line 1464
    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v7

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v8

    sub-float/2addr v7, v8

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v8

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v9

    sub-float/2addr v8, v9

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    add-float/2addr v4, v1

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    add-float/2addr v1, v3

    invoke-virtual {v2, v7, v8, v4, v1}, Landroid/graphics/RectF;->set(FFFF)V

    .line 1465
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    invoke-direct {v0, v5, v1}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doFill(Lcom/larvalabs/svgandroid/SVGParser$Properties;Landroid/graphics/RectF;)Z

    move-result v1

    if-eqz v1, :cond_20

    .line 1466
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    iget-object v3, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 1467
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    invoke-direct {v0, v1}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doLimits(Landroid/graphics/RectF;)V

    .line 1469
    :cond_20
    invoke-direct {v0, v5}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doStroke(Lcom/larvalabs/svgandroid/SVGParser$Properties;)Z

    move-result v1

    if-eqz v1, :cond_21

    .line 1470
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    iget-object v3, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 1471
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    invoke-direct {v0, v1, v2}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doLimits(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 1473
    :cond_21
    invoke-direct/range {p0 .. p0}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->popTransform()V

    goto/16 :goto_a

    .line 1475
    :cond_22
    iget-boolean v3, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->hidden:Z

    if-nez v3, :cond_28

    const-string v3, "polygon"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_23

    const-string v4, "polyline"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_28

    :cond_23
    const-string v4, "points"

    .line 1476
    invoke-static {v4, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$900(Ljava/lang/String;Lorg/xml/sax/Attributes;)Lcom/larvalabs/svgandroid/SVGParser$NumberParse;

    move-result-object v4

    if-eqz v4, :cond_2c

    .line 1478
    new-instance v5, Landroid/graphics/Path;

    invoke-direct {v5}, Landroid/graphics/Path;-><init>()V

    .line 1479
    invoke-static {v4}, Lcom/larvalabs/svgandroid/SVGParser$NumberParse;->access$000(Lcom/larvalabs/svgandroid/SVGParser$NumberParse;)Ljava/util/ArrayList;

    move-result-object v4

    .line 1480
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-le v6, v14, :cond_2c

    .line 1481
    invoke-direct {v0, v2}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->pushTransform(Lorg/xml/sax/Attributes;)V

    .line 1482
    new-instance v6, Lcom/larvalabs/svgandroid/SVGParser$Properties;

    invoke-direct {v6, v2, v15}, Lcom/larvalabs/svgandroid/SVGParser$Properties;-><init>(Lorg/xml/sax/Attributes;Lcom/larvalabs/svgandroid/SVGParser$1;)V

    const/4 v2, 0x0

    .line 1483
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Float;

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Float;

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v7

    invoke-virtual {v5, v2, v7}, Landroid/graphics/Path;->moveTo(FF)V

    const/4 v12, 0x2

    .line 1484
    :goto_9
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v12, v2, :cond_24

    .line 1485
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    add-int/lit8 v7, v12, 0x1

    .line 1486
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Float;

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v7

    .line 1487
    invoke-virtual {v5, v2, v7}, Landroid/graphics/Path;->lineTo(FF)V

    add-int/lit8 v12, v12, 0x2

    goto :goto_9

    .line 1490
    :cond_24
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_25

    .line 1491
    invoke-virtual {v5}, Landroid/graphics/Path;->close()V

    .line 1493
    :cond_25
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    const/4 v2, 0x0

    invoke-virtual {v5, v1, v2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 1494
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    invoke-direct {v0, v6, v1}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doFill(Lcom/larvalabs/svgandroid/SVGParser$Properties;Landroid/graphics/RectF;)Z

    move-result v1

    if-eqz v1, :cond_26

    .line 1495
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v5, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 1496
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    invoke-direct {v0, v1}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doLimits(Landroid/graphics/RectF;)V

    .line 1498
    :cond_26
    invoke-direct {v0, v6}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doStroke(Lcom/larvalabs/svgandroid/SVGParser$Properties;)Z

    move-result v1

    if-eqz v1, :cond_27

    .line 1499
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    invoke-virtual {v1, v5, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 1500
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    invoke-direct {v0, v1, v2}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doLimits(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 1502
    :cond_27
    invoke-direct/range {p0 .. p0}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->popTransform()V

    goto :goto_a

    .line 1505
    :cond_28
    iget-boolean v3, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->hidden:Z

    if-nez v3, :cond_2b

    const-string v3, "path"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2b

    const-string v1, "d"

    .line 1506
    invoke-static {v1, v2}, Lcom/larvalabs/svgandroid/SVGParser;->access$100(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/larvalabs/svgandroid/SVGParser;->access$1000(Ljava/lang/String;)Landroid/graphics/Path;

    move-result-object v1

    .line 1507
    invoke-direct {v0, v2}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->pushTransform(Lorg/xml/sax/Attributes;)V

    .line 1508
    new-instance v3, Lcom/larvalabs/svgandroid/SVGParser$Properties;

    invoke-direct {v3, v2, v15}, Lcom/larvalabs/svgandroid/SVGParser$Properties;-><init>(Lorg/xml/sax/Attributes;Lcom/larvalabs/svgandroid/SVGParser$1;)V

    .line 1509
    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 1510
    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    invoke-direct {v0, v3, v2}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doFill(Lcom/larvalabs/svgandroid/SVGParser$Properties;Landroid/graphics/RectF;)Z

    move-result v2

    if-eqz v2, :cond_29

    .line 1511
    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    iget-object v4, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->fillPaint:Landroid/graphics/Paint;

    invoke-virtual {v2, v1, v4}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 1512
    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    invoke-direct {v0, v2}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doLimits(Landroid/graphics/RectF;)V

    .line 1514
    :cond_29
    invoke-direct {v0, v3}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doStroke(Lcom/larvalabs/svgandroid/SVGParser$Properties;)Z

    move-result v2

    if-eqz v2, :cond_2a

    .line 1515
    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->canvas:Landroid/graphics/Canvas;

    iget-object v3, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    invoke-virtual {v2, v1, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 1516
    iget-object v1, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->rect:Landroid/graphics/RectF;

    iget-object v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->strokePaint:Landroid/graphics/Paint;

    invoke-direct {v0, v1, v2}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->doLimits(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 1518
    :cond_2a
    invoke-direct/range {p0 .. p0}, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->popTransform()V

    goto :goto_a

    .line 1519
    :cond_2b
    iget-boolean v2, v0, Lcom/larvalabs/svgandroid/SVGParser$SVGHandler;->hidden:Z

    if-nez v2, :cond_2c

    .line 1520
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UNRECOGNIZED SVG COMMAND: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SVGAndroid"

    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2c
    :goto_a
    return-void
.end method
