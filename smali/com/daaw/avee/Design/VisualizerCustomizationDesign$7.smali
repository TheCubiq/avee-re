.class Lcom/daaw/avee/Design/VisualizerCustomizationDesign$7;
.super Ljava/lang/Object;
.source "VisualizerCustomizationDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerCustomizationDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent4$Handler<",
        "Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;",
        "Lcom/daaw/avee/comp/Visualizer/CustomScene;",
        "Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerCustomizationDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerCustomizationDesign;)V
    .locals 0

    .line 150
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$7;->this$0:Lcom/daaw/avee/Design/VisualizerCustomizationDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomScene;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;)V
    .locals 0

    if-nez p2, :cond_0

    return-void

    :cond_0
    if-nez p3, :cond_1

    return-void

    .line 156
    :cond_1
    invoke-virtual {p3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getVersionId()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p1, p4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->clearAll(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_2

    const p3, 0x7f10019f

    .line 160
    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 161
    sget-object p3, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {p3, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 164
    :cond_2
    iget-object p1, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$7;->this$0:Lcom/daaw/avee/Design/VisualizerCustomizationDesign;

    const/4 p3, 0x0

    const/4 p4, -0x1

    invoke-static {p1, p2, p3, p4}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign;->access$100(Lcom/daaw/avee/Design/VisualizerCustomizationDesign;Lcom/daaw/avee/comp/Visualizer/CustomScene;ZI)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 150
    check-cast p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    check-cast p2, Lcom/daaw/avee/comp/Visualizer/CustomScene;

    check-cast p3, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    check-cast p4, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$7;->invoke(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Lcom/daaw/avee/comp/Visualizer/CustomScene;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;Ljava/lang/String;)V

    return-void
.end method
