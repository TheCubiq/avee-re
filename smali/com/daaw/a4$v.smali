.class public final Lcom/daaw/a4$v;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/appcompat/view/menu/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/a4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "v"
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/a4;


# direct methods
.method public constructor <init>(Lcom/daaw/a4;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/a4$v;->p:Lcom/daaw/a4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroidx/appcompat/view/menu/e;Z)V
    .locals 4

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->F()Landroidx/appcompat/view/menu/e;

    move-result-object v0

    const/4 v1, 0x1

    if-eq v0, p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lcom/daaw/a4$v;->p:Lcom/daaw/a4;

    if-eqz v2, :cond_1

    move-object p1, v0

    :cond_1
    invoke-virtual {v3, p1}, Lcom/daaw/a4;->r0(Landroid/view/Menu;)Lcom/daaw/a4$u;

    move-result-object p1

    if-eqz p1, :cond_3

    if-eqz v2, :cond_2

    iget-object p2, p0, Lcom/daaw/a4$v;->p:Lcom/daaw/a4;

    iget v2, p1, Lcom/daaw/a4$u;->a:I

    invoke-virtual {p2, v2, p1, v0}, Lcom/daaw/a4;->d0(ILcom/daaw/a4$u;Landroid/view/Menu;)V

    iget-object p2, p0, Lcom/daaw/a4$v;->p:Lcom/daaw/a4;

    invoke-virtual {p2, p1, v1}, Lcom/daaw/a4;->h0(Lcom/daaw/a4$u;Z)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/daaw/a4$v;->p:Lcom/daaw/a4;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/a4;->h0(Lcom/daaw/a4$u;Z)V

    :cond_3
    :goto_1
    return-void
.end method

.method public c(Landroidx/appcompat/view/menu/e;)Z
    .locals 2

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->F()Landroidx/appcompat/view/menu/e;

    move-result-object v0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/daaw/a4$v;->p:Lcom/daaw/a4;

    iget-boolean v1, v0, Lcom/daaw/a4;->X:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/daaw/a4;->A0()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/a4$v;->p:Lcom/daaw/a4;

    iget-boolean v1, v1, Lcom/daaw/a4;->i0:Z

    if-nez v1, :cond_0

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
