.class public Lcom/daaw/ot$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qt0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ot;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/qt0<",
        "Lcom/daaw/sj0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ot;


# direct methods
.method public constructor <init>(Lcom/daaw/ot;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ot$d;->a:Lcom/daaw/ot;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation

    check-cast p1, Lcom/daaw/sj0;

    invoke-virtual {p0, p1}, Lcom/daaw/ot$d;->b(Lcom/daaw/sj0;)V

    return-void
.end method

.method public b(Lcom/daaw/sj0;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SyntheticAccessor"
        }
    .end annotation

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/daaw/ot$d;->a:Lcom/daaw/ot;

    invoke-static {p1}, Lcom/daaw/ot;->I1(Lcom/daaw/ot;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/daaw/ot$d;->a:Lcom/daaw/ot;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->p1()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/ot$d;->a:Lcom/daaw/ot;

    invoke-static {v0}, Lcom/daaw/ot;->G1(Lcom/daaw/ot;)Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v0, 0x3

    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->E0(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DialogFragment "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " setting the content view on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/ot$d;->a:Lcom/daaw/ot;

    invoke-static {v1}, Lcom/daaw/ot;->G1(Lcom/daaw/ot;)Landroid/app/Dialog;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v0, p0, Lcom/daaw/ot$d;->a:Lcom/daaw/ot;

    invoke-static {v0}, Lcom/daaw/ot;->G1(Lcom/daaw/ot;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "DialogFragment can not be attached to a container view"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    return-void
.end method
