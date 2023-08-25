.class public Lcom/daaw/k40;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ki1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/k40$a;
    }
.end annotation


# instance fields
.field public final p:Landroid/content/Context;

.field public final q:Ljava/lang/String;

.field public final r:Lcom/daaw/ki1$a;

.field public final s:Z

.field public final t:Ljava/lang/Object;

.field public u:Lcom/daaw/k40$a;

.field public v:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/ki1$a;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/k40;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/k40;->q:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/k40;->r:Lcom/daaw/ki1$a;

    iput-boolean p4, p0, Lcom/daaw/k40;->s:Z

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/k40;->t:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public A()Lcom/daaw/ji1;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/k40;->d()Lcom/daaw/k40$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/k40$a;->q()Lcom/daaw/ji1;

    move-result-object v0

    return-object v0
.end method

.method public close()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/k40;->d()Lcom/daaw/k40$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/k40$a;->close()V

    return-void
.end method

.method public final d()Lcom/daaw/k40$a;
    .locals 6

    iget-object v0, p0, Lcom/daaw/k40;->t:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/k40;->u:Lcom/daaw/k40$a;

    if-nez v1, :cond_1

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/daaw/j40;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v2, v3, :cond_0

    iget-object v2, p0, Lcom/daaw/k40;->q:Ljava/lang/String;

    if-eqz v2, :cond_0

    iget-boolean v2, p0, Lcom/daaw/k40;->s:Z

    if-eqz v2, :cond_0

    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/daaw/k40;->p:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/k40;->q:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v3, Lcom/daaw/k40$a;

    iget-object v4, p0, Lcom/daaw/k40;->p:Landroid/content/Context;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    iget-object v5, p0, Lcom/daaw/k40;->r:Lcom/daaw/ki1$a;

    invoke-direct {v3, v4, v2, v1, v5}, Lcom/daaw/k40$a;-><init>(Landroid/content/Context;Ljava/lang/String;[Lcom/daaw/j40;Lcom/daaw/ki1$a;)V

    iput-object v3, p0, Lcom/daaw/k40;->u:Lcom/daaw/k40$a;

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/daaw/k40$a;

    iget-object v3, p0, Lcom/daaw/k40;->p:Landroid/content/Context;

    iget-object v4, p0, Lcom/daaw/k40;->q:Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/k40;->r:Lcom/daaw/ki1$a;

    invoke-direct {v2, v3, v4, v1, v5}, Lcom/daaw/k40$a;-><init>(Landroid/content/Context;Ljava/lang/String;[Lcom/daaw/j40;Lcom/daaw/ki1$a;)V

    iput-object v2, p0, Lcom/daaw/k40;->u:Lcom/daaw/k40$a;

    :goto_0
    iget-object v1, p0, Lcom/daaw/k40;->u:Lcom/daaw/k40$a;

    iget-boolean v2, p0, Lcom/daaw/k40;->v:Z

    invoke-virtual {v1, v2}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    :cond_1
    iget-object v1, p0, Lcom/daaw/k40;->u:Lcom/daaw/k40$a;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/k40;->q:Ljava/lang/String;

    return-object v0
.end method

.method public setWriteAheadLoggingEnabled(Z)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/k40;->t:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/k40;->u:Lcom/daaw/k40$a;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    :cond_0
    iput-boolean p1, p0, Lcom/daaw/k40;->v:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
