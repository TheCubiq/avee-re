.class public Lcom/daaw/qx$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/qx;->A(Lcom/daaw/rx;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/qx;


# direct methods
.method public constructor <init>(Lcom/daaw/qx;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/qx$g;->p:Lcom/daaw/qx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    const/4 p1, 0x1

    sub-int/2addr p3, p1

    if-ltz p3, :cond_0

    iget-object p2, p0, Lcom/daaw/qx$g;->p:Lcom/daaw/qx;

    invoke-static {p2}, Lcom/daaw/qx;->c(Lcom/daaw/qx;)Lcom/daaw/rx;

    move-result-object p2

    iget-object p2, p2, Lcom/daaw/rx;->e:[Lcom/daaw/lv;

    array-length p2, p2

    if-ge p3, p2, :cond_0

    iget-object p2, p0, Lcom/daaw/qx$g;->p:Lcom/daaw/qx;

    invoke-static {p2}, Lcom/daaw/qx;->c(Lcom/daaw/qx;)Lcom/daaw/rx;

    move-result-object p2

    iget-object p2, p2, Lcom/daaw/rx;->e:[Lcom/daaw/lv;

    aget-object p2, p2, p3

    iget-object p3, p0, Lcom/daaw/qx$g;->p:Lcom/daaw/qx;

    invoke-static {p3}, Lcom/daaw/qx;->d(Lcom/daaw/qx;)Lcom/daaw/lv;

    move-result-object p3

    invoke-static {p2, p3}, Lcom/daaw/px;->c(Lcom/daaw/lv;Lcom/daaw/lv;)V

    iget-object p2, p0, Lcom/daaw/qx$g;->p:Lcom/daaw/qx;

    const/4 p3, 0x0

    const/4 p4, 0x0

    invoke-static {p2, p4, p4, p3, p1}, Lcom/daaw/qx;->n(Lcom/daaw/qx;FFZZ)V

    :cond_0
    iget-object p1, p0, Lcom/daaw/qx$g;->p:Lcom/daaw/qx;

    invoke-static {p1}, Lcom/daaw/qx;->g(Lcom/daaw/qx;)V

    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method
