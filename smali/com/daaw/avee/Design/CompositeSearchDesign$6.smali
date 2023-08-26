.class Lcom/daaw/avee/Design/CompositeSearchDesign$6;
.super Ljava/lang/Object;
.source "CompositeSearchDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/CompositeSearchDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEventR$Handler<",
        "Lcom/daaw/avee/comp/Common/ISearchEntry;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/CompositeSearchDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/CompositeSearchDesign;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/daaw/avee/Design/CompositeSearchDesign$6;->this$0:Lcom/daaw/avee/Design/CompositeSearchDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Lcom/daaw/avee/comp/Common/ISearchEntry;
    .locals 1

    .line 128
    invoke-static {}, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->getInstance()Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 131
    :cond_0
    invoke-virtual {v0}, Lcom/daaw/avee/comp/GlobalSearch/GlobalSearchCore;->getCurrentSearchEntry()Lcom/daaw/avee/comp/Common/ISearchEntry;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 125
    invoke-virtual {p0}, Lcom/daaw/avee/Design/CompositeSearchDesign$6;->invoke()Lcom/daaw/avee/comp/Common/ISearchEntry;

    move-result-object v0

    return-object v0
.end method
