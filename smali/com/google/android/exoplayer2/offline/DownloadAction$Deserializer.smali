.class public abstract Lcom/google/android/exoplayer2/offline/DownloadAction$Deserializer;
.super Ljava/lang/Object;
.source "DownloadAction.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/offline/DownloadAction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Deserializer"
.end annotation


# instance fields
.field public final type:Ljava/lang/String;

.field public final version:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/google/android/exoplayer2/offline/DownloadAction$Deserializer;->type:Ljava/lang/String;

    .line 39
    iput p2, p0, Lcom/google/android/exoplayer2/offline/DownloadAction$Deserializer;->version:I

    return-void
.end method


# virtual methods
.method public abstract readFromStream(ILjava/io/DataInputStream;)Lcom/google/android/exoplayer2/offline/DownloadAction;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
