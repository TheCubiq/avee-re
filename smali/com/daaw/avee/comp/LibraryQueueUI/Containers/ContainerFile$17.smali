.class final Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$17;
.super Ljava/lang/Object;
.source "ContainerFile.java"

# interfaces
.implements Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$FilterInclude;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile;->makeItems(Landroid/content/Context;ILcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;Ljava/io/File;Z)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$containerId:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

.field final synthetic val$pageIndex:I


# direct methods
.method constructor <init>(ILcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 0

    .line 331
    iput p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$17;->val$pageIndex:I

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$17;->val$containerId:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public shouldInclude(Ljava/io/File;)Z
    .locals 4

    .line 334
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->onRequestFilterFileResult:Lcom/daaw/avee/Common/Events/WeakEventR3;

    iget v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$17;->val$pageIndex:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/ContainerFile$17;->val$containerId:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/daaw/avee/Common/Events/WeakEventR3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method
