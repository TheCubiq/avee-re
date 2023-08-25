.class public final Lcom/daaw/l44;
.super Lcom/daaw/p24;
.source ""

# interfaces
.implements Lcom/daaw/zy2;
.implements Lcom/daaw/tv2;
.implements Lcom/daaw/l03;
.implements Lcom/daaw/dr2;
.implements Lcom/daaw/lp2;


# static fields
.field public static final synthetic L:I


# instance fields
.field public final A:Ljava/lang/ref/WeakReference;

.field public B:Lcom/daaw/o24;

.field public C:I

.field public D:I

.field public E:J

.field public final F:Ljava/lang/String;

.field public final G:I

.field public final H:Ljava/lang/Object;

.field public final I:Ljava/util/ArrayList;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "httpDataSourcesLock"
    .end annotation
.end field

.field public volatile J:Lcom/daaw/x34;

.field public final K:Ljava/util/Set;

.field public final r:Landroid/content/Context;

.field public final s:Lcom/daaw/y34;

.field public final t:Lcom/daaw/gq2;

.field public final u:Lcom/daaw/gq2;

.field public final v:Lcom/daaw/bx2;

.field public final w:Lcom/daaw/x24;

.field public x:Lcom/daaw/op2;

.field public y:Ljava/nio/ByteBuffer;

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/x24;Lcom/daaw/y24;)V
    .locals 11

    invoke-direct {p0}, Lcom/daaw/p24;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/l44;->H:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/daaw/l44;->K:Ljava/util/Set;

    iput-object p1, p0, Lcom/daaw/l44;->r:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/l44;->w:Lcom/daaw/x24;

    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/daaw/l44;->A:Ljava/lang/ref/WeakReference;

    new-instance p2, Lcom/daaw/y34;

    invoke-direct {p2}, Lcom/daaw/y34;-><init>()V

    iput-object p2, p0, Lcom/daaw/l44;->s:Lcom/daaw/y34;

    new-instance v8, Lcom/daaw/a03;

    sget-object v9, Lcom/daaw/su2;->a:Lcom/daaw/su2;

    sget-object v10, Lcom/google/android/gms/ads/internal/util/zzs;->zza:Lcom/daaw/gv6;

    const-wide/16 v3, 0x0

    const/4 v7, -0x1

    move-object v0, v8

    move-object v1, p1

    move-object v2, v9

    move-object v5, v10

    move-object v6, p0

    invoke-direct/range {v0 .. v7}, Lcom/daaw/a03;-><init>(Landroid/content/Context;Lcom/daaw/su2;JLandroid/os/Handler;Lcom/daaw/l03;I)V

    iput-object v8, p0, Lcom/daaw/l44;->t:Lcom/daaw/gq2;

    new-instance p1, Lcom/daaw/sr2;

    const/4 v2, 0x0

    const/4 v3, 0x1

    move-object v0, p1

    move-object v1, v9

    move-object v4, v10

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lcom/daaw/sr2;-><init>(Lcom/daaw/su2;Lcom/daaw/ks2;ZLandroid/os/Handler;Lcom/daaw/dr2;)V

    iput-object p1, p0, Lcom/daaw/l44;->u:Lcom/daaw/gq2;

    new-instance v0, Lcom/daaw/xw2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/xw2;-><init>(Lcom/daaw/cx2;)V

    iput-object v0, p0, Lcom/daaw/l44;->v:Lcom/daaw/bx2;

    invoke-static {}, Lcom/google/android/gms/ads/internal/util/zze;->zzc()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "ForkedExoPlayerAdapter initialize "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    :cond_0
    sget-object v2, Lcom/daaw/p24;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/daaw/gq2;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object v8, v2, p1

    invoke-static {v2, v0, p2}, Lcom/daaw/pp2;->a([Lcom/daaw/gq2;Lcom/daaw/fx2;Lcom/daaw/y34;)Lcom/daaw/op2;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    invoke-interface {p1, p0}, Lcom/daaw/op2;->r(Lcom/daaw/lp2;)V

    iput v3, p0, Lcom/daaw/l44;->C:I

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lcom/daaw/l44;->E:J

    iput v3, p0, Lcom/daaw/l44;->D:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/daaw/l44;->I:Ljava/util/ArrayList;

    iput-object v1, p0, Lcom/daaw/l44;->J:Lcom/daaw/x34;

    if-eqz p3, :cond_1

    invoke-interface {p3}, Lcom/daaw/y24;->zzt()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p3}, Lcom/daaw/y24;->zzt()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const-string p1, ""

    :goto_0
    iput-object p1, p0, Lcom/daaw/l44;->F:Ljava/lang/String;

    if-eqz p3, :cond_2

    invoke-interface {p3}, Lcom/daaw/y24;->zzh()I

    move-result v3

    :cond_2
    iput v3, p0, Lcom/daaw/l44;->G:I

    sget-object p1, Lcom/daaw/g93;->n:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    invoke-interface {p1}, Lcom/daaw/op2;->zzg()V

    :cond_3
    if-eqz p3, :cond_4

    invoke-interface {p3}, Lcom/daaw/y24;->zzg()I

    move-result p1

    if-lez p1, :cond_4

    iget-object p1, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    invoke-interface {p3}, Lcom/daaw/y24;->zzg()I

    move-result p2

    invoke-interface {p1, p2}, Lcom/daaw/op2;->q(I)V

    :cond_4
    if-eqz p3, :cond_5

    invoke-interface {p3}, Lcom/daaw/y24;->zzf()I

    move-result p1

    if-lez p1, :cond_5

    iget-object p1, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    invoke-interface {p3}, Lcom/daaw/y24;->zzf()I

    move-result p2

    invoke-interface {p1, p2}, Lcom/daaw/op2;->p(I)V

    :cond_5
    sget-object p1, Lcom/daaw/g93;->p:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    invoke-interface {p1}, Lcom/daaw/op2;->zzi()V

    iget-object p1, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    sget-object p2, Lcom/daaw/g93;->q:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, p2}, Lcom/daaw/op2;->i(I)V

    :cond_6
    return-void
