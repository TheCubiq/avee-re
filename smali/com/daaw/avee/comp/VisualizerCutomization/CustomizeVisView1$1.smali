.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$1;
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

    .line 134
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$1;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 137
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1$1;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;

    invoke-static {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->access$000(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->goToView(I)Z

    return-void
.end method
