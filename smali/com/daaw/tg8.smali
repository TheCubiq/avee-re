.class public final Lcom/daaw/tg8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/fb8;


# instance fields
.field public final a:Lcom/daaw/xp4;

.field public final b:Lcom/daaw/d34;

.field public final c:Lcom/daaw/i54;

.field public final d:Lcom/daaw/rg8;

.field public final e:Landroid/util/SparseArray;

.field public f:Lcom/daaw/k65;

.field public g:Lcom/daaw/ty3;

.field public h:Lcom/daaw/vz4;

.field public i:Z


# direct methods
.method public constructor <init>(Lcom/daaw/xp4;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/tg8;->a:Lcom/daaw/xp4;

    new-instance v0, Lcom/daaw/k65;

    invoke-static {}, Lcom/daaw/it5;->e()Landroid/os/Looper;

    move-result-object v1

    sget-object v2, Lcom/daaw/hc8;->a:Lcom/daaw/hc8;

    invoke-direct {v0, v1, p1, v2}, Lcom/daaw/k65;-><init>(Landroid/os/Looper;Lcom/daaw/xp4;Lcom/daaw/e45;)V

    iput-object v0, p0, Lcom/daaw/tg8;->f:Lcom/daaw/k65;

    new-instance p1, Lcom/daaw/d34;

    invoke-direct {p1}, Lcom/daaw/d34;-><init>()V

    iput-object p1, p0, Lcom/daaw/tg8;->b:Lcom/daaw/d34;

    new-instance v0, Lcom/daaw/i54;

    invoke-direct {v0}, Lcom/daaw/i54;-><init>()V

    iput-object v0, p0, Lcom/daaw/tg8;->c:Lcom/daaw/i54;

    new-instance v0, Lcom/daaw/rg8;

    invoke-direct {v0, p1}, Lcom/daaw/rg8;-><init>(Lcom/daaw/d34;)V

    iput-object v0, p0, Lcom/daaw/tg8;->d:Lcom/daaw/rg8;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/daaw/tg8;->e:Landroid/util/SparseArray;

    return-void
.end method

.method public static synthetic Z(Lcom/daaw/tg8;)V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/tg8;->X()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/ae8;

    invoke-direct {v1, v0}, Lcom/daaw/ae8;-><init>(Lcom/daaw/ib8;)V

    const/16 v2, 0x404

    invoke-virtual {p0, v0, v2, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    iget-object p0, p0, Lcom/daaw/tg8;->f:Lcom/daaw/k65;

    invoke-virtual {p0}, Lcom/daaw/k65;->e()V

    return-void
.end method


# virtual methods
.method public final A(Lcom/daaw/ni4;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->X()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/od8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/od8;-><init>(Lcom/daaw/ib8;Lcom/daaw/ni4;)V

    const/4 p1, 0x2

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final B(Lcom/daaw/f53;I)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->X()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/af8;

    invoke-direct {v1, v0, p1, p2}, Lcom/daaw/af8;-><init>(Lcom/daaw/ib8;Lcom/daaw/f53;I)V

    const/4 p1, 0x1

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final C(ZI)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->X()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/se8;

    invoke-direct {v1, v0, p1, p2}, Lcom/daaw/se8;-><init>(Lcom/daaw/ib8;ZI)V

    const/4 p1, 0x5

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final D(Lcom/daaw/nx3;Lcom/daaw/nx3;I)V
    .locals 2

    const/4 v0, 0x1

    if-ne p3, v0, :cond_0

    const/4 p3, 0x0

    iput-boolean p3, p0, Lcom/daaw/tg8;->i:Z

    const/4 p3, 0x1

    :cond_0
    iget-object v0, p0, Lcom/daaw/tg8;->d:Lcom/daaw/rg8;

    iget-object v1, p0, Lcom/daaw/tg8;->g:Lcom/daaw/ty3;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/daaw/rg8;->g(Lcom/daaw/ty3;)V

    invoke-virtual {p0}, Lcom/daaw/tg8;->X()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/id8;

    invoke-direct {v1, v0, p3, p1, p2}, Lcom/daaw/id8;-><init>(Lcom/daaw/ib8;ILcom/daaw/nx3;Lcom/daaw/nx3;)V

    const/16 p1, 0xb

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final E(Lcom/daaw/jn3;)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/daaw/tg8;->g0(Lcom/daaw/jn3;)Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/ke8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/ke8;-><init>(Lcom/daaw/ib8;Lcom/daaw/jn3;)V

    const/16 p1, 0xa

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final F(I)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->X()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/ye8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/ye8;-><init>(Lcom/daaw/ib8;I)V

    const/4 p1, 0x4

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final G(Lcom/daaw/lu3;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->X()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/kd8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/kd8;-><init>(Lcom/daaw/ib8;Lcom/daaw/lu3;)V

    const/16 p1, 0xd

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final H(Lcom/daaw/jn3;)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/daaw/tg8;->g0(Lcom/daaw/jn3;)Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/pf8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/pf8;-><init>(Lcom/daaw/ib8;Lcom/daaw/jn3;)V

    const/16 p1, 0xa

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final I(ZI)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->X()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/rb8;

    invoke-direct {v1, v0, p1, p2}, Lcom/daaw/rb8;-><init>(Lcom/daaw/ib8;ZI)V

    const/4 p1, -0x1

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final J(IJJ)V
    .locals 9

    invoke-virtual {p0}, Lcom/daaw/tg8;->f0()Lcom/daaw/ib8;

    move-result-object v7

    new-instance v8, Lcom/daaw/zb8;

    move-object v0, v8

    move-object v1, v7

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-direct/range {v0 .. v6}, Lcom/daaw/zb8;-><init>(Lcom/daaw/ib8;IJJ)V

    const/16 p1, 0x3f3

    invoke-virtual {p0, v7, p1, v8}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final K(ILcom/daaw/pr8;Lcom/daaw/ar8;Lcom/daaw/lr8;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/tg8;->d0(ILcom/daaw/pr8;)Lcom/daaw/ib8;

    move-result-object p1

    new-instance p2, Lcom/daaw/qe8;

    invoke-direct {p2, p1, p3, p4}, Lcom/daaw/qe8;-><init>(Lcom/daaw/ib8;Lcom/daaw/ar8;Lcom/daaw/lr8;)V

    const/16 p3, 0x3e8

    invoke-virtual {p0, p1, p3, p2}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final L(Lcom/daaw/is8;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->X()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/md8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/md8;-><init>(Lcom/daaw/ib8;Lcom/daaw/is8;)V

    const/16 p1, 0x1d

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final M(Lcom/daaw/l64;I)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/tg8;->d:Lcom/daaw/rg8;

    iget-object v0, p0, Lcom/daaw/tg8;->g:Lcom/daaw/ty3;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lcom/daaw/rg8;->i(Lcom/daaw/ty3;)V

    invoke-virtual {p0}, Lcom/daaw/tg8;->X()Lcom/daaw/ib8;

    move-result-object p1

    new-instance v0, Lcom/daaw/ce8;

    invoke-direct {v0, p1, p2}, Lcom/daaw/ce8;-><init>(Lcom/daaw/ib8;I)V

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final N(ILcom/daaw/pr8;Lcom/daaw/ar8;Lcom/daaw/lr8;Ljava/io/IOException;Z)V
    .locals 6

    invoke-virtual {p0, p1, p2}, Lcom/daaw/tg8;->d0(ILcom/daaw/pr8;)Lcom/daaw/ib8;

    move-result-object p1

    new-instance p2, Lcom/daaw/yd8;

    move-object v0, p2

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/daaw/yd8;-><init>(Lcom/daaw/ib8;Lcom/daaw/ar8;Lcom/daaw/lr8;Ljava/io/IOException;Z)V

    const/16 p3, 0x3eb

    invoke-virtual {p0, p1, p3, p2}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final O(Ljava/lang/String;JJ)V
    .locals 9

    invoke-virtual {p0}, Lcom/daaw/tg8;->f0()Lcom/daaw/ib8;

    move-result-object v7

    new-instance v8, Lcom/daaw/me8;

    move-object v0, v8

    move-object v1, v7

    move-object v2, p1

    move-wide v3, p4

    move-wide v5, p2

    invoke-direct/range {v0 .. v6}, Lcom/daaw/me8;-><init>(Lcom/daaw/ib8;Ljava/lang/String;JJ)V

    const/16 p1, 0x3f0

    invoke-virtual {p0, v7, p1, v8}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final P(IJJ)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/tg8;->d:Lcom/daaw/rg8;

    invoke-virtual {v0}, Lcom/daaw/rg8;->c()Lcom/daaw/pr8;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/tg8;->c0(Lcom/daaw/pr8;)Lcom/daaw/ib8;

    move-result-object v0

    new-instance v8, Lcom/daaw/bd8;

    move-object v1, v8

    move-object v2, v0

    move v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lcom/daaw/bd8;-><init>(Lcom/daaw/ib8;IJJ)V

    const/16 p1, 0x3ee

    invoke-virtual {p0, v0, p1, v8}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final Q(IZ)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->X()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/sd8;

    invoke-direct {v1, v0, p1, p2}, Lcom/daaw/sd8;-><init>(Lcom/daaw/ib8;IZ)V

    const/16 p1, 0x1e

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final R(Lcom/daaw/ty3;Landroid/os/Looper;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/tg8;->g:Lcom/daaw/ty3;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/tg8;->d:Lcom/daaw/rg8;

    invoke-static {v0}, Lcom/daaw/rg8;->f(Lcom/daaw/rg8;)Lcom/daaw/y17;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    invoke-static {v1}, Lcom/daaw/uo4;->f(Z)V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/tg8;->g:Lcom/daaw/ty3;

    iget-object v0, p0, Lcom/daaw/tg8;->a:Lcom/daaw/xp4;

    const/4 v1, 0x0

    invoke-interface {v0, p2, v1}, Lcom/daaw/xp4;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lcom/daaw/vz4;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/tg8;->h:Lcom/daaw/vz4;

    iget-object v0, p0, Lcom/daaw/tg8;->f:Lcom/daaw/k65;

    new-instance v1, Lcom/daaw/ud8;

    invoke-direct {v1, p0, p1}, Lcom/daaw/ud8;-><init>(Lcom/daaw/tg8;Lcom/daaw/ty3;)V

    invoke-virtual {v0, p2, v1}, Lcom/daaw/k65;->a(Landroid/os/Looper;Lcom/daaw/e45;)Lcom/daaw/k65;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/tg8;->f:Lcom/daaw/k65;

    return-void
.end method

.method public final S(Lcom/daaw/f92;Lcom/daaw/tm7;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->f0()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/tb8;

    invoke-direct {v1, v0, p1, p2}, Lcom/daaw/tb8;-><init>(Lcom/daaw/ib8;Lcom/daaw/f92;Lcom/daaw/tm7;)V

    const/16 p1, 0x3f9

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final T(J)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->f0()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/zf8;

    invoke-direct {v1, v0, p1, p2}, Lcom/daaw/zf8;-><init>(Lcom/daaw/ib8;J)V

    const/16 p1, 0x3f2

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final U(Ljava/lang/Object;J)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->f0()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/hg8;

    invoke-direct {v1, v0, p1, p2, p3}, Lcom/daaw/hg8;-><init>(Lcom/daaw/ib8;Ljava/lang/Object;J)V

    const/16 p1, 0x1a

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final V(ILcom/daaw/pr8;Lcom/daaw/ar8;Lcom/daaw/lr8;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/tg8;->d0(ILcom/daaw/pr8;)Lcom/daaw/ib8;

    move-result-object p1

    new-instance p2, Lcom/daaw/nf8;

    invoke-direct {p2, p1, p3, p4}, Lcom/daaw/nf8;-><init>(Lcom/daaw/ib8;Lcom/daaw/ar8;Lcom/daaw/lr8;)V

    const/16 p3, 0x3e9

    invoke-virtual {p0, p1, p3, p2}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final W(ILcom/daaw/pr8;Lcom/daaw/ar8;Lcom/daaw/lr8;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/tg8;->d0(ILcom/daaw/pr8;)Lcom/daaw/ib8;

    move-result-object p1

    new-instance p2, Lcom/daaw/ie8;

    invoke-direct {p2, p1, p3, p4}, Lcom/daaw/ie8;-><init>(Lcom/daaw/ib8;Lcom/daaw/ar8;Lcom/daaw/lr8;)V

    const/16 p3, 0x3ea

    invoke-virtual {p0, p1, p3, p2}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final X()Lcom/daaw/ib8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tg8;->d:Lcom/daaw/rg8;

    invoke-virtual {v0}, Lcom/daaw/rg8;->b()Lcom/daaw/pr8;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/tg8;->c0(Lcom/daaw/pr8;)Lcom/daaw/ib8;

    move-result-object v0

    return-object v0
.end method

.method public final Y(Lcom/daaw/l64;ILcom/daaw/pr8;)Lcom/daaw/ib8;
    .locals 19
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/RequiresNonNull;
        value = {
            "player"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    move/from16 v5, p2

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/l64;->o()Z

    move-result v1

    const/4 v2, 0x1

    if-ne v2, v1, :cond_0

    const/4 v1, 0x0

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    :goto_0
    iget-object v1, v0, Lcom/daaw/tg8;->a:Lcom/daaw/xp4;

    invoke-interface {v1}, Lcom/daaw/xp4;->zza()J

    move-result-wide v7

    iget-object v1, v0, Lcom/daaw/tg8;->g:Lcom/daaw/ty3;

    invoke-interface {v1}, Lcom/daaw/ty3;->zzn()Lcom/daaw/l64;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/daaw/l64;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/daaw/tg8;->g:Lcom/daaw/ty3;

    invoke-interface {v1}, Lcom/daaw/ty3;->zzf()I

    move-result v1

    if-ne v5, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    const-wide/16 v9, 0x0

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lcom/daaw/md3;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz v2, :cond_5

    iget-object v1, v0, Lcom/daaw/tg8;->g:Lcom/daaw/ty3;

    invoke-interface {v1}, Lcom/daaw/ty3;->zzd()I

    move-result v1

    iget v2, v6, Lcom/daaw/md3;->b:I

    if-ne v1, v2, :cond_5

    iget-object v1, v0, Lcom/daaw/tg8;->g:Lcom/daaw/ty3;

    invoke-interface {v1}, Lcom/daaw/ty3;->zze()I

    move-result v1

    iget v2, v6, Lcom/daaw/md3;->c:I

    if-ne v1, v2, :cond_5

    iget-object v1, v0, Lcom/daaw/tg8;->g:Lcom/daaw/ty3;

    invoke-interface {v1}, Lcom/daaw/ty3;->zzl()J

    move-result-wide v9

    goto :goto_2

    :cond_2
    if-eqz v2, :cond_3

    iget-object v1, v0, Lcom/daaw/tg8;->g:Lcom/daaw/ty3;

    invoke-interface {v1}, Lcom/daaw/ty3;->zzk()J

    move-result-wide v1

    move-wide v9, v1

    goto :goto_2

    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/l64;->o()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, v0, Lcom/daaw/tg8;->c:Lcom/daaw/i54;

    invoke-virtual {v4, v5, v1, v9, v10}, Lcom/daaw/l64;->e(ILcom/daaw/i54;J)Lcom/daaw/i54;

    move-result-object v1

    iget-wide v1, v1, Lcom/daaw/i54;->k:J

    invoke-static {v9, v10}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v9

    :cond_5
    :goto_2
    iget-object v1, v0, Lcom/daaw/tg8;->d:Lcom/daaw/rg8;

    invoke-virtual {v1}, Lcom/daaw/rg8;->b()Lcom/daaw/pr8;

    move-result-object v11

    new-instance v16, Lcom/daaw/ib8;

    iget-object v1, v0, Lcom/daaw/tg8;->g:Lcom/daaw/ty3;

    invoke-interface {v1}, Lcom/daaw/ty3;->zzn()Lcom/daaw/l64;

    move-result-object v12

    iget-object v1, v0, Lcom/daaw/tg8;->g:Lcom/daaw/ty3;

    invoke-interface {v1}, Lcom/daaw/ty3;->zzf()I

    move-result v13

    iget-object v1, v0, Lcom/daaw/tg8;->g:Lcom/daaw/ty3;

    invoke-interface {v1}, Lcom/daaw/ty3;->zzl()J

    move-result-wide v14

    iget-object v1, v0, Lcom/daaw/tg8;->g:Lcom/daaw/ty3;

    invoke-interface {v1}, Lcom/daaw/ty3;->zzm()J

    move-result-wide v17

    move-object/from16 v1, v16

    move-wide v2, v7

    move-object/from16 v4, p1

    move/from16 v5, p2

    move-wide v7, v9

    move-object v9, v12

    move v10, v13

    move-wide v12, v14

    move-wide/from16 v14, v17

    invoke-direct/range {v1 .. v15}, Lcom/daaw/ib8;-><init>(JLcom/daaw/l64;ILcom/daaw/pr8;JLcom/daaw/l64;ILcom/daaw/pr8;JJ)V

    return-object v16
.end method

.method public final a(Lcom/daaw/ll4;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->f0()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/dg8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/dg8;-><init>(Lcom/daaw/ib8;Lcom/daaw/ll4;)V

    const/16 p1, 0x19

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final synthetic a0(Lcom/daaw/ty3;Lcom/daaw/ob8;Lcom/daaw/r32;)V
    .locals 2

    new-instance v0, Lcom/daaw/lb8;

    iget-object v1, p0, Lcom/daaw/tg8;->e:Landroid/util/SparseArray;

    invoke-direct {v0, p3, v1}, Lcom/daaw/lb8;-><init>(Lcom/daaw/r32;Landroid/util/SparseArray;)V

    invoke-interface {p2, p1, v0}, Lcom/daaw/ob8;->k(Lcom/daaw/ty3;Lcom/daaw/lb8;)V

    return-void
.end method

.method public final b(Lcom/daaw/ql7;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->f0()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/oe8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/oe8;-><init>(Lcom/daaw/ib8;Lcom/daaw/ql7;)V

    const/16 p1, 0x3ef

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/tg8;->e:Landroid/util/SparseArray;

    invoke-virtual {v0, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/tg8;->f:Lcom/daaw/k65;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/k65;->d(ILcom/daaw/c35;)V

    invoke-virtual {p1}, Lcom/daaw/k65;->c()V

    return-void
.end method

.method public final c(IJ)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->e0()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/ee8;

    invoke-direct {v1, v0, p1, p2, p3}, Lcom/daaw/ee8;-><init>(Lcom/daaw/ib8;IJ)V

    const/16 p1, 0x3fa

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final c0(Lcom/daaw/pr8;)Lcom/daaw/ib8;
    .locals 3

    iget-object v0, p0, Lcom/daaw/tg8;->g:Lcom/daaw/ty3;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object v1, v0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/tg8;->d:Lcom/daaw/rg8;

    invoke-virtual {v1, p1}, Lcom/daaw/rg8;->a(Lcom/daaw/pr8;)Lcom/daaw/l64;

    move-result-object v1

    :goto_0
    if-eqz p1, :cond_2

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p1, Lcom/daaw/md3;->a:Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/tg8;->b:Lcom/daaw/d34;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/l64;->n(Ljava/lang/Object;Lcom/daaw/d34;)Lcom/daaw/d34;

    move-result-object v0

    iget v0, v0, Lcom/daaw/d34;->c:I

    invoke-virtual {p0, v1, v0, p1}, Lcom/daaw/tg8;->Y(Lcom/daaw/l64;ILcom/daaw/pr8;)Lcom/daaw/ib8;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/daaw/tg8;->g:Lcom/daaw/ty3;

    invoke-interface {p1}, Lcom/daaw/ty3;->zzf()I

    move-result p1

    iget-object v1, p0, Lcom/daaw/tg8;->g:Lcom/daaw/ty3;

    invoke-interface {v1}, Lcom/daaw/ty3;->zzn()Lcom/daaw/l64;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/l64;->c()I

    move-result v2

    if-lt p1, v2, :cond_3

    sget-object v1, Lcom/daaw/l64;->a:Lcom/daaw/l64;

    :cond_3
    invoke-virtual {p0, v1, p1, v0}, Lcom/daaw/tg8;->Y(Lcom/daaw/l64;ILcom/daaw/pr8;)Lcom/daaw/ib8;

    move-result-object p1

    return-object p1
.end method

.method public final d(ILcom/daaw/pr8;Lcom/daaw/lr8;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/tg8;->d0(ILcom/daaw/pr8;)Lcom/daaw/ib8;

    move-result-object p1

    new-instance p2, Lcom/daaw/nc8;

    invoke-direct {p2, p1, p3}, Lcom/daaw/nc8;-><init>(Lcom/daaw/ib8;Lcom/daaw/lr8;)V

    const/16 p3, 0x3ec

    invoke-virtual {p0, p1, p3, p2}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final d0(ILcom/daaw/pr8;)Lcom/daaw/ib8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tg8;->g:Lcom/daaw/ty3;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_1

    iget-object v0, p0, Lcom/daaw/tg8;->d:Lcom/daaw/rg8;

    invoke-virtual {v0, p2}, Lcom/daaw/rg8;->a(Lcom/daaw/pr8;)Lcom/daaw/l64;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p2}, Lcom/daaw/tg8;->c0(Lcom/daaw/pr8;)Lcom/daaw/ib8;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/daaw/l64;->a:Lcom/daaw/l64;

    invoke-virtual {p0, v0, p1, p2}, Lcom/daaw/tg8;->Y(Lcom/daaw/l64;ILcom/daaw/pr8;)Lcom/daaw/ib8;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    invoke-interface {v0}, Lcom/daaw/ty3;->zzn()Lcom/daaw/l64;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/l64;->c()I

    move-result v0

    if-lt p1, v0, :cond_2

    sget-object p2, Lcom/daaw/l64;->a:Lcom/daaw/l64;

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p0, p2, p1, v0}, Lcom/daaw/tg8;->Y(Lcom/daaw/l64;ILcom/daaw/pr8;)Lcom/daaw/ib8;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/Exception;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->f0()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/qc8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/qc8;-><init>(Lcom/daaw/ib8;Ljava/lang/Exception;)V

    const/16 p1, 0x406

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final e0()Lcom/daaw/ib8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tg8;->d:Lcom/daaw/rg8;

    invoke-virtual {v0}, Lcom/daaw/rg8;->d()Lcom/daaw/pr8;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/tg8;->c0(Lcom/daaw/pr8;)Lcom/daaw/ib8;

    move-result-object v0

    return-object v0
.end method

.method public final f(Ljava/lang/String;JJ)V
    .locals 9

    invoke-virtual {p0}, Lcom/daaw/tg8;->f0()Lcom/daaw/ib8;

    move-result-object v7

    new-instance v8, Lcom/daaw/wd8;

    move-object v0, v8

    move-object v1, v7

    move-object v2, p1

    move-wide v3, p4

    move-wide v5, p2

    invoke-direct/range {v0 .. v6}, Lcom/daaw/wd8;-><init>(Lcom/daaw/ib8;Ljava/lang/String;JJ)V

    const/16 p1, 0x3f8

    invoke-virtual {p0, v7, p1, v8}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final f0()Lcom/daaw/ib8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tg8;->d:Lcom/daaw/rg8;

    invoke-virtual {v0}, Lcom/daaw/rg8;->e()Lcom/daaw/pr8;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/tg8;->c0(Lcom/daaw/pr8;)Lcom/daaw/ib8;

    move-result-object v0

    return-object v0
.end method

.method public final g(Lcom/daaw/ql7;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->e0()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/vf8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/vf8;-><init>(Lcom/daaw/ib8;Lcom/daaw/ql7;)V

    const/16 p1, 0x3f5

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final g0(Lcom/daaw/jn3;)Lcom/daaw/ib8;
    .locals 1

    instance-of v0, p1, Lcom/daaw/vu7;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/daaw/vu7;

    iget-object p1, p1, Lcom/daaw/vu7;->x:Lcom/daaw/md3;

    if-eqz p1, :cond_0

    new-instance v0, Lcom/daaw/pr8;

    invoke-direct {v0, p1}, Lcom/daaw/pr8;-><init>(Lcom/daaw/md3;)V

    invoke-virtual {p0, v0}, Lcom/daaw/tg8;->c0(Lcom/daaw/pr8;)Lcom/daaw/ib8;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/tg8;->X()Lcom/daaw/ib8;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lcom/daaw/ob8;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/tg8;->f:Lcom/daaw/k65;

    invoke-virtual {v0, p1}, Lcom/daaw/k65;->f(Ljava/lang/Object;)V

    return-void
.end method

.method public final i(Ljava/util/List;Lcom/daaw/pr8;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/tg8;->d:Lcom/daaw/rg8;

    iget-object v1, p0, Lcom/daaw/tg8;->g:Lcom/daaw/ty3;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p1, p2, v1}, Lcom/daaw/rg8;->h(Ljava/util/List;Lcom/daaw/pr8;Lcom/daaw/ty3;)V

    return-void
.end method

.method public final j(Lcom/daaw/ob8;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/tg8;->f:Lcom/daaw/k65;

    invoke-virtual {v0, p1}, Lcom/daaw/k65;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final k(Z)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->f0()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/we8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/we8;-><init>(Lcom/daaw/ib8;Z)V

    const/16 p1, 0x17

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final l(Lcom/daaw/ql7;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->f0()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/ge8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/ge8;-><init>(Lcom/daaw/ib8;Lcom/daaw/ql7;)V

    const/16 p1, 0x3f7

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final m(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->f0()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/wb8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/wb8;-><init>(Lcom/daaw/ib8;Ljava/lang/String;)V

    const/16 p1, 0x3fb

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final n(JI)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->e0()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/gd8;

    invoke-direct {v1, v0, p1, p2, p3}, Lcom/daaw/gd8;-><init>(Lcom/daaw/ib8;JI)V

    const/16 p1, 0x3fd

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final o()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/tg8;->h:Lcom/daaw/vz4;

    invoke-static {v0}, Lcom/daaw/uo4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/daaw/xf8;

    invoke-direct {v1, p0}, Lcom/daaw/xf8;-><init>(Lcom/daaw/tg8;)V

    invoke-interface {v0, v1}, Lcom/daaw/vz4;->b(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final p(Lcom/daaw/ql7;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->e0()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/fg8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/fg8;-><init>(Lcom/daaw/ib8;Lcom/daaw/ql7;)V

    const/16 p1, 0x3fc

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final q(Lcom/daaw/f92;Lcom/daaw/tm7;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->f0()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/tf8;

    invoke-direct {v1, v0, p1, p2}, Lcom/daaw/tf8;-><init>(Lcom/daaw/ib8;Lcom/daaw/f92;Lcom/daaw/tm7;)V

    const/16 p1, 0x3f1

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final r(Ljava/lang/Exception;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->f0()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/ed8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/ed8;-><init>(Lcom/daaw/ib8;Ljava/lang/Exception;)V

    const/16 p1, 0x3f6

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final s(Ljava/lang/Exception;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->f0()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/qd8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/qd8;-><init>(Lcom/daaw/ib8;Ljava/lang/Exception;)V

    const/16 p1, 0x405

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final t(Z)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->X()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/ue8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/ue8;-><init>(Lcom/daaw/ib8;Z)V

    const/4 p1, 0x7

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final u(I)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->X()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/lg8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/lg8;-><init>(Lcom/daaw/ib8;I)V

    const/4 p1, 0x6

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final v(II)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->f0()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/jg8;

    invoke-direct {v1, v0, p1, p2}, Lcom/daaw/jg8;-><init>(Lcom/daaw/ib8;II)V

    const/16 p1, 0x18

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final w(Lcom/daaw/pp3;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->X()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/fc8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/fc8;-><init>(Lcom/daaw/ib8;Lcom/daaw/pp3;)V

    const/16 p1, 0xc

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final x(Z)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->X()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/ng8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/ng8;-><init>(Lcom/daaw/ib8;Z)V

    const/4 p1, 0x3

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final y(F)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->f0()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/cc8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/cc8;-><init>(Lcom/daaw/ib8;F)V

    const/16 p1, 0x16

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final z(Lcom/daaw/gc3;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->X()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/rf8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/rf8;-><init>(Lcom/daaw/ib8;Lcom/daaw/gc3;)V

    const/16 p1, 0xe

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final zzA(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/tg8;->f0()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/pg8;

    invoke-direct {v1, v0, p1}, Lcom/daaw/pg8;-><init>(Lcom/daaw/ib8;Ljava/lang/String;)V

    const/16 p1, 0x3f4

    invoke-virtual {p0, v0, p1, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final zzp()V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/tg8;->X()Lcom/daaw/ib8;

    move-result-object v0

    new-instance v1, Lcom/daaw/kc8;

    invoke-direct {v1, v0}, Lcom/daaw/kc8;-><init>(Lcom/daaw/ib8;)V

    const/4 v2, -0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    return-void
.end method

.method public final zzx()V
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/tg8;->i:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/tg8;->X()Lcom/daaw/ib8;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/tg8;->i:Z

    new-instance v1, Lcom/daaw/bg8;

    invoke-direct {v1, v0}, Lcom/daaw/bg8;-><init>(Lcom/daaw/ib8;)V

    const/4 v2, -0x1

    invoke-virtual {p0, v0, v2, v1}, Lcom/daaw/tg8;->b0(Lcom/daaw/ib8;ILcom/daaw/c35;)V

    :cond_0
    return-void
.end method
