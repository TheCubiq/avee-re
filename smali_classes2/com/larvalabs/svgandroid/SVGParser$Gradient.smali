.class Lcom/larvalabs/svgandroid/SVGParser$Gradient;
.super Ljava/lang/Object;
.source "SVGParser.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/larvalabs/svgandroid/SVGParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Gradient"
.end annotation


# instance fields
.field public boundingBox:Z

.field colors:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field id:Ljava/lang/String;

.field isLinear:Z

.field matrix:Landroid/graphics/Matrix;

.field positions:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field radius:F

.field public shader:Landroid/graphics/Shader;

.field public tilemode:Landroid/graphics/Shader$TileMode;

.field x:F

.field x1:F

.field x2:F

.field xlink:Ljava/lang/String;

.field y:F

.field y1:F

.field y2:F


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 647
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 653
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->positions:Ljava/util/ArrayList;

    .line 654
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->colors:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 655
    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->matrix:Landroid/graphics/Matrix;

    .line 656
    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->shader:Landroid/graphics/Shader;

    const/4 v0, 0x0

    .line 657
    iput-boolean v0, p0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->boundingBox:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/larvalabs/svgandroid/SVGParser$1;)V
    .locals 0

    .line 647
    invoke-direct {p0}, Lcom/larvalabs/svgandroid/SVGParser$Gradient;-><init>()V

    return-void
.end method


# virtual methods
.method public inherit(Lcom/larvalabs/svgandroid/SVGParser$Gradient;)V
    .locals 1

    .line 693
    iget-object v0, p1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->id:Ljava/lang/String;

    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->xlink:Ljava/lang/String;

    .line 694
    iget-object v0, p1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->positions:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->positions:Ljava/util/ArrayList;

    .line 695
    iget-object v0, p1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->colors:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->colors:Ljava/util/ArrayList;

    .line 696
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->matrix:Landroid/graphics/Matrix;

    if-nez v0, :cond_0

    .line 697
    iget-object p1, p1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->matrix:Landroid/graphics/Matrix;

    iput-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->matrix:Landroid/graphics/Matrix;

    goto :goto_0

    .line 698
    :cond_0
    iget-object v0, p1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->matrix:Landroid/graphics/Matrix;

    if-eqz v0, :cond_1

    .line 699
    new-instance v0, Landroid/graphics/Matrix;

    iget-object p1, p1, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->matrix:Landroid/graphics/Matrix;

    invoke-direct {v0, p1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 700
    iget-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->matrix:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 701
    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$Gradient;->matrix:Landroid/graphics/Matrix;

    :cond_1
    :goto_0
    return-void
.end method
