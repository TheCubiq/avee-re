.class public Lcom/daaw/jv1$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/jv1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/qw1$a<",
        "Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/jv1;


# direct methods
.method public constructor <init>(Lcom/daaw/jv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/jv1$d;->a:Lcom/daaw/jv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/jv1$d;->a:Lcom/daaw/jv1;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v0, v1}, Lcom/daaw/jv1;->a(Lcom/daaw/jv1;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-virtual {p0, p1}, Lcom/daaw/jv1$d;->a(Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)V

    return-void
.end method
