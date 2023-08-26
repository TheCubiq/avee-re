.class public Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;
.super Ljava/lang/Object;
.source "MeasureDefs.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/Common/MeasureDefs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MeasureDef"
.end annotation


# instance fields
.field public final argAHint:Ljava/lang/String;

.field public final argBHint:Ljava/lang/String;

.field public isBUsedFor1d:Z

.field public final name:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;->name:Ljava/lang/String;

    .line 18
    iput-object p2, p0, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;->argAHint:Ljava/lang/String;

    .line 19
    iput-object p3, p0, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;->argBHint:Ljava/lang/String;

    const/4 p1, 0x0

    .line 20
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;->isBUsedFor1d:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;->name:Ljava/lang/String;

    .line 26
    iput-object p2, p0, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;->argAHint:Ljava/lang/String;

    .line 27
    iput-object p3, p0, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;->argBHint:Ljava/lang/String;

    .line 28
    iput-boolean p4, p0, Lcom/daaw/avee/comp/Common/MeasureDefs$MeasureDef;->isBUsedFor1d:Z

    return-void
.end method
