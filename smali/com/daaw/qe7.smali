.class public final Lcom/daaw/qe7;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Lcom/daaw/qe7;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/qe7;

    invoke-direct {v0}, Lcom/daaw/qe7;-><init>()V

    sput-object v0, Lcom/daaw/qe7;->b:Lcom/daaw/qe7;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lcom/daaw/hf7;

    invoke-direct {v1}, Lcom/daaw/hf7;-><init>()V

    new-instance v2, Lcom/daaw/nf7;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lcom/daaw/nf7;-><init>(Lcom/daaw/hf7;Lcom/daaw/mf7;)V

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/qe7;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static b()Lcom/daaw/qe7;
    .locals 1

    sget-object v0, Lcom/daaw/qe7;->b:Lcom/daaw/qe7;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/daaw/ef7;Lcom/daaw/x97;)Lcom/daaw/m87;
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/qe7;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/nf7;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/nf7;->a(Lcom/daaw/gf7;Lcom/daaw/x97;)Lcom/daaw/m87;

    move-result-object p1
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :try_start_1
    new-instance v0, Lcom/daaw/ie7;

    invoke-direct {v0, p1, p2}, Lcom/daaw/ie7;-><init>(Lcom/daaw/ef7;Lcom/daaw/x97;)V
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    move-exception p1

    new-instance p2, Lcom/daaw/of7;

    const-string v0, "Creating a LegacyProtoKey failed"

    invoke-direct {p2, v0, p1}, Lcom/daaw/of7;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final declared-synchronized c(Lcom/daaw/xd7;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/daaw/hf7;

    iget-object v1, p0, Lcom/daaw/qe7;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/nf7;

    invoke-direct {v0, v1}, Lcom/daaw/hf7;-><init>(Lcom/daaw/nf7;)V

    invoke-virtual {v0, p1}, Lcom/daaw/hf7;->a(Lcom/daaw/xd7;)Lcom/daaw/hf7;

    new-instance p1, Lcom/daaw/nf7;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/daaw/nf7;-><init>(Lcom/daaw/hf7;Lcom/daaw/mf7;)V

    iget-object v0, p0, Lcom/daaw/qe7;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized d(Lcom/daaw/be7;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/daaw/hf7;

    iget-object v1, p0, Lcom/daaw/qe7;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/nf7;

    invoke-direct {v0, v1}, Lcom/daaw/hf7;-><init>(Lcom/daaw/nf7;)V

    invoke-virtual {v0, p1}, Lcom/daaw/hf7;->b(Lcom/daaw/be7;)Lcom/daaw/hf7;

    new-instance p1, Lcom/daaw/nf7;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/daaw/nf7;-><init>(Lcom/daaw/hf7;Lcom/daaw/mf7;)V

    iget-object v0, p0, Lcom/daaw/qe7;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized e(Lcom/daaw/ue7;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/daaw/hf7;

    iget-object v1, p0, Lcom/daaw/qe7;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/nf7;

    invoke-direct {v0, v1}, Lcom/daaw/hf7;-><init>(Lcom/daaw/nf7;)V

    invoke-virtual {v0, p1}, Lcom/daaw/hf7;->c(Lcom/daaw/ue7;)Lcom/daaw/hf7;

    new-instance p1, Lcom/daaw/nf7;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/daaw/nf7;-><init>(Lcom/daaw/hf7;Lcom/daaw/mf7;)V

    iget-object v0, p0, Lcom/daaw/qe7;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized f(Lcom/daaw/bf7;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/daaw/hf7;

    iget-object v1, p0, Lcom/daaw/qe7;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/nf7;

    invoke-direct {v0, v1}, Lcom/daaw/hf7;-><init>(Lcom/daaw/nf7;)V

    invoke-virtual {v0, p1}, Lcom/daaw/hf7;->d(Lcom/daaw/bf7;)Lcom/daaw/hf7;

    new-instance p1, Lcom/daaw/nf7;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/daaw/nf7;-><init>(Lcom/daaw/hf7;Lcom/daaw/mf7;)V

    iget-object v0, p0, Lcom/daaw/qe7;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
