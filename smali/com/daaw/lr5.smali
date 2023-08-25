.class public final Lcom/daaw/lr5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qq5;


# instance fields
.field public final a:Lcom/daaw/yh4;

.field public final b:Landroid/content/Context;

.field public final c:Lcom/daaw/ia5;

.field public final d:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Lcom/daaw/yh4;Landroid/content/Context;Ljava/util/concurrent/Executor;Lcom/daaw/ia5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/lr5;->b:Landroid/content/Context;

    iput-object p1, p0, Lcom/daaw/lr5;->a:Lcom/daaw/yh4;

    iput-object p3, p0, Lcom/daaw/lr5;->d:Ljava/util/concurrent/Executor;

    iput-object p4, p0, Lcom/daaw/lr5;->c:Lcom/daaw/ia5;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/fi6;Lcom/daaw/th6;)Z
    .locals 0

    iget-object p1, p2, Lcom/daaw/th6;->t:Lcom/daaw/yh6;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/daaw/yh6;->a:Ljava/lang/String;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lcom/daaw/fi6;Lcom/daaw/th6;)Lcom/daaw/f77;
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object v0

    new-instance v1, Lcom/daaw/ir5;

    invoke-direct {v1, p0, p1, p2}, Lcom/daaw/ir5;-><init>(Lcom/daaw/lr5;Lcom/daaw/fi6;Lcom/daaw/th6;)V

    iget-object p1, p0, Lcom/daaw/lr5;->d:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic c(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 11

    iget-object p3, p0, Lcom/daaw/lr5;->b:Landroid/content/Context;

    iget-object v0, p2, Lcom/daaw/th6;->v:Ljava/util/List;

    invoke-static {p3, v0}, Lcom/daaw/vi6;->a(Landroid/content/Context;Ljava/util/List;)Lcom/google/android/gms/ads/internal/client/zzq;

    move-result-object p3

    iget-object v0, p0, Lcom/daaw/lr5;->c:Lcom/daaw/ia5;

    iget-object v1, p1, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v1, v1, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    invoke-virtual {v0, p3, p2, v1}, Lcom/daaw/ia5;->a(Lcom/google/android/gms/ads/internal/client/zzq;Lcom/daaw/th6;Lcom/daaw/wh6;)Lcom/daaw/a74;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/lr5;->a:Lcom/daaw/yh4;

    new-instance v9, Lcom/daaw/rm4;

    const/4 v10, 0x0

    invoke-direct {v9, p1, p2, v10}, Lcom/daaw/rm4;-><init>(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/String;)V

    new-instance p1, Lcom/daaw/rh4;

    invoke-static {p3}, Lcom/daaw/vi6;->c(Lcom/google/android/gms/ads/internal/client/zzq;)Lcom/daaw/uh6;

    move-result-object v5

    iget v6, p2, Lcom/daaw/th6;->b0:I

    iget-boolean v7, p2, Lcom/daaw/th6;->f0:Z

    iget-boolean v8, p2, Lcom/daaw/th6;->P:Z

    move-object v3, v0

    check-cast v3, Landroid/view/View;

    move-object v2, p1

    move-object v4, v0

    invoke-direct/range {v2 .. v8}, Lcom/daaw/rh4;-><init>(Landroid/view/View;Lcom/daaw/a74;Lcom/daaw/uh6;IZZ)V

    invoke-virtual {v1, v9, p1}, Lcom/daaw/yh4;->a(Lcom/daaw/rm4;Lcom/daaw/rh4;)Lcom/daaw/qh4;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/qh4;->i()Lcom/daaw/ha5;

    move-result-object p3

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1, v10}, Lcom/daaw/ha5;->i(Lcom/daaw/a74;ZLcom/daaw/bh3;)V

    invoke-virtual {p1}, Lcom/daaw/am4;->b()Lcom/daaw/gr4;

    move-result-object p3

    new-instance v1, Lcom/daaw/jr5;

    invoke-direct {v1, v0}, Lcom/daaw/jr5;-><init>(Lcom/daaw/a74;)V

    sget-object v2, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-virtual {p3, v1, v2}, Lcom/daaw/kw4;->n0(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p1}, Lcom/daaw/qh4;->i()Lcom/daaw/ha5;

    iget-object p2, p2, Lcom/daaw/th6;->t:Lcom/daaw/yh6;

    iget-object p3, p2, Lcom/daaw/yh6;->b:Ljava/lang/String;

    iget-object p2, p2, Lcom/daaw/yh6;->a:Ljava/lang/String;

    invoke-static {v0, p3, p2}, Lcom/daaw/ha5;->j(Lcom/daaw/a74;Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/f77;

    move-result-object p2

    new-instance p3, Lcom/daaw/kr5;

    invoke-direct {p3, p1}, Lcom/daaw/kr5;-><init>(Lcom/daaw/qh4;)V

    invoke-static {p2, p3, v2}, Lcom/daaw/s67;->m(Lcom/daaw/f77;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
