.class Lcom/daaw/avee/Design/VisualizerDesign$46;
.super Ljava/lang/Object;
.source "VisualizerDesign.java"

# interfaces
.implements Lcom/daaw/avee/Common/Events/WeakEvent3$Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/Design/VisualizerDesign;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Events/WeakEvent3$Handler<",
        "Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;",
        "Ljava/lang/Integer;",
        "Landroid/content/Intent;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerDesign;


# direct methods
.method constructor <init>(Lcom/daaw/avee/Design/VisualizerDesign;)V
    .locals 0

    .line 1160
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerDesign$46;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Ljava/lang/Integer;Landroid/content/Intent;)V
    .locals 9

    .line 1165
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x2b

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x2c

    if-ne v0, v1, :cond_5

    .line 1167
    :cond_0
    iget v4, p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->rootIdentifier:I

    if-nez p3, :cond_1

    const-string p1, "Data is null"

    .line 1169
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return-void

    .line 1172
    :cond_1
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p3

    if-nez p3, :cond_2

    const-string p1, "originalUri is null"

    .line 1174
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    return-void

    .line 1182
    :cond_2
    invoke-static {v4}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->GetVisualizerFolderFromIdentifier(I)Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    .line 1185
    :try_start_0
    invoke-virtual {p1}, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-virtual {v2, p3}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 1187
    invoke-virtual {v2}, Ljava/io/FileNotFoundException;->printStackTrace()V

    .line 1189
    :goto_0
    invoke-virtual {p3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p3

    const/16 v2, 0x3a

    invoke-static {p3, v2}, Lcom/daaw/avee/Common/UtilsFileSys;->extractFilenameAdditionalSeperator(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p3

    invoke-static {v0, v1, p3}, Lcom/daaw/avee/comp/AppPreferences/AppPreferences;->SaveFileToLocal(Ljava/io/File;Ljava/io/InputStream;Ljava/lang/String;)Ljava/io/File;

    move-result-object p3

    if-eqz p3, :cond_4

    if-eqz v1, :cond_3

    .line 1192
    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    .line 1194
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 1197
    :cond_3
    :goto_1
    iget-object v2, p0, Lcom/daaw/avee/Design/VisualizerDesign$46;->this$0:Lcom/daaw/avee/Design/VisualizerDesign;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v6, 0x0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "local:"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    move-object v3, p1

    invoke-static/range {v2 .. v8}, Lcom/daaw/avee/Design/VisualizerDesign;->access$2100(Lcom/daaw/avee/Design/VisualizerDesign;Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;IILandroid/net/Uri;Ljava/lang/String;I)V

    goto :goto_2

    :cond_4
    const-string p1, "Copy to local folder failed"

    .line 1200
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1160
    check-cast p1, Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;

    check-cast p2, Ljava/lang/Integer;

    check-cast p3, Landroid/content/Intent;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/Design/VisualizerDesign$46;->invoke(Lcom/daaw/avee/comp/VisualizerCutomization/CustomizeVisDialog;Ljava/lang/Integer;Landroid/content/Intent;)V

    return-void
.end method
