.class public final Lcom/daaw/he7;
.super Lcom/daaw/l97;
.source ""


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/daaw/zn7;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/daaw/zn7;Lcom/daaw/ge7;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/l97;-><init>()V

    iput-object p1, p0, Lcom/daaw/he7;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/he7;->b:Lcom/daaw/zn7;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/he7;->a:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/daaw/he7;->b:Lcom/daaw/zn7;

    sget-object v3, Lcom/daaw/mm7;->q:Lcom/daaw/mm7;

    sget-object v3, Lcom/daaw/zn7;->q:Lcom/daaw/zn7;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_3

    if-eq v2, v0, :cond_2

    const/4 v0, 0x3

    if-eq v2, v0, :cond_1

    const/4 v0, 0x4

    if-eq v2, v0, :cond_0

    const-string v0, "UNKNOWN"

    goto :goto_0

    :cond_0
    const-string v0, "CRUNCHY"

    goto :goto_0

    :cond_1
    const-string v0, "RAW"

    goto :goto_0

    :cond_2
    const-string v0, "LEGACY"

    goto :goto_0

    :cond_3
    const-string v0, "TINK"

    :goto_0
    aput-object v0, v1, v3

    const-string v0, "(typeUrl=%s, outputPrefixType=%s)"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
