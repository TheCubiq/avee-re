.class public Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;
.super Ljava/lang/Object;
.source "SpriteFont.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;
    }
.end annotation


# static fields
.field private static tmpBitmap1024:Landroid/graphics/Bitmap;


# instance fields
.field private atlasTexture:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

.field private charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

.field private fontMetricHeight:I

.field private fontMetricMaxHeight:I

.field private glyphs:[Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

.field private texture:Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

.field private textureDim:Lcom/daaw/avee/Common/Vec2f;

.field private valid:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 23
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/16 v1, 0x400

    invoke-static {v1, v1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->tmpBitmap1024:Landroid/graphics/Bitmap;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Typeface;ILcom/daaw/avee/comp/Visualizer/Graphic/CharSet;)V
    .locals 2

    const-string v0, "failed to create SpriteFont"

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    .line 32
    iput-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->valid:Z

    .line 35
    iput-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    const/4 p3, 0x0

    .line 38
    :try_start_0
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->init(Landroid/graphics/Typeface;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 40
    invoke-static {v1, v0}, Lcom/daaw/avee/Common/tlog;->e(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 41
    iput-boolean p3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->valid:Z

    .line 43
    :goto_0
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->isValid()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 46
    :cond_0
    :try_start_1
    div-int/lit8 p2, p2, 0x2

    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->init(Landroid/graphics/Typeface;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 48
    invoke-static {p1, v0}, Lcom/daaw/avee/Common/tlog;->e(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 49
    iput-boolean p3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->valid:Z

    .line 52
    :goto_1
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->isValid()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    .line 54
    :cond_1
    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I[Landroid/graphics/Rect;Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;)V
    .locals 7

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->valid:Z

    .line 58
    iput-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    .line 60
    iput p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->fontMetricHeight:I

    .line 61
    invoke-virtual {p4}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->count()I

    move-result p4

    new-array p4, p4, [Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    iput-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->glyphs:[Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    const/4 p4, 0x0

    .line 63
    :goto_0
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->count()I

    move-result v1

    if-ge p4, v1, :cond_0

    .line 64
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->glyphs:[Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    aget-object v1, v1, p4

    aget-object v2, p3, p4

    iget v2, v2, Landroid/graphics/Rect;->left:I

    int-to-float v2, v2

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->x:F

    .line 65
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->glyphs:[Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    aget-object v1, v1, p4

    aget-object v2, p3, p4

    iget v2, v2, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->y:F

    .line 66
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->glyphs:[Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    aget-object v1, v1, p4

    aget-object v2, p3, p4

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v2

    int-to-float v2, v2

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->width:F

    .line 67
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->glyphs:[Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    aget-object v1, v1, p4

    int-to-float v2, p2

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->height:F

    .line 68
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->glyphs:[Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    aget-object v1, v1, p4

    aget-object v3, p3, p4

    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v3

    int-to-float v3, v3

    iput v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->spaceWidth:F

    .line 69
    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->glyphs:[Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    aget-object v1, v1, p4

    iput v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->spaceHeight:F

    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    .line 72
    :cond_0
    new-instance p2, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    const/16 v3, 0x2601

    const/16 v4, 0x2601

    const/16 v5, 0x2901

    const/4 v6, 0x0

    move-object v1, p2

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;-><init>(Ljava/lang/String;IIIZ)V

    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->texture:Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    .line 78
    new-instance p1, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->texture:Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    invoke-direct {p1, p2, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->atlasTexture:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    .line 80
    new-instance p1, Lcom/daaw/avee/Common/Vec2f;

    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->texture:Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    invoke-virtual {p2}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->getWidth()I

    move-result p2

    int-to-float p2, p2

    iget-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->texture:Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    invoke-virtual {p3}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;->getHeight()I

    move-result p3

    int-to-float p3, p3

    invoke-direct {p1, p2, p3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->textureDim:Lcom/daaw/avee/Common/Vec2f;

    return-void
.end method

.method private init(Landroid/graphics/Typeface;I)V
    .locals 21

    move-object/from16 v1, p0

    const-string v2, " H: "

    const/4 v3, 0x1

    .line 84
    iput-boolean v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->valid:Z

    .line 92
    new-instance v11, Landroid/graphics/Paint;

    invoke-direct {v11}, Landroid/graphics/Paint;-><init>()V

    move-object/from16 v0, p1

    .line 93
    invoke-virtual {v11, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    move/from16 v0, p2

    int-to-float v0, v0

    .line 94
    invoke-virtual {v11, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 95
    invoke-virtual {v11, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/4 v0, -0x1

    .line 96
    invoke-virtual {v11, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 97
    sget-object v0, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v11, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 99
    invoke-virtual {v11}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v0

    .line 101
    iget v12, v0, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 102
    iget v4, v0, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 103
    iget v5, v0, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 104
    iget v13, v0, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    .line 105
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->leading:I

    sub-int v0, v13, v12

    .line 107
    iput v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->fontMetricMaxHeight:I

    sub-int/2addr v5, v4

    .line 108
    iput v5, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->fontMetricHeight:I

    .line 111
    iget-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->count()I

    move-result v0

    new-array v0, v0, [Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    iput-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->glyphs:[Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    .line 113
    iget-object v0, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->count()I

    move-result v0

    int-to-double v4, v0

    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v0, v4

    .line 116
    iget v4, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->fontMetricMaxHeight:I

    add-int/2addr v4, v3

    mul-int v0, v0, v4

    .line 119
    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->pow2roundup(I)I

    move-result v4

    .line 120
    invoke-static {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->pow2roundup(I)I

    move-result v5

    const/4 v14, 0x0

    const/4 v6, 0x0

    .line 125
    :try_start_0
    invoke-static {v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->pow2roundup(I)I

    move-result v0

    .line 126
    invoke-static {v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->pow2roundup(I)I

    move-result v7

    .line 127
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Creating bitmap atlas for fonts, W:"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    const/16 v8, 0x400

    if-gt v7, v8, :cond_0

    if-gt v0, v8, :cond_0

    .line 130
    sget-object v6, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->tmpBitmap1024:Landroid/graphics/Bitmap;

    .line 131
    sget-object v0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->tmpBitmap1024:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v14}, Landroid/graphics/Bitmap;->eraseColor(I)V

    goto :goto_0

    .line 133
    :cond_0
    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v7, v8}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 139
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0

    :catch_1
    move-exception v0

    .line 136
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    move-object v0, v6

    if-nez v0, :cond_1

    .line 143
    iput-boolean v14, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->valid:Z

    .line 144
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "failed to create bitmap W:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->pow2roundup(I)I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->pow2roundup(I)I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return-void

    .line 147
    :cond_1
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 149
    iget-object v4, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    invoke-virtual {v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->count()I

    move-result v4

    new-array v15, v4, [F

    .line 151
    iget-object v5, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    invoke-virtual {v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->count()I

    move-result v5

    new-array v6, v5, [C

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v5, :cond_2

    .line 153
    iget-object v8, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    invoke-virtual {v8, v7}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->getCharByIndex(I)C

    move-result v8

    aput-char v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 155
    :cond_2
    invoke-virtual {v11, v6, v14, v4, v15}, Landroid/graphics/Paint;->getTextWidths([CII[F)I

    move-result v5

    if-ge v5, v4, :cond_3

    const-string v4, "widthsReturned < charWidths.length"

    .line 157
    invoke-static {v4}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 162
    :cond_3
    invoke-static {v12}, Ljava/lang/Math;->abs(I)I

    move-result v4

    .line 163
    invoke-virtual {v2, v14}, Landroid/graphics/Canvas;->drawColor(I)V

    const/4 v5, 0x0

    const/4 v10, 0x0

    .line 165
    :goto_2
    iget-object v6, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    invoke-virtual {v6}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->count()I

    move-result v6

    if-ge v10, v6, :cond_5

    .line 166
    iget-object v6, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->glyphs:[Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    invoke-direct {v7, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;-><init>(Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;)V

    aput-object v7, v6, v10

    new-array v6, v3, [C

    .line 169
    iget-object v7, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    invoke-virtual {v7, v10}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->getCharByIndex(I)C

    move-result v7

    aput-char v7, v6, v14

    .line 170
    aget v9, v15, v10

    .line 171
    new-instance v8, Landroid/graphics/Rect;

    invoke-direct {v8}, Landroid/graphics/Rect;-><init>()V

    .line 173
    invoke-virtual {v11, v6, v14, v3, v8}, Landroid/graphics/Paint;->getTextBounds([CIILandroid/graphics/Rect;)V

    .line 176
    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    move-result v7

    add-int/2addr v7, v5

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v14

    if-lt v7, v14, :cond_4

    .line 178
    iget v5, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->fontMetricMaxHeight:I

    add-int/2addr v4, v5

    move v14, v4

    const/4 v7, 0x0

    goto :goto_3

    :cond_4
    move v14, v4

    move v7, v5

    :goto_3
    const/16 v16, 0x0

    const/16 v17, 0x1

    .line 181
    iget v4, v8, Landroid/graphics/Rect;->left:I

    sub-int v4, v7, v4

    int-to-float v5, v4

    int-to-float v4, v14

    move/from16 v18, v4

    move-object v4, v2

    move/from16 v19, v5

    move-object v5, v6

    move/from16 v6, v16

    move v3, v7

    move/from16 v7, v17

    move-object/from16 p2, v8

    move/from16 v8, v19

    move/from16 v20, v9

    move/from16 v9, v18

    move/from16 v17, v10

    move-object v10, v11

    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Canvas;->drawText([CIIFFLandroid/graphics/Paint;)V

    .line 183
    iget-object v4, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->glyphs:[Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    aget-object v4, v4, v17

    int-to-float v5, v3

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->x:F

    .line 184
    iget-object v4, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->glyphs:[Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    aget-object v4, v4, v17

    invoke-static {v12}, Ljava/lang/Math;->abs(I)I

    move-result v5

    sub-int v5, v14, v5

    int-to-float v5, v5

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->y:F

    .line 185
    iget-object v4, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->glyphs:[Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    aget-object v4, v4, v17

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/Rect;->width()I

    move-result v5

    int-to-float v5, v5

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->width:F

    .line 186
    iget-object v4, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->glyphs:[Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    aget-object v4, v4, v17

    iget v5, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->fontMetricMaxHeight:I

    int-to-float v5, v5

    iput v5, v4, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->height:F

    .line 187
    iget-object v4, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->glyphs:[Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    aget-object v4, v4, v17

    move-object/from16 v5, p2

    iget v6, v5, Landroid/graphics/Rect;->left:I

    int-to-float v6, v6

    iput v6, v4, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->visualXOffset:F

    .line 188
    iget-object v4, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->glyphs:[Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    aget-object v4, v4, v17

    int-to-float v6, v13

    iput v6, v4, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->visualYOffset:F

    .line 189
    iget-object v4, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->glyphs:[Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    aget-object v4, v4, v17

    move/from16 v6, v20

    iput v6, v4, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->spaceWidth:F

    .line 190
    iget-object v4, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->glyphs:[Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    aget-object v4, v4, v17

    iget v6, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->fontMetricHeight:I

    int-to-float v6, v6

    iput v6, v4, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->spaceHeight:F

    .line 192
    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    move-result v4

    add-int/lit8 v4, v4, 0x2

    add-int v5, v3, v4

    add-int/lit8 v10, v17, 0x1

    move v4, v14

    const/4 v3, 0x1

    const/4 v14, 0x0

    goto/16 :goto_2

    :cond_5
    if-nez v4, :cond_6

    goto :goto_4

    .line 196
    :cond_6
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    .line 197
    :goto_4
    invoke-static {v13}, Ljava/lang/Math;->abs(I)I

    move-result v2

    add-int/2addr v4, v2

    const/4 v2, 0x1

    add-int/2addr v4, v2

    .line 202
    invoke-static {v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->pow2roundup(I)I

    move-result v2

    .line 203
    invoke-static {v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->pow2roundup(I)I

    move-result v3

    const/4 v4, 0x0

    .line 206
    invoke-static {v0, v4, v4, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 208
    new-instance v5, Lcom/daaw/avee/Common/Vec2f;

    int-to-float v2, v2

    int-to-float v3, v3

    invoke-direct {v5, v2, v3}, Lcom/daaw/avee/Common/Vec2f;-><init>(FF)V

    iput-object v5, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->textureDim:Lcom/daaw/avee/Common/Vec2f;

    .line 210
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    const/16 v7, 0x2601

    const/16 v8, 0x2601

    const/16 v9, 0x2901

    const/4 v10, 0x0

    move-object v5, v2

    move-object v6, v4

    invoke-direct/range {v5 .. v10}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;-><init>(Landroid/graphics/Bitmap;IIIZ)V

    iput-object v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->texture:Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    .line 215
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    iget-object v3, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->texture:Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    const/4 v5, 0x1

    invoke-direct {v2, v3, v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    iput-object v2, v1, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->atlasTexture:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    if-eq v4, v0, :cond_7

    .line 218
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 220
    :cond_7
    sget-object v2, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->tmpBitmap1024:Landroid/graphics/Bitmap;

    if-eq v2, v0, :cond_8

    .line 221
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_8
    return-void
.end method

.method static pow2roundup(I)I
    .locals 1

    const/16 v0, 0x1000

    .line 229
    invoke-static {p0, v0}, Lcom/daaw/avee/Common/Utils;->pow2roundup(II)I

    move-result p0

    return p0
.end method


# virtual methods
.method public dispose()V
    .locals 1

    .line 245
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->atlasTexture:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;->dispose()V

    return-void
.end method

.method public fontHeight()F
    .locals 1

    .line 237
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->fontMetricHeight:I

    int-to-float v0, v0

    return v0
.end method

.method public fontMaxHeight()F
    .locals 1

    .line 241
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->fontMetricMaxHeight:I

    int-to-float v0, v0

    return v0
.end method

.method public getEntryTexture()Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 1

    .line 257
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->atlasTexture:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    return-object v0
.end method

.method public getSpriteDescByChar(C)Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;
    .locals 2

    .line 249
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->glyphs:[Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->charSet:Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;

    invoke-virtual {v1, p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/CharSet;->getIndexByChar(C)I

    move-result p1

    aget-object p1, v0, p1

    return-object p1
.end method

.method public getTexture()Lmdesl/graphics/ITexture;
    .locals 1

    .line 253
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->texture:Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    return-object v0
.end method

.method public isValid()Z
    .locals 1

    .line 225
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->valid:Z

    return v0
.end method

.method public measureText(Ljava/lang/String;)Lcom/daaw/avee/Common/Vec2i;
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 265
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 266
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->getSpriteDescByChar(C)Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;

    move-result-object v2

    .line 267
    iget v2, v2, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont$Glyph;->width:F

    add-float/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 270
    :cond_0
    new-instance p1, Lcom/daaw/avee/Common/Vec2i;

    float-to-int v0, v0

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->fontHeight()F

    move-result v1

    float-to-int v1, v1

    invoke-direct {p1, v0, v1}, Lcom/daaw/avee/Common/Vec2i;-><init>(II)V

    return-object p1
.end method

.method public measureTextY()I
    .locals 1

    .line 274
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->fontHeight()F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method public textureDim()Lcom/daaw/avee/Common/Vec2f;
    .locals 1

    .line 233
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Graphic/SpriteFont;->textureDim:Lcom/daaw/avee/Common/Vec2f;

    return-object v0
.end method
