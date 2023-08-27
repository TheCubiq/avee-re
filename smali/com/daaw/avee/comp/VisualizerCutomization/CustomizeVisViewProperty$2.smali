.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty$2;
.super Ljava/lang/Object;
.source "CustomizeVisViewProperty.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->closePropertyView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty$2;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 97
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty$2;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;

    invoke-static {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->access$100(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;)Landroid/view/ViewGroup;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void
.end method
