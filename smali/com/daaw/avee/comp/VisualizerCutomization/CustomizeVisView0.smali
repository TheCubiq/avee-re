.class public Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;
.super Ljava/lang/Object;
.source "CustomizeVisView0.java"


# instance fields
.field actionsElements:Landroid/view/View;

.field btnExpandAdd:Landroid/widget/ImageButton;

.field btnExpandReset:Landroid/widget/ImageButton;

.field private customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

.field expandAddElements:Landroid/view/View;

.field expandReset:Landroid/view/View;

.field gridAddElements:Landroid/widget/GridLayout;

.field mAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

.field mSectionedAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;

.field recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

.field scrollView1:Landroid/widget/ScrollView;

.field public selectedElementInTree:I

.field private final treeElements:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;)V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->treeElements:Ljava/util/List;

    const/4 v0, -0x1

    .line 46
    iput v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->selectedElementInTree:I

    .line 54
    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->closeReset()V

    return-void
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->toggleAddElements()V

    return-void
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->closeAddElements()V

    return-void
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->toggleReset()V

    return-void
.end method

.method static synthetic access$400(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    return-object p0
.end method

.method static synthetic access$500(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)Ljava/util/List;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->treeElements:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$600(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;Ljava/util/List;Z)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->updateCompositionFromTreeElements(Ljava/util/List;Z)V

    return-void
.end method

.method private closeAddElements()V
    .locals 4

    .line 365
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->btnExpandAdd:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget v2, v2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->shortAnimTime:I

    int-to-long v2, v2

    invoke-virtual {v0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 367
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->expandAddElements:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget v1, v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->shortAnimTime:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$10;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$10;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    return-void
.end method

.method private closeReset()V
    .locals 4

    .line 398
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->btnExpandReset:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget v2, v2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->shortAnimTime:I

    int-to-long v2, v2

    invoke-virtual {v0, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 400
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->expandReset:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget v1, v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->shortAnimTime:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$12;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$12;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    return-void
.end method

.method private openAddElements()V
    .locals 3

    .line 376
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->btnExpandAdd:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, -0x3dcc0000    # -45.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget v1, v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->shortAnimTime:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 378
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->expandAddElements:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 379
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->expandAddElements:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget v1, v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->shortAnimTime:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 381
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->scrollView1:Landroid/widget/ScrollView;

    new-instance v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$11;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$11;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)V

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private openReset()V
    .locals 3

    .line 409
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->btnExpandReset:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, -0x3dcc0000    # -45.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->rotation(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget v1, v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->shortAnimTime:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 411
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->expandReset:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 412
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->expandReset:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget v1, v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->shortAnimTime:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 414
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->scrollView1:Landroid/widget/ScrollView;

    new-instance v1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$13;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$13;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)V

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static parseCompositionData(Lcom/daaw/avee/comp/Visualizer/CustomComposition;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/Visualizer/CustomComposition;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;",
            ">;)V"
        }
    .end annotation

    .line 339
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/CustomComposition;->getEntryCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 343
    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/CustomComposition;->getEntry(I)Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, "CustomPropertiesList is null"

    .line 345
    invoke-static {v2}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    goto :goto_1

    .line 349
    :cond_0
    invoke-virtual {v2}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getTypeName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, -0x1

    const-string v5, "_id"

    .line 350
    invoke-virtual {v2, v5, v4}, Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;->getPropertyInt(Ljava/lang/String;I)I

    move-result v4

    .line 351
    new-instance v5, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;

    invoke-direct {v5, v3, v2, v4}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;-><init>(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;I)V

    invoke-interface {p1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private toggleAddElements()V
    .locals 1

    .line 357
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->expandAddElements:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 358
    invoke-direct {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->closeAddElements()V

    goto :goto_0

    .line 360
    :cond_0
    invoke-direct {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->openAddElements()V

    :goto_0
    return-void
.end method

.method private toggleReset()V
    .locals 1

    .line 390
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->expandReset:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 391
    invoke-direct {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->closeReset()V

    goto :goto_0

    .line 393
    :cond_0
    invoke-direct {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->openReset()V

    :goto_0
    return-void
.end method

.method private updateCompositionFromScene(Lcom/daaw/avee/comp/Visualizer/CustomScene;Z)V
    .locals 0

    .line 432
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->parseCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V

    .line 433
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onCompositionChanged(Z)V

    return-void
.end method

.method private updateCompositionFromTreeElements(Ljava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;",
            ">;Z)V"
        }
    .end annotation

    .line 425
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget-object v0, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->customizationScene:Lcom/daaw/avee/comp/Visualizer/CustomScene;

    invoke-virtual {p0, v0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->rebuildSceneFromTreeData(Lcom/daaw/avee/comp/Visualizer/CustomScene;Ljava/util/List;)V

    .line 427
    iget p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->selectedElementInTree:I

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->setTreeData(I)V

    .line 428
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onCompositionChanged(Z)V

    return-void
.end method


# virtual methods
.method public getThreeItem(I)Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;
    .locals 1

    if-ltz p1, :cond_0

    .line 529
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->treeElements:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 530
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->treeElements:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public isCollapsed()Z
    .locals 4

    .line 283
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->actionsElements:Landroid/view/View;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v3, 0x8

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 284
    :goto_1
    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->mAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->getCollapsed()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v3, 0x1

    :goto_3
    if-eqz v0, :cond_4

    if-eqz v3, :cond_4

    const/4 v1, 0x1

    :cond_4
    return v1
.end method

.method isViewCreated()Z
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->btnExpandAdd:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onCreatedView0(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;Landroid/app/Activity;[Ljava/lang/String;)V
    .locals 8

    const p1, 0x7f090045

    .line 64
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->actionsElements:Landroid/view/View;

    const p1, 0x7f0900ee

    .line 65
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->expandAddElements:Landroid/view/View;

    const p1, 0x7f0900ef

    .line 66
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->expandReset:Landroid/view/View;

    const p1, 0x7f09006f

    .line 68
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->btnExpandAdd:Landroid/widget/ImageButton;

    .line 69
    new-instance p3, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$1;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$1;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)V

    invoke-virtual {p1, p3}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f090070

    .line 79
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->btnExpandReset:Landroid/widget/ImageButton;

    .line 80
    new-instance p3, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$2;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$2;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)V

    invoke-virtual {p1, p3}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f090085

    .line 89
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    .line 90
    new-instance p3, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$3;

    invoke-direct {p3, p0, p4}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$3;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;Landroid/app/Activity;)V

    invoke-virtual {p1, p3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 97
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->expandAddElements:Landroid/view/View;

    check-cast p1, Landroid/widget/GridLayout;

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->gridAddElements:Landroid/widget/GridLayout;

    .line 100
    invoke-virtual {p1}, Landroid/widget/GridLayout;->removeAllViews()V

    .line 102
    new-instance p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$4;

    invoke-direct {p1, p0, p5}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$4;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;[Ljava/lang/String;)V

    const/4 p3, 0x0

    .line 116
    :goto_0
    array-length v0, p5

    const/4 v1, 0x0

    if-ge p3, v0, :cond_1

    .line 118
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    aget-object v2, p5, p3

    invoke-virtual {v0, v2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->isElementTypePr(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f0c0040

    .line 119
    invoke-static {p4, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_1

    :cond_0
    const v0, 0x7f0c003f

    .line 121
    invoke-static {p4, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    :goto_1
    const v1, 0x7f09006b

    .line 123
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 124
    invoke-virtual {v1, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 125
    aget-object v2, p5, p3

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 127
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    .line 137
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->gridAddElements:Landroid/widget/GridLayout;

    invoke-virtual {v1, v0}, Landroid/widget/GridLayout;->addView(Landroid/view/View;)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_1
    const p1, 0x7f0901ae

    .line 148
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ScrollView;

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->scrollView1:Landroid/widget/ScrollView;

    const p1, 0x7f090190

    .line 151
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    .line 153
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {p2, p4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 163
    new-instance v6, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->scrollView1:Landroid/widget/ScrollView;

    invoke-direct {v6, p4, v1, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;-><init>(Landroid/content/Context;Ljava/util/List;Landroid/view/ViewGroup;)V

    iput-object v6, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->mAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    .line 171
    new-instance p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;

    const v4, 0x7f0c0028

    const/4 v5, 0x0

    new-instance v7, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$5;

    invoke-direct {v7, p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$5;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)V

    move-object v2, p1

    move-object v3, p4

    invoke-direct/range {v2 .. v7}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;-><init>(Landroid/content/Context;IILcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;Lcom/daaw/avee/Common/Func/Func;)V

    iput-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->mSectionedAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;

    .line 183
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 187
    new-instance p1, Lcom/emtronics/dragsortrecycler/DragSortRecycler;

    invoke-direct {p1}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;-><init>()V

    const p2, 0x7f090074

    .line 188
    invoke-virtual {p1, p2}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->setViewHandleId(I)V

    const p2, 0x3ecccccd    # 0.4f

    .line 189
    invoke-virtual {p1, p2}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->setFloatingAlpha(F)V

    .line 190
    invoke-virtual {p4}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f060126

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->setFloatingBgColor(I)V

    const p2, 0x3e99999a    # 0.3f

    .line 192
    invoke-virtual {p1, p2}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->setAutoScrollSpeed(F)V

    const p2, 0x3dcccccd    # 0.1f

    .line 193
    invoke-virtual {p1, p2}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->setAutoScrollWindow(F)V

    .line 195
    new-instance p2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$6;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$6;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)V

    invoke-virtual {p1, p2}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->setOnItemMovedListener(Lcom/emtronics/dragsortrecycler/DragSortRecycler$OnItemMovedListener;)V

    .line 243
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 244
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->addOnItemTouchListener(Landroidx/recyclerview/widget/RecyclerView$OnItemTouchListener;)V

    .line 245
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Lcom/emtronics/dragsortrecycler/DragSortRecycler;->getScrollListener()Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 247
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->mAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    new-instance p3, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$7;

    invoke-direct {p3, p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$7;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;Lcom/emtronics/dragsortrecycler/DragSortRecycler;)V

    invoke-virtual {p2, p3}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->setOnDraggingListener(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnDraggingListener;)V

    .line 254
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->mAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    new-instance p2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$8;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$8;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)V

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->setOnItemClickListener(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnItemClickListener;)V

    .line 266
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->mSectionedAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;

    new-instance p2, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$9;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0$9;-><init>(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;)V

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->setOnItemClickListener(Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter$IOnItemClickListener;)V

    return-void
.end method

.method parseCustomizationData(Lcom/daaw/avee/comp/Visualizer/CustomScene;)V
    .locals 9

    .line 304
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->isView1Created()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->isViewCreated()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_3

    .line 308
    :cond_0
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->getEntryCount()I

    move-result v0

    .line 309
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->treeElements:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 314
    invoke-virtual {p1, v2}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->getEntry(I)Lcom/daaw/avee/comp/Visualizer/CustomComposition;

    move-result-object v3

    if-nez v3, :cond_1

    const-string v3, "CustomPropertiesList is null"

    .line 316
    invoke-static {v3}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    const/4 v4, 0x1

    if-nez v2, :cond_2

    .line 321
    iget-object v5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    const v6, 0x7f10019a

    invoke-virtual {v5, v6}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    .line 323
    :cond_2
    iget-object v5, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {v5}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f0e0008

    new-array v7, v4, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v1

    invoke-virtual {v5, v6, v2, v7}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    :goto_1
    const/4 v6, -0x1

    const-string v7, "_id"

    .line 327
    invoke-virtual {v3, v7, v6}, Lcom/daaw/avee/comp/Visualizer/CustomComposition;->getPropertyInt(Ljava/lang/String;I)I

    move-result v6

    .line 328
    iget-object v7, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->treeElements:Ljava/util/List;

    new-instance v8, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;

    invoke-direct {v8, v5, v3, v6, v4}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;-><init>(Ljava/lang/String;Lcom/daaw/avee/comp/Visualizer/CustomComposition;IZ)V

    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 330
    iget-object v4, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->treeElements:Ljava/util/List;

    invoke-static {v3, v4}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->parseCompositionData(Lcom/daaw/avee/comp/Visualizer/CustomComposition;Ljava/util/List;)V

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 333
    :cond_3
    iget p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->selectedElementInTree:I

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->setTreeData(I)V

    :cond_4
    :goto_3
    return-void
.end method

.method parsePropertyDataByIndex(I)V
    .locals 1

    const/4 v0, 0x0

    .line 545
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->parsePropertyDataByIndex(IZ)V

    return-void
.end method

.method parsePropertyDataByIndex(IZ)V
    .locals 1

    .line 552
    iput p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->selectedElementInTree:I

    .line 553
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onSelectedElementChanged(IZ)V

    .line 555
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->mSectionedAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->setSelectedItem(I)V

    :cond_0
    if-ltz p1, :cond_2

    .line 557
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->treeElements:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-ge p1, p2, :cond_2

    .line 558
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->treeElements:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;

    .line 559
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->getElement()Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object p2

    .line 560
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->getComposition()Lcom/daaw/avee/comp/Visualizer/CustomComposition;

    move-result-object p1

    if-eqz p2, :cond_1

    .line 562
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->parsePropertyData(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    goto :goto_0

    .line 564
    :cond_1
    iget-object p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->parsePropertyData(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    goto :goto_0

    .line 571
    :cond_2
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->parsePropertyData(Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    :goto_0
    return-void
.end method

.method rebuildSceneFromTreeData(Lcom/daaw/avee/comp/Visualizer/CustomScene;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/Visualizer/CustomScene;",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;",
            ">;)V"
        }
    .end annotation

    .line 438
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->removeAllEntries()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 447
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v5

    if-ge v2, v5, :cond_2

    .line 448
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;

    .line 449
    invoke-virtual {v5}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->getComposition()Lcom/daaw/avee/comp/Visualizer/CustomComposition;

    move-result-object v6

    .line 450
    invoke-virtual {v5}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->getElement()Lcom/daaw/avee/comp/Visualizer/CustomPropertiesList;

    move-result-object v5

    if-eqz v6, :cond_0

    .line 454
    invoke-virtual {v6}, Lcom/daaw/avee/comp/Visualizer/CustomComposition;->removeAllEntries()V

    .line 456
    invoke-virtual {p1, v3, v6}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->setEntry(ILcom/daaw/avee/comp/Visualizer/CustomComposition;)V

    add-int/lit8 v3, v3, 0x1

    move-object v1, v6

    const/4 v4, 0x0

    goto :goto_1

    :cond_0
    if-eqz v5, :cond_1

    if-eqz v1, :cond_1

    .line 459
    invoke-virtual {v1, v4, v5}, Lcom/daaw/avee/comp/Visualizer/CustomComposition;->setEntry(ILcom/daaw/avee/comp/Visualizer/CustomPropertiesList;)V

    add-int/lit8 v4, v4, 0x1

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public removeTreeItem(I)V
    .locals 2

    .line 511
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->isView1Created()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->isViewCreated()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 513
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->treeElements:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_1

    .line 514
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->treeElements:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 515
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->treeElements:Ljava/util/List;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->updateCompositionFromTreeElements(Ljava/util/List;Z)V

    .line 518
    :cond_1
    iget v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->selectedElementInTree:I

    if-ne p1, v0, :cond_2

    const/4 p1, -0x1

    .line 521
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->parsePropertyDataByIndex(I)V

    goto :goto_0

    .line 523
    :cond_2
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->parsePropertyDataByIndex(I)V

    :cond_3
    :goto_0
    return-void
.end method

.method public selectAndScrollToLast()V
    .locals 2

    .line 576
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->isView1Created()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->isViewCreated()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 579
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->treeElements:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 581
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->treeElements:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    .line 582
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->treeElements:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->parsePropertyDataByIndex(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public selectAndScrollToLast(I)V
    .locals 5

    .line 587
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->isView1Created()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->isViewCreated()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    const/4 v1, -0x1

    const/4 v2, -0x1

    .line 592
    :goto_0
    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->treeElements:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_3

    .line 593
    iget-object v3, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->treeElements:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;

    .line 595
    invoke-virtual {v3}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->getComposition()Lcom/daaw/avee/comp/Visualizer/CustomComposition;

    move-result-object v3

    if-eqz v3, :cond_1

    add-int/lit8 v1, v1, 0x1

    :cond_1
    if-le v1, p1, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v0, 0x1

    move v4, v2

    move v2, v0

    move v0, v4

    goto :goto_0

    :cond_3
    :goto_1
    if-lez v2, :cond_4

    .line 611
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->treeElements:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-le p1, v2, :cond_4

    .line 613
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->recyclerViewItems:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    .line 614
    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->parsePropertyDataByIndex(I)V

    :cond_4
    :goto_2
    return-void
.end method

.method public setCollapsed(Z)V
    .locals 2

    .line 290
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->actionsElements:Landroid/view/View;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    const/16 v1, 0x8

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 291
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->mAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->setCollapsed(Z)V

    :cond_2
    if-eqz p1, :cond_3

    .line 295
    invoke-direct {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->closeReset()V

    .line 296
    invoke-direct {p0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->closeAddElements()V

    :cond_3
    return-void
.end method

.method setTreeData(I)V
    .locals 1

    .line 477
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->treeElements:Ljava/util/List;

    invoke-virtual {p0, v0, p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->setTreeData(Ljava/util/List;I)V

    return-void
.end method

.method setTreeData(Ljava/util/List;I)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;",
            ">;I)V"
        }
    .end annotation

    .line 482
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->mAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    if-nez v0, :cond_0

    return-void

    .line 484
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 485
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 487
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_2

    .line 489
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;

    .line 494
    invoke-virtual {v4}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->isSection()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 495
    new-instance v5, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    iget-object v4, v4, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->name:Ljava/lang/String;

    invoke-direct {v5, v6, v4}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter$Section;-><init>(ILjava/lang/CharSequence;)V

    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 497
    :cond_1
    new-instance v5, Lcom/daaw/avee/Common/Tuple2;

    iget-object v6, v4, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->name:Ljava/lang/String;

    invoke-virtual {v4}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->getSubName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v6, v4}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 501
    :cond_2
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->mAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleAdapter;->setAllData(Ljava/util/List;)V

    .line 502
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->mSectionedAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;

    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->setSections(Ljava/util/List;)V

    .line 504
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->mSectionedAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->setSelectedItem(I)V

    .line 506
    iget-object p1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->customizeVisDialog:Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    iget p2, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->selectedElementInTree:I

    invoke-virtual {p1, p2, v2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->onSelectedElementChanged(IZ)V

    return-void
.end method

.method updateSelectedItemThreeView(I)V
    .locals 4

    if-ltz p1, :cond_0

    .line 468
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->treeElements:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 469
    iget-object v0, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->treeElements:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;

    .line 471
    iget-object v1, p0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisView0;->mSectionedAdapter:Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;

    new-instance v2, Lcom/daaw/avee/Common/Tuple2;

    iget-object v3, v0, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->name:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog$ThreeEntry;->getSubName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, p1, v2}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomSimpleSectionedAdapter;->baseAdapterSetDataAt(ILcom/daaw/avee/Common/Tuple2;)V

    :cond_0
    return-void
.end method
