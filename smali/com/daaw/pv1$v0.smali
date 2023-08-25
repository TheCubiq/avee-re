.class public Lcom/daaw/pv1$v0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xw1$a;


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
        "Lcom/daaw/xw1$a<",
        "Ljava/lang/String;",
        "Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/pv1;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$v0;->a:Lcom/daaw/pv1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)Ljava/lang/String;
    .locals 1

    if-nez p1, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/pv1$v0;->a:Lcom/daaw/pv1;

    invoke-static {v0, p1, p2}, Lcom/daaw/pv1;->k(Lcom/daaw/pv1;Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/pv1$v0;->a(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
