.class Lcom/daaw/avee/Design/GeneralDesign$6;
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
        "Landroid/app/Activity;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/GeneralDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/GeneralDesign;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lcom/daaw/avee/Design/GeneralDesign$6;->this$0:Lcom/daaw/avee/Design/GeneralDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/app/Activity;)V
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/daaw/avee/Design/GeneralDesign$6;->this$0:Lcom/daaw/avee/Design/GeneralDesign;

    invoke-static {v0, p1}, Lcom/daaw/avee/Design/GeneralDesign;->access$000(Lcom/daaw/avee/Design/GeneralDesign;Landroid/app/Activity;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)V
    .locals 0

    .line 154
    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Design/GeneralDesign$6;->invoke(Landroid/app/Activity;)V

    return-void
.end method
