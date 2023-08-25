.class public Lcom/daaw/gy0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/gy0$c;,
        Lcom/daaw/gy0$d;
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroidx/appcompat/view/menu/e;

.field public final c:Landroid/view/View;

.field public final d:Landroidx/appcompat/view/menu/h;

.field public e:Lcom/daaw/gy0$d;

.field public f:Lcom/daaw/gy0$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/daaw/gy0;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View;I)V
    .locals 6

    sget v4, Lcom/daaw/x01;->H:I

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Lcom/daaw/gy0;-><init>(Landroid/content/Context;Landroid/view/View;III)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View;III)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/gy0;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/gy0;->c:Landroid/view/View;

    new-instance v2, Landroidx/appcompat/view/menu/e;

    invoke-direct {v2, p1}, Landroidx/appcompat/view/menu/e;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/daaw/gy0;->b:Landroidx/appcompat/view/menu/e;

    new-instance v0, Lcom/daaw/gy0$a;

    invoke-direct {v0, p0}, Lcom/daaw/gy0$a;-><init>(Lcom/daaw/gy0;)V

    invoke-virtual {v2, v0}, Landroidx/appcompat/view/menu/e;->V(Landroidx/appcompat/view/menu/e$a;)V

    new-instance v7, Landroidx/appcompat/view/menu/h;

    const/4 v4, 0x0

    move-object v0, v7

    move-object v1, p1

    move-object v3, p2

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Landroidx/appcompat/view/menu/h;-><init>(Landroid/content/Context;Landroidx/appcompat/view/menu/e;Landroid/view/View;ZII)V

    iput-object v7, p0, Lcom/daaw/gy0;->d:Landroidx/appcompat/view/menu/h;

    invoke-virtual {v7, p3}, Landroidx/appcompat/view/menu/h;->h(I)V

    new-instance p1, Lcom/daaw/gy0$b;

    invoke-direct {p1, p0}, Lcom/daaw/gy0$b;-><init>(Lcom/daaw/gy0;)V

    invoke-virtual {v7, p1}, Landroidx/appcompat/view/menu/h;->i(Landroid/widget/PopupWindow$OnDismissListener;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/view/Menu;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gy0;->b:Landroidx/appcompat/view/menu/e;

    return-object v0
.end method

.method public b(Lcom/daaw/gy0$d;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/gy0;->e:Lcom/daaw/gy0$d;

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/gy0;->d:Landroidx/appcompat/view/menu/h;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/h;->k()V

    return-void
.end method
