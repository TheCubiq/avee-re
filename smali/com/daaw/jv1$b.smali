.class public Lcom/daaw/jv1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/jv1;->d(Lcom/daaw/vn;ZI)V
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
.field public final synthetic a:Z

.field public final synthetic b:I

.field public final synthetic c:Lcom/daaw/jv1;


# direct methods
.method public constructor <init>(Lcom/daaw/jv1;ZI)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/jv1$b;->c:Lcom/daaw/jv1;

    iput-boolean p2, p0, Lcom/daaw/jv1$b;->a:Z

    iput p3, p0, Lcom/daaw/jv1$b;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-virtual {p0, p1}, Lcom/daaw/jv1$b;->b(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V

    return-void
.end method

.method public b(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/jv1$b;->a:Z

    iget v1, p0, Lcom/daaw/jv1$b;->b:I

    invoke-static {p1, v0, v1}, Lcom/daaw/pv1;->b0(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;ZI)V

    return-void
.end method
