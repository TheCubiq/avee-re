.class public Lcom/daaw/p30$c;
.super Landroidx/fragment/app/e;
.source ""

# interfaces
.implements Lcom/daaw/nt1;
.implements Lcom/daaw/yt0;
.implements Lcom/daaw/z0;
.implements Lcom/daaw/w30;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/p30;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/fragment/app/e<",
        "Lcom/daaw/p30;",
        ">;",
        "Lcom/daaw/nt1;",
        "Lcom/daaw/yt0;",
        "Lcom/daaw/z0;",
        "Lcom/daaw/w30;"
    }
.end annotation


# instance fields
.field public final synthetic u:Lcom/daaw/p30;


# direct methods
.method public constructor <init>(Lcom/daaw/p30;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/p30$c;->u:Lcom/daaw/p30;

    invoke-direct {p0, p1}, Landroidx/fragment/app/e;-><init>(Lcom/daaw/p30;)V

    return-void
.end method


# virtual methods
.method public a()Landroidx/lifecycle/c;
    .locals 1

    iget-object v0, p0, Lcom/daaw/p30$c;->u:Lcom/daaw/p30;

    iget-object v0, v0, Lcom/daaw/p30;->G:Landroidx/lifecycle/e;

    return-object v0
.end method

.method public b(Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/p30$c;->u:Lcom/daaw/p30;

    invoke-virtual {p1, p2}, Lcom/daaw/p30;->B(Landroidx/fragment/app/Fragment;)V

    return-void
.end method

.method public c()Landroidx/activity/OnBackPressedDispatcher;
    .locals 1

    iget-object v0, p0, Lcom/daaw/p30$c;->u:Lcom/daaw/p30;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->c()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    return-object v0
.end method

.method public e()Landroidx/activity/result/a;
    .locals 1

    iget-object v0, p0, Lcom/daaw/p30$c;->u:Lcom/daaw/p30;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->e()Landroidx/activity/result/a;

    move-result-object v0

    return-object v0
.end method

.method public f(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/daaw/p30$c;->u:Lcom/daaw/p30;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public g()Lcom/daaw/mt1;
    .locals 1

    iget-object v0, p0, Lcom/daaw/p30$c;->u:Lcom/daaw/p30;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->g()Lcom/daaw/mt1;

    move-result-object v0

    return-object v0
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/p30$c;->u:Lcom/daaw/p30;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic m()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/p30$c;->r()Lcom/daaw/p30;

    move-result-object v0

    return-object v0
.end method

.method public n()Landroid/view/LayoutInflater;
    .locals 2

    iget-object v0, p0, Lcom/daaw/p30$c;->u:Lcom/daaw/p30;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/p30$c;->u:Lcom/daaw/p30;

    invoke-virtual {v0, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    return-object v0
.end method

.method public o(Landroidx/fragment/app/Fragment;)Z
    .locals 0

    iget-object p1, p0, Lcom/daaw/p30$c;->u:Lcom/daaw/p30;

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public q()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/p30$c;->u:Lcom/daaw/p30;

    invoke-virtual {v0}, Lcom/daaw/p30;->E()V

    return-void
.end method

.method public r()Lcom/daaw/p30;
    .locals 1

    iget-object v0, p0, Lcom/daaw/p30$c;->u:Lcom/daaw/p30;

    return-object v0
.end method
