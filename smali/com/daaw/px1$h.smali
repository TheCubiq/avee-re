.class public Lcom/daaw/px1$h;
.super Lcom/daaw/px1$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/px1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# instance fields
.field public m:Lcom/daaw/gg0;


# direct methods
.method public constructor <init>(Lcom/daaw/px1;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/px1$g;-><init>(Lcom/daaw/px1;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/px1$h;->m:Lcom/daaw/gg0;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/px1;Lcom/daaw/px1$h;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/px1$g;-><init>(Lcom/daaw/px1;Lcom/daaw/px1$g;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/px1$h;->m:Lcom/daaw/gg0;

    iget-object p1, p2, Lcom/daaw/px1$h;->m:Lcom/daaw/gg0;

    iput-object p1, p0, Lcom/daaw/px1$h;->m:Lcom/daaw/gg0;

    return-void
.end method


# virtual methods
.method public b()Lcom/daaw/px1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeStableInsets()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/px1;->w(Landroid/view/WindowInsets;)Lcom/daaw/px1;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/daaw/px1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/px1;->w(Landroid/view/WindowInsets;)Lcom/daaw/px1;

    move-result-object v0

    return-object v0
.end method

.method public final i()Lcom/daaw/gg0;
    .locals 4

    iget-object v0, p0, Lcom/daaw/px1$h;->m:Lcom/daaw/gg0;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/px1$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetLeft()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/px1$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v1}, Landroid/view/WindowInsets;->getStableInsetTop()I

    move-result v1

    iget-object v2, p0, Lcom/daaw/px1$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v2}, Landroid/view/WindowInsets;->getStableInsetRight()I

    move-result v2

    iget-object v3, p0, Lcom/daaw/px1$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v3}, Landroid/view/WindowInsets;->getStableInsetBottom()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/gg0;->b(IIII)Lcom/daaw/gg0;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/px1$h;->m:Lcom/daaw/gg0;

    :cond_0
    iget-object v0, p0, Lcom/daaw/px1$h;->m:Lcom/daaw/gg0;

    return-object v0
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1$g;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isConsumed()Z

    move-result v0

    return v0
.end method

.method public s(Lcom/daaw/gg0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/px1$h;->m:Lcom/daaw/gg0;

    return-void
.end method
