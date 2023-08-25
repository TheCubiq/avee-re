.class public final Lcom/daaw/es6;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static volatile e:I = 0x1

.field public static final synthetic f:I


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lcom/daaw/rj1;

.field public final d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/daaw/rj1;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/es6;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/es6;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/daaw/es6;->c:Lcom/daaw/rj1;

    iput-boolean p4, p0, Lcom/daaw/es6;->d:Z

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/util/concurrent/Executor;Z)Lcom/daaw/es6;
    .locals 2

    new-instance v0, Lcom/daaw/tj1;

    invoke-direct {v0}, Lcom/daaw/tj1;-><init>()V

    if-eqz p2, :cond_0

    new-instance v1, Lcom/daaw/as6;

    invoke-direct {v1, p0, v0}, Lcom/daaw/as6;-><init>(Landroid/content/Context;Lcom/daaw/tj1;)V

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/daaw/bs6;

    invoke-direct {v1, v0}, Lcom/daaw/bs6;-><init>(Lcom/daaw/tj1;)V

    :goto_0
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    new-instance v1, Lcom/daaw/es6;

    invoke-virtual {v0}, Lcom/daaw/tj1;->a()Lcom/daaw/rj1;

    move-result-object v0

    invoke-direct {v1, p0, p1, v0, p2}, Lcom/daaw/es6;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/daaw/rj1;Z)V

    return-object v1
.end method

.method public static g(I)V
    .locals 0

    sput p0, Lcom/daaw/es6;->e:I

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/String;)Lcom/daaw/rj1;
    .locals 8

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move-object v7, p2

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/es6;->h(IJLjava/lang/Exception;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public final c(IJLjava/lang/Exception;)Lcom/daaw/rj1;
    .locals 8

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move v1, p1

    move-wide v2, p2

    move-object v4, p4

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/es6;->h(IJLjava/lang/Exception;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public final d(IJ)Lcom/daaw/rj1;
    .locals 8

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move v1, p1

    move-wide v2, p2

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/es6;->h(IJLjava/lang/Exception;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public final e(IJLjava/lang/String;)Lcom/daaw/rj1;
    .locals 8

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move-wide v2, p2

    move-object v7, p4

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/es6;->h(IJLjava/lang/Exception;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public final f(IJLjava/lang/String;Ljava/util/Map;)Lcom/daaw/rj1;
    .locals 8

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move v1, p1

    move-wide v2, p2

    move-object v5, p4

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/es6;->h(IJLjava/lang/Exception;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method

.method public final h(IJLjava/lang/Exception;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lcom/daaw/rj1;
    .locals 1

    iget-boolean p6, p0, Lcom/daaw/es6;->d:Z

    if-nez p6, :cond_0

    iget-object p1, p0, Lcom/daaw/es6;->c:Lcom/daaw/rj1;

    iget-object p2, p0, Lcom/daaw/es6;->b:Ljava/util/concurrent/Executor;

    sget-object p3, Lcom/daaw/cs6;->a:Lcom/daaw/cs6;

    invoke-virtual {p1, p2, p3}, Lcom/daaw/rj1;->g(Ljava/util/concurrent/Executor;Lcom/daaw/hl;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/daaw/xh2;->L()Lcom/daaw/oh2;

    move-result-object p6

    iget-object v0, p0, Lcom/daaw/es6;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p6, v0}, Lcom/daaw/oh2;->s(Ljava/lang/String;)Lcom/daaw/oh2;

    invoke-virtual {p6, p2, p3}, Lcom/daaw/oh2;->w(J)Lcom/daaw/oh2;

    sget p2, Lcom/daaw/es6;->e:I

    invoke-virtual {p6, p2}, Lcom/daaw/oh2;->y(I)Lcom/daaw/oh2;

    if-eqz p4, :cond_1

    invoke-static {p4}, Lcom/daaw/jz6;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p6, p2}, Lcom/daaw/oh2;->x(Ljava/lang/String;)Lcom/daaw/oh2;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p6, p2}, Lcom/daaw/oh2;->v(Ljava/lang/String;)Lcom/daaw/oh2;

    :cond_1
    if-eqz p7, :cond_2

    invoke-virtual {p6, p7}, Lcom/daaw/oh2;->t(Ljava/lang/String;)Lcom/daaw/oh2;

    :cond_2
    if-eqz p5, :cond_3

    invoke-virtual {p6, p5}, Lcom/daaw/oh2;->u(Ljava/lang/String;)Lcom/daaw/oh2;

    :cond_3
    iget-object p2, p0, Lcom/daaw/es6;->c:Lcom/daaw/rj1;

    iget-object p3, p0, Lcom/daaw/es6;->b:Ljava/util/concurrent/Executor;

    new-instance p4, Lcom/daaw/ds6;

    invoke-direct {p4, p6, p1}, Lcom/daaw/ds6;-><init>(Lcom/daaw/oh2;I)V

    invoke-virtual {p2, p3, p4}, Lcom/daaw/rj1;->g(Ljava/util/concurrent/Executor;Lcom/daaw/hl;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method
