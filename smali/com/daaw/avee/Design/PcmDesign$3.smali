.class Lcom/daaw/avee/Design/PcmDesign$3;
.super Ljava/lang/Object;
.source "PcmDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/PcmDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent3$Handler<",
        "Ljava/lang/Boolean;",
        "Ljava/lang/Long;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/PcmDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/PcmDesign;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/daaw/avee/Design/PcmDesign$3;->this$0:Lcom/daaw/avee/Design/PcmDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;)V
    .locals 4

    .line 69
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 71
    iget-object p1, p0, Lcom/daaw/avee/Design/PcmDesign$3;->this$0:Lcom/daaw/avee/Design/PcmDesign;

    new-instance p3, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;

    const-wide/16 v0, 0x3e8

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    mul-long v2, v2, v0

    const-string p2, "tempexport"

    invoke-direct {p3, p2, v2, v3}, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;-><init>(Ljava/lang/String;J)V

    invoke-static {p1, p3}, Lcom/daaw/avee/Design/PcmDesign;->access$202(Lcom/daaw/avee/Design/PcmDesign;Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;)Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;

    goto :goto_0

    .line 74
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/Design/PcmDesign$3;->this$0:Lcom/daaw/avee/Design/PcmDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/PcmDesign;->access$200(Lcom/daaw/avee/Design/PcmDesign;)Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/avee/Design/PcmDesign$3;->this$0:Lcom/daaw/avee/Design/PcmDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/PcmDesign;->access$200(Lcom/daaw/avee/Design/PcmDesign;)Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;->dispose()V

    .line 75
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/Design/PcmDesign$3;->this$0:Lcom/daaw/avee/Design/PcmDesign;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/daaw/avee/Design/PcmDesign;->access$202(Lcom/daaw/avee/Design/PcmDesign;Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;)Lcom/daaw/avee/comp/PcmProcess/PcmBuffer;

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 66
    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Ljava/lang/Long;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/PcmDesign$3;->invoke(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;)V

    return-void
.end method
