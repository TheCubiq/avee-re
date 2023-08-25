.class public final Lcom/daaw/fc2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ac2;


# static fields
.field public static final l:[F


# instance fields
.field public final a:Lcom/daaw/wd2;

.field public final b:Lcom/daaw/ik5;

.field public final c:[Z

.field public final d:Lcom/daaw/dc2;

.field public final e:Lcom/daaw/pc2;

.field public f:Lcom/daaw/ec2;

.field public g:J

.field public h:Ljava/lang/String;

.field public i:Lcom/daaw/m42;

.field public j:Z

.field public k:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    sput-object v0, Lcom/daaw/fc2;->l:[F

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(Lcom/daaw/wd2;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fc2;->a:Lcom/daaw/wd2;

    const/4 p1, 0x4

    new-array p1, p1, [Z

    iput-object p1, p0, Lcom/daaw/fc2;->c:[Z

    new-instance p1, Lcom/daaw/dc2;

    const/16 v0, 0x80

    invoke-direct {p1, v0}, Lcom/daaw/dc2;-><init>(I)V

    iput-object p1, p0, Lcom/daaw/fc2;->d:Lcom/daaw/dc2;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, p0, Lcom/daaw/fc2;->k:J

    new-instance p1, Lcom/daaw/pc2;

    const/16 v1, 0xb2

    invoke-direct {p1, v1, v0}, Lcom/daaw/pc2;-><init>(II)V

    iput-object p1, p0, Lcom/daaw/fc2;->e:Lcom/daaw/pc2;

    new-instance p1, Lcom/daaw/ik5;

    invoke-direct {p1}, Lcom/daaw/ik5;-><init>()V

    iput-object p1, p0, Lcom/daaw/fc2;->b:Lcom/daaw/ik5;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/ik5;)V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/daaw/fc2;->f:Lcom/daaw/ec2;

    invoke-static {v1}, Lcom/daaw/uo4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, Lcom/daaw/fc2;->i:Lcom/daaw/m42;

    invoke-static {v1}, Lcom/daaw/uo4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->k()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->l()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->h()[B

    move-result-object v3

    iget-wide v4, v0, Lcom/daaw/fc2;->g:J

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->i()I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v4, v6

    iput-wide v4, v0, Lcom/daaw/fc2;->g:J

    iget-object v4, v0, Lcom/daaw/fc2;->i:Lcom/daaw/m42;

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->i()I

    move-result v5

    move-object/from16 v6, p1

    invoke-interface {v4, v6, v5}, Lcom/daaw/m42;->c(Lcom/daaw/ik5;I)V

    :goto_0
    iget-object v4, v0, Lcom/daaw/fc2;->c:[Z

    invoke-static {v3, v1, v2, v4}, Lcom/daaw/c42;->a([BII[Z)I

    move-result v4

    if-ne v4, v2, :cond_1

    iget-boolean v4, v0, Lcom/daaw/fc2;->j:Z

    if-nez v4, :cond_0

    iget-object v4, v0, Lcom/daaw/fc2;->d:Lcom/daaw/dc2;

    invoke-virtual {v4, v3, v1, v2}, Lcom/daaw/dc2;->a([BII)V

    :cond_0
    iget-object v4, v0, Lcom/daaw/fc2;->f:Lcom/daaw/ec2;

    invoke-virtual {v4, v3, v1, v2}, Lcom/daaw/ec2;->a([BII)V

    iget-object v4, v0, Lcom/daaw/fc2;->e:Lcom/daaw/pc2;

    invoke-virtual {v4, v3, v1, v2}, Lcom/daaw/pc2;->a([BII)V

    return-void

    :cond_1
    add-int/lit8 v5, v4, 0x3

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->h()[B

    move-result-object v7

    aget-byte v7, v7, v5

    and-int/lit16 v7, v7, 0xff

    sub-int v8, v4, v1

    iget-boolean v9, v0, Lcom/daaw/fc2;->j:Z

    if-nez v9, :cond_d

    if-lez v8, :cond_2

    iget-object v9, v0, Lcom/daaw/fc2;->d:Lcom/daaw/dc2;

    invoke-virtual {v9, v3, v1, v4}, Lcom/daaw/dc2;->a([BII)V

    :cond_2
    if-gez v8, :cond_3

    neg-int v9, v8

    goto :goto_1

    :cond_3
    const/4 v9, 0x0

    :goto_1
    iget-object v12, v0, Lcom/daaw/fc2;->d:Lcom/daaw/dc2;

    invoke-virtual {v12, v7, v9}, Lcom/daaw/dc2;->c(II)Z

    move-result v9

    if-eqz v9, :cond_d

    iget-object v9, v0, Lcom/daaw/fc2;->i:Lcom/daaw/m42;

    iget-object v12, v0, Lcom/daaw/fc2;->d:Lcom/daaw/dc2;

    iget v13, v12, Lcom/daaw/dc2;->d:I

    iget-object v14, v0, Lcom/daaw/fc2;->h:Ljava/lang/String;

    invoke-static {v14}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v15, v12, Lcom/daaw/dc2;->e:[B

    iget v12, v12, Lcom/daaw/dc2;->c:I

    invoke-static {v15, v12}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v12

    new-instance v15, Lcom/daaw/cj5;

    array-length v10, v12

    invoke-direct {v15, v12, v10}, Lcom/daaw/cj5;-><init>([BI)V

    invoke-virtual {v15, v13}, Lcom/daaw/cj5;->k(I)V

    const/4 v10, 0x4

    invoke-virtual {v15, v10}, Lcom/daaw/cj5;->k(I)V

    invoke-virtual {v15}, Lcom/daaw/cj5;->i()V

    const/16 v13, 0x8

    invoke-virtual {v15, v13}, Lcom/daaw/cj5;->j(I)V

    invoke-virtual {v15}, Lcom/daaw/cj5;->l()Z

    move-result v16

    const/4 v11, 0x3

    if-eqz v16, :cond_4

    invoke-virtual {v15, v10}, Lcom/daaw/cj5;->j(I)V

    invoke-virtual {v15, v11}, Lcom/daaw/cj5;->j(I)V

    :cond_4
    invoke-virtual {v15, v10}, Lcom/daaw/cj5;->c(I)I

    move-result v10

    const/high16 v16, 0x3f800000    # 1.0f

    const-string v11, "Invalid aspect ratio"

    const-string v13, "H263Reader"

    move/from16 v17, v5

    const/16 v5, 0xf

    if-ne v10, v5, :cond_6

    const/16 v5, 0x8

    invoke-virtual {v15, v5}, Lcom/daaw/cj5;->c(I)I

    move-result v10

    invoke-virtual {v15, v5}, Lcom/daaw/cj5;->c(I)I

    move-result v5

    if-nez v5, :cond_5

    goto :goto_3

    :cond_5
    int-to-float v10, v10

    int-to-float v5, v5

    div-float v16, v10, v5

    goto :goto_2

    :cond_6
    const/4 v5, 0x7

    if-ge v10, v5, :cond_7

    sget-object v5, Lcom/daaw/fc2;->l:[F

    aget v16, v5, v10

    :goto_2
    move/from16 v5, v16

    goto :goto_4

    :cond_7
    :goto_3
    invoke-static {v13, v11}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/high16 v5, 0x3f800000    # 1.0f

    :goto_4
    invoke-virtual {v15}, Lcom/daaw/cj5;->l()Z

    move-result v10

    const/4 v11, 0x2

    if-eqz v10, :cond_8

    invoke-virtual {v15, v11}, Lcom/daaw/cj5;->j(I)V

    const/4 v10, 0x1

    invoke-virtual {v15, v10}, Lcom/daaw/cj5;->j(I)V

    invoke-virtual {v15}, Lcom/daaw/cj5;->l()Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0xf

    invoke-virtual {v15, v10}, Lcom/daaw/cj5;->j(I)V

    invoke-virtual {v15}, Lcom/daaw/cj5;->i()V

    invoke-virtual {v15, v10}, Lcom/daaw/cj5;->j(I)V

    invoke-virtual {v15}, Lcom/daaw/cj5;->i()V

    invoke-virtual {v15, v10}, Lcom/daaw/cj5;->j(I)V

    invoke-virtual {v15}, Lcom/daaw/cj5;->i()V

    const/4 v11, 0x3

    invoke-virtual {v15, v11}, Lcom/daaw/cj5;->j(I)V

    const/16 v11, 0xb

    invoke-virtual {v15, v11}, Lcom/daaw/cj5;->j(I)V

    invoke-virtual {v15}, Lcom/daaw/cj5;->i()V

    invoke-virtual {v15, v10}, Lcom/daaw/cj5;->j(I)V

    invoke-virtual {v15}, Lcom/daaw/cj5;->i()V

    :cond_8
    const/4 v10, 0x2

    invoke-virtual {v15, v10}, Lcom/daaw/cj5;->c(I)I

    move-result v10

    if-eqz v10, :cond_9

    const-string v10, "Unhandled video object layer shape"

    invoke-static {v13, v10}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_9
    invoke-virtual {v15}, Lcom/daaw/cj5;->i()V

    const/16 v10, 0x10

    invoke-virtual {v15, v10}, Lcom/daaw/cj5;->c(I)I

    move-result v10

    invoke-virtual {v15}, Lcom/daaw/cj5;->i()V

    invoke-virtual {v15}, Lcom/daaw/cj5;->l()Z

    move-result v11

    if-eqz v11, :cond_c

    if-nez v10, :cond_a

    const-string v10, "Invalid vop_increment_time_resolution"

    invoke-static {v13, v10}, Lcom/daaw/s95;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    :cond_a
    add-int/lit8 v10, v10, -0x1

    const/4 v11, 0x0

    :goto_5
    if-lez v10, :cond_b

    add-int/lit8 v11, v11, 0x1

    shr-int/lit8 v10, v10, 0x1

    goto :goto_5

    :cond_b
    invoke-virtual {v15, v11}, Lcom/daaw/cj5;->j(I)V

    :cond_c
    :goto_6
    invoke-virtual {v15}, Lcom/daaw/cj5;->i()V

    const/16 v10, 0xd

    invoke-virtual {v15, v10}, Lcom/daaw/cj5;->c(I)I

    move-result v11

    invoke-virtual {v15}, Lcom/daaw/cj5;->i()V

    invoke-virtual {v15, v10}, Lcom/daaw/cj5;->c(I)I

    move-result v10

    invoke-virtual {v15}, Lcom/daaw/cj5;->i()V

    invoke-virtual {v15}, Lcom/daaw/cj5;->i()V

    new-instance v13, Lcom/daaw/b72;

    invoke-direct {v13}, Lcom/daaw/b72;-><init>()V

    invoke-virtual {v13, v14}, Lcom/daaw/b72;->h(Ljava/lang/String;)Lcom/daaw/b72;

    const-string v14, "video/mp4v-es"

    invoke-virtual {v13, v14}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v13, v11}, Lcom/daaw/b72;->x(I)Lcom/daaw/b72;

    invoke-virtual {v13, v10}, Lcom/daaw/b72;->f(I)Lcom/daaw/b72;

    invoke-virtual {v13, v5}, Lcom/daaw/b72;->p(F)Lcom/daaw/b72;

    invoke-static {v12}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v13, v5}, Lcom/daaw/b72;->i(Ljava/util/List;)Lcom/daaw/b72;

    invoke-virtual {v13}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object v5

    invoke-interface {v9, v5}, Lcom/daaw/m42;->f(Lcom/daaw/f92;)V

    const/4 v5, 0x1

    iput-boolean v5, v0, Lcom/daaw/fc2;->j:Z

    goto :goto_7

    :cond_d
    move/from16 v17, v5

    :goto_7
    iget-object v5, v0, Lcom/daaw/fc2;->f:Lcom/daaw/ec2;

    invoke-virtual {v5, v3, v1, v4}, Lcom/daaw/ec2;->a([BII)V

    iget-object v5, v0, Lcom/daaw/fc2;->e:Lcom/daaw/pc2;

    if-lez v8, :cond_e

    invoke-virtual {v5, v3, v1, v4}, Lcom/daaw/pc2;->a([BII)V

    const/4 v10, 0x0

    goto :goto_8

    :cond_e
    neg-int v10, v8

    :goto_8
    iget-object v1, v0, Lcom/daaw/fc2;->e:Lcom/daaw/pc2;

    invoke-virtual {v1, v10}, Lcom/daaw/pc2;->d(I)Z

    move-result v1

    if-eqz v1, :cond_f

    iget-object v1, v0, Lcom/daaw/fc2;->e:Lcom/daaw/pc2;

    iget-object v5, v1, Lcom/daaw/pc2;->d:[B

    iget v1, v1, Lcom/daaw/pc2;->e:I

    invoke-static {v5, v1}, Lcom/daaw/c42;->b([BI)I

    move-result v1

    iget-object v5, v0, Lcom/daaw/fc2;->b:Lcom/daaw/ik5;

    sget v8, Lcom/daaw/it5;->a:I

    iget-object v8, v0, Lcom/daaw/fc2;->e:Lcom/daaw/pc2;

    iget-object v8, v8, Lcom/daaw/pc2;->d:[B

    invoke-virtual {v5, v8, v1}, Lcom/daaw/ik5;->d([BI)V

    iget-object v1, v0, Lcom/daaw/fc2;->a:Lcom/daaw/wd2;

    iget-wide v8, v0, Lcom/daaw/fc2;->k:J

    iget-object v5, v0, Lcom/daaw/fc2;->b:Lcom/daaw/ik5;

    invoke-virtual {v1, v8, v9, v5}, Lcom/daaw/wd2;->a(JLcom/daaw/ik5;)V

    :cond_f
    const/16 v1, 0xb2

    if-ne v7, v1, :cond_11

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/ik5;->h()[B

    move-result-object v5

    add-int/lit8 v7, v4, 0x2

    aget-byte v5, v5, v7

    const/4 v7, 0x1

    if-ne v5, v7, :cond_10

    iget-object v5, v0, Lcom/daaw/fc2;->e:Lcom/daaw/pc2;

    invoke-virtual {v5, v1}, Lcom/daaw/pc2;->c(I)V

    :cond_10
    const/16 v7, 0xb2

    :cond_11
    sub-int v1, v2, v4

    iget-wide v4, v0, Lcom/daaw/fc2;->g:J

    iget-object v8, v0, Lcom/daaw/fc2;->f:Lcom/daaw/ec2;

    int-to-long v9, v1

    sub-long/2addr v4, v9

    iget-boolean v9, v0, Lcom/daaw/fc2;->j:Z

    invoke-virtual {v8, v4, v5, v1, v9}, Lcom/daaw/ec2;->b(JIZ)V

    iget-object v1, v0, Lcom/daaw/fc2;->f:Lcom/daaw/ec2;

    iget-wide v4, v0, Lcom/daaw/fc2;->k:J

    invoke-virtual {v1, v7, v4, v5}, Lcom/daaw/ec2;->c(IJ)V

    move/from16 v1, v17

    goto/16 :goto_0
.end method

.method public final b(Lcom/daaw/m09;Lcom/daaw/td2;)V
    .locals 2

    invoke-virtual {p2}, Lcom/daaw/td2;->c()V

    invoke-virtual {p2}, Lcom/daaw/td2;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/fc2;->h:Ljava/lang/String;

    invoke-virtual {p2}, Lcom/daaw/td2;->a()I

    move-result v0

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Lcom/daaw/m09;->n(II)Lcom/daaw/m42;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/fc2;->i:Lcom/daaw/m42;

    new-instance v1, Lcom/daaw/ec2;

    invoke-direct {v1, v0}, Lcom/daaw/ec2;-><init>(Lcom/daaw/m42;)V

    iput-object v1, p0, Lcom/daaw/fc2;->f:Lcom/daaw/ec2;

    iget-object v0, p0, Lcom/daaw/fc2;->a:Lcom/daaw/wd2;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/wd2;->b(Lcom/daaw/m09;Lcom/daaw/td2;)V

    return-void
.end method

.method public final c(JI)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, p1, v0

    if-eqz p3, :cond_0

    iput-wide p1, p0, Lcom/daaw/fc2;->k:J

    :cond_0
    return-void
.end method

.method public final zzc()V
    .locals 0

    return-void
.end method

.method public final zze()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/fc2;->c:[Z

    invoke-static {v0}, Lcom/daaw/c42;->e([Z)V

    iget-object v0, p0, Lcom/daaw/fc2;->d:Lcom/daaw/dc2;

    invoke-virtual {v0}, Lcom/daaw/dc2;->b()V

    iget-object v0, p0, Lcom/daaw/fc2;->f:Lcom/daaw/ec2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/ec2;->d()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/fc2;->e:Lcom/daaw/pc2;

    invoke-virtual {v0}, Lcom/daaw/pc2;->b()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/fc2;->g:J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/daaw/fc2;->k:J

    return-void
.end method
