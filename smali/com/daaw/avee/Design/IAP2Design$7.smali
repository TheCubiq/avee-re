.class Lcom/daaw/avee/Design/IAP2Design$7;
.super Ljava/lang/Object;
.source "IAP2Design.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Lcom/daaw/avee/ContextData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/IAP2Design;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/IAP2Design;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lcom/daaw/avee/Design/IAP2Design$7;->this$0:Lcom/daaw/avee/Design/IAP2Design;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/ContextData;)V
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/daaw/avee/Design/IAP2Design$7;->this$0:Lcom/daaw/avee/Design/IAP2Design;

    invoke-static {v0, p1}, Lcom/daaw/avee/Design/IAP2Design;->access$500(Lcom/daaw/avee/Design/IAP2Design;Lcom/daaw/avee/ContextData;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 159
    check-cast p1, Lcom/daaw/avee/ContextData;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/IAP2Design$7;->invoke(Lcom/daaw/avee/ContextData;)V

    return-void
.end method
