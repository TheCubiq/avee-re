.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty$1;
.super Ljava/lang/Object;
.source "CustomizeVisViewProperty.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->onCreatedView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;Landroid/app/Activity;)V
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

    .line 38
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty$1;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 41
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty$1;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;

    invoke-static {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;->access$000(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisViewProperty;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->closePropertyView()Z

    return-void
.end method
