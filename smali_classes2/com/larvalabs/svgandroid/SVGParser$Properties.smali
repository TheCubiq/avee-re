.class Lcom/larvalabs/svgandroid/SVGParser$Properties;
.super Ljava/lang/Object;
.source "SVGParser.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/larvalabs/svgandroid/SVGParser;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "Properties"
.end annotation


# instance fields
.field atts:Lorg/xml/sax/Attributes;

.field styles:Lcom/larvalabs/svgandroid/SVGParser$StyleSet;


# direct methods
.method private constructor <init>(Lorg/xml/sax/Attributes;)V
    .locals 2

    .line 728
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 725
    iput-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$Properties;->styles:Lcom/larvalabs/svgandroid/SVGParser$StyleSet;

    .line 729
    iput-object p1, p0, Lcom/larvalabs/svgandroid/SVGParser$Properties;->atts:Lorg/xml/sax/Attributes;

    const-string v1, "style"

    .line 730
    invoke-static {v1, p1}, Lcom/larvalabs/svgandroid/SVGParser;->access$100(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 732
    new-instance v1, Lcom/larvalabs/svgandroid/SVGParser$StyleSet;

    invoke-direct {v1, p1, v0}, Lcom/larvalabs/svgandroid/SVGParser$StyleSet;-><init>(Ljava/lang/String;Lcom/larvalabs/svgandroid/SVGParser$1;)V

    iput-object v1, p0, Lcom/larvalabs/svgandroid/SVGParser$Properties;->styles:Lcom/larvalabs/svgandroid/SVGParser$StyleSet;

    :cond_0
    return-void
.end method

.method synthetic constructor <init>(Lorg/xml/sax/Attributes;Lcom/larvalabs/svgandroid/SVGParser$1;)V
    .locals 0

    .line 724
    invoke-direct {p0, p1}, Lcom/larvalabs/svgandroid/SVGParser$Properties;-><init>(Lorg/xml/sax/Attributes;)V

    return-void
.end method

.method private hex3Tohex6(I)I
    .locals 3

    and-int/lit16 v0, p1, 0xf00

    shl-int/lit8 v1, v0, 0x8

    shl-int/lit8 v0, v0, 0xc

    or-int/2addr v0, v1

    and-int/lit16 v1, p1, 0xf0

    shl-int/lit8 v2, v1, 0x4

    or-int/2addr v0, v2

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    and-int/lit8 p1, p1, 0xf

    shl-int/lit8 v1, p1, 0x4

    or-int/2addr v0, v1

    or-int/2addr p1, v0

    return p1
.end method

.method private parseNum(Ljava/lang/String;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/NumberFormatException;
        }
    .end annotation

    const-string v0, "%"

    .line 756
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 757
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    .line 758
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p1, v0

    const/high16 v0, 0x437f0000    # 255.0f

    mul-float p1, p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    return p1

    .line 760
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method private rgb(III)Ljava/lang/Integer;
    .locals 0

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x10

    and-int/lit16 p2, p2, 0xff

    shl-int/lit8 p2, p2, 0x8

    or-int/2addr p1, p2

    and-int/lit16 p2, p3, 0xff

    or-int/2addr p1, p2

    .line 752
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public getAttr(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 738
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$Properties;->styles:Lcom/larvalabs/svgandroid/SVGParser$StyleSet;

    if-eqz v0, :cond_0

    .line 739
    invoke-virtual {v0, p1}, Lcom/larvalabs/svgandroid/SVGParser$StyleSet;->getStyle(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 742
    iget-object v0, p0, Lcom/larvalabs/svgandroid/SVGParser$Properties;->atts:Lorg/xml/sax/Attributes;

    invoke-static {p1, v0}, Lcom/larvalabs/svgandroid/SVGParser;->access$100(Ljava/lang/String;Lorg/xml/sax/Attributes;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public getColor(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const-string v1, "#"

    .line 767
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 769
    :try_start_0
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object v0

    :cond_1
    const-string v1, "rgb("

    .line 773
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, ")"

    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, 0x4

    .line 774
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string v1, ","

    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    .line 776
    :try_start_1
    aget-object v1, p1, v1

    invoke-direct {p0, v1}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->parseNum(Ljava/lang/String;)I

    move-result v1

    aget-object v2, p1, v3

    invoke-direct {p0, v2}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->parseNum(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x2

    aget-object p1, p1, v3

    invoke-direct {p0, p1}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->parseNum(Ljava/lang/String;)I

    move-result p1

    invoke-direct {p0, v1, v2, p1}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->rgb(III)Ljava/lang/Integer;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    :catch_1
    return-object v0

    .line 783
    :cond_2
    invoke-static {p1}, Lcom/larvalabs/svgandroid/SVGColors;->mapColour(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public getFloat(Ljava/lang/String;F)F
    .locals 0

    .line 794
    invoke-virtual {p0, p1}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getAttr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    return p2

    .line 799
    :cond_0
    :try_start_0
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    return p2
.end method

.method public getFloat(Ljava/lang/String;)Ljava/lang/Float;
    .locals 1

    const/4 v0, 0x0

    .line 820
    invoke-virtual {p0, p1, v0}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getFloat(Ljava/lang/String;Ljava/lang/Float;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public getFloat(Ljava/lang/String;Ljava/lang/Float;)Ljava/lang/Float;
    .locals 0

    .line 807
    invoke-virtual {p0, p1}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getAttr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p2

    .line 812
    :cond_0
    :try_start_0
    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object p2
.end method

.method public getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 748
    invoke-virtual {p0, p1}, Lcom/larvalabs/svgandroid/SVGParser$Properties;->getAttr(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
