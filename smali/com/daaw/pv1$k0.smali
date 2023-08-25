.class public Lcom/daaw/pv1$k0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/tw1$a;


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
        "Lcom/daaw/tw1$a<",
        "Ljava/lang/Integer;",
        "Lcom/daaw/vn;",
        "Ljava/lang/Integer;",
        "Lcom/daaw/rw1<",
        "Ljava/lang/Integer;",
        "Lcom/daaw/vn;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/pv1;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$k0;->a:Lcom/daaw/pv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lcom/daaw/vn;

    check-cast p3, Ljava/lang/Integer;

    check-cast p4, Lcom/daaw/rw1;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/pv1$k0;->b(Ljava/lang/Integer;Lcom/daaw/vn;Ljava/lang/Integer;Lcom/daaw/rw1;)V

    return-void
.end method

.method public b(Ljava/lang/Integer;Lcom/daaw/vn;Ljava/lang/Integer;Lcom/daaw/rw1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Lcom/daaw/vn;",
            "Ljava/lang/Integer;",
            "Lcom/daaw/rw1<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/vn;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/daaw/pv1$k0;->a:Lcom/daaw/pv1;

    invoke-static {p1}, Lcom/daaw/pv1;->D(Lcom/daaw/pv1;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz p1, :cond_0

    new-instance p3, Lcom/daaw/pv1$k0$a;

    invoke-direct {p3, p0, p4}, Lcom/daaw/pv1$k0$a;-><init>(Lcom/daaw/pv1$k0;Lcom/daaw/rw1;)V

    invoke-virtual {p1, p2, p3}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->o(Lcom/daaw/vn;Lcom/daaw/e0;)V

    :cond_0
    return-void
.end method
