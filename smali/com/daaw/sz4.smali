.class public Lcom/daaw/sz4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/c15;

.field public final b:Lcom/daaw/a74;


# direct methods
.method public constructor <init>(Lcom/daaw/c15;Lcom/daaw/a74;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/sz4;->a:Lcom/daaw/c15;

    iput-object p2, p0, Lcom/daaw/sz4;->b:Lcom/daaw/a74;

    return-void
.end method

.method public static final h(Lcom/daaw/fo6;)Lcom/daaw/ly4;
    .locals 2

    new-instance v0, Lcom/daaw/ly4;

    sget-object v1, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-direct {v0, p0, v1}, Lcom/daaw/ly4;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static final i(Lcom/daaw/h15;)Lcom/daaw/ly4;
    .locals 2

    new-instance v0, Lcom/daaw/ly4;

    sget-object v1, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-direct {v0, p0, v1}, Lcom/daaw/ly4;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method


# virtual methods
.method public final a()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/daaw/sz4;->b:Lcom/daaw/a74;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lcom/daaw/a74;->h()Landroid/webkit/WebView;

    move-result-object v0

    return-object v0
.end method

.method public final b()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/daaw/sz4;->b:Lcom/daaw/a74;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/a74;->h()Landroid/webkit/WebView;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()Lcom/daaw/a74;
    .locals 1

    iget-object v0, p0, Lcom/daaw/sz4;->b:Lcom/daaw/a74;

    return-object v0
.end method

.method public final d(Ljava/util/concurrent/Executor;)Lcom/daaw/ly4;
    .locals 3

    iget-object v0, p0, Lcom/daaw/sz4;->b:Lcom/daaw/a74;

    new-instance v1, Lcom/daaw/ly4;

    new-instance v2, Lcom/daaw/qz4;

    invoke-direct {v2, v0}, Lcom/daaw/qz4;-><init>(Lcom/daaw/a74;)V

    invoke-direct {v1, v2, p1}, Lcom/daaw/ly4;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object v1
.end method

.method public final e()Lcom/daaw/c15;
    .locals 1

    iget-object v0, p0, Lcom/daaw/sz4;->a:Lcom/daaw/c15;

    return-object v0
.end method

.method public f(Lcom/daaw/ip4;)Ljava/util/Set;
    .locals 2

    sget-object v0, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/ly4;

    invoke-direct {v1, p1, v0}, Lcom/daaw/ly4;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public g(Lcom/daaw/ip4;)Ljava/util/Set;
    .locals 2

    sget-object v0, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/ly4;

    invoke-direct {v1, p1, v0}, Lcom/daaw/ly4;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method
