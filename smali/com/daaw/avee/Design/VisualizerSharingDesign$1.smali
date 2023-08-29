.class Lcom/daaw/avee/Design/VisualizerSharingDesign$1;
.super Ljava/lang/Object;
.source "VisualizerSharingDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent2$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerSharingDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent2$Handler<",
        "Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;",
        "Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerSharingDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerSharingDesign;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerSharingDesign$1;->this$0:Lcom/daaw/avee/Design/VisualizerSharingDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;)V
    .locals 16

    move-object/from16 v0, p2

    if-nez v0, :cond_0

    return-void

    .line 95
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->getActivity()Landroid/app/Activity;

    move-result-object v6

    .line 99
    iget v1, v0, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;->id:I

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/daaw/avee/Design/VisualizerDesign;->getPrefThemeCustomizationDataOrTemplateData(I[I)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    .line 104
    :cond_1
    invoke-virtual {v1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->serializePretty()Ljava/lang/String;

    move-result-object v12

    .line 113
    sget-object v1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 125
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "visualizer_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v0, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;->id:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 127
    iget v0, v0, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;->id:I

    invoke-static {v0}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->GetVisualizerFolderFromIdentifier(I)Ljava/io/File;

    move-result-object v0

    const/4 v14, 0x0

    if-eqz v0, :cond_2

    .line 128
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    goto :goto_0

    :cond_2
    new-array v0, v14, [Ljava/io/File;

    .line 129
    :goto_0
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    move-object/from16 v15, p0

    .line 131
    iget-object v7, v15, Lcom/daaw/avee/Design/VisualizerSharingDesign$1;->this$0:Lcom/daaw/avee/Design/VisualizerSharingDesign;

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;->getActivity()Landroid/app/Activity;

    move-result-object v8

    const-string v11, ".viz"

    move-object v9, v1

    invoke-static/range {v7 .. v13}, Lcom/daaw/avee/Design/VisualizerSharingDesign;->access$000(Lcom/daaw/avee/Design/VisualizerSharingDesign;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v7

    .line 136
    invoke-static {v6, v7}, Lcom/daaw/avee/Common/UtilsFileSys;->scanFile(Landroid/content/Context;Ljava/lang/String;)V

    # String extractedFilename = UtilsFileSys.extractFilename(SavePackedFileToPublicDirectory);

    .line 137
    invoke-static {v7}, Lcom/daaw/avee/Common/UtilsFileSys;->extractFilename(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 138
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    # String str3 = "Saved as " + str2(v2) + " in " + str(v1) + "s";

    # const-string v2, "Saved visualizer in "

    const-string v2, "Saved as "
    
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " in "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "s"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const/4 v0, 0x2

    .line 143
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 144
    # invoke-static {v7}, Lcom/daaw/avee/Common/UtilsFileSys;->extractFilename(Ljava/lang/String;)Ljava/lang/String;

    # use the v12 variable instead of calling the method again

    move-object v4, v12

    const-string v5, "text/plain"

    move-object v1, v6

    move-object v2, v8

    .line 141
    invoke-static/range {v0 .. v5}, Lcom/daaw/avee/Design/VisualizerExporterDesign;->showFileSavedNotification(ILandroid/content/Context;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 152
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "text/plain"

    .line 153
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 154
    invoke-static {v6, v14, v0, v14}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    const-string v1, "notification"

    .line 157
    invoke-virtual {v6, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationManager;

    .line 158
    new-instance v2, Landroidx/core/app/NotificationCompat$Builder;

    invoke-direct {v2, v6}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;)V

    .line 159
    # invoke-static {v7}, Lcom/daaw/avee/Common/UtilsFileSys;->extractFilename(Ljava/lang/String;)Ljava/lang/String;

    # use the v12 variable instead of calling the method yet again

    move-object v3, v12

    invoke-virtual {v2, v3}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v3

    .line 160
    invoke-virtual {v3, v8}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v3

    const v4, 0x7f080105

    .line 161
    invoke-virtual {v3, v4}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v3

    .line 162
    invoke-virtual {v3, v0}, Landroidx/core/app/NotificationCompat$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const/4 v3, 0x1

    .line 163
    invoke-virtual {v0, v3}, Landroidx/core/app/NotificationCompat$Builder;->setLocalOnly(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    const/4 v0, 0x2

    .line 171
    invoke-virtual {v2}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 174
    sget-object v0, Lcom/daaw/avee/EventsGlobal/EventsGlobalTextNotifier;->onTextMsg:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {v0, v8}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 88
    check-cast p1, Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;

    check-cast p2, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/avee/Design/VisualizerSharingDesign$1;->invoke(Lcom/daaw/avee/comp/VisualUI/VisualizerChooseDialog;Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;)V

    return-void
.end method
