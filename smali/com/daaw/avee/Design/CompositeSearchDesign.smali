.class public Lcom/daaw/avee/Design/CompositeSearchDesign;
.super Ljava/lang/Object;
.source "CompositeSearchDesign.java"


# static fields
.field private static searchTaskManager:Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;


# instance fields
.field private listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    new-instance v0, Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;

    invoke-direct {v0}, Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;-><init>()V

    sput-object v0, Lcom/daaw/avee/Design/CompositeSearchDesign;->searchTaskManager:Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/CompositeSearchDesign;->listenerRefHolder:Ljava/util/List;

    .line 37
    sget-object v0, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->ICompositeSearch_onCurrentSearchEntryChanged:Lcom/daaw/avee/Common/Events/WeakEvent4;

    new-instance v1, Lcom/daaw/avee/Design/CompositeSearchDesign$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/CompositeSearchDesign$1;-><init>(Lcom/daaw/avee/Design/CompositeSearchDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/CompositeSearchDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent4;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;Ljava/util/List;)V

    .line 66
    sget-object v0, Lcom/daaw/avee/MainActivity;->onUISearchQueryTextChange:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/CompositeSearchDesign$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/CompositeSearchDesign$2;-><init>(Lcom/daaw/avee/Design/CompositeSearchDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/CompositeSearchDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 76
    sget-object v0, Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;->onUISearchQueryTextChangeWithIndex:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance v1, Lcom/daaw/avee/Design/CompositeSearchDesign$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/CompositeSearchDesign$3;-><init>(Lcom/daaw/avee/Design/CompositeSearchDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/CompositeSearchDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;Ljava/util/List;)V

    .line 86
    sget-object v0, Lcom/daaw/avee/MainActivity;->onUISearchQueryStateChange:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/CompositeSearchDesign$4;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/CompositeSearchDesign$4;-><init>(Lcom/daaw/avee/Design/CompositeSearchDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/CompositeSearchDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 96
    sget-object v0, Lcom/daaw/avee/MainActivity;->onSetCurrentSearchIndex:Lcom/daaw/avee/Common/Events/WeakEvent1;

    new-instance v1, Lcom/daaw/avee/Design/CompositeSearchDesign$5;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/CompositeSearchDesign$5;-><init>(Lcom/daaw/avee/Design/CompositeSearchDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/CompositeSearchDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;Ljava/util/List;)V

    .line 125
    sget-object v0, Lcom/daaw/avee/MainActivity;->onRequestCurrentSearchEntry:Lcom/daaw/avee/Common/Events/WeakEventR;

    new-instance v1, Lcom/daaw/avee/Design/CompositeSearchDesign$6;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/CompositeSearchDesign$6;-><init>(Lcom/daaw/avee/Design/CompositeSearchDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/CompositeSearchDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR$Handler;Ljava/util/List;)V

    .line 135
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onRequestSearchQuery:Lcom/daaw/avee/Common/Events/WeakEventR2;

    new-instance v1, Lcom/daaw/avee/Design/CompositeSearchDesign$7;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/CompositeSearchDesign$7;-><init>(Lcom/daaw/avee/Design/CompositeSearchDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/CompositeSearchDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR2$Handler;Ljava/util/List;)V

    .line 151
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onUpdateSearchOptions:Lcom/daaw/avee/Common/Events/WeakEvent4;

    new-instance v1, Lcom/daaw/avee/Design/CompositeSearchDesign$8;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/CompositeSearchDesign$8;-><init>(Lcom/daaw/avee/Design/CompositeSearchDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/CompositeSearchDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent4;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;Ljava/util/List;)V

    .line 161
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onCompareSearchTask:Lcom/daaw/avee/Common/Events/WeakEventR2;

    new-instance v1, Lcom/daaw/avee/Design/CompositeSearchDesign$9;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/CompositeSearchDesign$9;-><init>(Lcom/daaw/avee/Design/CompositeSearchDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/CompositeSearchDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR2$Handler;Ljava/util/List;)V

    .line 168
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/LibraryQueueFragmentBase;->onStartingSearchTask:Lcom/daaw/avee/Common/Events/WeakEvent3;

    new-instance v1, Lcom/daaw/avee/Design/CompositeSearchDesign$10;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/CompositeSearchDesign$10;-><init>(Lcom/daaw/avee/Design/CompositeSearchDesign;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/CompositeSearchDesign;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;Ljava/util/List;)V

    return-void
.end method

.method static synthetic access$000()Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;
    .locals 1

    .line 30
    sget-object v0, Lcom/daaw/avee/Design/CompositeSearchDesign;->searchTaskManager:Lcom/daaw/avee/comp/GlobalSearch/SearchTaskManager;

    return-object v0
.end method
