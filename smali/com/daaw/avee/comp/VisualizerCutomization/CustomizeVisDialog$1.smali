.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$1;
.super Ljava/lang/Object;
.source "CustomizeVisDialog.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onVisualizerCustomizationChanged(Lcom/daaw/avee/comp/Visualizer/CustomScene;ZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Func/Func<",
        "Lcom/daaw/avee/Common/Action1<",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;)V
    .locals 0

    .line 223
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$1;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke()Lcom/daaw/avee/Common/Action1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/Action1<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 226
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$1;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget-object v0, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->view1:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$1;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-static {v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->access$000(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;)Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$1;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-static {v2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->access$100(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView1;->GetPropertyUpdateValueCb(Ljava/util/List;Ljava/lang/String;)Lcom/daaw/avee/Common/Action1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic onInvoke()Ljava/lang/Object;
    .locals 1

    .line 223
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$1;->onInvoke()Lcom/daaw/avee/Common/Action1;

    move-result-object v0

    return-object v0
.end method
