.class public final Lcom/daaw/tv6;
.super Lcom/daaw/qw6;
.source ""


# instance fields
.field public a:Landroid/os/IBinder;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:F

.field public e:I

.field public f:Ljava/lang/String;

.field public g:B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/qw6;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/daaw/qw6;
    .locals 0

    iput-object p1, p0, Lcom/daaw/tv6;->f:Ljava/lang/String;

    return-object p0
.end method

.method public final b(Ljava/lang/String;)Lcom/daaw/qw6;
    .locals 0

    iput-object p1, p0, Lcom/daaw/tv6;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final c(I)Lcom/daaw/qw6;
    .locals 0

    iget-byte p1, p0, Lcom/daaw/tv6;->g:B

    or-int/lit8 p1, p1, 0x8

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/daaw/tv6;->g:B

    return-object p0
.end method

.method public final d(I)Lcom/daaw/qw6;
    .locals 0

    iput p1, p0, Lcom/daaw/tv6;->c:I

    iget-byte p1, p0, Lcom/daaw/tv6;->g:B

    or-int/lit8 p1, p1, 0x2

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/daaw/tv6;->g:B

    return-object p0
.end method

.method public final e(F)Lcom/daaw/qw6;
    .locals 0

    iput p1, p0, Lcom/daaw/tv6;->d:F

    iget-byte p1, p0, Lcom/daaw/tv6;->g:B

    or-int/lit8 p1, p1, 0x4

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/daaw/tv6;->g:B

    return-object p0
.end method

.method public final f(Z)Lcom/daaw/qw6;
    .locals 0

    iget-byte p1, p0, Lcom/daaw/tv6;->g:B

    or-int/lit8 p1, p1, 0x1

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/daaw/tv6;->g:B

    return-object p0
.end method

.method public final g(Landroid/os/IBinder;)Lcom/daaw/qw6;
    .locals 1

    const-string v0, "Null windowToken"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/tv6;->a:Landroid/os/IBinder;

    return-object p0
.end method

.method public final h(I)Lcom/daaw/qw6;
    .locals 0

    iput p1, p0, Lcom/daaw/tv6;->e:I

    iget-byte p1, p0, Lcom/daaw/tv6;->g:B

    or-int/lit8 p1, p1, 0x10

    int-to-byte p1, p1

    iput-byte p1, p0, Lcom/daaw/tv6;->g:B

    return-object p0
.end method

.method public final i()Lcom/daaw/rw6;
    .locals 13

    iget-byte v0, p0, Lcom/daaw/tv6;->g:B

    const/16 v1, 0x1f

    if-ne v0, v1, :cond_1

    iget-object v3, p0, Lcom/daaw/tv6;->a:Landroid/os/IBinder;

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/vv6;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/daaw/tv6;->b:Ljava/lang/String;

    iget v6, p0, Lcom/daaw/tv6;->c:I

    iget v7, p0, Lcom/daaw/tv6;->d:F

    const/4 v8, 0x0

    const/4 v9, 0x0

    iget v10, p0, Lcom/daaw/tv6;->e:I

    iget-object v11, p0, Lcom/daaw/tv6;->f:Ljava/lang/String;

    const/4 v12, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v12}, Lcom/daaw/vv6;-><init>(Landroid/os/IBinder;ZLjava/lang/String;IFILjava/lang/String;ILjava/lang/String;Lcom/daaw/uv6;)V

    return-object v0

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/daaw/tv6;->a:Landroid/os/IBinder;

    if-nez v1, :cond_2

    const-string v1, " windowToken"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-byte v1, p0, Lcom/daaw/tv6;->g:B

    and-int/lit8 v1, v1, 0x1

    if-nez v1, :cond_3

    const-string v1, " stableSessionToken"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-byte v1, p0, Lcom/daaw/tv6;->g:B

    and-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_4

    const-string v1, " layoutGravity"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-byte v1, p0, Lcom/daaw/tv6;->g:B

    and-int/lit8 v1, v1, 0x4

    if-nez v1, :cond_5

    const-string v1, " layoutVerticalMargin"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    iget-byte v1, p0, Lcom/daaw/tv6;->g:B

    and-int/lit8 v1, v1, 0x8

    if-nez v1, :cond_6

    const-string v1, " displayMode"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    iget-byte v1, p0, Lcom/daaw/tv6;->g:B

    and-int/lit8 v1, v1, 0x10

    if-nez v1, :cond_7

    const-string v1, " windowWidthPx"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Missing required properties:"

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
