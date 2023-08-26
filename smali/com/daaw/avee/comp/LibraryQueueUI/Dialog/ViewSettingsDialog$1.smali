.class Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$1;
.super Ljava/lang/Object;
.source "ViewSettingsDialog.java"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->onCreateDialog(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;

.field final synthetic val$containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$1;->val$containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 112
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$1;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;

    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog$1;->val$containerIdentifier:Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;

    const/4 v0, -0x1

    invoke-static {p1, v0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;->access$000(Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/ViewSettingsDialog;ILcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    return-void
.end method
