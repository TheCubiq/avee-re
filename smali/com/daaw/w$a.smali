.class public final Lcom/daaw/w$a;
.super Landroid/view/View$AccessibilityDelegate;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lcom/daaw/w;


# direct methods
.method public constructor <init>(Lcom/daaw/w;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    iput-object p1, p0, Lcom/daaw/w$a;->a:Lcom/daaw/w;

    return-void
.end method


# virtual methods
.method public dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/w$a;->a:Lcom/daaw/w;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/w;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 1

    iget-object v0, p0, Lcom/daaw/w$a;->a:Lcom/daaw/w;

    invoke-virtual {v0, p1}, Lcom/daaw/w;->b(Landroid/view/View;)Lcom/daaw/z;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/z;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/AccessibilityNodeProvider;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/w$a;->a:Lcom/daaw/w;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/w;->f(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 2

    invoke-static {p2}, Lcom/daaw/y;->D0(Landroid/view/accessibility/AccessibilityNodeInfo;)Lcom/daaw/y;

    move-result-object v0

    invoke-static {p1}, Lcom/daaw/xs1;->Y(Landroid/view/View;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/y;->s0(Z)V

    invoke-static {p1}, Lcom/daaw/xs1;->T(Landroid/view/View;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/y;->k0(Z)V

    invoke-static {p1}, Lcom/daaw/xs1;->r(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/y;->p0(Ljava/lang/CharSequence;)V

    invoke-static {p1}, Lcom/daaw/xs1;->M(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/y;->y0(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/daaw/w$a;->a:Lcom/daaw/w;

    invoke-virtual {v1, p1, v0}, Lcom/daaw/w;->g(Landroid/view/View;Lcom/daaw/y;)V

    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {v0, p2, p1}, Lcom/daaw/y;->f(Ljava/lang/CharSequence;Landroid/view/View;)V

    invoke-static {p1}, Lcom/daaw/w;->c(Landroid/view/View;)Ljava/util/List;

    move-result-object p1

    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p2, v1, :cond_0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/y$a;

    invoke-virtual {v0, v1}, Lcom/daaw/y;->b(Lcom/daaw/y$a;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/w$a;->a:Lcom/daaw/w;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/w;->h(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/w$a;->a:Lcom/daaw/w;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/w;->i(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/w$a;->a:Lcom/daaw/w;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/w;->j(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public sendAccessibilityEvent(Landroid/view/View;I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/w$a;->a:Lcom/daaw/w;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/w;->l(Landroid/view/View;I)V

    return-void
.end method

.method public sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/w$a;->a:Lcom/daaw/w;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/w;->m(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method
