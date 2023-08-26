.class final Lcom/google/android/exoplayer2/offline/ProgressiveDownloadAction$1;
.super Lcom/google/android/exoplayer2/offline/DownloadAction$Deserializer;
.source "ProgressiveDownloadAction.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/offline/ProgressiveDownloadAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 33
    invoke-direct {p0, p1, p2}, Lcom/google/android/exoplayer2/offline/DownloadAction$Deserializer;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic readFromStream(ILjava/io/DataInputStream;)Lcom/google/android/exoplayer2/offline/DownloadAction;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 33
    invoke-virtual {p0, p1, p2}, Lcom/google/android/exoplayer2/offline/ProgressiveDownloadAction$1;->readFromStream(ILjava/io/DataInputStream;)Lcom/google/android/exoplayer2/offline/ProgressiveDownloadAction;

    move-result-object p1

    return-object p1
.end method

.method public readFromStream(ILjava/io/DataInputStream;)Lcom/google/android/exoplayer2/offline/ProgressiveDownloadAction;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 37
    invoke-virtual {p2}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    .line 38
    invoke-virtual {p2}, Ljava/io/DataInputStream;->readBoolean()Z

    move-result v0

    .line 39
    invoke-virtual {p2}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    .line 40
    new-array v1, v1, [B

    .line 41
    invoke-virtual {p2, v1}, Ljava/io/DataInputStream;->readFully([B)V

    .line 42
    invoke-virtual {p2}, Ljava/io/DataInputStream;->readBoolean()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p2}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 43
    :goto_0
    new-instance v2, Lcom/google/android/exoplayer2/offline/ProgressiveDownloadAction;

    invoke-direct {v2, p1, v0, v1, p2}, Lcom/google/android/exoplayer2/offline/ProgressiveDownloadAction;-><init>(Landroid/net/Uri;Z[BLjava/lang/String;)V

    return-object v2
.end method
