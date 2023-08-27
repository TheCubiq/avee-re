.class public Lcom/daaw/avee/Design/LibraryQueueUIDesign;
.super Ljava/lang/Object;
.source "LibraryQueueUIDesign.java"


# instance fields
.field private containerItemViewHeightDefaultPixels:Lcom/daaw/avee/Common/Tuple2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private containerItemViewHeightPixels:Lcom/daaw/avee/Common/Tuple2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private containerItemViewShowSecondInfo:Z

.field private listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private showRootContainerStreams:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    const/4 v0, 0x1

    .line 72
    iput-boolean v0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->containerItemViewShowSecondInfo:Z

    const/4 v0, 0x0

    .line 73
    iput-object v0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->containerItemViewHeightDefaultPixels:Lcom/daaw/avee/Common/Tuple2;

    .line 74
    iput-object v0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->containerItemViewHeightPixels:Lcom/daaw/avee/Common/Tuple2;

    const/4 v0, 0x0

    .line 76
    iput v0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->showRootContainerStreams:I

    .line 104
    invoke-virtual {p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->getContainerItemViewHeightPixels()Lcom/daaw/avee/Common/Tuple2;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->containerItemViewHeightPixels:Lcom/daaw/avee/Common/Tuple2;

    .line 105
    invoke-virtual {p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->getContainerItemViewHeightDefaultPixels()Lcom/daaw/avee/Common/Tuple2;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->containerItemViewHeightDefaultPixels:Lcom/daaw/avee/Common/Tuple2;

    .line 107
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onPlaylistSongDataAvailableToViewHolder:Lcom/daaw/avee/Common/Events/WeakDelegate3;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$1;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegate3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegate3$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegate3;

    .line 121
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestSectionOpenedState:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$2;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    .line 134
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onSetSectionOpened:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$3;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 147
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestQueueList:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$4;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 159
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestSongContainerIdentifier:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$5;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$5;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 171
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestShuffleMode:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$6;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$6;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 181
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;->onSubmitAddByLink:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$7;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$7;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 195
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onNavigateLibraryAddress:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$8;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$8;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 211
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onAction:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$9;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$9;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 278
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onActionRemoveFolder:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$10;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$10;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 286
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onActionAddToFolders:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$11;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$11;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 293
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onUIRequestFollowCurrentValue:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$12;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$12;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 310
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SongDetailsDialog;->onRequestAlbumArt:Lcom/daaw/avee/Common/Events/WeakEvent4;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$13;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$13;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent4;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;Ljava/util/List;)V

    .line 327
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestAlbumArt:Lcom/daaw/avee/Common/Events/WeakEvent4;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$14;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$14;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent4;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;Ljava/util/List;)V

    .line 334
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestShowAlbumArtValue:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$15;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$15;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 341
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onActionViewDetails:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$16;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$16;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 357
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestContainerItemHeight:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$17;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$17;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    .line 366
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestRootContainerItemsVisible:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$18;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$18;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 373
    sget-object v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->onBoolPreferenceChanged:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$19;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$19;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 390
    sget-object v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->onIntPreferenceChanged:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$20;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$20;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 404
    sget-object v0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->onSubmitValue:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$21;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$21;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 413
    sget-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->onItemSelectionChanged:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$22;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$22;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 420
    sget-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->onContainerItemsDeselected:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$23;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$23;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 427
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onEnqueue:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$24;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$24;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 435
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onMoveQueueItems:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$25;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$25;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 443
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onOpen2:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$26;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$26;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 452
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onOpenOnly:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$27;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$27;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 459
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onOpenOnly2:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$28;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$28;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    .line 466
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onItemInteracted:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$29;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$29;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 480
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRemoveQueueItems:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$30;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$30;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 489
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onQueuePositionChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$31;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$31;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 497
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onSetCurrentQueueItem:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$32;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$32;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 506
    sget-object v0, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->onQueueStateChanged:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$33;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$33;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 516
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestShowTipState:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$34;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$34;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    .line 523
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onActionShowReorderTip:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/LibraryQueueUIDesign$35;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign$35;-><init>(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 531
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->onRequestOptionsState:Lcom/daaw/avee/Common/Events/WeakEventR3;

    sget-object v1, Lcom/daaw/avee/Design/-$$Lambda$LibraryQueueUIDesign$yFRVOX9MtTjXxC9MCTURVmdfO68;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$LibraryQueueUIDesign$yFRVOX9MtTjXxC9MCTURVmdfO68;

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR3$Handler;Ljava/util/List;)V

    .line 540
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->onSubmitOptions:Lcom/daaw/avee/Common/Events/WeakEvent3;

    sget-object v1, Lcom/daaw/avee/Design/-$$Lambda$LibraryQueueUIDesign$xAiqWA-ZpXquJ8rKWje9OPdDC28;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$LibraryQueueUIDesign$xAiqWA-ZpXquJ8rKWje9OPdDC28;

    iget-object v2, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    return-void
