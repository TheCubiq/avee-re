.class public Lcom/daaw/po;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Landroid/view/ViewGroup;

.field public b:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/po;)Landroid/view/ViewGroup;
    .locals 0

    iget-object p0, p0, Lcom/daaw/po;->a:Landroid/view/ViewGroup;

    return-object p0
.end method


# virtual methods
.method public b(Lcom/daaw/ho;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/po;->a:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget p1, p1, Lcom/daaw/ho;->p:I

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    new-instance v0, Lcom/daaw/po$b;

    invoke-direct {v0, p0}, Lcom/daaw/po$b;-><init>(Lcom/daaw/po;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/po;->a:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/po;->b:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;Landroid/app/Activity;)V
    .locals 0

    const p1, 0x7f090206

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/daaw/po;->a:Landroid/view/ViewGroup;

    const p1, 0x7f090180

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/daaw/po;->b:Landroid/view/ViewGroup;

    const p1, 0x7f090081

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    new-instance p2, Lcom/daaw/po$a;

    invoke-direct {p2, p0}, Lcom/daaw/po$a;-><init>(Lcom/daaw/po;)V

    invoke-virtual {p1, p2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public f(Lcom/daaw/ho;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/po;->a:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    iget-object v0, p0, Lcom/daaw/po;->a:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget p1, p1, Lcom/daaw/ho;->p:I

    int-to-long v1, p1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    return-void
.end method

.method public g(Lcom/daaw/un;Ljava/lang/String;Lcom/daaw/w40;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/un;",
            "Ljava/lang/String;",
            "Lcom/daaw/w40<",
            "Lcom/daaw/e0<",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/ho;->k()Lcom/daaw/ho;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/ho;->p()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/daaw/po;->d()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    if-eqz p1, :cond_3

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/daaw/po;->b:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v2, p0, Lcom/daaw/po;->a:Landroid/view/ViewGroup;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setAlpha(F)V

    invoke-virtual {p0, v0}, Lcom/daaw/po;->f(Lcom/daaw/ho;)V

    invoke-virtual {p1, p2}, Lcom/daaw/un;->q(Ljava/lang/String;)Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/po;->b:Landroid/view/ViewGroup;

    const/4 v5, 0x1

    move-object v2, p1

    move-object v4, p2

    move-object v6, p3

    invoke-static/range {v0 .. v6}, Lcom/daaw/no;->l(Lcom/daaw/ho;Landroid/view/LayoutInflater;Lcom/daaw/un;Landroid/view/ViewGroup;Ljava/lang/String;ZLcom/daaw/w40;)Z

    return-void

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/daaw/po;->b:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {p0, v0}, Lcom/daaw/po;->b(Lcom/daaw/ho;)V

    :cond_4
    :goto_1
    return-void
.end method
