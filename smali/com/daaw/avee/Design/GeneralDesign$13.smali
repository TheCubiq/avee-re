.class Lcom/daaw/avee/Design/GeneralDesign$13;
.super Ljava/lang/Object;
.source "GeneralDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent3$Handler<",
        "Landroid/view/View;",
        "Landroid/view/View;",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/GeneralDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/GeneralDesign;)V
    .locals 0

    .line 236
    iput-object p1, p0, Lcom/daaw/avee/Design/GeneralDesign$13;->this$0:Lcom/daaw/avee/Design/GeneralDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .line 240
    new-instance p3, Ljava/util/Date;

    invoke-direct {p3}, Ljava/util/Date;-><init>()V

    .line 242
    iget-object v0, p0, Lcom/daaw/avee/Design/GeneralDesign$13;->this$0:Lcom/daaw/avee/Design/GeneralDesign;

    iget-object v0, v0, Lcom/daaw/avee/Design/GeneralDesign;->snowDate:Ljava/util/Date;

    invoke-virtual {p3, v0}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/avee/Design/GeneralDesign$13;->this$0:Lcom/daaw/avee/Design/GeneralDesign;

    iget-object v0, v0, Lcom/daaw/avee/Design/GeneralDesign;->snowEndDate:Ljava/util/Date;

    invoke-virtual {p3, v0}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_1

    const p3, 0x7f080157

    if-eqz p1, :cond_0

    .line 243
    invoke-virtual {p1, p3}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_0
    if-eqz p2, :cond_3

    .line 244
    invoke-virtual {p2, p3}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0

    .line 245
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/Design/GeneralDesign$13;->this$0:Lcom/daaw/avee/Design/GeneralDesign;

    iget-object v0, v0, Lcom/daaw/avee/Design/GeneralDesign;->newYearDate:Ljava/util/Date;

    invoke-virtual {p3, v0}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/avee/Design/GeneralDesign$13;->this$0:Lcom/daaw/avee/Design/GeneralDesign;

    iget-object v0, v0, Lcom/daaw/avee/Design/GeneralDesign;->newYearEndDate:Ljava/util/Date;

    invoke-virtual {p3, v0}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result p3

    if-eqz p3, :cond_3

    const p3, 0x7f080131

    if-eqz p1, :cond_2

    .line 246
    invoke-virtual {p1, p3}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_2
    if-eqz p2, :cond_3

    .line 247
    invoke-virtual {p2, p3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 250
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/daaw/avee/Design/GeneralDesign$13;->this$0:Lcom/daaw/avee/Design/GeneralDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/GeneralDesign;->access$400(Lcom/daaw/avee/Design/GeneralDesign;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 236
    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/view/View;

    check-cast p3, Landroid/view/View;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/GeneralDesign$13;->invoke(Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    return-void
.end method
