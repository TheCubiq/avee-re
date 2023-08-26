.class Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SortDialog$2;
.super Ljava/lang/Object;
.source "SortDialog.java"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SortDialog;->onCreateDialog(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SortDialog;

.field final synthetic val$containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SortDialog;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SortDialog$2;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SortDialog;

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SortDialog$2;->val$containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 1

    .line 138
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SortDialog$2;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SortDialog;

    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SortDialog$2;->val$containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    const/4 v0, -0x1

    invoke-static {p1, v0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SortDialog;->access$000(Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/SortDialog;ILcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    return-void
.end method
