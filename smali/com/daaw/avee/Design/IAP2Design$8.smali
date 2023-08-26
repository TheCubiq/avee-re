.class Lcom/daaw/avee/Design/IAP2Design$8;
.super Ljava/lang/Object;
.source "IAP2Design.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/IAP2Design;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Ljava/lang/Integer;",
        "Lcom/daaw/avee/ContextData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/IAP2Design;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/IAP2Design;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lcom/daaw/avee/Design/IAP2Design$8;->this$0:Lcom/daaw/avee/Design/IAP2Design;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;Lcom/daaw/avee/ContextData;)V
    .locals 1

    .line 169
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/daaw/avee/Design/IAP2Design$8;->this$0:Lcom/daaw/avee/Design/IAP2Design;

    invoke-static {p1, p2}, Lcom/daaw/avee/Design/IAP2Design;->access$200(Lcom/daaw/avee/Design/IAP2Design;Lcom/daaw/avee/ContextData;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 166
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lcom/daaw/avee/ContextData;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/IAP2Design$8;->invoke(Ljava/lang/Integer;Lcom/daaw/avee/ContextData;)V

    return-void
.end method
