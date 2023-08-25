.class public Lcom/daaw/zt;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ut$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/zt$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Lcom/daaw/zt$a;


# direct methods
.method public constructor <init>(Lcom/daaw/zt$a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/daaw/zt;->a:I

    iput-object p1, p0, Lcom/daaw/zt;->b:Lcom/daaw/zt$a;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/ut;
    .locals 3

    iget-object v0, p0, Lcom/daaw/zt;->b:Lcom/daaw/zt$a;

    invoke-interface {v0}, Lcom/daaw/zt$a;->a()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    return-object v1

    :cond_2
    iget v1, p0, Lcom/daaw/zt;->a:I

    invoke-static {v0, v1}, Lcom/daaw/au;->d(Ljava/io/File;I)Lcom/daaw/ut;

    move-result-object v0

    return-object v0
.end method