.end method

.method private AddPathToFolders(Landroid/content/Context;Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 628
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 629
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefAddLibraryFolderGenerateHash(Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_0

    .line 630
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->updateLibraryItems()V

    return-void
.end method

.method private AddPathToFolders(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 4

    .line 634
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p2, v1

    .line 635
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object v3

    invoke-virtual {v3, v2, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->prefAddLibraryFolderGenerateHash(Ljava/lang/String;Landroid/content/Context;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 636
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->updateLibraryItems()V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)I
    .locals 0

    .line 69
    iget p0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->showRootContainerStreams:I

    return p0
.end method

.method static synthetic access$002(Lcom/daaw/avee/Design/LibraryQueueUIDesign;I)I
    .locals 0

    .line 69
    iput p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->showRootContainerStreams:I

    return p1
.end method

.method static synthetic access$100(Lcom/daaw/avee/Design/LibraryQueueUIDesign;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->toggleShuffle()V

    return-void
.end method

.method static synthetic access$200(Lcom/daaw/avee/Design/LibraryQueueUIDesign;Landroid/content/Context;Ljava/util/Collection;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->AddPathToFolders(Landroid/content/Context;Ljava/util/Collection;)V

    return-void
.end method

.method static synthetic access$300(Lcom/daaw/avee/Design/LibraryQueueUIDesign;Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;Landroid/widget/ImageView;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->getAlbumArt(Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;Landroid/widget/ImageView;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    return-void
.end method

.method static synthetic access$400(Lcom/daaw/avee/Design/LibraryQueueUIDesign;Ljava/lang/Integer;)Lcom/daaw/avee/Common/Tuple2;
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->updateContainerItemViewHeight(Ljava/lang/Integer;)Lcom/daaw/avee/Common/Tuple2;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$502(Lcom/daaw/avee/Design/LibraryQueueUIDesign;Lcom/daaw/avee/Common/Tuple2;)Lcom/daaw/avee/Common/Tuple2;
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->containerItemViewHeightPixels:Lcom/daaw/avee/Common/Tuple2;

    return-object p1
.end method

.method static synthetic access$600(Lcom/daaw/avee/Design/LibraryQueueUIDesign;Landroid/content/Context;[Ljava/lang/String;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->AddPathToFolders(Landroid/content/Context;[Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$700(Lcom/daaw/avee/Design/LibraryQueueUIDesign;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->updateContainerItems(Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    return-void
.end method

.method static synthetic access$800(Lcom/daaw/avee/Design/LibraryQueueUIDesign;Ljava/util/List;Ljava/lang/Integer;Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V
    .locals 0

    .line 69
    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->openAsTransient(Ljava/util/List;Ljava/lang/Integer;Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V

    return-void
.end method

.method private getAlbumArt(Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;Landroid/widget/ImageView;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 9

    .line 614
    invoke-static {}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtFactory;->getInstance()Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 616
    iget-object v1, p1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->videoThumbDataSource:Landroid/net/Uri;

    iget-object v2, p1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->path0:Ljava/lang/String;

    iget-object v3, p1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->path1:Ljava/lang/String;

    iget-object v4, p1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->genStr:Ljava/lang/String;

    .line 621
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    .line 622
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    const/4 v8, 0x0

    move-object v5, p2

    .line 616
    invoke-interface/range {v0 .. v8}, Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;->loadAlbumArt(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;ZZZ)V

    :cond_0
    return-void
.end method

.method static synthetic lambda$new$0(Ljava/lang/Integer;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$ViewOptions;
    .locals 0

    .line 533
    new-instance p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$ViewOptions;

    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$ViewOptions;-><init>()V

    .line 534
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    sget p2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_containerItemViewMode:I

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$ViewOptions;->viewMode:I

    .line 535
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    sget p2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_showAlbumArtInstead:I

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getBool(I)Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$ViewOptions;->showAlbumArt:Z

    return-object p0
.end method

.method static synthetic lambda$new$1(Ljava/lang/Integer;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$ViewOptions;)V
    .locals 1

    .line 542
    iget p0, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$ViewOptions;->viewMode:I

    .line 544
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_containerItemViewMode:I

    invoke-virtual {p1, v0, p0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setInt(II)V

    .line 545
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p0

    sget p1, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Bool_showAlbumArtInstead:I

    iget-boolean p2, p2, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$ViewOptions;->showAlbumArt:Z

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setBool(IZ)V

    return-void
.end method

.method private openAsTransient(Ljava/util/List;Ljava/lang/Integer;Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/playback/Song/PlaylistSong;",
            ">;",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;",
            ")V"
        }
    .end annotation

    if-nez p1, :cond_1

    .line 552
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 554
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p2, 0x7f100097

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 555
    sget-object p2, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {p2, p1}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    :cond_0
    return-void

    .line 560
    :cond_1
    invoke-static {}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->createOrGetInstance()Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 p3, -0x1

    .line 562
    invoke-virtual {v0, p3}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->removeQueueItems(I)V

    .line 563
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x0

    move-object v1, p1

    invoke-virtual/range {v0 .. v7}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->open(Ljava/util/Collection;IILcom/daaw/avee/comp/PlaybackQueue/IPlaylistSongContainerIdentifier;Ljava/lang/Object;IZ)V

    :cond_2
    return-void
.end method

.method private toggleShuffle()V
    .locals 4

    .line 642
    invoke-static {}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->createOrGetInstance()Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 644
    invoke-virtual {v0}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->getShuffleMode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x1

    if-nez v2, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    if-ne v2, v3, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    if-eqz v0, :cond_3

    .line 654
    invoke-virtual {v0, v1, v3}, Lcom/daaw/avee/comp/PlaybackQueue/QueueCore;->setShuffleMode(IZ)V

    :cond_3
    return-void
.end method

.method private updateContainerItemViewHeight(Ljava/lang/Integer;)Lcom/daaw/avee/Common/Tuple2;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 682
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x1

    const/16 v1, 0x38

    if-eqz p1, :cond_2

    if-eq p1, v0, :cond_0

    const/4 v2, 0x2

    if-eq p1, v2, :cond_1

    :cond_0
    const/16 p1, 0x38

    goto :goto_0

    :cond_1
    const/16 p1, 0x70

    goto :goto_0

    :cond_2
    const/16 p1, 0x1c

    .line 694
    :goto_0
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v2

    if-nez v2, :cond_3

    const/4 p1, 0x0

    return-object p1

    :cond_3
    int-to-float v3, p1

    .line 697
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-static {v0, v3, v2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    float-to-int v2, v2

    .line 698
    new-instance v3, Lcom/daaw/avee/Common/Tuple2;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    if-lt p1, v1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v3, v2, p1}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v3
.end method

.method private updateContainerItems(Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 1

    .line 659
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getFragment0Instance()Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 661
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->refreshAdapter(Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    .line 663
    :cond_0
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getFragment1Instance()Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 664
    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->refreshTrackList(Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    :cond_1
    return-void
.end method


# virtual methods
.method getContainerItemViewHeightDefaultPixels()Lcom/daaw/avee/Common/Tuple2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 81
    iget-object v0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->containerItemViewHeightDefaultPixels:Lcom/daaw/avee/Common/Tuple2;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    .line 82
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->updateContainerItemViewHeight(Ljava/lang/Integer;)Lcom/daaw/avee/Common/Tuple2;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->containerItemViewHeightDefaultPixels:Lcom/daaw/avee/Common/Tuple2;

    .line 84
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->containerItemViewHeightDefaultPixels:Lcom/daaw/avee/Common/Tuple2;

    if-nez v0, :cond_1

    .line 85
    new-instance v0, Lcom/daaw/avee/Common/Tuple2;

    const/16 v1, 0x38

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->containerItemViewHeightDefaultPixels:Lcom/daaw/avee/Common/Tuple2;

    .line 87
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->containerItemViewHeightDefaultPixels:Lcom/daaw/avee/Common/Tuple2;

    return-object v0
.end method

.method getContainerItemViewHeightPixels()Lcom/daaw/avee/Common/Tuple2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 92
    iget-object v0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->containerItemViewHeightPixels:Lcom/daaw/avee/Common/Tuple2;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    .line 93
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->updateContainerItemViewHeight(Ljava/lang/Integer;)Lcom/daaw/avee/Common/Tuple2;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->containerItemViewHeightPixels:Lcom/daaw/avee/Common/Tuple2;

    .line 95
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->containerItemViewHeightPixels:Lcom/daaw/avee/Common/Tuple2;

    if-nez v0, :cond_1

    .line 96
    new-instance v0, Lcom/daaw/avee/Common/Tuple2;

    const/16 v1, 0x38

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->containerItemViewHeightPixels:Lcom/daaw/avee/Common/Tuple2;

    .line 98
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->containerItemViewHeightPixels:Lcom/daaw/avee/Common/Tuple2;

    return-object v0
.end method

.method updateHolderFromData(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;Z)V
    .locals 6

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-eqz p3, :cond_0

    .line 571
    iget-object p3, p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    invoke-virtual {p3, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 p3, -0x1

    .line 572
    invoke-virtual {p1, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImgColorFilter(I)V

    .line 574
    invoke-virtual {p2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getAlbumArtPath0Str()Ljava/lang/String;

    move-result-object p3

    .line 575
    invoke-virtual {p2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getAlbumArtPath1Str()Ljava/lang/String;

    move-result-object v2

    .line 577
    new-instance v3, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    iget-object v4, p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->dataSource:Landroid/net/Uri;

    .line 578
    invoke-virtual {p2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->getAlbumArtGenerateStr()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, p3, v2, v5}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p3, p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    const/4 v2, 0x1

    .line 580
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .line 581
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    .line 577
    invoke-direct {p0, v3, p3, v2, v4}, Lcom/daaw/avee/Design/LibraryQueueUIDesign;->getAlbumArt(Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;Landroid/widget/ImageView;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    goto :goto_0

    .line 586
    :cond_0
    iget-object p3, p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 p3, 0x0

    .line 587
    invoke-virtual {p1, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 590
    :goto_0
    invoke-virtual {p2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->isArtistKnownOrSecondName()Z

    move-result p3

    if-eqz p3, :cond_2

    .line 591
    iget-object p3, p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    iget-object v0, p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 593
    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setTxtItemLine2Visibility(I)V

    .line 595
    invoke-virtual {p2}, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->isAlbumKnown()Z

    move-result p3

    if-eqz p3, :cond_1

    .line 596
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "   |   "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->albumName:Ljava/lang/String;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setTxtItemLine2Text(Ljava/lang/String;)V

    goto :goto_1

    .line 598
    :cond_1
    iget-object p3, p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->artistName:Ljava/lang/String;

    invoke-virtual {p1, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setTxtItemLine2Text(Ljava/lang/String;)V

    goto :goto_1

    .line 601
    :cond_2
    iget-object p3, p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    iget-object v1, p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->trackName:Ljava/lang/String;

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 603
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setTxtItemLine2Visibility(I)V

    .line 606
    :goto_1
    iget-boolean p3, p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->isStream:Z

    if-nez p3, :cond_3

    .line 607
    iget-object p1, p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemDuration:Landroid/widget/TextView;

    iget p2, p2, Lcom/daaw/avee/comp/playback/Song/PlaylistSong$Data;->duration:I

    div-int/lit16 p2, p2, 0x3e8

    invoke-static {p2}, Lcom/daaw/avee/Common/Utils;->getDurationStringHMSS(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 609
    :cond_3
    iget-object p1, p1, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemDuration:Landroid/widget/TextView;

    const-string p2, ""

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_2
    return-void
.end method

.method public updateLibraryItems()V
    .locals 1

    .line 668
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getFragment0Instance()Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 669
    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->updateLibraryItems()V

    :cond_0
    return-void
.end method

.method public updateQueueItems()V
    .locals 1

    .line 673
    invoke-static {}, Lcom/daaw/avee/MainActivity;->getFragment1Instance()Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 674
    invoke-virtual {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->updateQueueItems()V

    :cond_0
    return-void
.end method
