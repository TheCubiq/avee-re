.class public Lcom/daaw/pv1$e0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


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
        "Lcom/daaw/qw1$a<",
        "Lcom/daaw/al;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/pv1;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$e0;->a:Lcom/daaw/pv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/al;)V
    .locals 3

    new-instance v0, Lcom/daaw/gt;

    invoke-direct {v0}, Lcom/daaw/gt;-><init>()V

    iget-object v1, p0, Lcom/daaw/pv1$e0;->a:Lcom/daaw/pv1;

    invoke-static {v1}, Lcom/daaw/pv1;->D(Lcom/daaw/pv1;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz v1, :cond_0

    new-instance v2, Lcom/daaw/pv1$e0$a;

    invoke-direct {v2, p0, v1, v0, p1}, Lcom/daaw/pv1$e0$a;-><init>(Lcom/daaw/pv1$e0;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;Lcom/daaw/gt;Lcom/daaw/al;)V

    invoke-virtual {v1, v2}, Landroid/opengl/GLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/al;

    invoke-virtual {p0, p1}, Lcom/daaw/pv1$e0;->a(Lcom/daaw/al;)V

    return-void
.end method
