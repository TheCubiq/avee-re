.class public interface abstract Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;
.super Ljava/lang/Object;
.source "IContainerData.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IOnDraggingListener;,
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;,
        Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;
    }
.end annotation


# virtual methods
.method public abstract RefreshContent()Z
.end method

.method public abstract RefreshContent(Z)Z
.end method

.method public abstract containsContainerIdentifier(Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)Z
.end method

.method public abstract createChildAdapter(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
.end method

.method public abstract createOrGetAdapter(Landroid/content/Context;)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
.end method

.method public abstract createOrGetAdapter(Landroid/content/Context;I)Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Adapter/ViewAdapter;
.end method

.method public abstract executeItemActionHeader(Lcom/daaw/avee/ContextData;I)V
.end method

.method public abstract getContainerItemHeight()Lcom/daaw/avee/Common/Tuple2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getDisplayIconResId()I
.end method

.method public abstract getDisplayName()Lcom/daaw/avee/Common/IVAsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/avee/Common/IVAsyncTask<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getItemCount()I
.end method

.method public abstract getLibraryAddress()Ljava/lang/String;
.end method

.method public abstract getLibraryContainerDataListener()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;
.end method

.method public abstract getOnDraggingListener()Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IOnDraggingListener;
.end method

.method public abstract getSearchOptions(Landroid/content/Context;[Ljava/lang/String;[Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
.end method

.method public abstract getSectionOpened()Z
.end method

.method public abstract getShowAlbumArtValue()Z
.end method

.method public abstract makeChildAddress(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract onListViewClick(ILandroid/content/Context;)Z
.end method

.method public abstract setContainerStatusListener(Ljava/lang/ref/WeakReference;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IContainerStatusListener;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setLibraryContainerDataListener(Ljava/lang/ref/WeakReference;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$ILibraryContainerDataListener;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setOnDraggingListener(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData$IOnDraggingListener;)V
.end method

.method public abstract setSectionOpenedState(Z)V
.end method

.method public abstract updateSearchQuery(Landroid/content/Context;Ljava/lang/String;)V
.end method
