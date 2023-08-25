.class public Lcom/daaw/pv1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/pv1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/zw1$a<",
        "Ljava/lang/String;",
        "Lcom/daaw/bs1;",
        "Lcom/daaw/bs1;",
        "Lcom/daaw/bq0;",
        "Lcom/daaw/de0;",
        "Lcom/daaw/bs1;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/pv1;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$a;->a:Lcom/daaw/pv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lcom/daaw/bs1;

    check-cast p3, Lcom/daaw/bs1;

    check-cast p4, Lcom/daaw/bq0;

    check-cast p5, Lcom/daaw/de0;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/pv1$a;->b(Ljava/lang/String;Lcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/bq0;Lcom/daaw/de0;)Lcom/daaw/bs1;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;Lcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/bq0;Lcom/daaw/de0;)Lcom/daaw/bs1;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    invoke-interface/range {p5 .. p5}, Lcom/daaw/de0;->d()F

    move-result v4

    invoke-interface/range {p5 .. p5}, Lcom/daaw/de0;->g()F

    move-result v5

    if-nez v1, :cond_0

    new-instance v1, Lcom/daaw/bs1;

    iget v3, v2, Lcom/daaw/bs1;->a:F

    iget v2, v2, Lcom/daaw/bs1;->b:F

    invoke-direct {v1, v3, v2}, Lcom/daaw/bs1;-><init>(FF)V

    return-object v1

    :cond_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x1

    if-ge v6, v7, :cond_1

    new-instance v1, Lcom/daaw/bs1;

    iget v3, v2, Lcom/daaw/bs1;->a:F

    iget v2, v2, Lcom/daaw/bs1;->b:F

    invoke-direct {v1, v3, v2}, Lcom/daaw/bs1;-><init>(FF)V

    return-object v1

    :cond_1
    const/4 v6, 0x0

    if-nez p3, :cond_2

    new-instance v7, Lcom/daaw/bs1;

    invoke-direct {v7, v6, v6}, Lcom/daaw/bs1;-><init>(FF)V

    goto :goto_0

    :cond_2
    move-object/from16 v7, p3

    :goto_0
    const-string v8, "Nothing"

    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    new-instance v1, Lcom/daaw/bs1;

    invoke-direct {v1, v6, v6}, Lcom/daaw/bs1;-><init>(FF)V

    return-object v1

    :cond_3
    const-string v8, "Constant"

    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    new-instance v1, Lcom/daaw/bs1;

    iget v3, v2, Lcom/daaw/bs1;->a:F

    iget v2, v2, Lcom/daaw/bs1;->b:F

    invoke-direct {v1, v3, v2}, Lcom/daaw/bs1;-><init>(FF)V

    return-object v1

    :cond_4
    const-string v8, "IsPlaying"

    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const/high16 v9, 0x3f800000    # 1.0f

    if-eqz v8, :cond_6

    iget-object v1, v0, Lcom/daaw/pv1$a;->a:Lcom/daaw/pv1;

    invoke-virtual {v1}, Lcom/daaw/pv1;->S()Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, Lcom/daaw/bs1;

    invoke-direct {v1, v9, v9}, Lcom/daaw/bs1;-><init>(FF)V

    goto :goto_1

    :cond_5
    new-instance v1, Lcom/daaw/bs1;

    invoke-direct {v1, v6, v6}, Lcom/daaw/bs1;-><init>(FF)V

    :goto_1
    return-object v1

    :cond_6
    const-string v8, "Beat"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    new-instance v1, Lcom/daaw/bs1;

    iget v3, v3, Lcom/daaw/bq0;->a:F

    iget v4, v2, Lcom/daaw/bs1;->a:F

    mul-float v4, v4, v3

    iget v2, v2, Lcom/daaw/bs1;->b:F

    mul-float v3, v3, v2

    invoke-direct {v1, v4, v3}, Lcom/daaw/bs1;-><init>(FF)V

    return-object v1

    :cond_7
    const-string v8, "BeatCamShakeMore"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const-wide v10, 0x3fe99999a0000000L    # 0.800000011920929

    const/high16 v12, 0x40200000    # 2.5f

    const v13, 0x3d75c28f    # 0.06f

    const/high16 v14, 0x3f000000    # 0.5f

    if-eqz v8, :cond_9

    iget-object v1, v0, Lcom/daaw/pv1$a;->a:Lcom/daaw/pv1;

    invoke-virtual {v1}, Lcom/daaw/pv1;->S()Z

    move-result v1

    if-eqz v1, :cond_8

    iget v1, v3, Lcom/daaw/bq0;->a:F

    mul-float v1, v1, v12

    goto :goto_2

    :cond_8
    const/4 v1, 0x0

    :goto_2
    invoke-static {v1, v9}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-static {v1, v6}, Ljava/lang/Math;->max(FF)F

    move-result v1

    mul-float v3, v1, v1

    iget-object v4, v0, Lcom/daaw/pv1$a;->a:Lcom/daaw/pv1;

    invoke-static {v4}, Lcom/daaw/pv1;->l(Lcom/daaw/pv1;)Lcom/daaw/p80;

    move-result-object v4

    mul-float v5, v5, v14

    mul-float v5, v5, v1

    iget v1, v2, Lcom/daaw/bs1;->b:F

    mul-float v5, v5, v1

    rem-float/2addr v5, v9

    invoke-virtual {v4, v5}, Lcom/daaw/p80;->a(F)Lcom/daaw/bs1;

    move-result-object v1

    iget v4, v1, Lcom/daaw/bs1;->a:F

    sub-float/2addr v4, v14

    iget v5, v2, Lcom/daaw/bs1;->a:F

    mul-float v4, v4, v5

    mul-float v4, v4, v3

    mul-float v4, v4, v13

    iput v4, v1, Lcom/daaw/bs1;->a:F

    iget v4, v1, Lcom/daaw/bs1;->b:F

    sub-float/2addr v4, v14

    iget v2, v2, Lcom/daaw/bs1;->a:F

    mul-float v4, v4, v2

    mul-float v4, v4, v3

    mul-float v4, v4, v13

    iput v4, v1, Lcom/daaw/bs1;->b:F

    invoke-static {v1, v7, v1, v10, v11}, Lcom/daaw/tg0;->b(Lcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/bs1;D)V

    return-object v1

    :cond_9
    const-string v8, "BeatCamShakeLess"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    iget-object v1, v0, Lcom/daaw/pv1$a;->a:Lcom/daaw/pv1;

    invoke-virtual {v1}, Lcom/daaw/pv1;->S()Z

    move-result v1

    if-eqz v1, :cond_a

    iget v1, v3, Lcom/daaw/bq0;->a:F

    mul-float v1, v1, v12

    goto :goto_3

    :cond_a
    const/4 v1, 0x0

    :goto_3
    invoke-static {v1, v9}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-static {v1, v6}, Ljava/lang/Math;->max(FF)F

    move-result v1

    mul-float v3, v1, v1

    iget-object v4, v0, Lcom/daaw/pv1$a;->a:Lcom/daaw/pv1;

    invoke-static {v4}, Lcom/daaw/pv1;->m(Lcom/daaw/pv1;)Lcom/daaw/p80;

    move-result-object v4

    mul-float v5, v5, v14

    mul-float v5, v5, v1

    iget v1, v2, Lcom/daaw/bs1;->b:F

    mul-float v5, v5, v1

    rem-float/2addr v5, v9

    invoke-virtual {v4, v5}, Lcom/daaw/p80;->a(F)Lcom/daaw/bs1;

    move-result-object v1

    iget v4, v1, Lcom/daaw/bs1;->a:F

    sub-float/2addr v4, v14

    iget v5, v2, Lcom/daaw/bs1;->a:F

    mul-float v4, v4, v5

    mul-float v4, v4, v3

    mul-float v4, v4, v13

    iput v4, v1, Lcom/daaw/bs1;->a:F

    iget v4, v1, Lcom/daaw/bs1;->b:F

    sub-float/2addr v4, v14

    iget v2, v2, Lcom/daaw/bs1;->a:F

    mul-float v4, v4, v2

    mul-float v4, v4, v3

    mul-float v4, v4, v13

    iput v4, v1, Lcom/daaw/bs1;->b:F

    invoke-static {v1, v7, v1, v10, v11}, Lcom/daaw/tg0;->b(Lcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/bs1;D)V

    return-object v1

    :cond_b
    const-string v8, "TotalTime"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_c

    new-instance v1, Lcom/daaw/bs1;

    iget v3, v2, Lcom/daaw/bs1;->a:F

    mul-float v3, v3, v5

    rem-float/2addr v3, v9

    iget v2, v2, Lcom/daaw/bs1;->b:F

    mul-float v5, v5, v2

    rem-float/2addr v5, v9

    invoke-direct {v1, v3, v5}, Lcom/daaw/bs1;-><init>(FF)V

    return-object v1

    :cond_c
    const-string v8, "TotalTimeBackward"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    new-instance v1, Lcom/daaw/bs1;

    iget v3, v2, Lcom/daaw/bs1;->a:F

    mul-float v3, v3, v5

    rem-float/2addr v3, v9

    sub-float v3, v9, v3

    iget v2, v2, Lcom/daaw/bs1;->b:F

    mul-float v5, v5, v2

    rem-float/2addr v5, v9

    sub-float/2addr v9, v5

    invoke-direct {v1, v3, v9}, Lcom/daaw/bs1;-><init>(FF)V

    return-object v1

    :cond_d
    const-string v8, "TotalTimeWhenPlaying"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_e

    new-instance v1, Lcom/daaw/bs1;

    iget-object v3, v0, Lcom/daaw/pv1$a;->a:Lcom/daaw/pv1;

    invoke-static {v3}, Lcom/daaw/pv1;->G(Lcom/daaw/pv1;)F

    move-result v3

    iget v4, v2, Lcom/daaw/bs1;->a:F

    mul-float v3, v3, v4

    rem-float/2addr v3, v9

    iget-object v4, v0, Lcom/daaw/pv1$a;->a:Lcom/daaw/pv1;

    invoke-static {v4}, Lcom/daaw/pv1;->G(Lcom/daaw/pv1;)F

    move-result v4

    iget v2, v2, Lcom/daaw/bs1;->b:F

    mul-float v4, v4, v2

    rem-float/2addr v4, v9

    invoke-direct {v1, v3, v4}, Lcom/daaw/bs1;-><init>(FF)V

    return-object v1

    :cond_e
    const-string v8, "ConstantShakeMore"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const-wide v10, 0x3fb99999a0000000L    # 0.10000000149011612

    if-eqz v8, :cond_f

    iget-object v1, v0, Lcom/daaw/pv1$a;->a:Lcom/daaw/pv1;

    invoke-static {v1}, Lcom/daaw/pv1;->l(Lcom/daaw/pv1;)Lcom/daaw/p80;

    move-result-object v1

    mul-float v5, v5, v14

    iget v3, v2, Lcom/daaw/bs1;->b:F

    mul-float v5, v5, v3

    rem-float/2addr v5, v9

    invoke-virtual {v1, v5}, Lcom/daaw/p80;->a(F)Lcom/daaw/bs1;

    move-result-object v1

    iget v3, v1, Lcom/daaw/bs1;->a:F

    sub-float/2addr v3, v14

    iget v4, v2, Lcom/daaw/bs1;->a:F

    mul-float v3, v3, v4

    mul-float v3, v3, v13

    iput v3, v1, Lcom/daaw/bs1;->a:F

    iget v3, v1, Lcom/daaw/bs1;->b:F

    sub-float/2addr v3, v14

    iget v2, v2, Lcom/daaw/bs1;->a:F

    mul-float v3, v3, v2

    mul-float v3, v3, v13

    iput v3, v1, Lcom/daaw/bs1;->b:F

    invoke-static {v1, v7, v1, v10, v11}, Lcom/daaw/tg0;->b(Lcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/bs1;D)V

    return-object v1

    :cond_f
    const-string v8, "ConstantShake"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_10

    iget-object v1, v0, Lcom/daaw/pv1$a;->a:Lcom/daaw/pv1;

    invoke-static {v1}, Lcom/daaw/pv1;->m(Lcom/daaw/pv1;)Lcom/daaw/p80;

    move-result-object v1

    mul-float v5, v5, v14

    iget v3, v2, Lcom/daaw/bs1;->b:F

    mul-float v5, v5, v3

    rem-float/2addr v5, v9

    invoke-virtual {v1, v5}, Lcom/daaw/p80;->a(F)Lcom/daaw/bs1;

    move-result-object v1

    iget v3, v1, Lcom/daaw/bs1;->a:F

    sub-float/2addr v3, v14

    iget v4, v2, Lcom/daaw/bs1;->a:F

    mul-float v3, v3, v4

    mul-float v3, v3, v13

    iput v3, v1, Lcom/daaw/bs1;->a:F

    iget v3, v1, Lcom/daaw/bs1;->b:F

    sub-float/2addr v3, v14

    iget v2, v2, Lcom/daaw/bs1;->a:F

    mul-float v3, v3, v2

    mul-float v3, v3, v13

    iput v3, v1, Lcom/daaw/bs1;->b:F

    invoke-static {v1, v7, v1, v10, v11}, Lcom/daaw/tg0;->b(Lcom/daaw/bs1;Lcom/daaw/bs1;Lcom/daaw/bs1;D)V

    return-object v1

    :cond_10
    const-string v8, "BeatRandomShake"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_12

    iget-object v1, v0, Lcom/daaw/pv1$a;->a:Lcom/daaw/pv1;

    invoke-virtual {v1}, Lcom/daaw/pv1;->S()Z

    move-result v1

    if-eqz v1, :cond_11

    iget v1, v3, Lcom/daaw/bq0;->a:F

    mul-float v1, v1, v12

    goto :goto_4

    :cond_11
    const/4 v1, 0x0

    :goto_4
    invoke-static {v1, v9}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-static {v1, v6}, Ljava/lang/Math;->max(FF)F

    move-result v1

    mul-float v3, v1, v1

    mul-float v3, v3, v1

    new-instance v1, Lcom/daaw/bs1;

    iget-object v4, v0, Lcom/daaw/pv1$a;->a:Lcom/daaw/pv1;

    invoke-static {v4}, Lcom/daaw/pv1;->j(Lcom/daaw/pv1;)Lcom/daaw/bs1;

    move-result-object v4

    iget v4, v4, Lcom/daaw/bs1;->a:F

    mul-float v4, v4, v3

    iget v5, v2, Lcom/daaw/bs1;->a:F

    mul-float v4, v4, v5

    const v5, 0x3ccccccd    # 0.025f

    mul-float v4, v4, v5

    iget-object v6, v0, Lcom/daaw/pv1$a;->a:Lcom/daaw/pv1;

    invoke-static {v6}, Lcom/daaw/pv1;->j(Lcom/daaw/pv1;)Lcom/daaw/bs1;

    move-result-object v6

    iget v6, v6, Lcom/daaw/bs1;->b:F

    mul-float v6, v6, v3

    iget v2, v2, Lcom/daaw/bs1;->a:F

    mul-float v6, v6, v2

    mul-float v6, v6, v5

    invoke-direct {v1, v4, v6}, Lcom/daaw/bs1;-><init>(FF)V

    return-object v1

    :cond_12
    const-string v8, "TrackPosition"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_13

    invoke-static {}, Lcom/daaw/b5;->d()J

    move-result-wide v3

    long-to-float v1, v3

    invoke-static {}, Lcom/daaw/b5;->c()J

    move-result-wide v3

    long-to-float v3, v3

    div-float/2addr v1, v3

    invoke-static {v1, v9}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-static {v1, v6}, Ljava/lang/Math;->max(FF)F

    move-result v1

    new-instance v3, Lcom/daaw/bs1;

    iget v4, v2, Lcom/daaw/bs1;->a:F

    mul-float v4, v4, v1

    iget v2, v2, Lcom/daaw/bs1;->b:F

    mul-float v1, v1, v2

    invoke-direct {v3, v4, v1}, Lcom/daaw/bs1;-><init>(FF)V

    return-object v3

    :cond_13
    const-string v8, "TotalTimeAndBeat"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_15

    iget v1, v7, Lcom/daaw/bs1;->a:F

    iget-object v5, v0, Lcom/daaw/pv1$a;->a:Lcom/daaw/pv1;

    invoke-virtual {v5}, Lcom/daaw/pv1;->S()Z

    move-result v5

    if-eqz v5, :cond_14

    iget v5, v2, Lcom/daaw/bs1;->a:F

    mul-float v4, v4, v5

    mul-float v4, v4, v9

    add-float/2addr v1, v4

    iget v3, v3, Lcom/daaw/bq0;->a:F

    iget v2, v2, Lcom/daaw/bs1;->b:F

    mul-float v3, v3, v2

    const v2, 0x3dcccccd    # 0.1f

    mul-float v3, v3, v2

    add-float/2addr v1, v3

    :cond_14
    new-instance v2, Lcom/daaw/bs1;

    invoke-direct {v2, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    return-object v2

    :cond_15
    const-string v8, "ConstantShakeRotMore"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const-wide v15, 0x401921fb54442d18L    # 6.283185307179586

    if-eqz v8, :cond_16

    iget-object v1, v0, Lcom/daaw/pv1$a;->a:Lcom/daaw/pv1;

    invoke-static {v1}, Lcom/daaw/pv1;->l(Lcom/daaw/pv1;)Lcom/daaw/p80;

    move-result-object v1

    mul-float v5, v5, v14

    iget v3, v2, Lcom/daaw/bs1;->b:F

    mul-float v5, v5, v3

    rem-float/2addr v5, v9

    invoke-virtual {v1, v5}, Lcom/daaw/p80;->b(F)F

    move-result v1

    float-to-double v3, v1

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v3, v15

    double-to-float v1, v3

    iget v2, v2, Lcom/daaw/bs1;->a:F

    mul-float v1, v1, v2

    mul-float v1, v1, v14

    iget v2, v7, Lcom/daaw/bs1;->a:F

    invoke-static {v2, v1, v10, v11}, Lcom/daaw/tg0;->a(FFD)F

    move-result v1

    new-instance v2, Lcom/daaw/bs1;

    invoke-direct {v2, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    return-object v2

    :cond_16
    const-string v8, "ConstantShakeRotLess"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_17

    iget-object v1, v0, Lcom/daaw/pv1$a;->a:Lcom/daaw/pv1;

    invoke-static {v1}, Lcom/daaw/pv1;->m(Lcom/daaw/pv1;)Lcom/daaw/p80;

    move-result-object v1

    mul-float v5, v5, v14

    iget v3, v2, Lcom/daaw/bs1;->b:F

    mul-float v5, v5, v3

    rem-float/2addr v5, v9

    invoke-virtual {v1, v5}, Lcom/daaw/p80;->b(F)F

    move-result v1

    float-to-double v3, v1

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v3, v15

    double-to-float v1, v3

    iget v2, v2, Lcom/daaw/bs1;->a:F

    mul-float v1, v1, v2

    mul-float v1, v1, v14

    iget v2, v7, Lcom/daaw/bs1;->a:F

    invoke-static {v2, v1, v10, v11}, Lcom/daaw/tg0;->a(FFD)F

    move-result v1

    new-instance v2, Lcom/daaw/bs1;

    invoke-direct {v2, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    return-object v2

    :cond_17
    const-string v8, "BeatCamShakeRotMore"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_19

    iget-object v1, v0, Lcom/daaw/pv1$a;->a:Lcom/daaw/pv1;

    invoke-virtual {v1}, Lcom/daaw/pv1;->S()Z

    move-result v1

    if-eqz v1, :cond_18

    iget v1, v3, Lcom/daaw/bq0;->a:F

    mul-float v1, v1, v12

    goto :goto_5

    :cond_18
    const/4 v1, 0x0

    :goto_5
    invoke-static {v1, v9}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-static {v1, v6}, Ljava/lang/Math;->max(FF)F

    move-result v1

    mul-float v1, v1, v1

    iget-object v3, v0, Lcom/daaw/pv1$a;->a:Lcom/daaw/pv1;

    invoke-static {v3}, Lcom/daaw/pv1;->l(Lcom/daaw/pv1;)Lcom/daaw/p80;

    move-result-object v3

    mul-float v5, v5, v14

    iget v4, v2, Lcom/daaw/bs1;->b:F

    mul-float v5, v5, v4

    rem-float/2addr v5, v9

    invoke-virtual {v3, v5}, Lcom/daaw/p80;->b(F)F

    move-result v3

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v3, v15

    double-to-float v3, v3

    iget v2, v2, Lcom/daaw/bs1;->a:F

    mul-float v3, v3, v2

    mul-float v3, v3, v14

    mul-float v3, v3, v1

    iget v1, v7, Lcom/daaw/bs1;->a:F

    const-wide v4, 0x3fe99999a0000000L    # 0.800000011920929

    invoke-static {v1, v3, v4, v5}, Lcom/daaw/tg0;->a(FFD)F

    move-result v1

    new-instance v2, Lcom/daaw/bs1;

    invoke-direct {v2, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    return-object v2

    :cond_19
    const-string v8, "BeatCamShakeRotLess"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1b

    iget-object v1, v0, Lcom/daaw/pv1$a;->a:Lcom/daaw/pv1;

    invoke-virtual {v1}, Lcom/daaw/pv1;->S()Z

    move-result v1

    if-eqz v1, :cond_1a

    iget v1, v3, Lcom/daaw/bq0;->a:F

    mul-float v1, v1, v12

    goto :goto_6

    :cond_1a
    const/4 v1, 0x0

    :goto_6
    invoke-static {v1, v9}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-static {v1, v6}, Ljava/lang/Math;->max(FF)F

    move-result v1

    mul-float v1, v1, v1

    iget-object v3, v0, Lcom/daaw/pv1$a;->a:Lcom/daaw/pv1;

    invoke-static {v3}, Lcom/daaw/pv1;->m(Lcom/daaw/pv1;)Lcom/daaw/p80;

    move-result-object v3

    mul-float v5, v5, v14

    iget v4, v2, Lcom/daaw/bs1;->b:F

    mul-float v5, v5, v4

    rem-float/2addr v5, v9

    invoke-virtual {v3, v5}, Lcom/daaw/p80;->b(F)F

    move-result v3

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v3, v15

    double-to-float v3, v3

    iget v2, v2, Lcom/daaw/bs1;->a:F

    mul-float v3, v3, v2

    mul-float v3, v3, v14

    mul-float v3, v3, v1

    iget v1, v7, Lcom/daaw/bs1;->a:F

    const-wide v4, 0x3fe99999a0000000L    # 0.800000011920929

    invoke-static {v1, v3, v4, v5}, Lcom/daaw/tg0;->a(FFD)F

    move-result v1

    new-instance v2, Lcom/daaw/bs1;

    invoke-direct {v2, v1, v1}, Lcom/daaw/bs1;-><init>(FF)V

    return-object v2

    :cond_1b
    const-string v5, "PeakBarIndex"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1c

    iget v1, v3, Lcom/daaw/bq0;->b:F

    iget v3, v7, Lcom/daaw/bs1;->a:F

    iget v4, v2, Lcom/daaw/bs1;->b:F

    float-to-double v4, v4

    invoke-static {v1, v3, v4, v5}, Lcom/daaw/tg0;->a(FFD)F

    move-result v1

    new-instance v3, Lcom/daaw/bs1;

    iget v2, v2, Lcom/daaw/bs1;->a:F

    mul-float v4, v1, v2

    mul-float v1, v1, v2

    invoke-direct {v3, v4, v1}, Lcom/daaw/bs1;-><init>(FF)V

    return-object v3

    :cond_1c
    const-string v5, "BeatTriggerAnim"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1f

    iget-object v1, v0, Lcom/daaw/pv1$a;->a:Lcom/daaw/pv1;

    invoke-virtual {v1}, Lcom/daaw/pv1;->S()Z

    move-result v1

    if-eqz v1, :cond_1d

    iget v1, v3, Lcom/daaw/bq0;->a:F

    iget v3, v2, Lcom/daaw/bs1;->a:F

    cmpl-float v1, v1, v3

    if-lez v1, :cond_1d

    iget v1, v7, Lcom/daaw/bs1;->b:F

    const v3, 0x3fffffff    # 1.9999999f

    cmpl-float v1, v1, v3

    if-ltz v1, :cond_1d

    iput v6, v7, Lcom/daaw/bs1;->a:F

    iput v6, v7, Lcom/daaw/bs1;->b:F

    :cond_1d
    iget v1, v7, Lcom/daaw/bs1;->a:F

    iget v2, v2, Lcom/daaw/bs1;->b:F

    mul-float v3, v4, v2

    add-float/2addr v1, v3

    const v3, 0x3efffffd    # 0.4999999f

    cmpl-float v3, v1, v3

    if-ltz v3, :cond_1e

    iget v1, v7, Lcom/daaw/bs1;->b:F

    mul-float v4, v4, v2

    add-float v6, v1, v4

    goto :goto_7

    :cond_1e
    move v14, v1

    :goto_7
    new-instance v1, Lcom/daaw/bs1;

    invoke-direct {v1, v14, v6}, Lcom/daaw/bs1;-><init>(FF)V

    return-object v1

    :cond_1f
    return-object v7
.end method
