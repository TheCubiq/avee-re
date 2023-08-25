.class public final Lcom/daaw/nl2;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final c:Landroid/os/ConditionVariable;

.field public static volatile d:Lcom/daaw/ku6;

.field public static volatile e:Ljava/util/Random;


# instance fields
.field public final a:Lcom/daaw/wm2;

.field public volatile b:Ljava/lang/Boolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/os/ConditionVariable;

    invoke-direct {v0}, Landroid/os/ConditionVariable;-><init>()V

    sput-object v0, Lcom/daaw/nl2;->c:Landroid/os/ConditionVariable;

    const/4 v0, 0x0

    sput-object v0, Lcom/daaw/nl2;->d:Lcom/daaw/ku6;

    sput-object v0, Lcom/daaw/nl2;->e:Ljava/util/Random;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/wm2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/nl2;->a:Lcom/daaw/wm2;

    invoke-virtual {p1}, Lcom/daaw/wm2;->k()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    new-instance v0, Lcom/daaw/ml2;

    invoke-direct {v0, p0}, Lcom/daaw/ml2;-><init>(Lcom/daaw/nl2;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static bridge synthetic a()Landroid/os/ConditionVariable;
    .locals 1

    sget-object v0, Lcom/daaw/nl2;->c:Landroid/os/ConditionVariable;

    return-object v0
.end method

.method public static bridge synthetic b(Lcom/daaw/nl2;)Lcom/daaw/wm2;
    .locals 0

    iget-object p0, p0, Lcom/daaw/nl2;->a:Lcom/daaw/wm2;

    return-object p0
.end method

.method public static final d()I
    .locals 2

    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {}, Ljava/util/concurrent/ThreadLocalRandom;->current()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadLocalRandom;->nextInt()I

    move-result v0

    return v0

    :cond_0
    invoke-static {}, Lcom/daaw/nl2;->e()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    invoke-static {}, Lcom/daaw/nl2;->e()Ljava/util/Random;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    return v0
.end method

.method public static e()Ljava/util/Random;
    .locals 2

    sget-object v0, Lcom/daaw/nl2;->e:Ljava/util/Random;

    if-nez v0, :cond_1

    const-class v0, Lcom/daaw/nl2;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/nl2;->e:Ljava/util/Random;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    sput-object v1, Lcom/daaw/nl2;->e:Ljava/util/Random;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lcom/daaw/nl2;->e:Ljava/util/Random;

    return-object v0
.end method


# virtual methods
.method public final c(IIJLjava/lang/String;Ljava/lang/Exception;)V
    .locals 2

    :try_start_0
    sget-object v0, Lcom/daaw/nl2;->c:Landroid/os/ConditionVariable;

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->block()V

    iget-object v0, p0, Lcom/daaw/nl2;->b:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/daaw/nl2;->d:Lcom/daaw/ku6;

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/daaw/xh2;->L()Lcom/daaw/oh2;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/nl2;->a:Lcom/daaw/wm2;

    iget-object v1, v1, Lcom/daaw/wm2;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/oh2;->s(Ljava/lang/String;)Lcom/daaw/oh2;

    invoke-virtual {v0, p3, p4}, Lcom/daaw/oh2;->w(J)Lcom/daaw/oh2;

    if-eqz p5, :cond_0

    invoke-virtual {v0, p5}, Lcom/daaw/oh2;->t(Ljava/lang/String;)Lcom/daaw/oh2;

    :cond_0
    if-eqz p6, :cond_1

    new-instance p3, Ljava/io/StringWriter;

    invoke-direct {p3}, Ljava/io/StringWriter;-><init>()V

    new-instance p4, Ljava/io/PrintWriter;

    invoke-direct {p4, p3}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {p6, p4}, Ljava/lang/Exception;->printStackTrace(Ljava/io/PrintWriter;)V

    invoke-virtual {p3}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Lcom/daaw/oh2;->x(Ljava/lang/String;)Lcom/daaw/oh2;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Lcom/daaw/oh2;->v(Ljava/lang/String;)Lcom/daaw/oh2;

    :cond_1
    sget-object p3, Lcom/daaw/nl2;->d:Lcom/daaw/ku6;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p4

    check-cast p4, Lcom/daaw/xh2;

    invoke-virtual {p4}, Lcom/daaw/hq7;->a()[B

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/daaw/ku6;->a([B)Lcom/daaw/ju6;

    move-result-object p3

    invoke-virtual {p3, p1}, Lcom/daaw/ju6;->a(I)Lcom/daaw/ju6;

    const/4 p1, -0x1

    if-eq p2, p1, :cond_2

    invoke-virtual {p3, p2}, Lcom/daaw/ju6;->b(I)Lcom/daaw/ju6;

    :cond_2
    invoke-virtual {p3}, Lcom/daaw/ju6;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    return-void
.end method
