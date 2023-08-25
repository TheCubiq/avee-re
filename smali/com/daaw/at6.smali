.class public final Lcom/daaw/at6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lcom/daaw/es6;

.field public final d:Lcom/daaw/js6;

.field public final e:Lcom/daaw/zs6;

.field public final f:Lcom/daaw/zs6;

.field public g:Lcom/daaw/rj1;

.field public h:Lcom/daaw/rj1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/daaw/es6;Lcom/daaw/js6;Lcom/daaw/xs6;Lcom/daaw/ys6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/at6;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/at6;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/daaw/at6;->c:Lcom/daaw/es6;

    iput-object p4, p0, Lcom/daaw/at6;->d:Lcom/daaw/js6;

    iput-object p5, p0, Lcom/daaw/at6;->e:Lcom/daaw/zs6;

    iput-object p6, p0, Lcom/daaw/at6;->f:Lcom/daaw/zs6;

    return-void
.end method

.method public static e(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/daaw/es6;Lcom/daaw/js6;)Lcom/daaw/at6;
    .locals 8

    new-instance v7, Lcom/daaw/at6;

    new-instance v5, Lcom/daaw/xs6;

    invoke-direct {v5}, Lcom/daaw/xs6;-><init>()V

    new-instance v6, Lcom/daaw/ys6;

    invoke-direct {v6}, Lcom/daaw/ys6;-><init>()V

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, Lcom/daaw/at6;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/daaw/es6;Lcom/daaw/js6;Lcom/daaw/xs6;Lcom/daaw/ys6;)V

    iget-object p0, v7, Lcom/daaw/at6;->d:Lcom/daaw/js6;

    invoke-virtual {p0}, Lcom/daaw/js6;->d()Z

    move-result p0

    if-eqz p0, :cond_0

    new-instance p0, Lcom/daaw/us6;

    invoke-direct {p0, v7}, Lcom/daaw/us6;-><init>(Lcom/daaw/at6;)V

    invoke-virtual {v7, p0}, Lcom/daaw/at6;->h(Ljava/util/concurrent/Callable;)Lcom/daaw/rj1;

    move-result-object p0

    goto :goto_0

    :cond_0
    iget-object p0, v7, Lcom/daaw/at6;->e:Lcom/daaw/zs6;

    invoke-interface {p0}, Lcom/daaw/zs6;->zza()Lcom/daaw/fj2;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/dk1;->e(Ljava/lang/Object;)Lcom/daaw/rj1;

    move-result-object p0

    :goto_0
    iput-object p0, v7, Lcom/daaw/at6;->g:Lcom/daaw/rj1;

    new-instance p0, Lcom/daaw/vs6;

    invoke-direct {p0, v7}, Lcom/daaw/vs6;-><init>(Lcom/daaw/at6;)V

    invoke-virtual {v7, p0}, Lcom/daaw/at6;->h(Ljava/util/concurrent/Callable;)Lcom/daaw/rj1;

    move-result-object p0

    iput-object p0, v7, Lcom/daaw/at6;->h:Lcom/daaw/rj1;

    return-object v7
.end method

.method public static g(Lcom/daaw/rj1;Lcom/daaw/fj2;)Lcom/daaw/fj2;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/rj1;->n()Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/rj1;->k()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/fj2;

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/daaw/fj2;
    .locals 2

    iget-object v0, p0, Lcom/daaw/at6;->g:Lcom/daaw/rj1;

    iget-object v1, p0, Lcom/daaw/at6;->e:Lcom/daaw/zs6;

    invoke-interface {v1}, Lcom/daaw/zs6;->zza()Lcom/daaw/fj2;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/at6;->g(Lcom/daaw/rj1;Lcom/daaw/fj2;)Lcom/daaw/fj2;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lcom/daaw/fj2;
    .locals 2

    iget-object v0, p0, Lcom/daaw/at6;->h:Lcom/daaw/rj1;

    iget-object v1, p0, Lcom/daaw/at6;->f:Lcom/daaw/zs6;

    invoke-interface {v1}, Lcom/daaw/zs6;->zza()Lcom/daaw/fj2;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/at6;->g(Lcom/daaw/rj1;Lcom/daaw/fj2;)Lcom/daaw/fj2;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic c()Lcom/daaw/fj2;
    .locals 7

    iget-object v0, p0, Lcom/daaw/at6;->a:Landroid/content/Context;

    invoke-static {}, Lcom/daaw/fj2;->l0()Lcom/daaw/hi2;

    move-result-object v1

    invoke-static {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v3, "^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$"

    invoke-virtual {v2, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v2}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v2

    const/16 v3, 0x10

    new-array v3, v3, [B

    invoke-static {v3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-virtual {v2}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    const/16 v2, 0xb

    invoke-static {v3, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v2

    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v1, v2}, Lcom/daaw/hi2;->q0(Ljava/lang/String;)Lcom/daaw/hi2;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/daaw/hi2;->p0(Z)Lcom/daaw/hi2;

    const/4 v0, 0x6

    invoke-virtual {v1, v0}, Lcom/daaw/hi2;->U(I)Lcom/daaw/hi2;

    :cond_1
    invoke-virtual {v1}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object v0

    check-cast v0, Lcom/daaw/fj2;

    return-object v0
.end method

.method public final synthetic d()Lcom/daaw/fj2;
    .locals 4

    iget-object v0, p0, Lcom/daaw/at6;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lcom/daaw/ps6;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/fj2;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic f(Ljava/lang/Exception;)V
    .locals 4

    instance-of v0, p1, Ljava/lang/InterruptedException;

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/at6;->c:Lcom/daaw/es6;

    const/16 v1, 0x7e9

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/daaw/es6;->c(IJLjava/lang/Exception;)Lcom/daaw/rj1;

    return-void
.end method

.method public final h(Ljava/util/concurrent/Callable;)Lcom/daaw/rj1;
    .locals 2

    iget-object v0, p0, Lcom/daaw/at6;->b:Ljava/util/concurrent/Executor;

    invoke-static {v0, p1}, Lcom/daaw/dk1;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/daaw/rj1;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/at6;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/daaw/ws6;

    invoke-direct {v1, p0}, Lcom/daaw/ws6;-><init>(Lcom/daaw/at6;)V

    invoke-virtual {p1, v0, v1}, Lcom/daaw/rj1;->d(Ljava/util/concurrent/Executor;Lcom/daaw/gu0;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method