.end method


# virtual methods
.method public final A(IJ)V
    .locals 0

    iget p2, p0, Lcom/daaw/l44;->D:I

    add-int/2addr p2, p1

    iput p2, p0, Lcom/daaw/l44;->D:I

    return-void
.end method

.method public final B(ZI)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/l44;->B:Lcom/daaw/o24;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Lcom/daaw/o24;->c(I)V

    :cond_0
    return-void
.end method

.method public final C(Landroid/view/Surface;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/l44;->B:Lcom/daaw/o24;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/daaw/o24;->zzv()V

    :cond_0
    return-void
.end method

.method public final E()J
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/l44;->l0()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/daaw/l44;->C:I

    int-to-long v0, v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final F()J
    .locals 10

    invoke-virtual {p0}, Lcom/daaw/l44;->l0()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/daaw/l44;->H:Ljava/lang/Object;

    monitor-enter v0

    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/daaw/l44;->I:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget-wide v1, p0, Lcom/daaw/l44;->E:J

    iget-object v3, p0, Lcom/daaw/l44;->I:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/ty2;

    invoke-interface {v3}, Lcom/daaw/ty2;->zze()Ljava/util/Map;

    move-result-object v3

    const-wide/16 v5, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :catch_0
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v7, :cond_0

    :try_start_1
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_0

    const-string v8, "content-length"

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/CharSequence;

    invoke-static {v8, v9}, Lcom/daaw/wx6;->c(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    add-long/2addr v1, v5

    :try_start_2
    iput-wide v1, p0, Lcom/daaw/l44;->E:J

    goto :goto_0

    :cond_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-wide v0, p0, Lcom/daaw/l44;->E:J

    return-wide v0

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1

    :cond_3
    iget-object v0, p0, Lcom/daaw/l44;->J:Lcom/daaw/x34;

    invoke-virtual {v0}, Lcom/daaw/x34;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public final G([Landroid/net/Uri;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {p0, p1, p2, v1, v0}, Lcom/daaw/l44;->H([Landroid/net/Uri;Ljava/lang/String;Ljava/nio/ByteBuffer;Z)V

    return-void
.end method

.method public final H([Landroid/net/Uri;Ljava/lang/String;Ljava/nio/ByteBuffer;Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iput-object p3, p0, Lcom/daaw/l44;->y:Ljava/nio/ByteBuffer;

    iput-boolean p4, p0, Lcom/daaw/l44;->z:Z

    array-length p3, p1

    const/4 p4, 0x0

    const/4 v0, 0x1

    if-ne p3, v0, :cond_1

    aget-object p1, p1, p4

    invoke-virtual {p0, p1, p2}, Lcom/daaw/l44;->m0(Landroid/net/Uri;Ljava/lang/String;)Lcom/daaw/yv2;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-array p3, p3, [Lcom/daaw/yv2;

    :goto_0
    array-length v0, p1

    if-ge p4, v0, :cond_2

    aget-object v0, p1, p4

    invoke-virtual {p0, v0, p2}, Lcom/daaw/l44;->m0(Landroid/net/Uri;Ljava/lang/String;)Lcom/daaw/yv2;

    move-result-object v0

    aput-object v0, p3, p4

    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Lcom/daaw/cw2;

    invoke-direct {p1, p3}, Lcom/daaw/cw2;-><init>([Lcom/daaw/yv2;)V

    :goto_1
    iget-object p2, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    invoke-interface {p2, p1}, Lcom/daaw/op2;->m(Lcom/daaw/yv2;)V

    sget-object p1, Lcom/daaw/p24;->q:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public final I()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lcom/daaw/op2;->l(Lcom/daaw/lp2;)V

    iget-object v0, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    invoke-interface {v0}, Lcom/daaw/op2;->zzk()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    sget-object v0, Lcom/daaw/p24;->q:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    :cond_0
    return-void
.end method

.method public final J(J)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    invoke-interface {v0, p1, p2}, Lcom/daaw/op2;->j(J)V

    return-void
.end method

.method public final K(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/l44;->s:Lcom/daaw/y34;

    invoke-virtual {v0, p1}, Lcom/daaw/y34;->f(I)V

    return-void
.end method

.method public final L(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/l44;->s:Lcom/daaw/y34;

    invoke-virtual {v0, p1}, Lcom/daaw/y34;->g(I)V

    return-void
.end method

.method public final M(Lcom/daaw/o24;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/l44;->B:Lcom/daaw/o24;

    return-void
.end method

.method public final N(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/l44;->s:Lcom/daaw/y34;

    invoke-virtual {v0, p1}, Lcom/daaw/y34;->h(I)V

    return-void
.end method

.method public final O(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/l44;->s:Lcom/daaw/y34;

    invoke-virtual {v0, p1}, Lcom/daaw/y34;->i(I)V

    return-void
.end method

.method public final P(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    invoke-interface {v0, p1}, Lcom/daaw/op2;->k(Z)V

    return-void
.end method

.method public final Q(Z)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/daaw/l44;->v:Lcom/daaw/bx2;

    xor-int/lit8 v2, p1, 0x1

    invoke-virtual {v1, v0, v2}, Lcom/daaw/bx2;->f(IZ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final R(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/l44;->K:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/v34;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lcom/daaw/v34;->e(I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final S(Landroid/view/Surface;Z)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lcom/daaw/np2;

    iget-object v2, p0, Lcom/daaw/l44;->t:Lcom/daaw/gq2;

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, p1}, Lcom/daaw/np2;-><init>(Lcom/daaw/mp2;ILjava/lang/Object;)V

    const/4 p1, 0x0

    if-eqz p2, :cond_1

    new-array p2, v3, [Lcom/daaw/np2;

    aput-object v1, p2, p1

    invoke-interface {v0, p2}, Lcom/daaw/op2;->n([Lcom/daaw/np2;)V

    return-void

    :cond_1
    new-array p2, v3, [Lcom/daaw/np2;

    aput-object v1, p2, p1

    invoke-interface {v0, p2}, Lcom/daaw/op2;->o([Lcom/daaw/np2;)V

    return-void
.end method

.method public final T(FZ)V
    .locals 2

    iget-object p2, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    if-nez p2, :cond_0

    return-void

    :cond_0
    new-instance p2, Lcom/daaw/np2;

    iget-object v0, p0, Lcom/daaw/l44;->u:Lcom/daaw/gq2;

    const/4 v1, 0x2

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-direct {p2, v0, v1, p1}, Lcom/daaw/np2;-><init>(Lcom/daaw/mp2;ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/daaw/np2;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    invoke-interface {p1, v0}, Lcom/daaw/op2;->o([Lcom/daaw/np2;)V

    return-void
.end method

.method public final U()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    invoke-interface {v0}, Lcom/daaw/op2;->zzr()V

    return-void
.end method

.method public final V()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final W()I
    .locals 1

    iget v0, p0, Lcom/daaw/l44;->D:I

    return v0
.end method

.method public final Y()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    invoke-interface {v0}, Lcom/daaw/op2;->zza()I

    move-result v0

    return v0
.end method

.method public final a0()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    invoke-interface {v0}, Lcom/daaw/op2;->zzb()J

    move-result-wide v0

    return-wide v0
.end method

.method public final b0()J
    .locals 2

    iget v0, p0, Lcom/daaw/l44;->C:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final c(Ljava/io/IOException;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/l44;->B:Lcom/daaw/o24;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/daaw/l44;->w:Lcom/daaw/x24;

    iget-boolean v1, v1, Lcom/daaw/x24;->l:Z

    if-eqz v1, :cond_0

    const-string v1, "onLoadException"

    invoke-interface {v0, v1, p1}, Lcom/daaw/o24;->d(Ljava/lang/String;Ljava/lang/Exception;)V

    return-void

    :cond_0
    const-string v1, "onLoadError"

    invoke-interface {v0, v1, p1}, Lcom/daaw/o24;->f(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_1
    return-void
.end method

.method public final c0()J
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/l44;->l0()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/l44;->J:Lcom/daaw/x34;

    invoke-virtual {v0}, Lcom/daaw/x34;->h()Z

    move-result v0

    if-nez v0, :cond_1

    return-wide v1

    :cond_1
    iget v0, p0, Lcom/daaw/l44;->C:I

    int-to-long v0, v0

    iget-object v2, p0, Lcom/daaw/l44;->J:Lcom/daaw/x34;

    invoke-virtual {v2}, Lcom/daaw/x34;->c()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(Lcom/google/android/gms/internal/ads/zzatd;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/l44;->A:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/y24;

    sget-object v1, Lcom/daaw/g93;->F1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/zzatd;->t:Ljava/lang/String;

    const-string v3, "audioMime"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/zzatd;->u:Ljava/lang/String;

    const-string v3, "audioSampleMime"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzatd;->r:Ljava/lang/String;

    const-string v2, "audioCodec"

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "onMetadataEvent"

    invoke-interface {v0, p1, v1}, Lcom/daaw/uj3;->T(Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public final d0()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    invoke-interface {v0}, Lcom/daaw/op2;->zzc()J

    move-result-wide v0

    return-wide v0
.end method

.method public final e0()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/l44;->x:Lcom/daaw/op2;

    invoke-interface {v0}, Lcom/daaw/op2;->zzd()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic f0(Ljava/lang/String;Z)Lcom/daaw/kx2;
    .locals 6

    const/4 v0, 0x1

    if-eq v0, p2, :cond_0

    const/4 p2, 0x0

    move-object v2, p2

    goto :goto_0

    :cond_0
    move-object v2, p0

    :goto_0
    new-instance p2, Lcom/daaw/v34;

    iget-object v0, p0, Lcom/daaw/l44;->w:Lcom/daaw/x24;

    iget v3, v0, Lcom/daaw/x24;->d:I

    iget v4, v0, Lcom/daaw/x24;->f:I

    iget v5, v0, Lcom/daaw/x24;->i:I

    move-object v0, p2

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/daaw/v34;-><init>(Ljava/lang/String;Lcom/daaw/zy2;III)V

    iget-object p1, p0, Lcom/daaw/l44;->K:Ljava/util/Set;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p2
.end method

.method public final finalize()V
    .locals 2

    sget-object v0, Lcom/daaw/p24;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    invoke-static {}, Lcom/google/android/gms/ads/internal/util/zze;->zzc()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ForkedExoPlayerAdapter finalize "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final g(IIIF)V
    .locals 0

    iget-object p3, p0, Lcom/daaw/l44;->B:Lcom/daaw/o24;

    if-eqz p3, :cond_0

    invoke-interface {p3, p1, p2}, Lcom/daaw/o24;->g(II)V

    :cond_0
    return-void
.end method

.method public final synthetic g0(Ljava/lang/String;Z)Lcom/daaw/kx2;
    .locals 8

    const/4 v0, 0x1

    if-eq v0, p2, :cond_0

    const/4 p2, 0x0

    move-object v3, p2

    goto :goto_0

    :cond_0
    move-object v3, p0

    :goto_0
    new-instance p2, Lcom/daaw/ox2;

    iget-object v0, p0, Lcom/daaw/l44;->w:Lcom/daaw/x24;

    const/4 v2, 0x0

    iget v4, v0, Lcom/daaw/x24;->d:I

    iget v5, v0, Lcom/daaw/x24;->f:I

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v0, p2

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Lcom/daaw/ox2;-><init>(Ljava/lang/String;Lcom/daaw/kz2;Lcom/daaw/zy2;IIZLcom/daaw/sy2;)V

    return-object p2
.end method

.method public final h(Lcom/daaw/rw2;Lcom/daaw/dx2;)V
    .locals 0

    return-void
.end method

.method public final synthetic h0(Lcom/daaw/jx2;)Lcom/daaw/kx2;
    .locals 9

    new-instance v8, Lcom/daaw/x34;

    iget-object v1, p0, Lcom/daaw/l44;->r:Landroid/content/Context;

    invoke-interface {p1}, Lcom/daaw/jx2;->zza()Lcom/daaw/kx2;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/l44;->F:Ljava/lang/String;

    iget v4, p0, Lcom/daaw/l44;->G:I

    new-instance v6, Lcom/daaw/h44;

    invoke-direct {v6, p0}, Lcom/daaw/h44;-><init>(Lcom/daaw/l44;)V

    const/4 v7, 0x0

    move-object v0, v8

    move-object v5, p0

    invoke-direct/range {v0 .. v7}, Lcom/daaw/x34;-><init>(Landroid/content/Context;Lcom/daaw/kx2;Ljava/lang/String;ILcom/daaw/zy2;Lcom/daaw/h44;[B)V

    return-object v8
.end method

.method public final synthetic i(Ljava/lang/Object;I)V
    .locals 0

    iget p1, p0, Lcom/daaw/l44;->C:I

    add-int/2addr p1, p2

    iput p1, p0, Lcom/daaw/l44;->C:I

    return-void
.end method

.method public final synthetic i0(ZJ)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/l44;->B:Lcom/daaw/o24;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/o24;->e(ZJ)V

    :cond_0
    return-void
.end method

.method public final j0(Lcom/daaw/kx2;I)V
    .locals 0

    iget p1, p0, Lcom/daaw/l44;->C:I

    add-int/2addr p1, p2

    iput p1, p0, Lcom/daaw/l44;->C:I

    return-void
.end method

.method public final k0(Lcom/daaw/kx2;Lcom/daaw/mx2;)V
    .locals 2

    instance-of p2, p1, Lcom/daaw/ty2;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/l44;->H:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/l44;->I:Ljava/util/ArrayList;

    check-cast p1, Lcom/daaw/ty2;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    instance-of p2, p1, Lcom/daaw/x34;

    if-eqz p2, :cond_1

    check-cast p1, Lcom/daaw/x34;

    iput-object p1, p0, Lcom/daaw/l44;->J:Lcom/daaw/x34;

    iget-object p1, p0, Lcom/daaw/l44;->A:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/y24;

    sget-object p2, Lcom/daaw/g93;->F1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    if-eqz p1, :cond_1

    iget-object p2, p0, Lcom/daaw/l44;->J:Lcom/daaw/x34;

    invoke-virtual {p2}, Lcom/daaw/x34;->f()Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string v0, "gcacheHit"

    iget-object v1, p0, Lcom/daaw/l44;->J:Lcom/daaw/x34;

    invoke-virtual {v1}, Lcom/daaw/x34;->h()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "gcacheDownloaded"

    iget-object v1, p0, Lcom/daaw/l44;->J:Lcom/daaw/x34;

    invoke-virtual {v1}, Lcom/daaw/x34;->g()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/ads/internal/util/zzs;->zza:Lcom/daaw/gv6;

    new-instance v1, Lcom/daaw/i44;

    invoke-direct {v1, p1, p2}, Lcom/daaw/i44;-><init>(Lcom/daaw/y24;Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public final l0()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/l44;->J:Lcom/daaw/x34;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/l44;->J:Lcom/daaw/x34;

    invoke-virtual {v0}, Lcom/daaw/x34;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final m(Lcom/daaw/kp2;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/l44;->B:Lcom/daaw/o24;

    if-eqz v0, :cond_0

    const-string v1, "onPlayerError"

    invoke-interface {v0, v1, p1}, Lcom/daaw/o24;->f(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public final m0(Landroid/net/Uri;Ljava/lang/String;)Lcom/daaw/yv2;
    .locals 10

    new-instance v9, Lcom/daaw/uv2;

    iget-boolean v0, p0, Lcom/daaw/l44;->z:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/l44;->y:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    if-lez v0, :cond_1

    iget-object p2, p0, Lcom/daaw/l44;->y:Ljava/nio/ByteBuffer;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result p2

    new-array p2, p2, [B

    iget-object v0, p0, Lcom/daaw/l44;->y:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    new-instance v0, Lcom/daaw/z34;

    invoke-direct {v0, p2}, Lcom/daaw/z34;-><init>([B)V

    :cond_0
    move-object v2, v0

    goto/16 :goto_2

    :cond_1
    sget-object v0, Lcom/daaw/g93;->O1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    sget-object v0, Lcom/daaw/g93;->F1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_2
    iget-object v0, p0, Lcom/daaw/l44;->w:Lcom/daaw/x24;

    iget-boolean v0, v0, Lcom/daaw/x24;->j:Z

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/daaw/l44;->w:Lcom/daaw/x24;

    iget-boolean v2, v0, Lcom/daaw/x24;->o:Z

    if-eqz v2, :cond_5

    new-instance v0, Lcom/daaw/a44;

    invoke-direct {v0, p0, p2, v1}, Lcom/daaw/a44;-><init>(Lcom/daaw/l44;Ljava/lang/String;Z)V

    goto :goto_1

    :cond_5
    iget v0, v0, Lcom/daaw/x24;->i:I

    if-lez v0, :cond_6

    new-instance v0, Lcom/daaw/b44;

    invoke-direct {v0, p0, p2, v1}, Lcom/daaw/b44;-><init>(Lcom/daaw/l44;Ljava/lang/String;Z)V

    goto :goto_1

    :cond_6
    new-instance v0, Lcom/daaw/c44;

    invoke-direct {v0, p0, p2, v1}, Lcom/daaw/c44;-><init>(Lcom/daaw/l44;Ljava/lang/String;Z)V

    :goto_1
    iget-object p2, p0, Lcom/daaw/l44;->w:Lcom/daaw/x24;

    iget-boolean p2, p2, Lcom/daaw/x24;->j:Z

    if-eqz p2, :cond_7

    new-instance p2, Lcom/daaw/d44;

    invoke-direct {p2, p0, v0}, Lcom/daaw/d44;-><init>(Lcom/daaw/l44;Lcom/daaw/jx2;)V

    move-object v0, p2

    :cond_7
    iget-object p2, p0, Lcom/daaw/l44;->y:Ljava/nio/ByteBuffer;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result p2

    if-lez p2, :cond_0

    iget-object p2, p0, Lcom/daaw/l44;->y:Ljava/nio/ByteBuffer;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->limit()I

    move-result p2

    new-array p2, p2, [B

    iget-object v1, p0, Lcom/daaw/l44;->y:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, p2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    new-instance v1, Lcom/daaw/g44;

    invoke-direct {v1, v0, p2}, Lcom/daaw/g44;-><init>(Lcom/daaw/jx2;[B)V

    move-object v2, v1

    :goto_2
    sget-object p2, Lcom/daaw/g93;->m:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_8

    sget-object p2, Lcom/daaw/j44;->a:Lcom/daaw/j44;

    goto :goto_3

    :cond_8
    sget-object p2, Lcom/daaw/k44;->a:Lcom/daaw/k44;

    :goto_3
    move-object v3, p2

    iget-object p2, p0, Lcom/daaw/l44;->w:Lcom/daaw/x24;

    iget v4, p2, Lcom/daaw/x24;->k:I

    sget-object v5, Lcom/google/android/gms/ads/internal/util/zzs;->zza:Lcom/daaw/gv6;

    const/4 v7, 0x0

    iget v8, p2, Lcom/daaw/x24;->g:I

    move-object v0, v9

    move-object v1, p1

    move-object v6, p0

    invoke-direct/range {v0 .. v8}, Lcom/daaw/uv2;-><init>(Landroid/net/Uri;Lcom/daaw/jx2;Lcom/daaw/ps2;ILandroid/os/Handler;Lcom/daaw/tv2;Ljava/lang/String;I)V

    return-object v9
.end method

.method public final synthetic n0(Ljava/lang/String;Z)Lcom/daaw/kx2;
    .locals 9

    const/4 v0, 0x1

    if-eq v0, p2, :cond_0

    const/4 p2, 0x0

    move-object v2, p2

    goto :goto_0

    :cond_0
    move-object v2, p0

    :goto_0
    new-instance p2, Lcom/daaw/p44;

    iget-object v0, p0, Lcom/daaw/l44;->w:Lcom/daaw/x24;

    iget v3, v0, Lcom/daaw/x24;->d:I

    iget v4, v0, Lcom/daaw/x24;->f:I

    iget-wide v5, v0, Lcom/daaw/x24;->p:J

    iget-wide v7, v0, Lcom/daaw/x24;->q:J

    move-object v0, p2

    move-object v1, p1

    invoke-direct/range {v0 .. v8}, Lcom/daaw/p44;-><init>(Ljava/lang/String;Lcom/daaw/zy2;IIJJ)V

    return-object p2
.end method

.method public final t(Lcom/google/android/gms/internal/ads/zzatd;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/l44;->A:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/y24;

    sget-object v1, Lcom/daaw/g93;->F1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iget v2, p1, Lcom/google/android/gms/internal/ads/zzatd;->A:F

    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    const-string v3, "frameRate"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v2, p1, Lcom/google/android/gms/internal/ads/zzatd;->q:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "bitRate"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v2, p1, Lcom/google/android/gms/internal/ads/zzatd;->y:I

    iget v3, p1, Lcom/google/android/gms/internal/ads/zzatd;->z:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "x"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "resolution"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/zzatd;->t:Ljava/lang/String;

    const-string v3, "videoMime"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/zzatd;->u:Ljava/lang/String;

    const-string v3, "videoSampleMime"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzatd;->r:Ljava/lang/String;

    const-string v2, "videoCodec"

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "onMetadataEvent"

    invoke-interface {v0, p1, v1}, Lcom/daaw/uj3;->T(Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public final v(Lcom/daaw/fq2;)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic w(Ljava/lang/Object;Lcom/daaw/mx2;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/l44;->k0(Lcom/daaw/kx2;Lcom/daaw/mx2;)V

    return-void
.end method

.method public final z(Lcom/daaw/mq2;Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final zza(Z)V
    .locals 0

    return-void
.end method

.method public final zze()V
    .locals 0

    return-void
.end method
