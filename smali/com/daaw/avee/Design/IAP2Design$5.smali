.class Lcom/daaw/avee/Design/IAP2Design$5;
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
        "Landroid/app/Activity;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/IAP2Design;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/IAP2Design;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lcom/daaw/avee/Design/IAP2Design$5;->this$0:Lcom/daaw/avee/Design/IAP2Design;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/app/Activity;)V
    .locals 2

    .line 147
    iget-object v0, p0, Lcom/daaw/avee/Design/IAP2Design$5;->this$0:Lcom/daaw/avee/Design/IAP2Design;

    invoke-static {v0, p1}, Lcom/daaw/avee/Design/IAP2Design;->access$100(Lcom/daaw/avee/Design/IAP2Design;Landroid/app/Activity;)V

    .line 148
    iget-object v0, p0, Lcom/daaw/avee/Design/IAP2Design$5;->this$0:Lcom/daaw/avee/Design/IAP2Design;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/daaw/avee/Design/IAP2Design;->access$300(Lcom/daaw/avee/Design/IAP2Design;Landroid/app/Activity;Z)Z

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 144
    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/IAP2Design$5;->invoke(Landroid/app/Activity;)V

    return-void
.end method
