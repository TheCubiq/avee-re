.class Lcom/daaw/avee/Design/AppDesign$2;
.super Ljava/lang/Object;
.source "AppDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/AppDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR1$Handler<",
        "Landroid/content/Context;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/AppDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/AppDesign;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/daaw/avee/Design/AppDesign$2;->this$0:Lcom/daaw/avee/Design/AppDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/content/Context;)Ljava/lang/Integer;
    .locals 2

    .line 65
    invoke-static {}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->isExporting()Z

    move-result v0

    const/4 v1, 0x0

    .line 68
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v0, :cond_0

    .line 66
    sget-object v0, Lcom/daaw/avee/Design/AppDesign;->onRequestRenderQualityEdgesValueExport:Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    return-object p1

    .line 68
    :cond_0
    sget-object v0, Lcom/daaw/avee/Design/AppDesign;->onRequestRenderQualityEdgesValueRealTime:Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 62
    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/AppDesign$2;->invoke(Landroid/content/Context;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
