.class Lcom/daaw/avee/comp/IceCast/ContentAccessor$2;
.super Ljava/lang/Object;
.source "ContentAccessorOld.java"

# interfaces
.implements Lcom/daaw/avee/Common/Action1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/IceCast/ContentAccessor;->onInvoke(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Action1<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/IceCast/ContentAccessor;

.field final synthetic val$container:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/IceCast/ContentAccessor;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/daaw/avee/comp/IceCast/ContentAccessor$2;->this$0:Lcom/daaw/avee/comp/IceCast/ContentAccessor;

    iput-object p2, p0, Lcom/daaw/avee/comp/IceCast/ContentAccessor$2;->val$container:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onInvoke(Ljava/lang/Object;)V
    .locals 0

    .line 64
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/IceCast/ContentAccessor$2;->onInvoke(Ljava/lang/String;)V

    return-void
.end method

.method public onInvoke(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 68
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    .line 69
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/IceCast/ContentAccessor$2;->val$container:Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;

    invoke-virtual {v0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/ContainerBase;->updateStatusInfo(Ljava/lang/String;)V

    .line 70
    iget-object p1, p0, Lcom/daaw/avee/comp/IceCast/ContentAccessor$2;->this$0:Lcom/daaw/avee/comp/IceCast/ContentAccessor;

    invoke-static {p1}, Lcom/daaw/avee/comp/IceCast/ContentAccessor;->access$000(Lcom/daaw/avee/comp/IceCast/ContentAccessor;)V

    return-void
.end method
