.class public Lcom/daaw/xs7;
.super Ljava/io/IOException;
.source ""


# instance fields
.field public p:Lcom/daaw/xt7;

.field public q:Z


# direct methods
.method public constructor <init>(Ljava/io/IOException;)V
    .locals 1

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/xs7;->p:Lcom/daaw/xt7;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/xs7;->p:Lcom/daaw/xt7;

    return-void
.end method

.method public static a()Lcom/daaw/ws7;
    .locals 2

    new-instance v0, Lcom/daaw/ws7;

    const-string v1, "Protocol message tag had invalid wire type."

    invoke-direct {v0, v1}, Lcom/daaw/ws7;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static b()Lcom/daaw/xs7;
    .locals 2

    new-instance v0, Lcom/daaw/xs7;

    const-string v1, "Protocol message end-group tag did not match expected tag."

    invoke-direct {v0, v1}, Lcom/daaw/xs7;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static c()Lcom/daaw/xs7;
    .locals 2

    new-instance v0, Lcom/daaw/xs7;

    const-string v1, "Protocol message contained an invalid tag (zero)."

    invoke-direct {v0, v1}, Lcom/daaw/xs7;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static d()Lcom/daaw/xs7;
    .locals 2

    new-instance v0, Lcom/daaw/xs7;

    const-string v1, "Protocol message had invalid UTF-8."

    invoke-direct {v0, v1}, Lcom/daaw/xs7;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static e()Lcom/daaw/xs7;
    .locals 2

    new-instance v0, Lcom/daaw/xs7;

    const-string v1, "CodedInputStream encountered a malformed varint."

    invoke-direct {v0, v1}, Lcom/daaw/xs7;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static f()Lcom/daaw/xs7;
    .locals 2

    new-instance v0, Lcom/daaw/xs7;

    const-string v1, "CodedInputStream encountered an embedded string or message which claimed to have negative size."

    invoke-direct {v0, v1}, Lcom/daaw/xs7;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static g()Lcom/daaw/xs7;
    .locals 2

    new-instance v0, Lcom/daaw/xs7;

    const-string v1, "Failed to parse the message."

    invoke-direct {v0, v1}, Lcom/daaw/xs7;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static i()Lcom/daaw/xs7;
    .locals 2

    new-instance v0, Lcom/daaw/xs7;

    const-string v1, "Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit."

    invoke-direct {v0, v1}, Lcom/daaw/xs7;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static j()Lcom/daaw/xs7;
    .locals 2

    new-instance v0, Lcom/daaw/xs7;

    const-string v1, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."

    invoke-direct {v0, v1}, Lcom/daaw/xs7;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final h(Lcom/daaw/xt7;)Lcom/daaw/xs7;
    .locals 0

    iput-object p1, p0, Lcom/daaw/xs7;->p:Lcom/daaw/xt7;

    return-object p0
.end method

.method public final k()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/xs7;->q:Z

    return-void
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/xs7;->q:Z

    return v0
.end method
