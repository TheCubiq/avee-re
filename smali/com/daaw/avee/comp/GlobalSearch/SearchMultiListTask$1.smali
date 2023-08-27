.class Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$1;
.super Ljava/lang/Object;
.source "SearchMultiListTask.java"

# interfaces
.implements Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiverInternal;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$IResultReceiverInternal<",
        "TT1;TT2;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$1;->this$0:Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isCancelled()Z
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$1;->this$0:Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public onItemDirFound(Lcom/daaw/avee/Common/Tuple2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Tuple2<",
            "TT1;TT2;>;)V"
        }
    .end annotation

    return-void
.end method

.method public onItemFileFound(Lcom/daaw/avee/Common/Tuple2;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Tuple2<",
            "TT1;TT2;>;)V"
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$1;->this$0:Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;

    invoke-static {v0}, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->access$008(Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;)I

    .line 34
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask$1;->this$0:Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;->access$100(Lcom/daaw/avee/comp/GlobalSearch/SearchMultiListTask;[Ljava/lang/Object;)V

    return-void
.end method
