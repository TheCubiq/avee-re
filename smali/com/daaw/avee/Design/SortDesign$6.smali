.class Lcom/daaw/avee/Design/SortDesign$6;
.super Ljava/lang/Object;
.source "SortDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEventR2$Handler;


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
        "Lcom/daaw/avee/Common/Events/WeakEventR2$Handler<",
        "Ljava/lang/Integer;",
        "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
        "Lcom/daaw/avee/Design/SortDesign$SortDesc;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/SortDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/SortDesign;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lcom/daaw/avee/Design/SortDesign$6;->this$0:Lcom/daaw/avee/Design/SortDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Integer;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)Lcom/daaw/avee/Design/SortDesign$SortDesc;
    .locals 1

    .line 131
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p1

    sget p2, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_SortSelectedRadioOption:I

    invoke-virtual {p1, p2}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result p1

    .line 132
    invoke-static {}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->createOrGetInstance()Lcom/daaw/avee/comp/AppPreferences/AppPreferences;

    move-result-object p2

    sget v0, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->PREF_Int_SortMaskCheckOptions:I

    invoke-virtual {p2, v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->getInt(I)I

    move-result p2

    .line 133
    new-instance v0, Lcom/daaw/avee/Design/SortDesign$SortDesc;

    invoke-direct {v0}, Lcom/daaw/avee/Design/SortDesign$SortDesc;-><init>()V

    .line 134
    iput p1, v0, Lcom/daaw/avee/Design/SortDesign$SortDesc;->sortModeIndex:I

    const/4 p1, 0x1

    and-int/2addr p2, p1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 135
    :goto_0
    iput-boolean p1, v0, Lcom/daaw/avee/Design/SortDesign$SortDesc;->sortDescending:Z

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 128
    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/SortDesign$6;->invoke(Ljava/lang/Integer;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)Lcom/daaw/avee/Design/SortDesign$SortDesc;

    move-result-object p1

    return-object p1
.end method
