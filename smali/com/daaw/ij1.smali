.class public Lcom/daaw/ij1;
.super Lcom/daaw/gj1;
.source ""


# instance fields
.field public e:Landroid/view/WindowInsetsController;


# direct methods
.method public constructor <init>(Landroid/view/View;ILandroid/view/Window;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/gj1;-><init>(Landroid/view/View;I)V

    invoke-virtual {p3}, Landroid/view/Window;->getInsetsController()Landroid/view/WindowInsetsController;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/ij1;->e:Landroid/view/WindowInsetsController;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ij1;->e:Landroid/view/WindowInsetsController;

    invoke-static {}, Landroid/view/WindowInsets$Type;->systemBars()I

    move-result v1

    invoke-interface {v0, v1}, Landroid/view/WindowInsetsController;->hide(I)V

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ij1;->e:Landroid/view/WindowInsetsController;

    invoke-static {}, Landroid/view/WindowInsets$Type;->systemBars()I

    move-result v1

    invoke-interface {v0, v1}, Landroid/view/WindowInsetsController;->show(I)V

    return-void
.end method
