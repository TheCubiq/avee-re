.class public Lcom/daaw/bm;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final s:Ljava/io/FilenameFilter;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/ep;

.field public final c:Lcom/daaw/em;

.field public final d:Lcom/daaw/nq1;

.field public final e:Lcom/daaw/zl;

.field public final f:Lcom/daaw/ue0;

.field public final g:Lcom/daaw/h10;

.field public final h:Lcom/daaw/a5;

.field public final i:Lcom/daaw/fl0;

.field public final j:Lcom/daaw/fm;

.field public final k:Lcom/daaw/v2;

.field public final l:Lcom/daaw/pb1;

.field public m:Lcom/daaw/an;

.field public n:Lcom/daaw/zb1;

.field public final o:Lcom/daaw/tj1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/tj1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final p:Lcom/daaw/tj1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/tj1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Lcom/daaw/tj1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/tj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final r:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/am;->a:Lcom/daaw/am;

    sput-object v0, Lcom/daaw/bm;->s:Ljava/io/FilenameFilter;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/zl;Lcom/daaw/ue0;Lcom/daaw/ep;Lcom/daaw/h10;Lcom/daaw/em;Lcom/daaw/a5;Lcom/daaw/nq1;Lcom/daaw/fl0;Lcom/daaw/pb1;Lcom/daaw/fm;Lcom/daaw/v2;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/bm;->n:Lcom/daaw/zb1;

    new-instance v0, Lcom/daaw/tj1;

    invoke-direct {v0}, Lcom/daaw/tj1;-><init>()V

    iput-object v0, p0, Lcom/daaw/bm;->o:Lcom/daaw/tj1;

    new-instance v0, Lcom/daaw/tj1;

    invoke-direct {v0}, Lcom/daaw/tj1;-><init>()V

    iput-object v0, p0, Lcom/daaw/bm;->p:Lcom/daaw/tj1;

    new-instance v0, Lcom/daaw/tj1;

    invoke-direct {v0}, Lcom/daaw/tj1;-><init>()V

    iput-object v0, p0, Lcom/daaw/bm;->q:Lcom/daaw/tj1;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/daaw/bm;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lcom/daaw/bm;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/bm;->e:Lcom/daaw/zl;

    iput-object p3, p0, Lcom/daaw/bm;->f:Lcom/daaw/ue0;

    iput-object p4, p0, Lcom/daaw/bm;->b:Lcom/daaw/ep;

    iput-object p5, p0, Lcom/daaw/bm;->g:Lcom/daaw/h10;

    iput-object p6, p0, Lcom/daaw/bm;->c:Lcom/daaw/em;

    iput-object p7, p0, Lcom/daaw/bm;->h:Lcom/daaw/a5;

    iput-object p8, p0, Lcom/daaw/bm;->d:Lcom/daaw/nq1;

    iput-object p9, p0, Lcom/daaw/bm;->i:Lcom/daaw/fl0;

    iput-object p11, p0, Lcom/daaw/bm;->j:Lcom/daaw/fm;

    iput-object p12, p0, Lcom/daaw/bm;->k:Lcom/daaw/v2;

    iput-object p10, p0, Lcom/daaw/bm;->l:Lcom/daaw/pb1;

    return-void
.end method

