.class public Lcom/daaw/pv1$c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/af0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/pv1$c;->a(Lcom/daaw/af0;Lcom/daaw/h2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public final synthetic b:Lcom/daaw/af0;

.field public final synthetic c:Lcom/daaw/pv1$c;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1$c;Lcom/daaw/af0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$c$a;->c:Lcom/daaw/pv1$c;

    iput-object p2, p0, Lcom/daaw/pv1$c$a;->b:Lcom/daaw/af0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$c$a;->a:Ljava/lang/Object;

    return-void
.end method

.method public b(Lcom/daaw/df0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/pv1$c$a;->c:Lcom/daaw/pv1$c;

    iget-object v0, v0, Lcom/daaw/pv1$c;->a:Lcom/daaw/pv1;

    invoke-static {v0}, Lcom/daaw/pv1;->D(Lcom/daaw/pv1;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/daaw/pv1$c$a$a;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/daaw/pv1$c$a$a;-><init>(Lcom/daaw/pv1$c$a;Lcom/daaw/df0;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/opengl/GLSurfaceView;->queueEvent(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
