.class public Lcom/daaw/jp0$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/MenuItem$OnActionExpandListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/jp0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final a:Landroid/view/MenuItem$OnActionExpandListener;

.field public final synthetic b:Lcom/daaw/jp0;


# direct methods
.method public constructor <init>(Lcom/daaw/jp0;Landroid/view/MenuItem$OnActionExpandListener;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/jp0$d;->b:Lcom/daaw/jp0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/jp0$d;->a:Landroid/view/MenuItem$OnActionExpandListener;

    return-void
.end method


# virtual methods
.method public onMenuItemActionCollapse(Landroid/view/MenuItem;)Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/jp0$d;->a:Landroid/view/MenuItem$OnActionExpandListener;

    iget-object v1, p0, Lcom/daaw/jp0$d;->b:Lcom/daaw/jp0;

    invoke-virtual {v1, p1}, Lcom/daaw/va;->c(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/view/MenuItem$OnActionExpandListener;->onMenuItemActionCollapse(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onMenuItemActionExpand(Landroid/view/MenuItem;)Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/jp0$d;->a:Landroid/view/MenuItem$OnActionExpandListener;

    iget-object v1, p0, Lcom/daaw/jp0$d;->b:Lcom/daaw/jp0;

    invoke-virtual {v1, p1}, Lcom/daaw/va;->c(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/view/MenuItem$OnActionExpandListener;->onMenuItemActionExpand(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
