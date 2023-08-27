.class Lcom/daaw/avee/Design/GeneralDesign$9$1;
.super Ljava/lang/Object;
.source "GeneralDesign.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/GeneralDesign$9;->invoke(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/daaw/avee/Design/GeneralDesign$9;

.field final synthetic val$context:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/GeneralDesign$9;Landroid/content/Context;)V
    .locals 0

    .line 178
    iput-object p1, p0, Lcom/daaw/avee/Design/GeneralDesign$9$1;->this$1:Lcom/daaw/avee/Design/GeneralDesign$9;

    iput-object p2, p0, Lcom/daaw/avee/Design/GeneralDesign$9$1;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 181
    iget-object v0, p0, Lcom/daaw/avee/Design/GeneralDesign$9$1;->this$1:Lcom/daaw/avee/Design/GeneralDesign$9;

    iget-object v0, v0, Lcom/daaw/avee/Design/GeneralDesign$9;->this$0:Lcom/daaw/avee/Design/GeneralDesign;

    iget-object v1, p0, Lcom/daaw/avee/Design/GeneralDesign$9$1;->val$context:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/daaw/avee/Design/GeneralDesign;->access$100(Lcom/daaw/avee/Design/GeneralDesign;Landroid/content/Context;)V

    return-void
.end method
