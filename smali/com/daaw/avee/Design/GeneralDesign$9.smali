.class Lcom/daaw/avee/Design/GeneralDesign$9;
.super Ljava/lang/Object;
.source "GeneralDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent1$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/GeneralDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent1$Handler<",
        "Landroid/content/Context;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/GeneralDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/GeneralDesign;)V
    .locals 0

    .line 175
    iput-object p1, p0, Lcom/daaw/avee/Design/GeneralDesign$9;->this$0:Lcom/daaw/avee/Design/GeneralDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/content/Context;)V
    .locals 2

    .line 178
    iget-object v0, p0, Lcom/daaw/avee/Design/GeneralDesign$9;->this$0:Lcom/daaw/avee/Design/GeneralDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/GeneralDesign;->access$200(Lcom/daaw/avee/Design/GeneralDesign;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/daaw/avee/Design/GeneralDesign$9$1;

    invoke-direct {v1, p0, p1}, Lcom/daaw/avee/Design/GeneralDesign$9$1;-><init>(Lcom/daaw/avee/Design/GeneralDesign$9;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 175
    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/GeneralDesign$9;->invoke(Landroid/content/Context;)V

    return-void
.end method
