.class Lcom/daaw/avee/Design/SortDesign$5;
.super Ljava/lang/Object;
.source "SortDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent4$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/SortDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent4$Handler<",
        "Ljava/lang/Integer;",
        "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/SortDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/SortDesign;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lcom/daaw/avee/Design/SortDesign$5;->this$0:Lcom/daaw/avee/Design/SortDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;Ljava/lang/Integer;Ljava/lang/Integer;)V
    .locals 0

    .line 122
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    sget p2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_SortSelectedRadioOption:I

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p2, p3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setInt(II)V

    .line 123
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    sget p2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_SortMaskCheckOptions:I

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p1, p2, p3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->setInt(II)V

    .line 124
    iget-object p1, p0, Lcom/daaw/avee/Design/SortDesign$5;->this$0:Lcom/daaw/avee/Design/SortDesign;

    invoke-static {p1}, Lcom/daaw/avee/Design/SortDesign;->access$000(Lcom/daaw/avee/Design/SortDesign;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 119
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    check-cast p3, Ljava/lang/Integer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/avee/Design/SortDesign$5;->invoke(Ljava/lang/Integer;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-void
.end method
