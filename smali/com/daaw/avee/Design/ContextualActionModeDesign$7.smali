.class Lcom/daaw/avee/Design/ContextualActionModeDesign$7;
.super Ljava/lang/Object;
.source "ContextualActionModeDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/ContextualActionModeDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Lcom/daaw/avee/ContextData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/ContextualActionModeDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/ContextualActionModeDesign;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/daaw/avee/Design/ContextualActionModeDesign$7;->this$0:Lcom/daaw/avee/Design/ContextualActionModeDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/ContextData;)V
    .locals 0

    .line 105
    invoke-static {}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->getInstance()Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 107
    invoke-virtual {p1}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->onActivityDestroyed()V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 102
    check-cast p1, Lcom/daaw/avee/ContextData;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/ContextualActionModeDesign$7;->invoke(Lcom/daaw/avee/ContextData;)V

    return-void
.end method
