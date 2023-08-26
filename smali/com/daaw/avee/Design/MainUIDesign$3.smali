.class Lcom/daaw/avee/Design/MainUIDesign$3;
.super Ljava/lang/Object;
.source "MainUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/MainUIDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent3$Handler<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/MainUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/MainUIDesign;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/daaw/avee/Design/MainUIDesign$3;->this$0:Lcom/daaw/avee/Design/MainUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V
    .locals 0

    .line 83
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sget p3, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_lockOrient:I

    if-ne p1, p3, :cond_0

    .line 84
    iget-object p1, p0, Lcom/daaw/avee/Design/MainUIDesign$3;->this$0:Lcom/daaw/avee/Design/MainUIDesign;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lcom/daaw/avee/Design/MainUIDesign;->access$100(Lcom/daaw/avee/Design/MainUIDesign;I)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 80
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/MainUIDesign$3;->invoke(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V

    return-void
.end method
