.class public final Lcom/daaw/ys8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nr8;
.implements Lcom/daaw/m09;
.implements Lcom/daaw/tw8;
.implements Lcom/daaw/yw8;
.implements Lcom/daaw/kt8;


# static fields
.field public static final a0:Ljava/util/Map;

.field public static final b0:Lcom/daaw/f92;


# instance fields
.field public final A:Ljava/lang/Runnable;

.field public final B:Landroid/os/Handler;

.field public C:Lcom/daaw/mr8;

.field public D:Lcom/google/android/gms/internal/ads/zzacn;

.field public E:[Lcom/daaw/lt8;

.field public F:[Lcom/daaw/ws8;

.field public G:Z

.field public H:Z

.field public I:Z

.field public J:Lcom/daaw/xs8;

.field public K:Lcom/daaw/i42;

.field public L:J

.field public M:Z

.field public N:I

.field public O:Z

.field public P:Z

.field public Q:I

.field public R:Z

.field public S:J

.field public T:J

.field public U:Z

.field public V:I

.field public W:Z

.field public X:Z

.field public final Y:Lcom/daaw/rw8;

.field public final Z:Lcom/daaw/nw8;

.field public final p:Landroid/net/Uri;

.field public final q:Lcom/daaw/p46;

.field public final r:Lcom/daaw/vn8;

.field public final s:Lcom/daaw/yr8;

.field public final t:Lcom/daaw/jn8;

.field public final u:Lcom/daaw/us8;

.field public final v:J

.field public final w:Lcom/daaw/bx8;

.field public final x:Lcom/daaw/os8;

.field public final y:Lcom/daaw/ds4;

.field public final z:Ljava/lang/Runnable;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "Icy-MetaData"

    const-string v2, "1"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/daaw/ys8;->a0:Ljava/util/Map;

    new-instance v0, Lcom/daaw/b72;

    invoke-direct {v0}, Lcom/daaw/b72;-><init>()V

    const-string v1, "icy"

    invoke-virtual {v0, v1}, Lcom/daaw/b72;->h(Ljava/lang/String;)Lcom/daaw/b72;

    const-string v1, "application/x-icy"

    invoke-virtual {v0, v1}, Lcom/daaw/b72;->s(Ljava/lang/String;)Lcom/daaw/b72;

    invoke-virtual {v0}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object v0

    sput-object v0, Lcom/daaw/ys8;->b0:Lcom/daaw/f92;

    return-void
.end method

.method public constructor <init>(Landroid/net/Uri;Lcom/daaw/p46;Lcom/daaw/os8;Lcom/daaw/vn8;Lcom/daaw/jn8;Lcom/daaw/rw8;Lcom/daaw/yr8;Lcom/daaw/us8;Lcom/daaw/nw8;Ljava/lang/String;I[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ys8;->p:Landroid/net/Uri;

    iput-object p2, p0, Lcom/daaw/ys8;->q:Lcom/daaw/p46;

    iput-object p4, p0, Lcom/daaw/ys8;->r:Lcom/daaw/vn8;

    iput-object p5, p0, Lcom/daaw/ys8;->t:Lcom/daaw/jn8;

    iput-object p6, p0, Lcom/daaw/ys8;->Y:Lcom/daaw/rw8;

    iput-object p7, p0, Lcom/daaw/ys8;->s:Lcom/daaw/yr8;

    iput-object p8, p0, Lcom/daaw/ys8;->u:Lcom/daaw/us8;

    iput-object p9, p0, Lcom/daaw/ys8;->Z:Lcom/daaw/nw8;

    int-to-long p1, p11

    iput-wide p1, p0, Lcom/daaw/ys8;->v:J

    new-instance p1, Lcom/daaw/bx8;

    const-string p2, "ProgressiveMediaPeriod"

    invoke-direct {p1, p2}, Lcom/daaw/bx8;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/ys8;->w:Lcom/daaw/bx8;

    iput-object p3, p0, Lcom/daaw/ys8;->x:Lcom/daaw/os8;

    new-instance p1, Lcom/daaw/ds4;

    sget-object p2, Lcom/daaw/xp4;->a:Lcom/daaw/xp4;

    invoke-direct {p1, p2}, Lcom/daaw/ds4;-><init>(Lcom/daaw/xp4;)V

    iput-object p1, p0, Lcom/daaw/ys8;->y:Lcom/daaw/ds4;

    new-instance p1, Lcom/daaw/ps8;

    invoke-direct {p1, p0}, Lcom/daaw/ps8;-><init>(Lcom/daaw/ys8;)V

    iput-object p1, p0, Lcom/daaw/ys8;->z:Ljava/lang/Runnable;

    new-instance p1, Lcom/daaw/qs8;

    invoke-direct {p1, p0}, Lcom/daaw/qs8;-><init>(Lcom/daaw/ys8;)V

    iput-object p1, p0, Lcom/daaw/ys8;->A:Ljava/lang/Runnable;

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/daaw/it5;->d(Landroid/os/Handler$Callback;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ys8;->B:Landroid/os/Handler;

    const/4 p1, 0x0

    new-array p2, p1, [Lcom/daaw/ws8;

    iput-object p2, p0, Lcom/daaw/ys8;->F:[Lcom/daaw/ws8;

    new-array p1, p1, [Lcom/daaw/lt8;

    iput-object p1, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/daaw/ys8;->T:J

    iput-wide p1, p0, Lcom/daaw/ys8;->L:J

    const/4 p1, 0x1

    iput p1, p0, Lcom/daaw/ys8;->N:I

    return-void
.end method

.method public static bridge synthetic J(Lcom/daaw/ys8;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/ys8;->v:J

    return-wide v0
.end method

.method public static bridge synthetic K(Lcom/daaw/ys8;Z)J
    .locals 0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/daaw/ys8;->y(Z)J

    move-result-wide p0

    return-wide p0
.end method

.method public static bridge synthetic L(Lcom/daaw/ys8;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ys8;->B:Landroid/os/Handler;

    return-object p0
.end method

.method public static bridge synthetic M()Lcom/daaw/f92;
    .locals 1

    sget-object v0, Lcom/daaw/ys8;->b0:Lcom/daaw/f92;

    return-object v0
.end method

.method public static bridge synthetic O(Lcom/daaw/ys8;)Lcom/google/android/gms/internal/ads/zzacn;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ys8;->D:Lcom/google/android/gms/internal/ads/zzacn;

    return-object p0
.end method

.method public static bridge synthetic P(Lcom/daaw/ys8;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ys8;->A:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static bridge synthetic Q()Ljava/util/Map;
    .locals 1

    sget-object v0, Lcom/daaw/ys8;->a0:Ljava/util/Map;

    return-object v0
.end method

.method public static synthetic R(Lcom/daaw/ys8;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/ys8;->B()V

    return-void
.end method

.method public static bridge synthetic o(Lcom/daaw/ys8;Lcom/google/android/gms/internal/ads/zzacn;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ys8;->D:Lcom/google/android/gms/internal/ads/zzacn;

    return-void
.end method

.method public static bridge synthetic p(Lcom/daaw/ys8;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ys8;->B:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/rs8;

    invoke-direct {v1, p0}, Lcom/daaw/rs8;-><init>(Lcom/daaw/ys8;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "trackState",
            "seekMap"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/daaw/ys8;->H:Z

    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    iget-object v0, p0, Lcom/daaw/ys8;->J:Lcom/daaw/xs8;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/ys8;->K:Lcom/daaw/i42;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final B()V
    .locals 13

    iget-boolean v0, p0, Lcom/daaw/ys8;->X:Z

    if-nez v0, :cond_a

    iget-boolean v0, p0, Lcom/daaw/ys8;->H:Z

    if-nez v0, :cond_a

    iget-boolean v0, p0, Lcom/daaw/ys8;->G:Z

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/daaw/ys8;->K:Lcom/daaw/i42;

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v0, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    invoke-virtual {v4}, Lcom/daaw/lt8;->x()Lcom/daaw/f92;

    move-result-object v4

    if-nez v4, :cond_1

    return-void

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/daaw/ys8;->y:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->c()Z

    iget-object v0, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    array-length v0, v0

    new-array v1, v0, [Lcom/daaw/r84;

    new-array v3, v0, [Z

    const/4 v4, 0x0

    :goto_1
    const/4 v5, 0x1

    if-ge v4, v0, :cond_9

    iget-object v6, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    aget-object v6, v6, v4

    invoke-virtual {v6}, Lcom/daaw/lt8;->x()Lcom/daaw/f92;

    move-result-object v6

    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v7, v6, Lcom/daaw/f92;->l:Ljava/lang/String;

    invoke-static {v7}, Lcom/daaw/ak3;->g(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_4

    invoke-static {v7}, Lcom/daaw/ak3;->h(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_2

    :cond_3
    const/4 v7, 0x0

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v7, 0x1

    :goto_3
    aput-boolean v7, v3, v4

    iget-boolean v9, p0, Lcom/daaw/ys8;->I:Z

    or-int/2addr v7, v9

    iput-boolean v7, p0, Lcom/daaw/ys8;->I:Z

    iget-object v7, p0, Lcom/daaw/ys8;->D:Lcom/google/android/gms/internal/ads/zzacn;

    if-eqz v7, :cond_8

    if-nez v8, :cond_5

    iget-object v9, p0, Lcom/daaw/ys8;->F:[Lcom/daaw/ws8;

    aget-object v9, v9, v4

    iget-boolean v9, v9, Lcom/daaw/ws8;->b:Z

    if-eqz v9, :cond_7

    :cond_5
    iget-object v9, v6, Lcom/daaw/f92;->j:Lcom/google/android/gms/internal/ads/zzbq;

    if-nez v9, :cond_6

    new-instance v9, Lcom/google/android/gms/internal/ads/zzbq;

    new-array v10, v5, [Lcom/google/android/gms/internal/ads/zzbp;

    aput-object v7, v10, v2

    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v9, v11, v12, v10}, Lcom/google/android/gms/internal/ads/zzbq;-><init>(J[Lcom/google/android/gms/internal/ads/zzbp;)V

    goto :goto_4

    :cond_6
    new-array v10, v5, [Lcom/google/android/gms/internal/ads/zzbp;

    aput-object v7, v10, v2

    invoke-virtual {v9, v10}, Lcom/google/android/gms/internal/ads/zzbq;->c([Lcom/google/android/gms/internal/ads/zzbp;)Lcom/google/android/gms/internal/ads/zzbq;

    move-result-object v9

    :goto_4
    invoke-virtual {v6}, Lcom/daaw/f92;->b()Lcom/daaw/b72;

    move-result-object v6

    invoke-virtual {v6, v9}, Lcom/daaw/b72;->m(Lcom/google/android/gms/internal/ads/zzbq;)Lcom/daaw/b72;

    invoke-virtual {v6}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object v6

    :cond_7
    if-eqz v8, :cond_8

    iget v8, v6, Lcom/daaw/f92;->f:I

    const/4 v9, -0x1

    if-ne v8, v9, :cond_8

    iget v8, v6, Lcom/daaw/f92;->g:I

    if-ne v8, v9, :cond_8

    iget v7, v7, Lcom/google/android/gms/internal/ads/zzacn;->p:I

    if-eq v7, v9, :cond_8

    invoke-virtual {v6}, Lcom/daaw/f92;->b()Lcom/daaw/b72;

    move-result-object v6

    invoke-virtual {v6, v7}, Lcom/daaw/b72;->d0(I)Lcom/daaw/b72;

    invoke-virtual {v6}, Lcom/daaw/b72;->y()Lcom/daaw/f92;

    move-result-object v6

    :cond_8
    iget-object v7, p0, Lcom/daaw/ys8;->r:Lcom/daaw/vn8;

    invoke-interface {v7, v6}, Lcom/daaw/vn8;->a(Lcom/daaw/f92;)I

    move-result v7

    invoke-virtual {v6, v7}, Lcom/daaw/f92;->c(I)Lcom/daaw/f92;

    move-result-object v6

    new-instance v7, Lcom/daaw/r84;

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v8

    new-array v5, v5, [Lcom/daaw/f92;

    aput-object v6, v5, v2

    invoke-direct {v7, v8, v5}, Lcom/daaw/r84;-><init>(Ljava/lang/String;[Lcom/daaw/f92;)V

    aput-object v7, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    :cond_9
    new-instance v0, Lcom/daaw/xs8;

    new-instance v2, Lcom/daaw/au8;

    invoke-direct {v2, v1}, Lcom/daaw/au8;-><init>([Lcom/daaw/r84;)V

    invoke-direct {v0, v2, v3}, Lcom/daaw/xs8;-><init>(Lcom/daaw/au8;[Z)V

    iput-object v0, p0, Lcom/daaw/ys8;->J:Lcom/daaw/xs8;

    iput-boolean v5, p0, Lcom/daaw/ys8;->H:Z

    iget-object v0, p0, Lcom/daaw/ys8;->C:Lcom/daaw/mr8;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, p0}, Lcom/daaw/mr8;->d(Lcom/daaw/nr8;)V

    :cond_a
    :goto_5
    return-void
.end method

.method public final C(I)V
    .locals 10

    invoke-virtual {p0}, Lcom/daaw/ys8;->A()V

    iget-object v0, p0, Lcom/daaw/ys8;->J:Lcom/daaw/xs8;

    iget-object v1, v0, Lcom/daaw/xs8;->d:[Z

    aget-boolean v2, v1, p1

    if-nez v2, :cond_0

    iget-object v0, v0, Lcom/daaw/xs8;->a:Lcom/daaw/au8;

    invoke-virtual {v0, p1}, Lcom/daaw/au8;->b(I)Lcom/daaw/r84;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/daaw/r84;->b(I)Lcom/daaw/f92;

    move-result-object v5

    iget-object v3, p0, Lcom/daaw/ys8;->s:Lcom/daaw/yr8;

    iget-object v0, v5, Lcom/daaw/f92;->l:Ljava/lang/String;

    invoke-static {v0}, Lcom/daaw/ak3;->b(Ljava/lang/String;)I

    move-result v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    iget-wide v8, p0, Lcom/daaw/ys8;->S:J

    invoke-virtual/range {v3 .. v9}, Lcom/daaw/yr8;->d(ILcom/daaw/f92;ILjava/lang/Object;J)V

    const/4 v0, 0x1

    aput-boolean v0, v1, p1

    :cond_0
    return-void
.end method

.method public final D(I)V
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/ys8;->A()V

    iget-object v0, p0, Lcom/daaw/ys8;->J:Lcom/daaw/xs8;

    iget-object v0, v0, Lcom/daaw/xs8;->b:[Z

    iget-boolean v1, p0, Lcom/daaw/ys8;->U:Z

    if-eqz v1, :cond_2

    aget-boolean v0, v0, p1

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    aget-object p1, v0, p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/lt8;->J(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/daaw/ys8;->T:J

    iput-boolean v0, p0, Lcom/daaw/ys8;->U:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/ys8;->P:Z

    iput-wide v1, p0, Lcom/daaw/ys8;->S:J

    iput v0, p0, Lcom/daaw/ys8;->V:I

    iget-object p1, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    invoke-virtual {v3, v0}, Lcom/daaw/lt8;->E(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/ys8;->C:Lcom/daaw/mr8;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, p0}, Lcom/daaw/nt8;->a(Lcom/daaw/vt8;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final E()V
    .locals 28

    move-object/from16 v7, p0

    new-instance v8, Lcom/daaw/ts8;

    iget-object v2, v7, Lcom/daaw/ys8;->p:Landroid/net/Uri;

    iget-object v3, v7, Lcom/daaw/ys8;->q:Lcom/daaw/p46;

    iget-object v4, v7, Lcom/daaw/ys8;->x:Lcom/daaw/os8;

    iget-object v6, v7, Lcom/daaw/ys8;->y:Lcom/daaw/ds4;

    move-object v0, v8

    move-object/from16 v1, p0

    move-object/from16 v5, p0

    invoke-direct/range {v0 .. v6}, Lcom/daaw/ts8;-><init>(Lcom/daaw/ys8;Landroid/net/Uri;Lcom/daaw/p46;Lcom/daaw/os8;Lcom/daaw/m09;Lcom/daaw/ds4;)V

    iget-boolean v0, v7, Lcom/daaw/ys8;->H:Z

    if-eqz v0, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ys8;->F()Z

    move-result v0

    invoke-static {v0}, Lcom/daaw/uo4;->f(Z)V

    iget-wide v0, v7, Lcom/daaw/ys8;->L:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    iget-wide v4, v7, Lcom/daaw/ys8;->T:J

    cmp-long v6, v4, v0

    if-gtz v6, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, v7, Lcom/daaw/ys8;->W:Z

    iput-wide v2, v7, Lcom/daaw/ys8;->T:J

    return-void

    :cond_1
    :goto_0
    iget-object v0, v7, Lcom/daaw/ys8;->K:Lcom/daaw/i42;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-wide v4, v7, Lcom/daaw/ys8;->T:J

    invoke-interface {v0, v4, v5}, Lcom/daaw/i42;->b(J)Lcom/daaw/g42;

    move-result-object v0

    iget-object v0, v0, Lcom/daaw/g42;->a:Lcom/daaw/j42;

    iget-wide v0, v0, Lcom/daaw/j42;->b:J

    iget-wide v4, v7, Lcom/daaw/ys8;->T:J

    invoke-static {v8, v0, v1, v4, v5}, Lcom/daaw/ts8;->f(Lcom/daaw/ts8;JJ)V

    iget-object v0, v7, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    array-length v1, v0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v1, :cond_2

    aget-object v5, v0, v4

    iget-wide v9, v7, Lcom/daaw/ys8;->T:J

    invoke-virtual {v5, v9, v10}, Lcom/daaw/lt8;->F(J)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    iput-wide v2, v7, Lcom/daaw/ys8;->T:J

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ys8;->x()I

    move-result v0

    iput v0, v7, Lcom/daaw/ys8;->V:I

    iget-object v0, v7, Lcom/daaw/ys8;->w:Lcom/daaw/bx8;

    iget v1, v7, Lcom/daaw/ys8;->N:I

    invoke-static {v1}, Lcom/daaw/rw8;->a(I)I

    move-result v1

    invoke-virtual {v0, v8, v7, v1}, Lcom/daaw/bx8;->a(Lcom/daaw/xw8;Lcom/daaw/tw8;I)J

    move-result-wide v15

    invoke-static {v8}, Lcom/daaw/ts8;->d(Lcom/daaw/ts8;)Lcom/daaw/pa6;

    move-result-object v12

    iget-object v0, v7, Lcom/daaw/ys8;->s:Lcom/daaw/yr8;

    new-instance v1, Lcom/daaw/ar8;

    invoke-static {v8}, Lcom/daaw/ts8;->b(Lcom/daaw/ts8;)J

    move-result-wide v10

    iget-object v13, v12, Lcom/daaw/pa6;->a:Landroid/net/Uri;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v14

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    move-object v9, v1

    invoke-direct/range {v9 .. v20}, Lcom/daaw/ar8;-><init>(JLcom/daaw/pa6;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    const/16 v19, 0x1

    const/16 v20, -0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static {v8}, Lcom/daaw/ts8;->c(Lcom/daaw/ts8;)J

    move-result-wide v24

    iget-wide v2, v7, Lcom/daaw/ys8;->L:J

    move-object/from16 v17, v0

    move-object/from16 v18, v1

    move-wide/from16 v26, v2

    invoke-virtual/range {v17 .. v27}, Lcom/daaw/yr8;->l(Lcom/daaw/ar8;IILcom/daaw/f92;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public final F()Z
    .locals 5

    iget-wide v0, p0, Lcom/daaw/ys8;->T:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final G()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ys8;->P:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/ys8;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final H(ILcom/daaw/a78;Lcom/daaw/ma7;I)I
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/ys8;->G()Z

    move-result v0

    const/4 v1, -0x3

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/ys8;->C(I)V

    iget-object v0, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    aget-object v0, v0, p1

    iget-boolean v2, p0, Lcom/daaw/ys8;->W:Z

    invoke-virtual {v0, p2, p3, p4, v2}, Lcom/daaw/lt8;->v(Lcom/daaw/a78;Lcom/daaw/ma7;IZ)I

    move-result p2

    if-ne p2, v1, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/ys8;->D(I)V

    :cond_1
    return p2
.end method

.method public final I(IJ)I
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/ys8;->G()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/ys8;->C(I)V

    iget-object v0, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    aget-object v0, v0, p1

    iget-boolean v2, p0, Lcom/daaw/ys8;->W:Z

    invoke-virtual {v0, p2, p3, v2}, Lcom/daaw/lt8;->t(JZ)I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/daaw/lt8;->H(I)V

    if-nez p2, :cond_1

    invoke-virtual {p0, p1}, Lcom/daaw/ys8;->D(I)V

    return v1

    :cond_1
    return p2
.end method

.method public final N()Lcom/daaw/m42;
    .locals 3

    new-instance v0, Lcom/daaw/ws8;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/daaw/ws8;-><init>(IZ)V

    invoke-virtual {p0, v0}, Lcom/daaw/ys8;->z(Lcom/daaw/ws8;)Lcom/daaw/m42;

    move-result-object v0

    return-object v0
.end method

.method public final a()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/daaw/lt8;->D()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/ys8;->x:Lcom/daaw/os8;

    invoke-interface {v0}, Lcom/daaw/os8;->zze()V

    return-void
.end method

.method public final b(J)J
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/ys8;->A()V

    iget-object v0, p0, Lcom/daaw/ys8;->J:Lcom/daaw/xs8;

    iget-object v0, v0, Lcom/daaw/xs8;->b:[Z

    iget-object v1, p0, Lcom/daaw/ys8;->K:Lcom/daaw/i42;

    invoke-interface {v1}, Lcom/daaw/i42;->zzh()Z

    move-result v1

    const/4 v2, 0x1

    if-eq v2, v1, :cond_0

    const-wide/16 p1, 0x0

    :cond_0
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/daaw/ys8;->P:Z

    iput-wide p1, p0, Lcom/daaw/ys8;->S:J

    invoke-virtual {p0}, Lcom/daaw/ys8;->F()Z

    move-result v2

    if-eqz v2, :cond_1

    iput-wide p1, p0, Lcom/daaw/ys8;->T:J

    return-wide p1

    :cond_1
    iget v2, p0, Lcom/daaw/ys8;->N:I

    const/4 v3, 0x7

    if-eq v2, v3, :cond_4

    iget-object v2, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    array-length v2, v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    iget-object v4, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    aget-object v4, v4, v3

    invoke-virtual {v4, p1, p2, v1}, Lcom/daaw/lt8;->K(JZ)Z

    move-result v4

    if-nez v4, :cond_2

    aget-boolean v4, v0, v3

    if-nez v4, :cond_4

    iget-boolean v4, p0, Lcom/daaw/ys8;->I:Z

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-wide p1

    :cond_4
    :goto_1
    iput-boolean v1, p0, Lcom/daaw/ys8;->U:Z

    iput-wide p1, p0, Lcom/daaw/ys8;->T:J

    iput-boolean v1, p0, Lcom/daaw/ys8;->W:Z

    iget-object v0, p0, Lcom/daaw/ys8;->w:Lcom/daaw/bx8;

    invoke-virtual {v0}, Lcom/daaw/bx8;->l()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v0, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    array-length v2, v0

    :goto_2
    if-ge v1, v2, :cond_5

    aget-object v3, v0, v1

    invoke-virtual {v3}, Lcom/daaw/lt8;->z()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lcom/daaw/ys8;->w:Lcom/daaw/bx8;

    invoke-virtual {v0}, Lcom/daaw/bx8;->g()V

    goto :goto_4

    :cond_6
    invoke-virtual {v0}, Lcom/daaw/bx8;->h()V

    iget-object v0, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    array-length v2, v0

    const/4 v3, 0x0

    :goto_3
    if-ge v3, v2, :cond_7

    aget-object v4, v0, v3

    invoke-virtual {v4, v1}, Lcom/daaw/lt8;->E(Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_7
    :goto_4
    return-wide p1
.end method

.method public final c(J)Z
    .locals 0

    iget-boolean p1, p0, Lcom/daaw/ys8;->W:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/daaw/ys8;->w:Lcom/daaw/bx8;

    invoke-virtual {p1}, Lcom/daaw/bx8;->k()Z

    move-result p1

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lcom/daaw/ys8;->U:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lcom/daaw/ys8;->H:Z

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/daaw/ys8;->Q:I

    if-eqz p1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/daaw/ys8;->y:Lcom/daaw/ds4;

    invoke-virtual {p1}, Lcom/daaw/ds4;->e()Z

    move-result p1

    iget-object p2, p0, Lcom/daaw/ys8;->w:Lcom/daaw/bx8;

    invoke-virtual {p2}, Lcom/daaw/bx8;->l()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p0}, Lcom/daaw/ys8;->E()V

    const/4 p1, 0x1

    :cond_1
    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic d(Lcom/daaw/xw8;JJ)V
    .locals 17

    move-object/from16 v0, p0

    iget-wide v1, v0, Lcom/daaw/ys8;->L:J

    const/4 v3, 0x1

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v1, v4

    if-nez v6, :cond_1

    iget-object v1, v0, Lcom/daaw/ys8;->K:Lcom/daaw/i42;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lcom/daaw/i42;->zzh()Z

    move-result v1

    invoke-virtual {v0, v3}, Lcom/daaw/ys8;->y(Z)J

    move-result-wide v4

    const-wide/high16 v6, -0x8000000000000000L

    cmp-long v2, v4, v6

    if-nez v2, :cond_0

    const-wide/16 v4, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v6, 0x2710

    add-long/2addr v4, v6

    :goto_0
    iput-wide v4, v0, Lcom/daaw/ys8;->L:J

    iget-object v2, v0, Lcom/daaw/ys8;->u:Lcom/daaw/us8;

    iget-boolean v6, v0, Lcom/daaw/ys8;->M:Z

    invoke-interface {v2, v4, v5, v1, v6}, Lcom/daaw/us8;->c(JZZ)V

    :cond_1
    move-object/from16 v1, p1

    check-cast v1, Lcom/daaw/ts8;

    invoke-static {v1}, Lcom/daaw/ts8;->e(Lcom/daaw/ts8;)Lcom/daaw/ny6;

    move-result-object v2

    new-instance v16, Lcom/daaw/ar8;

    invoke-static {v1}, Lcom/daaw/ts8;->b(Lcom/daaw/ts8;)J

    move-result-wide v5

    invoke-static {v1}, Lcom/daaw/ts8;->d(Lcom/daaw/ts8;)Lcom/daaw/pa6;

    move-result-object v7

    invoke-virtual {v2}, Lcom/daaw/ny6;->l()Landroid/net/Uri;

    move-result-object v8

    invoke-virtual {v2}, Lcom/daaw/ny6;->m()Ljava/util/Map;

    move-result-object v9

    invoke-virtual {v2}, Lcom/daaw/ny6;->k()J

    move-result-wide v14

    move-object/from16 v4, v16

    move-wide/from16 v10, p2

    move-wide/from16 v12, p4

    invoke-direct/range {v4 .. v15}, Lcom/daaw/ar8;-><init>(JLcom/daaw/pa6;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    invoke-static {v1}, Lcom/daaw/ts8;->b(Lcom/daaw/ts8;)J

    iget-object v4, v0, Lcom/daaw/ys8;->s:Lcom/daaw/yr8;

    const/4 v6, 0x1

    const/4 v7, -0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static {v1}, Lcom/daaw/ts8;->c(Lcom/daaw/ts8;)J

    move-result-wide v11

    iget-wide v13, v0, Lcom/daaw/ys8;->L:J

    move-object/from16 v5, v16

    invoke-virtual/range {v4 .. v14}, Lcom/daaw/yr8;->h(Lcom/daaw/ar8;IILcom/daaw/f92;ILjava/lang/Object;JJ)V

    iput-boolean v3, v0, Lcom/daaw/ys8;->W:Z

    iget-object v1, v0, Lcom/daaw/ys8;->C:Lcom/daaw/mr8;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1, v0}, Lcom/daaw/nt8;->a(Lcom/daaw/vt8;)V

    return-void
.end method

.method public final e(JZ)V
    .locals 5

    invoke-virtual {p0}, Lcom/daaw/ys8;->A()V

    invoke-virtual {p0}, Lcom/daaw/ys8;->F()Z

    move-result p3

    if-eqz p3, :cond_0

    return-void

    :cond_0
    iget-object p3, p0, Lcom/daaw/ys8;->J:Lcom/daaw/xs8;

    iget-object p3, p3, Lcom/daaw/xs8;->c:[Z

    iget-object v0, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    aget-object v3, v3, v2

    aget-boolean v4, p3, v2

    invoke-virtual {v3, p1, p2, v1, v4}, Lcom/daaw/lt8;->y(JZZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final bridge synthetic f(Lcom/daaw/xw8;JJZ)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lcom/daaw/ts8;

    invoke-static {v1}, Lcom/daaw/ts8;->e(Lcom/daaw/ts8;)Lcom/daaw/ny6;

    move-result-object v2

    new-instance v15, Lcom/daaw/ar8;

    invoke-static {v1}, Lcom/daaw/ts8;->b(Lcom/daaw/ts8;)J

    move-result-wide v4

    invoke-static {v1}, Lcom/daaw/ts8;->d(Lcom/daaw/ts8;)Lcom/daaw/pa6;

    move-result-object v6

    invoke-virtual {v2}, Lcom/daaw/ny6;->l()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual {v2}, Lcom/daaw/ny6;->m()Ljava/util/Map;

    move-result-object v8

    invoke-virtual {v2}, Lcom/daaw/ny6;->k()J

    move-result-wide v13

    move-object v3, v15

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lcom/daaw/ar8;-><init>(JLcom/daaw/pa6;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    invoke-static {v1}, Lcom/daaw/ts8;->b(Lcom/daaw/ts8;)J

    iget-object v3, v0, Lcom/daaw/ys8;->s:Lcom/daaw/yr8;

    invoke-static {v1}, Lcom/daaw/ts8;->c(Lcom/daaw/ts8;)J

    move-result-wide v10

    iget-wide v12, v0, Lcom/daaw/ys8;->L:J

    const/4 v5, 0x1

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, v15

    invoke-virtual/range {v3 .. v13}, Lcom/daaw/yr8;->f(Lcom/daaw/ar8;IILcom/daaw/f92;ILjava/lang/Object;JJ)V

    if-nez p6, :cond_1

    iget-object v1, v0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v1, v4

    invoke-virtual {v5, v3}, Lcom/daaw/lt8;->E(Z)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    iget v1, v0, Lcom/daaw/ys8;->Q:I

    if-lez v1, :cond_1

    iget-object v1, v0, Lcom/daaw/ys8;->C:Lcom/daaw/mr8;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1, v0}, Lcom/daaw/nt8;->a(Lcom/daaw/vt8;)V

    :cond_1
    return-void
.end method

.method public final g(Lcom/daaw/mr8;J)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ys8;->C:Lcom/daaw/mr8;

    iget-object p1, p0, Lcom/daaw/ys8;->y:Lcom/daaw/ds4;

    invoke-virtual {p1}, Lcom/daaw/ds4;->e()Z

    invoke-virtual {p0}, Lcom/daaw/ys8;->E()V

    return-void
.end method

.method public final h(JLcom/daaw/aa8;)J
    .locals 16

    move-object/from16 v0, p0

    move-wide/from16 v7, p1

    move-object/from16 v9, p3

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ys8;->A()V

    iget-object v1, v0, Lcom/daaw/ys8;->K:Lcom/daaw/i42;

    invoke-interface {v1}, Lcom/daaw/i42;->zzh()Z

    move-result v1

    const-wide/16 v2, 0x0

    if-nez v1, :cond_0

    return-wide v2

    :cond_0
    iget-object v1, v0, Lcom/daaw/ys8;->K:Lcom/daaw/i42;

    invoke-interface {v1, v7, v8}, Lcom/daaw/i42;->b(J)Lcom/daaw/g42;

    move-result-object v1

    iget-object v4, v1, Lcom/daaw/g42;->a:Lcom/daaw/j42;

    iget-wide v10, v4, Lcom/daaw/j42;->a:J

    iget-object v1, v1, Lcom/daaw/g42;->b:Lcom/daaw/j42;

    iget-wide v12, v1, Lcom/daaw/j42;->a:J

    iget-wide v4, v9, Lcom/daaw/aa8;->a:J

    cmp-long v1, v4, v2

    if-nez v1, :cond_2

    iget-wide v4, v9, Lcom/daaw/aa8;->b:J

    cmp-long v1, v4, v2

    if-nez v1, :cond_1

    move-wide v12, v7

    goto :goto_4

    :cond_1
    move-wide v3, v2

    goto :goto_0

    :cond_2
    move-wide v3, v4

    :goto_0
    const-wide/high16 v5, -0x8000000000000000L

    move-wide/from16 v1, p1

    invoke-static/range {v1 .. v6}, Lcom/daaw/it5;->h0(JJJ)J

    move-result-wide v14

    iget-wide v3, v9, Lcom/daaw/aa8;->b:J

    const-wide v5, 0x7fffffffffffffffL

    invoke-static/range {v1 .. v6}, Lcom/daaw/it5;->a0(JJJ)J

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    cmp-long v5, v14, v10

    if-gtz v5, :cond_3

    cmp-long v5, v10, v1

    if-gtz v5, :cond_3

    const/4 v5, 0x1

    goto :goto_1

    :cond_3
    const/4 v5, 0x0

    :goto_1
    cmp-long v6, v14, v12

    if-gtz v6, :cond_4

    cmp-long v6, v12, v1

    if-gtz v6, :cond_4

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    :goto_2
    if-eqz v5, :cond_6

    if-eqz v3, :cond_6

    sub-long v1, v10, v7

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    sub-long v3, v12, v7

    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-gtz v5, :cond_5

    goto :goto_3

    :cond_5
    return-wide v12

    :cond_6
    if-eqz v5, :cond_7

    :goto_3
    move-wide v12, v10

    goto :goto_4

    :cond_7
    if-eqz v3, :cond_8

    :goto_4
    return-wide v12

    :cond_8
    return-wide v14
.end method

.method public final i(Lcom/daaw/i42;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ys8;->B:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/ss8;

    invoke-direct {v1, p0, p1}, Lcom/daaw/ss8;-><init>(Lcom/daaw/ys8;Lcom/daaw/i42;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final j(J)V
    .locals 0

    return-void
.end method

.method public final k([Lcom/daaw/tv8;[Z[Lcom/daaw/mt8;[ZJ)J
    .locals 7

    invoke-virtual {p0}, Lcom/daaw/ys8;->A()V

    iget-object v0, p0, Lcom/daaw/ys8;->J:Lcom/daaw/xs8;

    iget-object v1, v0, Lcom/daaw/xs8;->a:Lcom/daaw/au8;

    iget-object v0, v0, Lcom/daaw/xs8;->c:[Z

    iget v2, p0, Lcom/daaw/ys8;->Q:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    array-length v5, p1

    if-ge v4, v5, :cond_2

    aget-object v5, p3, v4

    if-eqz v5, :cond_1

    aget-object v6, p1, v4

    if-eqz v6, :cond_0

    aget-boolean v6, p2, v4

    if-nez v6, :cond_1

    :cond_0
    check-cast v5, Lcom/daaw/vs8;

    invoke-static {v5}, Lcom/daaw/vs8;->c(Lcom/daaw/vs8;)I

    move-result v5

    aget-boolean v6, v0, v5

    invoke-static {v6}, Lcom/daaw/uo4;->f(Z)V

    iget v6, p0, Lcom/daaw/ys8;->Q:I

    add-int/lit8 v6, v6, -0x1

    iput v6, p0, Lcom/daaw/ys8;->Q:I

    aput-boolean v3, v0, v5

    const/4 v5, 0x0

    aput-object v5, p3, v4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    iget-boolean p2, p0, Lcom/daaw/ys8;->O:Z

    const-wide/16 v4, 0x0

    const/4 v6, 0x1

    if-eqz p2, :cond_3

    if-nez v2, :cond_5

    goto :goto_1

    :cond_3
    cmp-long p2, p5, v4

    if-eqz p2, :cond_4

    :goto_1
    const/4 p2, 0x1

    goto :goto_2

    :cond_4
    move-wide p5, v4

    :cond_5
    const/4 p2, 0x0

    :goto_2
    const/4 v2, 0x0

    :goto_3
    array-length v4, p1

    if-ge v2, v4, :cond_a

    aget-object v4, p3, v2

    if-nez v4, :cond_9

    aget-object v4, p1, v2

    if-eqz v4, :cond_9

    invoke-interface {v4}, Lcom/daaw/xv8;->zzc()I

    move-result v5

    if-ne v5, v6, :cond_6

    const/4 v5, 0x1

    goto :goto_4

    :cond_6
    const/4 v5, 0x0

    :goto_4
    invoke-static {v5}, Lcom/daaw/uo4;->f(Z)V

    invoke-interface {v4, v3}, Lcom/daaw/xv8;->a(I)I

    move-result v5

    if-nez v5, :cond_7

    const/4 v5, 0x1

    goto :goto_5

    :cond_7
    const/4 v5, 0x0

    :goto_5
    invoke-static {v5}, Lcom/daaw/uo4;->f(Z)V

    invoke-interface {v4}, Lcom/daaw/xv8;->zze()Lcom/daaw/r84;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/daaw/au8;->a(Lcom/daaw/r84;)I

    move-result v4

    aget-boolean v5, v0, v4

    xor-int/2addr v5, v6

    invoke-static {v5}, Lcom/daaw/uo4;->f(Z)V

    iget v5, p0, Lcom/daaw/ys8;->Q:I

    add-int/2addr v5, v6

    iput v5, p0, Lcom/daaw/ys8;->Q:I

    aput-boolean v6, v0, v4

    new-instance v5, Lcom/daaw/vs8;

    invoke-direct {v5, p0, v4}, Lcom/daaw/vs8;-><init>(Lcom/daaw/ys8;I)V

    aput-object v5, p3, v2

    aput-boolean v6, p4, v2

    if-nez p2, :cond_9

    iget-object p2, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    aget-object p2, p2, v4

    invoke-virtual {p2, p5, p6, v6}, Lcom/daaw/lt8;->K(JZ)Z

    move-result v4

    if-nez v4, :cond_8

    invoke-virtual {p2}, Lcom/daaw/lt8;->s()I

    move-result p2

    if-eqz p2, :cond_8

    const/4 p2, 0x1

    goto :goto_6

    :cond_8
    const/4 p2, 0x0

    :cond_9
    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_a
    iget p1, p0, Lcom/daaw/ys8;->Q:I

    if-nez p1, :cond_d

    iput-boolean v3, p0, Lcom/daaw/ys8;->U:Z

    iput-boolean v3, p0, Lcom/daaw/ys8;->P:Z

    iget-object p1, p0, Lcom/daaw/ys8;->w:Lcom/daaw/bx8;

    invoke-virtual {p1}, Lcom/daaw/bx8;->l()Z

    move-result p1

    if-eqz p1, :cond_c

    iget-object p1, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    array-length p2, p1

    :goto_7
    if-ge v3, p2, :cond_b

    aget-object p3, p1, v3

    invoke-virtual {p3}, Lcom/daaw/lt8;->z()V

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_b
    iget-object p1, p0, Lcom/daaw/ys8;->w:Lcom/daaw/bx8;

    invoke-virtual {p1}, Lcom/daaw/bx8;->g()V

    goto :goto_a

    :cond_c
    iget-object p1, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    array-length p2, p1

    const/4 p3, 0x0

    :goto_8
    if-ge p3, p2, :cond_f

    aget-object p4, p1, p3

    invoke-virtual {p4, v3}, Lcom/daaw/lt8;->E(Z)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_8

    :cond_d
    if-eqz p2, :cond_f

    invoke-virtual {p0, p5, p6}, Lcom/daaw/ys8;->b(J)J

    move-result-wide p5

    :goto_9
    array-length p1, p3

    if-ge v3, p1, :cond_f

    aget-object p1, p3, v3

    if-eqz p1, :cond_e

    aput-boolean v6, p4, v3

    :cond_e
    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_f
    :goto_a
    iput-boolean v6, p0, Lcom/daaw/ys8;->O:Z

    return-wide p5
.end method

.method public final l(Lcom/daaw/f92;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/ys8;->B:Landroid/os/Handler;

    iget-object v0, p0, Lcom/daaw/ys8;->z:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final bridge synthetic m(Lcom/daaw/xw8;JJLjava/io/IOException;I)Lcom/daaw/vw8;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Lcom/daaw/ts8;

    invoke-static {v1}, Lcom/daaw/ts8;->e(Lcom/daaw/ts8;)Lcom/daaw/ny6;

    move-result-object v2

    new-instance v15, Lcom/daaw/ar8;

    invoke-static {v1}, Lcom/daaw/ts8;->b(Lcom/daaw/ts8;)J

    move-result-wide v4

    invoke-static {v1}, Lcom/daaw/ts8;->d(Lcom/daaw/ts8;)Lcom/daaw/pa6;

    move-result-object v6

    invoke-virtual {v2}, Lcom/daaw/ny6;->l()Landroid/net/Uri;

    move-result-object v7

    invoke-virtual {v2}, Lcom/daaw/ny6;->m()Ljava/util/Map;

    move-result-object v8

    invoke-virtual {v2}, Lcom/daaw/ny6;->k()J

    move-result-wide v13

    move-object v3, v15

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lcom/daaw/ar8;-><init>(JLcom/daaw/pa6;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    new-instance v2, Lcom/daaw/lr8;

    invoke-static {v1}, Lcom/daaw/ts8;->c(Lcom/daaw/ts8;)J

    move-result-wide v3

    invoke-static {v3, v4}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v22

    iget-wide v3, v0, Lcom/daaw/ys8;->L:J

    invoke-static {v3, v4}, Lcom/daaw/it5;->j0(J)J

    move-result-wide v24

    const/16 v17, 0x1

    const/16 v18, -0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v16, v2

    invoke-direct/range {v16 .. v25}, Lcom/daaw/lr8;-><init>(IILcom/daaw/f92;ILjava/lang/Object;JJ)V

    new-instance v3, Lcom/daaw/sw8;

    move-object/from16 v14, p6

    move/from16 v4, p7

    invoke-direct {v3, v15, v2, v14, v4}, Lcom/daaw/sw8;-><init>(Lcom/daaw/ar8;Lcom/daaw/lr8;Ljava/io/IOException;I)V

    iget-object v2, v3, Lcom/daaw/sw8;->c:Ljava/io/IOException;

    instance-of v4, v2, Lcom/daaw/dl3;

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v4, :cond_2

    instance-of v4, v2, Ljava/io/FileNotFoundException;

    if-nez v4, :cond_2

    instance-of v4, v2, Lcom/daaw/zo6;

    if-nez v4, :cond_2

    instance-of v4, v2, Lcom/daaw/ax8;

    if-nez v4, :cond_2

    :goto_0
    if-eqz v2, :cond_1

    instance-of v4, v2, Lcom/daaw/s56;

    if-eqz v4, :cond_0

    move-object v4, v2

    check-cast v4, Lcom/daaw/s56;

    iget v4, v4, Lcom/daaw/s56;->p:I

    const/16 v7, 0x7d8

    if-ne v4, v7, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    goto :goto_0

    :cond_1
    iget v2, v3, Lcom/daaw/sw8;->d:I

    add-int/lit8 v2, v2, -0x1

    mul-int/lit16 v2, v2, 0x3e8

    const/16 v3, 0x1388

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    int-to-long v2, v2

    goto :goto_2

    :cond_2
    :goto_1
    move-wide v2, v5

    :goto_2
    const/4 v4, 0x1

    cmp-long v7, v2, v5

    if-nez v7, :cond_3

    sget-object v2, Lcom/daaw/bx8;->g:Lcom/daaw/vw8;

    goto :goto_7

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ys8;->x()I

    move-result v7

    iget v8, v0, Lcom/daaw/ys8;->V:I

    const/4 v9, 0x0

    if-le v7, v8, :cond_4

    const/4 v8, 0x1

    goto :goto_3

    :cond_4
    const/4 v8, 0x0

    :goto_3
    iget-boolean v10, v0, Lcom/daaw/ys8;->R:Z

    if-nez v10, :cond_8

    iget-object v10, v0, Lcom/daaw/ys8;->K:Lcom/daaw/i42;

    if-eqz v10, :cond_5

    invoke-interface {v10}, Lcom/daaw/i42;->zze()J

    move-result-wide v10

    cmp-long v12, v10, v5

    if-eqz v12, :cond_5

    goto :goto_5

    :cond_5
    iget-boolean v5, v0, Lcom/daaw/ys8;->H:Z

    if-eqz v5, :cond_6

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/ys8;->G()Z

    move-result v6

    if-nez v6, :cond_6

    iput-boolean v4, v0, Lcom/daaw/ys8;->U:Z

    sget-object v2, Lcom/daaw/bx8;->f:Lcom/daaw/vw8;

    goto :goto_7

    :cond_6
    iput-boolean v5, v0, Lcom/daaw/ys8;->P:Z

    const-wide/16 v5, 0x0

    iput-wide v5, v0, Lcom/daaw/ys8;->S:J

    iput v9, v0, Lcom/daaw/ys8;->V:I

    iget-object v7, v0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    array-length v10, v7

    const/4 v11, 0x0

    :goto_4
    if-ge v11, v10, :cond_7

    aget-object v12, v7, v11

    invoke-virtual {v12, v9}, Lcom/daaw/lt8;->E(Z)V

    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    :cond_7
    invoke-static {v1, v5, v6, v5, v6}, Lcom/daaw/ts8;->f(Lcom/daaw/ts8;JJ)V

    goto :goto_6

    :cond_8
    :goto_5
    iput v7, v0, Lcom/daaw/ys8;->V:I

    :goto_6
    invoke-static {v8, v2, v3}, Lcom/daaw/bx8;->b(ZJ)Lcom/daaw/vw8;

    move-result-object v2

    :goto_7
    invoke-virtual {v2}, Lcom/daaw/vw8;->c()Z

    move-result v3

    xor-int/lit8 v16, v3, 0x1

    iget-object v3, v0, Lcom/daaw/ys8;->s:Lcom/daaw/yr8;

    const/4 v5, 0x1

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static {v1}, Lcom/daaw/ts8;->c(Lcom/daaw/ts8;)J

    move-result-wide v10

    iget-wide v12, v0, Lcom/daaw/ys8;->L:J

    move-object v4, v15

    move-object/from16 v14, p6

    move/from16 v15, v16

    invoke-virtual/range {v3 .. v15}, Lcom/daaw/yr8;->j(Lcom/daaw/ar8;IILcom/daaw/f92;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    if-eqz v16, :cond_9

    invoke-static {v1}, Lcom/daaw/ts8;->b(Lcom/daaw/ts8;)J

    :cond_9
    return-object v2
.end method

.method public final n(II)Lcom/daaw/m42;
    .locals 1

    new-instance p2, Lcom/daaw/ws8;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lcom/daaw/ws8;-><init>(IZ)V

    invoke-virtual {p0, p2}, Lcom/daaw/ys8;->z(Lcom/daaw/ws8;)Lcom/daaw/m42;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic q()V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/ys8;->X:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ys8;->C:Lcom/daaw/mr8;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, p0}, Lcom/daaw/nt8;->a(Lcom/daaw/vt8;)V

    :cond_0
    return-void
.end method

.method public final synthetic r()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ys8;->R:Z

    return-void
.end method

.method public final synthetic s(Lcom/daaw/i42;)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/ys8;->D:Lcom/google/android/gms/internal/ads/zzacn;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/h42;

    const-wide/16 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/h42;-><init>(JJ)V

    :goto_0
    iput-object v0, p0, Lcom/daaw/ys8;->K:Lcom/daaw/i42;

    invoke-interface {p1}, Lcom/daaw/i42;->zze()J

    move-result-wide v3

    iput-wide v3, p0, Lcom/daaw/ys8;->L:J

    iget-boolean v0, p0, Lcom/daaw/ys8;->R:Z

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v0, :cond_1

    invoke-interface {p1}, Lcom/daaw/i42;->zze()J

    move-result-wide v5

    cmp-long v0, v5, v1

    if-nez v0, :cond_1

    const/4 v3, 0x1

    :cond_1
    iput-boolean v3, p0, Lcom/daaw/ys8;->M:Z

    if-eq v4, v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v4, 0x7

    :goto_1
    iput v4, p0, Lcom/daaw/ys8;->N:I

    iget-object v0, p0, Lcom/daaw/ys8;->u:Lcom/daaw/us8;

    iget-wide v1, p0, Lcom/daaw/ys8;->L:J

    invoke-interface {p1}, Lcom/daaw/i42;->zzh()Z

    move-result p1

    iget-boolean v3, p0, Lcom/daaw/ys8;->M:Z

    invoke-interface {v0, v1, v2, p1, v3}, Lcom/daaw/us8;->c(JZZ)V

    iget-boolean p1, p0, Lcom/daaw/ys8;->H:Z

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lcom/daaw/ys8;->B()V

    :cond_3
    return-void
.end method

.method public final t()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ys8;->w:Lcom/daaw/bx8;

    iget v1, p0, Lcom/daaw/ys8;->N:I

    invoke-static {v1}, Lcom/daaw/rw8;->a(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/bx8;->i(I)V

    return-void
.end method

.method public final u(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    aget-object p1, v0, p1

    invoke-virtual {p1}, Lcom/daaw/lt8;->B()V

    invoke-virtual {p0}, Lcom/daaw/ys8;->t()V

    return-void
.end method

.method public final v()V
    .locals 4

    iget-boolean v0, p0, Lcom/daaw/ys8;->H:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lcom/daaw/lt8;->C()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/ys8;->w:Lcom/daaw/bx8;

    invoke-virtual {v0, p0}, Lcom/daaw/bx8;->j(Lcom/daaw/yw8;)V

    iget-object v0, p0, Lcom/daaw/ys8;->B:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/daaw/ys8;->C:Lcom/daaw/mr8;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ys8;->X:Z

    return-void
.end method

.method public final w(I)Z
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/ys8;->G()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    aget-object p1, v0, p1

    iget-boolean v0, p0, Lcom/daaw/ys8;->W:Z

    invoke-virtual {p1, v0}, Lcom/daaw/lt8;->J(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final x()I
    .locals 5

    iget-object v0, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    invoke-virtual {v4}, Lcom/daaw/lt8;->u()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method

.method public final y(Z)J
    .locals 5

    const-wide/high16 v0, -0x8000000000000000L

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    array-length v4, v3

    if-ge v2, v4, :cond_2

    if-nez p1, :cond_0

    iget-object v4, p0, Lcom/daaw/ys8;->J:Lcom/daaw/xs8;

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v4, Lcom/daaw/xs8;->c:[Z

    aget-boolean v4, v4, v2

    if-eqz v4, :cond_1

    :cond_0
    aget-object v3, v3, v2

    invoke-virtual {v3}, Lcom/daaw/lt8;->w()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-wide v0
.end method

.method public final z(Lcom/daaw/ws8;)Lcom/daaw/m42;
    .locals 6

    iget-object v0, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lcom/daaw/ys8;->F:[Lcom/daaw/ws8;

    aget-object v2, v2, v1

    invoke-virtual {p1, v2}, Lcom/daaw/ws8;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    aget-object p1, p1, v1

    return-object p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/daaw/ys8;->Z:Lcom/daaw/nw8;

    iget-object v2, p0, Lcom/daaw/ys8;->r:Lcom/daaw/vn8;

    iget-object v3, p0, Lcom/daaw/ys8;->t:Lcom/daaw/jn8;

    new-instance v4, Lcom/daaw/lt8;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v2, v3, v5}, Lcom/daaw/lt8;-><init>(Lcom/daaw/nw8;Lcom/daaw/vn8;Lcom/daaw/jn8;[B)V

    invoke-virtual {v4, p0}, Lcom/daaw/lt8;->G(Lcom/daaw/kt8;)V

    add-int/lit8 v1, v0, 0x1

    iget-object v2, p0, Lcom/daaw/ys8;->F:[Lcom/daaw/ws8;

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lcom/daaw/ws8;

    aput-object p1, v2, v0

    invoke-static {v2}, Lcom/daaw/it5;->D([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/daaw/ws8;

    iput-object p1, p0, Lcom/daaw/ys8;->F:[Lcom/daaw/ws8;

    iget-object p1, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/daaw/lt8;

    aput-object v4, p1, v0

    invoke-static {p1}, Lcom/daaw/it5;->D([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lcom/daaw/lt8;

    iput-object p1, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    return-object v4
.end method

.method public final zzC()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ys8;->G:Z

    iget-object v0, p0, Lcom/daaw/ys8;->B:Landroid/os/Handler;

    iget-object v1, p0, Lcom/daaw/ys8;->z:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final zzb()J
    .locals 11

    invoke-virtual {p0}, Lcom/daaw/ys8;->A()V

    iget-boolean v0, p0, Lcom/daaw/ys8;->W:Z

    const-wide/high16 v1, -0x8000000000000000L

    if-nez v0, :cond_7

    iget v0, p0, Lcom/daaw/ys8;->Q:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/ys8;->F()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-wide v0, p0, Lcom/daaw/ys8;->T:J

    return-wide v0

    :cond_1
    iget-boolean v0, p0, Lcom/daaw/ys8;->I:Z

    const/4 v3, 0x0

    const-wide v4, 0x7fffffffffffffffL

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    array-length v0, v0

    move-wide v7, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v0, :cond_4

    iget-object v9, p0, Lcom/daaw/ys8;->J:Lcom/daaw/xs8;

    iget-object v10, v9, Lcom/daaw/xs8;->b:[Z

    aget-boolean v10, v10, v6

    if-eqz v10, :cond_2

    iget-object v9, v9, Lcom/daaw/xs8;->c:[Z

    aget-boolean v9, v9, v6

    if-eqz v9, :cond_2

    iget-object v9, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    aget-object v9, v9, v6

    invoke-virtual {v9}, Lcom/daaw/lt8;->I()Z

    move-result v9

    if-nez v9, :cond_2

    iget-object v9, p0, Lcom/daaw/ys8;->E:[Lcom/daaw/lt8;

    aget-object v9, v9, v6

    invoke-virtual {v9}, Lcom/daaw/lt8;->w()J

    move-result-wide v9

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    move-wide v7, v4

    :cond_4
    cmp-long v0, v7, v4

    if-nez v0, :cond_5

    invoke-virtual {p0, v3}, Lcom/daaw/ys8;->y(Z)J

    move-result-wide v7

    :cond_5
    cmp-long v0, v7, v1

    if-nez v0, :cond_6

    iget-wide v0, p0, Lcom/daaw/ys8;->S:J

    return-wide v0

    :cond_6
    return-wide v7

    :cond_7
    :goto_1
    return-wide v1
.end method

.method public final zzc()J
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/ys8;->zzb()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzd()J
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/ys8;->P:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/ys8;->W:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/ys8;->x()I

    move-result v0

    iget v1, p0, Lcom/daaw/ys8;->V:I

    if-le v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/ys8;->P:Z

    iget-wide v0, p0, Lcom/daaw/ys8;->S:J

    return-wide v0

    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method public final zzh()Lcom/daaw/au8;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/ys8;->A()V

    iget-object v0, p0, Lcom/daaw/ys8;->J:Lcom/daaw/xs8;

    iget-object v0, v0, Lcom/daaw/xs8;->a:Lcom/daaw/au8;

    return-object v0
.end method

.method public final zzk()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/ys8;->t()V

    iget-boolean v0, p0, Lcom/daaw/ys8;->W:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/daaw/ys8;->H:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const-string v1, "Loading finished before preparation is complete."

    invoke-static {v1, v0}, Lcom/daaw/dl3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/daaw/dl3;

    move-result-object v0

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final zzp()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/ys8;->w:Lcom/daaw/bx8;

    invoke-virtual {v0}, Lcom/daaw/bx8;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ys8;->y:Lcom/daaw/ds4;

    invoke-virtual {v0}, Lcom/daaw/ds4;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
