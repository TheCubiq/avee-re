.class public abstract Lcom/daaw/ma;
.super Lcom/daaw/eb;
.source ""


# instance fields
.field public t:Lcom/daaw/la;


# direct methods
.method public constructor <init>(Landroid/view/View;IZ)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/daaw/eb;-><init>(Landroid/view/View;)V

    new-instance v0, Lcom/daaw/la;

    if-eqz p3, :cond_0

    const p3, 0x7f09004c

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-direct {v0, p2, p1}, Lcom/daaw/la;-><init>(ILandroid/view/View;)V

    iput-object v0, p0, Lcom/daaw/ma;->t:Lcom/daaw/la;

    return-void
.end method


# virtual methods
.method public O(Lcom/daaw/wc0;I)V
    .locals 0

    iget-object p2, p0, Lcom/daaw/ma;->t:Lcom/daaw/la;

    invoke-interface {p1}, Lcom/daaw/wc0;->a()I

    move-result p1

    invoke-virtual {p2, p1}, Lcom/daaw/la;->d(I)V

    return-void
.end method
