.class public final Lcom/daaw/fd2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/j09;


# static fields
.field public static final l:Lcom/daaw/q09;


# instance fields
.field public final a:Lcom/daaw/cr5;

.field public final b:Landroid/util/SparseArray;

.field public final c:Lcom/daaw/ik5;

.field public final d:Lcom/daaw/vc2;

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:J

.field public i:Lcom/daaw/uc2;

.field public j:Lcom/daaw/m09;

.field public k:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/wc2;->b:Lcom/daaw/wc2;

    sput-object v0, Lcom/daaw/fd2;->l:Lcom/daaw/q09;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    new-instance v0, Lcom/daaw/cr5;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/cr5;-><init>(J)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/fd2;->a:Lcom/daaw/cr5;

    new-instance v0, Lcom/daaw/ik5;

    const/16 v1, 0x1000

    invoke-direct {v0, v1}, Lcom/daaw/ik5;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/fd2;->c:Lcom/daaw/ik5;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/daaw/fd2;->b:Landroid/util/SparseArray;

    new-instance v0, Lcom/daaw/vc2;

    invoke-direct {v0}, Lcom/daaw/vc2;-><init>()V

    iput-object v0, p0, Lcom/daaw/fd2;->d:Lcom/daaw/vc2;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/k09;)Z
    .locals 9

    const/16 v0, 0xe

    new-array v1, v0, [B

    check-cast p1, Lcom/daaw/rz8;

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, v0, v2}, Lcom/daaw/rz8;->h([BIIZ)Z

    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    const/4 v3, 0x1

    aget-byte v4, v1, v3

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x10

    or-int/2addr v0, v4

    const/4 v4, 0x2

    aget-byte v5, v1, v4

    and-int/lit16 v5, v5, 0xff

    const/16 v6, 0x8

    shl-int/2addr v5, v6

    or-int/2addr v0, v5

    const/4 v5, 0x3

    aget-byte v7, v1, v5

    and-int/lit16 v7, v7, 0xff

    or-int/2addr v0, v7

    const/16 v7, 0x1ba

    if-eq v0, v7, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x4

    aget-byte v7, v1, v0

    and-int/lit16 v7, v7, 0xc4

    const/16 v8, 0x44

    if-eq v7, v8, :cond_1

    return v2

    :cond_1
    const/4 v7, 0x6

    aget-byte v7, v1, v7

    and-int/2addr v7, v0

    if-eq v7, v0, :cond_2

    return v2

    :cond_2
    aget-byte v7, v1, v6

    and-int/2addr v7, v0

    if-eq v7, v0, :cond_3

    return v2

    :cond_3
    const/16 v0, 0x9

    aget-byte v0, v1, v0

    and-int/2addr v0, v3

    if-eq v0, v3, :cond_4

    return v2

    :cond_4
    const/16 v0, 0xc

    aget-byte v0, v1, v0

    and-int/2addr v0, v5

    if-eq v0, v5, :cond_5

    return v2

    :cond_5
    const/16 v0, 0xd

    aget-byte v0, v1, v0

    and-int/lit8 v0, v0, 0x7

    invoke-virtual {p1, v0, v2}, Lcom/daaw/rz8;->k(IZ)Z

    invoke-virtual {p1, v1, v2, v5, v2}, Lcom/daaw/rz8;->h([BIIZ)Z

    aget-byte p1, v1, v2

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x10

    aget-byte v0, v1, v3

    and-int/lit16 v0, v0, 0xff

    shl-int/2addr v0, v6

    or-int/2addr p1, v0

    aget-byte v0, v1, v4

    and-int/lit16 v0, v0, 0xff

    or-int/2addr p1, v0

    if-ne p1, v3, :cond_6

    return v3

    :cond_6
    return v2
.end method

.method public final c(Lcom/daaw/m09;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/fd2;->j:Lcom/daaw/m09;

    return-void
.end method

.method public final d(Lcom/daaw/k09;Lcom/daaw/f42;)I
    .locals 13

    iget-object v0, p0, Lcom/daaw/fd2;->j:Lcom/daaw/m09;

    invoke-static {v0}, Lcom/daaw/uo4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lcom/daaw/k09;->zzd()J

    move-result-wide v7

    const-wide/16 v9, -0x1

    cmp-long v0, v7, v9

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/fd2;->d:Lcom/daaw/vc2;

    invoke-virtual {v0}, Lcom/daaw/vc2;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/daaw/vc2;->a(Lcom/daaw/k09;Lcom/daaw/f42;)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/daaw/fd2;->k:Z

    const/4 v11, 0x1

    if-nez v0, :cond_3

    iput-boolean v11, p0, Lcom/daaw/fd2;->k:Z

    iget-object v0, p0, Lcom/daaw/fd2;->d:Lcom/daaw/vc2;

    invoke-virtual {v0}, Lcom/daaw/vc2;->b()J

    move-result-wide v1

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v1, v3

    if-eqz v5, :cond_2

    new-instance v12, Lcom/daaw/uc2;

    invoke-virtual {v0}, Lcom/daaw/vc2;->d()Lcom/daaw/cr5;

    move-result-object v2

    invoke-virtual {v0}, Lcom/daaw/vc2;->b()J

    move-result-wide v3

    move-object v1, v12

    move-wide v5, v7

    invoke-direct/range {v1 .. v6}, Lcom/daaw/uc2;-><init>(Lcom/daaw/cr5;JJ)V

    iput-object v12, p0, Lcom/daaw/fd2;->i:Lcom/daaw/uc2;

    iget-object v0, p0, Lcom/daaw/fd2;->j:Lcom/daaw/m09;

    invoke-virtual {v12}, Lcom/daaw/nz8;->b()Lcom/daaw/i42;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/m09;->i(Lcom/daaw/i42;)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/daaw/fd2;->j:Lcom/daaw/m09;

    new-instance v2, Lcom/daaw/h42;

    invoke-virtual {v0}, Lcom/daaw/vc2;->b()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/daaw/h42;-><init>(JJ)V

    invoke-interface {v1, v2}, Lcom/daaw/m09;->i(Lcom/daaw/i42;)V

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/daaw/fd2;->i:Lcom/daaw/uc2;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/daaw/nz8;->e()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v0, p1, p2}, Lcom/daaw/nz8;->a(Lcom/daaw/k09;Lcom/daaw/f42;)I

    move-result p1

    return p1

    :cond_5
    :goto_2
    invoke-interface {p1}, Lcom/daaw/k09;->zzj()V

    cmp-long p2, v7, v9

    if-eqz p2, :cond_6

    invoke-interface {p1}, Lcom/daaw/k09;->zze()J

    move-result-wide v0

    sub-long/2addr v7, v0

    goto :goto_3

    :cond_6
    move-wide v7, v9

    :goto_3
    const/4 p2, -0x1

    cmp-long v0, v7, v9

    if-eqz v0, :cond_8

    const-wide/16 v0, 0x4

    cmp-long v2, v7, v0

    if-ltz v2, :cond_7

    goto :goto_4

    :cond_7
    return p2

    :cond_8
    :goto_4
    iget-object v0, p0, Lcom/daaw/fd2;->c:Lcom/daaw/ik5;

    invoke-virtual {v0}, Lcom/daaw/ik5;->h()[B

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1, v11}, Lcom/daaw/k09;->h([BIIZ)Z

    move-result v0

    if-nez v0, :cond_9

    return p2

    :cond_9
    iget-object v0, p0, Lcom/daaw/fd2;->c:Lcom/daaw/ik5;

    invoke-virtual {v0, v2}, Lcom/daaw/ik5;->f(I)V

    iget-object v0, p0, Lcom/daaw/fd2;->c:Lcom/daaw/ik5;

    invoke-virtual {v0}, Lcom/daaw/ik5;->m()I

    move-result v0

    const/16 v1, 0x1b9

    if-ne v0, v1, :cond_a

    return p2

    :cond_a
    const/16 p2, 0x1ba

    if-ne v0, p2, :cond_b

    iget-object p2, p0, Lcom/daaw/fd2;->c:Lcom/daaw/ik5;

    invoke-virtual {p2}, Lcom/daaw/ik5;->h()[B

    move-result-object p2

    check-cast p1, Lcom/daaw/rz8;

    const/16 v0, 0xa

    invoke-virtual {p1, p2, v2, v0, v2}, Lcom/daaw/rz8;->h([BIIZ)Z

    iget-object p2, p0, Lcom/daaw/fd2;->c:Lcom/daaw/ik5;

    const/16 v0, 0x9

    invoke-virtual {p2, v0}, Lcom/daaw/ik5;->f(I)V

    iget-object p2, p0, Lcom/daaw/fd2;->c:Lcom/daaw/ik5;

    invoke-virtual {p2}, Lcom/daaw/ik5;->s()I

    move-result p2

    and-int/lit8 p2, p2, 0x7

    add-int/lit8 p2, p2, 0xe

    invoke-virtual {p1, p2, v2}, Lcom/daaw/rz8;->l(IZ)Z

    return v2

    :cond_b
    const/16 p2, 0x1bb

    const/4 v1, 0x2

    const/4 v3, 0x6

    if-ne v0, p2, :cond_c

    iget-object p2, p0, Lcom/daaw/fd2;->c:Lcom/daaw/ik5;

    invoke-virtual {p2}, Lcom/daaw/ik5;->h()[B

    move-result-object p2

    check-cast p1, Lcom/daaw/rz8;

    invoke-virtual {p1, p2, v2, v1, v2}, Lcom/daaw/rz8;->h([BIIZ)Z

    iget-object p2, p0, Lcom/daaw/fd2;->c:Lcom/daaw/ik5;

    invoke-virtual {p2, v2}, Lcom/daaw/ik5;->f(I)V

    iget-object p2, p0, Lcom/daaw/fd2;->c:Lcom/daaw/ik5;

    invoke-virtual {p2}, Lcom/daaw/ik5;->w()I

    move-result p2

    add-int/2addr p2, v3

    invoke-virtual {p1, p2, v2}, Lcom/daaw/rz8;->l(IZ)Z

    return v2

    :cond_c
    shr-int/lit8 p2, v0, 0x8

    if-eq p2, v11, :cond_d

    check-cast p1, Lcom/daaw/rz8;

    invoke-virtual {p1, v11, v2}, Lcom/daaw/rz8;->l(IZ)Z

    return v2

    :cond_d
    and-int/lit16 p2, v0, 0xff

    iget-object v0, p0, Lcom/daaw/fd2;->b:Landroid/util/SparseArray;

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/ed2;

    iget-boolean v4, p0, Lcom/daaw/fd2;->e:Z

    if-nez v4, :cond_13

    if-nez v0, :cond_11

    const/16 v4, 0xbd

    const/4 v5, 0x0

    if-ne p2, v4, :cond_e

    new-instance v4, Lcom/daaw/lb2;

    invoke-direct {v4, v5}, Lcom/daaw/lb2;-><init>(Ljava/lang/String;)V

    :goto_5
    iput-boolean v11, p0, Lcom/daaw/fd2;->f:Z

    :goto_6
    invoke-interface {p1}, Lcom/daaw/k09;->zzf()J

    move-result-wide v5

    iput-wide v5, p0, Lcom/daaw/fd2;->h:J

    move-object v5, v4

    goto :goto_7

    :cond_e
    and-int/lit16 v4, p2, 0xe0

    const/16 v6, 0xc0

    if-ne v4, v6, :cond_f

    new-instance v4, Lcom/daaw/oc2;

    invoke-direct {v4, v5}, Lcom/daaw/oc2;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_f
    and-int/lit16 v4, p2, 0xf0

    const/16 v6, 0xe0

    if-ne v4, v6, :cond_10

    new-instance v4, Lcom/daaw/cc2;

    invoke-direct {v4, v5}, Lcom/daaw/cc2;-><init>(Lcom/daaw/wd2;)V

    iput-boolean v11, p0, Lcom/daaw/fd2;->g:Z

    goto :goto_6

    :cond_10
    :goto_7
    if-eqz v5, :cond_11

    new-instance v0, Lcom/daaw/td2;

    const/high16 v4, -0x80000000

    const/16 v6, 0x100

    invoke-direct {v0, v4, p2, v6}, Lcom/daaw/td2;-><init>(III)V

    iget-object v4, p0, Lcom/daaw/fd2;->j:Lcom/daaw/m09;

    invoke-interface {v5, v4, v0}, Lcom/daaw/ac2;->b(Lcom/daaw/m09;Lcom/daaw/td2;)V

    new-instance v0, Lcom/daaw/ed2;

    iget-object v4, p0, Lcom/daaw/fd2;->a:Lcom/daaw/cr5;

    invoke-direct {v0, v5, v4}, Lcom/daaw/ed2;-><init>(Lcom/daaw/ac2;Lcom/daaw/cr5;)V

    iget-object v4, p0, Lcom/daaw/fd2;->b:Landroid/util/SparseArray;

    invoke-virtual {v4, p2, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_11
    iget-boolean p2, p0, Lcom/daaw/fd2;->f:Z

    const-wide/32 v4, 0x100000

    if-eqz p2, :cond_12

    iget-boolean p2, p0, Lcom/daaw/fd2;->g:Z

    if-eqz p2, :cond_12

    iget-wide v4, p0, Lcom/daaw/fd2;->h:J

    const-wide/16 v6, 0x2000

    add-long/2addr v4, v6

    :cond_12
    invoke-interface {p1}, Lcom/daaw/k09;->zzf()J

    move-result-wide v6

    cmp-long p2, v6, v4

    if-lez p2, :cond_13

    iput-boolean v11, p0, Lcom/daaw/fd2;->e:Z

    iget-object p2, p0, Lcom/daaw/fd2;->j:Lcom/daaw/m09;

    invoke-interface {p2}, Lcom/daaw/m09;->zzC()V

    :cond_13
    iget-object p2, p0, Lcom/daaw/fd2;->c:Lcom/daaw/ik5;

    invoke-virtual {p2}, Lcom/daaw/ik5;->h()[B

    move-result-object p2

    check-cast p1, Lcom/daaw/rz8;

    invoke-virtual {p1, p2, v2, v1, v2}, Lcom/daaw/rz8;->h([BIIZ)Z

    iget-object p2, p0, Lcom/daaw/fd2;->c:Lcom/daaw/ik5;

    invoke-virtual {p2, v2}, Lcom/daaw/ik5;->f(I)V

    iget-object p2, p0, Lcom/daaw/fd2;->c:Lcom/daaw/ik5;

    invoke-virtual {p2}, Lcom/daaw/ik5;->w()I

    move-result p2

    add-int/2addr p2, v3

    if-nez v0, :cond_14

    invoke-virtual {p1, p2, v2}, Lcom/daaw/rz8;->l(IZ)Z

    goto :goto_8

    :cond_14
    iget-object v1, p0, Lcom/daaw/fd2;->c:Lcom/daaw/ik5;

    invoke-virtual {v1, p2}, Lcom/daaw/ik5;->c(I)V

    iget-object v1, p0, Lcom/daaw/fd2;->c:Lcom/daaw/ik5;

    invoke-virtual {v1}, Lcom/daaw/ik5;->h()[B

    move-result-object v1

    invoke-virtual {p1, v1, v2, p2, v2}, Lcom/daaw/rz8;->e([BIIZ)Z

    iget-object p1, p0, Lcom/daaw/fd2;->c:Lcom/daaw/ik5;

    invoke-virtual {p1, v3}, Lcom/daaw/ik5;->f(I)V

    iget-object p1, p0, Lcom/daaw/fd2;->c:Lcom/daaw/ik5;

    invoke-virtual {v0, p1}, Lcom/daaw/ed2;->a(Lcom/daaw/ik5;)V

    iget-object p1, p0, Lcom/daaw/fd2;->c:Lcom/daaw/ik5;

    invoke-virtual {p1}, Lcom/daaw/ik5;->j()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/ik5;->e(I)V

    :goto_8
    return v2
.end method

.method public final f(JJ)V
    .locals 4

    iget-object p1, p0, Lcom/daaw/fd2;->a:Lcom/daaw/cr5;

    invoke-virtual {p1}, Lcom/daaw/cr5;->e()J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v0, v2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/daaw/cr5;->c()J

    move-result-wide v0

    cmp-long p2, v0, v2

    if-eqz p2, :cond_1

    const-wide/16 v2, 0x0

    cmp-long p2, v0, v2

    if-eqz p2, :cond_1

    cmp-long p2, v0, p3

    if-eqz p2, :cond_1

    :cond_0
    invoke-virtual {p1, p3, p4}, Lcom/daaw/cr5;->f(J)V

    :cond_1
    iget-object p1, p0, Lcom/daaw/fd2;->i:Lcom/daaw/uc2;

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p1, p3, p4}, Lcom/daaw/nz8;->d(J)V

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/daaw/fd2;->b:Landroid/util/SparseArray;

    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result p1

    if-ge p2, p1, :cond_3

    iget-object p1, p0, Lcom/daaw/fd2;->b:Landroid/util/SparseArray;

    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ed2;

    invoke-virtual {p1}, Lcom/daaw/ed2;->b()V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