.method public static A()Z
    .locals 1

    :try_start_0
    const-string v0, "com.google.firebase.crash.FirebaseCrash"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method public static C()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/daaw/bm;->E(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static D(Lcom/daaw/yr0;Ljava/lang/String;Lcom/daaw/h10;[B)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/yr0;",
            "Ljava/lang/String;",
            "Lcom/daaw/h10;",
            "[B)",
            "Ljava/util/List<",
            "Lcom/daaw/wr0;",
            ">;"
        }
    .end annotation

    const-string v0, "user-data"

    invoke-virtual {p2, p1, v0}, Lcom/daaw/h10;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    const-string v1, "keys"

    invoke-virtual {p2, p1, v1}, Lcom/daaw/h10;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lcom/daaw/cd;

    const-string v3, "logs_file"

    const-string v4, "logs"

    invoke-direct {v2, v3, v4, p3}, Lcom/daaw/cd;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    invoke-interface {p2, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lcom/daaw/s00;

    invoke-interface {p0}, Lcom/daaw/yr0;->f()Ljava/io/File;

    move-result-object v2

    const-string v3, "crash_meta_file"

    const-string v4, "metadata"

    invoke-direct {p3, v3, v4, v2}, Lcom/daaw/s00;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lcom/daaw/s00;

    invoke-interface {p0}, Lcom/daaw/yr0;->e()Ljava/io/File;

    move-result-object v2

    const-string v3, "session_meta_file"

    const-string v4, "session"

    invoke-direct {p3, v3, v4, v2}, Lcom/daaw/s00;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lcom/daaw/s00;

    invoke-interface {p0}, Lcom/daaw/yr0;->a()Ljava/io/File;

    move-result-object v2

    const-string v3, "app_meta_file"

    const-string v4, "app"

    invoke-direct {p3, v3, v4, v2}, Lcom/daaw/s00;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lcom/daaw/s00;

    invoke-interface {p0}, Lcom/daaw/yr0;->c()Ljava/io/File;

    move-result-object v2

    const-string v3, "device_meta_file"

    const-string v4, "device"

    invoke-direct {p3, v3, v4, v2}, Lcom/daaw/s00;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lcom/daaw/s00;

    invoke-interface {p0}, Lcom/daaw/yr0;->b()Ljava/io/File;

    move-result-object v2

    const-string v3, "os_meta_file"

    const-string v4, "os"

    invoke-direct {p3, v3, v4, v2}, Lcom/daaw/s00;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Lcom/daaw/s00;

    invoke-interface {p0}, Lcom/daaw/yr0;->d()Ljava/io/File;

    move-result-object p0

    const-string v2, "minidump_file"

    const-string v3, "minidump"

    invoke-direct {p3, v2, v3, p0}, Lcom/daaw/s00;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Lcom/daaw/s00;

    const-string p3, "user_meta_file"

    const-string v2, "user"

    invoke-direct {p0, p3, v2, v0}, Lcom/daaw/s00;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Lcom/daaw/s00;

    const-string p3, "keys_file"

    invoke-direct {p0, p3, v1, p1}, Lcom/daaw/s00;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p2
.end method

.method public static E(J)J
    .locals 2

    const-wide/16 v0, 0x3e8

    div-long/2addr p0, v0

    return-wide p0
.end method

.method public static synthetic I(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    const-string p0, ".ae"

    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic a(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/bm;->I(Ljava/io/File;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(J)J
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/bm;->E(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic c(Lcom/daaw/bm;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/bm;->B()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/util/List;)V
    .locals 0

    invoke-static {p0}, Lcom/daaw/bm;->r(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic e(Lcom/daaw/bm;)Lcom/daaw/fl0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/bm;->i:Lcom/daaw/fl0;

    return-object p0
.end method

.method public static synthetic f(Lcom/daaw/bm;)Lcom/daaw/v2;
    .locals 0

    iget-object p0, p0, Lcom/daaw/bm;->k:Lcom/daaw/v2;

    return-object p0
.end method

.method public static synthetic g(Lcom/daaw/bm;)Lcom/daaw/em;
    .locals 0

    iget-object p0, p0, Lcom/daaw/bm;->c:Lcom/daaw/em;

    return-object p0
.end method

.method public static synthetic h(Lcom/daaw/bm;)Lcom/daaw/pb1;
    .locals 0

    iget-object p0, p0, Lcom/daaw/bm;->l:Lcom/daaw/pb1;

    return-object p0
.end method

.method public static synthetic i(Lcom/daaw/bm;J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/bm;->w(J)V

    return-void
.end method

.method public static synthetic j(Lcom/daaw/bm;)Lcom/daaw/ue0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/bm;->f:Lcom/daaw/ue0;

    return-object p0
.end method

.method public static synthetic k(Lcom/daaw/bm;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/bm;->v(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic l(Lcom/daaw/bm;)Lcom/daaw/ep;
    .locals 0

    iget-object p0, p0, Lcom/daaw/bm;->b:Lcom/daaw/ep;

    return-object p0
.end method

.method public static synthetic m(Lcom/daaw/bm;)Lcom/daaw/zl;
    .locals 0

    iget-object p0, p0, Lcom/daaw/bm;->e:Lcom/daaw/zl;

    return-object p0
.end method

.method public static synthetic n(Lcom/daaw/bm;)Lcom/daaw/rj1;
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/bm;->L()Lcom/daaw/rj1;

    move-result-object p0

    return-object p0
.end method

.method public static o(Lcom/daaw/ue0;Lcom/daaw/a5;)Lcom/daaw/of1$a;
    .locals 6

    invoke-virtual {p0}, Lcom/daaw/ue0;->f()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lcom/daaw/a5;->e:Ljava/lang/String;

    iget-object v2, p1, Lcom/daaw/a5;->f:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/daaw/ue0;->a()Ljava/lang/String;

    move-result-object v3

    iget-object p0, p1, Lcom/daaw/a5;->c:Ljava/lang/String;

    invoke-static {p0}, Lcom/daaw/ws;->a(Ljava/lang/String;)Lcom/daaw/ws;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/ws;->b()I

    move-result v4

    iget-object v5, p1, Lcom/daaw/a5;->g:Lcom/daaw/mt;

    invoke-static/range {v0 .. v5}, Lcom/daaw/of1$a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/daaw/mt;)Lcom/daaw/of1$a;

    move-result-object p0

    return-object p0
.end method

.method public static p()Lcom/daaw/of1$b;
    .locals 16

    new-instance v0, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCount()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v3, v0

    mul-long v10, v1, v3

    invoke-static {}, Lcom/daaw/fh;->l()I

    move-result v5

    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v7

    invoke-static {}, Lcom/daaw/fh;->s()J

    move-result-wide v8

    invoke-static {}, Lcom/daaw/fh;->x()Z

    move-result v12

    invoke-static {}, Lcom/daaw/fh;->m()I

    move-result v13

    sget-object v14, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v15, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-static/range {v5 .. v15}, Lcom/daaw/of1$b;->c(ILjava/lang/String;IJJZILjava/lang/String;Ljava/lang/String;)Lcom/daaw/of1$b;

    move-result-object v0

    return-object v0
.end method

.method public static q()Lcom/daaw/of1$c;
    .locals 3

    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    sget-object v1, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    invoke-static {}, Lcom/daaw/fh;->y()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/daaw/of1$c;->a(Ljava/lang/String;Ljava/lang/String;Z)Lcom/daaw/of1$c;

    move-result-object v0

    return-object v0
.end method

.method public static r(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final B()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/daaw/bm;->l:Lcom/daaw/pb1;

    invoke-virtual {v0}, Lcom/daaw/pb1;->n()Ljava/util/SortedSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedSet;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Ljava/util/SortedSet;->first()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public F(Lcom/daaw/zb1;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/daaw/bm;->G(Lcom/daaw/zb1;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V

    return-void
.end method

.method public declared-synchronized G(Lcom/daaw/zb1;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V
    .locals 10

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Handling uncaught exception \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\" from thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-object v0, p0, Lcom/daaw/bm;->e:Lcom/daaw/zl;

    new-instance v1, Lcom/daaw/bm$b;

    move-object v2, v1

    move-object v3, p0

    move-object v6, p3

    move-object v7, p2

    move-object v8, p1

    move v9, p4

    invoke-direct/range {v2 .. v9}, Lcom/daaw/bm$b;-><init>(Lcom/daaw/bm;JLjava/lang/Throwable;Ljava/lang/Thread;Lcom/daaw/zb1;Z)V

    invoke-virtual {v0, v1}, Lcom/daaw/zl;->i(Ljava/util/concurrent/Callable;)Lcom/daaw/rj1;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {p1}, Lcom/daaw/yq1;->d(Lcom/daaw/rj1;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p2

    const-string p3, "Error handling uncaught exception"

    invoke-virtual {p2, p3, p1}, Lcom/daaw/ml0;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p1

    const-string p2, "Cannot send reports. Timed out while fetching settings."

    invoke-virtual {p1, p2}, Lcom/daaw/ml0;->d(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public H()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/bm;->m:Lcom/daaw/an;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/an;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public J()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/bm;->g:Lcom/daaw/h10;

    sget-object v1, Lcom/daaw/bm;->s:Ljava/io/FilenameFilter;

    invoke-virtual {v0, v1}, Lcom/daaw/h10;->f(Ljava/io/FilenameFilter;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final K(J)Lcom/daaw/rj1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/bm;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p1

    const-string p2, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists"

    invoke-virtual {p1, p2}, Lcom/daaw/ml0;->k(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/daaw/dk1;->e(Ljava/lang/Object;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v1, "Logging app exception event to Firebase Analytics"

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(I)V

    new-instance v1, Lcom/daaw/bm$h;

    invoke-direct {v1, p0, p1, p2}, Lcom/daaw/bm$h;-><init>(Lcom/daaw/bm;J)V

    invoke-static {v0, v1}, Lcom/daaw/dk1;->c(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public final L()Lcom/daaw/rj1;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/daaw/bm;->J()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {p0, v3, v4}, Lcom/daaw/bm;->K(J)Lcom/daaw/rj1;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Could not parse app exception timestamp from file "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/daaw/ml0;->k(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lcom/daaw/dk1;->f(Ljava/util/Collection;)Lcom/daaw/rj1;

    move-result-object v0

    return-object v0
.end method

.method public M(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/bm;->e:Lcom/daaw/zl;

    new-instance v1, Lcom/daaw/bm$g;

    invoke-direct {v1, p0, p1}, Lcom/daaw/bm$g;-><init>(Lcom/daaw/bm;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/daaw/zl;->h(Ljava/util/concurrent/Callable;)Lcom/daaw/rj1;

    return-void
.end method

.method public N(Lcom/daaw/rj1;)Lcom/daaw/rj1;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "TaskMainThread"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/rj1<",
            "Lcom/daaw/tb1;",
            ">;)",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/bm;->l:Lcom/daaw/pb1;

    invoke-virtual {v0}, Lcom/daaw/pb1;->l()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p1

    const-string v0, "No crash reports are available to be sent."

    invoke-virtual {p1, v0}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/bm;->o:Lcom/daaw/tj1;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lcom/daaw/tj1;->e(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/daaw/dk1;->e(Ljava/lang/Object;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v1, "Crash reports are available to be sent."

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/daaw/bm;->O()Lcom/daaw/rj1;

    move-result-object v0

    new-instance v1, Lcom/daaw/bm$d;

    invoke-direct {v1, p0, p1}, Lcom/daaw/bm$d;-><init>(Lcom/daaw/bm;Lcom/daaw/rj1;)V

    invoke-virtual {v0, v1}, Lcom/daaw/rj1;->o(Lcom/daaw/ai1;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public final O()Lcom/daaw/rj1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/bm;->b:Lcom/daaw/ep;

    invoke-virtual {v0}, Lcom/daaw/ep;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v1, "Automatic data collection is enabled. Allowing upload."

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/bm;->o:Lcom/daaw/tj1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/daaw/tj1;->e(Ljava/lang/Object;)Z

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/daaw/dk1;->e(Ljava/lang/Object;)Lcom/daaw/rj1;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v1, "Automatic data collection is disabled."

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v1, "Notifying that unsent reports are available."

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/bm;->o:Lcom/daaw/tj1;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/daaw/tj1;->e(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/daaw/bm;->b:Lcom/daaw/ep;

    invoke-virtual {v0}, Lcom/daaw/ep;->g()Lcom/daaw/rj1;

    move-result-object v0

    new-instance v1, Lcom/daaw/bm$c;

    invoke-direct {v1, p0}, Lcom/daaw/bm$c;-><init>(Lcom/daaw/bm;)V

    invoke-virtual {v0, v1}, Lcom/daaw/rj1;->o(Lcom/daaw/ai1;)Lcom/daaw/rj1;

    move-result-object v0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v1

    const-string v2, "Waiting for send/deleteUnsentReports to be called."

    invoke-virtual {v1, v2}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/bm;->p:Lcom/daaw/tj1;

    invoke-virtual {v1}, Lcom/daaw/tj1;->a()Lcom/daaw/rj1;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/yq1;->j(Lcom/daaw/rj1;Lcom/daaw/rj1;)Lcom/daaw/rj1;

    move-result-object v0

    return-object v0
.end method

.method public final P(Ljava/lang/String;)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/daaw/bm;->a:Landroid/content/Context;

    const-string v1, "activity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Landroid/app/ActivityManager;->getHistoricalProcessExitReasons(Ljava/lang/String;II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/daaw/fl0;

    iget-object v2, p0, Lcom/daaw/bm;->g:Lcom/daaw/h10;

    invoke-direct {v1, v2, p1}, Lcom/daaw/fl0;-><init>(Lcom/daaw/h10;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/daaw/bm;->g:Lcom/daaw/h10;

    iget-object v3, p0, Lcom/daaw/bm;->e:Lcom/daaw/zl;

    invoke-static {p1, v2, v3}, Lcom/daaw/nq1;->c(Ljava/lang/String;Lcom/daaw/h10;Lcom/daaw/zl;)Lcom/daaw/nq1;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/bm;->l:Lcom/daaw/pb1;

    invoke-virtual {v3, p1, v0, v1, v2}, Lcom/daaw/pb1;->t(Ljava/lang/String;Ljava/util/List;Lcom/daaw/fl0;Lcom/daaw/nq1;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No ApplicationExitInfo available. Session: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ANR feature enabled, but device is API "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public Q(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v6, p0, Lcom/daaw/bm;->e:Lcom/daaw/zl;

    new-instance v7, Lcom/daaw/bm$f;

    move-object v0, v7

    move-object v1, p0

    move-object v4, p2

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/daaw/bm$f;-><init>(Lcom/daaw/bm;JLjava/lang/Throwable;Ljava/lang/Thread;)V

    invoke-virtual {v6, v7}, Lcom/daaw/zl;->g(Ljava/lang/Runnable;)Lcom/daaw/rj1;

    return-void
.end method

.method public R(JLjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/bm;->e:Lcom/daaw/zl;

    new-instance v1, Lcom/daaw/bm$e;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/daaw/bm$e;-><init>(Lcom/daaw/bm;JLjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/daaw/zl;->h(Ljava/util/concurrent/Callable;)Lcom/daaw/rj1;

    return-void
.end method

.method public s()Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/bm;->c:Lcom/daaw/em;

    invoke-virtual {v0}, Lcom/daaw/em;->c()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/bm;->B()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/daaw/bm;->j:Lcom/daaw/fm;

    invoke-interface {v2, v0}, Lcom/daaw/fm;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_1
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v2, "Found previous crash marker."

    invoke-virtual {v0, v2}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/bm;->c:Lcom/daaw/em;

    invoke-virtual {v0}, Lcom/daaw/em;->d()Z

    return v1
.end method

.method public t(Lcom/daaw/zb1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lcom/daaw/bm;->u(ZLcom/daaw/zb1;)V

    return-void
.end method

.method public final u(ZLcom/daaw/zb1;)V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/daaw/bm;->l:Lcom/daaw/pb1;

    invoke-virtual {v1}, Lcom/daaw/pb1;->n()Ljava/util/SortedSet;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-gt v1, p1, :cond_0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p1

    const-string p2, "No open sessions to be closed."

    invoke-virtual {p1, p2}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2}, Lcom/daaw/zb1;->b()Lcom/daaw/tb1;

    move-result-object p2

    iget-object p2, p2, Lcom/daaw/tb1;->b:Lcom/daaw/tb1$a;

    iget-boolean p2, p2, Lcom/daaw/tb1$a;->b:Z

    if-eqz p2, :cond_1

    invoke-virtual {p0, v1}, Lcom/daaw/bm;->P(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p2

    const-string v2, "ANR feature disabled."

    invoke-virtual {p2, v2}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V

    :goto_0
    iget-object p2, p0, Lcom/daaw/bm;->j:Lcom/daaw/fm;

    invoke-interface {p2, v1}, Lcom/daaw/fm;->c(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p0, v1}, Lcom/daaw/bm;->y(Ljava/lang/String;)V

    :cond_2
    const/4 p2, 0x0

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Ljava/lang/String;

    :cond_3
    iget-object p1, p0, Lcom/daaw/bm;->l:Lcom/daaw/pb1;

    invoke-static {}, Lcom/daaw/bm;->C()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1, p2}, Lcom/daaw/pb1;->i(JLjava/lang/String;)V

    return-void
.end method

.method public final v(Ljava/lang/String;)V
    .locals 8

    invoke-static {}, Lcom/daaw/bm;->C()J

    move-result-wide v6

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Opening a new session with ID "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Lcom/daaw/dm;->i()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Crashlytics Android SDK/%s"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lcom/daaw/bm;->f:Lcom/daaw/ue0;

    iget-object v1, p0, Lcom/daaw/bm;->h:Lcom/daaw/a5;

    invoke-static {v0, v1}, Lcom/daaw/bm;->o(Lcom/daaw/ue0;Lcom/daaw/a5;)Lcom/daaw/of1$a;

    move-result-object v0

    invoke-static {}, Lcom/daaw/bm;->q()Lcom/daaw/of1$c;

    move-result-object v1

    invoke-static {}, Lcom/daaw/bm;->p()Lcom/daaw/of1$b;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/bm;->j:Lcom/daaw/fm;

    invoke-static {v0, v1, v3}, Lcom/daaw/of1;->b(Lcom/daaw/of1$a;Lcom/daaw/of1$c;Lcom/daaw/of1$b;)Lcom/daaw/of1;

    move-result-object v5

    move-object v0, v4

    move-object v1, p1

    move-wide v3, v6

    invoke-interface/range {v0 .. v5}, Lcom/daaw/fm;->d(Ljava/lang/String;Ljava/lang/String;JLcom/daaw/of1;)V

    iget-object v0, p0, Lcom/daaw/bm;->i:Lcom/daaw/fl0;

    invoke-virtual {v0, p1}, Lcom/daaw/fl0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/bm;->l:Lcom/daaw/pb1;

    invoke-virtual {v0, p1, v6, v7}, Lcom/daaw/pb1;->o(Ljava/lang/String;J)V

    return-void
.end method

.method public final w(J)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/daaw/bm;->g:Lcom/daaw/h10;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ".ae"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/h10;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->createNewFile()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Create new file failed."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p2

    const-string v0, "Could not create app exception marker file."

    invoke-virtual {p2, v0, p1}, Lcom/daaw/ml0;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public x(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;Lcom/daaw/zb1;)V
    .locals 2

    iput-object p3, p0, Lcom/daaw/bm;->n:Lcom/daaw/zb1;

    invoke-virtual {p0, p1}, Lcom/daaw/bm;->M(Ljava/lang/String;)V

    new-instance p1, Lcom/daaw/bm$a;

    invoke-direct {p1, p0}, Lcom/daaw/bm$a;-><init>(Lcom/daaw/bm;)V

    new-instance v0, Lcom/daaw/an;

    iget-object v1, p0, Lcom/daaw/bm;->j:Lcom/daaw/fm;

    invoke-direct {v0, p1, p3, p2, v1}, Lcom/daaw/an;-><init>(Lcom/daaw/an$a;Lcom/daaw/zb1;Ljava/lang/Thread$UncaughtExceptionHandler;Lcom/daaw/fm;)V

    iput-object v0, p0, Lcom/daaw/bm;->m:Lcom/daaw/an;

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-void
.end method

.method public final y(Ljava/lang/String;)V
    .locals 6

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Finalizing native report for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/bm;->j:Lcom/daaw/fm;

    invoke-interface {v0, p1}, Lcom/daaw/fm;->a(Ljava/lang/String;)Lcom/daaw/yr0;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/yr0;->d()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    move-result-wide v1

    new-instance v3, Lcom/daaw/fl0;

    iget-object v4, p0, Lcom/daaw/bm;->g:Lcom/daaw/h10;

    invoke-direct {v3, v4, p1}, Lcom/daaw/fl0;-><init>(Lcom/daaw/h10;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/daaw/bm;->g:Lcom/daaw/h10;

    invoke-virtual {v4, p1}, Lcom/daaw/h10;->i(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-nez v5, :cond_1

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p1

    const-string v0, "Couldn\'t create directory to store native session files, aborting."

    invoke-virtual {p1, v0}, Lcom/daaw/ml0;->k(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {p0, v1, v2}, Lcom/daaw/bm;->w(J)V

    iget-object v1, p0, Lcom/daaw/bm;->g:Lcom/daaw/h10;

    invoke-virtual {v3}, Lcom/daaw/fl0;->b()[B

    move-result-object v2

    invoke-static {v0, p1, v1, v2}, Lcom/daaw/bm;->D(Lcom/daaw/yr0;Ljava/lang/String;Lcom/daaw/h10;[B)Ljava/util/List;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/daaw/xr0;->b(Ljava/io/File;Ljava/util/List;)V

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v1

    const-string v2, "CrashlyticsController#finalizePreviousNativeSession"

    invoke-virtual {v1, v2}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/bm;->l:Lcom/daaw/pb1;

    invoke-virtual {v1, p1, v0}, Lcom/daaw/pb1;->h(Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {v3}, Lcom/daaw/fl0;->a()V

    return-void

    :cond_2
    :goto_0
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No minidump data found for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/ml0;->k(Ljava/lang/String;)V

    return-void
.end method

.method public z(Lcom/daaw/zb1;)Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/bm;->e:Lcom/daaw/zl;

    invoke-virtual {v0}, Lcom/daaw/zl;->b()V

    invoke-virtual {p0}, Lcom/daaw/bm;->H()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p1

    const-string v0, "Skipping session finalization because a crash has already occurred."

    invoke-virtual {p1, v0}, Lcom/daaw/ml0;->k(Ljava/lang/String;)V

    return v1

    :cond_0
    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v2, "Finalizing previously open sessions."

    invoke-virtual {v0, v2}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V

    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0, v0, p1}, Lcom/daaw/bm;->u(ZLcom/daaw/zb1;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p1

    const-string v1, "Closed all previously open sessions."

    invoke-virtual {p1, v1}, Lcom/daaw/ml0;->i(Ljava/lang/String;)V

    return v0

    :catch_0
    move-exception p1

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v2, "Unable to finalize previously open sessions."

    invoke-virtual {v0, v2, p1}, Lcom/daaw/ml0;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v1
.end method
