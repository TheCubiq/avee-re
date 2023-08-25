.class public Lcom/daaw/gy0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/appcompat/view/menu/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/gy0;-><init>(Landroid/content/Context;Landroid/view/View;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/gy0;


# direct methods
.method public constructor <init>(Lcom/daaw/gy0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/gy0$a;->p:Lcom/daaw/gy0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/appcompat/view/menu/e;Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p1, p0, Lcom/daaw/gy0$a;->p:Lcom/daaw/gy0;

    iget-object p1, p1, Lcom/daaw/gy0;->e:Lcom/daaw/gy0$d;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Lcom/daaw/gy0$d;->onMenuItemClick(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public b(Landroidx/appcompat/view/menu/e;)V
    .locals 0

    return-void
.end method
