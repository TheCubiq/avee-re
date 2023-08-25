.class public Lcom/daaw/o30$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/o30;->m(ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/o30;


# direct methods
.method public constructor <init>(Lcom/daaw/o30;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/o30$f;->p:Lcom/daaw/o30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/o30$f;->p:Lcom/daaw/o30;

    invoke-static {v0}, Lcom/daaw/o30;->d(Lcom/daaw/o30;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/o30$f;->p:Lcom/daaw/o30;

    invoke-static {v0}, Lcom/daaw/o30;->e(Lcom/daaw/o30;)Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/opengl/GLSurfaceView;->setVisibility(I)V

    :cond_0
    return-void
.end method
