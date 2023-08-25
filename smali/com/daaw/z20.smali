.class public Lcom/daaw/z20;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/z20$e;
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/wl0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/wl0<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Ljava/util/concurrent/ExecutorService;

.field public static final c:Ljava/lang/Object;

.field public static final d:Lcom/daaw/cd1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/cd1<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lcom/daaw/uj<",
            "Lcom/daaw/z20$e;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/daaw/wl0;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lcom/daaw/wl0;-><init>(I)V

    sput-object v0, Lcom/daaw/z20;->a:Lcom/daaw/wl0;

    const-string v0, "fonts-androidx"

    const/16 v1, 0xa

    const/16 v2, 0x2710

    invoke-static {v0, v1, v2}, Lcom/daaw/n41;->a(Ljava/lang/String;II)Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    sput-object v0, Lcom/daaw/z20;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/z20;->c:Ljava/lang/Object;

    new-instance v0, Lcom/daaw/cd1;

    invoke-direct {v0}, Lcom/daaw/cd1;-><init>()V

    sput-object v0, Lcom/daaw/z20;->d:Lcom/daaw/cd1;

    return-void
.end method

.method public static a(Lcom/daaw/x20;I)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/daaw/x20;->d()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "-"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lcom/daaw/b30$a;)I
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/b30$a;->c()I

    move-result v0

    const/4 v1, -0x3

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/b30$a;->c()I

    move-result p0

    if-eq p0, v2, :cond_0

    return v1

    :cond_0
    const/4 p0, -0x2

    return p0

    :cond_1
    invoke-virtual {p0}, Lcom/daaw/b30$a;->b()[Lcom/daaw/b30$b;

    move-result-object p0

    if-eqz p0, :cond_5

    array-length v0, p0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    array-length v0, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_5

    aget-object v4, p0, v3

    invoke-virtual {v4}, Lcom/daaw/b30$b;->b()I

    move-result v4

    if-eqz v4, :cond_4

    if-gez v4, :cond_3

    goto :goto_1

    :cond_3
    move v1, v4

    :goto_1
    return v1

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    :goto_2
    return v2
.end method

.method public static c(Ljava/lang/String;Landroid/content/Context;Lcom/daaw/x20;I)Lcom/daaw/z20$e;
    .locals 3

    sget-object v0, Lcom/daaw/z20;->a:Lcom/daaw/wl0;

    invoke-virtual {v0, p0}, Lcom/daaw/wl0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    new-instance p0, Lcom/daaw/z20$e;

    invoke-direct {p0, v1}, Lcom/daaw/z20$e;-><init>(Landroid/graphics/Typeface;)V

    return-object p0

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-static {p1, p2, v1}, Lcom/daaw/w20;->e(Landroid/content/Context;Lcom/daaw/x20;Landroid/os/CancellationSignal;)Lcom/daaw/b30$a;

    move-result-object p2
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {p2}, Lcom/daaw/z20;->b(Lcom/daaw/b30$a;)I

    move-result v2

    if-eqz v2, :cond_1

    new-instance p0, Lcom/daaw/z20$e;

    invoke-direct {p0, v2}, Lcom/daaw/z20$e;-><init>(I)V

    return-object p0

    :cond_1
    invoke-virtual {p2}, Lcom/daaw/b30$a;->b()[Lcom/daaw/b30$b;

    move-result-object p2

    invoke-static {p1, v1, p2, p3}, Lcom/daaw/to1;->b(Landroid/content/Context;Landroid/os/CancellationSignal;[Lcom/daaw/b30$b;I)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {v0, p0, p1}, Lcom/daaw/wl0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lcom/daaw/z20$e;

    invoke-direct {p0, p1}, Lcom/daaw/z20$e;-><init>(Landroid/graphics/Typeface;)V

    return-object p0

    :cond_2
    new-instance p0, Lcom/daaw/z20$e;

    const/4 p1, -0x3

    invoke-direct {p0, p1}, Lcom/daaw/z20$e;-><init>(I)V

    return-object p0

    :catch_0
    new-instance p0, Lcom/daaw/z20$e;

    const/4 p1, -0x1

    invoke-direct {p0, p1}, Lcom/daaw/z20$e;-><init>(I)V

    return-object p0
.end method

.method public static d(Landroid/content/Context;Lcom/daaw/x20;ILjava/util/concurrent/Executor;Lcom/daaw/ld;)Landroid/graphics/Typeface;
    .locals 5

    invoke-static {p1, p2}, Lcom/daaw/z20;->a(Lcom/daaw/x20;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/z20;->a:Lcom/daaw/wl0;

    invoke-virtual {v1, v0}, Lcom/daaw/wl0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    new-instance p0, Lcom/daaw/z20$e;

    invoke-direct {p0, v1}, Lcom/daaw/z20$e;-><init>(Landroid/graphics/Typeface;)V

    invoke-virtual {p4, p0}, Lcom/daaw/ld;->b(Lcom/daaw/z20$e;)V

    return-object v1

    :cond_0
    new-instance v1, Lcom/daaw/z20$b;

    invoke-direct {v1, p4}, Lcom/daaw/z20$b;-><init>(Lcom/daaw/ld;)V

    sget-object p4, Lcom/daaw/z20;->c:Ljava/lang/Object;

    monitor-enter p4

    :try_start_0
    sget-object v2, Lcom/daaw/z20;->d:Lcom/daaw/cd1;

    invoke-virtual {v2, v0}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit p4

    return-object v4

    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v0, v3}, Lcom/daaw/cd1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance p4, Lcom/daaw/z20$c;

    invoke-direct {p4, v0, p0, p1, p2}, Lcom/daaw/z20$c;-><init>(Ljava/lang/String;Landroid/content/Context;Lcom/daaw/x20;I)V

    if-nez p3, :cond_2

    sget-object p3, Lcom/daaw/z20;->b:Ljava/util/concurrent/ExecutorService;

    :cond_2
    new-instance p0, Lcom/daaw/z20$d;

    invoke-direct {p0, v0}, Lcom/daaw/z20$d;-><init>(Ljava/lang/String;)V

    invoke-static {p3, p4, p0}, Lcom/daaw/n41;->b(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;Lcom/daaw/uj;)V

    return-object v4

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static e(Landroid/content/Context;Lcom/daaw/x20;Lcom/daaw/ld;II)Landroid/graphics/Typeface;
    .locals 2

    invoke-static {p1, p3}, Lcom/daaw/z20;->a(Lcom/daaw/x20;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/daaw/z20;->a:Lcom/daaw/wl0;

    invoke-virtual {v1, v0}, Lcom/daaw/wl0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    new-instance p0, Lcom/daaw/z20$e;

    invoke-direct {p0, v1}, Lcom/daaw/z20$e;-><init>(Landroid/graphics/Typeface;)V

    invoke-virtual {p2, p0}, Lcom/daaw/ld;->b(Lcom/daaw/z20$e;)V

    return-object v1

    :cond_0
    const/4 v1, -0x1

    if-ne p4, v1, :cond_1

    invoke-static {v0, p0, p1, p3}, Lcom/daaw/z20;->c(Ljava/lang/String;Landroid/content/Context;Lcom/daaw/x20;I)Lcom/daaw/z20$e;

    move-result-object p0

    invoke-virtual {p2, p0}, Lcom/daaw/ld;->b(Lcom/daaw/z20$e;)V

    iget-object p0, p0, Lcom/daaw/z20$e;->a:Landroid/graphics/Typeface;

    return-object p0

    :cond_1
    new-instance v1, Lcom/daaw/z20$a;

    invoke-direct {v1, v0, p0, p1, p3}, Lcom/daaw/z20$a;-><init>(Ljava/lang/String;Landroid/content/Context;Lcom/daaw/x20;I)V

    :try_start_0
    sget-object p0, Lcom/daaw/z20;->b:Ljava/util/concurrent/ExecutorService;

    invoke-static {p0, v1, p4}, Lcom/daaw/n41;->c(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/Callable;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/z20$e;

    invoke-virtual {p2, p0}, Lcom/daaw/ld;->b(Lcom/daaw/z20$e;)V

    iget-object p0, p0, Lcom/daaw/z20$e;->a:Landroid/graphics/Typeface;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Lcom/daaw/z20$e;

    const/4 p1, -0x3

    invoke-direct {p0, p1}, Lcom/daaw/z20$e;-><init>(I)V

    invoke-virtual {p2, p0}, Lcom/daaw/ld;->b(Lcom/daaw/z20$e;)V

    const/4 p0, 0x0

    return-object p0
.end method
