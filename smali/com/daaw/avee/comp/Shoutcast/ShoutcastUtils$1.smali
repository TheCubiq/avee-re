.class final Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils$1;
.super Ljava/lang/Object;
.source "ShoutcastUtils.java"

# interfaces
.implements Lcom/daaw/avee/Common/VAsyncTask$TaskListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Shoutcast/ShoutcastUtils;->parseXmlResponse(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/Common/Func/Func2;I)Lcom/daaw/avee/Common/VAsyncTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/VAsyncTask$TaskListener<",
        "TJ;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onExecuteInBg(Lcom/daaw/avee/Common/VAsyncTask;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/VAsyncTask<",
            "TJ;>;)TJ;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method
