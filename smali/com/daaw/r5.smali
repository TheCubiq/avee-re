.class public Lcom/daaw/r5;
.super Lcom/daaw/xj1;
.source ""


# static fields
.field public static volatile c:Lcom/daaw/r5;

.field public static final d:Ljava/util/concurrent/Executor;

.field public static final e:Ljava/util/concurrent/Executor;


# instance fields
.field public a:Lcom/daaw/xj1;

.field public b:Lcom/daaw/xj1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/r5$a;

    invoke-direct {v0}, Lcom/daaw/r5$a;-><init>()V

    sput-object v0, Lcom/daaw/r5;->d:Ljava/util/concurrent/Executor;

    new-instance v0, Lcom/daaw/r5$b;

    invoke-direct {v0}, Lcom/daaw/r5$b;-><init>()V

    sput-object v0, Lcom/daaw/r5;->e:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/xj1;-><init>()V

    new-instance v0, Lcom/daaw/zr;

    invoke-direct {v0}, Lcom/daaw/zr;-><init>()V

    iput-object v0, p0, Lcom/daaw/r5;->b:Lcom/daaw/xj1;

    iput-object v0, p0, Lcom/daaw/r5;->a:Lcom/daaw/xj1;

    return-void
.end method

.method public static d()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Lcom/daaw/r5;->e:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public static e()Lcom/daaw/r5;
    .locals 2

    sget-object v0, Lcom/daaw/r5;->c:Lcom/daaw/r5;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/daaw/r5;->c:Lcom/daaw/r5;

    return-object v0

    :cond_0
    const-class v0, Lcom/daaw/r5;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/r5;->c:Lcom/daaw/r5;

    if-nez v1, :cond_1

    new-instance v1, Lcom/daaw/r5;

    invoke-direct {v1}, Lcom/daaw/r5;-><init>()V

    sput-object v1, Lcom/daaw/r5;->c:Lcom/daaw/r5;

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lcom/daaw/r5;->c:Lcom/daaw/r5;

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/r5;->a:Lcom/daaw/xj1;

    invoke-virtual {v0, p1}, Lcom/daaw/xj1;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/r5;->a:Lcom/daaw/xj1;

    invoke-virtual {v0}, Lcom/daaw/xj1;->b()Z

    move-result v0

    return v0
.end method

.method public c(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/r5;->a:Lcom/daaw/xj1;

    invoke-virtual {v0, p1}, Lcom/daaw/xj1;->c(Ljava/lang/Runnable;)V

    return-void
.end method
