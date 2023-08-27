.class Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal$1;
.super Ljava/lang/Object;
.source "ContainerRootLocal.java"

# interfaces
.implements Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/CompositeContainer$AdapterFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;->createChildAdapter(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;

.field final synthetic val$containerData0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;

.field final synthetic val$containerData1:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;)V
    .locals 0

    .line 127
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal;

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal$1;->val$containerData0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;

    iput-object p3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal$1;->val$containerData1:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createOrGetAdapter(Landroid/content/Context;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
    .locals 6

    .line 130
    new-instance p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;

    const/4 p2, 0x2

    new-array v0, p2, [Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$SectionDesc;

    new-instance v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$SectionDesc;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$SectionDesc;-><init>(I)V

    const/4 v3, 0x0

    aput-object v1, v0, v3

    new-instance v1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$SectionDesc;

    invoke-direct {v1, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$SectionDesc;-><init>(I)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-array v1, p2, [Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;

    iget-object v4, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal$1;->val$containerData0:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylist;

    aput-object v4, v1, v3

    iget-object v5, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerRootLocal$1;->val$containerData1:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerPlaylistFiles;

    aput-object v5, v1, v2

    new-array p2, p2, [Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;

    aput-object v4, p2, v3

    aput-object v5, p2, v2

    invoke-direct {p1, v0, v1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData;-><init>([Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/CompositeAdapterData$SectionDesc;[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;[Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    .line 138
    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;

    const/4 v0, 0x6

    invoke-direct {p2, p1, p3, v0, v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/HeaderFooterAdapterData;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;II)V

    .line 139
    new-instance p1, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;

    invoke-direct {p1, p2, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter$IAdapterDataProvider;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    return-object p1
.end method
