.class public Lcom/daaw/te1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/te1$a;
    }
.end annotation


# static fields
.field public static i:Landroid/graphics/Bitmap;

.field public static final j:[C


# instance fields
.field public final a:[Lcom/daaw/ve;

.field public b:Lcom/daaw/vr1;

.field public c:Lcom/daaw/z6;

.field public d:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/daaw/te1$a;",
            ">;"
        }
    .end annotation
.end field

.field public e:Lcom/daaw/bs1;

.field public f:I

.field public g:I

.field public h:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/16 v1, 0x400

    invoke-static {v1, v1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    sput-object v0, Lcom/daaw/te1;->i:Landroid/graphics/Bitmap;

    const/4 v0, 0x2

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/daaw/te1;->j:[C

    return-void

    nop

    :array_0
    .array-data 2
        -0xff5s
        0x1e9es
    .end array-data
.end method

.method public varargs constructor <init>(Landroid/graphics/Typeface;I[Lcom/daaw/ve;)V
    .locals 2

    const-string v0, "failed to create SpriteFont"

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/te1;->h:Z

    iput-object p3, p0, Lcom/daaw/te1;->a:[Lcom/daaw/ve;

    const/4 p3, 0x0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/daaw/te1;->e(Landroid/graphics/Typeface;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-static {v1, v0}, Lcom/daaw/lz1;->b(Ljava/lang/Exception;Ljava/lang/String;)V

    iput-boolean p3, p0, Lcom/daaw/te1;->h:Z

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/te1;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    :try_start_1
    div-int/lit8 p2, p2, 0x2

    invoke-virtual {p0, p1, p2}, Lcom/daaw/te1;->e(Landroid/graphics/Typeface;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    invoke-static {p1, v0}, Lcom/daaw/lz1;->b(Ljava/lang/Exception;Ljava/lang/String;)V

    iput-boolean p3, p0, Lcom/daaw/te1;->h:Z

    :goto_1
    invoke-virtual {p0}, Lcom/daaw/te1;->f()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    return-void
.end method

.method public static g(I)I
    .locals 1

    const/16 v0, 0x1000

    invoke-static {p0, v0}, Lcom/daaw/br1;->s(II)I

    move-result p0

    return p0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/te1;->c:Lcom/daaw/z6;

    invoke-virtual {v0}, Lcom/daaw/z6;->a()V

    return-void
.end method

.method public b()F
    .locals 1

    iget v0, p0, Lcom/daaw/te1;->f:I

    int-to-float v0, v0

    return v0
.end method

.method public c()Lcom/daaw/qc0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/te1;->c:Lcom/daaw/z6;

    return-object v0
.end method

.method public d(C)Lcom/daaw/te1$a;
    .locals 2

    iget-object v0, p0, Lcom/daaw/te1;->d:Landroid/util/SparseArray;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/te1$a;

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseArray;->get(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/te1$a;

    return-object p1
.end method

.method public final e(Landroid/graphics/Typeface;I)V
    .locals 23

    move-object/from16 v1, p0

    const-string v2, " H: "

    sget-object v0, Lcom/daaw/te1;->j:[C

    array-length v0, v0

    iget-object v3, v1, Lcom/daaw/te1;->a:[Lcom/daaw/ve;

    array-length v4, v3

    const/4 v5, 0x0

    move v6, v0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v4, :cond_0

    aget-object v7, v3, v0

    invoke-virtual {v7}, Lcom/daaw/ve;->a()I

    move-result v7

    add-int/2addr v6, v7

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-array v3, v6, [C

    iget-object v0, v1, Lcom/daaw/te1;->a:[Lcom/daaw/ve;

    array-length v4, v0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_1
    if-ge v7, v4, :cond_2

    aget-object v9, v0, v7

    const/4 v10, 0x0

    :goto_2
    iget v11, v9, Lcom/daaw/ve;->c:I

    if-ge v10, v11, :cond_1

    invoke-virtual {v9, v10}, Lcom/daaw/ve;->m(I)C

    move-result v11

    aput-char v11, v3, v8

    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    sget-object v0, Lcom/daaw/te1;->j:[C

    array-length v4, v0

    const/4 v7, 0x0

    :goto_3
    const/4 v9, 0x1

    if-ge v7, v4, :cond_3

    aget-char v10, v0, v7

    aput-char v10, v3, v8

    add-int/2addr v8, v9

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_3
    iput-boolean v9, v1, Lcom/daaw/te1;->h:Z

    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    move-object/from16 v0, p1

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    move/from16 v0, p2

    int-to-float v0, v0

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/4 v0, -0x1

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v0, Landroid/graphics/Paint$Align;->LEFT:Landroid/graphics/Paint$Align;

    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    invoke-virtual {v4}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v0

    iget v7, v0, Landroid/graphics/Paint$FontMetricsInt;->top:I

    iget v8, v0, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    iget v10, v0, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    iget v15, v0, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    sub-int v0, v15, v7

    iput v0, v1, Lcom/daaw/te1;->g:I

    sub-int/2addr v10, v8

    iput v10, v1, Lcom/daaw/te1;->f:I

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0, v6}, Landroid/util/SparseArray;-><init>(I)V

    iput-object v0, v1, Lcom/daaw/te1;->d:Landroid/util/SparseArray;

    int-to-double v10, v6

    invoke-static {v10, v11}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v10

    double-to-int v0, v10

    iget v8, v1, Lcom/daaw/te1;->g:I

    add-int/2addr v8, v9

    mul-int v0, v0, v8

    invoke-static {v0}, Lcom/daaw/te1;->g(I)I

    move-result v8

    invoke-static {v0}, Lcom/daaw/te1;->g(I)I

    move-result v10

    const/4 v11, 0x0

    :try_start_0
    invoke-static {v8}, Lcom/daaw/te1;->g(I)I

    move-result v0

    invoke-static {v10}, Lcom/daaw/te1;->g(I)I

    move-result v12

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Creating bitmap atlas for fonts, W:"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    const/16 v13, 0x400

    if-gt v12, v13, :cond_4

    if-gt v0, v13, :cond_4

    sget-object v11, Lcom/daaw/te1;->i:Landroid/graphics/Bitmap;

    invoke-virtual {v11, v5}, Landroid/graphics/Bitmap;->eraseColor(I)V

    goto :goto_4

    :cond_4
    sget-object v13, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v12, v13}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v11
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_4

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_4
    move-object v0, v11

    if-nez v0, :cond_5

    iput-boolean v5, v1, Lcom/daaw/te1;->h:Z

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "failed to create bitmap W:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v8}, Lcom/daaw/te1;->g(I)I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10}, Lcom/daaw/te1;->g(I)I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    return-void

    :cond_5
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    new-array v8, v6, [F

    invoke-virtual {v4, v3, v5, v6, v8}, Landroid/graphics/Paint;->getTextWidths([CII[F)I

    move-result v10

    if-ge v10, v6, :cond_6

    const-string v10, "widthsReturned < charWidths.length"

    invoke-static {v10}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_6
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v10

    invoke-virtual {v2, v5}, Landroid/graphics/Canvas;->drawColor(I)V

    const/4 v11, 0x0

    const/4 v14, 0x0

    :goto_5
    if-ge v14, v6, :cond_8

    new-instance v13, Lcom/daaw/te1$a;

    invoke-direct {v13, v1}, Lcom/daaw/te1$a;-><init>(Lcom/daaw/te1;)V

    new-array v12, v9, [C

    aget-char v16, v3, v14

    aput-char v16, v12, v5

    move-object/from16 p1, v13

    aget v13, v8, v14

    move/from16 p2, v13

    new-instance v13, Landroid/graphics/Rect;

    invoke-direct {v13}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v4, v12, v5, v9, v13}, Landroid/graphics/Paint;->getTextBounds([CIILandroid/graphics/Rect;)V

    invoke-virtual {v13}, Landroid/graphics/Rect;->width()I

    move-result v16

    add-int v5, v11, v16

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v9

    if-lt v5, v9, :cond_7

    iget v5, v1, Lcom/daaw/te1;->g:I

    add-int/2addr v10, v5

    move v5, v10

    const/4 v9, 0x0

    goto :goto_6

    :cond_7
    move v5, v10

    move v9, v11

    :goto_6
    const/16 v16, 0x0

    const/16 v17, 0x1

    iget v10, v13, Landroid/graphics/Rect;->left:I

    sub-int v10, v9, v10

    int-to-float v11, v10

    int-to-float v10, v5

    move/from16 v18, v10

    move-object v10, v2

    move/from16 v19, v11

    move-object v11, v12

    move/from16 v12, v16

    move-object/from16 v20, p1

    move/from16 v21, p2

    move-object/from16 p1, v13

    move/from16 v13, v17

    move/from16 v17, v14

    move/from16 v14, v19

    move/from16 v22, v15

    move/from16 v15, v18

    move-object/from16 v16, v4

    invoke-virtual/range {v10 .. v16}, Landroid/graphics/Canvas;->drawText([CIIFFLandroid/graphics/Paint;)V

    int-to-float v10, v9

    move-object/from16 v11, v20

    iput v10, v11, Lcom/daaw/te1$a;->a:F

    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v10

    sub-int v10, v5, v10

    int-to-float v10, v10

    iput v10, v11, Lcom/daaw/te1$a;->b:F

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Rect;->width()I

    move-result v10

    int-to-float v10, v10

    iput v10, v11, Lcom/daaw/te1$a;->c:F

    iget v10, v1, Lcom/daaw/te1;->g:I

    int-to-float v10, v10

    iput v10, v11, Lcom/daaw/te1$a;->d:F

    move-object/from16 v10, p1

    iget v12, v10, Landroid/graphics/Rect;->left:I

    int-to-float v12, v12

    iput v12, v11, Lcom/daaw/te1$a;->e:F

    move/from16 v12, v22

    int-to-float v13, v12

    iput v13, v11, Lcom/daaw/te1$a;->f:F

    move/from16 v13, v21

    iput v13, v11, Lcom/daaw/te1$a;->g:F

    iget v13, v1, Lcom/daaw/te1;->f:I

    int-to-float v13, v13

    iput v13, v11, Lcom/daaw/te1$a;->h:F

    iget-object v13, v1, Lcom/daaw/te1;->d:Landroid/util/SparseArray;

    aget-char v14, v3, v17

    invoke-virtual {v13, v14, v11}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    invoke-virtual {v10}, Landroid/graphics/Rect;->width()I

    move-result v10

    add-int/lit8 v10, v10, 0x2

    add-int v11, v9, v10

    add-int/lit8 v14, v17, 0x1

    move v10, v5

    move v15, v12

    const/4 v5, 0x0

    const/4 v9, 0x1

    goto/16 :goto_5

    :cond_8
    move v12, v15

    if-nez v10, :cond_9

    goto :goto_7

    :cond_9
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v11

    :goto_7
    invoke-static {v12}, Ljava/lang/Math;->abs(I)I

    move-result v2

    add-int/2addr v10, v2

    const/4 v2, 0x1

    add-int/2addr v10, v2

    invoke-static {v11}, Lcom/daaw/te1;->g(I)I

    move-result v2

    invoke-static {v10}, Lcom/daaw/te1;->g(I)I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v0, v4, v4, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v4

    new-instance v5, Lcom/daaw/bs1;

    int-to-float v2, v2

    int-to-float v3, v3

    invoke-direct {v5, v2, v3}, Lcom/daaw/bs1;-><init>(FF)V

    iput-object v5, v1, Lcom/daaw/te1;->e:Lcom/daaw/bs1;

    new-instance v2, Lcom/daaw/vr1;

    const/16 v7, 0x2601

    const/16 v8, 0x2601

    const/16 v9, 0x2901

    const/4 v10, 0x0

    move-object v5, v2

    move-object v6, v4

    invoke-direct/range {v5 .. v10}, Lcom/daaw/vr1;-><init>(Landroid/graphics/Bitmap;IIIZ)V

    iput-object v2, v1, Lcom/daaw/te1;->b:Lcom/daaw/vr1;

    new-instance v2, Lcom/daaw/z6;

    iget-object v3, v1, Lcom/daaw/te1;->b:Lcom/daaw/vr1;

    const/4 v5, 0x1

    invoke-direct {v2, v3, v5}, Lcom/daaw/z6;-><init>(Lcom/daaw/le0;Z)V

    iput-object v2, v1, Lcom/daaw/te1;->c:Lcom/daaw/z6;

    if-eq v4, v0, :cond_a

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    :cond_a
    sget-object v2, Lcom/daaw/te1;->i:Landroid/graphics/Bitmap;

    if-eq v2, v0, :cond_b

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_b
    return-void
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/te1;->h:Z

    return v0
.end method

.method public h()Lcom/daaw/bs1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/te1;->e:Lcom/daaw/bs1;

    return-object v0
.end method
