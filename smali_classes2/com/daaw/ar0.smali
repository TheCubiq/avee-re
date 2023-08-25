.class public Lcom/daaw/ar0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final m:[Ljava/lang/String;


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:Z

.field public d:I

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Z

.field public k:Z

.field public l:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x0

    const-string v1, "I"

    const-string v2, "II"

    const-string v3, "III"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/ar0;->m:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(BBBB)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, p2, p3, p4}, Lcom/daaw/wc;->l(BBBB)I

    move-result p1

    int-to-long p1, p1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ar0;->p(J)V

    return-void
.end method


# virtual methods
.method public a(JJ)I
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x1f

    if-gt v1, v2, :cond_1

    shr-long v2, p3, v1

    const-wide/16 v4, 0x1

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-eqz v6, :cond_0

    move v0, v1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    shr-long/2addr p1, v0

    shr-long/2addr p3, v0

    and-long/2addr p1, p3

    long-to-int p2, p1

    return p2
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/daaw/ar0;->d:I

    return v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ar0;->h:Ljava/lang/String;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ar0;->l:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/daaw/ar0;->m:[Ljava/lang/String;

    iget v1, p0, Lcom/daaw/ar0;->b:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public f()I
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/ar0;->f:Z

    iget v1, p0, Lcom/daaw/ar0;->b:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const v1, 0xbb80

    iget v2, p0, Lcom/daaw/ar0;->d:I

    mul-int v2, v2, v1

    iget v1, p0, Lcom/daaw/ar0;->e:I

    div-int/2addr v2, v1

    mul-int/lit8 v0, v0, 0x4

    goto :goto_0

    :cond_0
    const v1, 0x23280

    iget v2, p0, Lcom/daaw/ar0;->d:I

    mul-int v2, v2, v1

    iget v1, p0, Lcom/daaw/ar0;->e:I

    div-int/2addr v2, v1

    :goto_0
    add-int/2addr v2, v0

    int-to-long v0, v2

    long-to-int v1, v0

    return v1
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ar0;->i:Ljava/lang/String;

    return-object v0
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lcom/daaw/ar0;->e:I

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ar0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public j()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ar0;->j:Z

    return v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ar0;->k:Z

    return v0
.end method

.method public final l(I)V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/ar0;->a:Ljava/lang/String;

    const-string v2, "1.0"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/16 v6, 0x70

    const/16 v7, 0x50

    const/16 v10, 0x100

    const/16 v11, 0xe0

    const/16 v12, 0xc0

    const/16 v13, 0xa0

    const/16 v14, 0x80

    const/16 v15, 0x60

    const/16 v2, 0x40

    const/16 v3, 0x20

    if-eqz v1, :cond_2

    iget v1, v0, Lcom/daaw/ar0;->b:I

    const/16 v9, 0x180

    const/16 v8, 0x140

    if-ne v1, v5, :cond_0

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    const/16 v1, 0x1c0

    :goto_0
    iput v1, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_1
    const/16 v1, 0x1a0

    goto :goto_0

    :pswitch_2
    iput v9, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_3
    const/16 v1, 0x160

    goto :goto_0

    :pswitch_4
    iput v8, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_5
    const/16 v1, 0x120

    goto :goto_0

    :pswitch_6
    iput v10, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_7
    iput v11, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_8
    iput v12, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_9
    iput v13, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_a
    iput v14, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_b
    iput v15, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_c
    iput v2, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_d
    iput v3, v0, Lcom/daaw/ar0;->d:I

    return-void

    :cond_0
    if-ne v1, v4, :cond_1

    packed-switch p1, :pswitch_data_1

    goto/16 :goto_1

    :pswitch_e
    iput v9, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_f
    iput v8, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_10
    iput v10, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_11
    iput v11, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_12
    iput v12, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_13
    iput v13, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_14
    iput v14, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_15
    iput v6, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_16
    iput v15, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_17
    iput v7, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_18
    iput v2, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_19
    const/16 v1, 0x38

    goto :goto_0

    :pswitch_1a
    const/16 v1, 0x30

    goto :goto_0

    :pswitch_1b
    iput v3, v0, Lcom/daaw/ar0;->d:I

    return-void

    :cond_1
    const/4 v4, 0x3

    if-ne v1, v4, :cond_6

    packed-switch p1, :pswitch_data_2

    goto/16 :goto_1

    :pswitch_1c
    iput v8, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_1d
    iput v10, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_1e
    iput v11, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_1f
    iput v12, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_20
    iput v13, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_21
    iput v14, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_22
    iput v6, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_23
    iput v15, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_24
    iput v7, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_25
    iput v2, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_26
    const/16 v1, 0x28

    goto/16 :goto_0

    :pswitch_27
    iput v3, v0, Lcom/daaw/ar0;->d:I

    return-void

    :cond_2
    iget-object v1, v0, Lcom/daaw/ar0;->a:Ljava/lang/String;

    const-string v8, "2.0"

    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, v0, Lcom/daaw/ar0;->a:Ljava/lang/String;

    const-string v8, "2.5"

    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    :cond_3
    iget v1, v0, Lcom/daaw/ar0;->b:I

    const/16 v8, 0x90

    if-ne v1, v5, :cond_4

    packed-switch p1, :pswitch_data_3

    goto :goto_1

    :pswitch_28
    iput v10, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_29
    iput v11, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_2a
    iput v12, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_2b
    const/16 v1, 0xb0

    goto/16 :goto_0

    :pswitch_2c
    iput v13, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_2d
    iput v8, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_2e
    iput v14, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_2f
    iput v6, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_30
    iput v15, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_31
    iput v7, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_32
    iput v2, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_33
    iput v3, v0, Lcom/daaw/ar0;->d:I

    return-void

    :cond_4
    if-eq v1, v4, :cond_5

    const/4 v4, 0x3

    if-ne v1, v4, :cond_6

    :cond_5
    packed-switch p1, :pswitch_data_4

    goto :goto_1

    :pswitch_34
    iput v13, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_35
    iput v8, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_36
    iput v14, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_37
    iput v6, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_38
    iput v15, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_39
    iput v7, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_3a
    iput v2, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_3b
    iput v3, v0, Lcom/daaw/ar0;->d:I

    return-void

    :pswitch_3c
    const/16 v1, 0x18

    goto/16 :goto_0

    :pswitch_3d
    const/16 v1, 0x10

    goto/16 :goto_0

    :pswitch_3e
    const/16 v1, 0x8

    goto/16 :goto_0

    :cond_6
    :goto_1
    new-instance v1, Lcom/daaw/xg0;

    const-string v2, "Invalid bitrate in frame header"

    invoke-direct {v1, v2}, Lcom/daaw/xg0;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :goto_2
    throw v1

    :goto_3
    goto :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_27
        :pswitch_26
        :pswitch_1a
        :pswitch_19
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_33
        :pswitch_1a
        :pswitch_19
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_26
        :pswitch_1a
        :pswitch_19
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
    .end packed-switch
.end method

.method public final m(I)V
    .locals 1

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const-string p1, "Mono"

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/daaw/xg0;

    const-string v0, "Invalid channel mode in frame header"

    invoke-direct {p1, v0}, Lcom/daaw/xg0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const-string p1, "Dual mono"

    goto :goto_0

    :cond_2
    const-string p1, "Joint stereo"

    goto :goto_0

    :cond_3
    const-string p1, "Stereo"

    :goto_0
    iput-object p1, p0, Lcom/daaw/ar0;->h:Ljava/lang/String;

    return-void
.end method

.method public final n(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/daaw/ar0;->j:Z

    return-void
.end method

.method public final o(I)V
    .locals 1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const-string p1, "CCITT J.17"

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/daaw/xg0;

    const-string v0, "Invalid emphasis in frame header"

    invoke-direct {p1, v0}, Lcom/daaw/xg0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const-string p1, "50/15 ms"

    goto :goto_0

    :cond_2
    const-string p1, "None"

    :goto_0
    iput-object p1, p0, Lcom/daaw/ar0;->l:Ljava/lang/String;

    return-void
.end method

.method public final p(J)V
    .locals 5

    const-wide v0, 0xffe00000L

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/daaw/ar0;->a(JJ)I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x7ff

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const-wide/32 v0, 0x180000

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/daaw/ar0;->a(JJ)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/ar0;->x(I)V

    const-wide/32 v0, 0x60000

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/daaw/ar0;->a(JJ)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/ar0;->q(I)V

    const-wide/32 v0, 0x10000

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/daaw/ar0;->a(JJ)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/ar0;->v(I)V

    const-wide/32 v0, 0xf000

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/daaw/ar0;->a(JJ)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/ar0;->l(I)V

    const-wide/16 v0, 0xc00

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/daaw/ar0;->a(JJ)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/ar0;->w(I)V

    const-wide/16 v0, 0x200

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/daaw/ar0;->a(JJ)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/ar0;->t(I)V

    const-wide/16 v0, 0x100

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/daaw/ar0;->a(JJ)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/ar0;->u(I)V

    const-wide/16 v0, 0xc0

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/daaw/ar0;->a(JJ)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/ar0;->m(I)V

    const-wide/16 v0, 0x30

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/daaw/ar0;->a(JJ)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/ar0;->r(I)V

    const-wide/16 v0, 0x8

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/daaw/ar0;->a(JJ)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/ar0;->n(I)V

    const-wide/16 v0, 0x4

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/daaw/ar0;->a(JJ)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/daaw/ar0;->s(I)V

    const-wide/16 v0, 0x3

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/daaw/ar0;->a(JJ)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/daaw/ar0;->o(I)V

    return-void

    :cond_0
    new-instance p1, Lcom/daaw/xg0;

    const-string p2, "Frame sync missing"

    invoke-direct {p1, p2}, Lcom/daaw/xg0;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final q(I)V
    .locals 3

    const/4 v0, 0x3

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    const/4 v2, 0x2

    if-eq p1, v2, :cond_1

    if-ne p1, v0, :cond_0

    iput v1, p0, Lcom/daaw/ar0;->b:I

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/daaw/xg0;

    const-string v0, "Invalid mpeg layer description in frame header"

    invoke-direct {p1, v0}, Lcom/daaw/xg0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput v2, p0, Lcom/daaw/ar0;->b:I

    goto :goto_0

    :cond_2
    iput v0, p0, Lcom/daaw/ar0;->b:I

    :goto_0
    return-void
.end method

.method public final r(I)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/ar0;->h:Ljava/lang/String;

    const-string v1, "Joint stereo"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "n/a"

    iput-object p1, p0, Lcom/daaw/ar0;->i:Ljava/lang/String;

    return-void

    :cond_0
    iget v0, p0, Lcom/daaw/ar0;->b:I

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v3, :cond_5

    if-ne v0, v2, :cond_1

    goto :goto_1

    :cond_1
    if-ne v0, v1, :cond_6

    if-eqz p1, :cond_4

    if-eq p1, v3, :cond_3

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_6

    const-string p1, "Intensity & M/S stereo"

    :goto_0
    iput-object p1, p0, Lcom/daaw/ar0;->i:Ljava/lang/String;

    return-void

    :cond_2
    const-string p1, "M/S stereo"

    goto :goto_0

    :cond_3
    const-string p1, "Intensity stereo"

    goto :goto_0

    :cond_4
    const-string p1, "None"

    goto :goto_0

    :cond_5
    :goto_1
    if-eqz p1, :cond_9

    if-eq p1, v3, :cond_8

    if-eq p1, v2, :cond_7

    if-ne p1, v1, :cond_6

    const-string p1, "Bands 16-31"

    goto :goto_0

    :cond_6
    new-instance p1, Lcom/daaw/xg0;

    const-string v0, "Invalid mode extension in frame header"

    invoke-direct {p1, v0}, Lcom/daaw/xg0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    const-string p1, "Bands 12-31"

    goto :goto_0

    :cond_8
    const-string p1, "Bands 8-31"

    goto :goto_0

    :cond_9
    const-string p1, "Bands 4-31"

    goto :goto_0
.end method

.method public final s(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/daaw/ar0;->k:Z

    return-void
.end method

.method public final t(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/daaw/ar0;->f:Z

    return-void
.end method

.method public final u(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/daaw/ar0;->g:Z

    return-void
.end method

.method public final v(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/daaw/ar0;->c:Z

    return-void
.end method

.method public final w(I)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/ar0;->a:Ljava/lang/String;

    const-string v1, "1.0"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    if-eq p1, v2, :cond_0

    if-ne p1, v1, :cond_8

    const/16 p1, 0x7d00

    :goto_0
    iput p1, p0, Lcom/daaw/ar0;->e:I

    return-void

    :cond_0
    const p1, 0xbb80

    goto :goto_0

    :cond_1
    const p1, 0xac44

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/daaw/ar0;->a:Ljava/lang/String;

    const-string v3, "2.0"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz p1, :cond_4

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_8

    const/16 p1, 0x3e80

    goto :goto_0

    :cond_3
    const/16 p1, 0x5dc0

    goto :goto_0

    :cond_4
    const/16 p1, 0x5622

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/daaw/ar0;->a:Ljava/lang/String;

    const-string v3, "2.5"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    if-eqz p1, :cond_7

    if-eq p1, v2, :cond_6

    if-ne p1, v1, :cond_8

    const/16 p1, 0x1f40

    goto :goto_0

    :cond_6
    const/16 p1, 0x2ee0

    goto :goto_0

    :cond_7
    const/16 p1, 0x2b11

    goto :goto_0

    :cond_8
    new-instance p1, Lcom/daaw/xg0;

    const-string v0, "Invalid sample rate in frame header"

    invoke-direct {p1, v0}, Lcom/daaw/xg0;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public final x(I)V
    .locals 1

    if-eqz p1, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const-string p1, "1.0"

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/daaw/xg0;

    const-string v0, "Invalid mpeg audio version in frame header"

    invoke-direct {p1, v0}, Lcom/daaw/xg0;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const-string p1, "2.0"

    goto :goto_0

    :cond_2
    const-string p1, "2.5"

    :goto_0
    iput-object p1, p0, Lcom/daaw/ar0;->a:Ljava/lang/String;

    return-void
.end method
