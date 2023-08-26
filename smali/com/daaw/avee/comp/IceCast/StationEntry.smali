.class public Lcom/daaw/avee/comp/IceCast/StationEntry;
.super Ljava/lang/Object;
.source "StationEntry.java"


# instance fields
.field public final bitrate:I

.field public final genre:Ljava/lang/String;

.field public final name:Ljava/lang/String;

.field public final url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/daaw/avee/comp/IceCast/StationEntry;->name:Ljava/lang/String;

    .line 15
    iput-object p2, p0, Lcom/daaw/avee/comp/IceCast/StationEntry;->url:Ljava/lang/String;

    .line 16
    iput p3, p0, Lcom/daaw/avee/comp/IceCast/StationEntry;->bitrate:I

    .line 17
    iput-object p4, p0, Lcom/daaw/avee/comp/IceCast/StationEntry;->genre:Ljava/lang/String;

    return-void
.end method
