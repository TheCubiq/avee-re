.class public Lcom/daaw/avee/Design/MainUIDesign;
.super Ljava/lang/Object;
.source "MainUIDesign.java"


# instance fields
.field listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field overrideForceLockOrient:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/MainUIDesign;->listenerRefHolder:Ljava/util/List;

    const/4 v0, 0x0

    .line 40
    iput v0, p0, Lcom/daaw/avee/Design/MainUIDesign;->overrideForceLockOrient:I

    .line 44
    sget-object v0, Lcom/daaw/avee/MainActivity;->onRequestAlbumArtLarge:Lcom/daaw/avee/Common/Events/WeakEvent4;

    new-instance v1, Lcom/daaw/avee/Design/MainUIDesign$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/MainUIDesign$1;-><init>(Lcom/daaw/avee/Design/MainUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/MainUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent4;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;Ljava/util/List;)V

    .line 69
    sget-object v0, Lcom/daaw/avee/MainActivity;->onMainUIAction:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/MainUIDesign$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/MainUIDesign$2;-><init>(Lcom/daaw/avee/Design/MainUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/MainUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 80
    sget-object v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->onIntPreferenceChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/MainUIDesign$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/MainUIDesign$3;-><init>(Lcom/daaw/avee/Design/MainUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/MainUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 89
    sget-object v0, Lcom/daaw/avee/MainActivity;->onRequestLockOrientState:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/MainUIDesign$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/MainUIDesign$4;-><init>(Lcom/daaw/avee/Design/MainUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/MainUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 102
    sget-object v0, Lcom/daaw/avee/MainActivity;->onPreviewOpen:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/MainUIDesign$5;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/MainUIDesign$5;-><init>(Lcom/daaw/avee/Design/MainUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/MainUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 111
    sget-object v0, Lcom/daaw/avee/EventsGlobal/EventsGlobalNotificationUI;->onExitAction:Lcom/daaw/avee/Common/Events/WeakEvent;

    new-instance v1, Lcom/daaw/avee/Design/MainUIDesign$6;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/MainUIDesign$6;-><init>(Lcom/daaw/avee/Design/MainUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/MainUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent$Handler;Ljava/util/List;)V

    .line 120
    sget-object v0, Lcom/daaw/avee/MainActivity;->onViewPagerPageSelected:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/MainUIDesign$7;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/MainUIDesign$7;-><init>(Lcom/daaw/avee/Design/MainUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/MainUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 129
    sget-object v0, Lcom/daaw/avee/MainActivity;->onViewPagerSwipeOutAtStart:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/MainUIDesign$8;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/MainUIDesign$8;-><init>(Lcom/daaw/avee/Design/MainUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/MainUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 142
    sget-object v0, Lcom/daaw/avee/MainActivity;->onViewPagerSwipeProgressUpdate:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/MainUIDesign$9;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/MainUIDesign$9;-><init>(Lcom/daaw/avee/Design/MainUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/MainUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 154
    sget-object v0, Lcom/daaw/avee/MainActivity;->onRequestTrackInfo:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/MainUIDesign$10;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/MainUIDesign$10;-><init>(Lcom/daaw/avee/Design/MainUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/MainUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/Design/MainUIDesign;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lcom/daaw/avee/Design/MainUIDesign;->toggleLockOrient()V

    return-void
.end method

.method static synthetic access$100(Lcom/daaw/avee/Design/MainUIDesign;I)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/daaw/avee/Design/MainUIDesign;->updateLockOrient(I)V

    return-void
.end method

.method private toggleLockOrient()V
    .locals 3

    .line 164
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v0

    sget v1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_lockOrient:I

    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result v0

    if-nez v0, :cond_0

    .line 167
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getInstance()Lcom/daaw/avee/MainActivity;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 170
    invoke-virtual {p0, v1}, Lcom/daaw/avee/Design/MainUIDesign;->getLockOrient(Lcom/daaw/avee/MainActivity;)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 177
    :cond_1
    :goto_0
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v1

    sget v2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_lockOrient:I

    invoke-virtual {v1, v2, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setInt(II)V

    return-void
.end method

.method private updateLockOrient(I)V
    .locals 3

    .line 182
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getInstance()Lcom/daaw/avee/MainActivity;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 186
    :goto_0
    invoke-virtual {v0, v2, v1}, Lcom/daaw/avee/MainActivity;->updateLockOrientIndicator(ZZ)V

    const/4 v1, -0x1

    if-eqz p1, :cond_1

    .line 191
    invoke-virtual {v0}, Lcom/daaw/avee/MainActivity;->getRequestedOrientation()I

    move-result v2

    if-ne v2, v1, :cond_2

    .line 195
    invoke-virtual {p0, v0, p1}, Lcom/daaw/avee/Design/MainUIDesign;->lockOrient(Lcom/daaw/avee/MainActivity;I)V

    goto :goto_1

    .line 198
    :cond_1
    invoke-virtual {v0, v1}, Lcom/daaw/avee/MainActivity;->setRequestedOrientation(I)V

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method getLockOrient(Lcom/daaw/avee/MainActivity;)I
    .locals 5

    const-string v0, "window"

    .line 246
    invoke-virtual {p1, v0}, Lcom/daaw/avee/MainActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    .line 248
    invoke-virtual {p1}, Lcom/daaw/avee/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-ne v1, v4, :cond_3

    if-eqz v0, :cond_2

    if-eq v0, v4, :cond_1

    if-eq v0, v3, :cond_1

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    return v4

    :cond_1
    return v2

    :cond_2
    return v4

    .line 261
    :cond_3
    invoke-virtual {p1}, Lcom/daaw/avee/MainActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->orientation:I

    if-ne p1, v3, :cond_6

    if-eqz v0, :cond_5

    if-eq v0, v4, :cond_5

    if-eq v0, v3, :cond_4

    if-eq v0, v2, :cond_4

    goto :goto_0

    :cond_4
    const/4 p1, 0x4

    return p1

    :cond_5
    return v3

    :cond_6
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method lockOrient(Lcom/daaw/avee/MainActivity;I)V
    .locals 7

    .line 205
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, -0x1

    const/16 v6, 0x12

    if-lt v0, v6, :cond_2

    if-eqz p2, :cond_1

    if-eq p2, v4, :cond_0

    if-eq p2, v3, :cond_0

    if-eq p2, v2, :cond_0

    if-eq p2, v1, :cond_0

    .line 218
    invoke-virtual {p1, v5}, Lcom/daaw/avee/MainActivity;->setRequestedOrientation(I)V

    goto :goto_0

    :cond_0
    const/16 p2, 0xe

    .line 215
    invoke-virtual {p1, p2}, Lcom/daaw/avee/MainActivity;->setRequestedOrientation(I)V

    goto :goto_0

    .line 209
    :cond_1
    invoke-virtual {p1, v5}, Lcom/daaw/avee/MainActivity;->setRequestedOrientation(I)V

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_7

    if-eq p2, v4, :cond_6

    if-eq p2, v3, :cond_5

    if-eq p2, v2, :cond_4

    if-eq p2, v1, :cond_3

    .line 239
    invoke-virtual {p1, v5}, Lcom/daaw/avee/MainActivity;->setRequestedOrientation(I)V

    goto :goto_0

    :cond_3
    const/16 p2, 0x8

    .line 236
    invoke-virtual {p1, p2}, Lcom/daaw/avee/MainActivity;->setRequestedOrientation(I)V

    goto :goto_0

    :cond_4
    const/16 p2, 0x9

    .line 233
    invoke-virtual {p1, p2}, Lcom/daaw/avee/MainActivity;->setRequestedOrientation(I)V

    goto :goto_0

    :cond_5
    const/4 p2, 0x0

    .line 230
    invoke-virtual {p1, p2}, Lcom/daaw/avee/MainActivity;->setRequestedOrientation(I)V

    goto :goto_0

    .line 227
    :cond_6
    invoke-virtual {p1, v4}, Lcom/daaw/avee/MainActivity;->setRequestedOrientation(I)V

    goto :goto_0

    .line 224
    :cond_7
    invoke-virtual {p1, v5}, Lcom/daaw/avee/MainActivity;->setRequestedOrientation(I)V

    :goto_0
    return-void
.end method

.method public setOverrideForceLockOrient(Z)V
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 278
    iput v0, p0, Lcom/daaw/avee/Design/MainUIDesign;->overrideForceLockOrient:I

    .line 280
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getInstance()Lcom/daaw/avee/MainActivity;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 283
    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/MainUIDesign;->getLockOrient(Lcom/daaw/avee/MainActivity;)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/Design/MainUIDesign;->overrideForceLockOrient:I

    .line 286
    :cond_0
    iget p1, p0, Lcom/daaw/avee/Design/MainUIDesign;->overrideForceLockOrient:I

    invoke-direct {p0, p1}, Lcom/daaw/avee/Design/MainUIDesign;->updateLockOrient(I)V

    goto :goto_0

    .line 288
    :cond_1
    iput v0, p0, Lcom/daaw/avee/Design/MainUIDesign;->overrideForceLockOrient:I

    .line 290
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_lockOrient:I

    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result p1

    .line 291
    invoke-direct {p0, p1}, Lcom/daaw/avee/Design/MainUIDesign;->updateLockOrient(I)V

    :goto_0
    return-void
.end method
