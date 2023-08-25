.class public abstract Lcom/daaw/j38;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final g:Ljava/lang/Object;

.field public static volatile h:Lcom/daaw/u28;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public static final i:Ljava/util/concurrent/atomic/AtomicReference;

.field public static final j:Lcom/daaw/p38;

.field public static final k:Ljava/util/concurrent/atomic/AtomicInteger;

.field public static final synthetic l:I


# instance fields
.field public final a:Lcom/daaw/r28;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/Object;

.field public volatile d:I

.field public volatile e:Ljava/lang/Object;

.field public final f:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/j38;->g:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Lcom/daaw/j38;->i:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Lcom/daaw/p38;

    sget-object v1, Lcom/daaw/c28;->a:Lcom/daaw/c28;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/daaw/p38;-><init>(Lcom/daaw/c28;[B)V

    sput-object v0, Lcom/daaw/j38;->j:Lcom/daaw/p38;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lcom/daaw/j38;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/r28;Ljava/lang/String;Ljava/lang/Object;ZLcom/daaw/g38;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p4, -0x1

    iput p4, p0, Lcom/daaw/j38;->d:I

    iget-object p4, p1, Lcom/daaw/r28;->b:Landroid/net/Uri;

    if-eqz p4, :cond_0

    iput-object p1, p0, Lcom/daaw/j38;->a:Lcom/daaw/r28;

    iput-object p2, p0, Lcom/daaw/j38;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/j38;->c:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/j38;->f:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must pass a valid SharedPreferences file name or ContentProvider URI"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static d()V
    .locals 1

    sget-object v0, Lcom/daaw/j38;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public static e(Landroid/content/Context;)V
    .locals 3

    sget-object v0, Lcom/daaw/j38;->h:Lcom/daaw/u28;

    if-nez v0, :cond_4

    sget-object v0, Lcom/daaw/j38;->g:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/j38;->h:Lcom/daaw/u28;

    if-nez v1, :cond_3

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v1, Lcom/daaw/j38;->h:Lcom/daaw/u28;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_0

    move-object p0, v2

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/daaw/u28;->a()Landroid/content/Context;

    move-result-object v1

    if-eq v1, p0, :cond_2

    :cond_1
    invoke-static {}, Lcom/daaw/h08;->d()V

    invoke-static {}, Lcom/daaw/m38;->b()V

    invoke-static {}, Lcom/daaw/k18;->d()V

    new-instance v1, Lcom/daaw/z18;

    invoke-direct {v1, p0}, Lcom/daaw/z18;-><init>(Landroid/content/Context;)V

    invoke-static {v1}, Lcom/daaw/q48;->a(Lcom/daaw/e48;)Lcom/daaw/e48;

    move-result-object v1

    new-instance v2, Lcom/daaw/zw7;

    invoke-direct {v2, p0, v1}, Lcom/daaw/zw7;-><init>(Landroid/content/Context;Lcom/daaw/e48;)V

    sput-object v2, Lcom/daaw/j38;->h:Lcom/daaw/u28;

    sget-object p0, Lcom/daaw/j38;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    :cond_2
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p0

    :cond_3
    :goto_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p0

    :cond_4
    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final b()Ljava/lang/Object;
    .locals 6

    iget-boolean v0, p0, Lcom/daaw/j38;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/j38;->b:Ljava/lang/String;

    const-string v1, "flagName must not be null"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :cond_0
    sget-object v0, Lcom/daaw/j38;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget v1, p0, Lcom/daaw/j38;->d:I

    if-ge v1, v0, :cond_c

    monitor-enter p0

    :try_start_0
    iget v1, p0, Lcom/daaw/j38;->d:I

    if-ge v1, v0, :cond_b

    sget-object v1, Lcom/daaw/j38;->h:Lcom/daaw/u28;

    const-string v2, "Must call PhenotypeFlag.init() first"

    if-eqz v1, :cond_a

    iget-object v2, p0, Lcom/daaw/j38;->a:Lcom/daaw/r28;

    iget-boolean v3, v2, Lcom/daaw/r28;->f:Z

    iget-object v2, v2, Lcom/daaw/r28;->b:Landroid/net/Uri;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Lcom/daaw/u28;->a()Landroid/content/Context;

    move-result-object v2

    iget-object v4, p0, Lcom/daaw/j38;->a:Lcom/daaw/r28;

    iget-object v4, v4, Lcom/daaw/r28;->b:Landroid/net/Uri;

    invoke-static {v2, v4}, Lcom/daaw/q18;->a(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/daaw/j38;->a:Lcom/daaw/r28;

    iget-boolean v2, v2, Lcom/daaw/r28;->h:Z

    invoke-virtual {v1}, Lcom/daaw/u28;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    iget-object v4, p0, Lcom/daaw/j38;->a:Lcom/daaw/r28;

    iget-object v4, v4, Lcom/daaw/r28;->b:Landroid/net/Uri;

    sget-object v5, Lcom/daaw/w18;->p:Lcom/daaw/w18;

    invoke-static {v2, v4, v5}, Lcom/daaw/h08;->a(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/Runnable;)Lcom/daaw/h08;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v3

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lcom/daaw/u28;->a()Landroid/content/Context;

    move-result-object v2

    iget-object v4, p0, Lcom/daaw/j38;->a:Lcom/daaw/r28;

    iget-object v4, v4, Lcom/daaw/r28;->a:Ljava/lang/String;

    sget-object v4, Lcom/daaw/w18;->p:Lcom/daaw/w18;

    invoke-static {v2, v3, v4}, Lcom/daaw/m38;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Runnable;)Lcom/daaw/m38;

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lcom/daaw/j38;->c()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Lcom/daaw/b18;->zzb(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {p0, v2}, Lcom/daaw/j38;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_1

    :cond_3
    move-object v2, v3

    :goto_1
    if-eqz v2, :cond_4

    goto :goto_4

    :cond_4
    iget-object v2, p0, Lcom/daaw/j38;->a:Lcom/daaw/r28;

    iget-boolean v2, v2, Lcom/daaw/r28;->e:Z

    if-nez v2, :cond_6

    invoke-virtual {v1}, Lcom/daaw/u28;->a()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/k18;->a(Landroid/content/Context;)Lcom/daaw/k18;

    move-result-object v2

    iget-object v4, p0, Lcom/daaw/j38;->a:Lcom/daaw/r28;

    iget-boolean v4, v4, Lcom/daaw/r28;->e:Z

    if-eqz v4, :cond_5

    move-object v4, v3

    goto :goto_2

    :cond_5
    iget-object v4, p0, Lcom/daaw/j38;->b:Ljava/lang/String;

    :goto_2
    invoke-virtual {v2, v4}, Lcom/daaw/k18;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {p0, v2}, Lcom/daaw/j38;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_3

    :cond_6
    move-object v2, v3

    :goto_3
    if-nez v2, :cond_7

    iget-object v2, p0, Lcom/daaw/j38;->c:Ljava/lang/Object;

    :cond_7
    :goto_4
    invoke-virtual {v1}, Lcom/daaw/u28;->b()Lcom/daaw/e48;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/e48;->zza()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/y38;

    invoke-virtual {v1}, Lcom/daaw/y38;->b()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual {v1}, Lcom/daaw/y38;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/s08;

    iget-object v2, p0, Lcom/daaw/j38;->a:Lcom/daaw/r28;

    iget-object v4, v2, Lcom/daaw/r28;->b:Landroid/net/Uri;

    iget-object v2, v2, Lcom/daaw/r28;->d:Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/j38;->b:Ljava/lang/String;

    invoke-virtual {v1, v4, v3, v2, v5}, Lcom/daaw/s08;->a(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_8

    iget-object v2, p0, Lcom/daaw/j38;->c:Ljava/lang/Object;

    goto :goto_5

    :cond_8
    invoke-virtual {p0, v1}, Lcom/daaw/j38;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    :cond_9
    :goto_5
    iput-object v2, p0, Lcom/daaw/j38;->e:Ljava/lang/Object;

    iput v0, p0, Lcom/daaw/j38;->d:I

    goto :goto_6

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    :goto_6
    monitor-exit p0

    goto :goto_7

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_c
    :goto_7
    iget-object v0, p0, Lcom/daaw/j38;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/j38;->a:Lcom/daaw/r28;

    iget-object v0, v0, Lcom/daaw/r28;->d:Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/j38;->b:Ljava/lang/String;

    return-object v0
.end method
