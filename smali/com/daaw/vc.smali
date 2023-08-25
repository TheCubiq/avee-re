.class public Lcom/daaw/vc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sc0;


# static fields
.field public static final e:[I


# instance fields
.field public a:Landroid/graphics/Canvas;

.field public b:Landroid/graphics/Paint;

.field public final c:I

.field public final d:F


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/daaw/vc;->e:[I

    return-void

    nop

    :array_0
    .array-data 4
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    const/16 v1, 0x46

    iput v1, p0, Lcom/daaw/vc;->c:I

    const/high16 v1, 0x40400000    # 3.0f

    iput v1, p0, Lcom/daaw/vc;->d:F

    const v1, 0x40ffffff    # 7.9999995f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/de0;Lcom/daaw/t40;IFLcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/de0;",
            "Lcom/daaw/t40<",
            "Ljava/lang/Integer;",
            "[F[I",
            "Ljava/lang/Boolean;",
            ">;IF",
            "Lcom/daaw/bs1;",
            "Lcom/daaw/bs1;",
            "Lcom/daaw/w31;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    const/16 v1, 0x8

    new-array v1, v1, [F

    const/4 v2, 0x4

    new-array v3, v2, [I

    const/4 v4, 0x0

    move/from16 v5, p3

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object/from16 v8, p2

    invoke-interface {v8, v7, v1, v3}, Lcom/daaw/t40;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-nez v7, :cond_0

    goto/16 :goto_1

    :cond_0
    aget v7, v3, v4

    const/16 v9, 0x46

    invoke-static {v7, v9}, Lcom/daaw/f80;->t(II)I

    move-result v7

    iget-object v9, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    invoke-virtual {v9, v7}, Landroid/graphics/Paint;->setColor(I)V

    aget v7, v1, v4

    const/4 v9, 0x1

    aget v9, v1, v9

    const/4 v10, 0x2

    aget v15, v1, v10

    const/4 v10, 0x3

    aget v14, v1, v10

    aget v13, v1, v2

    const/4 v10, 0x5

    aget v12, v1, v10

    const/4 v10, 0x6

    aget v11, v1, v10

    const/4 v10, 0x7

    aget v10, v1, v10

    iget-object v2, v0, Lcom/daaw/vc;->a:Landroid/graphics/Canvas;

    iget-object v4, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    move/from16 p5, v10

    move-object v10, v2

    move v2, v11

    move v11, v7

    move/from16 p6, v12

    move v12, v9

    move/from16 p7, v13

    move v13, v15

    move/from16 v22, v14

    move/from16 v23, v15

    move-object v15, v4

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget-object v11, v0, Lcom/daaw/vc;->a:Landroid/graphics/Canvas;

    iget-object v4, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    move/from16 v12, v23

    move/from16 v13, v22

    move/from16 v14, p7

    move/from16 v15, p6

    move-object/from16 v16, v4

    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget-object v4, v0, Lcom/daaw/vc;->a:Landroid/graphics/Canvas;

    iget-object v10, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    move-object/from16 v16, v4

    move/from16 v17, p7

    move/from16 v18, p6

    move/from16 v19, v2

    move/from16 v20, p5

    move-object/from16 v21, v10

    invoke-virtual/range {v16 .. v21}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget-object v10, v0, Lcom/daaw/vc;->a:Landroid/graphics/Canvas;

    iget-object v15, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    move v11, v2

    move/from16 v12, p5

    move v13, v7

    move v14, v9

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget-object v11, v0, Lcom/daaw/vc;->a:Landroid/graphics/Canvas;

    iget-object v4, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    move/from16 v12, v23

    move/from16 v13, v22

    move v14, v2

    move/from16 v15, p5

    move-object/from16 v16, v4

    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget-object v10, v0, Lcom/daaw/vc;->a:Landroid/graphics/Canvas;

    iget-object v15, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    move/from16 v11, p7

    move/from16 v12, p6

    move v13, v7

    move v14, v9

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget-object v4, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    invoke-virtual {v0, v7, v9, v4}, Lcom/daaw/vc;->g(FFLandroid/graphics/Paint;)V

    iget-object v4, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    move/from16 v9, v22

    move/from16 v7, v23

    invoke-virtual {v0, v7, v9, v4}, Lcom/daaw/vc;->g(FFLandroid/graphics/Paint;)V

    iget-object v4, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    move/from16 v9, p6

    move/from16 v7, p7

    invoke-virtual {v0, v7, v9, v4}, Lcom/daaw/vc;->g(FFLandroid/graphics/Paint;)V

    iget-object v4, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    move/from16 v7, p5

    invoke-virtual {v0, v2, v7, v4}, Lcom/daaw/vc;->g(FFLandroid/graphics/Paint;)V

    :goto_1
    add-int/lit8 v6, v6, 0x1

    const/4 v2, 0x4

    const/4 v4, 0x0

    goto/16 :goto_0

    :cond_1
    return-void
.end method

.method public b(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/qc0;ILcom/daaw/qr1;)V
    .locals 0

    invoke-virtual/range {p0 .. p15}, Lcom/daaw/vc;->e(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/qc0;I)V

    return-void
.end method

.method public c(Lcom/daaw/de0;Lcom/daaw/u40;IFLcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/qc0;ILcom/daaw/qr1;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/de0;",
            "Lcom/daaw/u40<",
            "Ljava/lang/Integer;",
            "[F[I[F",
            "Ljava/lang/Boolean;",
            ">;IF",
            "Lcom/daaw/bs1;",
            "Lcom/daaw/bs1;",
            "Lcom/daaw/qc0;",
            "I",
            "Lcom/daaw/qr1;",
            ")V"
        }
    .end annotation

    new-instance v7, Lcom/daaw/w31;

    const/4 v0, 0x0

    move-object/from16 v1, p7

    move/from16 v2, p8

    move-object/from16 v3, p9

    invoke-direct {v7, v2, v1, v3, v0}, Lcom/daaw/w31;-><init>(ILcom/daaw/qc0;Lcom/daaw/qr1;Lcom/daaw/g0;)V

    const/16 v0, 0x8

    new-array v0, v0, [F

    new-instance v2, Lcom/daaw/vc$a;

    move-object v8, p0

    move-object v1, p2

    invoke-direct {v2, p0, p2, v0}, Lcom/daaw/vc$a;-><init>(Lcom/daaw/vc;Lcom/daaw/u40;[F)V

    move-object v0, p0

    move-object v1, p1

    move v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/vc;->a(Lcom/daaw/de0;Lcom/daaw/t40;IFLcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V

    return-void
.end method

.method public d(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V
    .locals 16

    invoke-virtual/range {p14 .. p14}, Lcom/daaw/w31;->f()Lcom/daaw/qc0;

    move-result-object v14

    move-object/from16 v0, p14

    iget v15, v0, Lcom/daaw/w31;->a:I

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    invoke-virtual/range {v0 .. v15}, Lcom/daaw/vc;->e(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/qc0;I)V

    return-void
.end method

.method public e(Lcom/daaw/de0;FFFFFFFFFILcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/qc0;I)V
    .locals 4

    move-object v0, p0

    const/16 v1, 0x46

    move v2, p11

    invoke-static {p11, v1}, Lcom/daaw/f80;->t(II)I

    move-result v1

    iget-object v2, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v1, v0, Lcom/daaw/vc;->a:Landroid/graphics/Canvas;

    iget-object v2, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    move-object p10, v1

    move p11, p2

    move/from16 p12, p3

    move/from16 p13, p4

    move/from16 p14, p5

    move-object/from16 p15, v2

    invoke-virtual/range {p10 .. p15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget-object v1, v0, Lcom/daaw/vc;->a:Landroid/graphics/Canvas;

    iget-object v2, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    move-object p10, v1

    move p11, p4

    move/from16 p12, p5

    move/from16 p13, p6

    move/from16 p14, p7

    move-object/from16 p15, v2

    invoke-virtual/range {p10 .. p15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget-object v1, v0, Lcom/daaw/vc;->a:Landroid/graphics/Canvas;

    iget-object v2, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    move-object p10, v1

    move p11, p6

    move/from16 p12, p7

    move/from16 p13, p8

    move/from16 p14, p9

    move-object/from16 p15, v2

    invoke-virtual/range {p10 .. p15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget-object v1, v0, Lcom/daaw/vc;->a:Landroid/graphics/Canvas;

    iget-object v2, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    move-object p10, v1

    move p11, p8

    move/from16 p12, p9

    move/from16 p13, p2

    move/from16 p14, p3

    move-object/from16 p15, v2

    invoke-virtual/range {p10 .. p15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget-object v1, v0, Lcom/daaw/vc;->a:Landroid/graphics/Canvas;

    iget-object v2, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    move-object p10, v1

    move p11, p4

    move/from16 p12, p5

    move/from16 p13, p8

    move/from16 p14, p9

    move-object/from16 p15, v2

    invoke-virtual/range {p10 .. p15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget-object v1, v0, Lcom/daaw/vc;->a:Landroid/graphics/Canvas;

    iget-object v2, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    move-object p10, v1

    move p11, p6

    move/from16 p12, p7

    move/from16 p13, p2

    move/from16 p14, p3

    move-object/from16 p15, v2

    invoke-virtual/range {p10 .. p15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget-object v1, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    move v2, p2

    move v3, p3

    invoke-virtual {p0, p2, p3, v1}, Lcom/daaw/vc;->g(FFLandroid/graphics/Paint;)V

    iget-object v1, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    move v2, p4

    move v3, p5

    invoke-virtual {p0, p4, p5, v1}, Lcom/daaw/vc;->g(FFLandroid/graphics/Paint;)V

    iget-object v1, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    move v2, p6

    move v3, p7

    invoke-virtual {p0, p6, p7, v1}, Lcom/daaw/vc;->g(FFLandroid/graphics/Paint;)V

    iget-object v1, v0, Lcom/daaw/vc;->b:Landroid/graphics/Paint;

    move v2, p8

    move v3, p9

    invoke-virtual {p0, p8, p9, v1}, Lcom/daaw/vc;->g(FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public f(Lcom/daaw/de0;Lcom/daaw/t40;IFLcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/de0;",
            "Lcom/daaw/t40<",
            "Ljava/lang/Integer;",
            "[F[I",
            "Ljava/lang/Boolean;",
            ">;IF",
            "Lcom/daaw/bs1;",
            "Lcom/daaw/bs1;",
            "Lcom/daaw/w31;",
            ")V"
        }
    .end annotation

    invoke-virtual/range {p0 .. p7}, Lcom/daaw/vc;->a(Lcom/daaw/de0;Lcom/daaw/t40;IFLcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/w31;)V

    return-void
.end method

.method public g(FFLandroid/graphics/Paint;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vc;->a:Landroid/graphics/Canvas;

    const/high16 v1, 0x40400000    # 3.0f

    invoke-virtual {v0, p1, p2, v1, p3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public h(Landroid/graphics/Canvas;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/vc;->a:Landroid/graphics/Canvas;

    return-void
.end method
