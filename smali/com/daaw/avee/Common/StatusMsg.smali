.class public Lcom/daaw/avee/Common/StatusMsg;
.super Ljava/lang/Object;
.source "StatusMsg.java"


# instance fields
.field countedMessages:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private criticalErrorCount:I

.field private errorCount:I

.field private fullMessage:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 22
    iput v0, p0, Lcom/daaw/avee/Common/StatusMsg;->errorCount:I

    .line 23
    iput v0, p0, Lcom/daaw/avee/Common/StatusMsg;->criticalErrorCount:I

    const-string v0, ""

    .line 24
    iput-object v0, p0, Lcom/daaw/avee/Common/StatusMsg;->fullMessage:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/avee/Common/StatusMsg;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iget v0, p1, Lcom/daaw/avee/Common/StatusMsg;->errorCount:I

    iput v0, p0, Lcom/daaw/avee/Common/StatusMsg;->errorCount:I

    .line 30
    iget v0, p1, Lcom/daaw/avee/Common/StatusMsg;->criticalErrorCount:I

    iput v0, p0, Lcom/daaw/avee/Common/StatusMsg;->criticalErrorCount:I

    .line 31
    iget-object v0, p1, Lcom/daaw/avee/Common/StatusMsg;->fullMessage:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/avee/Common/StatusMsg;->fullMessage:Ljava/lang/String;

    .line 32
    iget-object v0, p1, Lcom/daaw/avee/Common/StatusMsg;->countedMessages:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    .line 33
    new-instance v0, Ljava/util/HashMap;

    iget-object p1, p1, Lcom/daaw/avee/Common/StatusMsg;->countedMessages:Ljava/util/HashMap;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/daaw/avee/Common/StatusMsg;->countedMessages:Ljava/util/HashMap;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 35
    iput-object p1, p0, Lcom/daaw/avee/Common/StatusMsg;->countedMessages:Ljava/util/HashMap;

    :goto_0
    return-void
.end method


# virtual methods
.method public addCriticalError(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "unk"

    .line 47
    :goto_0
    iget v0, p0, Lcom/daaw/avee/Common/StatusMsg;->criticalErrorCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/avee/Common/StatusMsg;->criticalErrorCount:I

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/daaw/avee/Common/StatusMsg;->fullMessage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/Common/StatusMsg;->fullMessage:Ljava/lang/String;

    .line 50
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/daaw/avee/Common/StatusMsg;->fullMessage:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/Common/StatusMsg;->fullMessage:Ljava/lang/String;

    return-void
.end method

.method public addCriticalErrorException(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/avee/Common/StatusMsg;->addCriticalError(Ljava/lang/String;)V

    return-void
.end method

.method public addErrorMessage(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "unk"

    .line 67
    :goto_0
    iget v0, p0, Lcom/daaw/avee/Common/StatusMsg;->errorCount:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/avee/Common/StatusMsg;->errorCount:I

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/daaw/avee/Common/StatusMsg;->fullMessage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/Common/StatusMsg;->fullMessage:Ljava/lang/String;

    .line 70
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/daaw/avee/Common/StatusMsg;->fullMessage:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/Common/StatusMsg;->fullMessage:Ljava/lang/String;

    return-void
.end method

.method public addErrorMessageCollapsed(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "unk"

    .line 76
    :goto_0
    iget v0, p0, Lcom/daaw/avee/Common/StatusMsg;->errorCount:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/daaw/avee/Common/StatusMsg;->errorCount:I

    .line 78
    iget-object v0, p0, Lcom/daaw/avee/Common/StatusMsg;->countedMessages:Ljava/util/HashMap;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Common/StatusMsg;->countedMessages:Ljava/util/HashMap;

    .line 80
    :cond_1
    iget-object v0, p0, Lcom/daaw/avee/Common/StatusMsg;->countedMessages:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_2

    .line 82
    iget-object v0, p0, Lcom/daaw/avee/Common/StatusMsg;->countedMessages:Ljava/util/HashMap;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 84
    :cond_2
    iget-object v2, p0, Lcom/daaw/avee/Common/StatusMsg;->countedMessages:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    return-void
.end method

.method public getFullMessage()Ljava/lang/String;
    .locals 4

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 97
    iget-object v1, p0, Lcom/daaw/avee/Common/StatusMsg;->fullMessage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    iget-object v1, p0, Lcom/daaw/avee/Common/StatusMsg;->countedMessages:Ljava/util/HashMap;

    if-eqz v1, :cond_0

    .line 102
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 103
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 104
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 106
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " ("

    .line 107
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    .line 109
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n"

    .line 110
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 114
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hasCriticalError()Z
    .locals 1

    .line 91
    iget v0, p0, Lcom/daaw/avee/Common/StatusMsg;->criticalErrorCount:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x0

    .line 54
    iput v0, p0, Lcom/daaw/avee/Common/StatusMsg;->errorCount:I

    .line 55
    iput v0, p0, Lcom/daaw/avee/Common/StatusMsg;->criticalErrorCount:I

    const-string v0, ""

    .line 56
    iput-object v0, p0, Lcom/daaw/avee/Common/StatusMsg;->fullMessage:Ljava/lang/String;

    .line 58
    iget-object v0, p0, Lcom/daaw/avee/Common/StatusMsg;->countedMessages:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    .line 59
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const/4 v0, 0x0

    .line 60
    iput-object v0, p0, Lcom/daaw/avee/Common/StatusMsg;->countedMessages:Ljava/util/HashMap;

    :cond_0
    return-void
.end method
