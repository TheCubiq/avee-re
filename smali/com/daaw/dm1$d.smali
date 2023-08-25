.class public final Lcom/daaw/dm1$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/appcompat/view/menu/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/dm1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/dm1;


# direct methods
.method public constructor <init>(Lcom/daaw/dm1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/dm1$d;->p:Lcom/daaw/dm1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/appcompat/view/menu/e;Landroid/view/MenuItem;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public b(Landroidx/appcompat/view/menu/e;)V
    .locals 4

    iget-object v0, p0, Lcom/daaw/dm1$d;->p:Lcom/daaw/dm1;

    iget-object v0, v0, Lcom/daaw/dm1;->a:Lcom/daaw/iq;

    invoke-interface {v0}, Lcom/daaw/iq;->b()Z

    move-result v0

    const/16 v1, 0x6c

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/dm1$d;->p:Lcom/daaw/dm1;

    iget-object v0, v0, Lcom/daaw/dm1;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/dm1$d;->p:Lcom/daaw/dm1;

    iget-object v0, v0, Lcom/daaw/dm1;->b:Landroid/view/Window$Callback;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3, p1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/dm1$d;->p:Lcom/daaw/dm1;

    iget-object v0, v0, Lcom/daaw/dm1;->b:Landroid/view/Window$Callback;

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_1
    :goto_0
    return-void
.end method
