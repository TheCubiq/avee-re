.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$4;
.super Ljava/lang/Object;
.source "CustomizeVisView1.java"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->onCreatedView1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$4;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 2

    .line 166
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$4;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;

    invoke-static {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->access$100(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 167
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$4;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;

    invoke-static {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->access$000(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$4;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;

    invoke-static {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->access$100(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->InvokeOnActionResetElement(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
