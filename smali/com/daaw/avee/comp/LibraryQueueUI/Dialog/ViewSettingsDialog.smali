.class public Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;
.super Landroid/widget/PopupWindow;
.source "ViewSettingsDialog.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$ViewOptions;
    }
.end annotation


# static fields
.field private static final arg1:Ljava/lang/String; = "arg1"

.field public static onRequestOptionsState:Lcom/daaw/avee/Common/Events/WeakEventR3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR3<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
            "Ljava/lang/String;",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$ViewOptions;",
            ">;"
        }
    .end annotation
.end field

.field public static onSubmitOptions:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "Ljava/lang/Integer;",
            "Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$ViewOptions;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private chkBoxList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/widget/CheckBox;",
            ">;"
        }
    .end annotation
.end field

.field private radioBtnList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/widget/RadioButton;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 51
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR3;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->onRequestOptionsState:Lcom/daaw/avee/Common/Events/WeakEventR3;

    .line 52
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent3;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->onSubmitOptions:Lcom/daaw/avee/Common/Events/WeakEvent3;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/avee/ContextData;Landroid/view/View;Ljava/lang/String;)V
    .locals 3

    .line 65
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x7f110107

    invoke-direct {p0, p1, v0, v1, v2}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 55
    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->radioBtnList:Ljava/util/List;

    .line 56
    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->chkBoxList:Ljava/util/List;

    .line 68
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->onCreateDialog(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;ILcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 0

    .line 43
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->notifyOptionChange(ILcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    return-void
.end method

.method public static createAndShowDialog(Lcom/daaw/avee/ContextData;Landroid/view/View;Ljava/lang/String;)Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;
    .locals 1

    .line 60
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;-><init>(Lcom/daaw/avee/ContextData;Landroid/view/View;Ljava/lang/String;)V

    return-object v0
.end method

.method private notifyOptionChange(ILcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 3

    .line 194
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->radioBtnList:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->chkBoxList:Ljava/util/List;

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 198
    :goto_0
    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->radioBtnList:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 199
    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->radioBtnList:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/RadioButton;

    .line 201
    invoke-virtual {v2}, Landroid/widget/RadioButton;->isChecked()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 208
    :goto_1
    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$ViewOptions;

    invoke-direct {v2}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$ViewOptions;-><init>()V

    .line 209
    iput v1, v2, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$ViewOptions;->viewMode:I

    .line 210
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->chkBoxList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    iput-boolean v0, v2, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$ViewOptions;->showAlbumArt:Z

    .line 212
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->onSubmitOptions:Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1, p2, v2}, Lcom/daaw/avee/Common/Events/WeakEvent3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3
    :goto_2
    return-void
.end method


# virtual methods
.method public onCreateDialog(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;)V
    .locals 4

    .line 79
    sget-object p1, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->onRequestOptionsState:Lcom/daaw/avee/Common/Events/WeakEventR3;

    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, p3, v1}, Lcom/daaw/avee/Common/Events/WeakEventR3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$ViewOptions;

    .line 85
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    const v0, 0x7f0c00b9

    invoke-static {p3, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p3

    const v0, 0x7f090125

    .line 87
    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    const v0, 0x7f09018c

    .line 88
    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    const v2, 0x7f0901d9

    .line 90
    invoke-virtual {p3, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Space;

    .line 92
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->radioBtnList:Ljava/util/List;

    .line 93
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->chkBoxList:Ljava/util/List;

    .line 95
    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->radioBtnList:Ljava/util/List;

    const v3, 0x7f09018f

    invoke-virtual {p3, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->radioBtnList:Ljava/util/List;

    const v3, 0x7f09018e

    invoke-virtual {p3, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->radioBtnList:Ljava/util/List;

    const v3, 0x7f09018d

    invoke-virtual {p3, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->chkBoxList:Ljava/util/List;

    const v3, 0x7f0900a3

    invoke-virtual {p3, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 101
    iget v2, p1, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$ViewOptions;->viewMode:I

    if-ltz v2, :cond_0

    iget v2, p1, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$ViewOptions;->viewMode:I

    iget-object v3, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->radioBtnList:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 102
    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->radioBtnList:Ljava/util/List;

    iget v3, p1, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$ViewOptions;->viewMode:I

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/RadioButton;

    invoke-virtual {v2}, Landroid/widget/RadioButton;->getId()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/RadioGroup;->check(I)V

    .line 104
    :cond_0
    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->chkBoxList:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    iget-boolean p1, p1, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$ViewOptions;->showAlbumArt:Z

    invoke-virtual {v2, p1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 107
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->chkBoxList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    .line 109
    new-instance v3, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$1;

    invoke-direct {v3, p0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    invoke-virtual {v2, v3}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    goto :goto_0

    .line 155
    :cond_1
    new-instance p1, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$2;

    invoke-direct {p1, p0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$2;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    invoke-virtual {v0, p1}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 176
    invoke-virtual {p0, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->setContentView(Landroid/view/View;)V

    const/4 p1, -0x2

    .line 179
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->setHeight(I)V

    .line 180
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->setWidth(I)V

    const/4 p1, 0x1

    .line 183
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->setOutsideTouchable(Z)V

    .line 184
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->setFocusable(Z)V

    .line 188
    invoke-virtual {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->showAsDropDown(Landroid/view/View;)V

    return-void
.end method
