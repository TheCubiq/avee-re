.class public Lcom/daaw/avee/Design/VisualizerCustomizationDesign;
.super Lcom/daaw/avee/Design/DesignBase;
.source "VisualizerCustomizationDesign.java"


# instance fields
.field private visualizerSurfaceView:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 49
    invoke-direct {p0}, Lcom/daaw/avee/Design/DesignBase;-><init>()V

    .line 46
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign;->visualizerSurfaceView:Ljava/lang/ref/WeakReference;

    .line 51
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onRequestIsElementTypePr:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$1;-><init>(Lcom/daaw/avee/Design/VisualizerCustomizationDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    .line 58
    sget-object v0, Lcom/daaw/avee/comp/VisualUI/Fragment2;->onSurfaceCreated:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$2;-><init>(Lcom/daaw/avee/Design/VisualizerCustomizationDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 65
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onAddElementAction:Lcom/daaw/avee/Common/Events/WeakEvent5;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$3;-><init>(Lcom/daaw/avee/Design/VisualizerCustomizationDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent5;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent5$Handler;Ljava/util/List;)V

    .line 75
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onActionDuplicate:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$4;-><init>(Lcom/daaw/avee/Design/VisualizerCustomizationDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 102
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onActionRemove:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$5;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$5;-><init>(Lcom/daaw/avee/Design/VisualizerCustomizationDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 114
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onElementWikiInfoAction:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$6;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$6;-><init>(Lcom/daaw/avee/Design/VisualizerCustomizationDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 150
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onActionResetElement:Lcom/daaw/avee/Common/Events/WeakEvent4;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$7;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$7;-><init>(Lcom/daaw/avee/Design/VisualizerCustomizationDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent4;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;Ljava/util/List;)V

    .line 169
    sget-object v0, Lnz/net/speakman/androidlicensespage/LicensesFragment;->onRequestUrl:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$8;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$8;-><init>(Lcom/daaw/avee/Design/VisualizerCustomizationDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    .line 182
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onRequestElementAvailableVersions:Lcom/daaw/avee/Common/Events/WeakEventR3;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$9;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$9;-><init>(Lcom/daaw/avee/Design/VisualizerCustomizationDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR3$Handler;Ljava/util/List;)V

    .line 192
    sget-object v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onBackPressed:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance v1, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$10;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$10;-><init>(Lcom/daaw/avee/Design/VisualizerCustomizationDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$002(Lcom/daaw/avee/Design/VisualizerCustomizationDesign;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign;->visualizerSurfaceView:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method static synthetic access$100(Lcom/daaw/avee/Design/VisualizerCustomizationDesign;Lcom/daaw/avee/comp/Visualizer/CustomScene;ZI)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign;->updateChangesToVisDialogGlTh(Lcom/daaw/avee/comp/Visualizer/CustomScene;ZI)V

    return-void
.end method

.method private updateChangesToVisDialogGlTh(Lcom/daaw/avee/comp/Visualizer/CustomScene;ZI)V
    .locals 2

    .line 210
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerCustomizationDesign;->visualizerSurfaceView:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;

    if-eqz v0, :cond_0

    .line 212
    new-instance v1, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$11;

    invoke-direct {v1, p0, p2, p3}, Lcom/daaw/avee/Design/VisualizerCustomizationDesign$11;-><init>(Lcom/daaw/avee/Design/VisualizerCustomizationDesign;ZI)V

    invoke-virtual {v0, p1, v1}, Lcom/daaw/avee/comp/Visualizer/VisualizerViewCore;->setThemeCustomizationDataUiTh(Lcom/daaw/avee/comp/Visualizer/CustomScene;Lcom/daaw/avee/Common/Action1;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public addElementToCustomScene(Lcom/daaw/avee/comp/Visualizer/CustomScene;Ljava/lang/String;)V
    .locals 1

    const-string v0, "Composition"

    .line 226
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 228
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->createDataEntry()Lcom/daaw/avee/comp/Visualizer/CustomComposition;

    move-result-object p1

    goto :goto_0

    .line 229
    :cond_0
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->getEntryCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 232
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->getEntryCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->getEntry(I)Lcom/daaw/avee/comp/Visualizer/CustomComposition;

    move-result-object p1

    .line 233
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/CustomComposition;->createDataEntry()Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    .line 238
    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->putChildTypeValue(Ljava/lang/String;)V

    :cond_2
    return-void
.end method
