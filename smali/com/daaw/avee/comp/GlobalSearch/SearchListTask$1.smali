.class Lcom/daaw/avee/comp/GlobalSearch/SearchListTask$1;
.super Ljava/lang/Object;
.source "SearchListTask.java"

# interfaces
.implements Lcom/daaw/avee/comp/GlobalSearch/SearchListTask$IResultReceiverInternal;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/GlobalSearch/SearchListTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/comp/GlobalSearch/SearchListTask$IResultReceiverInternal<",
        "TT1;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/GlobalSearch/SearchListTask;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/GlobalSearch/SearchListTask;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchListTask$1;->this$0:Lcom/daaw/avee/comp/GlobalSearch/SearchListTask;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isCancelled()Z
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchListTask$1;->this$0:Lcom/daaw/avee/comp/GlobalSearch/SearchListTask;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/GlobalSearch/SearchListTask;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public onItemFileFound(Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT1;)V"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchListTask$1;->this$0:Lcom/daaw/avee/comp/GlobalSearch/SearchListTask;

    invoke-static {v0}, Lcom/daaw/avee/comp/GlobalSearch/SearchListTask;->access$008(Lcom/daaw/avee/comp/GlobalSearch/SearchListTask;)I

    .line 36
    iget-object v0, p0, Lcom/daaw/avee/comp/GlobalSearch/SearchListTask$1;->this$0:Lcom/daaw/avee/comp/GlobalSearch/SearchListTask;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/GlobalSearch/SearchListTask;->access$100(Lcom/daaw/avee/comp/GlobalSearch/SearchListTask;[Ljava/lang/Object;)V

    return-void
.end method
