.class Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$5;
.super Ljava/lang/Object;
.source "CustomizeVisView0.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->onCreatedView0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;Landroid/app/Activity;[Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Func/Func<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)V
    .locals 0

    .line 172
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$5;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke()Ljava/lang/Boolean;
    .locals 1

    .line 175
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$5;->this$0:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;

    iget-object v0, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->mAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->getCollapsed()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic onInvoke()Ljava/lang/Object;
    .locals 1

    .line 172
    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$5;->onInvoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
