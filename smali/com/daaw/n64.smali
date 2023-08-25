.class public final Lcom/daaw/n64;
.super Lcom/daaw/p24;
.source ""

# interfaces
.implements Lcom/daaw/qz6;
.implements Lcom/daaw/ob8;


# static fields
.field public static final synthetic K:I


# instance fields
.field public A:Lcom/daaw/o24;

.field public B:I

.field public C:I

.field public D:J

.field public final E:Ljava/lang/String;

.field public final F:I

.field public final G:Ljava/lang/Object;

.field public final H:Ljava/util/ArrayList;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "httpDataSourcesLock"
    .end annotation
.end field

.field public volatile I:Lcom/daaw/x54;

.field public final J:Ljava/util/Set;

.field public final r:Landroid/content/Context;

.field public final s:Lcom/daaw/v54;

.field public final t:Lcom/daaw/rv8;

.field public final u:Lcom/daaw/x24;

.field public final v:Ljava/lang/ref/WeakReference;

.field public final w:Lcom/daaw/bt8;

.field public x:Lcom/daaw/ga8;

.field public y:Ljava/nio/ByteBuffer;

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/x24;Lcom/daaw/y24;)V
    .locals 5

    invoke-direct {p0}, Lcom/daaw/p24;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/n64;->G:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/daaw/n64;->J:Ljava/util/Set;

    iput-object p1, p0, Lcom/daaw/n64;->r:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/n64;->u:Lcom/daaw/x24;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/n64;->v:Ljava/lang/ref/WeakReference;

    new-instance v0, Lcom/daaw/v54;

    invoke-direct {v0}, Lcom/daaw/v54;-><init>()V

    iput-object v0, p0, Lcom/daaw/n64;->s:Lcom/daaw/v54;

    new-instance v1, Lcom/daaw/rv8;

    invoke-direct {v1, p1}, Lcom/daaw/rv8;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/daaw/n64;->t:Lcom/daaw/rv8;

    invoke-static {}, Lcom/google/android/gms/ads/internal/util/zze;->zzc()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "OfficialSimpleExoPlayerAdapter initialize "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    :cond_0
    sget-object v2, Lcom/daaw/p24;->p:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    new-instance v2, Lcom/daaw/da8;

    new-instance v3, Lcom/daaw/g64;

    invoke-direct {v3, p0}, Lcom/daaw/g64;-><init>(Lcom/daaw/n64;)V

    const/4 v4, 0x0

    invoke-direct {v2, p1, v3, v4}, Lcom/daaw/da8;-><init>(Landroid/content/Context;Lcom/daaw/g64;[B)V

    invoke-virtual {v2, v1}, Lcom/daaw/da8;->b(Lcom/daaw/zv8;)Lcom/daaw/da8;

    invoke-virtual {v2, v0}, Lcom/daaw/da8;->a(Lcom/daaw/d78;)Lcom/daaw/da8;

    invoke-virtual {v2}, Lcom/daaw/da8;->c()Lcom/daaw/ga8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/n64;->x:Lcom/daaw/ga8;

    invoke-virtual {v0, p0}, Lcom/daaw/ga8;->l(Lcom/daaw/ob8;)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/n64;->B:I

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/daaw/n64;->D:J

    iput v0, p0, Lcom/daaw/n64;->C:I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/daaw/n64;->H:Ljava/util/ArrayList;

    iput-object v4, p0, Lcom/daaw/n64;->I:Lcom/daaw/x54;

    if-eqz p3, :cond_1

    invoke-interface {p3}, Lcom/daaw/y24;->zzt()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Lcom/daaw/y24;->zzt()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const-string v1, ""

    :goto_0
    iput-object v1, p0, Lcom/daaw/n64;->E:Ljava/lang/String;

    if-eqz p3, :cond_2

    invoke-interface {p3}, Lcom/daaw/y24;->zzh()I

    move-result v1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    iput v1, p0, Lcom/daaw/n64;->F:I

    new-instance v1, Lcom/daaw/bt8;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    move-result-object v2

    invoke-interface {p3}, Lcom/daaw/y24;->zzp()Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object p3

    iget-object p3, p3, Lcom/google/android/gms/internal/ads/zzchu;->p:Ljava/lang/String;

    invoke-virtual {v2, p1, p3}, Lcom/google/android/gms/ads/internal/util/zzs;->zzc(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-boolean p3, p0, Lcom/daaw/n64;->z:Z

    if-eqz p3, :cond_3

    iget-object p3, p0, Lcom/daaw/n64;->y:Ljava/nio/ByteBuffer;

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->limit()I

    move-result p3

    if-lez p3, :cond_3

    iget-object p1, p0, Lcom/daaw/n64;->y:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result p1

    new-array p1, p1, [B

    iget-object p2, p0, Lcom/daaw/n64;->y:Ljava/nio/ByteBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    new-instance p2, Lcom/daaw/z54;

    invoke-direct {p2, p1}, Lcom/daaw/z54;-><init>([B)V

    goto/16 :goto_4

    :cond_3
    sget-object p3, Lcom/daaw/g93;->O1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, p3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    const/4 v2, 0x1

    if-eqz p3, :cond_4

    sget-object p3, Lcom/daaw/g93;->F1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v3

    invoke-virtual {v3, p3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p3, :cond_5

    :cond_4
    iget-boolean p3, p2, Lcom/daaw/x24;->j:Z

    if-nez p3, :cond_6

    :cond_5
    const/4 v0, 0x1

    :cond_6
    iget-boolean p3, p2, Lcom/daaw/x24;->o:Z

    if-eqz p3, :cond_7

    new-instance p3, Lcom/daaw/b64;

    invoke-direct {p3, p0, p1, v0}, Lcom/daaw/b64;-><init>(Lcom/daaw/n64;Ljava/lang/String;Z)V

    goto :goto_2

    :cond_7
    iget p3, p2, Lcom/daaw/x24;->i:I

    if-lez p3, :cond_8

    new-instance p3, Lcom/daaw/c64;

    invoke-direct {p3, p0, p1, v0}, Lcom/daaw/c64;-><init>(Lcom/daaw/n64;Ljava/lang/String;Z)V

    goto :goto_2

    :cond_8
    new-instance p3, Lcom/daaw/d64;

    invoke-direct {p3, p0, p1, v0}, Lcom/daaw/d64;-><init>(Lcom/daaw/n64;Ljava/lang/String;Z)V

    :goto_2
    iget-boolean p1, p2, Lcom/daaw/x24;->j:Z

    if-eqz p1, :cond_9

    new-instance p1, Lcom/daaw/e64;

    invoke-direct {p1, p0, p3}, Lcom/daaw/e64;-><init>(Lcom/daaw/n64;Lcom/daaw/m36;)V

    move-object p2, p1

    goto :goto_3

    :cond_9
    move-object p2, p3

    :goto_3
    iget-object p1, p0, Lcom/daaw/n64;->y:Ljava/nio/ByteBuffer;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result p1

    if-lez p1, :cond_a

    iget-object p1, p0, Lcom/daaw/n64;->y:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->limit()I

    move-result p1

    new-array p1, p1, [B

    iget-object p3, p0, Lcom/daaw/n64;->y:Ljava/nio/ByteBuffer;

    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    new-instance p3, Lcom/daaw/f64;

    invoke-direct {p3, p2, p1}, Lcom/daaw/f64;-><init>(Lcom/daaw/m36;[B)V

    move-object p2, p3

    :cond_a
    :goto_4
    sget-object p1, Lcom/daaw/g93;->m:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p3

    invoke-virtual {p3, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_b

    sget-object p1, Lcom/daaw/i64;->b:Lcom/daaw/i64;

    goto :goto_5

    :cond_b
    sget-object p1, Lcom/daaw/m64;->b:Lcom/daaw/m64;

    :goto_5
    new-instance p3, Lcom/daaw/at8;

    invoke-direct {p3, p1}, Lcom/daaw/at8;-><init>(Lcom/daaw/q09;)V

    invoke-direct {v1, p2, p3, v4}, Lcom/daaw/bt8;-><init>(Lcom/daaw/m36;Lcom/daaw/at8;[B)V

    iput-object v1, p0, Lcom/daaw/n64;->w:Lcom/daaw/bt8;

    return-void
.end method


# virtual methods
.method public final D(Lcom/daaw/p46;Lcom/daaw/pa6;ZI)V
    .locals 0

    iget p1, p0, Lcom/daaw/n64;->B:I

    add-int/2addr p1, p4

    iput p1, p0, Lcom/daaw/n64;->B:I

    return-void
.end method

.method public final E()J
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/n64;->m0()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/daaw/n64;->B:I

    int-to-long v0, v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final F()J
    .locals 10

    invoke-virtual {p0}, Lcom/daaw/n64;->m0()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/daaw/n64;->G:Ljava/lang/Object;

    monitor-enter v0

    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/daaw/n64;->H:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget-wide v1, p0, Lcom/daaw/n64;->D:J

    iget-object v3, p0, Lcom/daaw/n64;->H:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/iu6;

    invoke-interface {v3}, Lcom/daaw/iu6;->zze()Ljava/util/Map;

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
    iput-wide v1, p0, Lcom/daaw/n64;->D:J

    goto :goto_0

    :cond_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-wide v0, p0, Lcom/daaw/n64;->D:J

    return-wide v0

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1

    :cond_3
    iget-object v0, p0, Lcom/daaw/n64;->I:Lcom/daaw/x54;

    invoke-virtual {v0}, Lcom/daaw/x54;->o()J

    move-result-wide v0

    return-wide v0
.end method

.method public final G([Landroid/net/Uri;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {p0, p1, p2, v1, v0}, Lcom/daaw/n64;->H([Landroid/net/Uri;Ljava/lang/String;Ljava/nio/ByteBuffer;Z)V

    return-void
.end method

.method public final H([Landroid/net/Uri;Ljava/lang/String;Ljava/nio/ByteBuffer;Z)V
    .locals 1

    iget-object p2, p0, Lcom/daaw/n64;->x:Lcom/daaw/ga8;

    if-nez p2, :cond_0

    return-void

    :cond_0
    iput-object p3, p0, Lcom/daaw/n64;->y:Ljava/nio/ByteBuffer;

    iput-boolean p4, p0, Lcom/daaw/n64;->z:Z

    array-length p2, p1

    const/4 p3, 0x1

    const/4 p4, 0x0

    if-ne p2, p3, :cond_1

    aget-object p1, p1, p4

    invoke-virtual {p0, p1}, Lcom/daaw/n64;->j0(Landroid/net/Uri;)Lcom/daaw/rr8;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-array p2, p2, [Lcom/daaw/rr8;

    const/4 p3, 0x0

    :goto_0
    array-length v0, p1

    if-ge p3, v0, :cond_2

    aget-object v0, p1, p3

    invoke-virtual {p0, v0}, Lcom/daaw/n64;->j0(Landroid/net/Uri;)Lcom/daaw/rr8;

    move-result-object v0

    aput-object v0, p2, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Lcom/daaw/fs8;

    invoke-direct {p1, p4, p4, p2}, Lcom/daaw/fs8;-><init>(ZZ[Lcom/daaw/rr8;)V

    :goto_1
    iget-object p2, p0, Lcom/daaw/n64;->x:Lcom/daaw/ga8;

    invoke-virtual {p2, p1}, Lcom/daaw/ga8;->c(Lcom/daaw/rr8;)V

    iget-object p1, p0, Lcom/daaw/n64;->x:Lcom/daaw/ga8;

    invoke-virtual {p1}, Lcom/daaw/ga8;->m()V

    sget-object p1, Lcom/daaw/p24;->q:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public final I()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/n64;->x:Lcom/daaw/ga8;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lcom/daaw/ga8;->b(Lcom/daaw/ob8;)V

    iget-object v0, p0, Lcom/daaw/n64;->x:Lcom/daaw/ga8;

    invoke-virtual {v0}, Lcom/daaw/ga8;->n()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/n64;->x:Lcom/daaw/ga8;

    sget-object v0, Lcom/daaw/p24;->q:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    :cond_0
    return-void
.end method

.method public final J(J)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/n64;->x:Lcom/daaw/ga8;

    invoke-interface {v0}, Lcom/daaw/ty3;->zzf()I

    move-result v1

    invoke-interface {v0, v1, p1, p2}, Lcom/daaw/ty3;->a(IJ)V

    return-void
.end method

.method public final K(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/n64;->s:Lcom/daaw/v54;

    invoke-virtual {v0, p1}, Lcom/daaw/v54;->e(I)V

    return-void
.end method

.method public final L(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/n64;->s:Lcom/daaw/v54;

    invoke-virtual {v0, p1}, Lcom/daaw/v54;->f(I)V

    return-void
.end method

.method public final M(Lcom/daaw/o24;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/n64;->A:Lcom/daaw/o24;

    return-void
.end method

.method public final N(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/n64;->s:Lcom/daaw/v54;

    invoke-virtual {v0, p1}, Lcom/daaw/v54;->g(I)V

    return-void
.end method

.method public final O(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/n64;->s:Lcom/daaw/v54;

    invoke-virtual {v0, p1}, Lcom/daaw/v54;->h(I)V

    return-void
.end method

.method public final P(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/n64;->x:Lcom/daaw/ga8;

    invoke-virtual {v0, p1}, Lcom/daaw/ga8;->d(Z)V

    return-void
.end method

.method public final Q(Z)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/n64;->x:Lcom/daaw/ga8;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/daaw/n64;->x:Lcom/daaw/ga8;

    invoke-virtual {v1}, Lcom/daaw/ga8;->h()I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/daaw/n64;->t:Lcom/daaw/rv8;

    invoke-virtual {v1}, Lcom/daaw/rv8;->k()Lcom/daaw/fv8;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/fv8;->c()Lcom/daaw/dv8;

    move-result-object v2

    xor-int/lit8 v3, p1, 0x1

    invoke-virtual {v2, v0, v3}, Lcom/daaw/dv8;->o(IZ)Lcom/daaw/dv8;

    invoke-virtual {v1, v2}, Lcom/daaw/rv8;->p(Lcom/daaw/dv8;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final R(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/n64;->J:Ljava/util/Set;

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

    check-cast v1, Lcom/daaw/u54;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lcom/daaw/u54;->p(I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final S(Landroid/view/Surface;Z)V
    .locals 0

    iget-object p2, p0, Lcom/daaw/n64;->x:Lcom/daaw/ga8;

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2, p1}, Lcom/daaw/ga8;->e(Landroid/view/Surface;)V

    return-void
.end method

.method public final T(FZ)V
    .locals 0

    iget-object p2, p0, Lcom/daaw/n64;->x:Lcom/daaw/ga8;

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2, p1}, Lcom/daaw/ga8;->f(F)V

    return-void
.end method

.method public final U()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/n64;->x:Lcom/daaw/ga8;

    invoke-virtual {v0}, Lcom/daaw/ga8;->g()V

    return-void
.end method

.method public final V()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/n64;->x:Lcom/daaw/ga8;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final W()I
    .locals 1

    iget v0, p0, Lcom/daaw/n64;->C:I

    return v0
.end method

.method public final Y()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/n64;->x:Lcom/daaw/ga8;

    invoke-virtual {v0}, Lcom/daaw/ga8;->zzh()I

    move-result v0

    return v0
.end method

.method public final a(Lcom/daaw/p46;Lcom/daaw/pa6;Z)V
    .locals 0

    return-void
.end method

.method public final a0()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/n64;->x:Lcom/daaw/ga8;

    invoke-virtual {v0}, Lcom/daaw/ga8;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic b(Lcom/daaw/ib8;IJJ)V
    .locals 0

    return-void
.end method

.method public final b0()J
    .locals 2

    iget v0, p0, Lcom/daaw/n64;->B:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final c0()J
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/n64;->m0()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-nez v0, :cond_0

    return-wide v1

    :cond_0
    iget-object v0, p0, Lcom/daaw/n64;->I:Lcom/daaw/x54;

    invoke-virtual {v0}, Lcom/daaw/x54;->s()Z

    move-result v0

    if-nez v0, :cond_1

    return-wide v1

    :cond_1
    iget v0, p0, Lcom/daaw/n64;->B:I

    int-to-long v0, v0

    iget-object v2, p0, Lcom/daaw/n64;->I:Lcom/daaw/x54;

    invoke-virtual {v2}, Lcom/daaw/x54;->n()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final d0()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/n64;->x:Lcom/daaw/ga8;

    invoke-virtual {v0}, Lcom/daaw/ga8;->zzl()J

    move-result-wide v0

    return-wide v0
.end method

.method public final e(Lcom/daaw/ib8;Lcom/daaw/f92;Lcom/daaw/tm7;)V
    .locals 3

    iget-object p1, p0, Lcom/daaw/n64;->v:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/y24;

    sget-object p3, Lcom/daaw/g93;->F1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    iget v0, p2, Lcom/daaw/f92;->s:F

    invoke-static {v0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    const-string v1, "frameRate"

    invoke-interface {p3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p2, Lcom/daaw/f92;->h:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "bitRate"

    invoke-interface {p3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p2, Lcom/daaw/f92;->q:I

    iget v1, p2, Lcom/daaw/f92;->r:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "x"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "resolution"

    invoke-interface {p3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p2, Lcom/daaw/f92;->k:Ljava/lang/String;

    const-string v1, "videoMime"

    invoke-interface {p3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p2, Lcom/daaw/f92;->l:Ljava/lang/String;

    const-string v1, "videoSampleMime"

    invoke-interface {p3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p2, Lcom/daaw/f92;->i:Ljava/lang/String;

    const-string v0, "videoCodec"

    invoke-interface {p3, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "onMetadataEvent"

    invoke-interface {p1, p2, p3}, Lcom/daaw/uj3;->T(Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public final e0()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/n64;->x:Lcom/daaw/ga8;

    invoke-virtual {v0}, Lcom/daaw/ga8;->j()J

    move-result-wide v0

    return-wide v0
.end method

.method public final f(Lcom/daaw/p46;Lcom/daaw/pa6;Z)V
    .locals 0

    return-void
.end method

.method public final synthetic f0(Ljava/lang/String;Z)Lcom/daaw/p46;
    .locals 9

    const/4 v0, 0x1

    if-eq v0, p2, :cond_0

    const/4 p2, 0x0

    move-object v2, p2

    goto :goto_0

    :cond_0
    move-object v2, p0

    :goto_0
    new-instance p2, Lcom/daaw/q64;

    iget-object v0, p0, Lcom/daaw/n64;->u:Lcom/daaw/x24;

    iget v3, v0, Lcom/daaw/x24;->d:I

    iget v4, v0, Lcom/daaw/x24;->f:I

    iget-wide v5, v0, Lcom/daaw/x24;->p:J

    iget-wide v7, v0, Lcom/daaw/x24;->q:J

    move-object v0, p2

    move-object v1, p1

    invoke-direct/range {v0 .. v8}, Lcom/daaw/q64;-><init>(Ljava/lang/String;Lcom/daaw/qz6;IIJJ)V

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

    const-string v1, "OfficialSimpleExoPlayerAdapter finalize "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final synthetic g0(Ljava/lang/String;Z)Lcom/daaw/p46;
    .locals 6

    const/4 v0, 0x1

    if-eq v0, p2, :cond_0

    const/4 p2, 0x0

    move-object v2, p2

    goto :goto_0

    :cond_0
    move-object v2, p0

    :goto_0
    new-instance p2, Lcom/daaw/u54;

    iget-object v0, p0, Lcom/daaw/n64;->u:Lcom/daaw/x24;

    iget v3, v0, Lcom/daaw/x24;->d:I

    iget v4, v0, Lcom/daaw/x24;->f:I

    iget v5, v0, Lcom/daaw/x24;->i:I

    move-object v0, p2

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/daaw/u54;-><init>(Ljava/lang/String;Lcom/daaw/qz6;III)V

    iget-object p1, p0, Lcom/daaw/n64;->J:Ljava/util/Set;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p2
.end method

.method public final synthetic h0(Ljava/lang/String;Z)Lcom/daaw/p46;
    .locals 1

    new-instance v0, Lcom/daaw/yd6;

    invoke-direct {v0}, Lcom/daaw/yd6;-><init>()V

    invoke-virtual {v0, p1}, Lcom/daaw/yd6;->e(Ljava/lang/String;)Lcom/daaw/yd6;

    const/4 p1, 0x1

    if-eq p1, p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    move-object p2, p0

    :goto_0
    invoke-virtual {v0, p2}, Lcom/daaw/yd6;->d(Lcom/daaw/qz6;)Lcom/daaw/yd6;

    iget-object p2, p0, Lcom/daaw/n64;->u:Lcom/daaw/x24;

    iget p2, p2, Lcom/daaw/x24;->d:I

    invoke-virtual {v0, p2}, Lcom/daaw/yd6;->b(I)Lcom/daaw/yd6;

    iget-object p2, p0, Lcom/daaw/n64;->u:Lcom/daaw/x24;

    iget p2, p2, Lcom/daaw/x24;->f:I

    invoke-virtual {v0, p2}, Lcom/daaw/yd6;->c(I)Lcom/daaw/yd6;

    invoke-virtual {v0, p1}, Lcom/daaw/yd6;->a(Z)Lcom/daaw/yd6;

    invoke-virtual {v0}, Lcom/daaw/yd6;->f()Lcom/daaw/mj6;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic i0(Lcom/daaw/m36;)Lcom/daaw/p46;
    .locals 9

    new-instance v8, Lcom/daaw/x54;

    iget-object v1, p0, Lcom/daaw/n64;->r:Landroid/content/Context;

    invoke-interface {p1}, Lcom/daaw/m36;->zza()Lcom/daaw/p46;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/n64;->E:Ljava/lang/String;

    iget v4, p0, Lcom/daaw/n64;->F:I

    new-instance v6, Lcom/daaw/a64;

    invoke-direct {v6, p0}, Lcom/daaw/a64;-><init>(Lcom/daaw/n64;)V

    const/4 v7, 0x0

    move-object v0, v8

    move-object v5, p0

    invoke-direct/range {v0 .. v7}, Lcom/daaw/x54;-><init>(Landroid/content/Context;Lcom/daaw/p46;Ljava/lang/String;ILcom/daaw/qz6;Lcom/daaw/a64;[B)V

    return-object v8
.end method

.method public final synthetic j(Lcom/daaw/ib8;Lcom/daaw/ql7;)V
    .locals 0

    return-void
.end method

.method public final j0(Landroid/net/Uri;)Lcom/daaw/rr8;
    .locals 2

    new-instance v0, Lcom/daaw/ee2;

    invoke-direct {v0}, Lcom/daaw/ee2;-><init>()V

    invoke-virtual {v0, p1}, Lcom/daaw/ee2;->b(Landroid/net/Uri;)Lcom/daaw/ee2;

    invoke-virtual {v0}, Lcom/daaw/ee2;->c()Lcom/daaw/f53;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/n64;->w:Lcom/daaw/bt8;

    iget-object v1, p0, Lcom/daaw/n64;->u:Lcom/daaw/x24;

    iget v1, v1, Lcom/daaw/x24;->g:I

    invoke-virtual {v0, v1}, Lcom/daaw/bt8;->a(I)Lcom/daaw/bt8;

    invoke-virtual {v0, p1}, Lcom/daaw/bt8;->b(Lcom/daaw/f53;)Lcom/daaw/dt8;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic k(Lcom/daaw/ty3;Lcom/daaw/lb8;)V
    .locals 0

    return-void
.end method

.method public final synthetic k0(ZJ)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/n64;->A:Lcom/daaw/o24;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/o24;->e(ZJ)V

    :cond_0
    return-void
.end method

.method public final l(Lcom/daaw/p46;Lcom/daaw/pa6;Z)V
    .locals 1

    instance-of p2, p1, Lcom/daaw/iu6;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/n64;->G:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-object p3, p0, Lcom/daaw/n64;->H:Ljava/util/ArrayList;

    check-cast p1, Lcom/daaw/iu6;

    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    instance-of p2, p1, Lcom/daaw/x54;

    if-eqz p2, :cond_1

    check-cast p1, Lcom/daaw/x54;

    iput-object p1, p0, Lcom/daaw/n64;->I:Lcom/daaw/x54;

    iget-object p1, p0, Lcom/daaw/n64;->v:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/y24;

    sget-object p2, Lcom/daaw/g93;->F1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    if-eqz p1, :cond_1

    iget-object p2, p0, Lcom/daaw/n64;->I:Lcom/daaw/x54;

    invoke-virtual {p2}, Lcom/daaw/x54;->q()Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string p3, "gcacheHit"

    iget-object v0, p0, Lcom/daaw/n64;->I:Lcom/daaw/x54;

    invoke-virtual {v0}, Lcom/daaw/x54;->s()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p3, "gcacheDownloaded"

    iget-object v0, p0, Lcom/daaw/n64;->I:Lcom/daaw/x54;

    invoke-virtual {v0}, Lcom/daaw/x54;->r()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p3, Lcom/google/android/gms/ads/internal/util/zzs;->zza:Lcom/daaw/gv6;

    new-instance v0, Lcom/daaw/h64;

    invoke-direct {v0, p1, p2}, Lcom/daaw/h64;-><init>(Lcom/daaw/y24;Ljava/util/Map;)V

    invoke-virtual {p3, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public final synthetic l0(Landroid/os/Handler;Lcom/daaw/wy8;Lcom/daaw/fj8;Lcom/daaw/du8;Lcom/daaw/kq8;)[Lcom/daaw/i98;
    .locals 21

    move-object/from16 v0, p0

    new-instance v9, Lcom/daaw/em8;

    iget-object v2, v0, Lcom/daaw/n64;->r:Landroid/content/Context;

    sget-object v13, Lcom/daaw/jp8;->a:Lcom/daaw/jp8;

    sget-object v1, Lcom/daaw/bi8;->c:Lcom/daaw/bi8;

    const/4 v14, 0x0

    new-array v3, v14, [Lcom/daaw/hi8;

    new-instance v4, Lcom/daaw/uk8;

    invoke-direct {v4}, Lcom/daaw/uk8;-><init>()V

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v5, "Both parameters are null"

    invoke-static {v1, v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :goto_0
    invoke-virtual {v4, v1}, Lcom/daaw/uk8;->b(Lcom/daaw/bi8;)Lcom/daaw/uk8;

    invoke-virtual {v4, v3}, Lcom/daaw/uk8;->c([Lcom/daaw/hi8;)Lcom/daaw/uk8;

    invoke-virtual {v4}, Lcom/daaw/uk8;->d()Lcom/daaw/sl8;

    move-result-object v8

    sget-object v12, Lcom/daaw/ap8;->a:Lcom/daaw/ap8;

    const/4 v5, 0x0

    move-object v1, v9

    move-object v3, v12

    move-object v4, v13

    move-object/from16 v6, p1

    move-object/from16 v7, p3

    invoke-direct/range {v1 .. v8}, Lcom/daaw/em8;-><init>(Landroid/content/Context;Lcom/daaw/ap8;Lcom/daaw/jp8;ZLandroid/os/Handler;Lcom/daaw/fj8;Lcom/daaw/rj8;)V

    new-instance v1, Lcom/daaw/sx8;

    iget-object v11, v0, Lcom/daaw/n64;->r:Landroid/content/Context;

    const-wide/16 v2, 0x0

    const/16 v16, 0x0

    const/16 v19, -0x1

    const/high16 v20, 0x41f00000    # 30.0f

    move-object v10, v1

    const/4 v4, 0x0

    move-wide v14, v2

    move-object/from16 v17, p1

    move-object/from16 v18, p2

    invoke-direct/range {v10 .. v20}, Lcom/daaw/sx8;-><init>(Landroid/content/Context;Lcom/daaw/ap8;Lcom/daaw/jp8;JZLandroid/os/Handler;Lcom/daaw/wy8;IF)V

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/daaw/i98;

    aput-object v9, v2, v4

    const/4 v3, 0x1

    aput-object v1, v2, v3

    return-object v2
.end method

.method public final m0()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/n64;->I:Lcom/daaw/x54;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/n64;->I:Lcom/daaw/x54;

    invoke-virtual {v0}, Lcom/daaw/x54;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final n(Lcom/daaw/ib8;Ljava/lang/Object;J)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/n64;->A:Lcom/daaw/o24;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/daaw/o24;->zzv()V

    :cond_0
    return-void
.end method

.method public final o(Lcom/daaw/ib8;Lcom/daaw/f92;Lcom/daaw/tm7;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/n64;->v:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/y24;

    sget-object p3, Lcom/daaw/g93;->F1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p2, Lcom/daaw/f92;->k:Ljava/lang/String;

    const-string v1, "audioMime"

    invoke-interface {p3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p2, Lcom/daaw/f92;->l:Ljava/lang/String;

    const-string v1, "audioSampleMime"

    invoke-interface {p3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p2, Lcom/daaw/f92;->i:Ljava/lang/String;

    const-string v0, "audioCodec"

    invoke-interface {p3, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "onMetadataEvent"

    invoke-interface {p1, p2, p3}, Lcom/daaw/uj3;->T(Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public final synthetic p(Lcom/daaw/ib8;Lcom/daaw/nx3;Lcom/daaw/nx3;I)V
    .locals 0

    return-void
.end method

.method public final q(Lcom/daaw/ib8;IJ)V
    .locals 0

    iget p1, p0, Lcom/daaw/n64;->C:I

    add-int/2addr p1, p2

    iput p1, p0, Lcom/daaw/n64;->C:I

    return-void
.end method

.method public final r(Lcom/daaw/ib8;Lcom/daaw/ll4;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/n64;->A:Lcom/daaw/o24;

    if-eqz p1, :cond_0

    iget v0, p2, Lcom/daaw/ll4;->a:I

    iget p2, p2, Lcom/daaw/ll4;->b:I

    invoke-interface {p1, v0, p2}, Lcom/daaw/o24;->g(II)V

    :cond_0
    return-void
.end method

.method public final s(Lcom/daaw/ib8;Lcom/daaw/ar8;Lcom/daaw/lr8;Ljava/io/IOException;Z)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/n64;->A:Lcom/daaw/o24;

    if-eqz p1, :cond_1

    iget-object p2, p0, Lcom/daaw/n64;->u:Lcom/daaw/x24;

    iget-boolean p2, p2, Lcom/daaw/x24;->l:Z

    if-eqz p2, :cond_0

    const-string p2, "onLoadException"

    invoke-interface {p1, p2, p4}, Lcom/daaw/o24;->d(Ljava/lang/String;Ljava/lang/Exception;)V

    return-void

    :cond_0
    const-string p2, "onLoadError"

    invoke-interface {p1, p2, p4}, Lcom/daaw/o24;->f(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_1
    return-void
.end method

.method public final u(Lcom/daaw/ib8;I)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/n64;->A:Lcom/daaw/o24;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Lcom/daaw/o24;->c(I)V

    :cond_0
    return-void
.end method

.method public final x(Lcom/daaw/ib8;Lcom/daaw/jn3;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/n64;->A:Lcom/daaw/o24;

    if-eqz p1, :cond_0

    const-string v0, "onPlayerError"

    invoke-interface {p1, v0, p2}, Lcom/daaw/o24;->f(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method

.method public final synthetic y(Lcom/daaw/ib8;Lcom/daaw/lr8;)V
    .locals 0

    return-void
.end method
