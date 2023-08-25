.class public Landroidx/appcompat/widget/c$b;
.super Landroid/widget/BaseAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic p:Landroidx/appcompat/widget/c;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/c$b;->p:Landroidx/appcompat/widget/c;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/c$b;->p:Landroidx/appcompat/widget/c;

    iget-object v0, v0, Landroidx/appcompat/widget/c;->r:Landroidx/appcompat/widget/b;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/c$b;->p:Landroidx/appcompat/widget/c;

    iget-object v0, v0, Landroidx/appcompat/widget/c;->r:Landroidx/appcompat/widget/b;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/c$d;

    invoke-virtual {p1}, Landroidx/appcompat/widget/c$d;->b()Lcom/daaw/i0$c;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    if-nez p2, :cond_0

    iget-object p2, p0, Landroidx/appcompat/widget/c$b;->p:Landroidx/appcompat/widget/c;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/c$b;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/i0$c;

    const/4 p3, 0x1

    invoke-virtual {p2, p1, p3}, Landroidx/appcompat/widget/c;->c(Lcom/daaw/i0$c;Z)Landroidx/appcompat/widget/c$d;

    move-result-object p2

    goto :goto_0

    :cond_0
    move-object p3, p2

    check-cast p3, Landroidx/appcompat/widget/c$d;

    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/c$b;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/i0$c;

    invoke-virtual {p3, p1}, Landroidx/appcompat/widget/c$d;->a(Lcom/daaw/i0$c;)V

    :goto_0
    return-object p2
.end method
