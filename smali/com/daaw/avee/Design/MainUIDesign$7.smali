.class Lcom/daaw/avee/Design/MainUIDesign$7;
.super Ljava/lang/Object;
.source "MainUIDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Ljava/lang/Integer;",
        "Landroid/app/Activity;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/MainUIDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/MainUIDesign;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lcom/daaw/avee/Design/MainUIDesign$7;->this$0:Lcom/daaw/avee/Design/MainUIDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;Landroid/app/Activity;)V
    .locals 1

    .line 124
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p2

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_mainPageIndex:I

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2, v0, p1}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setInt(II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 120
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Landroid/app/Activity;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/MainUIDesign$7;->invoke(Ljava/lang/Integer;Landroid/app/Activity;)V

    return-void
.end method
