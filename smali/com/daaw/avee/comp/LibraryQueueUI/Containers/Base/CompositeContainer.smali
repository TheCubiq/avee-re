.class public Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;
.super Ljava/lang/Object;
.source "CompositeContainer.java"

# interfaces
.implements Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$LibraryContainerDataListenerWrap;,
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;,
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$AdapterFactory;
    }
.end annotation


# instance fields
.field private adapterFactory:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$AdapterFactory;

.field private containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

.field private containerStatusListener:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;

.field private containerStatusListenerWraps:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;

.field private dispIconResId:I

.field private dispString:Lcom/daaw/avee/Common/IVAsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/IVAsyncTask<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private libraryContainerDataListener:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;

.field private libraryContainerDataListenerWrap:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$LibraryContainerDataListenerWrap;

.field private onDraggingListener:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IOnDraggingListener;


# direct methods
.method public constructor <init>([Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;Lcom/daaw/avee/Common/IVAsyncTask;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$AdapterFactory;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;",
            "Lcom/daaw/avee/Common/IVAsyncTask<",
            "Ljava/lang/String;",
            ">;I",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$AdapterFactory;",
            ")V"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerStatusListener:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;

    .line 30
    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->libraryContainerDataListener:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;

    .line 36
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    .line 37
    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->dispString:Lcom/daaw/avee/Common/IVAsyncTask;

    .line 38
    iput p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->dispIconResId:I

    .line 39
    iput-object p4, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->adapterFactory:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$AdapterFactory;

    .line 41
    array-length p2, p1

    new-array p2, p2, [Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerStatusListenerWraps:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;

    const/4 p2, 0x0

    const/4 p3, 0x0

    .line 42
    :goto_0
    iget-object p4, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerStatusListenerWraps:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;

    array-length v0, p4

    if-ge p3, v0, :cond_0

    .line 43
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;)V

    aput-object v0, p4, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 45
    :cond_0
    array-length p1, p1

    new-array p1, p1, [Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$LibraryContainerDataListenerWrap;

    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->libraryContainerDataListenerWrap:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$LibraryContainerDataListenerWrap;

    .line 46
    :goto_1
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->libraryContainerDataListenerWrap:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$LibraryContainerDataListenerWrap;

    array-length p3, p1

    if-ge p2, p3, :cond_1

    .line 47
    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$LibraryContainerDataListenerWrap;

    invoke-direct {p3, p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$LibraryContainerDataListenerWrap;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;I)V

    aput-object p3, p1, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->updateContainerStatusListener()V

    return-void
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->updateContainerStatusListenerInfo()V

    return-void
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;
    .locals 0

    .line 23
    iget-object p0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->libraryContainerDataListener:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;

    return-object p0
.end method

.method static makePrefix(I)Ljava/lang/String;
    .locals 3

    .line 51
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "%05d"

    invoke-static {v0, p0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private updateContainerStatusListener()V
    .locals 10

    .line 55
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerStatusListener:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;

    if-nez v0, :cond_0

    return-void

    .line 62
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerStatusListenerWraps:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v7, v0, v2

    .line 63
    iget v8, v7, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;->itemCount:I

    add-int/2addr v3, v8

    .line 64
    iget v8, v7, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;->totalTime:I

    add-int/2addr v4, v8

    .line 65
    iget-boolean v8, v7, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;->searchingActive:Z

    const/4 v9, 0x1

    if-eqz v8, :cond_1

    const/4 v5, 0x1

    .line 67
    :cond_1
    iget-boolean v7, v7, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;->loadingActive:Z

    if-eqz v7, :cond_2

    const/4 v6, 0x1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 71
    :cond_3
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerStatusListener:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;

    invoke-interface {v0, v3, v4, v5, v6}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;->onItemCountChanged(IIZZ)V

    return-void
.end method

.method private updateContainerStatusListenerInfo()V
    .locals 6

    .line 75
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerStatusListener:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;

    if-nez v0, :cond_0

    return-void

    .line 79
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerStatusListenerWraps:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;

    array-length v1, v0

    const/4 v2, 0x0

    const-string v3, ""

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v4, v0, v2

    .line 80
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v4, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;->info:Ljava/lang/String;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 83
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerStatusListener:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;

    invoke-interface {v0, v3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;->onUpdateStatusInfo(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public RefreshContent()Z
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 229
    :goto_0
    iget-object v3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    array-length v4, v3

    if-ge v2, v4, :cond_1

    .line 230
    aget-object v3, v3, v2

    invoke-interface {v3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->RefreshContent()Z

    move-result v3

    if-nez v3, :cond_0

    const/4 v1, 0x0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public RefreshContent(Z)Z
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 239
    :goto_0
    iget-object v3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    array-length v4, v3

    if-ge v2, v4, :cond_1

    .line 240
    aget-object v3, v3, v2

    invoke-interface {v3, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->RefreshContent(Z)Z

    move-result v3

    if-nez v3, :cond_0

    const/4 v1, 0x0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public containsContainerIdentifier(Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)Z
    .locals 5

    .line 144
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    .line 145
    invoke-interface {v4, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->containsContainerIdentifier(Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public createChildAdapter(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 3

    .line 119
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x5

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    .line 121
    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 122
    invoke-virtual {p2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p2

    const/4 v1, -0x1

    .line 123
    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Utils;->strToIntSafe(Ljava/lang/String;I)I

    move-result v0

    if-ltz v0, :cond_0

    .line 125
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 126
    aget-object v0, v1, v0

    invoke-interface {v0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->createChildAdapter(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p1

    return-object p1

    .line 128
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "invalid prefix value "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    goto :goto_0

    .line 130
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "invalid relativeAddressItem <"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ">"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public createOrGetAdapter(Landroid/content/Context;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 1

    const/4 v0, -0x1

    .line 89
    invoke-virtual {p0, p1, v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->createOrGetAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p1

    return-object p1
.end method

.method public createOrGetAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->adapterFactory:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$AdapterFactory;

    invoke-interface {v0, p1, p2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$AdapterFactory;->createOrGetAdapter(Landroid/content/Context;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    move-result-object p1

    return-object p1
.end method

.method public executeItemActionHeader(Lcom/daaw/avee/ContextData;I)V
    .locals 4

    .line 170
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 171
    invoke-interface {v3, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->executeItemActionHeader(Lcom/daaw/avee/ContextData;I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public getContainerItemHeight()Lcom/daaw/avee/Common/Tuple2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 223
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getContainerItemHeight()Lcom/daaw/avee/Common/Tuple2;

    move-result-object v0

    return-object v0
.end method

.method public getDisplayIconResId()I
    .locals 1

    .line 104
    iget v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->dispIconResId:I

    return v0
.end method

.method public getDisplayName()Lcom/daaw/avee/Common/IVAsyncTask;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/IVAsyncTask<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 99
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->dispString:Lcom/daaw/avee/Common/IVAsyncTask;

    return-object v0
.end method

.method public getItemCount()I
    .locals 5

    .line 201
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    .line 202
    invoke-interface {v4}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getItemCount()I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method

.method public getLibraryAddress()Ljava/lang/String;
    .locals 2

    .line 109
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getLibraryAddress()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getLibraryContainerDataListener()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;
    .locals 2

    .line 151
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    array-length v1, v0

    if-lez v1, :cond_0

    const/4 v1, 0x0

    .line 152
    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getLibraryContainerDataListener()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getOnDraggingListener()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IOnDraggingListener;
    .locals 1

    .line 188
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->onDraggingListener:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IOnDraggingListener;

    return-object v0
.end method

.method public getSearchOptions(Landroid/content/Context;[Ljava/lang/String;[Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 2

    .line 159
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getSearchOptions(Landroid/content/Context;[Ljava/lang/String;[Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    return-void
.end method

.method public getSectionOpened()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getShowAlbumArtValue()Z
    .locals 2

    .line 218
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getShowAlbumArtValue()Z

    move-result v0

    return v0
.end method

.method public makeChildAddress(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 114
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->makeChildAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public onListViewClick(ILandroid/content/Context;)Z
    .locals 0

    .line 138
    invoke-static {}, Ljunit/framework/Assert;->fail()V

    const/4 p1, 0x0

    return p1
.end method

.method public setContainerStatusListener(Ljava/lang/ref/WeakReference;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;",
            ">;)V"
        }
    .end annotation

    .line 181
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;

    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerStatusListener:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;

    const/4 p1, 0x0

    .line 182
    :goto_0
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    .line 183
    aget-object v0, v0, p1

    new-instance v1, Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerStatusListenerWraps:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$ContainerStatusListenerWrap;

    aget-object v2, v2, p1

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->setContainerStatusListener(Ljava/lang/ref/WeakReference;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;",
            ">;)V"
        }
    .end annotation

    .line 193
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;

    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->libraryContainerDataListener:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;

    const/4 p1, 0x0

    .line 194
    :goto_0
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    .line 195
    aget-object v0, v0, p1

    new-instance v1, Ljava/lang/ref/WeakReference;

    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->libraryContainerDataListenerWrap:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$LibraryContainerDataListenerWrap;

    aget-object v2, v2, p1

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setOnDraggingListener(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IOnDraggingListener;)V
    .locals 0

    .line 176
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->onDraggingListener:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IOnDraggingListener;

    return-void
.end method

.method public setSectionOpenedState(Z)V
    .locals 0

    return-void
.end method

.method public updateSearchQuery(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .line 164
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer;->containerData:[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 165
    invoke-interface {v3, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->updateSearchQuery(Landroid/content/Context;Ljava/lang/String;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
