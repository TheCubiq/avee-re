.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$2;
.super Ljava/lang/Object;
.source "CustomizeVisView1.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


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

    .line 142
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$2;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 145
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$2;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;

    invoke-static {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->access$100(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 146
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$2;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;

    invoke-static {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->access$100(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName()Ljava/lang/String;

    move-result-object p1

    .line 147
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$2;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;

    invoke-static {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->access$100(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getVersionId()Ljava/lang/String;

    move-result-object v0

    .line 148
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$2;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;

    invoke-static {v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->access$000(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->InvokeOnElementWikiInfoAction(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
