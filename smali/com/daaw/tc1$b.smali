.class public Lcom/daaw/tc1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ir1$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/tc1;->g(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/s40;I)Lcom/daaw/ir1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ir1$c<",
        "TJ;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:Lcom/daaw/s40;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;JLcom/daaw/s40;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/tc1$b;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/tc1$b;->b:Ljava/lang/String;

    iput-wide p3, p0, Lcom/daaw/tc1$b;->c:J

    iput-object p5, p0, Lcom/daaw/tc1$b;->d:Lcom/daaw/s40;

    iput-object p6, p0, Lcom/daaw/tc1$b;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/ir1;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ir1<",
            "TJ;>;)TJ;"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Ljava/io/File;

    iget-object v3, p0, Lcom/daaw/tc1$b;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/tc1$b;->b:Ljava/lang/String;

    invoke-direct {v1, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/daaw/tc1$b;->c:J

    add-long/2addr v3, v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-lez v7, :cond_0

    iget-object v3, p0, Lcom/daaw/tc1$b;->d:Lcom/daaw/s40;

    invoke-interface {v3, v1, v0}, Lcom/daaw/s40;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    aget-object v2, v0, v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string p1, "returning cached file"

    invoke-static {p1}, Lcom/daaw/lz1;->a(Ljava/lang/String;)V

    return-object v1

    :cond_0
    iget-object v1, p0, Lcom/daaw/tc1$b;->e:Ljava/lang/String;

    new-instance v2, Lcom/daaw/tc1$b$a;

    invoke-direct {v2, p0}, Lcom/daaw/tc1$b$a;-><init>(Lcom/daaw/tc1$b;)V

    new-instance v3, Lcom/daaw/tc1$b$b;

    invoke-direct {v3, p0, p1}, Lcom/daaw/tc1$b$b;-><init>(Lcom/daaw/tc1$b;Lcom/daaw/ir1;)V

    const/4 p1, 0x0

    invoke-static {v1, v2, v3, p1}, Lcom/daaw/ku;->a(Ljava/lang/String;Lcom/daaw/ku$a;Lcom/daaw/w40;Lcom/daaw/e0;)Ljava/lang/String;

    new-instance p1, Ljava/io/File;

    iget-object v1, p0, Lcom/daaw/tc1$b;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/tc1$b;->b:Ljava/lang/String;

    invoke-direct {p1, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/tc1$b;->d:Lcom/daaw/s40;

    invoke-interface {v1, p1, v0}, Lcom/daaw/s40;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
