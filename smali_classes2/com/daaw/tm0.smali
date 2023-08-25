.class public final Lcom/daaw/tm0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/tm0;

.field public static final b:Z

.field public static final c:Lcom/daaw/rm0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/daaw/tm0;

    invoke-direct {v0}, Lcom/daaw/tm0;-><init>()V

    sput-object v0, Lcom/daaw/tm0;->a:Lcom/daaw/tm0;

    const-string v1, "kotlinx.coroutines.fast.service.loader"

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lcom/daaw/dj1;->e(Ljava/lang/String;Z)Z

    move-result v1

    sput-boolean v1, Lcom/daaw/tm0;->b:Z

    invoke-virtual {v0}, Lcom/daaw/tm0;->a()Lcom/daaw/rm0;

    move-result-object v0

    sput-object v0, Lcom/daaw/tm0;->c:Lcom/daaw/rm0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/rm0;
    .locals 7

    const-class v0, Lcom/daaw/sm0;

    const/4 v1, 0x0

    :try_start_0
    sget-boolean v2, Lcom/daaw/tm0;->b:Z

    if-eqz v2, :cond_0

    sget-object v0, Lcom/daaw/n00;->a:Lcom/daaw/n00;

    invoke-virtual {v0}, Lcom/daaw/n00;->c()Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v0, v2}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/jb1;->a(Ljava/util/Iterator;)Lcom/daaw/eb1;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/lb1;->d(Lcom/daaw/eb1;)Ljava/util/List;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    move-object v3, v1

    goto :goto_1

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    move-object v4, v3

    check-cast v4, Lcom/daaw/sm0;

    invoke-interface {v4}, Lcom/daaw/sm0;->getLoadPriority()I

    move-result v4

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/daaw/sm0;

    invoke-interface {v6}, Lcom/daaw/sm0;->getLoadPriority()I

    move-result v6

    if-ge v4, v6, :cond_4

    move-object v3, v5

    move v4, v6

    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_3

    :goto_1
    check-cast v3, Lcom/daaw/sm0;

    if-nez v3, :cond_5

    move-object v0, v1

    goto :goto_2

    :cond_5
    invoke-static {v3, v0}, Lcom/daaw/um0;->e(Lcom/daaw/sm0;Ljava/util/List;)Lcom/daaw/rm0;

    move-result-object v0

    :goto_2
    if-nez v0, :cond_6

    const/4 v0, 0x3

    invoke-static {v1, v1, v0, v1}, Lcom/daaw/um0;->b(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Lcom/daaw/kq0;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, Lcom/daaw/um0;->b(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)Lcom/daaw/kq0;

    move-result-object v0

    :cond_6
    :goto_3
    return-object v0
.end method
