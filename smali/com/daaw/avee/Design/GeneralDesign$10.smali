.class Lcom/daaw/avee/Design/GeneralDesign$10;
.super Ljava/lang/Object;
.source "GeneralDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEventR$Handler<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/GeneralDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/GeneralDesign;)V
    .locals 0

    .line 187
    iput-object p1, p0, Lcom/daaw/avee/Design/GeneralDesign$10;->this$0:Lcom/daaw/avee/Design/GeneralDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Boolean;
    .locals 2

    .line 190
    iget-object v0, p0, Lcom/daaw/avee/Design/GeneralDesign$10;->this$0:Lcom/daaw/avee/Design/GeneralDesign;

    invoke-static {v0}, Lcom/daaw/avee/Design/GeneralDesign;->access$300(Lcom/daaw/avee/Design/GeneralDesign;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 191
    iget-object v0, p0, Lcom/daaw/avee/Design/GeneralDesign$10;->this$0:Lcom/daaw/avee/Design/GeneralDesign;

    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/avee/Design/GeneralDesign;->access$100(Lcom/daaw/avee/Design/GeneralDesign;Landroid/content/Context;)V

    .line 193
    :cond_0
    sget-boolean v0, Lcom/daaw/avee/Design/GeneralDesign;->shouldLoadInitalSongs:Z

    const/4 v1, 0x0

    .line 194
    sput-boolean v1, Lcom/daaw/avee/Design/GeneralDesign;->shouldLoadInitalSongs:Z

    .line 195
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 187
    invoke-virtual {p0}, Lcom/daaw/avee/Design/GeneralDesign$10;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
