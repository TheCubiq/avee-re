.class public final Lcom/daaw/bx8;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final d:Lcom/daaw/vw8;

.field public static final e:Lcom/daaw/vw8;

.field public static final f:Lcom/daaw/vw8;

.field public static final g:Lcom/daaw/vw8;


# instance fields
.field public final a:Ljava/util/concurrent/ExecutorService;

.field public b:Lcom/daaw/ww8;

.field public c:Ljava/io/IOException;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/daaw/vw8;

    const/4 v1, 0x0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/vw8;-><init>(IJLcom/daaw/uw8;)V

    sput-object v0, Lcom/daaw/bx8;->d:Lcom/daaw/vw8;

    new-instance v0, Lcom/daaw/vw8;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/vw8;-><init>(IJLcom/daaw/uw8;)V

    sput-object v0, Lcom/daaw/bx8;->e:Lcom/daaw/vw8;

    new-instance v0, Lcom/daaw/vw8;

    const/4 v1, 0x2

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/vw8;-><init>(IJLcom/daaw/uw8;)V

    sput-object v0, Lcom/daaw/bx8;->f:Lcom/daaw/vw8;

    new-instance v0, Lcom/daaw/vw8;

    const/4 v1, 0x3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/daaw/vw8;-><init>(IJLcom/daaw/uw8;)V

    sput-object v0, Lcom/daaw/bx8;->g:Lcom/daaw/vw8;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "ExoPlayer:Loader:ProgressiveMediaPeriod"

    invoke-static {p1}, Lcom/daaw/it5;->q(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/bx8;->a:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static b(ZJ)Lcom/daaw/vw8;
    .locals 2

    new-instance v0, Lcom/daaw/vw8;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/daaw/vw8;-><init>(IJLcom/daaw/uw8;)V

    return-object v0
.end method

.method public static bridge synthetic c(Lcom/daaw/bx8;)Lcom/daaw/ww8;
    .locals 0

    iget-object p0, p0, Lcom/daaw/bx8;->b:Lcom/daaw/ww8;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/daaw/bx8;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    iget-object p0, p0, Lcom/daaw/bx8;->a:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method

.method public static bridge synthetic e(Lcom/daaw/bx8;Lcom/daaw/ww8;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/bx8;->b:Lcom/daaw/ww8;

    return-void
.end method

.method public static bridge synthetic f(Lcom/daaw/bx8;Ljava/io/IOException;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/bx8;->c:Ljava/io/IOException;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/xw8;Lcom/daaw/tw8;I)J
    .locals 11

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/uo4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/bx8;->c:Ljava/io/IOException;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    new-instance v10, Lcom/daaw/ww8;

    move-object v0, v10

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-wide v6, v8

    invoke-direct/range {v0 .. v7}, Lcom/daaw/ww8;-><init>(Lcom/daaw/bx8;Landroid/os/Looper;Lcom/daaw/xw8;Lcom/daaw/tw8;IJ)V

    const-wide/16 p1, 0x0

    invoke-virtual {v10, p1, p2}, Lcom/daaw/ww8;->c(J)V

    return-wide v8
.end method

.method public final g()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/bx8;->b:Lcom/daaw/ww8;

    invoke-static {v0}, Lcom/daaw/uo4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/ww8;->a(Z)V

    return-void
.end method

.method public final h()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/bx8;->c:Ljava/io/IOException;

    return-void
.end method

.method public final i(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/bx8;->c:Ljava/io/IOException;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/bx8;->b:Lcom/daaw/ww8;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/ww8;->b(I)V

    :cond_0
    return-void

    :cond_1
    throw v0
.end method

.method public final j(Lcom/daaw/yw8;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/bx8;->b:Lcom/daaw/ww8;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/ww8;->a(Z)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/bx8;->a:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/daaw/zw8;

    invoke-direct {v1, p1}, Lcom/daaw/zw8;-><init>(Lcom/daaw/yw8;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    iget-object p1, p0, Lcom/daaw/bx8;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void
.end method

.method public final k()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/bx8;->c:Ljava/io/IOException;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final l()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/bx8;->b:Lcom/daaw/ww8;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
