.class public Lcom/daaw/x80;
.super Lcom/daaw/qa;
.source ""


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/daaw/wc0;)V
    .locals 1

    invoke-static {p1}, Lcom/daaw/gr1;->p(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const p3, 0x7f0c007a

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/qa;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public O(Lcom/daaw/wc0;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/daaw/ma;->O(Lcom/daaw/wc0;I)V

    return-void
.end method
