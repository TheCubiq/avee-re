.class Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$8;
.super Ljava/lang/Object;
.source "ShoutcastDirectory.java"

# interfaces
.implements Lcom/daaw/avee/comp/IceCast/DownloadTask$CreateFileFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->Refresh(Lcom/daaw/avee/Common/Action1;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;

.field final synthetic val$context:Landroid/content/Context;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;Landroid/content/Context;)V
    .locals 0

    .line 416
    iput-object p1, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$8;->this$0:Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;

    iput-object p2, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$8;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public CreateFile()Ljava/io/FileOutputStream;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 421
    new-instance v0, Ljava/io/FileOutputStream;

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$8;->val$context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory$8;->this$0:Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;

    iget-object v3, v3, Lcom/daaw/avee/comp/Shoutcast/ShoutcastDirectory;->tempFilePrefix:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    return-object v0
.end method
