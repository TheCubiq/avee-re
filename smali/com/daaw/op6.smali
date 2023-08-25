.class public final Lcom/daaw/op6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lcom/daaw/p04;

.field public final d:Lcom/daaw/vo6;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/daaw/p04;Lcom/daaw/vo6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/op6;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/op6;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lcom/daaw/op6;->c:Lcom/daaw/p04;

    iput-object p4, p0, Lcom/daaw/op6;->d:Lcom/daaw/vo6;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/op6;->c:Lcom/daaw/p04;

    invoke-virtual {v0, p1}, Lcom/daaw/p04;->zza(Ljava/lang/String;)Z

    return-void
.end method

.method public final synthetic b(Ljava/lang/String;Lcom/daaw/to6;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/op6;->a:Landroid/content/Context;

    const/16 v1, 0xe

    invoke-static {v0, v1}, Lcom/daaw/ho6;->a(Landroid/content/Context;I)Lcom/daaw/io6;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/io6;->zzh()Lcom/daaw/io6;

    iget-object v1, p0, Lcom/daaw/op6;->c:Lcom/daaw/p04;

    invoke-virtual {v1, p1}, Lcom/daaw/p04;->zza(Ljava/lang/String;)Z

    move-result p1

    invoke-interface {v0, p1}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    if-nez p2, :cond_0

    iget-object p1, p0, Lcom/daaw/op6;->d:Lcom/daaw/vo6;

    invoke-interface {v0}, Lcom/daaw/io6;->zzl()Lcom/daaw/mo6;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/vo6;->b(Lcom/daaw/mo6;)V

    return-void

    :cond_0
    invoke-virtual {p2, v0}, Lcom/daaw/to6;->a(Lcom/daaw/io6;)Lcom/daaw/to6;

    invoke-virtual {p2}, Lcom/daaw/to6;->g()V

    return-void
.end method

.method public final c(Ljava/lang/String;Lcom/daaw/to6;)V
    .locals 2

    invoke-static {}, Lcom/daaw/vo6;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/daaw/ta3;->d:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/op6;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/daaw/np6;

    invoke-direct {v1, p0, p1, p2}, Lcom/daaw/np6;-><init>(Lcom/daaw/op6;Ljava/lang/String;Lcom/daaw/to6;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    :goto_0
    iget-object p2, p0, Lcom/daaw/op6;->b:Ljava/util/concurrent/Executor;

    new-instance v0, Lcom/daaw/mp6;

    invoke-direct {v0, p0, p1}, Lcom/daaw/mp6;-><init>(Lcom/daaw/op6;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final d(Ljava/util/List;)V
    .locals 2

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/daaw/op6;->c(Ljava/lang/String;Lcom/daaw/to6;)V

    goto :goto_0

    :cond_0
    return-void
.end method
