.class public Lcom/daaw/pv1$k0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/pv1$k0;->b(Ljava/lang/Integer;Lcom/daaw/vn;Ljava/lang/Integer;Lcom/daaw/rw1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/e0<",
        "Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/rw1;

.field public final synthetic b:Lcom/daaw/pv1$k0;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1$k0;Lcom/daaw/rw1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$k0$a;->b:Lcom/daaw/pv1$k0;

    iput-object p2, p0, Lcom/daaw/pv1$k0$a;->a:Lcom/daaw/rw1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-virtual {p0, p1}, Lcom/daaw/pv1$k0$a;->b(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V

    return-void
.end method

.method public b(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/pv1$k0$a;->a:Lcom/daaw/rw1;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, -0x1

    invoke-static {p1, v0, v1}, Lcom/daaw/pv1;->b0(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;ZI)V

    :cond_0
    return-void
.end method
