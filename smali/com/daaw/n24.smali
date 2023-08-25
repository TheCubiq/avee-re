.class public final Lcom/daaw/n24;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/daaw/y24;

.field public final c:Landroid/view/ViewGroup;

.field public d:Lcom/daaw/m24;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/daaw/a74;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lcom/daaw/n24;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/n24;->c:Landroid/view/ViewGroup;

    iput-object p3, p0, Lcom/daaw/n24;->b:Lcom/daaw/y24;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/n24;->d:Lcom/daaw/m24;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/m24;
    .locals 1

    iget-object v0, p0, Lcom/daaw/n24;->d:Lcom/daaw/m24;

    return-object v0
.end method

.method public final b(IIII)V
    .locals 1

    const-string v0, "The underlay may only be modified from the UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/n24;->d:Lcom/daaw/m24;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/m24;->h(IIII)V

    :cond_0
    return-void
.end method

.method public final c(IIIIIZLcom/daaw/x24;Ljava/lang/Integer;)V
    .locals 12

    move-object v0, p0

    iget-object v1, v0, Lcom/daaw/n24;->d:Lcom/daaw/m24;

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Lcom/daaw/n24;->b:Lcom/daaw/y24;

    invoke-interface {v1}, Lcom/daaw/y24;->zzo()Lcom/daaw/t93;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/t93;->a()Lcom/daaw/v93;

    move-result-object v1

    iget-object v2, v0, Lcom/daaw/n24;->b:Lcom/daaw/y24;

    invoke-interface {v2}, Lcom/daaw/y24;->zzn()Lcom/daaw/s93;

    move-result-object v2

    const-string v3, "vpr2"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/daaw/n93;->a(Lcom/daaw/v93;Lcom/daaw/s93;[Ljava/lang/String;)Z

    new-instance v1, Lcom/daaw/m24;

    iget-object v5, v0, Lcom/daaw/n24;->a:Landroid/content/Context;

    iget-object v6, v0, Lcom/daaw/n24;->b:Lcom/daaw/y24;

    invoke-interface {v6}, Lcom/daaw/y24;->zzo()Lcom/daaw/t93;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/t93;->a()Lcom/daaw/v93;

    move-result-object v9

    move-object v4, v1

    move/from16 v7, p5

    move/from16 v8, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    invoke-direct/range {v4 .. v11}, Lcom/daaw/m24;-><init>(Landroid/content/Context;Lcom/daaw/y24;IZLcom/daaw/v93;Lcom/daaw/x24;Ljava/lang/Integer;)V

    iput-object v1, v0, Lcom/daaw/n24;->d:Lcom/daaw/m24;

    iget-object v2, v0, Lcom/daaw/n24;->c:Landroid/view/ViewGroup;

    new-instance v3, Landroid/view/ViewGroup$LayoutParams;

    const/4 v4, -0x1

    invoke-direct {v3, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    const/4 v4, 0x0

    invoke-virtual {v2, v1, v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, v0, Lcom/daaw/n24;->d:Lcom/daaw/m24;

    move v2, p1

    move v3, p2

    move v5, p3

    move/from16 v6, p4

    invoke-virtual {v1, p1, p2, p3, v6}, Lcom/daaw/m24;->h(IIII)V

    iget-object v1, v0, Lcom/daaw/n24;->b:Lcom/daaw/y24;

    invoke-interface {v1, v4}, Lcom/daaw/y24;->zzB(Z)V

    return-void
.end method

.method public final d()V
    .locals 2

    const-string v0, "onDestroy must be called from the UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/n24;->d:Lcom/daaw/m24;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/m24;->r()V

    iget-object v0, p0, Lcom/daaw/n24;->c:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/daaw/n24;->d:Lcom/daaw/m24;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/n24;->d:Lcom/daaw/m24;

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 1

    const-string v0, "onPause must be called from the UI thread."

    invoke-static {v0}, Lcom/daaw/ry0;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/n24;->d:Lcom/daaw/m24;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/m24;->x()V

    :cond_0
    return-void
.end method

.method public final f(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/n24;->d:Lcom/daaw/m24;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/m24;->e(I)V

    :cond_0
    return-void
.end method
