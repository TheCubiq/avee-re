.class public Lcom/daaw/pv1$o0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/sw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/pv1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/sw1$a<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/pv1;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$o0;->a:Lcom/daaw/pv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/pv1$o0;->b(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    return-void
.end method

.method public b(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget v1, Lcom/daaw/j5;->I:I

    if-ne v0, v1, :cond_0

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object p2, p0, Lcom/daaw/pv1$o0;->a:Lcom/daaw/pv1;

    invoke-static {p2}, Lcom/daaw/pv1;->D(Lcom/daaw/pv1;)Ljava/lang/ref/WeakReference;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p2, p3, p1, v0, v1}, Lcom/daaw/pv1;->y(Lcom/daaw/pv1;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;IZ[I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p3

    sget v0, Lcom/daaw/j5;->L:I

    if-ne p3, v0, :cond_2

    iget-object p1, p0, Lcom/daaw/pv1$o0;->a:Lcom/daaw/pv1;

    invoke-static {p1}, Lcom/daaw/pv1;->i(Lcom/daaw/pv1;)I

    move-result p1

    sget-object p3, Lcom/daaw/avee/comp/playback/c;->k:Lcom/daaw/iw1;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/daaw/iw1;->a(Ljava/lang/Object;)V

    invoke-static {}, Lcom/daaw/avee/MainActivity;->q0()Lcom/daaw/o30;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p3, p0, Lcom/daaw/pv1$o0;->a:Lcom/daaw/pv1;

    invoke-static {p3}, Lcom/daaw/pv1;->z(Lcom/daaw/pv1;)F

    move-result v0

    invoke-static {p3, v0}, Lcom/daaw/pv1;->B(Lcom/daaw/pv1;F)F

    move-result p3

    invoke-virtual {p1, p3}, Lcom/daaw/o30;->k(F)V

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/daaw/o30;->n(I)V

    :cond_1
    invoke-static {}, Lcom/daaw/ko0;->q()Lcom/daaw/ko0;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/daaw/ko0;->J(I)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    sget p1, Lcom/daaw/j5;->W:I

    :cond_3
    :goto_0
    return-void
.end method
