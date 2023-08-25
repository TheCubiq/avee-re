.class public final Lcom/daaw/vw5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qq5;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/zj4;

.field public final c:Lcom/daaw/fa3;

.field public final d:Lcom/daaw/g77;

.field public final e:Lcom/daaw/en6;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/zj4;Lcom/daaw/en6;Lcom/daaw/g77;Lcom/daaw/fa3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vw5;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/vw5;->b:Lcom/daaw/zj4;

    iput-object p3, p0, Lcom/daaw/vw5;->e:Lcom/daaw/en6;

    iput-object p4, p0, Lcom/daaw/vw5;->d:Lcom/daaw/g77;

    iput-object p5, p0, Lcom/daaw/vw5;->c:Lcom/daaw/fa3;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/fi6;Lcom/daaw/th6;)Z
    .locals 0

    iget-object p1, p0, Lcom/daaw/vw5;->c:Lcom/daaw/fa3;

    if-eqz p1, :cond_0

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
    .locals 7

    new-instance v6, Lcom/daaw/tw5;

    new-instance v2, Landroid/view/View;

    iget-object v0, p0, Lcom/daaw/vw5;->a:Landroid/content/Context;

    invoke-direct {v2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    sget-object v4, Lcom/daaw/ow5;->a:Lcom/daaw/ow5;

    iget-object v0, p2, Lcom/daaw/th6;->v:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/daaw/uh6;

    const/4 v3, 0x0

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/daaw/tw5;-><init>(Lcom/daaw/vw5;Landroid/view/View;Lcom/daaw/a74;Lcom/daaw/xl4;Lcom/daaw/uh6;)V

    iget-object v0, p0, Lcom/daaw/vw5;->b:Lcom/daaw/zj4;

    new-instance v1, Lcom/daaw/rm4;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lcom/daaw/rm4;-><init>(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v6}, Lcom/daaw/zj4;->a(Lcom/daaw/rm4;Lcom/daaw/gj4;)Lcom/daaw/aj4;

    move-result-object p1

    new-instance v0, Lcom/daaw/w93;

    invoke-virtual {p1}, Lcom/daaw/aj4;->k()Lcom/daaw/uw5;

    move-result-object v1

    iget-object p2, p2, Lcom/daaw/th6;->t:Lcom/daaw/yh6;

    iget-object v2, p2, Lcom/daaw/yh6;->b:Ljava/lang/String;

    iget-object p2, p2, Lcom/daaw/yh6;->a:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Lcom/daaw/w93;-><init>(Lcom/google/android/gms/ads/internal/zzf;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/vw5;->e:Lcom/daaw/en6;

    sget-object v1, Lcom/daaw/ym6;->I:Lcom/daaw/ym6;

    new-instance v2, Lcom/daaw/sw5;

    invoke-direct {v2, p0, v0}, Lcom/daaw/sw5;-><init>(Lcom/daaw/vw5;Lcom/daaw/w93;)V

    iget-object v0, p0, Lcom/daaw/vw5;->d:Lcom/daaw/g77;

    invoke-static {v2, v0, v1, p2}, Lcom/daaw/lm6;->d(Lcom/daaw/fm6;Lcom/daaw/g77;Ljava/lang/Object;Lcom/daaw/wm6;)Lcom/daaw/vm6;

    move-result-object p2

    sget-object v0, Lcom/daaw/ym6;->J:Lcom/daaw/ym6;

    invoke-virtual {p2, v0}, Lcom/daaw/vm6;->b(Ljava/lang/Object;)Lcom/daaw/vm6;

    move-result-object p2

    invoke-virtual {p1}, Lcom/daaw/aj4;->h()Lcom/daaw/zi4;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/daaw/vm6;->d(Lcom/daaw/f77;)Lcom/daaw/vm6;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic c(Lcom/daaw/w93;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/vw5;->c:Lcom/daaw/fa3;

    invoke-interface {v0, p1}, Lcom/daaw/fa3;->a0(Lcom/daaw/ca3;)V

    return-void
.end method
