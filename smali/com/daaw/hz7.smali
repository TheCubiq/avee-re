.class public Lcom/daaw/hz7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;
.implements Ljava/io/Closeable;
.implements Lcom/daaw/jh2;


# static fields
.field public static final v:Lcom/daaw/ih2;

.field public static final w:Lcom/daaw/oz7;


# instance fields
.field public p:Lcom/daaw/fh2;

.field public q:Lcom/daaw/iz7;

.field public r:Lcom/daaw/ih2;

.field public s:J

.field public t:J

.field public final u:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/dz7;

    const-string v1, "eof "

    invoke-direct {v0, v1}, Lcom/daaw/dz7;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/hz7;->v:Lcom/daaw/ih2;

    const-class v0, Lcom/daaw/hz7;

    invoke-static {v0}, Lcom/daaw/oz7;->b(Ljava/lang/Class;)Lcom/daaw/oz7;

    move-result-object v0

    sput-object v0, Lcom/daaw/hz7;->w:Lcom/daaw/oz7;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/hz7;->r:Lcom/daaw/ih2;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/hz7;->s:J

    iput-wide v0, p0, Lcom/daaw/hz7;->t:J

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/hz7;->u:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    return-void
.end method

.method public final hasNext()Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/hz7;->r:Lcom/daaw/ih2;

    sget-object v1, Lcom/daaw/hz7;->v:Lcom/daaw/ih2;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    return v2

    :cond_0
    const/4 v1, 0x1

    if-eqz v0, :cond_1

    return v1

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/hz7;->q()Lcom/daaw/ih2;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/hz7;->r:Lcom/daaw/ih2;
    :try_end_0
    .catch Ljava/util/NoSuchElementException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    sget-object v0, Lcom/daaw/hz7;->v:Lcom/daaw/ih2;

    iput-object v0, p0, Lcom/daaw/hz7;->r:Lcom/daaw/ih2;

    return v2
.end method

.method public final bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/hz7;->q()Lcom/daaw/ih2;

    move-result-object v0

    return-object v0
.end method

.method public final q()Lcom/daaw/ih2;
    .locals 6

    iget-object v0, p0, Lcom/daaw/hz7;->r:Lcom/daaw/ih2;

    if-eqz v0, :cond_1

    sget-object v1, Lcom/daaw/hz7;->v:Lcom/daaw/ih2;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/hz7;->r:Lcom/daaw/ih2;

    return-object v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/daaw/hz7;->q:Lcom/daaw/iz7;

    if-eqz v0, :cond_2

    iget-wide v1, p0, Lcom/daaw/hz7;->s:J

    iget-wide v3, p0, Lcom/daaw/hz7;->t:J

    cmp-long v5, v1, v3

    if-gez v5, :cond_2

    :try_start_0
    monitor-enter v0
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v1, p0, Lcom/daaw/hz7;->q:Lcom/daaw/iz7;

    iget-wide v2, p0, Lcom/daaw/hz7;->s:J

    invoke-interface {v1, v2, v3}, Lcom/daaw/iz7;->b(J)V

    iget-object v1, p0, Lcom/daaw/hz7;->p:Lcom/daaw/fh2;

    iget-object v2, p0, Lcom/daaw/hz7;->q:Lcom/daaw/iz7;

    invoke-interface {v1, v2, p0}, Lcom/daaw/fh2;->a(Lcom/daaw/iz7;Lcom/daaw/jh2;)Lcom/daaw/ih2;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/hz7;->q:Lcom/daaw/iz7;

    invoke-interface {v2}, Lcom/daaw/iz7;->zzb()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/daaw/hz7;->s:J

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v1
    :try_end_2
    .catch Ljava/io/EOFException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :catch_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_2
    sget-object v0, Lcom/daaw/hz7;->v:Lcom/daaw/ih2;

    iput-object v0, p0, Lcom/daaw/hz7;->r:Lcom/daaw/ih2;

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/hz7;->u:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    if-lez v1, :cond_0

    const-string v2, ";"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v2, p0, Lcom/daaw/hz7;->u:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/ih2;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lcom/daaw/hz7;->q:Lcom/daaw/iz7;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/hz7;->r:Lcom/daaw/ih2;

    sget-object v1, Lcom/daaw/hz7;->v:Lcom/daaw/ih2;

    if-eq v0, v1, :cond_0

    new-instance v0, Lcom/daaw/nz7;

    iget-object v1, p0, Lcom/daaw/hz7;->u:Ljava/util/List;

    invoke-direct {v0, v1, p0}, Lcom/daaw/nz7;-><init>(Ljava/util/List;Ljava/util/Iterator;)V

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/hz7;->u:Ljava/util/List;

    return-object v0
.end method

.method public final w(Lcom/daaw/iz7;JLcom/daaw/fh2;)V
    .locals 2

    iput-object p1, p0, Lcom/daaw/hz7;->q:Lcom/daaw/iz7;

    invoke-interface {p1}, Lcom/daaw/iz7;->zzb()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/hz7;->s:J

    invoke-interface {p1}, Lcom/daaw/iz7;->zzb()J

    move-result-wide v0

    add-long/2addr v0, p2

    invoke-interface {p1, v0, v1}, Lcom/daaw/iz7;->b(J)V

    invoke-interface {p1}, Lcom/daaw/iz7;->zzb()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/daaw/hz7;->t:J

    iput-object p4, p0, Lcom/daaw/hz7;->p:Lcom/daaw/fh2;

    return-void
.end method
